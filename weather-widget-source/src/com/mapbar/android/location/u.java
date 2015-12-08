// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.mapbar.android.location:
//            s, g, p, l

public final class u
{

    private static StringBuffer k = null;
    private Context a;
    private s b;
    private ConnectivityManager c;
    private int d;
    private int e;
    private String f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private String l;

    public u(Context context, int i1, int j1)
    {
        d = 0;
        e = 0;
        f = "";
        g = 0;
        i = false;
        j = false;
        l = "10.0.0.172";
        a = context;
        d = 3;
        e = 0;
        b = s.a(context);
        c = b.a;
    }

    private String b()
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        s2 = "";
        s1 = s2;
        PackageInfo packageinfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
        s1 = s2;
        s2 = URLEncoder.encode(packageinfo.applicationInfo.loadLabel(a.getPackageManager()).toString(), "utf-8");
        s1 = s2;
        s2 = (new StringBuilder()).append(s2).append("_").append(packageinfo.versionName).toString();
        s1 = s2;
_L4:
        StringBuffer stringbuffer = new StringBuffer();
        k = stringbuffer;
        stringbuffer.append("Android_CellLocation_").append(g.a).append("_").append((new StringBuilder()).append(p.b(a.getPackageName())).append("@").append(s1).toString()).append(";").append(l.a).append(";").append(l.b).append(";").append(Build.BRAND).append(";").append(Build.MODEL).append(";").append(android.os.Build.VERSION.SDK);
_L2:
        s1 = k.toString();
        return s1;
        Exception exception;
        exception;
        return "";
        Exception exception1;
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private byte[] b(String s1)
    {
        DefaultHttpClient defaulthttpclient;
        defaulthttpclient = new DefaultHttpClient();
        Object obj;
        byte abyte0[];
        int i1;
        if (e == 0)
        {
            s1 = new HttpPost(s1);
        } else
        {
            s1 = new HttpGet(s1);
        }
        if (i)
        {
            org.apache.http.params.HttpParams httpparams = defaulthttpclient.getParams();
            ConnRouteParams.setDefaultProxy(httpparams, new HttpHost(l, 80));
            s1.setParams(httpparams);
        }
        obj = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 20000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 20000);
        s1.setParams(((org.apache.http.params.HttpParams) (obj)));
        obj = com.mapbar.android.location.l.a(a);
        if (obj != null && ((String) (obj)).trim().length() > 0)
        {
            s1.addHeader("maptag", ((String) (obj)));
        }
        s1.addHeader("IMEI", l.a);
        s1.setHeader("User-Agent", b());
        s1.addHeader("s_n", b());
        i1 = e;
        obj = defaulthttpclient.execute(s1);
        h = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (h != 200)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        abyte0 = EntityUtils.toByteArray(((HttpResponse) (obj)).getEntity());
        defaulthttpclient.getConnectionManager().shutdown();
        return abyte0;
        defaulthttpclient.getConnectionManager().shutdown();
_L1:
        return null;
        Object obj1;
        obj1;
        h = 413;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        obj1;
        h = 400;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        obj1;
        h = 502;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        obj1;
        h = 503;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        s1;
        defaulthttpclient.getConnectionManager().shutdown();
        throw s1;
    }

    private String c(String s1)
    {
        DefaultHttpClient defaulthttpclient;
        defaulthttpclient = new DefaultHttpClient();
        Object obj;
        int i1;
        if (e == 0)
        {
            s1 = new HttpPost(s1);
        } else
        {
            s1 = new HttpGet(s1);
        }
        if (i)
        {
            org.apache.http.params.HttpParams httpparams = defaulthttpclient.getParams();
            ConnRouteParams.setDefaultProxy(httpparams, new HttpHost(l, 80));
            s1.setParams(httpparams);
        }
        obj = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 20000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 20000);
        s1.setParams(((org.apache.http.params.HttpParams) (obj)));
        obj = com.mapbar.android.location.l.a(a);
        if (obj != null && ((String) (obj)).trim().length() > 0)
        {
            s1.addHeader("maptag", ((String) (obj)));
        }
        s1.addHeader("IMEI", l.a);
        s1.setHeader("User-Agent", b());
        s1.addHeader("s_n", b());
        i1 = e;
        obj = defaulthttpclient.execute(s1);
        h = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (h != 200)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        obj = EntityUtils.toString(((HttpResponse) (obj)).getEntity(), "utf-8");
        defaulthttpclient.getConnectionManager().shutdown();
        return ((String) (obj));
        defaulthttpclient.getConnectionManager().shutdown();
_L1:
        return null;
        Object obj1;
        obj1;
        h = 413;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        obj1;
        h = 400;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        obj1;
        h = 502;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        obj1;
        h = 503;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        s1;
        defaulthttpclient.getConnectionManager().shutdown();
        throw s1;
    }

    private InputStream d(String s1)
    {
        DefaultHttpClient defaulthttpclient;
        defaulthttpclient = new DefaultHttpClient();
        Object obj;
        int i1;
        if (e == 0)
        {
            s1 = new HttpPost(s1);
        } else
        {
            s1 = new HttpGet(s1);
        }
        if (i)
        {
            org.apache.http.params.HttpParams httpparams = defaulthttpclient.getParams();
            ConnRouteParams.setDefaultProxy(httpparams, new HttpHost(l, 80));
            s1.setParams(httpparams);
        }
        obj = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 20000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 20000);
        s1.setParams(((org.apache.http.params.HttpParams) (obj)));
        obj = com.mapbar.android.location.l.a(a);
        if (obj != null && ((String) (obj)).trim().length() > 0)
        {
            s1.addHeader("maptag", ((String) (obj)));
        }
        s1.addHeader("IMEI", l.a);
        s1.setHeader("User-Agent", b());
        s1.addHeader("s_n", b());
        i1 = e;
        obj = defaulthttpclient.execute(s1);
        h = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (h != 200)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        obj = ((HttpResponse) (obj)).getEntity().getContent();
        defaulthttpclient.getConnectionManager().shutdown();
        return ((InputStream) (obj));
        defaulthttpclient.getConnectionManager().shutdown();
_L1:
        return null;
        Object obj1;
        obj1;
        h = 413;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        obj1;
        h = 400;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        obj1;
        h = 502;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        obj1;
        h = 503;
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L1
        s1;
        defaulthttpclient.getConnectionManager().shutdown();
        throw s1;
    }

    public final Object a()
    {
        Object obj = c.getActiveNetworkInfo();
        if (obj != null)
        {
            int i1 = ((NetworkInfo) (obj)).getType();
            if (i1 != 1 && i1 == 0)
            {
                obj = ((NetworkInfo) (obj)).getExtraInfo();
                if (obj != null)
                {
                    obj = ((String) (obj)).toLowerCase();
                    if (((String) (obj)).indexOf("cmwap") != -1)
                    {
                        i = true;
                    } else
                    if (((String) (obj)).indexOf("ctwap") != -1)
                    {
                        i = true;
                        l = "10.0.0.200";
                    } else
                    if (((String) (obj)).indexOf("3gwap") != -1)
                    {
                        i = true;
                    }
                }
            }
        }
        switch (d)
        {
        case 2: // '\002'
        default:
            return null;

        case 0: // '\0'
            return b(f);

        case 1: // '\001'
            return d(f);

        case 3: // '\003'
            return c(f);
        }
    }

    public final void a(String s1)
    {
        f = s1;
    }

}
