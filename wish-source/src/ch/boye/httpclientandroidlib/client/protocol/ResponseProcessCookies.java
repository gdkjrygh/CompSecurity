// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.protocol;

import ch.boye.httpclientandroidlib.HeaderIterator;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpResponseInterceptor;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.client.CookieStore;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.CookieSpec;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ResponseProcessCookies
    implements HttpResponseInterceptor
{

    public HttpClientAndroidLog log;

    public ResponseProcessCookies()
    {
        log = new HttpClientAndroidLog(getClass());
    }

    private void processCookies(HeaderIterator headeriterator, CookieSpec cookiespec, CookieOrigin cookieorigin, CookieStore cookiestore)
    {
_L4:
        ch.boye.httpclientandroidlib.Header header;
        if (!headeriterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        header = headeriterator.nextHeader();
        Iterator iterator = cookiespec.parse(header, cookieorigin).iterator();
_L1:
        Cookie cookie;
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        cookie = (Cookie)iterator.next();
        cookiespec.validate(cookie, cookieorigin);
        cookiestore.addCookie(cookie);
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Cookie accepted: \"").append(cookie).append("\". ").toString());
        }
          goto _L1
        MalformedCookieException malformedcookieexception1;
        malformedcookieexception1;
        if (!log.isWarnEnabled()) goto _L1; else goto _L2
_L2:
        log.warn((new StringBuilder()).append("Cookie rejected: \"").append(cookie).append("\". ").append(malformedcookieexception1.getMessage()).toString());
          goto _L1
        MalformedCookieException malformedcookieexception;
        malformedcookieexception;
        if (log.isWarnEnabled())
        {
            log.warn((new StringBuilder()).append("Invalid cookie header: \"").append(header).append("\". ").append(malformedcookieexception.getMessage()).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void process(HttpResponse httpresponse, HttpContext httpcontext)
        throws HttpException, IOException
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        CookieSpec cookiespec = (CookieSpec)httpcontext.getAttribute("http.cookie-spec");
        if (cookiespec == null)
        {
            log.debug("Cookie spec not specified in HTTP context");
        } else
        {
            CookieStore cookiestore = (CookieStore)httpcontext.getAttribute("http.cookie-store");
            if (cookiestore == null)
            {
                log.debug("Cookie store not specified in HTTP context");
                return;
            }
            httpcontext = (CookieOrigin)httpcontext.getAttribute("http.cookie-origin");
            if (httpcontext == null)
            {
                log.debug("Cookie origin not specified in HTTP context");
                return;
            }
            processCookies(httpresponse.headerIterator("Set-Cookie"), cookiespec, httpcontext, cookiestore);
            if (cookiespec.getVersion() > 0)
            {
                processCookies(httpresponse.headerIterator("Set-Cookie2"), cookiespec, httpcontext, cookiestore);
                return;
            }
        }
    }
}
