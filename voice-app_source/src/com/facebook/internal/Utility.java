// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.internal:
//            ProfileInformationCache, ImageDownloader, Validate, FacebookRequestErrorClassification, 
//            AttributionIdentifiers

public final class Utility
{
    public static class DialogFeatureConfig
    {

        private String dialogName;
        private Uri fallbackUrl;
        private String featureName;
        private int featureVersionSpec[];

        private static DialogFeatureConfig parseDialogConfig(JSONObject jsonobject)
        {
            String s = jsonobject.optString("name");
            String as[];
            if (!Utility.isNullOrEmpty(s))
            {
                if ((as = s.split("\\|")).length == 2)
                {
                    String s1 = as[0];
                    String s2 = as[1];
                    if (!Utility.isNullOrEmpty(s1) && !Utility.isNullOrEmpty(s2))
                    {
                        String s3 = jsonobject.optString("url");
                        Uri uri = null;
                        if (!Utility.isNullOrEmpty(s3))
                        {
                            uri = Uri.parse(s3);
                        }
                        return new DialogFeatureConfig(s1, s2, uri, parseVersionSpec(jsonobject.optJSONArray("versions")));
                    }
                }
            }
            return null;
        }

        private static int[] parseVersionSpec(JSONArray jsonarray)
        {
            int ai[] = null;
            if (jsonarray == null) goto _L2; else goto _L1
_L1:
            int j;
            int l;
            l = jsonarray.length();
            ai = new int[l];
            j = 0;
_L5:
            if (j < l) goto _L3; else goto _L2
_L2:
            return ai;
_L3:
            int k = jsonarray.optInt(j, -1);
            int i = k;
            if (k == -1)
            {
                String s = jsonarray.optString(j);
                i = k;
                if (!Utility.isNullOrEmpty(s))
                {
                    try
                    {
                        i = Integer.parseInt(s);
                    }
                    catch (NumberFormatException numberformatexception)
                    {
                        Utility.logd("FacebookSDK", numberformatexception);
                        i = -1;
                    }
                }
            }
            ai[j] = i;
            j++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public String getDialogName()
        {
            return dialogName;
        }

        public Uri getFallbackUrl()
        {
            return fallbackUrl;
        }

        public String getFeatureName()
        {
            return featureName;
        }

        public int[] getVersionSpec()
        {
            return featureVersionSpec;
        }


        private DialogFeatureConfig(String s, String s1, Uri uri, int ai[])
        {
            dialogName = s;
            featureName = s1;
            fallbackUrl = uri;
            featureVersionSpec = ai;
        }
    }

    public static class FetchedAppSettings
    {

        private Map dialogConfigMap;
        private FacebookRequestErrorClassification errorClassification;
        private String nuxContent;
        private boolean nuxEnabled;
        private boolean supportsImplicitLogging;

        public Map getDialogConfigurations()
        {
            return dialogConfigMap;
        }

        public FacebookRequestErrorClassification getErrorClassification()
        {
            return errorClassification;
        }

        public String getNuxContent()
        {
            return nuxContent;
        }

        public boolean getNuxEnabled()
        {
            return nuxEnabled;
        }

        public boolean supportsImplicitLogging()
        {
            return supportsImplicitLogging;
        }

        private FetchedAppSettings(boolean flag, String s, boolean flag1, Map map1, FacebookRequestErrorClassification facebookrequesterrorclassification)
        {
            supportsImplicitLogging = flag;
            nuxContent = s;
            nuxEnabled = flag1;
            dialogConfigMap = map1;
            errorClassification = facebookrequesterrorclassification;
        }

        FetchedAppSettings(boolean flag, String s, boolean flag1, Map map1, FacebookRequestErrorClassification facebookrequesterrorclassification, FetchedAppSettings fetchedappsettings)
        {
            this(flag, s, flag1, map1, facebookrequesterrorclassification);
        }
    }

    public static interface GraphMeRequestWithCacheCallback
    {

        public abstract void onFailure(FacebookException facebookexception);

        public abstract void onSuccess(JSONObject jsonobject);
    }

    public static interface Mapper
    {

        public abstract Object apply(Object obj);
    }

    public static interface Predicate
    {

        public abstract boolean apply(Object obj);
    }


