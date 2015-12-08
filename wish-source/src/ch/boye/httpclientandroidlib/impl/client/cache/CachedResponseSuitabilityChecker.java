// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.impl.cookie.DateParseException;
import ch.boye.httpclientandroidlib.impl.cookie.DateUtils;
import java.util.Date;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            CacheValidityPolicy, CacheConfig

class CachedResponseSuitabilityChecker
{

    private final float heuristicCoefficient;
    private final long heuristicDefaultLifetime;
    public HttpClientAndroidLog log;
    private final boolean sharedCache;
    private final boolean useHeuristicCaching;
    private final CacheValidityPolicy validityStrategy;

    CachedResponseSuitabilityChecker(CacheConfig cacheconfig)
    {
        this(new CacheValidityPolicy(), cacheconfig);
    }

    CachedResponseSuitabilityChecker(CacheValidityPolicy cachevaliditypolicy, CacheConfig cacheconfig)
    {
        log = new HttpClientAndroidLog(getClass());
        validityStrategy = cachevaliditypolicy;
        sharedCache = cacheconfig.isSharedCache();
        useHeuristicCaching = cacheconfig.isHeuristicCachingEnabled();
        heuristicCoefficient = cacheconfig.getHeuristicCoefficient();
        heuristicDefaultLifetime = cacheconfig.getHeuristicDefaultLifetime();
    }

    private boolean etagValidatorMatches(HttpRequest httprequest, HttpCacheEntry httpcacheentry)
    {
        httpcacheentry = httpcacheentry.getFirstHeader("ETag");
        if (httpcacheentry != null)
        {
            httpcacheentry = httpcacheentry.getValue();
        } else
        {
            httpcacheentry = null;
        }
        httprequest = httprequest.getHeaders("If-None-Match");
        if (httprequest != null)
        {
            int k = httprequest.length;
            for (int i = 0; i < k; i++)
            {
                HeaderElement aheaderelement[] = httprequest[i].getElements();
                int l = aheaderelement.length;
                for (int j = 0; j < l; j++)
                {
                    String s = aheaderelement[j].toString();
                    if ("*".equals(s) && httpcacheentry != null || s.equals(httpcacheentry))
                    {
                        return true;
                    }
                }

            }

        }
        return false;
    }

    private long getMaxStale(HttpRequest httprequest)
    {
        int i;
        int k;
        long l3;
        l3 = -1L;
        httprequest = httprequest.getHeaders("Cache-Control");
        k = httprequest.length;
        i = 0;
_L7:
        HeaderElement aheaderelement[];
        int j;
        int l;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        aheaderelement = httprequest[i].getElements();
        l = aheaderelement.length;
        j = 0;
_L2:
        HeaderElement headerelement;
        long l1;
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        headerelement = aheaderelement[j];
        l1 = l3;
        if ("max-stale".equals(headerelement.getName()))
        {
            if (headerelement.getValue() != null && !"".equals(headerelement.getValue().trim()) || l3 != -1L)
            {
                break; /* Loop/switch isn't completed */
            }
            l1 = 0x7fffffffffffffffL;
        }
_L5:
        j++;
        l3 = l1;
        if (true) goto _L2; else goto _L1
_L1:
        l1 = Long.parseLong(headerelement.getValue());
        long l2;
        l2 = l1;
        if (l1 < 0L)
        {
            l2 = 0L;
        }
        if (l3 == -1L) goto _L4; else goto _L3
_L3:
        l1 = l3;
        if (l2 >= l3) goto _L5; else goto _L4
_L4:
        l1 = l2;
          goto _L5
        NumberFormatException numberformatexception;
        numberformatexception;
        l1 = 0L;
          goto _L5
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        return l3;
    }

    private boolean hasSupportedEtagValidator(HttpRequest httprequest)
    {
        return httprequest.containsHeader("If-None-Match");
    }

    private boolean hasSupportedLastModifiedValidator(HttpRequest httprequest)
    {
        return hasValidDateField(httprequest, "If-Modified-Since");
    }

    private boolean hasUnsupportedConditionalHeaders(HttpRequest httprequest)
    {
        return httprequest.getFirstHeader("If-Range") != null || httprequest.getFirstHeader("If-Match") != null || hasValidDateField(httprequest, "If-Unmodified-Since");
    }

    private boolean hasValidDateField(HttpRequest httprequest, String s)
    {
        int i;
        int j;
        httprequest = httprequest.getHeaders(s);
        j = httprequest.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = httprequest[i];
        DateUtils.parseDate(s.getValue());
        return true;
        s;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return false;
    }

