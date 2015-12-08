// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            Variant

interface HttpCache
{

    public abstract HttpResponse cacheAndReturnResponse(HttpHost httphost, HttpRequest httprequest, HttpResponse httpresponse, Date date, Date date1)
        throws IOException;

    public abstract void flushCacheEntriesFor(HttpHost httphost, HttpRequest httprequest)
        throws IOException;

    public abstract void flushInvalidatedCacheEntriesFor(HttpHost httphost, HttpRequest httprequest)
        throws IOException;

    public abstract void flushInvalidatedCacheEntriesFor(HttpHost httphost, HttpRequest httprequest, HttpResponse httpresponse);

    public abstract HttpCacheEntry getCacheEntry(HttpHost httphost, HttpRequest httprequest)
        throws IOException;

    public abstract Map getVariantCacheEntriesWithEtags(HttpHost httphost, HttpRequest httprequest)
        throws IOException;

    public abstract void reuseVariantEntryFor(HttpHost httphost, HttpRequest httprequest, Variant variant)
        throws IOException;

    public abstract HttpCacheEntry updateCacheEntry(HttpHost httphost, HttpRequest httprequest, HttpCacheEntry httpcacheentry, HttpResponse httpresponse, Date date, Date date1)
        throws IOException;

    public abstract HttpCacheEntry updateVariantCacheEntry(HttpHost httphost, HttpRequest httprequest, HttpCacheEntry httpcacheentry, HttpResponse httpresponse, Date date, Date date1, String s)
        throws IOException;
}
