// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheStorage;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheUpdateCallback;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheUpdateException;
import ch.boye.httpclientandroidlib.client.cache.Resource;
import ch.boye.httpclientandroidlib.client.cache.ResourceFactory;
import ch.boye.httpclientandroidlib.entity.ByteArrayEntity;
import ch.boye.httpclientandroidlib.message.BasicHttpResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            HttpCache, CacheConfig, CacheKeyGenerator, CacheEntryUpdater, 
//            CachedHttpResponseGenerator, CacheInvalidator, HeapResourceFactory, BasicHttpCacheStorage, 
//            Variant, SizeLimitedResponseReader

class BasicHttpCache
    implements HttpCache
{

    private final CacheEntryUpdater cacheEntryUpdater;
    private final CacheInvalidator cacheInvalidator;
    public HttpClientAndroidLog log;
    private final long maxObjectSizeBytes;
    private final ResourceFactory resourceFactory;
    private final CachedHttpResponseGenerator responseGenerator;
    private final HttpCacheStorage storage;
    private final CacheKeyGenerator uriExtractor;

    public BasicHttpCache()
    {
        this(new CacheConfig());
    }

    public BasicHttpCache(ResourceFactory resourcefactory, HttpCacheStorage httpcachestorage, CacheConfig cacheconfig)
    {
        log = new HttpClientAndroidLog(getClass());
        resourceFactory = resourcefactory;
        uriExtractor = new CacheKeyGenerator();
        cacheEntryUpdater = new CacheEntryUpdater(resourcefactory);
        maxObjectSizeBytes = cacheconfig.getMaxObjectSize();
        responseGenerator = new CachedHttpResponseGenerator();
        storage = httpcachestorage;
        cacheInvalidator = new CacheInvalidator(uriExtractor, storage);
    }

    public BasicHttpCache(CacheConfig cacheconfig)
    {
        this(((ResourceFactory) (new HeapResourceFactory())), ((HttpCacheStorage) (new BasicHttpCacheStorage(cacheconfig))), cacheconfig);
    }

    private void addVariantWithEtag(String s, String s1, Map map)
        throws IOException
    {
        HttpCacheEntry httpcacheentry = storage.getEntry(s1);
        Header header;
        if (httpcacheentry != null)
        {
            if ((header = httpcacheentry.getFirstHeader("ETag")) != null)
            {
                map.put(header.getValue(), new Variant(s, s1, httpcacheentry));
                return;
            }
        }
    }

    public HttpResponse cacheAndReturnResponse(HttpHost httphost, HttpRequest httprequest, HttpResponse httpresponse, Date date, Date date1)
        throws IOException
    {
        Object obj = getResponseReader(httprequest, httpresponse);
        ((SizeLimitedResponseReader) (obj)).readResponse();
        if (((SizeLimitedResponseReader) (obj)).isLimitReached())
        {
            return ((SizeLimitedResponseReader) (obj)).getReconstructedResponse();
        }
        obj = ((SizeLimitedResponseReader) (obj)).getResource();
        if (isIncompleteResponse(httpresponse, ((Resource) (obj))))
        {
            return generateIncompleteResponseError(httpresponse, ((Resource) (obj)));
        } else
        {
            httpresponse = new HttpCacheEntry(date, date1, httpresponse.getStatusLine(), httpresponse.getAllHeaders(), ((Resource) (obj)));
            storeInCache(httphost, httprequest, httpresponse);
            return responseGenerator.generateResponse(httpresponse);
        }
    }

    HttpCacheEntry doGetUpdatedParentEntry(String s, HttpCacheEntry httpcacheentry, HttpCacheEntry httpcacheentry1, String s1, String s2)
        throws IOException
    {
        HttpCacheEntry httpcacheentry2 = httpcacheentry;
        httpcacheentry = httpcacheentry2;
        if (httpcacheentry2 == null)
        {
            httpcacheentry = httpcacheentry1;
        }
        s = resourceFactory.copy(s, httpcacheentry.getResource());
        httpcacheentry1 = new HashMap(httpcacheentry.getVariantMap());
        httpcacheentry1.put(s1, s2);
        return new HttpCacheEntry(httpcacheentry.getRequestDate(), httpcacheentry.getResponseDate(), httpcacheentry.getStatusLine(), httpcacheentry.getAllHeaders(), s, httpcacheentry1);
    }

    public void flushCacheEntriesFor(HttpHost httphost, HttpRequest httprequest)
        throws IOException
    {
        httphost = uriExtractor.getURI(httphost, httprequest);
        storage.removeEntry(httphost);
    }

    public void flushInvalidatedCacheEntriesFor(HttpHost httphost, HttpRequest httprequest)
        throws IOException
    {
        cacheInvalidator.flushInvalidatedCacheEntries(httphost, httprequest);
    }

    public void flushInvalidatedCacheEntriesFor(HttpHost httphost, HttpRequest httprequest, HttpResponse httpresponse)
    {
        cacheInvalidator.flushInvalidatedCacheEntries(httphost, httprequest, httpresponse);
    }

    HttpResponse generateIncompleteResponseError(HttpResponse httpresponse, Resource resource)
    {
        int i = Integer.parseInt(httpresponse.getFirstHeader("Content-Length").getValue());
        httpresponse = new BasicHttpResponse(HttpVersion.HTTP_1_1, 502, "Bad Gateway");
        httpresponse.setHeader("Content-Type", "text/plain;charset=UTF-8");
        resource = String.format("Received incomplete response with Content-Length %d but actual body length %d", new Object[] {
            Integer.valueOf(i), Long.valueOf(resource.length())
        }).getBytes();
        httpresponse.setHeader("Content-Length", Integer.toString(resource.length));
        httpresponse.setEntity(new ByteArrayEntity(resource));
        return httpresponse;
    }

    public HttpCacheEntry getCacheEntry(HttpHost httphost, HttpRequest httprequest)
        throws IOException
    {
        HttpCacheEntry httpcacheentry = storage.getEntry(uriExtractor.getURI(httphost, httprequest));
        if (httpcacheentry == null)
        {
            httphost = null;
        } else
        {
            httphost = httpcacheentry;
            if (httpcacheentry.hasVariants())
            {
                httphost = (String)httpcacheentry.getVariantMap().get(uriExtractor.getVariantKey(httprequest, httpcacheentry));
                if (httphost == null)
                {
                    return null;
                } else
                {
                    return storage.getEntry(httphost);
                }
            }
        }
        return httphost;
    }

    SizeLimitedResponseReader getResponseReader(HttpRequest httprequest, HttpResponse httpresponse)
    {
        return new SizeLimitedResponseReader(resourceFactory, maxObjectSizeBytes, httprequest, httpresponse);
    }

    public Map getVariantCacheEntriesWithEtags(HttpHost httphost, HttpRequest httprequest)
        throws IOException
    {
        HashMap hashmap = new HashMap();
        httphost = storage.getEntry(uriExtractor.getURI(httphost, httprequest));
        if (httphost != null && httphost.hasVariants())
        {
            httphost = httphost.getVariantMap().entrySet().iterator();
            while (httphost.hasNext()) 
            {
                httprequest = (java.util.Map.Entry)httphost.next();
                addVariantWithEtag((String)httprequest.getKey(), (String)httprequest.getValue(), hashmap);
            }
        }
        return hashmap;
    }

    boolean isIncompleteResponse(HttpResponse httpresponse, Resource resource)
    {
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i == 200 || i == 206)
        {
            if ((httpresponse = httpresponse.getFirstHeader("Content-Length")) != null)
            {
                int j;
                try
                {
                    j = Integer.parseInt(httpresponse.getValue());
                }
                // Misplaced declaration of an exception variable
                catch (HttpResponse httpresponse)
                {
                    return false;
                }
                if (resource.length() < (long)j)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public void reuseVariantEntryFor(HttpHost httphost, final HttpRequest req, Variant variant)
        throws IOException
    {
        httphost = uriExtractor.getURI(httphost, req);
        final HttpCacheEntry entry = variant.getEntry();
        req = new HttpCacheUpdateCallback() {

            final BasicHttpCache this$0;
            final HttpCacheEntry val$entry;
            final HttpRequest val$req;
            final String val$variantCacheKey;
            final String val$variantKey;

            public HttpCacheEntry update(HttpCacheEntry httpcacheentry)
                throws IOException
            {
                return doGetUpdatedParentEntry(req.getRequestLine().getUri(), httpcacheentry, entry, variantKey, variantCacheKey);
            }

            
            {
                this$0 = BasicHttpCache.this;
                req = httprequest;
                entry = httpcacheentry;
                variantKey = s;
                variantCacheKey = s1;
                super();
            }
        };
        try
        {
            storage.updateEntry(httphost, req);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final HttpRequest req)
        {
            log.warn((new StringBuilder()).append("Could not update key [").append(httphost).append("]").toString(), req);
        }
    }

    void storeInCache(HttpHost httphost, HttpRequest httprequest, HttpCacheEntry httpcacheentry)
        throws IOException
    {
        if (httpcacheentry.hasVariants())
        {
            storeVariantEntry(httphost, httprequest, httpcacheentry);
            return;
        } else
        {
            storeNonVariantEntry(httphost, httprequest, httpcacheentry);
            return;
        }
    }

    void storeNonVariantEntry(HttpHost httphost, HttpRequest httprequest, HttpCacheEntry httpcacheentry)
        throws IOException
    {
        httphost = uriExtractor.getURI(httphost, httprequest);
        storage.putEntry(httphost, httpcacheentry);
    }

    void storeVariantEntry(final HttpHost variantURI, final HttpRequest req, final HttpCacheEntry entry)
        throws IOException
    {
        String s = uriExtractor.getURI(variantURI, req);
        variantURI = uriExtractor.getVariantURI(variantURI, req, entry);
        storage.putEntry(variantURI, entry);
        variantURI = new HttpCacheUpdateCallback() {

            final BasicHttpCache this$0;
            final HttpCacheEntry val$entry;
            final HttpRequest val$req;
            final String val$variantURI;

            public HttpCacheEntry update(HttpCacheEntry httpcacheentry)
                throws IOException
            {
                return doGetUpdatedParentEntry(req.getRequestLine().getUri(), httpcacheentry, entry, uriExtractor.getVariantKey(req, entry), variantURI);
            }

            
            {
                this$0 = BasicHttpCache.this;
                req = httprequest;
                entry = httpcacheentry;
                variantURI = s;
                super();
            }
        };
        try
        {
            storage.updateEntry(s, variantURI);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final HttpHost variantURI)
        {
            log.warn((new StringBuilder()).append("Could not update key [").append(s).append("]").toString(), variantURI);
        }
    }

    public HttpCacheEntry updateCacheEntry(HttpHost httphost, HttpRequest httprequest, HttpCacheEntry httpcacheentry, HttpResponse httpresponse, Date date, Date date1)
        throws IOException
    {
        httpcacheentry = cacheEntryUpdater.updateCacheEntry(httprequest.getRequestLine().getUri(), httpcacheentry, date, date1, httpresponse);
        storeInCache(httphost, httprequest, httpcacheentry);
        return httpcacheentry;
    }

    public HttpCacheEntry updateVariantCacheEntry(HttpHost httphost, HttpRequest httprequest, HttpCacheEntry httpcacheentry, HttpResponse httpresponse, Date date, Date date1, String s)
        throws IOException
    {
        httphost = cacheEntryUpdater.updateCacheEntry(httprequest.getRequestLine().getUri(), httpcacheentry, date, date1, httpresponse);
        storage.putEntry(s, httphost);
        return httphost;
    }

}