    private boolean isFreshEnough(HttpCacheEntry httpcacheentry, HttpRequest httprequest, Date date)
    {
        while (validityStrategy.isResponseFresh(httpcacheentry, date) || useHeuristicCaching && validityStrategy.isResponseHeuristicallyFresh(httpcacheentry, date, heuristicCoefficient, heuristicDefaultLifetime)) 
        {
            return true;
        }
        if (originInsistsOnFreshness(httpcacheentry))
        {
            return false;
        }
        long l = getMaxStale(httprequest);
        if (l == -1L)
        {
            return false;
        }
        boolean flag;
        if (l > validityStrategy.getStalenessSecs(httpcacheentry, date))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    private boolean lastModifiedValidatorMatches(HttpRequest httprequest, HttpCacheEntry httpcacheentry, Date date)
    {
        Header header = httpcacheentry.getFirstHeader("Last-Modified");
        Object obj = null;
        httpcacheentry = ((HttpCacheEntry) (obj));
        int i;
        int j;
        boolean flag;
        if (header != null)
        {
            try
            {
                httpcacheentry = DateUtils.parseDate(header.getValue());
            }
            // Misplaced declaration of an exception variable
            catch (HttpCacheEntry httpcacheentry)
            {
                httpcacheentry = ((HttpCacheEntry) (obj));
            }
        }
        if (httpcacheentry != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        httprequest = httprequest.getHeaders("If-Modified-Since");
        j = httprequest.length;
        i = 0;
_L7:
        if (i >= j) goto _L4; else goto _L3
_L3:
        obj = httprequest[i];
        obj = DateUtils.parseDate(((Header) (obj)).getValue());
        if (((Date) (obj)).after(date)) goto _L1; else goto _L5
_L5:
        flag = httpcacheentry.after(((Date) (obj)));
        if (flag) goto _L1; else goto _L6
_L6:
        i++;
          goto _L7
_L4:
        return true;
        obj;
          goto _L6
    }

    private boolean originInsistsOnFreshness(HttpCacheEntry httpcacheentry)
    {
        boolean flag1 = false;
        if (!validityStrategy.mustRevalidate(httpcacheentry)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!sharedCache) goto _L4; else goto _L3
_L3:
        if (validityStrategy.proxyRevalidate(httpcacheentry))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!validityStrategy.hasCacheControlDirective(httpcacheentry, "s-maxage")) goto _L4; else goto _L5
_L5:
        return true;
    }

    public boolean allConditionalsMatch(HttpRequest httprequest, HttpCacheEntry httpcacheentry, Date date)
    {
        boolean flag2 = hasSupportedEtagValidator(httprequest);
        boolean flag3 = hasSupportedLastModifiedValidator(httprequest);
        boolean flag;
        boolean flag1;
        if (flag2 && etagValidatorMatches(httprequest, httpcacheentry))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag3 && lastModifiedValidatorMatches(httprequest, httpcacheentry, date))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        while (flag2 && flag3 && (!flag || !flag1) || flag2 && !flag || flag3 && !flag1) 
        {
            return false;
        }
        return true;
    }

    public boolean canCachedResponseBeUsed(HttpHost httphost, HttpRequest httprequest, HttpCacheEntry httpcacheentry, Date date)
    {
        int i;
        int k;
        if (!isFreshEnough(httpcacheentry, httprequest, date))
        {
            log.trace("Cache entry was not fresh enough");
            return false;
        }
        if (!validityStrategy.contentLengthHeaderMatchesActualLength(httpcacheentry))
        {
            log.debug("Cache entry Content-Length and header information do not match");
            return false;
        }
        if (hasUnsupportedConditionalHeaders(httprequest))
        {
            log.debug("Request contained conditional headers we don't handle");
            return false;
        }
        if (isConditional(httprequest) && !allConditionalsMatch(httprequest, httpcacheentry, date))
        {
            return false;
        }
        httphost = httprequest.getHeaders("Cache-Control");
        k = httphost.length;
        i = 0;
_L5:
        int j;
        int l;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        httprequest = httphost[i].getElements();
        l = httprequest.length;
        j = 0;
_L3:
        if (j >= l) goto _L2; else goto _L1
_L1:
        HeaderElement headerelement;
label0:
        {
            headerelement = httprequest[j];
            if ("no-cache".equals(headerelement.getName()))
            {
                log.trace("Response contained NO CACHE directive, cache was not suitable");
                return false;
            }
            if ("no-store".equals(headerelement.getName()))
            {
                log.trace("Response contained NO STORE directive, cache was not suitable");
                return false;
            }
            if (!"max-age".equals(headerelement.getName()))
            {
                break label0;
            }
            try
            {
                int i1 = Integer.parseInt(headerelement.getValue());
                if (validityStrategy.getCurrentAgeSecs(httpcacheentry, date) <= (long)i1)
                {
                    break label0;
                }
                log.trace("Response from cache was NOT suitable due to max age");
            }
            // Misplaced declaration of an exception variable
            catch (HttpHost httphost)
            {
                log.debug((new StringBuilder()).append("Response from cache was malformed").append(httphost.getMessage()).toString());
                return false;
            }
            return false;
        }
label1:
        {
            if (!"max-stale".equals(headerelement.getName()))
            {
                break label1;
            }
            try
            {
                int j1 = Integer.parseInt(headerelement.getValue());
                if (validityStrategy.getFreshnessLifetimeSecs(httpcacheentry) <= (long)j1)
                {
                    break label1;
                }
                log.trace("Response from cache was not suitable due to Max stale freshness");
            }
            // Misplaced declaration of an exception variable
            catch (HttpHost httphost)
            {
                log.debug((new StringBuilder()).append("Response from cache was malformed: ").append(httphost.getMessage()).toString());
                return false;
            }
            return false;
        }
        if (!"min-fresh".equals(headerelement.getName()))
        {
            continue; /* Loop/switch isn't completed */
        }
        long l1;
        long l2;
        try
        {
            l1 = Long.parseLong(headerelement.getValue());
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            log.debug((new StringBuilder()).append("Response from cache was malformed: ").append(httphost.getMessage()).toString());
            return false;
        }
        if (l1 < 0L)
        {
            return false;
        }
        l2 = validityStrategy.getCurrentAgeSecs(httpcacheentry, date);
        if (validityStrategy.getFreshnessLifetimeSecs(httpcacheentry) - l2 >= l1)
        {
            continue; /* Loop/switch isn't completed */
        }
        log.trace("Response from cache was not suitable due to min fresh freshness requirement");
        return false;
        j++;
          goto _L3
_L2:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        log.trace("Response from cache was suitable");
        return true;
    }

    public boolean isConditional(HttpRequest httprequest)
    {
        return hasSupportedEtagValidator(httprequest) || hasSupportedLastModifiedValidator(httprequest);
    }
}
