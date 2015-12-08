// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpMessage;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.impl.cookie.DateParseException;
import ch.boye.httpclientandroidlib.impl.cookie.DateUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class ResponseCachingPolicy
{

    private static final Set cacheableStatuses = new HashSet(Arrays.asList(new Integer[] {
        Integer.valueOf(200), Integer.valueOf(203), Integer.valueOf(300), Integer.valueOf(301), Integer.valueOf(410)
    }));
    private static final Set uncacheableStatuses = new HashSet(Arrays.asList(new Integer[] {
        Integer.valueOf(206), Integer.valueOf(303)
    }));
    public HttpClientAndroidLog log;
    private final long maxObjectSizeBytes;
    private final boolean sharedCache;

    public ResponseCachingPolicy(long l, boolean flag)
    {
        log = new HttpClientAndroidLog(getClass());
        maxObjectSizeBytes = l;
        sharedCache = flag;
    }

    private boolean expiresHeaderLessOrEqualToDateHeaderAndNoCacheControl(HttpResponse httpresponse)
    {
        if (httpresponse.getFirstHeader("Cache-Control") == null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        obj = httpresponse.getFirstHeader("Expires");
        httpresponse = httpresponse.getFirstHeader("Date");
        if (obj == null || httpresponse == null) goto _L1; else goto _L3
_L3:
        boolean flag;
        try
        {
            obj = DateUtils.parseDate(((Header) (obj)).getValue());
            httpresponse = DateUtils.parseDate(httpresponse.getValue());
            if (((Date) (obj)).equals(httpresponse))
            {
                break; /* Loop/switch isn't completed */
            }
            flag = ((Date) (obj)).before(httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            return false;
        }
        if (!flag) goto _L1; else goto _L4
_L4:
        return true;
    }

    private boolean from1_0Origin(HttpResponse httpresponse)
    {
        Header header = httpresponse.getFirstHeader("Via");
        if (header != null)
        {
            HeaderElement aheaderelement[] = header.getElements();
            if (aheaderelement.length < 0)
            {
                httpresponse = aheaderelement[0].toString().split("\\s")[0];
                if (httpresponse.contains("/"))
                {
                    return httpresponse.equals("HTTP/1.0");
                } else
                {
                    return httpresponse.equals("1.0");
                }
            }
        }
        return HttpVersion.HTTP_1_0.equals(httpresponse.getProtocolVersion());
    }

    private boolean requestProtocolGreaterThanAccepted(HttpRequest httprequest)
    {
        return httprequest.getProtocolVersion().compareToVersion(HttpVersion.HTTP_1_1) > 0;
    }

    private boolean unknownStatusCode(int i)
    {
        while (i >= 100 && i <= 101 || i >= 200 && i <= 206 || i >= 300 && i <= 307 || i >= 400 && i <= 417 || i >= 500 && i <= 505) 
        {
            return false;
        }
        return true;
    }

    protected boolean hasCacheControlParameterFrom(HttpMessage httpmessage, String as[])
    {
        httpmessage = httpmessage.getHeaders("Cache-Control");
        int l = httpmessage.length;
        for (int i = 0; i < l; i++)
        {
            HeaderElement aheaderelement[] = httpmessage[i].getElements();
            int i1 = aheaderelement.length;
            for (int j = 0; j < i1; j++)
            {
                HeaderElement headerelement = aheaderelement[j];
                int j1 = as.length;
                for (int k = 0; k < j1; k++)
                {
                    if (as[k].equalsIgnoreCase(headerelement.getName()))
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    protected boolean isExplicitlyCacheable(HttpResponse httpresponse)
    {
        if (httpresponse.getFirstHeader("Expires") != null)
        {
            return true;
        } else
        {
            return hasCacheControlParameterFrom(httpresponse, new String[] {
                "max-age", "s-maxage", "must-revalidate", "proxy-revalidate", "public"
            });
        }
    }

    protected boolean isExplicitlyNonCacheable(HttpResponse httpresponse)
    {
        httpresponse = httpresponse.getHeaders("Cache-Control");
        int k = httpresponse.length;
        for (int i = 0; i < k; i++)
        {
            HeaderElement aheaderelement[] = httpresponse[i].getElements();
            int l = aheaderelement.length;
            for (int j = 0; j < l; j++)
            {
                HeaderElement headerelement = aheaderelement[j];
                if ("no-store".equals(headerelement.getName()) || "no-cache".equals(headerelement.getName()) || sharedCache && "private".equals(headerelement.getName()))
                {
                    return true;
                }
            }

        }

        return false;
    }

    public boolean isResponseCacheable(HttpRequest httprequest, HttpResponse httpresponse)
    {
        if (requestProtocolGreaterThanAccepted(httprequest))
        {
            log.debug("Response was not cacheable.");
        } else
        if (!hasCacheControlParameterFrom(httprequest, new String[] {
    "no-store"
}))
        {
            if (httprequest.getRequestLine().getUri().contains("?") && (!isExplicitlyCacheable(httpresponse) || from1_0Origin(httpresponse)))
            {
                log.debug("Response was not cacheable.");
                return false;
            }
            if (!expiresHeaderLessOrEqualToDateHeaderAndNoCacheControl(httpresponse))
            {
                if (sharedCache)
                {
                    Header aheader[] = httprequest.getHeaders("Authorization");
                    if (aheader != null && aheader.length > 0)
                    {
                        return hasCacheControlParameterFrom(httpresponse, new String[] {
                            "s-maxage", "must-revalidate", "public"
                        });
                    }
                }
                return isResponseCacheable(httprequest.getRequestLine().getMethod(), httpresponse);
            }
        }
        return false;
    }

    public boolean isResponseCacheable(String s, HttpResponse httpresponse)
    {
        boolean flag = false;
        if (!"GET".equals(s))
        {
            log.debug("Response was not cacheable.");
            return false;
        }
        int i = httpresponse.getStatusLine().getStatusCode();
        if (cacheableStatuses.contains(Integer.valueOf(i)))
        {
            flag = true;
        } else
        {
            if (uncacheableStatuses.contains(Integer.valueOf(i)))
            {
                return false;
            }
            if (unknownStatusCode(i))
            {
                return false;
            }
        }
        s = httpresponse.getFirstHeader("Content-Length");
        if (s != null && (long)Integer.parseInt(s.getValue()) > maxObjectSizeBytes)
        {
            return false;
        }
        if (httpresponse.getHeaders("Age").length > 1)
        {
            return false;
        }
        if (httpresponse.getHeaders("Expires").length > 1)
        {
            return false;
        }
        s = httpresponse.getHeaders("Date");
        if (s.length != 1)
        {
            return false;
        }
        int l;
        try
        {
            DateUtils.parseDate(s[0].getValue());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        s = httpresponse.getHeaders("Vary");
        l = s.length;
        for (int j = 0; j < l; j++)
        {
            HeaderElement aheaderelement[] = s[j].getElements();
            int i1 = aheaderelement.length;
            for (int k = 0; k < i1; k++)
            {
                if ("*".equals(aheaderelement[k].getName()))
                {
                    return false;
                }
            }

        }

        if (isExplicitlyNonCacheable(httpresponse))
        {
            return false;
        }
        return flag || isExplicitlyCacheable(httpresponse);
    }

}
