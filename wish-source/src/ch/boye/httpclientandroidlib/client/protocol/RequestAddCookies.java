// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.protocol;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpRequestInterceptor;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.client.CookieStore;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.client.params.HttpClientParams;
import ch.boye.httpclientandroidlib.conn.HttpRoutedConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.CookieSpec;
import ch.boye.httpclientandroidlib.cookie.CookieSpecRegistry;
import ch.boye.httpclientandroidlib.cookie.SetCookie2;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RequestAddCookies
    implements HttpRequestInterceptor
{

    public HttpClientAndroidLog log;

    public RequestAddCookies()
    {
        log = new HttpClientAndroidLog(getClass());
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        if (httprequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT"))
        {
            return;
        }
        Object obj1 = (CookieStore)httpcontext.getAttribute("http.cookie-store");
        if (obj1 == null)
        {
            log.debug("Cookie store not specified in HTTP context");
            return;
        }
        Object obj2 = (CookieSpecRegistry)httpcontext.getAttribute("http.cookiespec-registry");
        if (obj2 == null)
        {
            log.debug("CookieSpec registry not specified in HTTP context");
            return;
        }
        Object obj5 = (HttpHost)httpcontext.getAttribute("http.target_host");
        if (obj5 == null)
        {
            log.debug("Target host not set in the context");
            return;
        }
        Object obj4 = (HttpRoutedConnection)httpcontext.getAttribute("http.connection");
        if (obj4 == null)
        {
            log.debug("HTTP connection not set in the context");
            return;
        }
        Object obj3 = HttpClientParams.getCookiePolicy(httprequest.getParams());
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("CookieSpec selected: ").append(((String) (obj3))).toString());
        }
        Object obj;
        String s;
        int i;
        int j;
        if (httprequest instanceof HttpUriRequest)
        {
            obj = ((HttpUriRequest)httprequest).getURI();
        } else
        {
            try
            {
                obj = new URI(httprequest.getRequestLine().getUri());
            }
            // Misplaced declaration of an exception variable
            catch (HttpContext httpcontext)
            {
                throw new ProtocolException((new StringBuilder()).append("Invalid request URI: ").append(httprequest.getRequestLine().getUri()).toString(), httpcontext);
            }
        }
        s = ((HttpHost) (obj5)).getHostName();
        j = ((HttpHost) (obj5)).getPort();
        i = j;
        if (j < 0)
        {
            if (((HttpRoutedConnection) (obj4)).getRoute().getHopCount() == 1)
            {
                i = ((HttpRoutedConnection) (obj4)).getRemotePort();
            } else
            {
                obj5 = ((HttpHost) (obj5)).getSchemeName();
                if (((String) (obj5)).equalsIgnoreCase("http"))
                {
                    i = 80;
                } else
                if (((String) (obj5)).equalsIgnoreCase("https"))
                {
                    i = 443;
                } else
                {
                    i = 0;
                }
            }
        }
        do
        {
            obj = new CookieOrigin(s, i, ((URI) (obj)).getPath(), ((HttpRoutedConnection) (obj4)).isSecure());
            obj2 = ((CookieSpecRegistry) (obj2)).getCookieSpec(((String) (obj3)), httprequest.getParams());
            obj4 = new ArrayList(((CookieStore) (obj1)).getCookies());
            obj1 = new ArrayList();
            obj3 = new Date();
            obj4 = ((List) (obj4)).iterator();
            do
            {
                if (!((Iterator) (obj4)).hasNext())
                {
                    break;
                }
                obj5 = (Cookie)((Iterator) (obj4)).next();
                if (!((Cookie) (obj5)).isExpired(((Date) (obj3))))
                {
                    if (((CookieSpec) (obj2)).match(((Cookie) (obj5)), ((CookieOrigin) (obj))))
                    {
                        if (log.isDebugEnabled())
                        {
                            log.debug((new StringBuilder()).append("Cookie ").append(obj5).append(" match ").append(obj).toString());
                        }
                        ((List) (obj1)).add(obj5);
                    }
                } else
                if (log.isDebugEnabled())
                {
                    log.debug((new StringBuilder()).append("Cookie ").append(obj5).append(" expired").toString());
                }
            } while (true);
            if (!((List) (obj1)).isEmpty())
            {
                for (Iterator iterator = ((CookieSpec) (obj2)).formatCookies(((List) (obj1))).iterator(); iterator.hasNext(); httprequest.addHeader((Header)iterator.next())) { }
            }
            int k = ((CookieSpec) (obj2)).getVersion();
            if (k > 0)
            {
                boolean flag = false;
                obj1 = ((List) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    Cookie cookie = (Cookie)((Iterator) (obj1)).next();
                    if (k != cookie.getVersion() || !(cookie instanceof SetCookie2))
                    {
                        flag = true;
                    }
                } while (true);
                if (flag)
                {
                    Header header = ((CookieSpec) (obj2)).getVersionHeader();
                    if (header != null)
                    {
                        httprequest.addHeader(header);
                    }
                }
            }
            httpcontext.setAttribute("http.cookie-spec", obj2);
            httpcontext.setAttribute("http.cookie-origin", obj);
            return;
        } while (true);
    }
}
