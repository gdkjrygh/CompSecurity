// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpDate, HeaderParser, OkHeaders

public final class CacheStrategy
{
    public static class Factory
    {

        private int ageSeconds;
        final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        final long nowMillis;
        private long receivedResponseMillis;
        final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        private long cacheResponseAge()
        {
            long l = 0L;
            if (servedDate != null)
            {
                l = Math.max(0L, receivedResponseMillis - servedDate.getTime());
            }
            if (ageSeconds != -1)
            {
                l = Math.max(l, TimeUnit.SECONDS.toMillis(ageSeconds));
            }
            return l + (receivedResponseMillis - sentRequestMillis) + (nowMillis - receivedResponseMillis);
        }

        private long computeFreshnessLifetime()
        {
            long l1 = 0L;
            CacheControl cachecontrol = cacheResponse.cacheControl();
            long l;
            if (cachecontrol.maxAgeSeconds() != -1)
            {
                l = TimeUnit.SECONDS.toMillis(cachecontrol.maxAgeSeconds());
            } else
            {
                if (expires != null)
                {
                    if (servedDate != null)
                    {
                        l = servedDate.getTime();
                    } else
                    {
                        l = receivedResponseMillis;
                    }
                    l = expires.getTime() - l;
                    if (l <= 0L)
                    {
                        l = 0L;
                    }
                    return l;
                }
                l = l1;
                if (lastModified != null)
                {
                    l = l1;
                    if (cacheResponse.request().url().getQuery() == null)
                    {
                        long l2;
                        if (servedDate != null)
                        {
                            l = servedDate.getTime();
                        } else
                        {
                            l = sentRequestMillis;
                        }
                        l2 = l - lastModified.getTime();
                        l = l1;
                        if (l2 > 0L)
                        {
                            return l2 / 10L;
                        }
                    }
                }
            }
            return l;
        }

        private CacheStrategy getCandidate()
        {
            if (cacheResponse == null)
            {
                return new CacheStrategy(request, null);
            }
            if (request.isHttps() && cacheResponse.handshake() == null)
            {
                return new CacheStrategy(request, null);
            }
            if (!CacheStrategy.isCacheable(cacheResponse, request))
            {
                return new CacheStrategy(request, null);
            }
            Object obj = request.cacheControl();
            if (((CacheControl) (obj)).noCache() || hasConditions(request))
            {
                return new CacheStrategy(request, null);
            }
            long l4 = cacheResponseAge();
            long l1 = computeFreshnessLifetime();
            long l = l1;
            if (((CacheControl) (obj)).maxAgeSeconds() != -1)
            {
                l = Math.min(l1, TimeUnit.SECONDS.toMillis(((CacheControl) (obj)).maxAgeSeconds()));
            }
            l1 = 0L;
            if (((CacheControl) (obj)).minFreshSeconds() != -1)
            {
                l1 = TimeUnit.SECONDS.toMillis(((CacheControl) (obj)).minFreshSeconds());
            }
            long l3 = 0L;
            CacheControl cachecontrol = cacheResponse.cacheControl();
            long l2 = l3;
            if (!cachecontrol.mustRevalidate())
            {
                l2 = l3;
                if (((CacheControl) (obj)).maxStaleSeconds() != -1)
                {
                    l2 = TimeUnit.SECONDS.toMillis(((CacheControl) (obj)).maxStaleSeconds());
                }
            }
            if (!cachecontrol.noCache() && l4 + l1 < l + l2)
            {
                obj = cacheResponse.newBuilder();
                if (l4 + l1 >= l)
                {
                    ((com.squareup.okhttp.Response.Builder) (obj)).addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                }
                if (l4 > 0x5265c00L && isFreshnessLifetimeHeuristic())
                {
                    ((com.squareup.okhttp.Response.Builder) (obj)).addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                }
                return new CacheStrategy(null, ((com.squareup.okhttp.Response.Builder) (obj)).build());
            }
            obj = request.newBuilder();
            if (etag != null)
            {
                ((com.squareup.okhttp.Request.Builder) (obj)).header("If-None-Match", etag);
            } else
            if (lastModified != null)
            {
                ((com.squareup.okhttp.Request.Builder) (obj)).header("If-Modified-Since", lastModifiedString);
            } else
            if (servedDate != null)
            {
                ((com.squareup.okhttp.Request.Builder) (obj)).header("If-Modified-Since", servedDateString);
            }
            obj = ((com.squareup.okhttp.Request.Builder) (obj)).build();
            if (hasConditions(((Request) (obj))))
            {
                return new CacheStrategy(((Request) (obj)), cacheResponse);
            } else
            {
                return new CacheStrategy(((Request) (obj)), null);
            }
        }

        private static boolean hasConditions(Request request1)
        {
            return request1.header("If-Modified-Since") != null || request1.header("If-None-Match") != null;
        }

        private boolean isFreshnessLifetimeHeuristic()
        {
            return cacheResponse.cacheControl().maxAgeSeconds() == -1 && expires == null;
        }

        public CacheStrategy get()
        {
            CacheStrategy cachestrategy1 = getCandidate();
            CacheStrategy cachestrategy = cachestrategy1;
            if (cachestrategy1.networkRequest != null)
            {
                cachestrategy = cachestrategy1;
                if (request.cacheControl().onlyIfCached())
                {
                    cachestrategy = new CacheStrategy(null, null);
                }
            }
            return cachestrategy;
        }

        public Factory(long l, Request request1, Response response)
        {
            ageSeconds = -1;
            nowMillis = l;
            request = request1;
            cacheResponse = response;
            if (response != null)
            {
                request1 = response.headers();
                int i = 0;
                int j = request1.size();
                while (i < j) 
                {
                    response = request1.name(i);
                    String s = request1.value(i);
                    if ("Date".equalsIgnoreCase(response))
                    {
                        servedDate = HttpDate.parse(s);
                        servedDateString = s;
                    } else
                    if ("Expires".equalsIgnoreCase(response))
                    {
                        expires = HttpDate.parse(s);
                    } else
                    if ("Last-Modified".equalsIgnoreCase(response))
                    {
                        lastModified = HttpDate.parse(s);
                        lastModifiedString = s;
                    } else
                    if ("ETag".equalsIgnoreCase(response))
                    {
                        etag = s;
                    } else
                    if ("Age".equalsIgnoreCase(response))
                    {
                        ageSeconds = HeaderParser.parseSeconds(s, -1);
                    } else
                    if (OkHeaders.SENT_MILLIS.equalsIgnoreCase(response))
                    {
                        sentRequestMillis = Long.parseLong(s);
                    } else
                    if (OkHeaders.RECEIVED_MILLIS.equalsIgnoreCase(response))
                    {
                        receivedResponseMillis = Long.parseLong(s);
                    }
                    i++;
                }
            }
        }
    }


    public final Response cacheResponse;
    public final Request networkRequest;

    private CacheStrategy(Request request, Response response)
    {
        networkRequest = request;
        cacheResponse = response;
    }


    public static boolean isCacheable(Response response, Request request)
    {
        response.code();
        JVM INSTR lookupswitch 13: default 120
    //                   200: 162
    //                   203: 162
    //                   204: 162
    //                   300: 162
    //                   301: 162
    //                   302: 122
    //                   307: 122
    //                   308: 162
    //                   404: 162
    //                   405: 162
    //                   410: 162
    //                   414: 162
    //                   501: 162;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        return false;
_L3:
        if (response.header("Expires") == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate())
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (!response.cacheControl().noStore() && !request.cacheControl().noStore())
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
