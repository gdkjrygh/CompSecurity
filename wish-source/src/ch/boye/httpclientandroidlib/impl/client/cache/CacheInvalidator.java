// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheStorage;
import ch.boye.httpclientandroidlib.impl.cookie.DateParseException;
import ch.boye.httpclientandroidlib.impl.cookie.DateUtils;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            CacheKeyGenerator

class CacheInvalidator
{

    private final CacheKeyGenerator cacheKeyGenerator;
    public HttpClientAndroidLog log;
    private final HttpCacheStorage storage;

    public CacheInvalidator(CacheKeyGenerator cachekeygenerator, HttpCacheStorage httpcachestorage)
    {
        log = new HttpClientAndroidLog(getClass());
        cacheKeyGenerator = cachekeygenerator;
        storage = httpcachestorage;
    }

    private void flushEntry(String s)
    {
        try
        {
            storage.removeEntry(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            log.warn("unable to flush cache entry", s);
        }
    }

    private URL getAbsoluteURL(String s)
    {
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private URL getContentLocationURL(URL url, HttpResponse httpresponse)
    {
        httpresponse = httpresponse.getFirstHeader("Content-Location");
        if (httpresponse == null)
        {
            httpresponse = null;
        } else
        {
            String s = httpresponse.getValue();
            URL url1 = getAbsoluteURL(s);
            httpresponse = url1;
            if (url1 == null)
            {
                return getRelativeURL(url, s);
            }
        }
        return httpresponse;
    }

    private HttpCacheEntry getEntry(String s)
    {
        try
        {
            s = storage.getEntry(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            log.warn("could not retrieve entry from storage", s);
            return null;
        }
        return s;
    }

    private URL getRelativeURL(URL url, String s)
    {
        try
        {
            url = new URL(url, s);
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            return null;
        }
        return url;
    }

    private boolean notGetOrHeadRequest(String s)
    {
        return !"GET".equals(s) && !"HEAD".equals(s);
    }

    private boolean responseAndEntryEtagsDiffer(HttpResponse httpresponse, HttpCacheEntry httpcacheentry)
    {
        httpcacheentry = httpcacheentry.getFirstHeader("ETag");
        for (httpresponse = httpresponse.getFirstHeader("ETag"); httpcacheentry == null || httpresponse == null || httpcacheentry.getValue().equals(httpresponse.getValue());)
        {
            return false;
        }

        return true;
    }

    private boolean responseDateNewerThanEntryDate(HttpResponse httpresponse, HttpCacheEntry httpcacheentry)
    {
        httpcacheentry = httpcacheentry.getFirstHeader("Date");
        httpresponse = httpresponse.getFirstHeader("Date");
        if (httpcacheentry == null || httpresponse == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            httpcacheentry = DateUtils.parseDate(httpcacheentry.getValue());
            flag = DateUtils.parseDate(httpresponse.getValue()).after(httpcacheentry);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            return false;
        }
        return flag;
    }

    protected boolean flushAbsoluteUriFromSameHost(URL url, String s)
    {
        s = getAbsoluteURL(s);
        if (s == null)
        {
            return false;
        } else
        {
            flushUriIfSameHost(url, s);
            return true;
        }
    }

    public void flushInvalidatedCacheEntries(HttpHost httphost, HttpRequest httprequest)
    {
        if (requestShouldNotBeCached(httprequest))
        {
            log.debug("Request should not be cached");
            httphost = cacheKeyGenerator.getURI(httphost, httprequest);
            Object obj = getEntry(httphost);
            log.debug((new StringBuilder()).append("parent entry: ").append(obj).toString());
            if (obj != null)
            {
                for (obj = ((HttpCacheEntry) (obj)).getVariantMap().values().iterator(); ((Iterator) (obj)).hasNext(); flushEntry((String)((Iterator) (obj)).next())) { }
                flushEntry(httphost);
            }
            httphost = getAbsoluteURL(httphost);
            if (httphost == null)
            {
                log.error("Couldn't transform request into valid URL");
            } else
            {
                Object obj1 = httprequest.getFirstHeader("Content-Location");
                if (obj1 != null)
                {
                    obj1 = ((Header) (obj1)).getValue();
                    if (!flushAbsoluteUriFromSameHost(httphost, ((String) (obj1))))
                    {
                        flushRelativeUriFromSameHost(httphost, ((String) (obj1)));
                    }
                }
                httprequest = httprequest.getFirstHeader("Location");
                if (httprequest != null)
                {
                    flushAbsoluteUriFromSameHost(httphost, httprequest.getValue());
                    return;
                }
            }
        }
    }

    public void flushInvalidatedCacheEntries(HttpHost httphost, HttpRequest httprequest, HttpResponse httpresponse)
    {
        int i = httpresponse.getStatusLine().getStatusCode();
        HttpCacheEntry httpcacheentry;
        if (i >= 200 && i <= 299)
        {
            if ((httphost = getAbsoluteURL(cacheKeyGenerator.getURI(httphost, httprequest))) != null && (httprequest = getContentLocationURL(httphost, httpresponse)) != null && ((httpcacheentry = getEntry(cacheKeyGenerator.canonicalizeUri(httprequest.toString()))) != null && responseDateNewerThanEntryDate(httpresponse, httpcacheentry) && responseAndEntryEtagsDiffer(httpresponse, httpcacheentry)))
            {
                flushUriIfSameHost(httphost, httprequest);
                return;
            }
        }
    }

    protected void flushRelativeUriFromSameHost(URL url, String s)
    {
        s = getRelativeURL(url, s);
        if (s == null)
        {
            return;
        } else
        {
            flushUriIfSameHost(url, s);
            return;
        }
    }

    protected void flushUriIfSameHost(URL url, URL url1)
    {
        for (url1 = getAbsoluteURL(cacheKeyGenerator.canonicalizeUri(url1.toString())); url1 == null || !url1.getAuthority().equalsIgnoreCase(url.getAuthority());)
        {
            return;
        }

        flushEntry(url1.toString());
    }

    protected boolean requestShouldNotBeCached(HttpRequest httprequest)
    {
        return notGetOrHeadRequest(httprequest.getRequestLine().getMethod());
    }
}
