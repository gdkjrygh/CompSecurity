// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.gau.a.a.d.a;
import com.gau.a.a.e;
import com.gau.a.a.f;
import com.gau.a.a.f.b;
import com.gau.a.a.f.c;
import com.gau.a.a.g;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.gau.a.a.b:
//            a, i, g, h, 
//            f, e, k, j

public class d extends com.gau.a.a.b.a
{

    private HttpClient e;
    private List f;
    private List g;
    private a h;
    private e i;
    private Handler j;
    private int k;
    private Thread l;
    private boolean m;
    private Object n;
    private long o;
    private com.gau.a.a.f.a p;
    private k q;
    private Object r;
    private Runnable s;

    public d(a a1, e e1, Context context, k k1)
    {
        super(a1, e1, context);
        e = null;
        k = 0;
        m = false;
        n = new Object();
        o = 0L;
        s = new i(this);
        q = k1;
        h();
    }

    static k a(d d1)
    {
        return d1.q;
    }

    private String a(a a1)
    {
        Object obj = null;
        if (a.a() != null)
        {
            obj = a.a().toString();
        }
        a1 = ((a) (obj));
        if (obj == null)
        {
            a1 = ((a) (obj));
            if (p != null)
            {
                a1 = ((a) (obj));
                if (a.c() != null)
                {
                    a1 = p.a(a.c().getHost());
                }
            }
        }
        obj = a1;
        if (a1 == null)
        {
            obj = a.j().toString();
        }
        return ((String) (obj));
    }

    static Thread a(d d1, Thread thread)
    {
        d1.l = thread;
        return thread;
    }

    private void a(a a1, HttpClient httpclient)
    {
        if (a1 == null || httpclient == null)
        {
            return;
        }
        if (2 == com.gau.a.a.f.c.b(c))
        {
            HttpHost httphost = com.gau.a.a.f.c.a(c);
            httpclient.getParams().setParameter("http.route.default-proxy", httphost);
        }
        httpclient.getParams().setParameter("http.socket.timeout", Integer.valueOf(a1.h()));
        httpclient.getParams().setParameter("http.connection.timeout", Integer.valueOf(a1.g()));
    }

    private void a(HttpRequestBase httprequestbase)
    {
        List list = a.o();
        if (list != null)
        {
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                httprequestbase.addHeader((Header)list.get(i1));
            }

        }
    }

    static void b(d d1)
    {
        d1.j();
    }

    private void b(a a1)
    {
        if (h == null)
        {
            String s1 = a(a1);
            try
            {
                h = new a(s1, null, i);
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                return;
            }
            h.a(new com.gau.a.a.b.g(this));
            h.a(new h(this));
            h.a(a1.s());
            h.c(1);
        }
    }

    private void b(HttpRequestBase httprequestbase)
    {
        httprequestbase.addHeader("Connection", "keep-alive");
    }

    static Handler c(d d1)
    {
        return d1.j;
    }

    private com.gau.a.a.e.b c(a a1)
    {
        f f1;
        com.gau.a.a.f.b.a((new StringBuilder()).append("StartConnect url= ").append(a1.j()).toString(), null);
        com.gau.a.a.f.b.a((new StringBuilder()).append("testBattery, Begin HttpConnector connectSynchronous url = ").append(a1.j()).toString(), null);
        f1 = a1.r();
        Object obj1 = d(a1);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        throw new g(6);
        Object obj;
        obj;
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        f1.a(((Exception) (obj)), null, null);
        int i1 = a1.f();
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_632;
        }
        a1.a(i1 - 1);
        obj = c(a1);
_L16:
        k = 0;
_L12:
        com.gau.a.a.f.b.a((new StringBuilder()).append("testBattery, end HttpConnector connectSynchronous url = ").append(a1.j()).toString(), null);
        return ((com.gau.a.a.e.b) (obj));
_L2:
        a1.a(((URI) (obj1)));
        obj = new HttpHost(((URI) (obj1)).getHost(), ((URI) (obj1)).getPort());
        if (e == null)
        {
            e = new DefaultHttpClient();
        }
        a(a1, e);
        if (a1.k() != null) goto _L4; else goto _L3
_L3:
        obj1 = new HttpGet(((URI) (obj1)));
        a(((HttpRequestBase) (obj1)));
        b(((HttpRequestBase) (obj1)));
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        f1.a(a1, null, null);
        obj = e.execute(((HttpHost) (obj)), ((org.apache.http.HttpRequest) (obj1)));
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        f1.b(a1, null, null);
_L14:
        i1 = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (i1 != 200) goto _L6; else goto _L5
_L5:
        obj1 = a1.d();
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        if (!((com.gau.a.a.a.a) (obj1)).a(((org.apache.http.HttpMessage) (obj)))) goto _L8; else goto _L9
_L9:
        com.gau.a.a.f.b.c("find AsrResponse", null);
        i1 = a1.f();
        if (i1 <= 0) goto _L11; else goto _L10
_L10:
        a1.a(i1 - 1);
        obj = c(a1);
_L15:
        k = 0;
          goto _L12
