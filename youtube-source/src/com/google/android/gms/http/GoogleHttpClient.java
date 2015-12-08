// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.TrafficStats;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.EventLog;
import android.util.Log;
import com.google.android.gms.common.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.google.android.gms.http:
//            d, c, b, a, 
//            f

public final class GoogleHttpClient
    implements HttpClient
{

    private static final ComponentName e;
    private static final Intent f;
    private static final String h[] = {
        "text/", "application/xml", "application/json"
    };
    protected SSLSocketFactory a;
    protected int b;
    protected int c;
    protected HttpParams d;
    private b g;
    private Context i;
    private String j;
    private String k;

    private Bundle a(String s)
    {
        f f1 = new f();
        if (!i.bindService(f, f1, 1)) goto _L2; else goto _L1
_L1:
        c c1 = com.google.android.gms.http.d.a(f1.a());
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        s = c1.a(s);
        i.unbindService(f1);
        return s;
        i.unbindService(f1);
_L4:
        return null;
        s;
        Log.w("GoogleHttpClient", "Interrupted during blocking call: ", s);
        i.unbindService(f1);
        continue; /* Loop/switch isn't completed */
        s;
        Log.w("GoogleHttpClient", "Exception in Google Http Service: ", s);
        i.unbindService(f1);
        continue; /* Loop/switch isn't completed */
        s;
        i.unbindService(f1);
        throw s;
_L2:
        Log.w("GoogleHttpClient", "Failed to bind Google HTTP Service");
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(HttpUriRequest httpurirequest, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("curl ");
        stringbuilder.append("-X ");
        stringbuilder.append(httpurirequest.getMethod());
        stringbuilder.append(" ");
        Header aheader[] = httpurirequest.getAllHeaders();
        int i1 = aheader.length;
        for (int l = 0; l < i1; l++)
        {
            Header header = aheader[l];
            if (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))
            {
                stringbuilder.append("--header \"");
                stringbuilder.append(header.toString().trim());
                stringbuilder.append("\" ");
            }
        }

        URI uri = httpurirequest.getURI();
        if (httpurirequest instanceof RequestWrapper)
        {
            HttpRequest httprequest = ((RequestWrapper)httpurirequest).getOriginal();
            if (httprequest instanceof HttpUriRequest)
            {
                uri = ((HttpUriRequest)httprequest).getURI();
            }
        }
        stringbuilder.append("\"");
        stringbuilder.append(uri);
        stringbuilder.append("\"");
        if (httpurirequest instanceof HttpEntityEnclosingRequest)
        {
            HttpEntity httpentity = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
            if (httpentity != null && httpentity.isRepeatable())
            {
                if (httpentity.getContentLength() < 1024L)
                {
                    ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                    httpentity.writeTo(bytearrayoutputstream);
                    if (a(httpurirequest))
                    {
                        httpurirequest = Base64.encodeToString(bytearrayoutputstream.toByteArray(), 2);
                        stringbuilder.insert(0, (new StringBuilder("echo '")).append(httpurirequest).append("' | base64 -d > /tmp/$$.bin; ").toString());
                        stringbuilder.append(" --data-binary @/tmp/$$.bin");
                    } else
                    {
                        httpurirequest = bytearrayoutputstream.toString();
                        stringbuilder.append(" --data-ascii \"").append(httpurirequest).append("\"");
                    }
                } else
                {
                    stringbuilder.append(" [TOO MUCH DATA TO INCLUDE]");
                }
            }
        }
        return stringbuilder.toString();
    }

    private HttpResponse a(HttpUriRequest httpurirequest, a a1, HttpContext httpcontext)
    {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper())
        {
            throw new RuntimeException("This thread forbids HTTP requests");
        }
        b b1 = g;
        if (b1 != null && com.google.android.gms.http.b.a(b1) && (httpurirequest instanceof HttpUriRequest))
        {
            com.google.android.gms.http.b.a(b1, a(httpurirequest, false));
        }
        if (a1.a == null || a1.a.getString("stats") == null) goto _L2; else goto _L1
_L1:
        int l;
        long l1;
        long l2;
        l = Process.myUid();
        l1 = TrafficStats.getUidTxBytes(l);
        l2 = TrafficStats.getUidRxBytes(l);
        b(httpurirequest, a1, httpcontext);
        if (a1 != null) goto _L4; else goto _L3
_L3:
        httpurirequest = null;
_L7:
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        long l3 = SystemClock.elapsedRealtime();
        a1.c = l3 - a1.b;
        a1.setEntity(new com.google.android.gms.http.f(httpurirequest, j, l, l1, l2, a1.c, l3));
_L5:
        l = a1.getStatusLine().getStatusCode();
        a1.c = SystemClock.elapsedRealtime() - a1.b;
        EventLog.writeEvent(0x318fa, new Object[] {
            Long.valueOf(a1.c), Integer.valueOf(l), j, Integer.valueOf(0)
        });
        return a1;
_L4:
        httpurirequest = a1.getEntity();
        continue; /* Loop/switch isn't completed */
_L2:
        b(httpurirequest, a1, httpcontext);
          goto _L5
        httpurirequest;
        try
        {
            a1.c = SystemClock.elapsedRealtime() - a1.b;
            EventLog.writeEvent(0x318fa, new Object[] {
                Long.valueOf(a1.c), Integer.valueOf(-1), j, Integer.valueOf(0)
            });
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            Log.e("GoogleHttpClient", "Error recording stats", a1);
        }
        throw httpurirequest;
        httpurirequest;
        Log.e("GoogleHttpClient", "Error recording stats", httpurirequest);
        return a1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private HttpResponse a(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        com.google.android.gms.http.a a1 = new com.google.android.gms.http.a();
        a1.b = SystemClock.elapsedRealtime();
        String s = httpurirequest.getURI().toString();
        a1.a = a(s);
        if (a1.a == null)
        {
            return a(httpurirequest, a1, httpcontext);
        }
        if (a1.a.getString("block") != null)
        {
            Log.w("GoogleHttpClient", (new StringBuilder("Blocked by ")).append(a1.a.getString("name")).append(": ").append(s).toString());
            throw new a(a1.a);
        }
        s = a1.a.getString("rewrite");
        URI uri;
        try
        {
            uri = new URI(s);
        }
        catch (URISyntaxException urisyntaxexception)
        {
            Log.w((new StringBuilder("Ignoring bad URL from rule: ")).append(s).toString(), urisyntaxexception);
            return a(httpurirequest, a1, httpcontext);
        }
        httpurirequest = b(httpurirequest);
        httpurirequest.setURI(uri);
        return a(httpurirequest, a1, httpcontext);
    }

    private void a(HttpURLConnection httpurlconnection, HttpUriRequest httpurirequest)
    {
        httpurlconnection.setRequestMethod(httpurirequest.getMethod());
        Header aheader[] = httpurirequest.getAllHeaders();
        int i1 = aheader.length;
        for (int l = 0; l < i1; l++)
        {
            Header header1 = aheader[l];
            httpurlconnection.addRequestProperty(header1.getName(), header1.getValue());
        }

        httpurlconnection.setRequestProperty("User-Agent", k);
        if (httpurirequest instanceof HttpEntityEnclosingRequest)
        {
            httpurirequest = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
            if (httpurirequest == null)
            {
                throw new IllegalArgumentException("The Entity of HttpEntityEnclosingRequest is null");
            }
            httpurlconnection.setDoOutput(true);
            Header header;
            Header header2;
            long l1;
            if (httpurirequest.isChunked())
            {
                l1 = -1L;
            } else
            {
                l1 = httpurirequest.getContentLength();
            }
            header = httpurirequest.getContentType();
            header2 = httpurirequest.getContentEncoding();
            if (l1 > 0L)
            {
                httpurlconnection.setRequestProperty("content-length", Long.toString(l1));
            }
            if (header != null)
            {
                httpurlconnection.setRequestProperty("content-type", header.getValue());
            }
            if (header2 != null)
            {
                httpurlconnection.setRequestProperty("content-encoding", header2.getValue());
            }
            httpurirequest.writeTo(httpurlconnection.getOutputStream());
            return;
        } else
        {
            httpurlconnection.connect();
            return;
        }
    }

    private static boolean a(HttpUriRequest httpurirequest)
    {
        Header aheader[];
        int l;
        int j1;
        aheader = httpurirequest.getHeaders("content-encoding");
        if (aheader == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        j1 = aheader.length;
        l = 0;
_L3:
        if (l >= j1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (!"gzip".equalsIgnoreCase(aheader[l].getValue())) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        l++;
          goto _L3
        httpurirequest = httpurirequest.getHeaders("content-type");
        if (httpurirequest != null)
        {
            int l1 = httpurirequest.length;
            int i1 = 0;
            while (i1 < l1) 
            {
                Header header = httpurirequest[i1];
                String as[] = h;
                int i2 = as.length;
                for (int k1 = 0; k1 < i2; k1++)
                {
                    String s = as[k1];
                    if (header.getValue().startsWith(s))
                    {
                        return false;
                    }
                }

                i1++;
            }
        }
          goto _L1
    }

    private HttpResponse b(HttpUriRequest httpurirequest, com.google.android.gms.http.a a1, HttpContext httpcontext)
    {
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(httpurirequest.getRequestLine().getUri())).openConnection();
        httpurlconnection.setConnectTimeout(c);
        httpurlconnection.setReadTimeout(b);
        if ((httpurlconnection instanceof HttpsURLConnection) && a != null)
        {
            ((HttpsURLConnection)httpurlconnection).setSSLSocketFactory(a);
        }
        httpurlconnection.setInstanceFollowRedirects(false);
        a1.d = httpurlconnection;
        HttpUriRequest httpurirequest1;
        int l;
        int i1;
        try
        {
            a(httpurlconnection, httpurirequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            throw httpurirequest;
        }
        i1 = httpurlconnection.getResponseCode();
        a1.setStatusLine(HttpVersion.HTTP_1_1, i1, httpurlconnection.getResponseMessage());
        l = 0;
        httpcontext = null;
        httpurirequest1 = null;
        do
        {
            String s = httpurlconnection.getHeaderFieldKey(l);
            if (s == null)
            {
                break;
            }
            httpurirequest = httpurlconnection.getHeaderField(l);
            if (s.equalsIgnoreCase("content-type"))
            {
                httpurirequest1 = httpurirequest;
            }
            if (s.equalsIgnoreCase("content-encoding"))
            {
                httpcontext = httpurirequest;
            }
            a1.addHeader(new BasicHeader(s, httpurirequest));
            l++;
        } while (true);
        if (i1 >= 400)
        {
            httpurirequest = httpurlconnection.getErrorStream();
        } else
        {
            httpurirequest = null;
        }
        if (httpurirequest == null)
        {
            httpurirequest = httpurlconnection.getInputStream();
        }
        if (httpurirequest != null)
        {
            httpurirequest = new InputStreamEntity(httpurirequest, -1L);
            if (httpurirequest1 != null)
            {
                httpurirequest.setContentType(httpurirequest1);
            }
            if (httpcontext != null)
            {
                httpurirequest.setContentType(httpcontext);
            }
            a1.setEntity(httpurirequest);
        }
        return a1;
    }

    private static RequestWrapper b(HttpUriRequest httpurirequest)
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
        throw new UnsupportedOperationException();
    }

    public final Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        throw new UnsupportedOperationException();
    }

    public final Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        return execute(httpurirequest, responsehandler, ((HttpContext) (null)));
    }

    public final Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
    {
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
    {
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest)
    {
        return execute(httpurirequest, ((HttpContext) (null)));
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        return a(httpurirequest, httpcontext);
    }

    public final ClientConnectionManager getConnectionManager()
    {
        throw new UnsupportedOperationException();
    }

    public final HttpParams getParams()
    {
        return d;
    }

    static 
    {
        e = new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.http.GoogleHttpService");
        f = (new Intent()).setPackage("com.google.android.gms").setComponent(e);
    }

    private class a extends IOException
    {

        private final Bundle BK;

        a(Bundle bundle)
        {
            super((new StringBuilder("Blocked by rule: ")).append(bundle.getString("name")).toString());
            BK = bundle;
        }
    }

}
