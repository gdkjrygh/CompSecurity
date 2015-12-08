// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.ads.a:
//            s, p, t, o, 
//            m, n, c, ag, 
//            a

public class j
{

    private static final String a = com/facebook/ads/a/j.getSimpleName();
    private final Context b;
    private final String c;
    private final AdSize d;
    private final n e;
    private final String f;
    private final int g;
    private final b h;
    private final o i;
    private final boolean j;

    public j(Context context, String s1, AdSize adsize, n n1, o o1, int k, boolean flag, 
            b b1)
    {
        if (s1 == null || s1.length() < 1)
        {
            throw new IllegalArgumentException("placementId");
        }
        if (adsize == null)
        {
            throw new IllegalArgumentException("adSize");
        }
        if (b1 == null)
        {
            throw new IllegalArgumentException("callback");
        } else
        {
            b = context;
            c = s1;
            d = adsize;
            e = n1;
            f = s.a(context, o1);
            i = o1;
            g = k;
            j = flag;
            h = b1;
            return;
        }
    }

    private a a(InputStream inputstream)
    {
        a a1 = new a(null);
        inputstream = ((InputStream) ((new JSONTokener(p.a(inputstream))).nextValue()));
        if (inputstream instanceof JSONObject)
        {
            inputstream = (JSONObject)inputstream;
            if (!inputstream.has("error"))
            {
                break MISSING_BLOCK_LABEL_95;
            }
            a1.b = new AdError(2000, ((JSONObject)p.a(inputstream, "error")).optString("message", AdError.SERVER_ERROR.getErrorMessage()));
        }
_L1:
        if (a1.a == null && a1.b == null)
        {
            return null;
        } else
        {
            return a1;
        }
        try
        {
            a1.a = inputstream;
            a1.b = null;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            a1.b = new AdError(2000, inputstream.getMessage());
        }
          goto _L1
    }

    static b a(j j1)
    {
        return j1.h;
    }

    private void a(Map map)
    {
        map.put("os", "Android");
        map.put("os_version", android.os.Build.VERSION.RELEASE);
        Object obj = b.getResources().getDisplayMetrics();
        int k = (int)((float)((DisplayMetrics) (obj)).widthPixels / ((DisplayMetrics) (obj)).density);
        int l = (int)((float)((DisplayMetrics) (obj)).heightPixels / ((DisplayMetrics) (obj)).density);
        map.put("screen_width", Integer.valueOf(k));
        map.put("screen_height", Integer.valueOf(l));
        Locale locale;
        try
        {
            obj = b.getPackageManager().getPackageInfo(b.getPackageName(), 0);
            map.put("app_build", Integer.valueOf(((PackageInfo) (obj)).versionCode));
            map.put("app_version", ((PackageInfo) (obj)).versionName);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            map.put("app_version", Integer.valueOf(0));
        }
        locale = b.getResources().getConfiguration().locale;
        obj = locale;
        if (locale == null)
        {
            obj = Locale.getDefault();
        }
        map.put("locale", ((Locale) (obj)).toString());
    }

    private void a(Map map, p.a a1)
    {
        boolean flag = true;
        a1 = t.a(b, a1);
        if (a1 == null)
        {
            map.put("tracking_enabled", Boolean.valueOf(true));
        } else
        {
            if (a1.b())
            {
                flag = false;
            }
            map.put("tracking_enabled", Boolean.valueOf(flag));
            if (!a1.b())
            {
                map.put("device_id", a1.a());
                return;
            }
        }
    }

    static Context b(j j1)
    {
        return j1.b;
    }

    private void b(Map map)
    {
        map.put("package_name", b.getPackageName());
    }

    private String c()
    {
        switch (_cls2.a[i.ordinal()])
        {
        default:
            return "network_ads";

        case 1: // '\001'
            return "network_ads_native";
        }
    }

    private String c(Map map)
    {
        StringBuilder stringbuilder = new StringBuilder(512);
        map = map.entrySet().iterator();
        boolean flag = true;
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append("&");
            }
            stringbuilder.append(URLEncoder.encode((String)entry.getKey(), "utf-8")).append("=").append(URLEncoder.encode(String.valueOf(entry.getValue()), "utf-8"));
        }
        return stringbuilder.toString();
    }

    private Map d()
    {
        HashMap hashmap = new HashMap();
        p.a a1 = p.a(b.getContentResolver());
        hashmap.put("ad_type", Integer.valueOf(i.a()));
        hashmap.put("sdk_capabilities", m.b());
        hashmap.put("sdk_version", "3.22.0");
        hashmap.put("placement_id", c);
        hashmap.put("attribution_id", a1.a);
        hashmap.put("width", Integer.valueOf(d.getWidth()));
        hashmap.put("height", Integer.valueOf(d.getHeight()));
        hashmap.put("template_id", Integer.valueOf(e.a()));
        hashmap.put("test_mode", Boolean.valueOf(j));
        hashmap.put("child_directed", Boolean.valueOf(AdSettings.isChildDirected()));
        hashmap.put("events", com.facebook.ads.a.c.a());
        hashmap.put("num_ads_requested", Integer.valueOf(g));
        a(hashmap);
        b(hashmap);
        a(hashmap, a1);
        return hashmap;
    }

    private URL e()
    {
        String s1 = AdSettings.getUrlPrefix();
        if (ag.a(s1))
        {
            s1 = "https://graph.facebook.com";
        } else
        {
            s1 = String.format("http://graph.%s.facebook.com", new Object[] {
                s1
            });
        }
        return new URL(String.format("%s/%s", new Object[] {
            s1, c()
        }));
    }

    private HttpURLConnection f()
    {
        HttpURLConnection httpurlconnection = (HttpURLConnection)e().openConnection();
        httpurlconnection.setRequestProperty("User-Agent", f);
        httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpurlconnection.setRequestMethod("POST");
        httpurlconnection.setDoOutput(true);
        httpurlconnection.setConnectTimeout(30000);
        httpurlconnection.setReadTimeout(30000);
        String s1 = c(d());
        BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(httpurlconnection.getOutputStream());
        BufferedWriter bufferedwriter = new BufferedWriter(new OutputStreamWriter(bufferedoutputstream, "utf-8"));
        bufferedwriter.write(s1);
        bufferedwriter.flush();
        bufferedwriter.close();
        bufferedoutputstream.close();
        httpurlconnection.connect();
        return httpurlconnection;
    }

    public AsyncTask a()
    {
        com.facebook.ads.a.a.a(b);
        return (new _cls1()).execute(new Void[0]);
    }

    public a b()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj2 = null;
        obj3 = null;
        obj1 = null;
        obj4 = null;
        obj = null;
        Object obj5 = f();
        obj = obj5;
        obj3 = obj4;
        if (((HttpURLConnection) (obj)).getResponseCode() < 400) goto _L2; else goto _L1
