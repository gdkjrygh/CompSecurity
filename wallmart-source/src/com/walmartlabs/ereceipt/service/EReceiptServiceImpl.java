// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.GetJsonRunnable;
import com.walmart.android.service.GetServiceDataRunnable;
import com.walmart.android.service.HTTPService;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.MockComponentResolver;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceDataValidator;
import com.walmart.android.service.ServiceException;
import com.walmart.android.utils.Base64;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptService, EReceiptsContractUtil, EReceiptsResponse, WalletRegisterStatus, 
//            WalletStatus

public class EReceiptServiceImpl
    implements EReceiptService
{
    private static class EReceiptServiceValidator
        implements ServiceDataValidator
    {

        int mErrorCode;

        public int getErrorCode()
        {
            return mErrorCode;
        }

        public boolean validate(ServiceData servicedata)
        {
            if (servicedata.hasHttpError())
            {
                mErrorCode = servicedata.getHttpStatusCode();
                return false;
            } else
            {
                return true;
            }
        }

        private EReceiptServiceValidator()
        {
        }

    }

    private static class ReceiptId
    {

        public int customerReceiptId;

        public ReceiptId(int i)
        {
            customerReceiptId = i;
        }
    }


    private static final boolean DEBUG = false;
    private static final SimpleDateFormat GET_BY_TC_FORMAT;
    private static final int IMAGE_CACHE_EXPIRY_TIME = 0x493e0;
    private static final String TAG = com/walmartlabs/ereceipt/service/EReceiptServiceImpl.getSimpleName();
    private String mBaseUrlSecure;
    private final ExecutorService mExecutor;
    private final HTTPService mHTTPService;
    private final HttpRequestExecutor mHttpRequestExecutor;
    private final JsonMapper mJsonMapper = new JsonMapper();
    private byte mKey[];

    public EReceiptServiceImpl(Context context, ExecutorService executorservice, HttpRequestExecutor httprequestexecutor, String s)
    {
        mExecutor = executorservice;
        mBaseUrlSecure = s;
        mHttpRequestExecutor = httprequestexecutor;
        mHTTPService = new HTTPService(s, s, context);
        context = new MockComponentResolver() {

            private final Pattern mPattern;
            final EReceiptServiceImpl this$0;

            public String getMethodFromUri(String s1)
            {
                s1 = mPattern.matcher(s1);
                if (s1.matches() && s1.groupCount() > 1)
                {
                    return s1.group(2).replaceAll(Uri.encode("/"), "-").replaceAll("/", "-");
                } else
                {
                    return null;
                }
            }

            public String getServiceFromUri(String s1)
            {
                s1 = mPattern.matcher(s1);
                if (s1.matches() && s1.groupCount() > 0)
                {
                    return s1.group(1).replaceAll(Uri.encode("/"), "-").replaceAll("/", "-");
                } else
                {
                    return null;
                }
            }

            
            {
                this$0 = EReceiptServiceImpl.this;
                super();
                mPattern = Pattern.compile((new StringBuilder()).append("^").append(mBaseUrlSecure).append("/api").append("/(.*?)/([^\\?]*).*$").toString());
            }
        };
        mHttpRequestExecutor.addMockComponentResolver(context);
    }

    private String buildJsonFromObject(Object obj)
    {
        try
        {
            obj = mJsonMapper.writeValueAsString(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return "[]";
        }
        return ((String) (obj));
    }

    private String createEToken(String s)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (mKey != null)
        {
            obj = obj1;
            if (mKey.length > 0)
            {
                obj = obj1;
                if (!TextUtils.isEmpty(s))
                {
                    try
                    {
                        obj = Cipher.getInstance("AES/CBC/PKCS7Padding");
                        ((Cipher) (obj)).init(1, new SecretKeySpec(mKey, "AES"), new IvParameterSpec(new byte[16]));
                        obj = Base64.encodeToString(((Cipher) (obj)).doFinal(s.getBytes()), 2);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        s.printStackTrace();
                        return null;
                    }
                }
            }
        }
        return ((String) (obj));
    }

    private GetServiceDataRunnable createGenericGetJsonRunnable(Class class1, HttpUriRequest httpurirequest, AsyncCallback asynccallback)
    {
        class1 = new GetJsonRunnable(mHttpRequestExecutor, httpurirequest, asynccallback, class1, mJsonMapper);
        class1.setServiceDataValidator(new EReceiptServiceValidator());
        return class1;
    }

    public void deleteReceipts(String s, int ai[], String s1, AsyncCallback asynccallback)
    {
        ReceiptId areceiptid[] = new ReceiptId[ai.length];
        for (int i = 0; i < areceiptid.length; i++)
        {
            areceiptid[i] = new ReceiptId(ai[i]);
        }

        ai = new HashMap();
        ai.put("customerID", s);
        ai.put("receipts", buildJsonFromObject(areceiptid));
        ai.put("phone-uuid", s1);
        s = mHTTPService.createSecureHttpPostRequest("/api", "/receipts/delete", ai);
        mExecutor.execute(new GetServiceDataRunnable(mHttpRequestExecutor, s, asynccallback) {

            final EReceiptServiceImpl this$0;

            public Boolean onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                int j = servicedata.getHttpStatusCode();
                if (j == 200)
                {
                    return Boolean.valueOf(true);
                } else
                {
                    setErrorCode(j);
                    return Boolean.valueOf(false);
                }
            }

            public volatile Object onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                return onServiceDataReceived(servicedata);
            }

            
            {
                this$0 = EReceiptServiceImpl.this;
                super(httprequestexecutor, httpurirequest, asynccallback);
            }
        });
    }

    public void getImage(String s, AsyncCallback asynccallback)
    {
        mHTTPService.getImage(s, 0x493e0L, asynccallback);
    }

    public void getReceipt(String s, String s1, String s2, AsyncCallback asynccallback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("phone-uuid", s2);
        if (!TextUtils.isEmpty(s))
        {
            hashmap.put("customerID", s);
        }
        s = mHTTPService.createSecureHttpGetRequest("/api", (new StringBuilder()).append("/receipt/").append(s1).toString(), hashmap);
        mExecutor.execute(createGenericGetJsonRunnable(com/walmartlabs/ereceipt/service/EReceiptsResponse$Receipt, s, asynccallback));
    }

    public void getReceiptByTc(String s, String s1, String s2, String s3, AsyncCallback asynccallback)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("phone-uuid", s3);
        if (!TextUtils.isEmpty(s))
        {
            hashmap.put("customerID", s);
        }
        s = null;
        s3 = GET_BY_TC_FORMAT.format(EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(s2));
        s = s3;
