// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.aws.services;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.weather.dal2.aws.auth.AwsAuthConstants;
import com.weather.dal2.aws.auth.AwsCredentials;
import com.weather.dal2.aws.auth.Signature;
import com.weather.util.date.TwcDateFormatter;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.weather.dal2.aws.services:
//            AmazonQueue, AmazonS3

public abstract class AmazonServices
{

    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final String AUTHORIZATION_HEADER_VALUE = "%s Credential=%s, SignedHeaders=%s, Signature=%s";
    private static final int CONNECT_TIMEOUT = 15000;
    private static final ExecutorService EXECUTOR_SERVICE = Executors.newCachedThreadPool();
    private static final String HOST_HEADER = "Host";
    private static final int READ_TIMEOUT = 15000;
    private static final String TAG = "AmazonServices";
    private static final String URL = "https://%s/%s";
    private static final String X_AMZ_DATE_HEADER = "X-Amz-Date";
    private static boolean isTesting;
    private static String lastBody;
    private static final SimpleTimeZone timeZone = new SimpleTimeZone(0, "PST");
    private final com.weather.dal2.aws.auth.AwsCredentials.Credentials awsCredentials;
    private final com.weather.dal2.config.DalConfig.AwsConfig awsServiceConfig;
    private final Map headers = new HashMap();
    private String payload;

    protected AmazonServices(com.weather.dal2.config.DalConfig.AwsConfig awsconfig)
    {
        awsServiceConfig = awsconfig;
        awsCredentials = AwsCredentials.INSTANCE.get(awsconfig.getEndpoint(), awsconfig.getUser());
    }

    private String getAuthorizationHeader()
        throws NoSuchAlgorithmException, InvalidKeyException
    {
        return String.format("%s Credential=%s, SignedHeaders=%s, Signature=%s", new Object[] {
            AwsAuthConstants.SQS_SIGNING_ALGORITHM.value(), getCredentialScope(true), getSignedHeaders(), getSignature()
        });
    }

