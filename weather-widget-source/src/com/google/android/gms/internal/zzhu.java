// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.search.SearchAdView;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzhr, zzht, zzbq, zzby, 
//            zzbu, zzan, zzip, zzia, 
//            zzhv

public class zzhu
{
    private final class zza extends BroadcastReceiver
    {

        final zzhu zzHN;

        public void onReceive(Context context, Intent intent)
        {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
            {
                com.google.android.gms.internal.zzhu.zza(zzHN, true);
            } else
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
            {
                com.google.android.gms.internal.zzhu.zza(zzHN, false);
                return;
            }
        }

        private zza()
        {
            zzHN = zzhu.this;
            super();
        }

    }


    private static final String zzHE = com/google/android/gms/ads/AdView.getName();
    private static final String zzHF = com/google/android/gms/ads/InterstitialAd.getName();
    private static final String zzHG = com/google/android/gms/ads/doubleclick/PublisherAdView.getName();
    private static final String zzHH = com/google/android/gms/ads/doubleclick/PublisherInterstitialAd.getName();
    private static final String zzHI = com/google/android/gms/ads/search/SearchAdView.getName();
    private static final String zzHJ = com/google/android/gms/ads/AdLoader.getName();
    public static final Handler zzHK = new zzhr(Looper.getMainLooper());
    private boolean zzHL;
    private boolean zzHM;
    private String zzHj;
    private final Object zzpc = new Object();

    public zzhu()
    {
        zzHL = true;
        zzHM = false;
    }