_L2:
        s = mHTTPService.createSecureHttpGetRequest("/api/business/wm", String.format("/transaction/%1$s/date/%2$s", new Object[] {
            s1, s
        }), hashmap);
        mExecutor.execute(createGenericGetJsonRunnable(com/walmartlabs/ereceipt/service/EReceiptsResponse$Receipt, s, asynccallback));
        return;
        s3;
        WLog.e(TAG, (new StringBuilder()).append("Could not parse local date ").append(s2).toString(), s3);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void getReceiptImage(String s, AsyncCallback asynccallback)
    {
        s = getReceiptImageUrl(s);
        mHTTPService.getImage(s, 0x493e0L, asynccallback);
    }

    public String getReceiptImageUrl(String s)
    {
        return (new StringBuilder()).append(mBaseUrlSecure).append("/receipt/image/").append(s).append(".png").toString();
    }

    public void setKey(String s)
    {
        mKey = Base64.decode(s, 0);
    }

    public void syncReceipts(String s, List list, String s1, boolean flag, int i, AsyncCallback asynccallback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("customerID", s);
        hashmap.put("customer-receipt-ids", list.toString());
        hashmap.put("phone-uuid", s1);
        if (flag)
        {
            hashmap.put("exclude_images", "true");
        }
        if (i > 0)
        {
            hashmap.put("limit", String.valueOf(i));
        }
        s = mHTTPService.createSecureHttpPostRequest("/api", "/receipts/sync", hashmap);
        mExecutor.execute(createGenericGetJsonRunnable(com/walmartlabs/ereceipt/service/EReceiptsResponse, s, asynccallback));
    }

    public void updatePhoneConfiguration(String s, String s1, String s2, String s3, AsyncCallback asynccallback)
    {
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s2))
        {
            hashmap.put("registration-id", s2);
        }
        hashmap.put("phone-uuid", s1);
        s1 = createEToken(s3);
        if (s1 != null)
        {
            hashmap.put("etoken", s1);
        }
        s = mHTTPService.createSecureHttpPutRequest("/api", (new StringBuilder()).append("/customer/").append(s).append("/config").toString(), hashmap);
        mExecutor.execute(new GetServiceDataRunnable(mHttpRequestExecutor, s, asynccallback) {

            final EReceiptServiceImpl this$0;

            public Boolean onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                int i = servicedata.getHttpStatusCode();
                if (i == 200)
                {
                    return Boolean.valueOf(true);
                } else
                {
                    setErrorCode(i);
                    return Boolean.valueOf(false);
                }
            }

            public volatile Object onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                return onServiceDataReceived(servicedata);
            }

            
            {
                this$0 = EReceiptServiceImpl.this;
                super(httprequestexecutor, httpurirequest, asynccallback);
            }
        });
    }

    public void walletRegister(String s, String s1, String s2, AsyncCallback asynccallback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("customerID", s);
        hashmap.put("phone-uuid", s1);
        hashmap.put("phone-number", s2);
        s = mHTTPService.createSecureHttpPostRequest("/api", "/wallet/register", hashmap);
        mExecutor.execute(new GetServiceDataRunnable(mHttpRequestExecutor, s, asynccallback) {

            final EReceiptServiceImpl this$0;

            public Boolean onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                int i = servicedata.getHttpStatusCode();
                if (i == 200)
                {
                    return Boolean.valueOf(true);
                } else
                {
                    setErrorCode(i);
                    return Boolean.valueOf(false);
                }
            }

            public volatile Object onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                return onServiceDataReceived(servicedata);
            }

            
            {
                this$0 = EReceiptServiceImpl.this;
                super(httprequestexecutor, httpurirequest, asynccallback);
            }
        });
    }

    public void walletRegisterVerify(String s, String s1, String s2, String s3, AsyncCallback asynccallback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("customerID", s);
        hashmap.put("phone-uuid", s1);
        hashmap.put("phone-number", s2);
        hashmap.put("verify-code", s3);
        s = mHTTPService.createSecureHttpPostRequest("/api", "/wallet/register/verify", hashmap);
        mExecutor.execute(new GetServiceDataRunnable(mHttpRequestExecutor, s, asynccallback) {

            final EReceiptServiceImpl this$0;

            public WalletStatus onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                int i = servicedata.getHttpStatusCode();
                if (i == 200)
                {
                    return new WalletStatus();
                } else
                {
                    setErrorCode(i);
                    return (WalletStatus)mJsonMapper.readValue(servicedata.getContent(), com/walmartlabs/ereceipt/service/WalletStatus);
                }
            }

            public volatile Object onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                return onServiceDataReceived(servicedata);
            }

            
            {
                this$0 = EReceiptServiceImpl.this;
                super(httprequestexecutor, httpurirequest, asynccallback);
            }
        });
    }

    public void walletRegisteredStatus(String s, String s1, AsyncCallback asynccallback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("customerID", s);
        hashmap.put("phone-uuid", s1);
        s = mHTTPService.createSecureHttpGetRequest("/api", "/wallet/register/status", hashmap);
        mExecutor.execute(createGenericGetJsonRunnable(com/walmartlabs/ereceipt/service/WalletRegisterStatus, s, asynccallback));
    }

    public void writeImageStream(String s, OutputStream outputstream, AsyncCallback asynccallback)
    {
        s = getReceiptImageUrl(s);
        mHTTPService.downloadImageToStream(s, 0x493e0L, outputstream, asynccallback);
    }

    static 
    {
        GET_BY_TC_FORMAT = new SimpleDateFormat("yyyyMMdd", Locale.US);
    }


}
