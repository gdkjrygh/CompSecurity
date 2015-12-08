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
import android.telephony.TelephonyManager;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import org.apache.http.Header;
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
//            q, s, l, g, 
//            p, i

public final class t extends q
{

    private static StringBuffer l = null;
    private Context a;
    private s b;
    private ConnectivityManager c;
    private int d;
    private int e;
    private String f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private String m;
    private b.e n;
    private b.f o;

    public t(Context context, int i1, int j1)
    {
        d = 0;
        e = 0;
        f = "";
        h = 0;
        j = false;
        k = false;
        m = "10.0.0.172";
        a = context;
        d = 3;
        e = 0;
        b = s.a(context);
        c = b.a;
    }

    private byte[] b(String s1)
    {
        DefaultHttpClient defaulthttpclient;
        int i1;
        boolean flag1 = false;
        defaulthttpclient = new DefaultHttpClient();
        Object obj;
        byte abyte0[];
        Header aheader[];
        String s2;
        boolean flag;
        int j1;
        if (e == 0)
        {
            s1 = new HttpPost(s1);
        } else
        {
            s1 = new HttpGet(s1);
        }
        if (j)
        {
            org.apache.http.params.HttpParams httpparams = defaulthttpclient.getParams();
            ConnRouteParams.setDefaultProxy(httpparams, new HttpHost(m, 80));
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
        s1.setHeader("User-Agent", f());
        s1.addHeader("s_n", f());
        i1 = e;
        obj = defaulthttpclient.execute(s1);
        aheader = ((HttpResponse) (obj)).getHeaders("Server");
        flag = flag1;
        if (aheader == null) goto _L2; else goto _L1
_L1:
        j1 = aheader.length;
        i1 = 0;
_L8:
        flag = flag1;
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        s2 = aheader[i1].getValue();
        if (s2 == null) goto _L5; else goto _L4
_L4:
        if (!"mapbarserver".equals(s2.toLowerCase())) goto _L5; else goto _L6
_L6:
        flag = true;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (o != null)
        {
            o.a(this, i);
        }
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        abyte0 = EntityUtils.toByteArray(((HttpResponse) (obj)).getEntity());
        defaulthttpclient.getConnectionManager().shutdown();
        return abyte0;
_L5:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
        if (o != null)
        {
            o.a(this, 401);
        }
        defaulthttpclient.getConnectionManager().shutdown();
_L9:
        return null;
        Object obj1;
        obj1;
        if (o != null)
        {
            o.a(this, 413);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        obj1;
        if (o != null)
        {
            o.a(this, 400);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        obj1;
        if (o != null)
        {
            o.a(this, 500);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        obj1;
        if (o != null)
        {
            o.a(this, 503);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        s1;
        defaulthttpclient.getConnectionManager().shutdown();
        throw s1;
    }

    private String c(String s1)
    {
        DefaultHttpClient defaulthttpclient;
        int i1;
        boolean flag1 = false;
        defaulthttpclient = new DefaultHttpClient();
        Object obj;
        Header aheader[];
        String s2;
        boolean flag;
        int j1;
        if (e == 0)
        {
            s1 = new HttpPost(s1);
        } else
        {
            s1 = new HttpGet(s1);
        }
        if (j)
        {
            org.apache.http.params.HttpParams httpparams = defaulthttpclient.getParams();
            ConnRouteParams.setDefaultProxy(httpparams, new HttpHost(m, 80));
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
        s1.setHeader("User-Agent", f());
        s1.addHeader("s_n", f());
        i1 = e;
        obj = defaulthttpclient.execute(s1);
        aheader = ((HttpResponse) (obj)).getHeaders("Server");
        flag = flag1;
        if (aheader == null) goto _L2; else goto _L1
_L1:
        j1 = aheader.length;
        i1 = 0;
_L8:
        flag = flag1;
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        s2 = aheader[i1].getValue();
        if (s2 == null) goto _L5; else goto _L4
_L4:
        if (!"mapbarserver".equals(s2.toLowerCase())) goto _L5; else goto _L6
_L6:
        flag = true;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (o != null)
        {
            o.a(this, i);
        }
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        obj = EntityUtils.toString(((HttpResponse) (obj)).getEntity(), "utf-8");
        defaulthttpclient.getConnectionManager().shutdown();
        return ((String) (obj));
_L5:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
        if (o != null)
        {
            o.a(this, 401);
        }
        defaulthttpclient.getConnectionManager().shutdown();
_L9:
        return null;
        Object obj1;
        obj1;
        if (o != null)
        {
            o.a(this, 413);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        obj1;
        if (o != null)
        {
            o.a(this, 400);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        obj1;
        if (o != null)
        {
            o.a(this, 500);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        obj1;
        if (o != null)
        {
            o.a(this, 503);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        s1;
        defaulthttpclient.getConnectionManager().shutdown();
        throw s1;
    }

    private InputStream d(String s1)
    {
        DefaultHttpClient defaulthttpclient;
        int i1;
        boolean flag1 = false;
        defaulthttpclient = new DefaultHttpClient();
        Object obj;
        Header aheader[];
        String s2;
        boolean flag;
        int j1;
        if (e == 0)
        {
            s1 = new HttpPost(s1);
        } else
        {
            s1 = new HttpGet(s1);
        }
        if (j)
        {
            org.apache.http.params.HttpParams httpparams = defaulthttpclient.getParams();
            ConnRouteParams.setDefaultProxy(httpparams, new HttpHost(m, 80));
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
        s1.setHeader("User-Agent", f());
        s1.addHeader("s_n", f());
        i1 = e;
        obj = defaulthttpclient.execute(s1);
        aheader = ((HttpResponse) (obj)).getHeaders("Server");
        flag = flag1;
        if (aheader == null) goto _L2; else goto _L1
_L1:
        j1 = aheader.length;
        i1 = 0;
_L8:
        flag = flag1;
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        s2 = aheader[i1].getValue();
        if (s2 == null) goto _L5; else goto _L4
_L4:
        if (!"mapbarserver".equals(s2.toLowerCase())) goto _L5; else goto _L6
_L6:
        flag = true;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (o != null)
        {
            o.a(this, i);
        }
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        obj = ((HttpResponse) (obj)).getEntity().getContent();
        defaulthttpclient.getConnectionManager().shutdown();
        return ((InputStream) (obj));
_L5:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
        if (o != null)
        {
            o.a(this, 401);
        }
        defaulthttpclient.getConnectionManager().shutdown();
_L9:
        return null;
        Object obj1;
        obj1;
        if (o != null)
        {
            o.a(this, 413);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        obj1;
        if (o != null)
        {
            o.a(this, 400);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        obj1;
        if (o != null)
        {
            o.a(this, 500);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        obj1;
        if (o != null)
        {
            o.a(this, 503);
        }
        s1.abort();
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L9
        s1;
        defaulthttpclient.getConnectionManager().shutdown();
        throw s1;
    }

    private String f()
    {
        boolean flag = false;
        if (l == null) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        Exception exception1;
        PackageInfo packageinfo;
        if (l.a == null || l.a.trim().length() == 0 || "000000000000001".equals(l.a))
        {
            flag = true;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        g();
          goto _L4
_L2:
        s2 = "";
        s1 = s2;
        packageinfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
        s1 = s2;
        s2 = URLEncoder.encode(packageinfo.applicationInfo.loadLabel(a.getPackageManager()).toString(), "utf-8");
        s1 = s2;
        s2 = (new StringBuilder()).append(s2).append("_").append(packageinfo.versionName).toString();
        s1 = s2;
_L5:
        try
        {
            StringBuffer stringbuffer = new StringBuffer();
            l = stringbuffer;
            stringbuffer.append("Android_CellLocation_").append(g.a).append("_").append((new StringBuilder()).append(p.b(a.getPackageName())).append("@").append(s1).toString()).append(";").append(l.a).append(";").append(l.b).append(";").append(Build.BRAND).append(";").append(Build.MODEL).append(";").append(android.os.Build.VERSION.SDK);
        }
        catch (Exception exception) { }
_L6:
        return l.toString();
        exception1;
          goto _L5
_L4:
        if (!flag) goto _L6; else goto _L2
    }

    private void g()
    {
        try
        {
            TelephonyManager telephonymanager = (TelephonyManager)a.getSystemService("phone");
            l.a = telephonymanager.getDeviceId();
            l.b = telephonymanager.getSimSerialNumber();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public final transient Object a()
    {
        Object obj;
        obj = c.getActiveNetworkInfo();
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
                        j = true;
                    } else
                    if (((String) (obj)).indexOf("ctwap") != -1)
                    {
                        j = true;
                        m = "10.0.0.200";
                    } else
                    if (((String) (obj)).indexOf("3gwap") != -1)
                    {
                        j = true;
                    }
                }
            }
        }
        com.mapbar.android.location.i.a("HttpHander", f);
        d;
        JVM INSTR tableswitch 0 3: default 100
    //                   0 207
    //                   1 219
    //                   2 100
    //                   3 231;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        obj = null;
_L6:
        com.mapbar.android.location.i.a("HttpHander", (new StringBuilder()).append("mStatusCode=").append(i).append("; ").append(f).toString());
        if (n != null)
        {
            n.a(this, obj);
        }
        return null;
_L2:
        obj = b(f);
        continue; /* Loop/switch isn't completed */
_L3:
        obj = d(f);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = c(f);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(int i1)
    {
        g = i1;
    }

    public final void a(b.e e1)
    {
        n = e1;
    }

    public final void a(b.f f1)
    {
        o = f1;
    }

    public final void a(String s1)
    {
        f = s1;
    }

    public final int e()
    {
        return g;
    }

}
