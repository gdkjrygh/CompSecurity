// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.client.CircularRedirectException;
import ch.boye.httpclientandroidlib.client.RedirectStrategy;
import ch.boye.httpclientandroidlib.client.methods.HttpGet;
import ch.boye.httpclientandroidlib.client.methods.HttpHead;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.client.utils.URIUtils;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            RedirectLocations

public class DefaultRedirectStrategy
    implements RedirectStrategy
{

    public static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    private static final String REDIRECT_METHODS[] = {
        "GET", "HEAD"
    };
    public HttpClientAndroidLog log;

    public DefaultRedirectStrategy()
    {
        log = new HttpClientAndroidLog(getClass());
    }

    protected URI createLocationURI(String s)
        throws ProtocolException
    {
        URI uri;
        try
        {
            uri = (new URI(s)).normalize();
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new ProtocolException((new StringBuilder()).append("Invalid redirect URI: ").append(s).toString(), urisyntaxexception);
        }
        return uri;
    }

    public URI getLocationURI(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
        throws ProtocolException
    {
        Object obj;
        HttpParams httpparams;
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        obj = httpresponse.getFirstHeader("location");
        if (obj == null)
        {
            throw new ProtocolException((new StringBuilder()).append("Received redirect response ").append(httpresponse.getStatusLine()).append(" but no location header").toString());
        }
        httpresponse = ((Header) (obj)).getValue();
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Redirect requested to location '").append(httpresponse).append("'").toString());
        }
        httpresponse = createLocationURI(httpresponse);
        httpparams = httprequest.getParams();
        try
        {
            obj = URIUtils.rewriteURI(httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            throw new ProtocolException(httprequest.getMessage(), httprequest);
        }
        httpresponse = ((HttpResponse) (obj));
        if (((URI) (obj)).isAbsolute())
        {
            break MISSING_BLOCK_LABEL_288;
        }
        if (httpparams.isParameterTrue("http.protocol.reject-relative-redirect"))
        {
            throw new ProtocolException((new StringBuilder()).append("Relative redirect location '").append(obj).append("' not allowed").toString());
        }
        httpresponse = (HttpHost)httpcontext.getAttribute("http.target_host");
        if (httpresponse != null)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        throw new IllegalStateException("Target host not available in the HTTP context");
        httpresponse = URIUtils.resolve(URIUtils.rewriteURI(new URI(httprequest.getRequestLine().getUri()), httpresponse, true), ((URI) (obj)));
        RedirectLocations redirectlocations = (RedirectLocations)httpcontext.getAttribute("http.protocol.redirect-locations");
        httprequest = redirectlocations;
        if (redirectlocations == null)
        {
            httprequest = new RedirectLocations();
            httpcontext.setAttribute("http.protocol.redirect-locations", httprequest);
        }
        if (httpparams.isParameterFalse("http.protocol.allow-circular-redirects") && httprequest.contains(httpresponse))
        {
            throw new CircularRedirectException((new StringBuilder()).append("Circular redirect to '").append(httpresponse).append("'").toString());
        } else
        {
            httprequest.add(httpresponse);
            return httpresponse;
        }
    }

    public HttpUriRequest getRedirect(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
        throws ProtocolException
    {
        httpresponse = getLocationURI(httprequest, httpresponse, httpcontext);
        if (httprequest.getRequestLine().getMethod().equalsIgnoreCase("HEAD"))
        {
            return new HttpHead(httpresponse);
        } else
        {
            return new HttpGet(httpresponse);
        }
    }

    protected boolean isRedirectable(String s)
    {
        String as[] = REDIRECT_METHODS;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (as[i].equalsIgnoreCase(s))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isRedirected(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
        throws ProtocolException
    {
        int i;
        boolean flag;
        boolean flag1;
        flag1 = true;
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        i = httpresponse.getStatusLine().getStatusCode();
        httprequest = httprequest.getRequestLine().getMethod();
        httpresponse = httpresponse.getFirstHeader("location");
        flag = flag1;
        i;
        JVM INSTR tableswitch 301 307: default 112
    //                   301 136
    //                   302 118
    //                   303 115
    //                   304 112
    //                   305 112
    //                   306 112
    //                   307 136;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L2
_L1:
        flag = false;
_L4:
        return flag;
_L3:
        if (!isRedirectable(httprequest))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (httpresponse != null) goto _L4; else goto _L5
_L5:
        return false;
_L2:
        return isRedirectable(httprequest);
    }

}
