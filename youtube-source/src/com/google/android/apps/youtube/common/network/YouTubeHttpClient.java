// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.network;

import android.content.ContentResolver;
import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.EventLog;
import android.util.Log;
import com.google.android.common.http.UrlRules;
import com.google.android.common.http.a;
import com.google.android.common.http.c;
import com.google.android.gsf.f;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.google.android.apps.youtube.common.network:
//            j, k

public final class YouTubeHttpClient
    implements HttpClient
{

    private final HttpClient a;
    private final ContentResolver b;
    private final String c;
    private final ThreadLocal d = new ThreadLocal();

    public YouTubeHttpClient(Context context, HttpClient httpclient, String s)
    {
        a = httpclient;
        b = context.getContentResolver();
        c = s;
        httpclient = getConnectionManager().getSchemeRegistry();
        s = httpclient.getSchemeNames().iterator();
        while (s.hasNext()) 
        {
            String s1 = (String)s.next();
            Scheme scheme = httpclient.unregister(s1);
            context = scheme.getSocketFactory();
            if (context instanceof LayeredSocketFactory)
            {
                context = new j(this, (LayeredSocketFactory)context, (byte)0);
            } else
            {
                context = new k(this, context, (byte)0);
            }
            httpclient.register(new Scheme(s1, context, scheme.getDefaultPort()));
        }
    }

    static ThreadLocal a(YouTubeHttpClient youtubehttpclient)
    {
        return youtubehttpclient.d;
    }

    private HttpResponse a(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        long l1 = SystemClock.elapsedRealtime();
        d.set(null);
        if (!f.a(b, "http_stats", false)) goto _L2; else goto _L1
_L1:
        int i;
        long l2;
        long l4;
        i = Process.myUid();
        l2 = TrafficStats.getUidTxBytes(i);
        l4 = TrafficStats.getUidRxBytes(i);
        httpcontext = a.execute(httpurirequest, httpcontext);
        if (httpcontext != null) goto _L4; else goto _L3
_L3:
        httpurirequest = null;
_L5:
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        long l5 = SystemClock.elapsedRealtime();
        httpcontext.setEntity(new a(httpurirequest, c, i, l2, l4, l5 - l1, l5));
        break MISSING_BLOCK_LABEL_297;
_L6:
        int i1 = httpurirequest.getStatusLine().getStatusCode();
        l2 = SystemClock.elapsedRealtime();
        int l;
        if (d.get() == null && i1 >= 0)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        try
        {
            EventLog.writeEvent(0x318fa, new Object[] {
                Long.valueOf(l2 - l1), Integer.valueOf(i1), c, Integer.valueOf(l)
            });
        }
        // Misplaced declaration of an exception variable
        catch (HttpContext httpcontext)
        {
            Log.e("GoogleHttpClient", "Error recording stats", httpcontext);
            return httpurirequest;
        }
        return httpurirequest;
_L4:
        httpurirequest = httpcontext.getEntity();
          goto _L5
_L2:
        httpurirequest = a.execute(httpurirequest, httpcontext);
          goto _L6
        httpurirequest;
        try
        {
            long l3 = SystemClock.elapsedRealtime();
            if (d.get() != null);
            EventLog.writeEvent(0x318fa, new Object[] {
                Long.valueOf(l3 - l1), Integer.valueOf(-1), c, Integer.valueOf(0)
            });
        }
        // Misplaced declaration of an exception variable
        catch (HttpContext httpcontext)
        {
            Log.e("GoogleHttpClient", "Error recording stats", httpcontext);
        }
        throw httpurirequest;
        httpurirequest = httpcontext;
          goto _L6
    }

    private static RequestWrapper a(HttpUriRequest httpurirequest)
    {
        if (!(httpurirequest instanceof HttpEntityEnclosingRequest))
        {
            break MISSING_BLOCK_LABEL_25;
        }
        httpurirequest = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest)httpurirequest);
_L1:
        httpurirequest.resetHeaders();
        return httpurirequest;
        try
        {
            httpurirequest = new RequestWrapper(httpurirequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            throw new ClientProtocolException(httpurirequest);
        }
          goto _L1
    }

    public final Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
    {
        return a.execute(httphost, httprequest, responsehandler);
    }

    public final Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        return a.execute(httphost, httprequest, responsehandler, httpcontext);
    }

    public final Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        return a.execute(httpurirequest, responsehandler);
    }

    public final Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        return a.execute(httpurirequest, responsehandler, httpcontext);
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
    {
        return a.execute(httphost, httprequest);
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
    {
        return a.execute(httphost, httprequest, httpcontext);
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest)
    {
        return execute(httpurirequest, ((HttpContext) (null)));
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        Object obj = httpurirequest.getURI().toString();
        c c1 = UrlRules.a(b).a(((String) (obj)));
        String s = c1.a(((String) (obj)));
        if (s == null)
        {
            Log.w("GoogleHttpClient", (new StringBuilder("Blocked by ")).append(c1.a).append(": ").append(((String) (obj))).toString());
            throw new BlockedRequestException(c1);
        }
        if (s.equals(obj))
        {
            return a(httpurirequest, httpcontext);
        }
        try
        {
            obj = new URI(s);
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            throw new RuntimeException((new StringBuilder("Bad URL from rule: ")).append(c1.a).toString(), httpurirequest);
        }
        httpurirequest = a(httpurirequest);
        httpurirequest.setURI(((URI) (obj)));
        return a(httpurirequest, httpcontext);
    }

    public final ClientConnectionManager getConnectionManager()
    {
        return a.getConnectionManager();
    }

    public final HttpParams getParams()
    {
        return a.getParams();
    }

    private class BlockedRequestException extends IOException
    {

        BlockedRequestException(c c1)
        {
            super((new StringBuilder("Blocked by rule: ")).append(c1.a).toString());
        }
    }

}
