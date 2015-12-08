// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.impl.cookie.DateUtils;
import ch.boye.httpclientandroidlib.message.BasicHeader;
import ch.boye.httpclientandroidlib.message.BasicHttpResponse;
import java.util.Date;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            CacheValidityPolicy, CacheEntity

class CachedHttpResponseGenerator
{

    private final CacheValidityPolicy validityStrategy;

    CachedHttpResponseGenerator()
    {
        this(new CacheValidityPolicy());
    }

    CachedHttpResponseGenerator(CacheValidityPolicy cachevaliditypolicy)
    {
        validityStrategy = cachevaliditypolicy;
    }

    private void addMissingContentLengthHeader(HttpResponse httpresponse, HttpEntity httpentity)
    {
        while (transferEncodingIsPresent(httpresponse) || httpresponse.getFirstHeader("Content-Length") != null) 
        {
            return;
        }
        httpresponse.setHeader(new BasicHeader("Content-Length", Long.toString(httpentity.getContentLength())));
    }

    private boolean transferEncodingIsPresent(HttpResponse httpresponse)
    {
        return httpresponse.getFirstHeader("Transfer-Encoding") != null;
    }

    HttpResponse generateNotModifiedResponse(HttpCacheEntry httpcacheentry)
    {
        BasicHttpResponse basichttpresponse = new BasicHttpResponse(HttpVersion.HTTP_1_1, 304, "Not Modified");
        ch.boye.httpclientandroidlib.Header header = httpcacheentry.getFirstHeader("Date");
        Object obj = header;
        if (header == null)
        {
            obj = new BasicHeader("Date", DateUtils.formatDate(new Date()));
        }
        basichttpresponse.addHeader(((ch.boye.httpclientandroidlib.Header) (obj)));
        obj = httpcacheentry.getFirstHeader("ETag");
        if (obj != null)
        {
            basichttpresponse.addHeader(((ch.boye.httpclientandroidlib.Header) (obj)));
        }
        obj = httpcacheentry.getFirstHeader("Content-Location");
        if (obj != null)
        {
            basichttpresponse.addHeader(((ch.boye.httpclientandroidlib.Header) (obj)));
        }
        obj = httpcacheentry.getFirstHeader("Expires");
        if (obj != null)
        {
            basichttpresponse.addHeader(((ch.boye.httpclientandroidlib.Header) (obj)));
        }
        obj = httpcacheentry.getFirstHeader("Cache-Control");
        if (obj != null)
        {
            basichttpresponse.addHeader(((ch.boye.httpclientandroidlib.Header) (obj)));
        }
        httpcacheentry = httpcacheentry.getFirstHeader("Vary");
        if (httpcacheentry != null)
        {
            basichttpresponse.addHeader(httpcacheentry);
        }
        return basichttpresponse;
    }

    HttpResponse generateResponse(HttpCacheEntry httpcacheentry)
    {
        BasicHttpResponse basichttpresponse;
        long l;
label0:
        {
            Date date = new Date();
            basichttpresponse = new BasicHttpResponse(HttpVersion.HTTP_1_1, httpcacheentry.getStatusCode(), httpcacheentry.getReasonPhrase());
            CacheEntity cacheentity = new CacheEntity(httpcacheentry);
            basichttpresponse.setHeaders(httpcacheentry.getAllHeaders());
            addMissingContentLengthHeader(basichttpresponse, cacheentity);
            basichttpresponse.setEntity(cacheentity);
            l = validityStrategy.getCurrentAgeSecs(httpcacheentry, date);
            if (l > 0L)
            {
                if (l < 0x7fffffffL)
                {
                    break label0;
                }
                basichttpresponse.setHeader("Age", "2147483648");
            }
            return basichttpresponse;
        }
        basichttpresponse.setHeader("Age", (new StringBuilder()).append("").append((int)l).toString());
        return basichttpresponse;
    }
}
