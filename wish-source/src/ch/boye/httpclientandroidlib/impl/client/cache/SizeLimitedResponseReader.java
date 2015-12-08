// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.client.cache.InputLimit;
import ch.boye.httpclientandroidlib.client.cache.Resource;
import ch.boye.httpclientandroidlib.client.cache.ResourceFactory;
import ch.boye.httpclientandroidlib.message.BasicHttpResponse;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            CombinedEntity

class SizeLimitedResponseReader
{

    private boolean consumed;
    private InputStream instream;
    private InputLimit limit;
    private final long maxResponseSizeBytes;
    private final HttpRequest request;
    private Resource resource;
    private final ResourceFactory resourceFactory;
    private final HttpResponse response;

    public SizeLimitedResponseReader(ResourceFactory resourcefactory, long l, HttpRequest httprequest, HttpResponse httpresponse)
    {
        resourceFactory = resourcefactory;
        maxResponseSizeBytes = l;
        request = httprequest;
        response = httpresponse;
    }

    private void doConsume()
        throws IOException
    {
        ensureNotConsumed();
        consumed = true;
        limit = new InputLimit(maxResponseSizeBytes);
        HttpEntity httpentity = response.getEntity();
        if (httpentity == null)
        {
            return;
        } else
        {
            String s = request.getRequestLine().getUri();
            instream = httpentity.getContent();
            resource = resourceFactory.generate(s, instream, limit);
            return;
        }
    }

    private void ensureConsumed()
    {
        if (!consumed)
        {
            throw new IllegalStateException("Response has not been consumed");
        } else
        {
            return;
        }
    }

    private void ensureNotConsumed()
    {
        if (consumed)
        {
            throw new IllegalStateException("Response has already been consumed");
        } else
        {
            return;
        }
    }

    HttpResponse getReconstructedResponse()
        throws IOException
    {
        ensureConsumed();
        BasicHttpResponse basichttpresponse = new BasicHttpResponse(response.getStatusLine());
        basichttpresponse.setHeaders(response.getAllHeaders());
        CombinedEntity combinedentity = new CombinedEntity(resource, instream);
        HttpEntity httpentity = response.getEntity();
        if (httpentity != null)
        {
            combinedentity.setContentType(httpentity.getContentType());
            combinedentity.setContentEncoding(httpentity.getContentEncoding());
            combinedentity.setChunked(httpentity.isChunked());
        }
        basichttpresponse.setEntity(combinedentity);
        return basichttpresponse;
    }

    Resource getResource()
    {
        ensureConsumed();
        return resource;
    }

    boolean isLimitReached()
    {
        ensureConsumed();
        return limit.isReached();
    }

    protected void readResponse()
        throws IOException
    {
        if (!consumed)
        {
            doConsume();
        }
    }
}