_L1:
        obj3 = obj4;
        obj1 = ((HttpURLConnection) (obj)).getErrorStream();
_L3:
        obj2 = obj;
        obj4 = obj1;
        obj3 = obj1;
        obj5 = a(((InputStream) (obj1)));
        obj2 = obj5;
        p.a(((java.io.Closeable) (obj1)));
        obj1 = obj2;
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            obj1 = obj2;
        }
_L5:
        return ((a) (obj1));
_L2:
        obj3 = obj4;
        obj1 = ((HttpURLConnection) (obj)).getInputStream();
          goto _L3
        obj4;
        obj1 = null;
_L12:
        obj3 = obj;
        obj2 = obj1;
        obj5 = new a(null);
        obj3 = obj;
        obj2 = obj1;
        obj5.b = new AdError(1000, ((SocketTimeoutException) (obj4)).getMessage());
        p.a(((java.io.Closeable) (obj1)));
        obj1 = obj5;
        if (obj == null) goto _L5; else goto _L4
_L4:
        ((HttpURLConnection) (obj)).disconnect();
        return ((a) (obj5));
        obj4;
        obj1 = null;
        obj = obj2;
_L11:
        obj3 = obj;
        obj2 = obj1;
        obj5 = new a(null);
        obj3 = obj;
        obj2 = obj1;
        obj5.b = new AdError(1000, ((IOException) (obj4)).getMessage());
        p.a(((java.io.Closeable) (obj1)));
        obj1 = obj5;
        if (obj == null) goto _L5; else goto _L6
_L6:
        ((HttpURLConnection) (obj)).disconnect();
        return ((a) (obj5));
        obj1;
        obj = null;
_L10:
        obj2 = obj;
        obj4 = obj3;
        Log.e(a, "Unexpected error", ((Throwable) (obj1)));
        obj2 = obj;
        obj4 = obj3;
        obj5 = new a(null);
        obj2 = obj;
        obj4 = obj3;
        obj5.b = AdError.INTERNAL_ERROR;
        p.a(((java.io.Closeable) (obj3)));
        obj1 = obj5;
        if (obj == null) goto _L5; else goto _L7
_L7:
        ((HttpURLConnection) (obj)).disconnect();
        return ((a) (obj5));
        obj;
        obj2 = null;
_L9:
        p.a(((java.io.Closeable) (obj2)));
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        throw obj;
        obj3;
        obj2 = null;
        obj1 = obj;
        obj = obj3;
        continue; /* Loop/switch isn't completed */
        obj;
        obj1 = obj2;
        obj2 = obj4;
        continue; /* Loop/switch isn't completed */
        obj;
        obj1 = obj3;
        if (true) goto _L9; else goto _L8
_L8:
        obj1;
          goto _L10
        obj4;
        obj1 = null;
          goto _L11
        obj4;
          goto _L11
        obj4;
        obj1 = null;
          goto _L12
        obj4;
          goto _L12
    }


    private class a
    {

        JSONObject a;
        AdError b;

        private a()
        {
            a = null;
            b = null;
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls2
    {

        static final int a[];

        static 
        {
            a = new int[o.values().length];
            try
            {
                a[o.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[o.a.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1 extends AsyncTask
    {

        final j a;

        protected transient a a(Void avoid[])
        {
            return a.b();
        }

        protected void a(a a1)
        {
            if (a1 == null)
            {
                j.a(a).a(AdError.INTERNAL_ERROR);
                return;
            }
            if (a1.b != null)
            {
                j.a(a).a(a1.b);
                return;
            } else
            {
                a1 = l.a(j.b(a), a1.a);
                j.a(a).a(a1);
                return;
            }
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((a)obj);
        }

        _cls1()
        {
            a = j.this;
            super();
        }

        private class b
        {

            public abstract void a(AdError aderror);

            public abstract void a(l l1);
        }

    }

}
