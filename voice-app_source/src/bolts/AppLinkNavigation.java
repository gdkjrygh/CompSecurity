// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bolts:
//            AppLink, WebViewAppLinkResolver, AppLinkResolver, Task, 
//            MeasurementEvent, Continuation

public class AppLinkNavigation
{
    public static final class NavigationResult extends Enum
    {

        private static final NavigationResult $VALUES[];
        public static final NavigationResult APP;
        public static final NavigationResult FAILED;
        public static final NavigationResult WEB;
        private String code;
        private boolean succeeded;

        public static NavigationResult valueOf(String s)
        {
            return (NavigationResult)Enum.valueOf(bolts/AppLinkNavigation$NavigationResult, s);
        }

        public static NavigationResult[] values()
        {
            return (NavigationResult[])$VALUES.clone();
        }

        public String getCode()
        {
            return code;
        }

        public boolean isSucceeded()
        {
            return succeeded;
        }

        static 
        {
            FAILED = new NavigationResult("FAILED", 0, "failed", false);
            WEB = new NavigationResult("WEB", 1, "web", true);
            APP = new NavigationResult("APP", 2, "app", true);
            $VALUES = (new NavigationResult[] {
                FAILED, WEB, APP
            });
        }

        private NavigationResult(String s, int i, String s1, boolean flag)
        {
            super(s, i);
            code = s1;
            succeeded = flag;
        }
    }


    private static final String KEY_NAME_REFERER_APP_LINK = "referer_app_link";
    private static final String KEY_NAME_REFERER_APP_LINK_APP_NAME = "app_name";
    private static final String KEY_NAME_REFERER_APP_LINK_PACKAGE = "package";
    private static final String KEY_NAME_USER_AGENT = "user_agent";
    private static final String KEY_NAME_VERSION = "version";
    private static final String VERSION = "1.0";
    private static AppLinkResolver defaultResolver;
    private final AppLink appLink;
    private final Bundle appLinkData;
    private final Bundle extras;

