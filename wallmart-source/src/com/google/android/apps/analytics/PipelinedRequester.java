// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.util.Log;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.DefaultHttpClientConnection;
import org.apache.http.params.BasicHttpParams;

// Referenced classes of package com.google.android.apps.analytics:
//            GoogleAnalyticsTracker

class PipelinedRequester
{
    static interface Callbacks
    {

        public abstract void pipelineModeChanged(boolean flag);

        public abstract void requestSent();

        public abstract void serverError(int i);
    }


    Callbacks callbacks;
    boolean canPipeline;
    DefaultHttpClientConnection connection;
    HttpHost host;
    int lastStatusCode;
    SocketFactory socketFactory;

    public PipelinedRequester(HttpHost httphost)
    {
        this(httphost, ((SocketFactory) (new PlainSocketFactory())));
    }

    public PipelinedRequester(HttpHost httphost, SocketFactory socketfactory)
    {
        connection = new DefaultHttpClientConnection();
        canPipeline = true;
        host = httphost;
        socketFactory = socketfactory;
    }

    private void closeConnection()
    {
        if (connection == null || !connection.isOpen())
        {
            break MISSING_BLOCK_LABEL_24;
        }
        connection.close();
        return;
        IOException ioexception;
        ioexception;
    }

    private void maybeOpenConnection()
        throws IOException
    {
        if (connection == null || !connection.isOpen())
        {
            BasicHttpParams basichttpparams = new BasicHttpParams();
            java.net.Socket socket = socketFactory.createSocket();
            socket = socketFactory.connectSocket(socket, host.getHostName(), host.getPort(), null, 0, basichttpparams);
            connection.bind(socket, basichttpparams);
        }
    }

    public void addRequest(HttpRequest httprequest)
        throws HttpException, IOException
    {
        maybeOpenConnection();
        connection.sendRequestHeader(httprequest);
    }

    public void finishedCurrentRequests()
    {
        closeConnection();
    }

    public void installCallbacks(Callbacks callbacks1)
    {
        callbacks = callbacks1;
    }

    public void sendRequests()
        throws IOException, HttpException
    {
        connection.flush();
        HttpConnectionMetrics httpconnectionmetrics = connection.getMetrics();
        do
        {
            HttpResponse httpresponse;
label0:
            {
                if (httpconnectionmetrics.getResponseCount() < httpconnectionmetrics.getRequestCount())
                {
                    httpresponse = connection.receiveResponseHeader();
                    if (!httpresponse.getStatusLine().getProtocolVersion().greaterEquals(HttpVersion.HTTP_1_1))
                    {
                        callbacks.pipelineModeChanged(false);
                        canPipeline = false;
                    }
                    Header aheader[] = httpresponse.getHeaders("Connection");
                    if (aheader != null)
                    {
                        int j = aheader.length;
                        for (int i = 0; i < j; i++)
                        {
                            if ("close".equalsIgnoreCase(aheader[i].getValue()))
                            {
                                callbacks.pipelineModeChanged(false);
                                canPipeline = false;
                            }
                        }

                    }
                    lastStatusCode = httpresponse.getStatusLine().getStatusCode();
                    if (lastStatusCode == 200)
                    {
                        break label0;
                    }
                    callbacks.serverError(lastStatusCode);
                    closeConnection();
                }
                return;
            }
            connection.receiveResponseEntity(httpresponse);
            httpresponse.getEntity().consumeContent();
            callbacks.requestSent();
            if (GoogleAnalyticsTracker.getInstance().getDebug())
            {
                Log.v("GoogleAnalyticsTracker", (new StringBuilder()).append("HTTP Response Code: ").append(httpresponse.getStatusLine().getStatusCode()).toString());
            }
            if (!canPipeline)
            {
                closeConnection();
                return;
            }
        } while (true);
    }
}
