// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.conversiontracking;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.ads.conversiontracking:
//            f, e, d, g, 
//            c, h

public final class b
{

    private static final Map a = new HashMap();

    public static f a(Uri uri)
    {
        if (uri != null)
        {
            if (!TextUtils.isEmpty(uri = uri.getQueryParameter("referrer")))
            {
                Object obj = Uri.parse((new StringBuilder("http://hostname/?")).append(uri).toString());
                uri = ((Uri) (obj)).getQueryParameter("conv");
                String s = ((Uri) (obj)).getQueryParameter("gclid");
                obj = ((Uri) (obj)).getQueryParameter("ai");
                if (!TextUtils.isEmpty(uri) && !TextUtils.isEmpty(s) && !TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    return new f(uri, new e(s, ((String) (obj))));
                }
            }
        }
        return null;
    }

    private static String a(String s, String s1)
    {
        return s.replace("\\", "\\\\").replace(s1, (new StringBuilder("\\")).append(s1).toString());
    }

    private static String a(boolean flag, String s, Map map)
    {
        if (flag && !TextUtils.isEmpty(s))
        {
            Object obj = map;
            if (map == null)
            {
                obj = new HashMap();
            }
            ((Map) (obj)).put("screen_name", s);
            s = new StringBuilder();
            Object obj1;
            for (map = ((Map) (obj)).entrySet().iterator(); map.hasNext(); s.append(a((new StringBuilder()).append(((String) (obj))).append("=").append(((String) (obj1))).toString(), ";")))
            {
                obj1 = (java.util.Map.Entry)map.next();
                s.append(";");
                obj = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
                obj = a(((String) (obj)), "=");
                obj1 = a(a(((String) (obj1)), ","), "=");
            }

            return (new StringBuilder("&data=")).append(URLEncoder.encode(s.substring(1), "UTF-8")).toString();
        } else
        {
            return "";
        }
    }

    public static void a(Context context, g g1)
    {
        d.a[g.b(g1).ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 94;
           goto _L1 _L2
_L1:
        Object obj = "google_nonrepeatable_conversion";
_L3:
        obj = context.getSharedPreferences(((String) (obj)), 0).edit();
        switch (d.a[g.b(g1).ordinal()])
        {
        default:
            context = g.h(g1);
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_100;
        }
_L4:
        ((android.content.SharedPreferences.Editor) (obj)).putBoolean(context, true);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        return;
_L2:
        obj = "doubleclick_nonrepeatable_conversion";
          goto _L3
        context = g.c(g1);
          goto _L4
    }

    public static boolean a(Context context, f f1)
    {
        SharedPreferences sharedpreferences;
        if (f1 != null)
        {
            if ((sharedpreferences = context.getSharedPreferences("google_conversion_click_referrer", 0)).getAll().size() != 100)
            {
                String s = (new StringBuilder()).append(e.a(f.a(f1))).append(" ").append(e.b(f.a(f1))).toString();
                synchronized (a)
                {
                    a.put(f.b(f1), s);
                }
                (new Thread(new c(sharedpreferences, f1, s))).start();
                return true;
            }
        }
        return false;
    }

    public static String b(Context context, g g1)
    {
        Object obj;
        String s2;
        s2 = context.getPackageName();
        obj = "";
        String s = context.getPackageManager().getPackageInfo(s2, 0).versionName;
        obj = s;
_L2:
        String s3;
        Object obj1 = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        context = ((Context) (obj1));
        if (obj1 == null)
        {
            context = "null";
        }
        obj1 = MessageDigest.getInstance("MD5");
        ((MessageDigest) (obj1)).update(context.getBytes());
        s3 = h.a(((MessageDigest) (obj1)).digest(), false);
        if (!g.a(g1) && g.b(g1) == GoogleConversionPing.ConversionType.DOUBLECLICK_CONVERSION)
        {
            return (new StringBuilder("http://pubads.g.doubleclick.net/activity;xsp=")).append(g.c(g1)).append(";ait").append("=1").append(";isu").append("=").append(s3).append(";bundleid").append("=").append(s2).append(";appversion").append("=").append(((String) (obj))).append(";osversion").append("=").append(android.os.Build.VERSION.RELEASE).append(";sdkversion").append("=ct-sdk-a-v1.1.0").append(";timestamp").append("=").append(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).toString();
        }
        break; /* Loop/switch isn't completed */
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.w("GoogleConversionPing", "Error to retrieve app version", namenotfoundexception);
        if (true) goto _L2; else goto _L1
_L1:
        String s1 = a(g.a(g1), g.d(g1), g.e(g1));
        context = g.f(g1);
        if (context != null)
        {
            context = (new StringBuilder("&gclid=")).append(e.a(context)).append("&ai").append("=").append(e.b(context)).toString();
        } else
        {
            context = "";
        }
        obj = Uri.parse("http://www.googleadservices.com/pagead/conversion/").buildUpon().appendEncodedPath((new StringBuilder()).append(g.c(g1)).append("/").toString()).appendQueryParameter("label", g.h(g1)).appendQueryParameter("value", g.g(g1)).appendQueryParameter("muid", s3).appendQueryParameter("bundleid", s2).appendQueryParameter("appversion", ((String) (obj))).appendQueryParameter("osversion", android.os.Build.VERSION.RELEASE).appendQueryParameter("sdkversion", "ct-sdk-a-v1.1.0");
        if (g.a(g1))
        {
            g1 = "1";
        } else
        {
            g1 = "0";
        }
        g1 = ((android.net.Uri.Builder) (obj)).appendQueryParameter("remarketing_only", g1).appendQueryParameter("timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())));
        return (new StringBuilder()).append(g1.build()).append(s1).append(context).toString();
    }

}