    private static final String APPLICATION_FIELDS = "fields";
    private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
    private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
    private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";
    private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
    private static final String APP_SETTING_FIELDS[] = {
        "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories"
    };
    private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
    private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
    private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
    private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "\\|";
    private static final String DIALOG_CONFIG_NAME_KEY = "name";
    private static final String DIALOG_CONFIG_URL_KEY = "url";
    private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";
    private static final String EXTRA_APP_EVENTS_INFO_FORMAT_VERSION = "a2";
    private static final int GINGERBREAD_MR1 = 10;
    private static final String HASH_ALGORITHM_MD5 = "MD5";
    private static final String HASH_ALGORITHM_SHA1 = "SHA-1";
    static final String LOG_TAG = "FacebookSDK";
    private static final int REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS = 0x1b7740;
    private static final String URL_SCHEME = "https";
    private static final String UTF8 = "UTF-8";
    private static long availableExternalStorageGB = 0L;
    private static String carrierName = "NoCarrier";
    private static String deviceTimezone = "";
    private static Map fetchedAppSettings = new ConcurrentHashMap();
    private static AtomicBoolean loadingSettings = new AtomicBoolean(false);
    private static final String noCarrierConstant = "NoCarrier";
    private static int numCPUCores = 0;
    private static long timestampOfLastCheck = -1L;
    private static long totalExternalStorageGB = -1L;

    public Utility()
    {
    }

    public static boolean areObjectsEqual(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static transient ArrayList arrayList(Object aobj[])
    {
        ArrayList arraylist = new ArrayList(aobj.length);
        int j = aobj.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            arraylist.add(aobj[i]);
            i++;
        } while (true);
    }

    public static transient List asListNoNulls(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        int j = aobj.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            Object obj = aobj[i];
            if (obj != null)
            {
                arraylist.add(obj);
            }
            i++;
        } while (true);
    }

    public static JSONObject awaitGetGraphMeRequestWithCache(String s)
    {
        JSONObject jsonobject = ProfileInformationCache.getProfileInformation(s);
        if (jsonobject != null)
        {
            return jsonobject;
        }
        s = getGraphMeRequestWithCache(s).executeAndWait();
        if (s.getError() != null)
        {
            return null;
        } else
        {
            return s.getJSONObject();
        }
    }

