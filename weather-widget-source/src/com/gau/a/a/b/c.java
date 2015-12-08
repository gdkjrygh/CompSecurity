// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.b;

import android.content.Context;
import com.gau.a.a.d.a;
import com.gau.a.a.e;
import com.gau.a.a.f;
import com.gau.a.a.f.b;
import com.gau.a.a.g;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.gau.a.a.b:
//            a

public class c extends com.gau.a.a.b.a
    implements Runnable
{

    private Thread e;
    private int f;

    public c(a a1, e e1, Context context)
    {
        super(a1, e1, context);
        f = 0;
    }

    private URI a(a a1)
    {
        while (a1 == null || a1.b() == null || f >= a1.b().size()) 
        {
            return null;
        }
        return (URI)a1.b().get(f);
    }

    private void a(HttpClient httpclient)
    {
        int i = com.gau.a.a.f.c.b(c);
        if (2 == i)
        {
            HttpHost httphost = com.gau.a.a.f.c.a(c);
            httpclient.getParams().setParameter("http.route.default-proxy", httphost);
        } else
        if (i == -1)
        {
            throw new IllegalAccessException();
        }
        httpclient.getParams().setParameter("http.socket.timeout", Integer.valueOf(a.h()));
        httpclient.getParams().setParameter("http.connection.timeout", Integer.valueOf(a.g()));
    }

    private void a(HttpRequestBase httprequestbase)
    {
        List list = a.o();
        if (list != null)
        {
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                httprequestbase.addHeader((Header)list.get(i));
            }

        }
    }

    private void a(DefaultHttpClient defaulthttpclient)
    {
        if (defaulthttpclient != null)
        {
            com.gau.a.a.f.b.c("shutDown client ", null);
            defaulthttpclient.getConnectionManager().shutdown();
        }
    }

    private com.gau.a.a.e.b b(a a1)
    {
        DefaultHttpClient defaulthttpclient;
        f f1;
        long l1;
        com.gau.a.a.f.b.a((new StringBuilder()).append("StartConnect url= ").append(a1.j()).toString(), null);
        com.gau.a.a.f.b.a((new StringBuilder()).append("testBattery, Begin HttpConnector connectSynchronous url = ").append(a1.j()).toString(), null);
        defaulthttpclient = new DefaultHttpClient();
        l1 = System.currentTimeMillis();
        f1 = a1.r();
        Object obj1 = a(a1);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        throw new g(6);
        Object obj;
        obj;
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        f1.a(((Exception) (obj)), null, null);
        int i = a1.f();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_848;
        }
        a1.a(i - 1);
        obj = b(a1);
_L23:
        a(defaulthttpclient);
        a1.a(null);
_L14:
        com.gau.a.a.f.b.a((new StringBuilder()).append("testBattery, end HttpConnector connectSynchronous url = ").append(a1.j()).toString(), null);
        return ((com.gau.a.a.e.b) (obj));
_L2:
        a1.a(((URI) (obj1)));
        obj = new HttpHost(((URI) (obj1)).getHost(), ((URI) (obj1)).getPort());
        a(defaulthttpclient);
        i = a1.u();
        if (i == 0) goto _L4; else goto _L3
_L3:
        if (i != -1) goto _L6; else goto _L5
_L5:
        if (a1.k() != null) goto _L6; else goto _L4
_L4:
        obj1 = new HttpGet(((URI) (obj1)));
        a(((HttpRequestBase) (obj1)));
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        f1.a(a1, null, null);
        obj1 = defaulthttpclient.execute(((HttpHost) (obj)), ((org.apache.http.HttpRequest) (obj1)));
        obj = obj1;
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        f1.b(a1, null, null);
        obj = obj1;
_L18:
        long l;
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        l = System.currentTimeMillis();
        com.gau.a.a.f.b.a((new StringBuilder()).append("connectTime= ").append(l - l1).toString(), null);
        com.gau.a.a.f.b.c((new StringBuilder()).append("responseCode= ").append(i).toString(), null);
        if (i != 200) goto _L8; else goto _L7
_L7:
        obj1 = a1.d();
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        if (!((com.gau.a.a.a.a) (obj1)).a(((org.apache.http.HttpMessage) (obj)))) goto _L10; else goto _L11
_L11:
        com.gau.a.a.f.b.c("find AsrResponse", null);
        i = a1.f();
        if (i <= 0) goto _L13; else goto _L12
_L12:
        a1.a(i - 1);
        obj = b(a1);
_L22:
        a(defaulthttpclient);
        a1.a(null);
          goto _L14
