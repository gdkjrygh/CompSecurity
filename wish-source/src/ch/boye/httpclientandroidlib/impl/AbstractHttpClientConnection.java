// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl;

import ch.boye.httpclientandroidlib.HttpClientConnection;
import ch.boye.httpclientandroidlib.HttpConnectionMetrics;
import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpResponseFactory;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.impl.entity.EntityDeserializer;
import ch.boye.httpclientandroidlib.impl.entity.EntitySerializer;
import ch.boye.httpclientandroidlib.impl.entity.LaxContentLengthStrategy;
import ch.boye.httpclientandroidlib.impl.entity.StrictContentLengthStrategy;
import ch.boye.httpclientandroidlib.impl.io.DefaultHttpResponseParser;
import ch.boye.httpclientandroidlib.impl.io.HttpRequestWriter;
import ch.boye.httpclientandroidlib.io.EofSensor;
import ch.boye.httpclientandroidlib.io.HttpMessageParser;
import ch.boye.httpclientandroidlib.io.HttpMessageWriter;
import ch.boye.httpclientandroidlib.io.HttpTransportMetrics;
import ch.boye.httpclientandroidlib.io.SessionInputBuffer;
import ch.boye.httpclientandroidlib.io.SessionOutputBuffer;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;
import java.net.SocketTimeoutException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl:
//            HttpConnectionMetricsImpl, DefaultHttpResponseFactory

public abstract class AbstractHttpClientConnection
    implements HttpClientConnection
{

    private final EntityDeserializer entitydeserializer = createEntityDeserializer();
    private final EntitySerializer entityserializer = createEntitySerializer();
    private EofSensor eofSensor;
    private SessionInputBuffer inbuffer;
    private HttpConnectionMetricsImpl metrics;
    private SessionOutputBuffer outbuffer;
    private HttpMessageWriter requestWriter;
    private HttpMessageParser responseParser;

    public AbstractHttpClientConnection()
    {
        inbuffer = null;
        outbuffer = null;
        eofSensor = null;
        responseParser = null;
        requestWriter = null;
        metrics = null;
    }

    protected abstract void assertOpen()
        throws IllegalStateException;

    protected HttpConnectionMetricsImpl createConnectionMetrics(HttpTransportMetrics httptransportmetrics, HttpTransportMetrics httptransportmetrics1)
    {
        return new HttpConnectionMetricsImpl(httptransportmetrics, httptransportmetrics1);
    }

    protected EntityDeserializer createEntityDeserializer()
    {
        return new EntityDeserializer(new LaxContentLengthStrategy());
    }

    protected EntitySerializer createEntitySerializer()
    {
        return new EntitySerializer(new StrictContentLengthStrategy());
    }

    protected HttpResponseFactory createHttpResponseFactory()
    {
        return new DefaultHttpResponseFactory();
    }

    protected HttpMessageWriter createRequestWriter(SessionOutputBuffer sessionoutputbuffer, HttpParams httpparams)
    {
        return new HttpRequestWriter(sessionoutputbuffer, null, httpparams);
    }

    protected HttpMessageParser createResponseParser(SessionInputBuffer sessioninputbuffer, HttpResponseFactory httpresponsefactory, HttpParams httpparams)
    {
        return new DefaultHttpResponseParser(sessioninputbuffer, null, httpresponsefactory, httpparams);
    }

    protected void doFlush()
        throws IOException
    {
        outbuffer.flush();
    }

    public void flush()
        throws IOException
    {
        assertOpen();
        doFlush();
    }

    public HttpConnectionMetrics getMetrics()
    {
        return metrics;
    }

    protected void init(SessionInputBuffer sessioninputbuffer, SessionOutputBuffer sessionoutputbuffer, HttpParams httpparams)
    {
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Input session buffer may not be null");
        }
        if (sessionoutputbuffer == null)
        {
            throw new IllegalArgumentException("Output session buffer may not be null");
        }
        inbuffer = sessioninputbuffer;
        outbuffer = sessionoutputbuffer;
        if (sessioninputbuffer instanceof EofSensor)
        {
            eofSensor = (EofSensor)sessioninputbuffer;
        }
        responseParser = createResponseParser(sessioninputbuffer, createHttpResponseFactory(), httpparams);
        requestWriter = createRequestWriter(sessionoutputbuffer, httpparams);
        metrics = createConnectionMetrics(sessioninputbuffer.getMetrics(), sessionoutputbuffer.getMetrics());
    }

    protected boolean isEof()
    {
        return eofSensor != null && eofSensor.isEof();
    }

    public boolean isResponseAvailable(int i)
        throws IOException
    {
        assertOpen();
        boolean flag;
        try
        {
            flag = inbuffer.isDataAvailable(i);
        }
        catch (SocketTimeoutException sockettimeoutexception)
        {
            return false;
        }
        return flag;
    }

    public boolean isStale()
    {
        while (!isOpen() || isEof()) 
        {
            return true;
        }
        boolean flag;
        try
        {
            inbuffer.isDataAvailable(1);
            flag = isEof();
        }
        catch (SocketTimeoutException sockettimeoutexception)
        {
            return false;
        }
        catch (IOException ioexception)
        {
            return true;
        }
        return flag;
    }

    public void receiveResponseEntity(HttpResponse httpresponse)
        throws HttpException, IOException
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else
        {
            assertOpen();
            httpresponse.setEntity(entitydeserializer.deserialize(inbuffer, httpresponse));
            return;
        }
    }

    public HttpResponse receiveResponseHeader()
        throws HttpException, IOException
    {
        assertOpen();
        HttpResponse httpresponse = (HttpResponse)responseParser.parse();
        if (httpresponse.getStatusLine().getStatusCode() >= 200)
        {
            metrics.incrementResponseCount();
        }
        return httpresponse;
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpentityenclosingrequest)
        throws HttpException, IOException
    {
        if (httpentityenclosingrequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        assertOpen();
        if (httpentityenclosingrequest.getEntity() == null)
        {
            return;
        } else
        {
            entityserializer.serialize(outbuffer, httpentityenclosingrequest, httpentityenclosingrequest.getEntity());
            return;
        }
    }

    public void sendRequestHeader(HttpRequest httprequest)
        throws HttpException, IOException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else
        {
            assertOpen();
            requestWriter.write(httprequest);
            metrics.incrementRequestCount();
            return;
        }
    }
}
