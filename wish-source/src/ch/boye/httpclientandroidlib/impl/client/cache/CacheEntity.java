// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.client.cache.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            IOUtils

class CacheEntity
    implements HttpEntity, Serializable
{

    private static final long serialVersionUID = 0xcfe273082febf0d7L;
    private final HttpCacheEntry cacheEntry;

    public CacheEntity(HttpCacheEntry httpcacheentry)
    {
        cacheEntry = httpcacheentry;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public void consumeContent()
        throws IOException
    {
    }

    public InputStream getContent()
        throws IOException
    {
        return cacheEntry.getResource().getInputStream();
    }

    public Header getContentEncoding()
    {
        return cacheEntry.getFirstHeader("Content-Encoding");
    }

    public long getContentLength()
    {
        Resource resource = cacheEntry.getResource();
        if (resource != null)
        {
            return resource.length();
        } else
        {
            return 0L;
        }
    }

    public Header getContentType()
    {
        return cacheEntry.getFirstHeader("Content-Type");
    }

    public boolean isChunked()
    {
        return false;
    }

    public boolean isRepeatable()
    {
        return true;
    }

    public boolean isStreaming()
    {
        return false;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        InputStream inputstream;
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        inputstream = cacheEntry.getResource().getInputStream();
        IOUtils.copy(inputstream, outputstream);
        inputstream.close();
        return;
        outputstream;
        inputstream.close();
        throw outputstream;
    }
}
