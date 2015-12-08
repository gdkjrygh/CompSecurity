// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl;

import ch.boye.httpclientandroidlib.HttpConnectionMetrics;
import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpRequestFactory;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpServerConnection;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.impl.entity.DisallowIdentityContentLengthStrategy;
import ch.boye.httpclientandroidlib.impl.entity.EntityDeserializer;
import ch.boye.httpclientandroidlib.impl.entity.EntitySerializer;
import ch.boye.httpclientandroidlib.impl.entity.LaxContentLengthStrategy;
import ch.boye.httpclientandroidlib.impl.entity.StrictContentLengthStrategy;
import ch.boye.httpclientandroidlib.impl.io.DefaultHttpRequestParser;
import ch.boye.httpclientandroidlib.impl.io.HttpResponseWriter;
import ch.boye.httpclientandroidlib.io.EofSensor;
import ch.boye.httpclientandroidlib.io.HttpMessageParser;
import ch.boye.httpclientandroidlib.io.HttpMessageWriter;
import ch.boye.httpclientandroidlib.io.HttpTransportMetrics;
import ch.boye.httpclientandroidlib.io.SessionInputBuffer;
import ch.boye.httpclientandroidlib.io.SessionOutputBuffer;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl:
//            HttpConnectionMetricsImpl, DefaultHttpRequestFactory

public abstract class AbstractHttpServerConnection
    implements HttpServerConnection
{

    private final EntityDeserializer entitydeserializer = createEntityDeserializer();
    private final EntitySerializer entityserializer = createEntitySerializer();
    private EofSensor eofSensor;
    private SessionInputBuffer inbuffer;
    private HttpConnectionMetricsImpl metrics;
    private SessionOutputBuffer outbuffer;
    private HttpMessageParser requestParser;
    private HttpMessageWriter responseWriter;

    public AbstractHttpServerConnection()
    {
        inbuffer = null;
        outbuffer = null;
        eofSensor = null;
        requestParser = null;
        responseWriter = null;
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
        return new EntityDeserializer(new DisallowIdentityContentLengthStrategy(new LaxContentLengthStrategy(0)));
    }

    protected EntitySerializer createEntitySerializer()
    {
        return new EntitySerializer(new StrictContentLengthStrategy());
    }

    protected HttpRequestFactory createHttpRequestFactory()
    {
        return new DefaultHttpRequestFactory();
    }

    protected HttpMessageParser createRequestParser(SessionInputBuffer sessioninputbuffer, HttpRequestFactory httprequestfactory, HttpParams httpparams)
    {
        return new DefaultHttpRequestParser(sessioninputbuffer, null, httprequestfactory, httpparams);
    }

    protected HttpMessageWriter createResponseWriter(SessionOutputBuffer sessionoutputbuffer, HttpParams httpparams)
    {
        return new HttpResponseWriter(sessionoutputbuffer, null, httpparams);
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
        requestParser = createRequestParser(sessioninputbuffer, createHttpRequestFactory(), httpparams);
        responseWriter = createResponseWriter(sessionoutputbuffer, httpparams);
        metrics = createConnectionMetrics(sessioninputbuffer.getMetrics(), sessionoutputbuffer.getMetrics());
    }

    protected boolean isEof()
    {
        return eofSensor != null && eofSensor.isEof();
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
        catch (IOException ioexception)
        {
            return true;
        }
        return flag;
    }

    public void receiveRequestEntity(HttpEntityEnclosingRequest httpentityenclosingrequest)
        throws HttpException, IOException
    {
        if (httpentityenclosingrequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else
        {
            assertOpen();
            httpentityenclosingrequest.setEntity(entitydeserializer.deserialize(inbuffer, httpentityenclosingrequest));
            return;
        }
    }

    public HttpRequest receiveRequestHeader()
        throws HttpException, IOException
    {
        assertOpen();
        HttpRequest httprequest = (HttpRequest)requestParser.parse();
        metrics.incrementRequestCount();
        return httprequest;
    }

    public void sendResponseEntity(HttpResponse httpresponse)
        throws HttpException, IOException
    {
        if (httpresponse.getEntity() == null)
        {
            return;
        } else
        {
            entityserializer.serialize(outbuffer, httpresponse, httpresponse.getEntity());
            return;
        }
    }

    public void sendResponseHeader(HttpResponse httpresponse)
        throws HttpException, IOException
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        assertOpen();
        responseWriter.write(httpresponse);
        if (httpresponse.getStatusLine().getStatusCode() >= 200)
        {
            metrics.incrementResponseCount();
        }
    }
}
