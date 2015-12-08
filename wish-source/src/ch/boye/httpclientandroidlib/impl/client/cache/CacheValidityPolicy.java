// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.client.cache.Resource;
import ch.boye.httpclientandroidlib.impl.cookie.DateParseException;
import ch.boye.httpclientandroidlib.impl.cookie.DateUtils;
import java.util.Date;

class CacheValidityPolicy
{

    public static final long MAX_AGE = 0x80000000L;

    CacheValidityPolicy()
    {
    }

    private boolean mayReturnStaleIfError(Header aheader[], long l)
    {
        int i;
        int k;
        boolean flag;
        flag = false;
        k = aheader.length;
        i = 0;
_L5:
        if (i >= k) goto _L2; else goto _L1
_L1:
        HeaderElement aheaderelement[];
        int j;
        int i1;
        aheaderelement = aheader[i].getElements();
        i1 = aheaderelement.length;
        j = 0;
_L3:
        HeaderElement headerelement;
        boolean flag1;
        flag1 = flag;
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        headerelement = aheaderelement[j];
        if (!"stale-if-error".equals(headerelement.getName()))
        {
            break MISSING_BLOCK_LABEL_107;
        }
        int j1 = Integer.parseInt(headerelement.getValue());
        if (l > (long)j1)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        flag1 = true;
        i++;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        NumberFormatException numberformatexception;
        numberformatexception;
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        return flag;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected boolean contentLengthHeaderMatchesActualLength(HttpCacheEntry httpcacheentry)
    {
        return !hasContentLengthHeader(httpcacheentry) || getContentLengthValue(httpcacheentry) == httpcacheentry.getResource().length();
    }

    protected long getAgeValue(HttpCacheEntry httpcacheentry)
    {
        int i;
        int j;
        long l1;
        l1 = 0L;
        httpcacheentry = httpcacheentry.getHeaders("Age");
        j = httpcacheentry.length;
        i = 0;
_L2:
        Header header;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        header = httpcacheentry[i];
        long l2 = Long.parseLong(header.getValue());
        long l;
        l = l2;
        if (l2 < 0L)
        {
            l = 0x80000000L;
        }
_L3:
        long l3 = l1;
        if (l > l1)
        {
            l3 = l;
        }
        i++;
        l1 = l3;
        if (true) goto _L2; else goto _L1
        NumberFormatException numberformatexception;
        numberformatexception;
        l = 0x80000000L;
          goto _L3
_L1:
        return l1;
    }

    protected long getApparentAgeSecs(HttpCacheEntry httpcacheentry)
    {
        long l = 0L;
        Date date = getDateValue(httpcacheentry);
        if (date == null)
        {
            l = 0x80000000L;
        } else
        {
            long l1 = httpcacheentry.getResponseDate().getTime() - date.getTime();
            if (l1 >= 0L)
            {
                return l1 / 1000L;
            }
        }
        return l;
    }

    protected long getContentLengthValue(HttpCacheEntry httpcacheentry)
    {
        httpcacheentry = httpcacheentry.getFirstHeader("Content-Length");
        if (httpcacheentry == null)
        {
            return -1L;
        }
        long l;
        try
        {
            l = Long.parseLong(httpcacheentry.getValue());
        }
        // Misplaced declaration of an exception variable
        catch (HttpCacheEntry httpcacheentry)
        {
            return -1L;
        }
        return l;
    }

    protected long getCorrectedInitialAgeSecs(HttpCacheEntry httpcacheentry)
    {
        return getCorrectedReceivedAgeSecs(httpcacheentry) + getResponseDelaySecs(httpcacheentry);
    }

    protected long getCorrectedReceivedAgeSecs(HttpCacheEntry httpcacheentry)
    {
        long l = getApparentAgeSecs(httpcacheentry);
        long l1 = getAgeValue(httpcacheentry);
        if (l > l1)
        {
            return l;
        } else
        {
            return l1;
        }
    }

    public long getCurrentAgeSecs(HttpCacheEntry httpcacheentry, Date date)
    {
        return getCorrectedInitialAgeSecs(httpcacheentry) + getResidentTimeSecs(httpcacheentry, date);
    }

    protected Date getDateValue(HttpCacheEntry httpcacheentry)
    {
        httpcacheentry = httpcacheentry.getFirstHeader("Date");
        if (httpcacheentry == null)
        {
            return null;
        }
        try
        {
            httpcacheentry = DateUtils.parseDate(httpcacheentry.getValue());
        }
        // Misplaced declaration of an exception variable
        catch (HttpCacheEntry httpcacheentry)
        {
            return null;
        }
        return httpcacheentry;
    }

    protected Date getExpirationDate(HttpCacheEntry httpcacheentry)
    {
        httpcacheentry = httpcacheentry.getFirstHeader("Expires");
        if (httpcacheentry == null)
        {
            return null;
        }
        try
        {
            httpcacheentry = DateUtils.parseDate(httpcacheentry.getValue());
        }
        // Misplaced declaration of an exception variable
        catch (HttpCacheEntry httpcacheentry)
        {
            return null;
        }
        return httpcacheentry;
    }

    public long getFreshnessLifetimeSecs(HttpCacheEntry httpcacheentry)
    {
        long l = getMaxAge(httpcacheentry);
        if (l > -1L)
        {
            return l;
        }
        Date date = getDateValue(httpcacheentry);
        if (date == null)
        {
            return 0L;
        }
        httpcacheentry = getExpirationDate(httpcacheentry);
        if (httpcacheentry == null)
        {
            return 0L;
        } else
        {
            return (httpcacheentry.getTime() - date.getTime()) / 1000L;
        }
    }

    public long getHeuristicFreshnessLifetimeSecs(HttpCacheEntry httpcacheentry, float f, long l)
    {
label0:
        {
            Date date = getDateValue(httpcacheentry);
            httpcacheentry = getLastModifiedValue(httpcacheentry);
            long l1 = l;
            if (date != null)
            {
                l1 = l;
                if (httpcacheentry != null)
                {
                    l = date.getTime() - httpcacheentry.getTime();
                    if (l >= 0L)
                    {
                        break label0;
                    }
                    l1 = 0L;
                }
            }
            return l1;
        }
        return (long)((float)(l / 1000L) * f);
    }

    protected Date getLastModifiedValue(HttpCacheEntry httpcacheentry)
    {
        httpcacheentry = httpcacheentry.getFirstHeader("Last-Modified");
        if (httpcacheentry == null)
        {
            return null;
        }
        try
        {
            httpcacheentry = DateUtils.parseDate(httpcacheentry.getValue());
        }
        // Misplaced declaration of an exception variable
        catch (HttpCacheEntry httpcacheentry)
        {
            return null;
        }
        return httpcacheentry;
    }

    protected long getMaxAge(HttpCacheEntry httpcacheentry)
    {
        int i;
        int k;
        long l2;
        l2 = -1L;
        httpcacheentry = httpcacheentry.getHeaders("Cache-Control");
        k = httpcacheentry.length;
        i = 0;
_L6:
        if (i >= k) goto _L2; else goto _L1
_L1:
        HeaderElement aheaderelement[];
        int j;
        int l;
        aheaderelement = httpcacheentry[i].getElements();
        l = aheaderelement.length;
        j = 0;
_L4:
        HeaderElement headerelement;
        long l1;
        if (j >= l)
        {
            continue; /* Loop/switch isn't completed */
        }
        headerelement = aheaderelement[j];
        if (!"max-age".equals(headerelement.getName()))
        {
            l1 = l2;
            if (!"s-maxage".equals(headerelement.getName()))
            {
                break MISSING_BLOCK_LABEL_123;
            }
        }
        long l3 = Long.parseLong(headerelement.getValue());
        if (l2 != -1L)
        {
            l1 = l2;
            if (l3 >= l2)
            {
                break MISSING_BLOCK_LABEL_123;
            }
        }
        l1 = l3;
_L5:
        j++;
        l2 = l1;
        if (true) goto _L4; else goto _L3
_L3:
        NumberFormatException numberformatexception;
        continue; /* Loop/switch isn't completed */
        numberformatexception;
        l1 = 0L;
          goto _L5
        i++;
          goto _L6
_L2:
        return l2;
    }

    protected long getResidentTimeSecs(HttpCacheEntry httpcacheentry, Date date)
    {
        return (date.getTime() - httpcacheentry.getResponseDate().getTime()) / 1000L;
    }

    protected long getResponseDelaySecs(HttpCacheEntry httpcacheentry)
    {
        return (httpcacheentry.getResponseDate().getTime() - httpcacheentry.getRequestDate().getTime()) / 1000L;
    }

    public long getStalenessSecs(HttpCacheEntry httpcacheentry, Date date)
    {
        long l = getCurrentAgeSecs(httpcacheentry, date);
        long l1 = getFreshnessLifetimeSecs(httpcacheentry);
        if (l <= l1)
        {
            return 0L;
        } else
        {
            return l - l1;
        }
    }

    public boolean hasCacheControlDirective(HttpCacheEntry httpcacheentry, String s)
    {
        httpcacheentry = httpcacheentry.getHeaders("Cache-Control");
        int k = httpcacheentry.length;
        for (int i = 0; i < k; i++)
        {
            HeaderElement aheaderelement[] = httpcacheentry[i].getElements();
            int l = aheaderelement.length;
            for (int j = 0; j < l; j++)
            {
                if (s.equalsIgnoreCase(aheaderelement[j].getName()))
                {
                    return true;
                }
            }

        }

        return false;
    }

    protected boolean hasContentLengthHeader(HttpCacheEntry httpcacheentry)
    {
        return httpcacheentry.getFirstHeader("Content-Length") != null;
    }

    public boolean isResponseFresh(HttpCacheEntry httpcacheentry, Date date)
    {
        return getCurrentAgeSecs(httpcacheentry, date) < getFreshnessLifetimeSecs(httpcacheentry);
    }

    public boolean isResponseHeuristicallyFresh(HttpCacheEntry httpcacheentry, Date date, float f, long l)
    {
        return getCurrentAgeSecs(httpcacheentry, date) < getHeuristicFreshnessLifetimeSecs(httpcacheentry, f, l);
    }

    public boolean isRevalidatable(HttpCacheEntry httpcacheentry)
    {
        return httpcacheentry.getFirstHeader("ETag") != null || httpcacheentry.getFirstHeader("Last-Modified") != null;
    }

    public boolean mayReturnStaleIfError(HttpRequest httprequest, HttpCacheEntry httpcacheentry, Date date)
    {
        long l = getStalenessSecs(httpcacheentry, date);
        return mayReturnStaleIfError(httprequest.getHeaders("Cache-Control"), l) || mayReturnStaleIfError(httpcacheentry.getHeaders("Cache-Control"), l);
    }

    public boolean mayReturnStaleWhileRevalidating(HttpCacheEntry httpcacheentry, Date date)
    {
        Header aheader[];
        int i;
        int k;
        aheader = httpcacheentry.getHeaders("Cache-Control");
        k = aheader.length;
        i = 0;
_L5:
        HeaderElement aheaderelement[];
        int j;
        int l;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        aheaderelement = aheader[i].getElements();
        l = aheaderelement.length;
        j = 0;
_L3:
        if (j >= l) goto _L2; else goto _L1
_L1:
        HeaderElement headerelement;
        headerelement = aheaderelement[j];
        if (!"stale-while-revalidate".equalsIgnoreCase(headerelement.getName()))
        {
            continue; /* Loop/switch isn't completed */
        }
        int i1;
        long l1;
        i1 = Integer.parseInt(headerelement.getValue());
        l1 = getStalenessSecs(httpcacheentry, date);
        if (l1 <= (long)i1)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
        NumberFormatException numberformatexception;
        numberformatexception;
        j++;
          goto _L3
_L2:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return false;
    }

    public boolean mustRevalidate(HttpCacheEntry httpcacheentry)
    {
        return hasCacheControlDirective(httpcacheentry, "must-revalidate");
    }

    public boolean proxyRevalidate(HttpCacheEntry httpcacheentry)
    {
        return hasCacheControlDirective(httpcacheentry, "proxy-revalidate");
    }
}
