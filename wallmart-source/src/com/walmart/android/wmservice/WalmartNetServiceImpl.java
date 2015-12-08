// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.walmart.android.config.WalmartNetServiceSettings;
import com.walmart.android.data.AppConfig;
import com.walmart.android.data.AssociateLogin;
import com.walmart.android.data.CreateAccountResult;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.data.FastPickupUserStatus;
import com.walmart.android.data.LocalAd;
import com.walmart.android.data.LoginResult;
import com.walmart.android.data.ManualShelfResult;
import com.walmart.android.data.SlapResponse;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.data.StoreItem;
import com.walmart.android.data.TosSection;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.CacheManager;
import com.walmart.android.service.GetJsonRunnable;
import com.walmart.android.service.GetServiceDataRunnable;
import com.walmart.android.service.HTTPService;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.MockComponentResolver;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceDataValidator;
import com.walmart.android.service.ServiceException;
import com.walmart.android.util.SlapUpc;
import com.walmart.android.utils.HttpUtils;
import com.walmart.android.utils.StringHasher;
import com.walmart.android.utils.UrlUtils;
import com.walmartlabs.utils.WLog;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializationProblemHandler;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.type.TypeReference;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetService, MaintenanceException, Util, WalmartServiceException

public class WalmartNetServiceImpl
    implements WalmartNetService
{
    private static class CreateAccountRequest
    {

        public int cartHandling;
        public String email;
        public String firstName;
        public String lastName;
        public boolean newsletterFlag;
        public String password;

        public CreateAccountRequest(String s, String s1, String s2, String s3, boolean flag, int i)
        {
            firstName = s;
            lastName = s1;
            email = s2;
            password = s3;
            newsletterFlag = flag;
            cartHandling = i;
        }
    }

    private static class GetCookiesRequest
    {

        public String token;

        public GetCookiesRequest(String s)
        {
            token = s;
        }
    }

    private class GetLoginResultRunnable extends GetJsonRunnable
    {

        final WalmartNetServiceImpl this$0;

        public LoginResult onServiceDataReceived(ServiceData servicedata)
            throws ServiceException, IOException
        {
            servicedata = (LoginResult)super.onServiceDataReceived(servicedata);
            if (servicedata != null)
            {
                servicedata.setFirstName(getLoggedInUsersFirstNames());
                servicedata.setLastName(getLoggedInUsersLastNames());
                servicedata.setCustomerId(Util.getCustomerId(getCookies()));
                servicedata.setCid(Util.getCID(getCookies()));
            }
            return servicedata;
        }

        public volatile Object onServiceDataReceived(ServiceData servicedata)
            throws ServiceException, IOException
        {
            return onServiceDataReceived(servicedata);
        }

        private GetLoginResultRunnable(HttpUriRequest httpurirequest, Class class1, AsyncCallback asynccallback)
        {
            this$0 = WalmartNetServiceImpl.this;
            super(mHttpRequestExecutor, httpurirequest, asynccallback, class1, mJsonMapper);
            setServiceDataValidator(mJsonServiceErrorHandler);
        }

    }

    private static class GetTokenRequest
    {

        public int cartHandling;
        public String email;
        public String password;

        public GetTokenRequest(String s, String s1, int i)
        {
            email = s;
            password = s1;
            cartHandling = i;
        }
    }

    private class SimpleRequestRunnable
        implements Runnable
    {

        private final AsyncCallback callback;
        private final HttpUriRequest request;
        final WalmartNetServiceImpl this$0;

        public void run()
        {
            String s = execute(request);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            if (s.trim().equals(""))
            {
                callback.onSuccess(Integer.valueOf(200));
                return;
            }
            try
            {
                callback.onFailure(Integer.valueOf(0x15f92), null);
                return;
            }
            catch (MaintenanceException maintenanceexception)
            {
                callback.onFailure(Integer.valueOf(0x15f93), null);
            }
            return;
        }

        public SimpleRequestRunnable(HttpUriRequest httpurirequest, AsyncCallback asynccallback)
        {
            this$0 = WalmartNetServiceImpl.this;
            super();
            request = httpurirequest;
            callback = asynccallback;
        }
    }

    private class StringRequestRunnable
        implements Runnable
    {

        private final AsyncCallback callback;
        private final HttpUriRequest request;
        final WalmartNetServiceImpl this$0;

        public void run()
        {
            String s = execute(request);
            if (s != null)
            {
                try
                {
                    callback.onSuccess(s);
                    return;
                }
                catch (MaintenanceException maintenanceexception)
                {
                    callback.onFailure(Integer.valueOf(0x15f93), null);
                }
                break MISSING_BLOCK_LABEL_59;
            }
            callback.onFailure(Integer.valueOf(0x15f92), null);
            return;
        }

        public StringRequestRunnable(HttpUriRequest httpurirequest, AsyncCallback asynccallback)
        {
            this$0 = WalmartNetServiceImpl.this;
            super();
            request = httpurirequest;
            callback = asynccallback;
        }
    }

    private class WalmartJSONServiceErrorHandler
        implements ServiceDataValidator
    {

        private int mErrorCode;
        final WalmartNetServiceImpl this$0;

        public int getErrorCode()
        {
            return mErrorCode;
        }

        public boolean validate(ServiceData servicedata)
        {
            com.walmart.android.service.ServiceData.ContentType contenttype = null;
            String s = null;
            if (servicedata != null)
            {
                contenttype = servicedata.getContentType();
                s = servicedata.getContent();
            }
            if (contenttype == null || s == null)
            {
                mErrorCode = 0x15f91;
                return false;
            }
            if (contenttype == com.walmart.android.service.ServiceData.ContentType.HTML && s.contains("<div id=\"maint\">\n<img src=\"images/walmart_logo2.gif\" alt=\"Wal-Mart&reg;\" border=\"0\" style=\"\">\n<h1>Walmart Mobile Scheduled Maintenance</h1>\n<p>Walmart Mobile is temporarily unavailable while we make important upgrades to our site. We appreciate your patience and invite you to return soon.</p>\n<p>If you need immediate assistance, please email us at <a href=\"mailto:help@walmart.com\">help@walmart.com</a>.</p>\n</div>"))
            {
                mErrorCode = 4;
                mContext.sendBroadcast(new Intent("com.walmart.android.MAINTENANCE"));
                return false;
            } else
            {
                return true;
            }
        }

        private WalmartJSONServiceErrorHandler()
        {
            this$0 = WalmartNetServiceImpl.this;
            super();
            mErrorCode = -1;
        }

    }


    private static final String APPLICATION_JSON = "application/json";
    private static final int FIRST_NAME_INDEX = 1;
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final int LAST_NAME_INDEX = 2;
    private static final String MAINTENANCE_MESSAGE = "<div id=\"maint\">\n<img src=\"images/walmart_logo2.gif\" alt=\"Wal-Mart&reg;\" border=\"0\" style=\"\">\n<h1>Walmart Mobile Scheduled Maintenance</h1>\n<p>Walmart Mobile is temporarily unavailable while we make important upgrades to our site. We appreciate your patience and invite you to return soon.</p>\n<p>If you need immediate assistance, please email us at <a href=\"mailto:help@walmart.com\">help@walmart.com</a>.</p>\n</div>";
    private static final String TAG = com/walmart/android/wmservice/WalmartNetServiceImpl.getSimpleName();
    private com.walmart.android.service.HttpRequestExecutor.CacheFilePrefixGenerator mCacheFilePrefixGenerator;
    private CacheManager mCacheManager;
    private Context mContext;
    private ExecutorService mExecutor;
    private HTTPService mHTTPService;
    private HttpRequestExecutor mHttpRequestExecutor;
    private JsonMapper mJsonMapper;
    private ServiceDataValidator mJsonServiceErrorHandler;
    private final DeserializationProblemHandler mJsonServiceExceptionHandler = new DeserializationProblemHandler() {

        final WalmartNetServiceImpl this$0;

        public boolean handleUnknownProperty(DeserializationContext deserializationcontext, JsonDeserializer jsondeserializer, Object obj, String s)
            throws IOException, JsonProcessingException
        {
            if (s.equals("__exception__"))
            {
                throw WalmartServiceException.createFromJson(deserializationcontext.getParser().readValueAsTree());
            } else
            {
                return false;
            }
        }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                super();
            }
    };
    private WalmartNetServiceSettings mSettings;

    public WalmartNetServiceImpl(Context context, ExecutorService executorservice, HttpRequestExecutor httprequestexecutor, WalmartNetServiceSettings walmartnetservicesettings)
    {
        mContext = context;
        mSettings = walmartnetservicesettings;
        mJsonMapper = new JsonMapper();
        mJsonMapper.addDeserializationProblemHandler(mJsonServiceExceptionHandler);
        mExecutor = executorservice;
        mJsonServiceErrorHandler = new WalmartJSONServiceErrorHandler();
        mHttpRequestExecutor = httprequestexecutor;
        mHTTPService = new HTTPService(mSettings.getBaseUrl(), mSettings.getSecureBaseUrl(), mContext);
        setupMockResolvers();
        initCaching();
    }

    private void addJsonBody(HttpEntityEnclosingRequest httpentityenclosingrequest, String s)
    {
        try
        {
            httpentityenclosingrequest.setEntity(new StringEntity(s));
            httpentityenclosingrequest.addHeader("Content-Type", "application/json");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntityEnclosingRequest httpentityenclosingrequest)
        {
            WLog.e(TAG, "Unsupported encoding", httpentityenclosingrequest);
        }
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

    private GetServiceDataRunnable createGenericGetJsonRunnable(Class class1, HttpUriRequest httpurirequest, AsyncCallback asynccallback)
    {
        class1 = new GetJsonRunnable(mHttpRequestExecutor, httpurirequest, asynccallback, class1, mJsonMapper);
        class1.setServiceDataValidator(mJsonServiceErrorHandler);
        return class1;
    }

    private String execute(HttpUriRequest httpurirequest)
        throws MaintenanceException
    {
        httpurirequest = mHttpRequestExecutor.execute(httpurirequest, false, 0L);
        if (!mJsonServiceErrorHandler.validate(httpurirequest))
        {
            throw new MaintenanceException();
        }
        if (httpurirequest != null)
        {
            return httpurirequest.getContent();
        } else
        {
            return null;
        }
    }

    private String getFastPickupUrl(String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            return (new StringBuilder()).append(mSettings.getFastPickupBaseUrl()).append(s).append("?storeNumber=").append(s1).toString();
        } else
        {
            return (new StringBuilder()).append(mSettings.getFastPickupBaseUrl()).append(s).toString();
        }
    }

    private Map getItemAvailabilityMap(SlapResponse aslapresponse[])
    {
        HashMap hashmap = new HashMap();
        if (aslapresponse != null)
        {
            int j = aslapresponse.length;
            for (int i = 0; i < j; i++)
            {
                SlapResponse slapresponse = aslapresponse[i];
                Object obj = slapresponse.item;
                com.walmart.android.data.SlapResponse.Store astore[] = slapresponse.stores;
                if (obj == null || astore == null || astore.length <= 0)
                {
                    continue;
                }
                obj = new StoreAvailabilityData(astore[0], ((com.walmart.android.data.SlapResponse.Item) (obj)));
                if (!TextUtils.isEmpty(((StoreAvailabilityData) (obj)).wwwItemId))
                {
                    WLog.d(TAG, (new StringBuilder()).append("Caching availability for item ").append(((StoreAvailabilityData) (obj)).wwwItemId).append(": ").append(((StoreAvailabilityData) (obj)).price).append(" / ").append(((StoreAvailabilityData) (obj)).stockStatus).append(" (UPC = ").append(((StoreAvailabilityData) (obj)).upc).append(")").toString());
                    hashmap.put(((StoreAvailabilityData) (obj)).wwwItemId, obj);
                }
            }

        }
        return hashmap;
    }

    private String getLoggedInUsersFirstNames()
    {
        return getLoggedInUsersName(1);
    }

    private String getLoggedInUsersLastNames()
    {
        return getLoggedInUsersName(2);
    }

    private String getLoggedInUsersName(int i)
    {
        Iterator iterator = getCookies().iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Cookie)iterator.next();
        if (!"com.wm.customer".equals(((Cookie) (obj)).getName()))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((Cookie) (obj)).getValue();
        String as[] = Uri.decode(((String) (obj))).split("~~");
        if (as == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (as.length <= i)
        {
            continue; /* Loop/switch isn't completed */
        }
        as = as[i].replaceAll("[+]", " ");
        return as;
        Exception exception;
        exception;
        exception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public static String getMethodFromUrl(String s)
    {
        int i;
        int j;
label0:
        {
            String s1 = null;
            i = s.indexOf("&method=");
            if (i != -1)
            {
                i += "&method=".length();
                j = s.indexOf("&", i);
                if (j != -1)
                {
                    break label0;
                }
                s1 = s.substring(i);
            }
            return s1;
        }
        return s.substring(i, j);
    }

    public static String getServiceFromUrl(String s)
    {
        int i;
        int j;
label0:
        {
            String s1 = null;
            i = s.indexOf("service=");
            if (i != -1)
            {
                i += "service=".length();
                j = s.indexOf("&", i);
                if (j != -1)
                {
                    break label0;
                }
                s1 = s.substring(i);
            }
            return s1;
        }
        return s.substring(i, j);
    }

    private void getSlapItem(String s, String s1, String as[], AsyncCallback asynccallback)
    {
        String as1[] = null;
        if (s != null)
        {
            String as2[] = new String[1];
            as2[0] = s;
            s = as2;
        } else
        {
            s = null;
        }
        if (s1 != null)
        {
            as1 = new String[1];
            as1[0] = s1;
        }
        getSlapItem(((String []) (s)), as1, as, asynccallback);
    }

    private void getSlapItem(String as[], String as1[], String as2[], AsyncCallback asynccallback)
    {
        String s;
        String s1;
        if (as != null)
        {
            as = buildJsonFromObject(as);
        } else
        {
            as = "";
        }
        s1 = "";
        s = s1;
        if (as1 != null)
        {
            s = s1;
            if (as1.length > 0)
            {
                ArrayList arraylist = new ArrayList();
                int j = as1.length;
                for (int i = 0; i < j; i++)
                {
                    s = as1[i];
                    if (!TextUtils.isEmpty(s))
                    {
                        arraylist.add((new SlapUpc(s)).getUpc());
                    }
                }

                s = s1;
                if (!arraylist.isEmpty())
                {
                    s = buildJsonFromObject(((Object) (arraylist.toArray(new String[arraylist.size()]))));
                }
            }
        }
        as1 = buildJsonFromObject(as2);
        as = createGenericGetJsonRunnable([Lcom/walmart/android/data/SlapResponse;, mHTTPService.createSecureRequest("service=Slap", "&method=get&version=3", new String[] {
            as, s, as1, "", "", "", "", "", "c4tch4spyder"
        }), asynccallback);
        as.setServiceDataValidator(new com.walmart.android.data.SlapResponse.SlapResponseValidator(mJsonServiceErrorHandler));
        mExecutor.execute(as);
    }

    private void getStoreAvailability(String s, String s1, String as[], AsyncCallback asynccallback)
    {
        getSlapItem(s, s1, as, new AsyncCallbackOnThread(asynccallback) {

            final WalmartNetServiceImpl this$0;
            final AsyncCallback val$asyncCallback;

            public void onFailureSameThread(Integer integer, SlapResponse aslapresponse[])
            {
                asyncCallback.onFailure(integer, null);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (SlapResponse[])obj1);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((SlapResponse[])obj);
            }

            public void onSuccessSameThread(SlapResponse aslapresponse[])
            {
                StoreAvailabilityData astoreavailabilitydata[] = new StoreAvailabilityData[0];
                Object aobj[] = astoreavailabilitydata;
                if (aslapresponse != null)
                {
                    aobj = astoreavailabilitydata;
                    if (aslapresponse.length > 0)
                    {
                        SlapResponse slapresponse = aslapresponse[0];
                        com.walmart.android.data.SlapResponse.Store astore[] = slapresponse.stores;
                        aobj = astoreavailabilitydata;
                        if (astore != null)
                        {
                            aslapresponse = new StoreAvailabilityData[astore.length];
                            int i = 0;
                            do
                            {
                                aobj = aslapresponse;
                                if (i >= astore.length)
                                {
                                    break;
                                }
                                aslapresponse[i] = new StoreAvailabilityData(astore[i], slapresponse.item);
                                i++;
                            } while (true);
                        }
                    }
                }
                asyncCallback.onSuccess(((Object) (aobj)));
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                asyncCallback = asynccallback;
                super(final_handler);
            }
        });
    }

    private void initCaching()
    {
        mCacheFilePrefixGenerator = new com.walmart.android.service.HttpRequestExecutor.CacheFilePrefixGenerator() {

            private final StringHasher mHasher = new StringHasher("SHA-256");
            final WalmartNetServiceImpl this$0;

            public String getCacheFileNamePrefix(HttpUriRequest httpurirequest)
            {
                return mHasher.createHashedString(UrlUtils.getRequestString(httpurirequest));
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                super();
            }
        };
        mCacheManager = new CacheManager(mContext.getCacheDir());
        mHttpRequestExecutor.setCacheManager(mCacheManager, mCacheFilePrefixGenerator);
    }

    private void removeEmptyCategoriesFromAd(LocalAd localad)
    {
        com.walmart.android.data.LocalAd.Category acategory[] = localad.getCategories();
        ArrayList arraylist = new ArrayList(acategory.length);
        int j = acategory.length;
        for (int i = 0; i < j; i++)
        {
            com.walmart.android.data.LocalAd.Category category = acategory[i];
            if (category.getTotalCount() > 0)
            {
                arraylist.add(category);
            }
        }

        if (arraylist.size() < acategory.length)
        {
            com.walmart.android.data.LocalAd.Category acategory1[] = new com.walmart.android.data.LocalAd.Category[arraylist.size()];
            arraylist.toArray(acategory1);
            localad.setCategories(acategory1);
        }
    }

    private void setupMockResolvers()
    {
        mHttpRequestExecutor.addMockComponentResolver(new MockComponentResolver() {

            final WalmartNetServiceImpl this$0;

            public String getMethodFromUri(String s)
            {
                return WalmartNetServiceImpl.getMethodFromUrl(s);
            }

            public String getServiceFromUri(String s)
            {
                return WalmartNetServiceImpl.getServiceFromUrl(s);
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                super();
            }
        });
        mHttpRequestExecutor.addMockComponentResolver(new MockComponentResolver() {

            final WalmartNetServiceImpl this$0;

            public String getMethodFromUri(String s)
            {
                if (s.contains("mobile.walmart.com/android/config"))
                {
                    return "config";
                } else
                {
                    return null;
                }
            }

            public String getServiceFromUri(String s)
            {
                if (s.contains("mobile.walmart.com/android/config"))
                {
                    return "app";
                } else
                {
                    return null;
                }
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                super();
            }
        });
        mHttpRequestExecutor.addMockComponentResolver(new MockComponentResolver() {

            private final Pattern mPattern;
            final WalmartNetServiceImpl this$0;

            public String getMethodFromUri(String s)
            {
                Matcher matcher = mPattern.matcher(s);
                Object obj = null;
                s = obj;
                if (matcher.matches())
                {
                    s = obj;
                    if (matcher.groupCount() > 0)
                    {
                        for (int i = 0; i <= matcher.groupCount(); i++)
                        {
                            WLog.d(WalmartNetServiceImpl.TAG, (new StringBuilder()).append("getMethodFromUri group(").append(i).append(")=").append(matcher.group(i)).toString());
                        }

                        if (matcher.group(1).equals("orders"))
                        {
                            s = matcher.group(1);
                        } else
                        {
                            s = obj;
                            if (matcher.group(1).equals("user/status"))
                            {
                                return "user";
                            }
                        }
                    }
                }
                return s;
            }

            public String getServiceFromUri(String s)
            {
                Matcher matcher = mPattern.matcher(s);
                Object obj = null;
                s = obj;
                if (matcher.matches())
                {
                    s = obj;
                    if (matcher.groupCount() > 0)
                    {
                        s = "FastPickup";
                    }
                }
                return s;
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                super();
                mPattern = Pattern.compile((new StringBuilder()).append("^").append(mSettings.getFastPickupBaseUrl()).append("/(.*?)$").toString());
            }
        });
    }

    public void addCookies(List list, boolean flag)
    {
        CookieStore cookiestore = ((AbstractHttpClient)mHttpRequestExecutor.getHttpClient()).getCookieStore();
        if (cookiestore == null) goto _L2; else goto _L1
_L1:
        cookiestore;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        cookiestore.clear();
        for (list = list.iterator(); list.hasNext(); cookiestore.addCookie((Cookie)list.next())) { }
        break MISSING_BLOCK_LABEL_69;
        list;
        cookiestore;
        JVM INSTR monitorexit ;
        throw list;
        cookiestore;
        JVM INSTR monitorexit ;
_L2:
    }

    public void applyAssociateDiscount(String s, String s1, AsyncCallback asynccallback)
    {
        s = mHTTPService.createSecureRequest("service=Checkout", "&method=applyAssociateDiscount", new String[] {
            s, s1
        });
        mExecutor.execute(createGenericGetJsonRunnable([Lcom/walmart/android/data/StatusMessage;, s, asynccallback));
    }

    public void clearCache(final AsyncCallback callback)
    {
        callback = new Runnable() {

            final WalmartNetServiceImpl this$0;
            final AsyncCallback val$callback;

            public void run()
            {
                System.currentTimeMillis();
                File afile[] = mContext.getCacheDir().listFiles();
                if (afile != null)
                {
                    int j = afile.length;
                    for (int i = 0; i < j; i++)
                    {
                        afile[i].delete();
                    }

                    System.currentTimeMillis();
                }
                callback.onSuccess(Integer.valueOf(0));
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                callback = asynccallback;
                super();
            }
        };
        mExecutor.execute(callback);
    }

    public void createAccount(String s, String s1, String s2, String s3, boolean flag, int i, AsyncCallback asynccallback)
    {
        HttpPost httppost = new HttpPost(mSettings.getSecureHapiBaseUrl().appendPath("mauth").appendPath("v2").appendPath("createAccount").toString());
        addJsonBody(httppost, buildJsonFromObject(new CreateAccountRequest(s, s1, s2, s3, flag, i)));
        mExecutor.execute(new GetLoginResultRunnable(httppost, com/walmart/android/data/CreateAccountResult, asynccallback));
    }

    public void getAssociateLoginRequired(AsyncCallback asynccallback)
    {
        HttpUriRequest httpurirequest = mHTTPService.createSecureRequest("service=Checkout", "&method=isAssociateLoginRequired", new String[0]);
        mExecutor.execute(createGenericGetJsonRunnable(com/walmart/android/data/AssociateLogin, httpurirequest, asynccallback));
    }

    public void getConfig(String s, AsyncCallback asynccallback)
    {
        Object obj = Uri.parse(mSettings.getSecureBaseUrl());
        obj = (new android.net.Uri.Builder()).scheme(((Uri) (obj)).getScheme()).authority(((Uri) (obj)).getAuthority()).appendPath("android").appendPath("config").toString();
        if (s != null)
        {
            CookieStore cookiestore = ((AbstractHttpClient)mHttpRequestExecutor.getHttpClient()).getCookieStore();
            BasicClientCookie basicclientcookie = new BasicClientCookie("_px_vid", s);
            basicclientcookie.setDomain(".walmart.com");
            cookiestore.addCookie(basicclientcookie);
            s = new BasicClientCookie("_px_sid", s);
            s.setDomain(".walmart.com");
            cookiestore.addCookie(s);
        }
        mExecutor.execute(createGenericGetJsonRunnable(com/walmart/android/data/AppConfig, new HttpGet(((String) (obj))), asynccallback));
    }

    public List getCookies()
    {
        CookieStore cookiestore;
        cookiestore = ((AbstractHttpClient)mHttpRequestExecutor.getHttpClient()).getCookieStore();
        if (cookiestore == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        cookiestore;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList(cookiestore.getCookies());
        cookiestore;
        JVM INSTR monitorexit ;
        return Collections.unmodifiableList(arraylist);
        Exception exception;
        exception;
        cookiestore;
        JVM INSTR monitorexit ;
        throw exception;
        return Collections.emptyList();
    }

    public void getCss(final AsyncCallback asyncCallback)
    {
        final String url = mSettings.getBaseUrl().replace("/m/j", "/r/stylesheets/item_android.css");
        mExecutor.execute(new Runnable() {

            final WalmartNetServiceImpl this$0;
            final AsyncCallback val$asyncCallback;
            final String val$url;

            public void run()
            {
                String s = execute(new HttpGet(url));
                if (!TextUtils.isEmpty(s))
                {
                    asyncCallback.onSuccess(s);
                    return;
                }
                try
                {
                    asyncCallback.onFailure(Integer.valueOf(0x15f93), null);
                    return;
                }
                catch (MaintenanceException maintenanceexception)
                {
                    asyncCallback.onFailure(Integer.valueOf(0x15f93), null);
                }
                return;
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                url = s;
                asyncCallback = asynccallback;
                super();
            }
        });
    }

    public void getFastPickupOrders(AsyncCallback asynccallback)
    {
        String s = getFastPickupUrl("/orders", null);
        WLog.d(TAG, (new StringBuilder()).append("getFastPickupOrders(): ").append(s).toString());
        if (s == null)
        {
            asynccallback.onFailure(Integer.valueOf(0x15f92), null);
            return;
        } else
        {
            asynccallback = createGenericGetJsonRunnable(com/walmart/android/data/FastPickupOrder, new HttpGet(s), asynccallback);
            asynccallback.enableCachingHeader();
            mExecutor.execute(asynccallback);
            return;
        }
    }

    public void getFastPickupUserStatus(String s, AsyncCallback asynccallback)
    {
        s = getFastPickupUrl("/user/status", s);
        WLog.d(TAG, (new StringBuilder()).append("getFastPickupUserStatus() url=").append(s).toString());
        if (s == null)
        {
            asynccallback.onFailure(Integer.valueOf(0x15f92), null);
            return;
        } else
        {
            s = createGenericGetJsonRunnable(com/walmart/android/data/FastPickupUserStatus, new HttpGet(s), asynccallback);
            s.enableCachingHeader();
            mExecutor.execute(s);
            return;
        }
    }

    public void getImage(String s, long l, AsyncCallback asynccallback)
    {
        mHTTPService.getImage(s, l, asynccallback);
    }

    public void getImage(String s, AsyncCallback asynccallback)
    {
        mHTTPService.getImage(s, 0x493e0L, asynccallback);
    }

    public HttpClient getImageClient()
    {
        return mHTTPService.getHttpImageClient();
    }

    public void getLocalAd(String s, AsyncCallback asynccallback)
    {
        s = mHTTPService.createRequest("service=LocalAd", "&method=getCatalog", new String[] {
            s
        });
        s = new GetServiceDataRunnable(mHttpRequestExecutor, s, asynccallback) {

            final WalmartNetServiceImpl this$0;

            public LocalAd onServiceDataReceived(ServiceData servicedata)
                throws WalmartServiceException, IOException
            {
                servicedata = (LocalAd)mJsonMapper.readValue(servicedata.getContent(), com/walmart/android/data/LocalAd);
                if (servicedata != null)
                {
                    removeEmptyCategoriesFromAd(servicedata);
                }
                return servicedata;
            }

            public volatile Object onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                return onServiceDataReceived(servicedata);
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                super(httprequestexecutor, httpurirequest, asynccallback);
            }
        };
        s.enableCachingHeader();
        s.setServiceDataValidator(new com.walmart.android.data.LocalAd.LocalAdResponseValidator(mJsonServiceErrorHandler));
        mExecutor.execute(s);
    }

    public void getManualShelf(String s, int i, AsyncCallback asynccallback)
    {
        s = createGenericGetJsonRunnable(com/walmart/android/data/ManualShelfResult, mHTTPService.createRequest("service=ManualShelf", "&method=getShelf", new String[] {
            s, Integer.toString(i)
        }), asynccallback);
        s.enableCachingHeader();
        mExecutor.execute(s);
    }

    public void getManualShelfExtended(String s, int i, AsyncCallback asynccallback)
    {
        s = createGenericGetJsonRunnable(com/walmart/android/data/ManualShelfResult, mHTTPService.createRequest("service=ManualShelf", "&method=getExtendedShelf", new String[] {
            s, Integer.toString(i)
        }), asynccallback);
        s.enableCachingHeader();
        mExecutor.execute(s);
    }

    public void getManualShelves(String as[], AsyncCallback asynccallback)
    {
        as = createGenericGetJsonRunnable([Lcom/walmart/android/data/ManualShelfResult;, mHTTPService.createRequest("service=ManualShelf", "&method=getShelves", new String[] {
            buildJsonFromObject(as)
        }), asynccallback);
        as.enableCachingHeader();
        mExecutor.execute(as);
    }

    public void getOfferingInfoForUpc(String s, String s1, AsyncCallback asynccallback)
    {
        s = buildJsonFromObject(new String[] {
            (new SlapUpc(s)).getUpc()
        });
        s = createGenericGetJsonRunnable([Lcom/walmart/android/data/OfferingInfoResponse;, mHTTPService.createRequest("service=Offering", "&method=getOfferingInfoForUpcs", new String[] {
            s, s1
        }), asynccallback);
        mExecutor.execute(s);
    }

    public void getStoreAvailabilityByItemId(String s, String as[], AsyncCallback asynccallback)
    {
        getStoreAvailability(s, null, as, asynccallback);
    }

    public void getStoreAvailabilityByUpc(String s, String as[], AsyncCallback asynccallback)
    {
        getStoreAvailability(null, s, as, asynccallback);
    }

    public void getStoreAvailabilityForItemIdsAtStore(String as[], String s, AsyncCallback asynccallback)
    {
        asynccallback = new AsyncCallbackOnThread(asynccallback) {

            final WalmartNetServiceImpl this$0;
            final AsyncCallback val$asyncCallback;

            public void onFailureSameThread(Integer integer, SlapResponse aslapresponse[])
            {
                asyncCallback.onFailure(integer, null);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (SlapResponse[])obj1);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((SlapResponse[])obj);
            }

            public void onSuccessSameThread(SlapResponse aslapresponse[])
            {
                asyncCallback.onSuccess(getItemAvailabilityMap(aslapresponse));
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                asyncCallback = asynccallback;
                super(final_handler);
            }
        };
        getSlapItem(as, ((String []) (null)), new String[] {
            s
        }, asynccallback);
    }

    public void getStoreItemDetails(String s, AsyncCallback asynccallback)
    {
        s = createGenericGetJsonRunnable(com/walmart/android/data/StoreItem, mHTTPService.createRequest("service=Item", "&method=get", new String[] {
            s
        }), asynccallback);
        s.enableCachingHeader();
        mExecutor.execute(s);
    }

    public void getStringFromURL(String s, AsyncCallback asynccallback)
    {
        s = new StringRequestRunnable(new HttpGet(s), asynccallback);
        mExecutor.execute(s);
    }

    public void getTermsOfUse(final AsyncCallback asyncCallback)
    {
        mExecutor.execute(new Runnable() {

            final WalmartNetServiceImpl this$0;
            final AsyncCallback val$asyncCallback;

            public void run()
            {
                List list;
                List list1;
                list1 = null;
                list = list1;
                Object obj = mContext.getAssets().open("tos.json");
                list = list1;
                list1 = (List)mJsonMapper.readValue(((java.io.InputStream) (obj)), new TypeReference() {

                    final _cls9 this$1;

            
            {
                this$1 = _cls9.this;
                super();
            }
                });
                obj = list1;
                if (list1 == null)
                {
                    break MISSING_BLOCK_LABEL_115;
                }
                list = list1;
                String s = GooglePlayServicesUtil.getOpenSourceSoftwareLicenseInfo(mContext);
                obj = list1;
                list = list1;
                if (TextUtils.isEmpty(s))
                {
                    break MISSING_BLOCK_LABEL_115;
                }
                list = list1;
                obj = new TosSection();
                list = list1;
                obj.name = "Google Play Services";
                list = list1;
                obj.content = s;
                list = list1;
                list1.add(obj);
                obj = list1;
_L2:
                if (obj != null && !((List) (obj)).isEmpty())
                {
                    asyncCallback.onSuccess(obj);
                    return;
                } else
                {
                    asyncCallback.onFailure(Integer.valueOf(0x15f91), obj);
                    return;
                }
                IOException ioexception;
                ioexception;
                obj = list;
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                asyncCallback = asynccallback;
                super();
            }
        });
    }

    public void guestLogin(AsyncCallback asynccallback)
    {
        HttpUriRequest httpurirequest = mHTTPService.createSecureRequest("service=Authentication", "&method=guestLogin", new String[0]);
        mExecutor.execute(createGenericGetJsonRunnable(com/walmart/android/data/LoginResult, httpurirequest, asynccallback));
    }

    public void logOut(AsyncCallback asynccallback)
    {
        HttpGet httpget = new HttpGet(mSettings.getSecureHapiBaseUrl().appendPath("mauth").appendPath("v2").appendPath("logout").toString());
        asynccallback = new GetServiceDataRunnable(mHttpRequestExecutor, httpget, asynccallback) {

            final WalmartNetServiceImpl this$0;

            public Boolean onServiceDataReceived(ServiceData servicedata)
                throws WalmartServiceException, IOException
            {
                boolean flag;
                if (!((LoginResult)mJsonMapper.readValue(servicedata.getContent(), com/walmart/android/data/LoginResult)).isLoggedIn())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
                servicedata;
                servicedata.printStackTrace();
_L2:
                return Boolean.valueOf(false);
                servicedata;
                servicedata.printStackTrace();
                continue; /* Loop/switch isn't completed */
                servicedata;
                throw servicedata;
                servicedata;
                servicedata.printStackTrace();
                if (true) goto _L2; else goto _L1
_L1:
            }

            public volatile Object onServiceDataReceived(ServiceData servicedata)
                throws ServiceException, IOException
            {
                return onServiceDataReceived(servicedata);
            }

            
            {
                this$0 = WalmartNetServiceImpl.this;
                super(httprequestexecutor, httpurirequest, asynccallback);
            }
        };
        asynccallback.setServiceDataValidator(mJsonServiceErrorHandler);
        mExecutor.execute(asynccallback);
    }

    public void login(String s, String s1, int i, AsyncCallback asynccallback)
    {
        HttpPost httppost = new HttpPost(mSettings.getSecureHapiBaseUrl().appendPath("mauth").appendPath("v2").appendPath("getToken").toString());
        addJsonBody(httppost, buildJsonFromObject(new GetTokenRequest(s, s1, i)));
        mExecutor.execute(new GetLoginResultRunnable(httppost, com/walmart/android/data/LoginResult, asynccallback));
    }

    public void printCookies()
    {
        List list = getCookies();
        if (list.size() == 0)
        {
            WLog.d(TAG, "COOKIE STORE WAS EMPTY!");
        }
        String as[] = new String[list.size()];
        int i = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            Object obj = (Cookie)iterator.next();
            String s1 = ((Cookie) (obj)).getName();
            String s2 = ((Cookie) (obj)).getValue();
            if (((Cookie) (obj)).getExpiryDate() == null)
            {
                obj = "null";
            } else
            {
                obj = ((Cookie) (obj)).getExpiryDate().toString();
            }
            as[i] = (new StringBuilder()).append(s1).append("=").append(s2).append(" exp: ").append(((String) (obj))).toString();
            i++;
        }
        Arrays.sort(as);
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            String s = as[j];
            WLog.d(TAG, s);
        }

    }

    public void setAssoicateDiscountDeclined(AsyncCallback asynccallback)
    {
        HttpUriRequest httpurirequest = mHTTPService.createSecureRequest("service=Checkout", "&method=setAssociateDeclined", new String[0]);
        mExecutor.execute(createGenericGetJsonRunnable([Lcom/walmart/android/data/StatusMessage;, httpurirequest, asynccallback));
    }

    public void setFastPickupUserStatus(String s, String s1, AsyncCallback asynccallback)
    {
        String s2 = getFastPickupUrl("/user/status", null);
        WLog.d(TAG, (new StringBuilder()).append("setFastPickupUserStatus() storeId= ").append(s).append(", uri=").append(s2).toString());
        if (s2 == null)
        {
            asynccallback.onFailure(Integer.valueOf(0x15f92), null);
            return;
        } else
        {
            s = createGenericGetJsonRunnable(com/walmart/android/data/FastPickupUserStatus, HttpUtils.createPostRequest(s2, new String[] {
                "storeNumber", "status"
            }, new String[] {
                s, s1
            }), asynccallback);
            s.enableCachingHeader();
            mExecutor.execute(s);
            return;
        }
    }

    public void validateToken(String s, AsyncCallback asynccallback)
    {
        HttpPost httppost = new HttpPost(mSettings.getSecureHapiBaseUrl().appendPath("mauth").appendPath("v2").appendPath("getCookies").toString());
        addJsonBody(httppost, buildJsonFromObject(new GetCookiesRequest(s)));
        mExecutor.execute(new GetLoginResultRunnable(httppost, com/walmart/android/data/LoginResult, asynccallback));
    }

    public void verifyLogin(AsyncCallback asynccallback)
    {
        HttpGet httpget = new HttpGet(mSettings.getSecureHapiBaseUrl().appendPath("mauth").appendPath("v2").appendPath("verify").toString());
        mExecutor.execute(new GetLoginResultRunnable(httpget, com/walmart/android/data/LoginResult, asynccallback));
    }












}
