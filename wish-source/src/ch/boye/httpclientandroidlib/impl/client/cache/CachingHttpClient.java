// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpMessage;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.client.ClientProtocolException;
import ch.boye.httpclientandroidlib.client.HttpClient;
import ch.boye.httpclientandroidlib.client.ResponseHandler;
import ch.boye.httpclientandroidlib.client.cache.CacheResponseStatus;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheStorage;
import ch.boye.httpclientandroidlib.client.cache.ResourceFactory;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.impl.client.DefaultHttpClient;
import ch.boye.httpclientandroidlib.impl.cookie.DateParseException;
import ch.boye.httpclientandroidlib.impl.cookie.DateUtils;
import ch.boye.httpclientandroidlib.message.BasicHttpResponse;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import ch.boye.httpclientandroidlib.util.VersionInfo;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            BasicHttpCache, CacheConfig, HeapResourceFactory, CacheValidityPolicy, 
//            ResponseCachingPolicy, CachedHttpResponseGenerator, CacheableRequestPolicy, CachedResponseSuitabilityChecker, 
//            ConditionalRequestBuilder, ResponseProtocolCompliance, RequestProtocolCompliance, HttpCache, 
//            RequestProtocolError, Variant, AsynchronousValidator, OptionsHttp11Response

public class CachingHttpClient
    implements HttpClient
{

    public static final String CACHE_RESPONSE_STATUS = "http.cache.response.status";
    private static final boolean SUPPORTS_RANGE_AND_CONTENT_RANGE_HEADERS = false;
    private final AsynchronousValidator asynchRevalidator;
    private final HttpClient backend;
    private final AtomicLong cacheHits;
    private final AtomicLong cacheMisses;
    private final AtomicLong cacheUpdates;
    private final CacheableRequestPolicy cacheableRequestPolicy;
    private final ConditionalRequestBuilder conditionalRequestBuilder;
    public HttpClientAndroidLog log;
    private final long maxObjectSizeBytes;
    private final RequestProtocolCompliance requestCompliance;
    private final HttpCache responseCache;
    private final ResponseCachingPolicy responseCachingPolicy;
    private final ResponseProtocolCompliance responseCompliance;
    private final CachedHttpResponseGenerator responseGenerator;
    private final boolean sharedCache;
    private final CachedResponseSuitabilityChecker suitabilityChecker;
    private final CacheValidityPolicy validityPolicy;
    private final Map viaHeaders;

    public CachingHttpClient()
    {
        this(((HttpClient) (new DefaultHttpClient())), ((HttpCache) (new BasicHttpCache())), new CacheConfig());
    }

    public CachingHttpClient(HttpClient httpclient)
    {
        this(httpclient, ((HttpCache) (new BasicHttpCache())), new CacheConfig());
    }

    public CachingHttpClient(HttpClient httpclient, HttpCacheStorage httpcachestorage, CacheConfig cacheconfig)
    {
        this(httpclient, ((HttpCache) (new BasicHttpCache(new HeapResourceFactory(), httpcachestorage, cacheconfig))), cacheconfig);
    }

    public CachingHttpClient(HttpClient httpclient, ResourceFactory resourcefactory, HttpCacheStorage httpcachestorage, CacheConfig cacheconfig)
    {
        this(httpclient, ((HttpCache) (new BasicHttpCache(resourcefactory, httpcachestorage, cacheconfig))), cacheconfig);
    }

    public CachingHttpClient(HttpClient httpclient, CacheConfig cacheconfig)
    {
        this(httpclient, ((HttpCache) (new BasicHttpCache(cacheconfig))), cacheconfig);
    }

    CachingHttpClient(HttpClient httpclient, CacheValidityPolicy cachevaliditypolicy, ResponseCachingPolicy responsecachingpolicy, HttpCache httpcache, CachedHttpResponseGenerator cachedhttpresponsegenerator, CacheableRequestPolicy cacheablerequestpolicy, CachedResponseSuitabilityChecker cachedresponsesuitabilitychecker, 
            ConditionalRequestBuilder conditionalrequestbuilder, ResponseProtocolCompliance responseprotocolcompliance, RequestProtocolCompliance requestprotocolcompliance)
    {
        cacheHits = new AtomicLong();
        cacheMisses = new AtomicLong();
        cacheUpdates = new AtomicLong();
        viaHeaders = new HashMap(4);
        log = new HttpClientAndroidLog(getClass());
        CacheConfig cacheconfig = new CacheConfig();
        maxObjectSizeBytes = cacheconfig.getMaxObjectSize();
        sharedCache = cacheconfig.isSharedCache();
        backend = httpclient;
        validityPolicy = cachevaliditypolicy;
        responseCachingPolicy = responsecachingpolicy;
        responseCache = httpcache;
        responseGenerator = cachedhttpresponsegenerator;
        cacheableRequestPolicy = cacheablerequestpolicy;
        suitabilityChecker = cachedresponsesuitabilitychecker;
        conditionalRequestBuilder = conditionalrequestbuilder;
        responseCompliance = responseprotocolcompliance;
        requestCompliance = requestprotocolcompliance;
        asynchRevalidator = makeAsynchronousValidator(cacheconfig);
    }

    CachingHttpClient(HttpClient httpclient, HttpCache httpcache, CacheConfig cacheconfig)
    {
        cacheHits = new AtomicLong();
        cacheMisses = new AtomicLong();
        cacheUpdates = new AtomicLong();
        viaHeaders = new HashMap(4);
        log = new HttpClientAndroidLog(getClass());
        if (httpclient == null)
        {
            throw new IllegalArgumentException("HttpClient may not be null");
        }
        if (httpcache == null)
        {
            throw new IllegalArgumentException("HttpCache may not be null");
        }
        if (cacheconfig == null)
        {
            throw new IllegalArgumentException("CacheConfig may not be null");
        } else
        {
            maxObjectSizeBytes = cacheconfig.getMaxObjectSize();
            sharedCache = cacheconfig.isSharedCache();
            backend = httpclient;
            responseCache = httpcache;
            validityPolicy = new CacheValidityPolicy();
            responseCachingPolicy = new ResponseCachingPolicy(maxObjectSizeBytes, sharedCache);
            responseGenerator = new CachedHttpResponseGenerator(validityPolicy);
            cacheableRequestPolicy = new CacheableRequestPolicy();
            suitabilityChecker = new CachedResponseSuitabilityChecker(validityPolicy, cacheconfig);
            conditionalRequestBuilder = new ConditionalRequestBuilder();
            responseCompliance = new ResponseProtocolCompliance();
            requestCompliance = new RequestProtocolCompliance();
            asynchRevalidator = makeAsynchronousValidator(cacheconfig);
            return;
        }
    }

    public CachingHttpClient(CacheConfig cacheconfig)
    {
        this(((HttpClient) (new DefaultHttpClient())), ((HttpCache) (new BasicHttpCache(cacheconfig))), cacheconfig);
    }

    private boolean alreadyHaveNewerCacheEntry(HttpHost httphost, HttpRequest httprequest, HttpResponse httpresponse)
    {
        Object obj = null;
        try
        {
            httphost = responseCache.getCacheEntry(httphost, httprequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            httphost = obj;
        }
        if (httphost != null)
        {
            if ((httphost = httphost.getFirstHeader("Date")) != null && (httprequest = httpresponse.getFirstHeader("Date")) != null)
            {
                boolean flag;
                try
                {
                    httphost = DateUtils.parseDate(httphost.getValue());
                    flag = DateUtils.parseDate(httprequest.getValue()).before(httphost);
                }
                // Misplaced declaration of an exception variable
                catch (HttpHost httphost)
                {
                    return false;
                }
                return flag;
            }
        }
        return false;
    }

    private boolean explicitFreshnessRequest(HttpRequest httprequest, HttpCacheEntry httpcacheentry, Date date)
    {
        httprequest = httprequest.getHeaders("Cache-Control");
        int k = httprequest.length;
        for (int i = 0; i < k; i++)
        {
            HeaderElement aheaderelement[] = httprequest[i].getElements();
            int l = aheaderelement.length;
            for (int j = 0; j < l; j++)
            {
                HeaderElement headerelement = aheaderelement[j];
                if ("max-stale".equals(headerelement.getName()))
                {
                    int i1;
                    long l1;
                    long l2;
                    try
                    {
                        i1 = Integer.parseInt(headerelement.getValue());
                        l1 = validityPolicy.getCurrentAgeSecs(httpcacheentry, date);
                        l2 = validityPolicy.getFreshnessLifetimeSecs(httpcacheentry);
                    }
                    // Misplaced declaration of an exception variable
                    catch (HttpRequest httprequest)
                    {
                        return true;
                    }
                    if (l1 - l2 > (long)i1)
                    {
                        return true;
                    }
                    continue;
                }
                if ("min-fresh".equals(headerelement.getName()) || "max-age".equals(headerelement.getName()))
                {
                    return true;
                }
            }

        }

        return false;
    }

    private void flushEntriesInvalidatedByRequest(HttpHost httphost, HttpRequest httprequest)
    {
        try
        {
            responseCache.flushInvalidatedCacheEntriesFor(httphost, httprequest);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            log.warn("Unable to flush invalidated entries from cache", httphost);
        }
    }

    private HttpResponse generateCachedResponse(HttpRequest httprequest, HttpContext httpcontext, HttpCacheEntry httpcacheentry, Date date)
    {
        if (httprequest.containsHeader("If-None-Match") || httprequest.containsHeader("If-Modified-Since"))
        {
            httprequest = responseGenerator.generateNotModifiedResponse(httpcacheentry);
        } else
        {
            httprequest = responseGenerator.generateResponse(httpcacheentry);
        }
        setResponseStatus(httpcontext, CacheResponseStatus.CACHE_HIT);
        if (validityPolicy.getStalenessSecs(httpcacheentry, date) > 0L)
        {
            httprequest.addHeader("Warning", "110 localhost \"Response is stale\"");
        }
        return httprequest;
    }

    private HttpResponse generateGatewayTimeout(HttpContext httpcontext)
    {
        setResponseStatus(httpcontext, CacheResponseStatus.CACHE_MODULE_RESPONSE);
        return new BasicHttpResponse(HttpVersion.HTTP_1_1, 504, "Gateway Timeout");
    }

    private String generateViaHeader(HttpMessage httpmessage)
    {
        ProtocolVersion protocolversion = httpmessage.getProtocolVersion();
        httpmessage = (String)viaHeaders.get(protocolversion);
        if (httpmessage != null)
        {
            return httpmessage;
        }
        httpmessage = VersionInfo.loadVersionInfo("ch.boye.httpclientandroidlib.client", getClass().getClassLoader());
        if (httpmessage != null)
        {
            httpmessage = httpmessage.getRelease();
        } else
        {
            httpmessage = "UNAVAILABLE";
        }
        if ("http".equalsIgnoreCase(protocolversion.getProtocol()))
        {
            httpmessage = String.format("%d.%d localhost (Apache-HttpClient/%s (cache))", new Object[] {
                Integer.valueOf(protocolversion.getMajor()), Integer.valueOf(protocolversion.getMinor()), httpmessage
            });
        } else
        {
            httpmessage = String.format("%s/%d.%d localhost (Apache-HttpClient/%s (cache))", new Object[] {
                protocolversion.getProtocol(), Integer.valueOf(protocolversion.getMajor()), Integer.valueOf(protocolversion.getMinor()), httpmessage
            });
        }
        viaHeaders.put(protocolversion, httpmessage);
        return httpmessage;
    }

    private Map getExistingCacheVariants(HttpHost httphost, HttpRequest httprequest)
    {
        try
        {
            httphost = responseCache.getVariantCacheEntriesWithEtags(httphost, httprequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            log.warn("Unable to retrieve variant entries from cache", httphost);
            return null;
        }
        return httphost;
    }

    private HttpResponse getFatallyNoncompliantResponse(HttpRequest httprequest, HttpContext httpcontext)
    {
        Object obj = null;
        Iterator iterator = requestCompliance.requestIsFatallyNonCompliant(httprequest).iterator();
        for (httprequest = obj; iterator.hasNext(); httprequest = requestCompliance.getErrorForRequest(httprequest))
        {
            httprequest = (RequestProtocolError)iterator.next();
            setResponseStatus(httpcontext, CacheResponseStatus.CACHE_MODULE_RESPONSE);
        }

        return httprequest;
    }

    private HttpCacheEntry getUpdatedVariantEntry(HttpHost httphost, HttpRequest httprequest, Date date, Date date1, HttpResponse httpresponse, Variant variant, HttpCacheEntry httpcacheentry)
    {
        try
        {
            httphost = responseCache.updateVariantCacheEntry(httphost, httprequest, httpcacheentry, httpresponse, date, date1, variant.getCacheKey());
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            log.warn("Could not update cache entry", httphost);
            return httpcacheentry;
        }
        return httphost;
    }

    private Object handleAndConsume(ResponseHandler responsehandler, HttpResponse httpresponse)
        throws Error, IOException
    {
        try
        {
            responsehandler = ((ResponseHandler) (responsehandler.handleResponse(httpresponse)));
        }
        // Misplaced declaration of an exception variable
        catch (ResponseHandler responsehandler)
        {
            httpresponse = httpresponse.getEntity();
            try
            {
                EntityUtils.consume(httpresponse);
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                log.warn("Error consuming content after an exception.", httpresponse);
            }
            if (responsehandler instanceof RuntimeException)
            {
                throw (RuntimeException)responsehandler;
            }
            if (responsehandler instanceof IOException)
            {
                throw (IOException)responsehandler;
            } else
            {
                throw new UndeclaredThrowableException(responsehandler);
            }
        }
        EntityUtils.consume(httpresponse.getEntity());
        return responsehandler;
    }

    private HttpResponse handleCacheHit(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext, HttpCacheEntry httpcacheentry)
        throws ClientProtocolException, IOException
    {
        Date date;
        recordCacheHit(httphost, httprequest);
        date = getCurrentDate();
        if (!suitabilityChecker.canCachedResponseBeUsed(httphost, httprequest, httpcacheentry, date)) goto _L2; else goto _L1
_L1:
        httpcacheentry = generateCachedResponse(httprequest, httpcontext, httpcacheentry, date);
_L4:
        if (httpcontext != null)
        {
            httpcontext.setAttribute("http.target_host", httphost);
            httpcontext.setAttribute("http.request", httprequest);
            httpcontext.setAttribute("http.response", httpcacheentry);
            httpcontext.setAttribute("http.request_sent", Boolean.valueOf(true));
        }
        return httpcacheentry;
_L2:
        if (mayCallBackend(httprequest))
        {
            break; /* Loop/switch isn't completed */
        }
        httpcacheentry = generateGatewayTimeout(httpcontext);
        if (true) goto _L4; else goto _L3
_L3:
        if (validityPolicy.isRevalidatable(httpcacheentry))
        {
            return revalidateCacheEntry(httphost, httprequest, httpcontext, httpcacheentry, date);
        } else
        {
            return callBackend(httphost, httprequest, httpcontext);
        }
    }

    private HttpResponse handleCacheMiss(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws IOException
    {
        recordCacheMiss(httphost, httprequest);
        if (!mayCallBackend(httprequest))
        {
            return new BasicHttpResponse(HttpVersion.HTTP_1_1, 504, "Gateway Timeout");
        }
        Map map = getExistingCacheVariants(httphost, httprequest);
        if (map != null && map.size() > 0)
        {
            return negotiateResponseFromVariants(httphost, httprequest, httpcontext, map);
        } else
        {
            return callBackend(httphost, httprequest, httpcontext);
        }
    }

    private HttpResponse handleRevalidationFailure(HttpRequest httprequest, HttpContext httpcontext, HttpCacheEntry httpcacheentry, Date date)
    {
        if (staleResponseNotAllowed(httprequest, httpcacheentry, date))
        {
            return generateGatewayTimeout(httpcontext);
        } else
        {
            return unvalidatedCacheHit(httpcontext, httpcacheentry);
        }
    }

    private AsynchronousValidator makeAsynchronousValidator(CacheConfig cacheconfig)
    {
        if (cacheconfig.getAsynchronousWorkersMax() > 0)
        {
            return new AsynchronousValidator(this, cacheconfig);
        } else
        {
            return null;
        }
    }

    private boolean mayCallBackend(HttpRequest httprequest)
    {
        httprequest = httprequest.getHeaders("Cache-Control");
        int k = httprequest.length;
        for (int i = 0; i < k; i++)
        {
            HeaderElement aheaderelement[] = httprequest[i].getElements();
            int l = aheaderelement.length;
            for (int j = 0; j < l; j++)
            {
                if ("only-if-cached".equals(aheaderelement[j].getName()))
                {
                    return false;
                }
            }

        }

        return true;
    }

    private void recordCacheHit(HttpHost httphost, HttpRequest httprequest)
    {
        cacheHits.getAndIncrement();
        if (log.isTraceEnabled())
        {
            httprequest = httprequest.getRequestLine();
            log.trace((new StringBuilder()).append("Cache hit [host: ").append(httphost).append("; uri: ").append(httprequest.getUri()).append("]").toString());
        }
    }

    private void recordCacheMiss(HttpHost httphost, HttpRequest httprequest)
    {
        cacheMisses.getAndIncrement();
        if (log.isTraceEnabled())
        {
            httprequest = httprequest.getRequestLine();
            log.trace((new StringBuilder()).append("Cache miss [host: ").append(httphost).append("; uri: ").append(httprequest.getUri()).append("]").toString());
        }
    }

    private void recordCacheUpdate(HttpContext httpcontext)
    {
        cacheUpdates.getAndIncrement();
        setResponseStatus(httpcontext, CacheResponseStatus.VALIDATED);
    }

    private HttpResponse retryRequestUnconditionally(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext, HttpCacheEntry httpcacheentry)
        throws IOException
    {
        return callBackend(httphost, conditionalRequestBuilder.buildUnconditionalRequest(httprequest, httpcacheentry), httpcontext);
    }

    private HttpResponse revalidateCacheEntry(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext, HttpCacheEntry httpcacheentry, Date date)
        throws ClientProtocolException
    {
        log.trace("Revalidating the cache entry");
        HttpResponse httpresponse;
        if (asynchRevalidator == null || staleResponseNotAllowed(httprequest, httpcacheentry, date) || !validityPolicy.mayReturnStaleWhileRevalidating(httpcacheentry, date))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        httpresponse = generateCachedResponse(httprequest, httpcontext, httpcacheentry, date);
        asynchRevalidator.revalidateCacheEntry(httphost, httprequest, httpcontext, httpcacheentry);
        return httpresponse;
        try
        {
            httphost = revalidateCacheEntry(httphost, httprequest, httpcontext, httpcacheentry);
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            return handleRevalidationFailure(httprequest, httpcontext, httpcacheentry, date);
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            throw new ClientProtocolException(httphost);
        }
        return httphost;
    }

    private boolean revalidationResponseIsTooOld(HttpResponse httpresponse, HttpCacheEntry httpcacheentry)
    {
        httpcacheentry = httpcacheentry.getFirstHeader("Date");
        httpresponse = httpresponse.getFirstHeader("Date");
        if (httpcacheentry == null || httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        boolean flag;
        httpcacheentry = DateUtils.parseDate(httpcacheentry.getValue());
        flag = DateUtils.parseDate(httpresponse.getValue()).before(httpcacheentry);
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_55;
        httpresponse;
        return false;
    }

    private HttpCacheEntry satisfyFromCache(HttpHost httphost, HttpRequest httprequest)
    {
        try
        {
            httphost = responseCache.getCacheEntry(httphost, httprequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            log.warn("Unable to retrieve entries from cache", httphost);
            return null;
        }
        return httphost;
    }

    private void setResponseStatus(HttpContext httpcontext, CacheResponseStatus cacheresponsestatus)
    {
        if (httpcontext != null)
        {
            httpcontext.setAttribute("http.cache.response.status", cacheresponsestatus);
        }
    }

    private boolean shouldSendNotModifiedResponse(HttpRequest httprequest, HttpCacheEntry httpcacheentry)
    {
        return suitabilityChecker.isConditional(httprequest) && suitabilityChecker.allConditionalsMatch(httprequest, httpcacheentry, new Date());
    }

    private boolean staleIfErrorAppliesTo(int i)
    {
        return i == 500 || i == 502 || i == 503 || i == 504;
    }

    private boolean staleResponseNotAllowed(HttpRequest httprequest, HttpCacheEntry httpcacheentry, Date date)
    {
        return validityPolicy.mustRevalidate(httpcacheentry) || isSharedCache() && validityPolicy.proxyRevalidate(httpcacheentry) || explicitFreshnessRequest(httprequest, httpcacheentry, date);
    }

    private void tryToUpdateVariantMap(HttpHost httphost, HttpRequest httprequest, Variant variant)
    {
        try
        {
            responseCache.reuseVariantEntryFor(httphost, httprequest, variant);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            log.warn("Could not update cache entry to reuse variant", httphost);
        }
    }

    private HttpResponse unvalidatedCacheHit(HttpContext httpcontext, HttpCacheEntry httpcacheentry)
    {
        httpcacheentry = responseGenerator.generateResponse(httpcacheentry);
        setResponseStatus(httpcontext, CacheResponseStatus.CACHE_HIT);
        httpcacheentry.addHeader("Warning", "111 localhost \"Revalidation failed\"");
        return httpcacheentry;
    }

    HttpResponse callBackend(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws IOException
    {
        Date date = getCurrentDate();
        log.trace("Calling the backend");
        httpcontext = backend.execute(httphost, httprequest, httpcontext);
        httpcontext.addHeader("Via", generateViaHeader(httpcontext));
        return handleBackendResponse(httphost, httprequest, date, getCurrentDate(), httpcontext);
    }

    boolean clientRequestsOurOptions(HttpRequest httprequest)
    {
        for (RequestLine requestline = httprequest.getRequestLine(); !"OPTIONS".equals(requestline.getMethod()) || !"*".equals(requestline.getUri()) || !"0".equals(httprequest.getFirstHeader("Max-Forwards").getValue());)
        {
            return false;
        }

        return true;
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
        throws IOException
    {
        return execute(httphost, httprequest, ((HttpContext) (null)));
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws IOException
    {
        setResponseStatus(httpcontext, CacheResponseStatus.CACHE_MISS);
        String s = generateViaHeader(httprequest);
        Object obj;
        if (clientRequestsOurOptions(httprequest))
        {
            setResponseStatus(httpcontext, CacheResponseStatus.CACHE_MODULE_RESPONSE);
            obj = new OptionsHttp11Response();
        } else
        {
            HttpResponse httpresponse = getFatallyNoncompliantResponse(httprequest, httpcontext);
            obj = httpresponse;
            if (httpresponse == null)
            {
                httprequest = requestCompliance.makeRequestCompliant(httprequest);
                httprequest.addHeader("Via", s);
                flushEntriesInvalidatedByRequest(httphost, httprequest);
                if (!cacheableRequestPolicy.isServableFromCache(httprequest))
                {
                    return callBackend(httphost, httprequest, httpcontext);
                }
                HttpCacheEntry httpcacheentry = satisfyFromCache(httphost, httprequest);
                if (httpcacheentry == null)
                {
                    return handleCacheMiss(httphost, httprequest, httpcontext);
                } else
                {
                    return handleCacheHit(httphost, httprequest, httpcontext, httpcacheentry);
                }
            }
        }
        return ((HttpResponse) (obj));
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
        throws IOException
    {
        return execute(httpurirequest, ((HttpContext) (null)));
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
        throws IOException
    {
        URI uri = httpurirequest.getURI();
        return execute(new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme()), ((HttpRequest) (httpurirequest)), httpcontext);
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
        throws IOException
    {
        return execute(httphost, httprequest, responsehandler, null);
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException
    {
        return handleAndConsume(responsehandler, execute(httphost, httprequest, httpcontext));
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
        throws IOException
    {
        return execute(httpurirequest, responsehandler, ((HttpContext) (null)));
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException
    {
        return handleAndConsume(responsehandler, execute(httpurirequest, httpcontext));
    }

    public long getCacheHits()
    {
        return cacheHits.get();
    }

    public long getCacheMisses()
    {
        return cacheMisses.get();
    }

    public long getCacheUpdates()
    {
        return cacheUpdates.get();
    }

    public ClientConnectionManager getConnectionManager()
    {
        return backend.getConnectionManager();
    }

    Date getCurrentDate()
    {
        return new Date();
    }

    public HttpParams getParams()
    {
        return backend.getParams();
    }

    HttpResponse handleBackendResponse(HttpHost httphost, HttpRequest httprequest, Date date, Date date1, HttpResponse httpresponse)
        throws IOException
    {
        boolean flag;
        log.trace("Handling Backend response");
        responseCompliance.ensureProtocolCompliance(httprequest, httpresponse);
        flag = responseCachingPolicy.isResponseCacheable(httprequest, httpresponse);
        responseCache.flushInvalidatedCacheEntriesFor(httphost, httprequest, httpresponse);
        if (!flag || alreadyHaveNewerCacheEntry(httphost, httprequest, httpresponse)) goto _L2; else goto _L1
_L1:
        date = responseCache.cacheAndReturnResponse(httphost, httprequest, httpresponse, date, date1);
_L4:
        return date;
        date;
        log.warn("Unable to store entries in cache", date);
_L2:
        date = httpresponse;
        if (!flag)
        {
            try
            {
                responseCache.flushCacheEntriesFor(httphost, httprequest);
            }
            // Misplaced declaration of an exception variable
            catch (HttpHost httphost)
            {
                log.warn("Unable to flush invalid cache entries", httphost);
                return httpresponse;
            }
            return httpresponse;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isSharedCache()
    {
        return sharedCache;
    }

    HttpResponse negotiateResponseFromVariants(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext, Map map)
        throws IOException
    {
        Object obj = conditionalRequestBuilder.buildConditionalRequestFromVariants(httprequest, map);
        Date date = getCurrentDate();
        HttpResponse httpresponse = backend.execute(httphost, ((HttpRequest) (obj)), httpcontext);
        Date date1 = getCurrentDate();
        httpresponse.addHeader("Via", generateViaHeader(httpresponse));
        if (httpresponse.getStatusLine().getStatusCode() != 304)
        {
            httphost = handleBackendResponse(httphost, httprequest, date, date1, httpresponse);
        } else
        {
            Object obj1 = httpresponse.getFirstHeader("ETag");
            if (obj1 == null)
            {
                log.warn("304 response did not contain ETag");
                return callBackend(httphost, httprequest, httpcontext);
            }
            map = (Variant)map.get(((Header) (obj1)).getValue());
            if (map == null)
            {
                log.debug("304 response did not contain ETag matching one sent in If-None-Match");
                return callBackend(httphost, httprequest, httpcontext);
            }
            obj1 = map.getEntry();
            if (revalidationResponseIsTooOld(httpresponse, ((HttpCacheEntry) (obj1))))
            {
                EntityUtils.consume(httpresponse.getEntity());
                return retryRequestUnconditionally(httphost, httprequest, httpcontext, ((HttpCacheEntry) (obj1)));
            }
            recordCacheUpdate(httpcontext);
            obj = getUpdatedVariantEntry(httphost, ((HttpRequest) (obj)), date, date1, httpresponse, map, ((HttpCacheEntry) (obj1)));
            httpcontext = responseGenerator.generateResponse(((HttpCacheEntry) (obj)));
            tryToUpdateVariantMap(httphost, httprequest, map);
            httphost = httpcontext;
            if (shouldSendNotModifiedResponse(httprequest, ((HttpCacheEntry) (obj))))
            {
                return responseGenerator.generateNotModifiedResponse(((HttpCacheEntry) (obj)));
            }
        }
        return httphost;
    }

    HttpResponse revalidateCacheEntry(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext, HttpCacheEntry httpcacheentry)
        throws IOException, ProtocolException
    {
        Object obj;
        Date date;
        Date date1;
        HttpRequest httprequest1;
        int i;
        httprequest1 = conditionalRequestBuilder.buildConditionalRequest(httprequest, httpcacheentry);
        date = getCurrentDate();
        HttpResponse httpresponse = backend.execute(httphost, httprequest1, httpcontext);
        date1 = getCurrentDate();
        obj = httpresponse;
        if (revalidationResponseIsTooOld(httpresponse, httpcacheentry))
        {
            EntityUtils.consume(httpresponse.getEntity());
            obj = conditionalRequestBuilder.buildUnconditionalRequest(httprequest, httpcacheentry);
            date = getCurrentDate();
            obj = backend.execute(httphost, ((HttpRequest) (obj)), httpcontext);
            date1 = getCurrentDate();
        }
        ((HttpResponse) (obj)).addHeader("Via", generateViaHeader(((HttpMessage) (obj))));
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (i == 304 || i == 200)
        {
            recordCacheUpdate(httpcontext);
        }
        if (i != 304) goto _L2; else goto _L1
_L1:
        httphost = responseCache.updateCacheEntry(httphost, httprequest, httpcacheentry, ((HttpResponse) (obj)), date, date1);
        if (!suitabilityChecker.isConditional(httprequest) || !suitabilityChecker.allConditionalsMatch(httprequest, httphost, new Date())) goto _L4; else goto _L3
_L3:
        httphost = responseGenerator.generateNotModifiedResponse(httphost);
_L6:
        return httphost;
_L4:
        return responseGenerator.generateResponse(httphost);
_L2:
        if (staleIfErrorAppliesTo(i) && !staleResponseNotAllowed(httprequest, httpcacheentry, getCurrentDate()) && validityPolicy.mayReturnStaleIfError(httprequest, httpcacheentry, date1))
        {
            httprequest = responseGenerator.generateResponse(httpcacheentry);
            httprequest.addHeader("Warning", "110 localhost \"Response is stale\"");
            httpcontext = ((HttpResponse) (obj)).getEntity();
            httphost = httprequest;
            if (httpcontext != null)
            {
                EntityUtils.consume(httpcontext);
                return httprequest;
            }
        } else
        {
            return handleBackendResponse(httphost, httprequest1, date, date1, ((HttpResponse) (obj)));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean supportsRangeAndContentRangeHeaders()
    {
        return false;
    }
}