    public static Uri buildUri(String s, String s1, Bundle bundle)
    {
        android.net.Uri.Builder builder;
        builder = new android.net.Uri.Builder();
        builder.scheme("https");
        builder.authority(s);
        builder.path(s1);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        s = bundle.keySet().iterator();
_L5:
        if (s.hasNext()) goto _L3; else goto _L2
_L2:
        return builder.build();
_L3:
        s1 = (String)s.next();
        Object obj = bundle.get(s1);
        if (obj instanceof String)
        {
            builder.appendQueryParameter(s1, (String)obj);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void clearCaches(Context context)
    {
        ImageDownloader.clearCache(context);
    }

    private static void clearCookiesForDomain(Context context, String s)
    {
        CookieSyncManager.createInstance(context).sync();
        context = CookieManager.getInstance();
        String s1 = context.getCookie(s);
        if (s1 == null)
        {
            return;
        }
        String as[] = s1.split(";");
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                context.removeExpiredCookie();
                return;
            }
            String as1[] = as[i].split("=");
            if (as1.length > 0)
            {
                context.setCookie(s, (new StringBuilder(String.valueOf(as1[0].trim()))).append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;").toString());
            }
            i++;
        } while (true);
    }

    public static void clearFacebookCookies(Context context)
    {
        clearCookiesForDomain(context, "facebook.com");
        clearCookiesForDomain(context, ".facebook.com");
        clearCookiesForDomain(context, "https://facebook.com");
        clearCookiesForDomain(context, "https://.facebook.com");
    }

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static String coerceValueIfNullOrEmpty(String s, String s1)
    {
        if (isNullOrEmpty(s))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    private static long convertBytesToGB(double d)
    {
        return Math.round(d / 1073741824D);
    }

    static Map convertJSONObjectToHashMap(JSONObject jsonobject)
    {
        HashMap hashmap;
        JSONArray jsonarray;
        int i;
        hashmap = new HashMap();
        jsonarray = jsonobject.names();
        i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            return hashmap;
        }
        Object obj1;
        String s;
        s = jsonarray.getString(i);
        obj1 = jsonobject.get(s);
        Object obj = obj1;
        try
        {
            if (obj1 instanceof JSONObject)
            {
                obj = convertJSONObjectToHashMap((JSONObject)obj1);
            }
            hashmap.put(s, obj);
        }
        catch (JSONException jsonexception) { }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int copyAndCloseInputStream(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[];
        int i;
        abyte0 = null;
        i = 0;
        Object obj = new BufferedInputStream(inputstream);
        abyte0 = new byte[8192];
_L1:
        int j = ((BufferedInputStream) (obj)).read(abyte0);
        if (j == -1)
        {
            if (obj != null)
            {
                ((BufferedInputStream) (obj)).close();
            }
            if (inputstream != null)
            {
                inputstream.close();
            }
            return i;
        }
        outputstream.write(abyte0, 0, j);
        i += j;
          goto _L1
        obj;
        outputstream = abyte0;
_L3:
        if (outputstream != null)
        {
            outputstream.close();
        }
        if (inputstream != null)
        {
            inputstream.close();
        }
        throw obj;
        Exception exception;
        exception;
        outputstream = ((OutputStream) (obj));
        obj = exception;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static void deleteDirectory(File file)
    {
        if (!file.exists())
        {
            return;
        }
        if (!file.isDirectory()) goto _L2; else goto _L1
_L1:
        File afile[];
        int i;
        int j;
        afile = file.listFiles();
        j = afile.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        file.delete();
        return;
_L3:
        deleteDirectory(afile[i]);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void disconnectQuietly(URLConnection urlconnection)
    {
        if (urlconnection instanceof HttpURLConnection)
        {
            ((HttpURLConnection)urlconnection).disconnect();
        }
    }

    private static boolean externalStorageExists()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static List filter(List list, Predicate predicate)
    {
        if (list == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            Object obj;
            do
            {
                if (!list.hasNext())
                {
                    list = arraylist;
                    if (arraylist.size() == 0)
                    {
                        list = null;
                    }
                    return list;
                }
                obj = (Object)list.next();
            } while (!predicate.apply(obj));
            arraylist.add(obj);
        } while (true);
    }

    public static String getActivityName(Context context)
    {
        if (context == null)
        {
            return "null";
        }
        if (context == context.getApplicationContext())
        {
            return "unknown";
        } else
        {
            return context.getClass().getSimpleName();
        }
    }

    private static JSONObject getAppSettingsQueryResponse(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", APP_SETTING_FIELDS));
        s = GraphRequest.newGraphPathRequest(null, s, null);
        s.setSkipClientToken(true);
        s.setParameters(bundle);
        return s.executeAndWait().getJSONObject();
    }

    public static FetchedAppSettings getAppSettingsWithoutQuery(String s)
    {
        if (s != null)
        {
            return (FetchedAppSettings)fetchedAppSettings.get(s);
        } else
        {
            return null;
        }
    }

    public static Date getBundleLongAsDate(Bundle bundle, String s, Date date)
    {
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        long l;
        bundle = ((Bundle) (bundle.get(s)));
        if (!(bundle instanceof Long))
        {
            continue; /* Loop/switch isn't completed */
        }
        l = ((Long)bundle).longValue();
_L4:
        if (l == 0L)
        {
            return new Date(0x7fffffffffffffffL);
        } else
        {
            return new Date(date.getTime() + 1000L * l);
        }
        if (!(bundle instanceof String)) goto _L1; else goto _L3
_L3:
        try
        {
            l = Long.parseLong((String)bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return null;
        }
          goto _L4
    }

    public static long getContentSize(Uri uri)
    {
        Uri uri1 = null;
        uri = FacebookSdk.getApplicationContext().getContentResolver().query(uri, null, null, null, null);
        uri1 = uri;
        int i = uri.getColumnIndex("_size");
        uri1 = uri;
        uri.moveToFirst();
        uri1 = uri;
        long l = uri.getLong(i);
        if (uri != null)
        {
            uri.close();
        }
        return l;
        uri;
        if (uri1 != null)
        {
            uri1.close();
        }
        throw uri;
    }

    public static DialogFeatureConfig getDialogFeatureConfig(String s, String s1, String s2)
    {
        if (!isNullOrEmpty(s1) && !isNullOrEmpty(s2))
        {
            if ((s = (FetchedAppSettings)fetchedAppSettings.get(s)) != null && (s = (Map)s.getDialogConfigurations().get(s1)) != null)
            {
                return (DialogFeatureConfig)s.get(s2);
            }
        }
        return null;
    }

    private static GraphRequest getGraphMeRequestWithCache(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", s);
        return new GraphRequest(null, "me", bundle, HttpMethod.GET, null);
    }

    public static void getGraphMeRequestWithCacheAsync(final String accessToken, final GraphMeRequestWithCacheCallback callback)
    {
        JSONObject jsonobject = ProfileInformationCache.getProfileInformation(accessToken);
        if (jsonobject != null)
        {
            callback.onSuccess(jsonobject);
            return;
        } else
        {
            callback = new com.facebook.GraphRequest.Callback() {

                private final String val$accessToken;
                private final GraphMeRequestWithCacheCallback val$callback;

                public void onCompleted(GraphResponse graphresponse)
                {
                    if (graphresponse.getError() != null)
                    {
                        callback.onFailure(graphresponse.getError().getException());
                        return;
                    } else
                    {
                        ProfileInformationCache.putProfileInformation(accessToken, graphresponse.getJSONObject());
                        callback.onSuccess(graphresponse.getJSONObject());
                        return;
                    }
                }

            
            {
                callback = graphmerequestwithcachecallback;
                accessToken = s;
                super();
            }
            };
            accessToken = getGraphMeRequestWithCache(accessToken);
            accessToken.setCallback(callback);
            accessToken.executeAsync();
            return;
        }
    }

    public static String getMetadataApplicationId(Context context)
    {
        Validate.notNull(context, "context");
        FacebookSdk.sdkInitialize(context);
        return FacebookSdk.getApplicationId();
    }

    public static transient Method getMethodQuietly(Class class1, String s, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static transient Method getMethodQuietly(String s, String s1, Class aclass[])
    {
        try
        {
            s = getMethodQuietly(Class.forName(s), s1, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static Object getStringPropertyAsJSON(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        s = ((String) (jsonobject.opt(s)));
        jsonobject = s;
        if (s != null)
        {
            jsonobject = s;
            if (s instanceof String)
            {
                jsonobject = ((JSONObject) ((new JSONTokener((String)s)).nextValue()));
            }
        }
        if (jsonobject != null && !(jsonobject instanceof JSONObject) && !(jsonobject instanceof JSONArray))
        {
            if (s1 != null)
            {
                s = new JSONObject();
                s.putOpt(s1, jsonobject);
                return s;
            } else
            {
                throw new FacebookException("Got an unexpected non-JSON object.");
            }
        } else
        {
            return jsonobject;
        }
    }

    public static String getUriString(Uri uri)
    {
        if (uri == null)
        {
            return null;
        } else
        {
            return uri.toString();
        }
    }

    public static boolean hasSameId(JSONObject jsonobject, JSONObject jsonobject1)
    {
        if (jsonobject != null && jsonobject1 != null && jsonobject.has("id") && jsonobject1.has("id"))
        {
            if (jsonobject.equals(jsonobject1))
            {
                return true;
            }
            jsonobject = jsonobject.optString("id");
            jsonobject1 = jsonobject1.optString("id");
            if (jsonobject != null && jsonobject1 != null)
            {
                return jsonobject.equals(jsonobject1);
            }
        }
        return false;
    }

    private static String hashBytes(MessageDigest messagedigest, byte abyte0[])
    {
        messagedigest.update(abyte0);
        messagedigest = messagedigest.digest();
        abyte0 = new StringBuilder();
        int j = messagedigest.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return abyte0.toString();
            }
            byte byte0 = messagedigest[i];
            abyte0.append(Integer.toHexString(byte0 >> 4 & 0xf));
            abyte0.append(Integer.toHexString(byte0 >> 0 & 0xf));
            i++;
        } while (true);
    }

    public static transient HashSet hashSet(Object aobj[])
    {
        HashSet hashset = new HashSet(aobj.length);
        int j = aobj.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return hashset;
            }
            hashset.add(aobj[i]);
            i++;
        } while (true);
    }

    private static String hashWithAlgorithm(String s, String s1)
    {
        return hashWithAlgorithm(s, s1.getBytes());
    }

    private static String hashWithAlgorithm(String s, byte abyte0[])
    {
        try
        {
            s = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return hashBytes(s, abyte0);
    }

    public static int[] intersectRanges(int ai[], int ai1[])
    {
        int ai2[];
        int l;
        int j1;
        int k1;
        if (ai == null)
        {
            return ai1;
        }
        if (ai1 == null)
        {
            return ai;
        }
        ai2 = new int[ai.length + ai1.length];
        l = 0;
        k1 = 0;
        j1 = 0;
_L5:
        int i = l;
        if (k1 >= ai.length) goto _L2; else goto _L1
_L1:
        if (j1 < ai1.length) goto _L4; else goto _L3
_L3:
        i = l;
_L2:
        return Arrays.copyOf(ai2, i);
_L4:
        int i1 = 0x80000000;
        int l1 = 0x7fffffff;
        int k = ai[k1];
        i = 0x7fffffff;
        int i2 = ai1[j1];
        int j = 0x7fffffff;
        if (k1 < ai.length - 1)
        {
            i = ai[k1 + 1];
        }
        if (j1 < ai1.length - 1)
        {
            j = ai1[j1 + 1];
        }
        if (k < i2)
        {
            if (i > i2)
            {
                i1 = i2;
                if (i > j)
                {
                    i = j;
                    k = j1 + 2;
                    j = k1;
                } else
                {
                    j = k1 + 2;
                    k = j1;
                }
            } else
            {
                j = k1 + 2;
                k = j1;
                i = l1;
            }
        } else
        if (j > k)
        {
            i1 = k;
            if (j > i)
            {
                j = k1 + 2;
                k = j1;
            } else
            {
                i = j;
                k = j1 + 2;
                j = k1;
            }
        } else
        {
            k = j1 + 2;
            j = k1;
            i = l1;
        }
        k1 = j;
        j1 = k;
        if (i1 != 0x80000000)
        {
label0:
            {
                j1 = l + 1;
                ai2[l] = i1;
                if (i == 0x7fffffff)
                {
                    break label0;
                }
                l = j1 + 1;
                ai2[j1] = i;
                k1 = j;
                j1 = k;
            }
        }
          goto _L5
        i = j1;
          goto _L2
    }

    public static transient Object invokeMethodQuietly(Object obj, Method method, Object aobj[])
    {
        try
        {
            obj = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return obj;
    }

    public static boolean isContentUri(Uri uri)
    {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean isCurrentAccessToken(AccessToken accesstoken)
    {
        if (accesstoken != null)
        {
            return accesstoken.equals(AccessToken.getCurrentAccessToken());
        } else
        {
            return false;
        }
    }

    public static boolean isFileUri(Uri uri)
    {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean isNullOrEmpty(Collection collection)
    {
        return collection == null || collection.size() == 0;
    }

    public static boolean isSubset(Collection collection, Collection collection1)
    {
        if (collection1 == null || collection1.size() == 0)
        {
            return collection == null || collection.size() == 0;
        }
        collection1 = new HashSet(collection1);
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                return true;
            }
        } while (collection1.contains((Object)collection.next()));
        return false;
    }

    public static boolean isWebUri(Uri uri)
    {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()));
    }

    public static Set jsonArrayToSet(JSONArray jsonarray)
        throws JSONException
    {
        HashSet hashset = new HashSet();
        int i = 0;
        do
        {
            if (i >= jsonarray.length())
            {
                return hashset;
            }
            hashset.add(jsonarray.getString(i));
            i++;
        } while (true);
    }

    public static List jsonArrayToStringList(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (i >= jsonarray.length())
            {
                return arraylist;
            }
            arraylist.add(jsonarray.getString(i));
            i++;
        } while (true);
    }

    public static void loadAppSettingsAsync(final Context context, final String applicationId)
    {
        boolean flag = loadingSettings.compareAndSet(false, true);
        if (!isNullOrEmpty(applicationId) && !fetchedAppSettings.containsKey(applicationId) && flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        final String settingsKey;
        settingsKey = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] {
            applicationId
        });
        FacebookSdk.getExecutor().execute(new Runnable() {

            private final String val$applicationId;
            private final Context val$context;
            private final String val$settingsKey;

            public void run()
            {
                JSONObject jsonobject = Utility.getAppSettingsQueryResponse(applicationId);
                if (jsonobject != null)
                {
                    Utility.parseAppSettingsFromJSON(applicationId, jsonobject);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).edit().putString(settingsKey, jsonobject.toString()).apply();
                }
                Utility.loadingSettings.set(false);
            }

            
            {
                applicationId = s;
                context = context1;
                settingsKey = s1;
                super();
            }
        });
        settingsKey = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(settingsKey, null);
        if (isNullOrEmpty(settingsKey))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = null;
        settingsKey = new JSONObject(settingsKey);
        context = settingsKey;
_L4:
        if (context != null)
        {
            parseAppSettingsFromJSON(applicationId, context);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        JSONException jsonexception;
        jsonexception;
        logd("FacebookSDK", jsonexception);
          goto _L4
    }

    public static void logd(String s, Exception exception)
    {
        if (FacebookSdk.isDebugEnabled() && s != null && exception != null)
        {
            Log.d(s, (new StringBuilder(String.valueOf(exception.getClass().getSimpleName()))).append(": ").append(exception.getMessage()).toString());
        }
    }

    public static void logd(String s, String s1)
    {
        if (FacebookSdk.isDebugEnabled() && s != null && s1 != null)
        {
            Log.d(s, s1);
        }
    }

    public static void logd(String s, String s1, Throwable throwable)
    {
        if (FacebookSdk.isDebugEnabled() && !isNullOrEmpty(s))
        {
            Log.d(s, s1, throwable);
        }
    }

    public static List map(List list, Mapper mapper)
    {
        if (list == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            Object obj;
            do
            {
                if (!list.hasNext())
                {
                    list = arraylist;
                    if (arraylist.size() == 0)
                    {
                        list = null;
                    }
                    return list;
                }
                obj = mapper.apply((Object)list.next());
            } while (obj == null);
            arraylist.add(obj);
        } while (true);
    }

    public static String md5hash(String s)
    {
        return hashWithAlgorithm("MD5", s);
    }

    private static FetchedAppSettings parseAppSettingsFromJSON(String s, JSONObject jsonobject)
    {
        Object obj = jsonobject.optJSONArray("android_sdk_error_categories");
        if (obj == null)
        {
            obj = FacebookRequestErrorClassification.getDefaultErrorClassification();
        } else
        {
            obj = FacebookRequestErrorClassification.createFromJSON(((JSONArray) (obj)));
        }
        jsonobject = new FetchedAppSettings(jsonobject.optBoolean("supports_implicit_sdk_logging", false), jsonobject.optString("gdpv4_nux_content", ""), jsonobject.optBoolean("gdpv4_nux_enabled", false), parseDialogConfigurations(jsonobject.optJSONObject("android_dialog_configs")), ((FacebookRequestErrorClassification) (obj)), null);
        fetchedAppSettings.put(s, jsonobject);
        return jsonobject;
    }

    private static Map parseDialogConfigurations(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = jsonobject.optJSONArray("data");
        if (jsonarray == null) goto _L2; else goto _L3
_L3:
        int i = 0;
_L6:
        if (i < jsonarray.length()) goto _L4; else goto _L2
_L2:
        return hashmap;
_L4:
        DialogFeatureConfig dialogfeatureconfig;
        dialogfeatureconfig = DialogFeatureConfig.parseDialogConfig(jsonarray.optJSONObject(i));
        if (dialogfeatureconfig != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        String s = dialogfeatureconfig.getDialogName();
        Map map1 = (Map)hashmap.get(s);
        jsonobject = map1;
        if (map1 == null)
        {
            jsonobject = new HashMap();
            hashmap.put(s, jsonobject);
        }
        jsonobject.put(dialogfeatureconfig.getFeatureName(), dialogfeatureconfig);
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    public static Bundle parseUrlQueryString(String s)
    {
        Bundle bundle;
        int i;
        i = 0;
        bundle = new Bundle();
        if (isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        int j;
        s = s.split("&");
        j = s.length;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return bundle;
_L3:
        String as[] = s[i].split("=");
label0:
        {
            if (as.length == 2)
            {
                bundle.putString(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8"));
                break label0;
            }
            try
            {
                if (as.length == 1)
                {
                    bundle.putString(URLDecoder.decode(as[0], "UTF-8"), "");
                }
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                logd("FacebookSDK", unsupportedencodingexception);
            }
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void putCommaSeparatedStringList(Bundle bundle, String s, ArrayList arraylist)
    {
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        arraylist = arraylist.iterator();
_L6:
        if (arraylist.hasNext()) goto _L4; else goto _L3
_L3:
        arraylist = "";
        if (stringbuilder.length() > 0)
        {
            arraylist = stringbuilder.substring(0, stringbuilder.length() - 1);
        }
        bundle.putString(s, arraylist);
_L2:
        return;
_L4:
        stringbuilder.append((String)arraylist.next());
        stringbuilder.append(",");
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean putJSONValueInBundle(Bundle bundle, String s, Object obj)
    {
        if (obj == null)
        {
            bundle.remove(s);
        } else
        if (obj instanceof Boolean)
        {
            bundle.putBoolean(s, ((Boolean)obj).booleanValue());
        } else
        if (obj instanceof boolean[])
        {
            bundle.putBooleanArray(s, (boolean[])obj);
        } else
        if (obj instanceof Double)
        {
            bundle.putDouble(s, ((Double)obj).doubleValue());
        } else
        if (obj instanceof double[])
        {
            bundle.putDoubleArray(s, (double[])obj);
        } else
        if (obj instanceof Integer)
        {
            bundle.putInt(s, ((Integer)obj).intValue());
        } else
        if (obj instanceof int[])
        {
            bundle.putIntArray(s, (int[])obj);
        } else
        if (obj instanceof Long)
        {
            bundle.putLong(s, ((Long)obj).longValue());
        } else
        if (obj instanceof long[])
        {
            bundle.putLongArray(s, (long[])obj);
        } else
        if (obj instanceof String)
        {
            bundle.putString(s, (String)obj);
        } else
        if (obj instanceof JSONArray)
        {
            bundle.putString(s, ((JSONArray)obj).toString());
        } else
        if (obj instanceof JSONObject)
        {
            bundle.putString(s, ((JSONObject)obj).toString());
        } else
        {
            return false;
        }
        return true;
    }

    public static void putNonEmptyString(Bundle bundle, String s, String s1)
    {
        if (!isNullOrEmpty(s1))
        {
            bundle.putString(s, s1);
        }
    }

    public static void putUri(Bundle bundle, String s, Uri uri)
    {
        if (uri != null)
        {
            putNonEmptyString(bundle, s, uri.toString());
        }
    }

    public static FetchedAppSettings queryAppSettings(String s, boolean flag)
    {
        if (!flag && fetchedAppSettings.containsKey(s))
        {
            return (FetchedAppSettings)fetchedAppSettings.get(s);
        }
        JSONObject jsonobject = getAppSettingsQueryResponse(s);
        if (jsonobject == null)
        {
            return null;
        } else
        {
            return parseAppSettingsFromJSON(s, jsonobject);
        }
    }

    public static String readStreamToString(InputStream inputstream)
        throws IOException
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        inputstream = new BufferedInputStream(inputstream);
        obj = new InputStreamReader(inputstream);
        char ac[];
        obj1 = new StringBuilder();
        ac = new char[2048];
_L1:
        int i = ((InputStreamReader) (obj)).read(ac);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj1 = ((StringBuilder) (obj1)).toString();
        closeQuietly(inputstream);
        closeQuietly(((Closeable) (obj)));
        return ((String) (obj1));
        ((StringBuilder) (obj1)).append(ac, 0, i);
          goto _L1
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L3:
        closeQuietly(inputstream);
        closeQuietly(((Closeable) (obj1)));
        throw obj;
        exception;
        inputstream = ((InputStream) (obj));
        obj = exception;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static Map readStringMapFromParcel(Parcel parcel)
    {
        int j = parcel.readInt();
        if (j >= 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap();
        int i = 0;
        do
        {
            obj = hashmap;
            if (i >= j)
            {
                continue;
            }
            hashmap.put(parcel.readString(), parcel.readString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void refreshAvailableExternalStorage()
    {
        try
        {
            if (externalStorageExists())
            {
                StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                availableExternalStorageGB = (long)statfs.getAvailableBlocks() * (long)statfs.getBlockSize();
            }
            availableExternalStorageGB = convertBytesToGB(availableExternalStorageGB);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private static int refreshBestGuessNumberOfCPUCores()
    {
        if (numCPUCores > 0)
        {
            return numCPUCores;
        }
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            numCPUCores = 1;
            return numCPUCores;
        }
        try
        {
            numCPUCores = (new File("/sys/devices/system/cpu/")).listFiles(new FilenameFilter() {

                public boolean accept(File file, String s)
                {
                    return Pattern.matches("cpu[0-9]+", s);
                }

            }).length;
        }
        catch (Exception exception) { }
        if (numCPUCores <= 0)
        {
            numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return numCPUCores;
    }

    private static void refreshCarrierName(Context context)
    {
        if (!carrierName.equals("NoCarrier"))
        {
            break MISSING_BLOCK_LABEL_27;
        }
        carrierName = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
        return;
        context;
    }

    private static void refreshPeriodicExtendedDeviceInfo(Context context)
    {
        if (timestampOfLastCheck == -1L || System.currentTimeMillis() - timestampOfLastCheck >= 0x1b7740L)
        {
            timestampOfLastCheck = System.currentTimeMillis();
            refreshTimezone();
            refreshCarrierName(context);
            refreshTotalExternalStorage();
            refreshAvailableExternalStorage();
        }
    }

    private static void refreshTimezone()
    {
        try
        {
            TimeZone timezone = TimeZone.getDefault();
            deviceTimezone = timezone.getDisplayName(timezone.inDaylightTime(new Date()), 0);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private static void refreshTotalExternalStorage()
    {
        try
        {
            if (externalStorageExists())
            {
                StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                totalExternalStorageGB = (long)statfs.getBlockCount() * (long)statfs.getBlockSize();
            }
            totalExternalStorageGB = convertBytesToGB(totalExternalStorageGB);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public static String safeGetStringFromResponse(JSONObject jsonobject, String s)
    {
        if (jsonobject != null)
        {
            return jsonobject.optString(s, "");
        } else
        {
            return "";
        }
    }

    public static void setAppEventAttributionParameters(JSONObject jsonobject, AttributionIdentifiers attributionidentifiers, String s, boolean flag)
        throws JSONException
    {
        boolean flag2 = false;
        if (attributionidentifiers != null && attributionidentifiers.getAttributionId() != null)
        {
            jsonobject.put("attribution", attributionidentifiers.getAttributionId());
        }
        if (attributionidentifiers != null && attributionidentifiers.getAndroidAdvertiserId() != null)
        {
            jsonobject.put("advertiser_id", attributionidentifiers.getAndroidAdvertiserId());
            boolean flag1;
            if (attributionidentifiers.isTrackingLimited())
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            jsonobject.put("advertiser_tracking_enabled", flag1);
        }
        if (attributionidentifiers != null && attributionidentifiers.getAndroidInstallerPackage() != null)
        {
            jsonobject.put("installer_package", attributionidentifiers.getAndroidInstallerPackage());
        }
        jsonobject.put("anon_id", s);
        if (flag)
        {
            flag = flag2;
        } else
        {
            flag = true;
        }
        jsonobject.put("application_tracking_enabled", flag);
    }

    public static void setAppEventExtendedDeviceInfoParameters(JSONObject jsonobject, Context context)
        throws JSONException
    {
        Object obj;
        JSONArray jsonarray;
        String s;
        int i;
        int j;
        jsonarray = new JSONArray();
        jsonarray.put("a2");
        refreshPeriodicExtendedDeviceInfo(context);
        s = context.getPackageName();
        j = -1;
        obj = "";
        i = j;
        Object obj1 = context.getPackageManager().getPackageInfo(s, 0);
        i = j;
        j = ((PackageInfo) (obj1)).versionCode;
        i = j;
        obj1 = ((PackageInfo) (obj1)).versionName;
        obj = obj1;
        i = j;
_L4:
        double d;
        double d1;
        jsonarray.put(s);
        jsonarray.put(i);
        jsonarray.put(obj);
        jsonarray.put(android.os.Build.VERSION.RELEASE);
        jsonarray.put(Build.MODEL);
        float f;
        int k;
        int l;
        int i1;
        boolean flag;
        boolean flag1;
        try
        {
            obj = context.getResources().getConfiguration().locale;
        }
        catch (Exception exception)
        {
            exception = Locale.getDefault();
        }
        jsonarray.put((new StringBuilder(String.valueOf(((Locale) (obj)).getLanguage()))).append("_").append(((Locale) (obj)).getCountry()).toString());
        jsonarray.put(deviceTimezone);
        jsonarray.put(carrierName);
        l = 0;
        flag = false;
        i1 = 0;
        flag1 = false;
        d1 = 0.0D;
        k = i1;
        i = l;
        context = (WindowManager)context.getSystemService("window");
        d = d1;
        k = ((flag1) ? 1 : 0);
        i = ((flag) ? 1 : 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        k = i1;
        i = l;
        context = context.getDefaultDisplay();
        k = i1;
        i = l;
        obj = new DisplayMetrics();
        k = i1;
        i = l;
        context.getMetrics(((DisplayMetrics) (obj)));
        k = i1;
        i = l;
        l = ((DisplayMetrics) (obj)).widthPixels;
        k = i1;
        i = l;
        i1 = ((DisplayMetrics) (obj)).heightPixels;
        k = i1;
        i = l;
        f = ((DisplayMetrics) (obj)).density;
        d = f;
        i = l;
        k = i1;
_L2:
        jsonarray.put(i);
        jsonarray.put(k);
        jsonarray.put(String.format("%.2f", new Object[] {
            Double.valueOf(d)
        }));
        jsonarray.put(refreshBestGuessNumberOfCPUCores());
        jsonarray.put(totalExternalStorageGB);
        jsonarray.put(availableExternalStorageGB);
        jsonobject.put("extinfo", jsonarray.toString());
        return;
        context;
        d = d1;
        if (true) goto _L2; else goto _L1
_L1:
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String sha1hash(String s)
    {
        return hashWithAlgorithm("SHA-1", s);
    }

    public static String sha1hash(byte abyte0[])
    {
        return hashWithAlgorithm("SHA-1", abyte0);
    }

    public static boolean stringsEqualOrEmpty(String s, String s1)
    {
        boolean flag = TextUtils.isEmpty(s);
        boolean flag1 = TextUtils.isEmpty(s1);
        if (flag && flag1)
        {
            return true;
        }
        if (!flag && !flag1)
        {
            return s.equals(s1);
        } else
        {
            return false;
        }
    }

    public static JSONArray tryGetJSONArrayFromResponse(JSONObject jsonobject, String s)
    {
        if (jsonobject != null)
        {
            return jsonobject.optJSONArray(s);
        } else
        {
            return null;
        }
    }

    public static JSONObject tryGetJSONObjectFromResponse(JSONObject jsonobject, String s)
    {
        if (jsonobject != null)
        {
            return jsonobject.optJSONObject(s);
        } else
        {
            return null;
        }
    }

    public static transient Collection unmodifiableCollection(Object aobj[])
    {
        return Collections.unmodifiableCollection(Arrays.asList(aobj));
    }

    public static void writeStringMapToParcel(Parcel parcel, Map map1)
    {
        if (map1 == null)
        {
            parcel.writeInt(-1);
        } else
        {
            parcel.writeInt(map1.size());
            map1 = map1.entrySet().iterator();
            while (map1.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map1.next();
                parcel.writeString((String)entry.getKey());
                parcel.writeString((String)entry.getValue());
            }
        }
    }

    static 
    {
        availableExternalStorageGB = -1L;
    }



}
