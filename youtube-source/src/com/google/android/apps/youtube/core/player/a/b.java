// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.e;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.exoplayer.upstream.cache.a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpRequestHandlerRegistry;
import org.apache.http.protocol.HttpService;
import org.apache.http.protocol.ResponseConnControl;
import org.apache.http.protocol.ResponseContent;

// Referenced classes of package com.google.android.apps.youtube.core.player.a:
//            l, q, k, h, 
//            n, c, a

public final class b
    implements l
{

    private final HttpParams a = (new BasicHttpParams()).setBooleanParameter("http.connection.stalecheck", false).setBooleanParameter("http.tcp.nodelay", true).setIntParameter("http.socket.buffer-size", 8192);
    private final HttpService b;
    private final q c = new q();
    private ServerSocket d;
    private ExecutorService e;
    private h f;
    private n g;

    private b(Context context, a a1, a a2, Key key, e e1, com.google.android.apps.youtube.core.player.a.a a3, com.google.android.apps.youtube.common.e.b b1)
    {
        BasicHttpProcessor basichttpprocessor = new BasicHttpProcessor();
        basichttpprocessor.addInterceptor(c);
        basichttpprocessor.addInterceptor(new ResponseContent());
        basichttpprocessor.addInterceptor(new ResponseConnControl());
        HttpRequestHandlerRegistry httprequesthandlerregistry = new HttpRequestHandlerRegistry();
        httprequesthandlerregistry.register("/local", new k(key));
        f = new h(e1, a3);
        httprequesthandlerregistry.register("/exocache", f);
        if (p.a(context))
        {
            g = new n(key, b1);
            g.a(a1, a2);
            httprequesthandlerregistry.register("/pudl", g);
        }
        b = new HttpService(basichttpprocessor, new DefaultConnectionReuseStrategy(), new DefaultHttpResponseFactory());
        b.setHandlerResolver(httprequesthandlerregistry);
        b.setParams(a);
    }

    public static b a(Context context, a a1, a a2, Key key, e e1, com.google.android.apps.youtube.core.player.a.a a3, com.google.android.apps.youtube.common.e.b b1)
    {
        context = new b(context, a1, a2, key, e1, a3, b1);
        context.d = new ServerSocket();
        a1 = InetAddress.getByAddress("localhost", new byte[] {
            127, 0, 0, 1
        });
        ((b) (context)).d.bind(new InetSocketAddress(a1, 0));
        context.e = Executors.newSingleThreadExecutor();
        ((b) (context)).e.execute(new c(context));
        return context;
        context;
        L.a("IOException when starting MediaServer", context);
_L2:
        return null;
        context;
        L.a("Cannot instantiate MediaServer", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    static ServerSocket a(b b1)
    {
        return b1.d;
    }

    static HttpParams b(b b1)
    {
        return b1.a;
    }

    static HttpService c(b b1)
    {
        return b1.b;
    }

    public final Uri a(Uri uri)
    {
        uri = (new android.net.Uri.Builder()).scheme("http").encodedAuthority((new StringBuilder("127.0.0.1:")).append(d.getLocalPort()).toString()).path("/local").appendQueryParameter("f", uri.getPath()).build();
        return c.a(uri);
    }

    public final Uri a(Uri uri, String s, int i, long l1, long l2)
    {
        android.net.Uri.Builder builder = (new android.net.Uri.Builder()).scheme("http").encodedAuthority((new StringBuilder("127.0.0.1:")).append(d.getLocalPort()).toString()).path("/exocache");
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        uri = builder.appendQueryParameter("id", s1).appendQueryParameter("s", Uri.encode(uri.toString())).appendQueryParameter("i", Integer.toString(i)).appendQueryParameter("l", Long.toString(l1)).appendQueryParameter("m", Long.toString(l2)).build();
        return c.a(uri);
    }

    public final Uri a(String s, int i, long l1, long l2, long l3)
    {
        s = (new android.net.Uri.Builder()).scheme("http").encodedAuthority((new StringBuilder("127.0.0.1:")).append(d.getLocalPort()).toString()).path("/pudl").appendQueryParameter("v", s).appendQueryParameter("i", Integer.toString(i)).appendQueryParameter("l", Long.toString(l1)).appendQueryParameter("m", Long.toString(l2)).appendQueryParameter("e", Long.toString(l3)).build();
        return c.a(s);
    }

    public final void a(a a1, a a2)
    {
        if (f != null)
        {
            L.e("changing offline cache for exo request handler.");
            f.a(a1, a2);
        }
        if (g != null)
        {
            L.e("changing offline cache for offline request handler.");
            g.a(a1, a2);
        }
    }
}