    public static void runOnUiThread(Runnable runnable)
    {
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            runnable.run();
            return;
        } else
        {
            zzHK.post(runnable);
            return;
        }
    }

    static Object zza(zzhu zzhu1)
    {
        return zzhu1.zzpc;
    }

    static String zza(zzhu zzhu1, String s)
    {
        zzhu1.zzHj = s;
        return s;
    }

    private JSONArray zza(Collection collection)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        for (collection = collection.iterator(); collection.hasNext(); zza(jsonarray, collection.next())) { }
        return jsonarray;
    }

    private void zza(JSONArray jsonarray, Object obj)
        throws JSONException
    {
        if (obj instanceof Bundle)
        {
            jsonarray.put(zze((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonarray.put(zzx((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            jsonarray.put(zza((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            jsonarray.put(zza((Object[])(Object[])obj));
            return;
        } else
        {
            jsonarray.put(obj);
            return;
        }
    }

    private void zza(JSONObject jsonobject, String s, Object obj)
        throws JSONException
    {
        if (obj instanceof Bundle)
        {
            jsonobject.put(s, zze((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonobject.put(s, zzx((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            if (s == null)
            {
                s = "null";
            }
            jsonobject.put(s, zza((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            jsonobject.put(s, zza(((Collection) (Arrays.asList((Object[])(Object[])obj)))));
            return;
        } else
        {
            jsonobject.put(s, obj);
            return;
        }
    }

    static boolean zza(zzhu zzhu1, boolean flag)
    {
        zzhu1.zzHL = flag;
        return flag;
    }

    public static void zzb(Runnable runnable)
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            runnable.run();
            return;
        } else
        {
            com.google.android.gms.internal.zzht.zza(runnable);
            return;
        }
    }

    private JSONObject zze(Bundle bundle)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); zza(jsonobject, s, bundle.get(s)))
        {
            s = (String)iterator.next();
        }

        return jsonobject;
    }

    private boolean zzr(Context context)
    {
        context = (PowerManager)context.getSystemService("power");
        if (context == null)
        {
            return false;
        } else
        {
            return context.isScreenOn();
        }
    }

    public boolean zzI(Context context)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        context = context.getPackageManager().resolveActivity(intent, 0x10000);
        if (context == null || ((ResolveInfo) (context)).activityInfo == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean flag;
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x10) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboard"
            }));
            flag = false;
        } else
        {
            flag = true;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x20) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboardHidden"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x80) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "orientation"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x100) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenLayout"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x200) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "uiMode"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x400) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenSize"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x800) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "smallestScreenSize"
            }));
            return false;
        } else
        {
            return flag;
        }
    }

    public boolean zzJ(Context context)
    {
        if (zzHM)
        {
            return false;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.USER_PRESENT");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new zza(), intentfilter);
            zzHM = true;
            return true;
        }
    }

    protected String zzK(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    public android.app.AlertDialog.Builder zzL(Context context)
    {
        return new android.app.AlertDialog.Builder(context);
    }

    public zzbq zzM(Context context)
    {
        return new zzbq(context);
    }

    public String zzN(Context context)
    {
        context = (ActivityManager)context.getSystemService("activity");
        if (context == null)
        {
            return null;
        }
        context = context.getRunningTasks(1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (context.isEmpty())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        context = (android.app.ActivityManager.RunningTaskInfo)context.get(0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        context = ((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity.getClassName();
        return context;
        context;
        return null;
    }

    public boolean zzO(Context context)
    {
        KeyguardManager keyguardmanager;
        Object obj;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            obj = (ActivityManager)context.getSystemService("activity");
            keyguardmanager = (KeyguardManager)context.getSystemService("keyguard");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (obj == null || keyguardmanager == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = ((ActivityManager) (obj)).getRunningAppProcesses();
        if (obj == null)
        {
            return false;
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_113;
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        } while (Process.myPid() != runningappprocessinfo.pid);
        if (runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        flag = zzr(context);
        if (flag)
        {
            return true;
        }
        return false;
        return false;
    }

    public DisplayMetrics zza(WindowManager windowmanager)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics;
    }

    public PopupWindow zza(View view, int i, int j, boolean flag)
    {
        return new PopupWindow(view, i, j, flag);
    }

    public String zza(Context context, View view, AdSizeParcel adsizeparcel)
    {
        if (!((Boolean)zzby.zzuR.get()).booleanValue())
        {
            return null;
        }
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("width", adsizeparcel.width);
        jsonobject1.put("height", adsizeparcel.height);
        jsonobject.put("size", jsonobject1);
        jsonobject.put("activity", zzN(context));
        if (adsizeparcel.zzsH) goto _L2; else goto _L1
_L1:
        adsizeparcel = new JSONArray();
_L7:
        if (view == null) goto _L4; else goto _L3
_L3:
        int i;
        try
        {
            context = view.getParent();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to get view hierarchy json", context);
            return null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        i = -1;
        if (context instanceof ViewGroup)
        {
            i = ((ViewGroup)context).indexOfChild(view);
        }
        view = new JSONObject();
        view.put("type", context.getClass().getName());
        view.put("index_of_child", i);
        adsizeparcel.put(view);
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(context instanceof View))
        {
            break; /* Loop/switch isn't completed */
        }
        context = (View)context;
          goto _L5
_L4:
        if (adsizeparcel.length() > 0)
        {
            jsonobject.put("parents", adsizeparcel);
        }
_L2:
        context = jsonobject.toString();
        return context;
_L5:
        view = context;
        if (true) goto _L7; else goto _L6
_L6:
        context = null;
          goto _L5
        if (true) goto _L7; else goto _L8
_L8:
    }

    public String zza(Context context, zzan zzan1, String s)
    {
        if (zzan1 == null)
        {
            return s;
        }
        Uri uri;
        Uri uri1;
        try
        {
            uri1 = Uri.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return s;
        }
        uri = uri1;
        if (zzan1.zzc(uri1))
        {
            uri = zzan1.zza(uri1, context);
        }
        context = uri.toString();
        return context;
    }

    public String zza(Context context, String s, String s1, int i)
    {
        if (!((Boolean)zzby.zzuQ.get()).booleanValue() || !zzm.zzq(context).zzbn() || TextUtils.isEmpty(s) || !zzb(Uri.parse(s)))
        {
            return s;
        } else
        {
            context = new HashMap();
            context.put("ga_cid", s1);
            context.put("ga_hid", String.valueOf(i));
            return zza(s, ((Map) (context)));
        }
    }

    public String zza(zzip zzip1, String s)
    {
        return zza(zzip1.getContext(), zzip1.zzgU(), s);
    }

    public String zza(InputStreamReader inputstreamreader)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder(8192);
        char ac[] = new char[2048];
        do
        {
            int i = inputstreamreader.read(ac);
            if (i != -1)
            {
                stringbuilder.append(ac, 0, i);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    String zza(String s, Map map)
    {
        int i = s.indexOf("&adurl");
        if (i == -1)
        {
            i = s.indexOf("?adurl");
        }
        Object obj = Uri.parse(s);
        if (zzc(((Uri) (obj))) && i != -1)
        {
            obj = new StringBuilder(s.substring(0, i + 1));
            String s2;
            for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); ((StringBuilder) (obj)).append(s2).append("=").append((String)map.get(s2)).append("&"))
            {
                s2 = (String)iterator1.next();
            }

            return ((StringBuilder) (obj)).append(s.substring(i + 1)).toString();
        }
        s = ((Uri) (obj)).buildUpon();
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            s = s.appendQueryParameter(s1, (String)map.get(s1));
        }

        return s.build().toString();
    }

    public String zza(StackTraceElement astacktraceelement[], String s)
    {
        if (!((Boolean)zzby.zzvc.get()).booleanValue()) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        StackTraceElement stacktraceelement;
        String s1;
        if (i + 1 >= astacktraceelement.length)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        stacktraceelement = astacktraceelement[i];
        s1 = stacktraceelement.getClassName();
        if (!"loadAd".equalsIgnoreCase(stacktraceelement.getMethodName()) || !zzHE.equalsIgnoreCase(s1) && !zzHF.equalsIgnoreCase(s1) && !zzHG.equalsIgnoreCase(s1) && !zzHH.equalsIgnoreCase(s1) && !zzHI.equalsIgnoreCase(s1) && !zzHJ.equalsIgnoreCase(s1)) goto _L4; else goto _L3
_L3:
        astacktraceelement = astacktraceelement[i + 1].getClassName();
_L6:
        if (astacktraceelement != null && !astacktraceelement.contains(s))
        {
            return astacktraceelement;
        }
          goto _L2
_L4:
        i++;
          goto _L5
_L2:
        return null;
        astacktraceelement = null;
          goto _L6
    }

    public ArrayList zza(Context context, List list, String s)
    {
        int i = zzm.zzq(context).zzbp();
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(zza(context, (String)list.next(), s, i))) { }
        return arraylist;
    }

    JSONArray zza(Object aobj[])
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            zza(jsonarray, aobj[i]);
        }

        return jsonarray;
    }

    public void zza(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(ongloballayoutlistener);
        }
    }

    public void zza(Activity activity, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onscrollchangedlistener);
        }
    }

    public void zza(Context context, String s, WebSettings websettings)
    {
        websettings.setUserAgentString(zzf(context, s));
    }

    public void zza(Context context, String s, String s1, Bundle bundle, boolean flag)
    {
        if (flag)
        {
            Context context2 = context.getApplicationContext();
            Context context1 = context2;
            if (context2 == null)
            {
                context1 = context;
            }
            bundle.putString("os", android.os.Build.VERSION.RELEASE);
            bundle.putString("api", String.valueOf(android.os.Build.VERSION.SDK_INT));
            bundle.putString("device", zzp.zzbx().zzgt());
            bundle.putString("js", s);
            bundle.putString("appid", context1.getPackageName());
            bundle.putString("eids", TextUtils.join(",", zzby.zzde()));
        }
        s1 = (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", s1);
        String s2;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); s1.appendQueryParameter(s2, bundle.getString(s2)))
        {
            s2 = (String)iterator.next();
        }

        zzp.zzbx().zzc(context, s, s1.toString());
    }

    public void zza(Context context, String s, List list)
    {
        for (list = list.iterator(); list.hasNext(); (new zzia(context, s, (String)list.next())).zzgn()) { }
    }

    public void zza(Context context, String s, List list, String s1)
    {
        for (list = list.iterator(); list.hasNext(); (new zzia(context, s, (String)list.next(), s1)).zzgn()) { }
    }

    public void zza(Context context, String s, boolean flag, HttpURLConnection httpurlconnection)
    {
        zza(context, s, flag, httpurlconnection, false);
    }

    public void zza(Context context, String s, boolean flag, HttpURLConnection httpurlconnection, String s1)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", s1);
        httpurlconnection.setUseCaches(false);
    }

    public void zza(Context context, String s, boolean flag, HttpURLConnection httpurlconnection, boolean flag1)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", zzf(context, s));
        httpurlconnection.setUseCaches(flag1);
    }

    public boolean zza(PackageManager packagemanager, String s, String s1)
    {
        return packagemanager.checkPermission(s1, s) == 0;
    }

    public boolean zza(ClassLoader classloader, Class class1, String s)
    {
        boolean flag;
        try
        {
            flag = class1.isAssignableFrom(Class.forName(s, false, classloader));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            return false;
        }
        return flag;
    }

    public String zzaw(String s)
    {
        return Uri.parse(s).buildUpon().query(null).build().toString();
    }

    public int zzax(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Could not parse value:").append(s).toString());
            return 0;
        }
        return i;
    }

    public boolean zzay(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return s.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
        }
    }

    public void zzb(Activity activity, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onscrollchangedlistener);
        }
    }

    public void zzb(Context context, String s, String s1, Bundle bundle, boolean flag)
    {
        if (((Boolean)zzby.zzuZ.get()).booleanValue())
        {
            zza(context, s, s1, bundle, flag);
        }
    }

    public boolean zzb(Uri uri)
    {
        return (new zzan(null)).zzb(uri);
    }

    public void zzc(Context context, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s1);
        zza(context, s, arraylist);
    }

    public boolean zzc(Uri uri)
    {
        return (new zzan(null)).zzc(uri);
    }

    public String zzd(Context context, String s, String s1)
    {
        return zza(context, s, s1, zzm.zzq(context).zzbp());
    }

    public Map zze(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = zzp.zzbz().zzf(uri).iterator(); iterator.hasNext(); hashmap.put(s, uri.getQueryParameter(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public String zzf(Context context, String s)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzHj == null)
                {
                    break label0;
                }
                context = zzHj;
            }
            return context;
        }
        try
        {
            zzHj = zzp.zzbz().getDefaultUserAgent(context);
        }
        catch (Exception exception) { }
        if (!TextUtils.isEmpty(zzHj))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (com.google.android.gms.ads.internal.client.zzk.zzcE().zzgI())
        {
            break MISSING_BLOCK_LABEL_136;
        }
        zzHj = null;
        zzHK.post(new Runnable(context) {

            final zzhu zzHN;
            final Context zzrn;

            public void run()
            {
                synchronized (com.google.android.gms.internal.zzhu.zza(zzHN))
                {
                    com.google.android.gms.internal.zzhu.zza(zzHN, zzHN.zzK(zzrn));
                    com.google.android.gms.internal.zzhu.zza(zzHN).notifyAll();
                }
                return;
                exception1;
                obj1;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                zzHN = zzhu.this;
                zzrn = context;
                super();
            }
        });
