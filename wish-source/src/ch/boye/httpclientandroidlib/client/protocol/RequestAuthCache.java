// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.protocol;

import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpRequestInterceptor;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.auth.AuthProtocolState;
import ch.boye.httpclientandroidlib.auth.AuthScheme;
import ch.boye.httpclientandroidlib.auth.AuthScope;
import ch.boye.httpclientandroidlib.auth.AuthState;
import ch.boye.httpclientandroidlib.client.AuthCache;
import ch.boye.httpclientandroidlib.client.CredentialsProvider;
import ch.boye.httpclientandroidlib.conn.scheme.Scheme;
import ch.boye.httpclientandroidlib.conn.scheme.SchemeRegistry;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;

public class RequestAuthCache
    implements HttpRequestInterceptor
{

    public HttpClientAndroidLog log;

    public RequestAuthCache()
    {
        log = new HttpClientAndroidLog(getClass());
    }

    private void doPreemptiveAuth(HttpHost httphost, AuthScheme authscheme, AuthState authstate, CredentialsProvider credentialsprovider)
    {
        String s = authscheme.getSchemeName();
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Re-using cached '").append(s).append("' auth scheme for ").append(httphost).toString());
        }
        httphost = credentialsprovider.getCredentials(new AuthScope(httphost, AuthScope.ANY_REALM, s));
        if (httphost != null)
        {
            authstate.setState(AuthProtocolState.SUCCESS);
            authstate.update(authscheme, httphost);
            return;
        } else
        {
            log.debug("No credentials for preemptive authentication");
            return;
        }
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
        AuthCache authcache = (AuthCache)httpcontext.getAttribute("http.auth.auth-cache");
        if (authcache == null)
        {
            log.debug("Auth cache not set in the context");
        } else
        {
            CredentialsProvider credentialsprovider = (CredentialsProvider)httpcontext.getAttribute("http.auth.credentials-provider");
            if (credentialsprovider == null)
            {
                log.debug("Credentials provider not set in the context");
                return;
            }
            Object obj = (HttpHost)httpcontext.getAttribute("http.target_host");
            httprequest = ((HttpRequest) (obj));
            if (((HttpHost) (obj)).getPort() < 0)
            {
                httprequest = ((SchemeRegistry)httpcontext.getAttribute("http.scheme-registry")).getScheme(((HttpHost) (obj)));
                httprequest = new HttpHost(((HttpHost) (obj)).getHostName(), httprequest.resolvePort(((HttpHost) (obj)).getPort()), ((HttpHost) (obj)).getSchemeName());
            }
            obj = (AuthState)httpcontext.getAttribute("http.auth.target-scope");
            if (httprequest != null && obj != null && ((AuthState) (obj)).getState() == AuthProtocolState.UNCHALLENGED)
            {
                AuthScheme authscheme1 = authcache.get(httprequest);
                if (authscheme1 != null)
                {
                    doPreemptiveAuth(httprequest, authscheme1, ((AuthState) (obj)), credentialsprovider);
                }
            }
            httprequest = (HttpHost)httpcontext.getAttribute("http.proxy_host");
            httpcontext = (AuthState)httpcontext.getAttribute("http.auth.proxy-scope");
            if (httprequest != null && httpcontext != null && httpcontext.getState() == AuthProtocolState.UNCHALLENGED)
            {
                AuthScheme authscheme = authcache.get(httprequest);
                if (authscheme != null)
                {
                    doPreemptiveAuth(httprequest, authscheme, httpcontext, credentialsprovider);
                    return;
                }
            }
        }
    }
}