    public AppLinkNavigation(AppLink applink, Bundle bundle, Bundle bundle1)
    {
        if (applink == null)
        {
            throw new IllegalArgumentException("appLink must not be null.");
        }
        Bundle bundle2 = bundle;
        if (bundle == null)
        {
            bundle2 = new Bundle();
        }
        bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
        }
        appLink = applink;
        extras = bundle2;
        appLinkData = bundle;
    }

    private Bundle buildAppLinkDataForNavigation(Context context)
    {
        Bundle bundle = new Bundle();
        Bundle bundle1 = new Bundle();
        if (context != null)
        {
            Object obj = context.getPackageName();
            if (obj != null)
            {
                bundle1.putString("package", ((String) (obj)));
            }
            obj = context.getApplicationInfo();
            if (obj != null)
            {
                context = context.getString(((ApplicationInfo) (obj)).labelRes);
                if (context != null)
                {
                    bundle1.putString("app_name", context);
                }
            }
        }
        bundle.putAll(getAppLinkData());
        bundle.putString("target_url", getAppLink().getSourceUrl().toString());
        bundle.putString("version", "1.0");
        bundle.putString("user_agent", "Bolts Android 1.2.0");
        bundle.putBundle("referer_app_link", bundle1);
        bundle.putBundle("extras", getExtras());
        return bundle;
    }

    public static AppLinkResolver getDefaultResolver()
    {
        return defaultResolver;
    }

    private JSONObject getJSONForBundle(Bundle bundle)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); jsonobject.put(s, getJSONValue(bundle.get(s))))
        {
            s = (String)iterator.next();
        }

        return jsonobject;
    }

    private Object getJSONValue(Object obj)
        throws JSONException
    {
        if (!(obj instanceof Bundle)) goto _L2; else goto _L1
_L1:
        obj = getJSONForBundle((Bundle)obj);
_L4:
        return obj;
_L2:
        if (obj instanceof CharSequence)
        {
            return obj.toString();
        }
        if (obj instanceof List)
        {
            JSONArray jsonarray = new JSONArray();
            Iterator iterator = ((List)obj).iterator();
            do
            {
                obj = jsonarray;
                if (!iterator.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                jsonarray.put(getJSONValue(iterator.next()));
            } while (true);
        }
        if (obj instanceof SparseArray)
        {
            JSONArray jsonarray1 = new JSONArray();
            SparseArray sparsearray = (SparseArray)obj;
            int i = 0;
            do
            {
                obj = jsonarray1;
                if (i >= sparsearray.size())
                {
                    continue; /* Loop/switch isn't completed */
                }
                jsonarray1.put(sparsearray.keyAt(i), getJSONValue(sparsearray.valueAt(i)));
                i++;
            } while (true);
        }
        if (obj instanceof Character)
        {
            return obj.toString();
        }
        if (obj instanceof Boolean)
        {
            return obj;
        }
        if (obj instanceof Number)
        {
            if ((obj instanceof Double) || (obj instanceof Float))
            {
                return Double.valueOf(((Number)obj).doubleValue());
            } else
            {
                return Long.valueOf(((Number)obj).longValue());
            }
        }
        if (obj instanceof boolean[])
        {
            JSONArray jsonarray2 = new JSONArray();
            boolean aflag[] = (boolean[])(boolean[])obj;
            int k2 = aflag.length;
            int j = 0;
            do
            {
                obj = jsonarray2;
                if (j >= k2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                jsonarray2.put(getJSONValue(Boolean.valueOf(aflag[j])));
                j++;
            } while (true);
        }
        if (obj instanceof char[])
        {
            JSONArray jsonarray3 = new JSONArray();
            char ac[] = (char[])(char[])obj;
            int l2 = ac.length;
            int k = 0;
            do
            {
                obj = jsonarray3;
                if (k >= l2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                jsonarray3.put(getJSONValue(Character.valueOf(ac[k])));
                k++;
            } while (true);
        }
        if (obj instanceof CharSequence[])
        {
            JSONArray jsonarray4 = new JSONArray();
            CharSequence acharsequence[] = (CharSequence[])(CharSequence[])obj;
            int i3 = acharsequence.length;
            int l = 0;
            do
            {
                obj = jsonarray4;
                if (l >= i3)
                {
                    continue; /* Loop/switch isn't completed */
                }
                jsonarray4.put(getJSONValue(acharsequence[l]));
                l++;
            } while (true);
        }
        if (obj instanceof double[])
        {
            JSONArray jsonarray5 = new JSONArray();
            double ad[] = (double[])(double[])obj;
            int j3 = ad.length;
            int i1 = 0;
            do
            {
                obj = jsonarray5;
                if (i1 >= j3)
                {
                    continue; /* Loop/switch isn't completed */
                }
                jsonarray5.put(getJSONValue(Double.valueOf(ad[i1])));
                i1++;
            } while (true);
        }
        if (obj instanceof float[])
        {
            JSONArray jsonarray6 = new JSONArray();
            float af[] = (float[])(float[])obj;
            int k3 = af.length;
            int j1 = 0;
            do
            {
                obj = jsonarray6;
                if (j1 >= k3)
                {
                    continue; /* Loop/switch isn't completed */
                }
                jsonarray6.put(getJSONValue(Float.valueOf(af[j1])));
                j1++;
            } while (true);
        }
        if (obj instanceof int[])
        {
            JSONArray jsonarray7 = new JSONArray();
            int ai[] = (int[])(int[])obj;
            int l3 = ai.length;
            int k1 = 0;
            do
            {
                obj = jsonarray7;
                if (k1 >= l3)
                {
                    continue; /* Loop/switch isn't completed */
                }
                jsonarray7.put(getJSONValue(Integer.valueOf(ai[k1])));
                k1++;
            } while (true);
        }
        if (obj instanceof long[])
        {
            JSONArray jsonarray8 = new JSONArray();
            long al[] = (long[])(long[])obj;
            int i4 = al.length;
            int l1 = 0;
            do
            {
                obj = jsonarray8;
                if (l1 >= i4)
                {
                    continue; /* Loop/switch isn't completed */
                }
                jsonarray8.put(getJSONValue(Long.valueOf(al[l1])));
                l1++;
            } while (true);
        }
        if (obj instanceof short[])
        {
            JSONArray jsonarray9 = new JSONArray();
            short aword0[] = (short[])(short[])obj;
            int j4 = aword0.length;
            int i2 = 0;
            do
            {
                obj = jsonarray9;
                if (i2 >= j4)
                {
                    continue; /* Loop/switch isn't completed */
                }
                jsonarray9.put(getJSONValue(Short.valueOf(aword0[i2])));
                i2++;
            } while (true);
        }
label0:
        {
            if (!(obj instanceof String[]))
            {
                break label0;
            }
            JSONArray jsonarray10 = new JSONArray();
            String as[] = (String[])(String[])obj;
            int k4 = as.length;
            int j2 = 0;
            do
            {
                obj = jsonarray10;
                if (j2 >= k4)
                {
                    break;
                }
                jsonarray10.put(getJSONValue(as[j2]));
                j2++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    private static AppLinkResolver getResolver(Context context)
    {
        if (getDefaultResolver() != null)
        {
            return getDefaultResolver();
        } else
        {
            return new WebViewAppLinkResolver(context);
        }
    }

    public static NavigationResult navigate(Context context, AppLink applink)
    {
        return (new AppLinkNavigation(applink, null, null)).navigate(context);
    }

    public static Task navigateInBackground(Context context, Uri uri)
    {
        return navigateInBackground(context, uri, getResolver(context));
    }

    public static Task navigateInBackground(Context context, Uri uri, AppLinkResolver applinkresolver)
    {
        return applinkresolver.getAppLinkFromUrlInBackground(uri).onSuccess(new Continuation(context) {

            final Context val$context;

            public NavigationResult then(Task task)
                throws Exception
            {
                return AppLinkNavigation.navigate(context, (AppLink)task.getResult());
            }

            public volatile Object then(Task task)
                throws Exception
            {
                return then(task);
            }

            
            {
                context = context1;
                super();
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    public static Task navigateInBackground(Context context, String s)
    {
        return navigateInBackground(context, s, getResolver(context));
    }

    public static Task navigateInBackground(Context context, String s, AppLinkResolver applinkresolver)
    {
        return navigateInBackground(context, Uri.parse(s), applinkresolver);
    }

    public static Task navigateInBackground(Context context, URL url)
    {
        return navigateInBackground(context, url, getResolver(context));
    }

    public static Task navigateInBackground(Context context, URL url, AppLinkResolver applinkresolver)
    {
        return navigateInBackground(context, Uri.parse(url.toString()), applinkresolver);
    }

    private void sendAppLinkNavigateEventBroadcast(Context context, Intent intent, NavigationResult navigationresult, JSONException jsonexception)
    {
        HashMap hashmap = new HashMap();
        if (jsonexception != null)
        {
            hashmap.put("error", jsonexception.getLocalizedMessage());
        }
        if (navigationresult.isSucceeded())
        {
            jsonexception = "1";
        } else
        {
            jsonexception = "0";
        }
        hashmap.put("success", jsonexception);
        hashmap.put("type", navigationresult.getCode());
        MeasurementEvent.sendBroadcastEvent(context, "al_nav_out", intent, hashmap);
    }

    public static void setDefaultResolver(AppLinkResolver applinkresolver)
    {
        defaultResolver = applinkresolver;
    }

    public AppLink getAppLink()
    {
        return appLink;
    }

    public Bundle getAppLinkData()
    {
        return appLinkData;
    }

    public Bundle getExtras()
    {
        return extras;
    }

    public NavigationResult navigate(Context context)
    {
        Intent intent;
        Object obj;
        Object obj1;
        Bundle bundle;
        obj1 = context.getPackageManager();
        bundle = buildAppLinkDataForNavigation(context);
        obj = null;
        Iterator iterator = getAppLink().getTargets().iterator();
        do
        {
            intent = ((Intent) (obj));
            if (!iterator.hasNext())
            {
                break;
            }
            AppLink.Target target = (AppLink.Target)iterator.next();
            intent = new Intent("android.intent.action.VIEW");
            if (target.getUrl() != null)
            {
                intent.setData(target.getUrl());
            } else
            {
                intent.setData(appLink.getSourceUrl());
            }
            intent.setPackage(target.getPackageName());
            if (target.getClassName() != null)
            {
                intent.setClassName(target.getPackageName(), target.getClassName());
            }
            intent.putExtra("al_applink_data", bundle);
        } while (((PackageManager) (obj1)).resolveActivity(intent, 0x10000) == null);
        obj = null;
        obj1 = NavigationResult.FAILED;
        if (intent == null) goto _L2; else goto _L1
_L1:
        obj1 = NavigationResult.APP;
        obj = intent;
_L4:
        sendAppLinkNavigateEventBroadcast(context, ((Intent) (obj)), ((NavigationResult) (obj1)), null);
        if (obj != null)
        {
            context.startActivity(((Intent) (obj)));
        }
        return ((NavigationResult) (obj1));
_L2:
        Uri uri = getAppLink().getWebUrl();
        if (uri != null)
        {
            try
            {
                obj = getJSONForBundle(bundle);
            }
            catch (JSONException jsonexception)
            {
                sendAppLinkNavigateEventBroadcast(context, intent, NavigationResult.FAILED, jsonexception);
                throw new RuntimeException(jsonexception);
            }
            obj = new Intent("android.intent.action.VIEW", uri.buildUpon().appendQueryParameter("al_applink_data", ((JSONObject) (obj)).toString()).build());
            obj1 = NavigationResult.WEB;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