    private String getCanonicalHeaders()
    {
        Iterator iterator = getSortedHeaders();
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (!s.equalsIgnoreCase("Authorization"))
            {
                stringbuilder.append(s.toLowerCase(Locale.getDefault()).trim());
                stringbuilder.append(':');
                String s1 = (String)headers.get(s);
                if (s.equalsIgnoreCase("X-Amz-Date"))
                {
                    stringbuilder.append(s1.trim());
                } else
                {
                    stringbuilder.append(s1.toLowerCase(Locale.getDefault()).trim());
                }
                stringbuilder.append('\n');
            }
        } while (true);
        return stringbuilder.toString();
    }

    private String getCredentialScope(boolean flag)
    {
        String s1 = (new StringBuilder()).append(getDate()).append('/').append(awsServiceConfig.getRegion()).append('/').append(awsServiceConfig.getService()).append('/').append(AwsAuthConstants.TERMINATION_STRING.value()).toString();
        String s = s1;
        if (flag)
        {
            s = (new StringBuilder()).append(awsCredentials.getAccess()).append('/').append(s1).toString();
        }
        return s;
    }

    private String getDate()
    {
        String s = getDateTime();
        return s.substring(0, s.indexOf('T'));
    }

    private String getDateTime()
    {
        return (String)headers.get("X-Amz-Date");
    }

    private String getHashedCanonicalRequest()
        throws NoSuchAlgorithmException
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(awsServiceConfig.getMethod()).append('\n');
        stringbuilder.append('/').append(getAbsolutePath()).append('\n');
        stringbuilder.append('\n');
        stringbuilder.append(getCanonicalHeaders()).append('\n');
        stringbuilder.append(getSignedHeaders()).append('\n');
        stringbuilder.append(hashAndEncode(payload));
        return hashAndEncode(stringbuilder.toString());
    }

    public static String getLastBody()
    {
        return lastBody;
    }

    private String getSignature()
        throws NoSuchAlgorithmException, InvalidKeyException
    {
        return toHex(Signature.getSignatureKey(awsCredentials.getSecret(), getDate(), awsServiceConfig.getRegion(), awsServiceConfig.getService(), getStringToSign()));
    }

    private String getSignedHeaders()
    {
        Iterator iterator = getSortedHeaders();
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (!s.equalsIgnoreCase("Authorization"))
            {
                stringbuilder.append(s.toLowerCase(Locale.getDefault()));
                if (iterator.hasNext())
                {
                    stringbuilder.append(';');
                }
            }
        } while (true);
        return stringbuilder.toString();
    }

    private Iterator getSortedHeaders()
    {
        ArrayList arraylist = new ArrayList(headers.keySet());
        Collections.sort(arraylist);
        return arraylist.iterator();
    }

    private String getStringToSign()
        throws NoSuchAlgorithmException
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(AwsAuthConstants.SQS_SIGNING_ALGORITHM.value()).append('\n');
        stringbuilder.append(getDateTime()).append('\n');
        stringbuilder.append(getCredentialScope(false)).append('\n');
        stringbuilder.append(getHashedCanonicalRequest());
        return stringbuilder.toString();
    }

    private byte[] hash256(String s)
        throws NoSuchAlgorithmException
    {
        MessageDigest messagedigest = MessageDigest.getInstance(AwsAuthConstants.SHA_256.value());
        messagedigest.update(s.getBytes(Charsets.UTF_8));
        return messagedigest.digest();
    }

    private void initCommonHeadersAndSign()
        throws InvalidKeyException, NoSuchAlgorithmException
    {
        headers.put("Host", awsServiceConfig.getEndpoint());
        headers.put("X-Amz-Date", TwcDateFormatter.formatISO8601(new Date(), timeZone));
        headers.put("Authorization", getAuthorizationHeader());
    }

    private void initializeRequest(String s)
        throws InvalidKeyException, NoSuchAlgorithmException
    {
        Preconditions.checkNotNull(s, "Aws Payload must not be null");
        Preconditions.checkNotNull(awsCredentials, "Aws Payload must not be null");
        signRequest(s);
    }

    public static AmazonServices newQueue(com.weather.dal2.config.DalConfig.AwsConfig awsconfig)
    {
        return new AmazonQueue(awsconfig);
    }

    public static AmazonServices newS3Bucket(com.weather.dal2.config.DalConfig.AwsConfig awsconfig)
    {
        return new AmazonS3(awsconfig);
    }

    public static void setTestingMode(boolean flag)
    {
        isTesting = flag;
    }

    private void signRequest(String s)
        throws NoSuchAlgorithmException, InvalidKeyException
    {
        if (awsServiceConfig.hasNullData())
        {
            return;
        } else
        {
            payload = s;
            initHeaders();
            initCommonHeadersAndSign();
            return;
        }
    }

    private String toHex(byte abyte0[])
    {
        return BaseEncoding.base16().lowerCase().encode(abyte0);
    }

    protected String getAbsolutePath()
    {
        return awsServiceConfig.getPath();
    }

    protected String getHeader(String s)
    {
        return (String)headers.get(s);
    }

    protected String getURL()
    {
        return String.format("https://%s/%s", new Object[] {
            awsServiceConfig.getEndpoint(), awsServiceConfig.getPath()
        });
    }

    protected String hashAndEncode(String s)
        throws NoSuchAlgorithmException
    {
        return toHex(hash256(s));
    }

    protected abstract void initHeaders();

    protected void post(String s)
    {
        if (isTesting)
        {
            lastBody = s;
            return;
        }
        initializeRequest(s);
        EXECUTOR_SERVICE.execute(new _cls1(s));
        return;
        s;
_L2:
        LogUtil.method("AmazonServices", LoggingMetaTags.TWC_DSX_LOG, "Error Signing Request: %s", new Object[] {
            s.getMessage()
        });
        return;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void put(String s)
    {
        if (isTesting)
        {
            lastBody = s;
            return;
        }
        initializeRequest(s);
        EXECUTOR_SERVICE.execute(new _cls2(s));
        return;
        s;
_L2:
        LogUtil.method("AmazonServices", LoggingMetaTags.TWC_DSX_LOG, "Error Signing Request to S3: %s", new Object[] {
            s.getMessage()
        });
        return;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public abstract void send(String s);

    protected void setHeader(String s, String s1)
    {
        headers.put(s, s1);
    }



    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
