// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Handler;
import android.os.Message;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            ai, an, c, aj, 
//            ae

public final class ah extends ai
{

    private String a;
    private List b;
    private List c;
    private Handler d;
    private boolean e;
    private SSLSocketFactory f;

    public ah(String s, List list, Handler handler, boolean flag, SSLSocketFactory sslsocketfactory)
    {
        a = s;
        b = list;
        c = new ArrayList();
        d = handler;
        e = flag;
        f = sslsocketfactory;
    }

    public final void run()
    {
        Object obj2;
        String s;
        s = null;
        obj2 = null;
        if (d == null)
        {
            return;
        }
        d.sendMessage(Message.obtain(d, 0, a));
        if (!e)
        {
            c.add(new BasicNameValuePair("CLIENT-AUTH", "No cert"));
        }
        c.add(new BasicNameValuePair("X-PAYPAL-RESPONSE-DATA-FORMAT", "NV"));
        c.add(new BasicNameValuePair("X-PAYPAL-REQUEST-DATA-FORMAT", "NV"));
        c.add(new BasicNameValuePair("X-PAYPAL-SERVICE-VERSION", "1.0.0"));
        if (!e) goto _L2; else goto _L1
_L1:
        Object obj = new DefaultHttpClient();
        ((HttpClient) (obj)).getConnectionManager().getSchemeRegistry().register(new Scheme("https", new an(), 443));
_L4:
        Object obj1;
        HttpConnectionParams.setSoTimeout(((HttpClient) (obj)).getParams(), 10000);
        HttpConnectionParams.setConnectionTimeout(((HttpClient) (obj)).getParams(), 10000);
        obj1 = new HttpPost(a);
        NameValuePair namevaluepair;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((HttpPost) (obj1)).addHeader(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)iterator.next();
        }

          goto _L3
        obj1;
_L9:
        d.sendMessage(Message.obtain(d, 1, obj1));
        com.paypal.android.sdk.onetouch.core.c.a(((java.io.Closeable) (obj2)));
        if (obj != null)
        {
            ((HttpClient) (obj)).getConnectionManager().shutdown();
        }
        aj.a().b(this);
        return;
_L2:
        obj = new SchemeRegistry();
        ((SchemeRegistry) (obj)).register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_447;
        }
        ((SchemeRegistry) (obj)).register(new Scheme("https", new ae(), 443));
_L5:
        obj1 = new BasicHttpParams();
        ((HttpParams) (obj1)).setParameter("http.conn-manager.max-total", Integer.valueOf(30));
        ((HttpParams) (obj1)).setParameter("http.conn-manager.max-per-route", new ConnPerRouteBean(30));
        ((HttpParams) (obj1)).setParameter("http.protocol.expect-continue", Boolean.valueOf(false));
        HttpProtocolParams.setVersion(((HttpParams) (obj1)), HttpVersion.HTTP_1_1);
        obj = new DefaultHttpClient(new ThreadSafeClientConnManager(((HttpParams) (obj1)), ((SchemeRegistry) (obj))), ((HttpParams) (obj1)));
          goto _L4
        ((SchemeRegistry) (obj)).register(new Scheme("https", f, 443));
          goto _L5
        obj1;
        obj = null;
        obj2 = s;
_L8:
        com.paypal.android.sdk.onetouch.core.c.a(((java.io.Closeable) (obj2)));
        if (obj != null)
        {
            ((HttpClient) (obj)).getConnectionManager().shutdown();
        }
        aj.a().b(this);
        throw obj1;
_L3:
        ((HttpPost) (obj1)).setEntity(new UrlEncodedFormEntity(b, "UTF-8"));
        obj1 = new BufferedReader(new InputStreamReader(((HttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj1))).getEntity().getContent(), "UTF-8"));
        obj2 = new StringBuilder();
_L6:
        s = ((BufferedReader) (obj1)).readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        ((StringBuilder) (obj2)).append(s);
          goto _L6
        d.sendMessage(Message.obtain(d, 2, ((StringBuilder) (obj2)).toString()));
        com.paypal.android.sdk.onetouch.core.c.a(((java.io.Closeable) (obj1)));
        ((HttpClient) (obj)).getConnectionManager().shutdown();
        aj.a().b(this);
        return;
        obj1;
        obj2 = s;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj2 = s;
        continue; /* Loop/switch isn't completed */
        Object obj3;
        obj3;
        obj2 = obj1;
        obj1 = obj3;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
        obj1;
          goto _L9
        obj1;
        obj = null;
          goto _L9
        obj3;
        obj2 = obj1;
        obj1 = obj3;
          goto _L9
    }
}