_L1:
        context = zzHj;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        zzpc.wait();
          goto _L1
        context;
        zzHj = zzgr();
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Interrupted, use default user agent: ").append(zzHj).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        zzHj = zzK(context);
_L2:
        zzHj = (new StringBuilder()).append(zzHj).append(" (Mobile; ").append(s).append(")").toString();
        context = zzHj;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        zzHj = zzgr();
          goto _L2
    }

    public int[] zzg(Activity activity)
    {
        activity = activity.getWindow();
        if (activity != null)
        {
            activity = activity.findViewById(0x1020002);
            if (activity != null)
            {
                return (new int[] {
                    activity.getWidth(), activity.getHeight()
                });
            }
        }
        return zzgu();
    }

    public boolean zzgq()
    {
        return zzHL;
    }

    String zzgr()
    {
        StringBuffer stringbuffer = new StringBuffer(256);
        stringbuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (android.os.Build.VERSION.RELEASE != null)
        {
            stringbuffer.append(" ").append(android.os.Build.VERSION.RELEASE);
        }
        stringbuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null)
        {
            stringbuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null)
            {
                stringbuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringbuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringbuffer.toString();
    }

    public String zzgs()
    {
        Object obj;
        byte abyte0[];
        byte abyte1[];
        int i;
        obj = UUID.randomUUID();
        abyte0 = BigInteger.valueOf(((UUID) (obj)).getLeastSignificantBits()).toByteArray();
        abyte1 = BigInteger.valueOf(((UUID) (obj)).getMostSignificantBits()).toByteArray();
        obj = (new BigInteger(1, abyte0)).toString();
        i = 0;
_L2:
        if (i >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        obj1 = MessageDigest.getInstance("MD5");
        ((MessageDigest) (obj1)).update(abyte0);
        ((MessageDigest) (obj1)).update(abyte1);
        byte abyte2[] = new byte[8];
        System.arraycopy(((MessageDigest) (obj1)).digest(), 0, abyte2, 0, 8);
        obj1 = (new BigInteger(1, abyte2)).toString();
        obj = obj1;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return ((String) (obj));
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
          goto _L3
    }

    public String zzgt()
    {
        String s = Build.MANUFACTURER;
        String s1 = Build.MODEL;
        if (s1.startsWith(s))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s).append(" ").append(s1).toString();
        }
    }

    protected int[] zzgu()
    {
        return (new int[] {
            0, 0
        });
    }

    public int[] zzh(Activity activity)
    {
        int ai[] = zzg(activity);
        return (new int[] {
            com.google.android.gms.ads.internal.client.zzk.zzcE().zzc(activity, ai[0]), com.google.android.gms.ads.internal.client.zzk.zzcE().zzc(activity, ai[1])
        });
    }

    public int[] zzi(Activity activity)
    {
        activity = activity.getWindow();
        if (activity != null)
        {
            activity = activity.findViewById(0x1020002);
            if (activity != null)
            {
                return (new int[] {
                    activity.getTop(), activity.getBottom()
                });
            }
        }
        return zzgu();
    }

    public Bitmap zzj(View view)
    {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    public int[] zzj(Activity activity)
    {
        int ai[] = zzi(activity);
        return (new int[] {
            com.google.android.gms.ads.internal.client.zzk.zzcE().zzc(activity, ai[0]), com.google.android.gms.ads.internal.client.zzk.zzcE().zzc(activity, ai[1])
        });
    }

    public int zzk(Activity activity)
    {
        if (activity == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to get AdActivity type since it is null");
            return 0;
        }
        activity = AdOverlayInfoParcel.zzb(activity.getIntent());
        if (activity == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to get AdOverlayInfo");
            return 0;
        }
        switch (((AdOverlayInfoParcel) (activity)).zzAX)
        {
        default:
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;
        }
    }

    public JSONObject zzx(Map map)
        throws JSONException
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); zza(jsonobject, s, map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new JSONException((new StringBuilder()).append("Could not convert map to JSON: ").append(map.getMessage()).toString());
        }
        return jsonobject;
    }

}