_L6:
        obj1 = new HttpPost(((URI) (obj1)));
        a(((HttpRequestBase) (obj1)));
        if (a1.k() == null) goto _L16; else goto _L15
_L15:
        ByteArrayEntity bytearrayentity = new ByteArrayEntity(a1.k());
        bytearrayentity.setChunked(false);
        ((HttpPost) (obj1)).setEntity(bytearrayentity);
_L20:
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_481;
        }
        f1.a(a1, null, null);
        obj1 = defaulthttpclient.execute(((HttpHost) (obj)), ((org.apache.http.HttpRequest) (obj1)));
        obj = obj1;
        if (f1 == null) goto _L18; else goto _L17
_L17:
        f1.b(a1, null, null);
        obj = obj1;
          goto _L18
        obj;
        a(defaulthttpclient);
        a1.a(null);
        throw obj;
_L16:
        HashMap hashmap = a1.t();
        if (hashmap == null) goto _L20; else goto _L19
_L19:
        if (hashmap.isEmpty()) goto _L20; else goto _L21
_L21:
        ArrayList arraylist;
        arraylist = new ArrayList();
        String s;
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new BasicNameValuePair(s, (String)hashmap.get(s))))
        {
            s = (String)iterator.next();
        }

        UrlEncodedFormEntity urlencodedformentity = new UrlEncodedFormEntity(arraylist, "UTF-8");
        urlencodedformentity.setChunked(false);
        ((HttpPost) (obj1)).setEntity(urlencodedformentity);
          goto _L20
_L13:
label0:
        {
            f = f + 1;
            if (f >= a1.b().size())
            {
                break label0;
            }
            obj = b(a1);
        }
          goto _L22
        throw new g(10);
_L10:
        obj = a1.e().a(a1, ((HttpResponse) (obj)));
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_716;
        }
        f1.c(a1, null, null);
        long l2 = System.currentTimeMillis();
        com.gau.a.a.f.b.a((new StringBuilder()).append("DataTrafficTime= ").append(l2 - l).toString(), null);
        a(defaulthttpclient);
        a1.a(null);
        return ((com.gau.a.a.e.b) (obj));
_L8:
        if (i != 503)
        {
            break MISSING_BLOCK_LABEL_775;
        }
        a1.a(0);
        int j = a1.f();
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_803;
        }
        a1.a(j - 1);
        obj = b(a1);
          goto _L22
label1:
        {
            f = f + 1;
            if (f >= a1.b().size())
            {
                break label1;
            }
            obj = b(a1);
        }
          goto _L22
        throw new g(i);
        f = f + 1;
        if (f >= a1.b().size())
        {
            break MISSING_BLOCK_LABEL_883;
        }
        obj = b(a1);
          goto _L23
        if (obj instanceof SocketTimeoutException)
        {
            throw new g(11);
        }
        if (obj instanceof ConnectTimeoutException)
        {
            throw new g(12);
        } else
        {
            throw obj;
        }
    }

    public void c()
    {
        if (e == null)
        {
            e = new Thread(this);
            e.setPriority(a.q());
            e.start();
            com.gau.a.a.f.b.a("testBattery, End HttpConnector connectAsynchronous", null);
        }
    }

    public void d()
    {
        com.gau.a.a.f.b.a("testBattery, Begin HttpConnector run", null);
        try
        {
            a.a(a.j());
            b.b(a);
            com.gau.a.a.e.b b1 = b(a);
            b.a(a, b1);
        }
        catch (ClientProtocolException clientprotocolexception)
        {
            com.gau.a.a.f.b.b("ClientProtocolException", clientprotocolexception);
            clientprotocolexception.printStackTrace();
            b.a(a, 0);
        }
        catch (g g1)
        {
            com.gau.a.a.f.b.b("IOException", g1);
            g1.printStackTrace();
            b.a(a, g1.a);
        }
        catch (IOException ioexception)
        {
            com.gau.a.a.f.b.b("IOException", ioexception);
            ioexception.printStackTrace();
            b.a(a, 1);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            com.gau.a.a.f.b.b("can't find netWork", illegalaccessexception);
            illegalaccessexception.printStackTrace();
            b.a(a, 2);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            com.gau.a.a.f.b.b("unkown exception ", outofmemoryerror);
            System.gc();
            b.a(a, 4);
        }
        catch (Throwable throwable)
        {
            throwable.printStackTrace();
            com.gau.a.a.f.b.b("unkown exception ", throwable);
            b.a(a, 5);
        }
        com.gau.a.a.f.b.a("testBattery, Begin HttpConnector run", null);
    }

    public void run()
    {
        d();
    }
}