_L4:
        obj1 = new HttpPost(((URI) (obj1)));
        a(((HttpRequestBase) (obj1)));
        b(((HttpRequestBase) (obj1)));
        ByteArrayEntity bytearrayentity = new ByteArrayEntity(a1.k());
        bytearrayentity.setChunked(false);
        ((HttpPost) (obj1)).setEntity(bytearrayentity);
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        f1.a(a1, null, null);
        obj = e.execute(((HttpHost) (obj)), ((org.apache.http.HttpRequest) (obj1)));
        if (f1 == null) goto _L14; else goto _L13
_L13:
        f1.b(a1, null, null);
          goto _L14
_L11:
label0:
        {
            k = k + 1;
            if (k >= a1.b().size())
            {
                break label0;
            }
            obj = c(a1);
        }
          goto _L15
        throw new g(10);
        a1;
        k = 0;
        throw a1;
_L8:
        obj1 = a1.e().a(a1, ((HttpResponse) (obj)));
        ((HttpResponse) (obj)).getEntity().consumeContent();
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_538;
        }
        f1.c(a1, null, null);
        k = 0;
        return ((com.gau.a.a.e.b) (obj1));
_L6:
        if (i1 != 503)
        {
            break MISSING_BLOCK_LABEL_559;
        }
        a1.a(0);
        int j1 = a1.f();
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_587;
        }
        a1.a(j1 - 1);
        obj = c(a1);
          goto _L15
label1:
        {
            k = k + 1;
            if (k >= a1.b().size())
            {
                break label1;
            }
            obj = c(a1);
        }
          goto _L15
        throw new g(i1);
        k = k + 1;
        if (k >= a1.b().size())
        {
            break MISSING_BLOCK_LABEL_667;
        }
        obj = c(a1);
          goto _L16
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

    private URI d(a a1)
    {
        while (a1 == null || k != 0 || a1.b() == null || k >= a1.b().size()) 
        {
            return null;
        }
        return (URI)a1.b().get(k);
    }

    static boolean d(d d1)
    {
        return d1.m;
    }

    static Object e(d d1)
    {
        return d1.n;
    }

    static List f(d d1)
    {
        return d1.f;
    }

    static long g(d d1)
    {
        return d1.m();
    }

    static Runnable h(d d1)
    {
        return d1.s;
    }

    private void h()
    {
        o = System.currentTimeMillis();
        e = new DefaultHttpClient();
        f = new ArrayList();
        g = new ArrayList();
        a(a, b);
        i();
        b(a);
        a(a, e);
    }

    private void i()
    {
        if (i == null)
        {
            i = new com.gau.a.a.b.f(this);
        }
    }

    static void i(d d1)
    {
        d1.l();
    }

    private void j()
    {
        if (!f.contains(h))
        {
            String s1 = a(a);
            if (s1 != null)
            {
                try
                {
                    h.a(s1);
                }
                catch (URISyntaxException urisyntaxexception)
                {
                    urisyntaxexception.printStackTrace();
                }
            }
            a(h, i);
        }
    }

    private void k()
    {
        com.gau.a.a.f.b.a("testBattery, Begin HttpConnector run", null);
        try
        {
            a.a(a.j());
            b.b(a);
            com.gau.a.a.e.b b1 = c(a);
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

    private void l()
    {
        if (!f.isEmpty() && !g.isEmpty())
        {
            a = (a)f.remove(0);
            b = (e)g.remove(0);
            if (a != null && b != null)
            {
                if (!a.equals(h))
                {
                    d = false;
                } else
                {
                    d = true;
                }
                k();
                d = true;
                return;
            }
        }
    }

    private long m()
    {
        long l2 = a.s();
        long l1 = l2;
        if (l2 == -1L)
        {
            l1 = p.a();
        }
        l2 = l1;
        if (l1 == -1L)
        {
            l2 = 10000L;
        }
        return l2;
    }

    public void a(a a1, e e1)
    {
        Object obj = n;
        obj;
        JVM INSTR monitorenter ;
        long l1 = System.currentTimeMillis();
        if (a1.equals(h)) goto _L2; else goto _L1
_L1:
        o = l1;
        if (f.contains(h))
        {
            f.remove(h);
        }
        if (j != null)
        {
            j.removeCallbacks(s);
        }
_L4:
        f.add(a1);
        Collections.sort(f, new com.gau.a.a.b.e(this));
        g.add(f.indexOf(a1), e1);
        if (m)
        {
            m = false;
        }
        if (h != null)
        {
            h.a(a1.s());
        }
        n.notifyAll();
        return;
_L2:
        if (l1 - o <= 0x2bf20L) goto _L4; else goto _L3
_L3:
        g();
        if (q != null)
        {
            q.a(this);
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void a(com.gau.a.a.f.a a1)
    {
        p = a1;
    }

    public void a(Object obj)
    {
        r = obj;
    }

    public void c()
    {
        if (j == null)
        {
            j = new Handler(Looper.getMainLooper());
        }
        if (l == null)
        {
            l = new Thread(new j(this), "AliveConnectorConnectAsynchronous");
            l.start();
        }
    }

    public void d()
    {
    }

    public Object e()
    {
        return r;
    }

    public long f()
    {
        return System.currentTimeMillis() - o;
    }

    public void g()
    {
        if (e != null)
        {
            try
            {
                e.getConnectionManager().shutdown();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            e = null;
        }
        if (j != null)
        {
            j.removeCallbacks(s);
        }
        m = true;
    }
}
