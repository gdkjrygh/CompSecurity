// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.internal;

import android.net.Uri;
import com.braintreepayments.api.exceptions.AuthenticationException;
import com.braintreepayments.api.exceptions.AuthorizationException;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.BraintreeSslException;
import com.braintreepayments.api.exceptions.DownForMaintenanceException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.exceptions.ServerException;
import com.braintreepayments.api.exceptions.UnexpectedException;
import com.braintreepayments.api.exceptions.UpgradeRequiredException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.internal:
//            BraintreeGatewayCertificate, HttpResponse

public class HttpRequest
{

    private static final String AUTHORIZATION_FINGERPRINT_KEY = "authorizationFingerprint";
    public static boolean DEBUG = false;
    private static final String METHOD_GET = "GET";
    private static final String METHOD_POST = "POST";
    public static final String TAG = "HttpRequest";
    private static final String UTF_8 = "UTF-8";
    private String mAuthorizationFingerprint;
    private String mBaseUrl;
    private int mConnectTimeout;

    public HttpRequest(String s)
    {
        mConnectTimeout = 0;
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        mAuthorizationFingerprint = s1;
    }

    private static SSLSocketFactory getSslSocketFactory()
        throws BraintreeSslException
    {
        Object obj;
        try
        {
            obj = KeyStore.getInstance(KeyStore.getDefaultType());
            ((KeyStore) (obj)).load(null, null);
            Iterator iterator = CertificateFactory.getInstance("X.509").generateCertificates(BraintreeGatewayCertificate.getCertInputStream()).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Certificate certificate = (Certificate)iterator.next();
                if (certificate instanceof X509Certificate)
                {
                    ((KeyStore) (obj)).setCertificateEntry(((X509Certificate)certificate).getSubjectDN().getName(), certificate);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new BraintreeSslException(((Exception) (obj)));
        }
        TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustmanagerfactory.init(((KeyStore) (obj)));
        obj = SSLContext.getInstance("TLS");
        ((SSLContext) (obj)).init(null, trustmanagerfactory.getTrustManagers(), null);
        obj = ((SSLContext) (obj)).getSocketFactory();
        return ((SSLSocketFactory) (obj));
    }

    public static String getUserAgent()
    {
        return "braintree/android/1.6.5-paypal-browser-switch-3-SNAPSHOT";
    }

    private void log(String s)
    {
        if (!DEBUG);
    }

    private HttpResponse parseResponse(HttpURLConnection httpurlconnection)
        throws ErrorWithResponse, IOException
    {
        int i = httpurlconnection.getResponseCode();
        log((new StringBuilder()).append("Received response code: ").append(i).toString());
        switch (i)
        {
        default:
            throw new UnexpectedException();

        case 200: 
        case 201: 
        case 202: 
            httpurlconnection = readStream(httpurlconnection.getInputStream());
            log((new StringBuilder()).append("Received response body: ").append(httpurlconnection).toString());
            return new HttpResponse(i, httpurlconnection);

        case 401: 
            throw new AuthenticationException();

        case 403: 
            throw new AuthorizationException();

        case 422: 
            httpurlconnection = readStream(httpurlconnection.getErrorStream());
            log((new StringBuilder()).append("Received error response body: ").append(httpurlconnection).toString());
            throw new ErrorWithResponse(i, httpurlconnection);

        case 426: 
            throw new UpgradeRequiredException();

        case 500: 
            throw new ServerException();

        case 503: 
            throw new DownForMaintenanceException();
        }
    }

    private String readStream(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                return new String(bytearrayoutputstream.toByteArray(), "UTF-8");
            }
        } while (true);
    }

    public HttpResponse get(String s)
        throws ErrorWithResponse, BraintreeException
    {
        Object obj;
        Object obj1;
        String s1;
        HttpResponse httpresponse;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        httpresponse = null;
        obj1 = httpresponse;
        obj = obj2;
        s1 = obj3;
        if (!s.startsWith("http")) goto _L2; else goto _L1
_L1:
        obj1 = httpresponse;
        obj = obj2;
        s1 = obj3;
        s = Uri.parse(s);
_L4:
        obj1 = httpresponse;
        obj = obj2;
        s1 = obj3;
        s = init(s.buildUpon().appendQueryParameter("authorizationFingerprint", mAuthorizationFingerprint).build().toString());
        obj1 = s;
        obj = s;
        s1 = s;
        s.setRequestMethod("GET");
        obj1 = s;
        obj = s;
        s1 = s;
        httpresponse = parseResponse(s);
        if (s != null)
        {
            s.disconnect();
        }
        return httpresponse;
_L2:
        obj1 = httpresponse;
        obj = obj2;
        s1 = obj3;
        s = Uri.parse((new StringBuilder()).append(mBaseUrl).append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
        s;
        obj = obj1;
        throw s;
        s;
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw s;
        s;
        obj = s1;
        throw new UnexpectedException(s.getMessage());
    }

    protected HttpURLConnection init(String s)
        throws IOException
    {
        log((new StringBuilder()).append("Opening url: ").append(s).toString());
        s = (HttpURLConnection)(new URL(s)).openConnection();
        if (s instanceof HttpsURLConnection)
        {
            ((HttpsURLConnection)s).setSSLSocketFactory(getSslSocketFactory());
        }
        s.setRequestProperty("Content-Type", "application/json");
        s.setRequestProperty("User-Agent", getUserAgent());
        s.setRequestProperty("Accept-Language", Locale.getDefault().getLanguage());
        s.setConnectTimeout(mConnectTimeout);
        return s;
    }

    public HttpResponse post(String s, String s1)
        throws ErrorWithResponse, BraintreeException
    {
        Object obj;
        Object obj1;
        String s2;
        String s3;
        DataOutputStream dataoutputstream;
        Object obj2;
        Object obj3;
        Object obj4;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        dataoutputstream = null;
        obj1 = dataoutputstream;
        obj = obj2;
        s2 = obj3;
        s3 = obj4;
        s1 = (new JSONObject(s1)).put("authorizationFingerprint", mAuthorizationFingerprint).toString();
        obj1 = dataoutputstream;
        obj = obj2;
        s2 = obj3;
        s3 = obj4;
        if (!s.startsWith("http")) goto _L2; else goto _L1
_L1:
        obj1 = dataoutputstream;
        obj = obj2;
        s2 = obj3;
        s3 = obj4;
        s = init(s);
_L4:
        obj1 = s;
        obj = s;
        s2 = s;
        s3 = s;
        s.setRequestMethod("POST");
        obj1 = s;
        obj = s;
        s2 = s;
        s3 = s;
        s.setDoOutput(true);
        obj1 = s;
        obj = s;
        s2 = s;
        s3 = s;
        dataoutputstream = new DataOutputStream(s.getOutputStream());
        obj1 = s;
        obj = s;
        s2 = s;
        s3 = s;
        dataoutputstream.writeBytes(s1);
        obj1 = s;
        obj = s;
        s2 = s;
        s3 = s;
        dataoutputstream.flush();
        obj1 = s;
        obj = s;
        s2 = s;
        s3 = s;
        dataoutputstream.close();
        obj1 = s;
        obj = s;
        s2 = s;
        s3 = s;
        s1 = parseResponse(s);
        if (s != null)
        {
            s.disconnect();
        }
        return s1;
_L2:
        obj1 = dataoutputstream;
        obj = obj2;
        s2 = obj3;
        s3 = obj4;
        s = init((new StringBuilder()).append(mBaseUrl).append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
        s;
        obj = obj1;
        throw s;
        s;
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw s;
        s;
        obj = s2;
        throw new UnexpectedException(s.getMessage());
        s;
        obj = s3;
        throw new UnexpectedException(s.getMessage());
    }

    public void setBaseUrl(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        mBaseUrl = s1;
    }

    protected void setConnectTimeout(int i)
    {
        mConnectTimeout = i;
    }

    static 
    {
        DEBUG = false;
    }
}
