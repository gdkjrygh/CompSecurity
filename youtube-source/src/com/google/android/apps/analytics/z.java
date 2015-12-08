// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import org.apache.http.Header;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.DefaultHttpClientConnection;
import org.apache.http.params.BasicHttpParams;

// Referenced classes of package com.google.android.apps.analytics:
//            aa, j

final class z
{

    DefaultHttpClientConnection a;
    aa b;
    int c;
    boolean d;
    HttpHost e;
    SocketFactory f;

    public z(HttpHost httphost)
    {
        this(httphost, ((SocketFactory) (new PlainSocketFactory())));
    }

    private z(HttpHost httphost, SocketFactory socketfactory)
    {
        a = new DefaultHttpClientConnection();
        d = true;
        e = httphost;
        f = socketfactory;
    }

    private void c()
    {
        if (a == null || !a.isOpen())
        {
            break MISSING_BLOCK_LABEL_24;
        }
        a.close();
        return;
        IOException ioexception;
        ioexception;
    }

    public final void a()
    {
        a.flush();
        HttpConnectionMetrics httpconnectionmetrics = a.getMetrics();
        do
        {
            HttpResponse httpresponse;
label0:
            {
                if (httpconnectionmetrics.getResponseCount() < httpconnectionmetrics.getRequestCount())
                {
                    httpresponse = a.receiveResponseHeader();
                    if (!httpresponse.getStatusLine().getProtocolVersion().greaterEquals(HttpVersion.HTTP_1_1))
                    {
                        b.a(false);
                        d = false;
                    }
                    Header aheader[] = httpresponse.getHeaders("Connection");
                    if (aheader != null)
                    {
                        int k = aheader.length;
                        for (int i = 0; i < k; i++)
                        {
                            if ("close".equalsIgnoreCase(aheader[i].getValue()))
                            {
                                b.a(false);
                                d = false;
                            }
                        }

                    }
                    c = httpresponse.getStatusLine().getStatusCode();
                    if (c == 200)
                    {
                        break label0;
                    }
                    b.a(c);
                    c();
                }
                return;
            }
            a.receiveResponseEntity(httpresponse);
            httpresponse.getEntity().consumeContent();
            b.a();
            if (j.a().d())
            {
                Log.v("GoogleAnalyticsTracker", (new StringBuilder("HTTP Response Code: ")).append(httpresponse.getStatusLine().getStatusCode()).toString());
            }
            if (!d)
            {
                c();
                return;
            }
        } while (true);
    }

    public final void a(HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        if (a == null || !a.isOpen())
        {
            BasicHttpParams basichttpparams = new BasicHttpParams();
            Socket socket = f.createSocket();
            socket = f.connectSocket(socket, e.getHostName(), e.getPort(), null, 0, basichttpparams);
            socket.setReceiveBufferSize(8192);
            a.bind(socket, basichttpparams);
        }
        a.sendRequestHeader(httpentityenclosingrequest);
        a.sendRequestEntity(httpentityenclosingrequest);
    }

    public final void b()
    {
        c();
    }
}
