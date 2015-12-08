// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.auth.AuthOption;
import ch.boye.httpclientandroidlib.auth.AuthScheme;
import ch.boye.httpclientandroidlib.auth.AuthScope;
import ch.boye.httpclientandroidlib.auth.AuthenticationException;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.client.AuthCache;
import ch.boye.httpclientandroidlib.client.AuthenticationHandler;
import ch.boye.httpclientandroidlib.client.AuthenticationStrategy;
import ch.boye.httpclientandroidlib.client.CredentialsProvider;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            BasicAuthCache

class AuthenticationStrategyAdaptor
    implements AuthenticationStrategy
{

    private final AuthenticationHandler handler;
    public HttpClientAndroidLog log;

    public AuthenticationStrategyAdaptor(AuthenticationHandler authenticationhandler)
    {
        log = new HttpClientAndroidLog(getClass());
        handler = authenticationhandler;
    }

    private boolean isCachable(AuthScheme authscheme)
    {
        if (authscheme != null && authscheme.isComplete())
        {
            if ((authscheme = authscheme.getSchemeName()).equalsIgnoreCase("Basic") || authscheme.equalsIgnoreCase("Digest"))
            {
                return true;
            }
        }
        return false;
    }

    public void authFailed(HttpHost httphost, AuthScheme authscheme, HttpContext httpcontext)
    {
        httpcontext = (AuthCache)httpcontext.getAttribute("http.auth.auth-cache");
        if (httpcontext == null)
        {
            return;
        }
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Removing from cache '").append(authscheme.getSchemeName()).append("' auth scheme for ").append(httphost).toString());
        }
        httpcontext.remove(httphost);
    }

    public void authSucceeded(HttpHost httphost, AuthScheme authscheme, HttpContext httpcontext)
    {
        AuthCache authcache = (AuthCache)httpcontext.getAttribute("http.auth.auth-cache");
        if (isCachable(authscheme))
        {
            Object obj = authcache;
            if (authcache == null)
            {
                obj = new BasicAuthCache();
                httpcontext.setAttribute("http.auth.auth-cache", obj);
            }
            if (log.isDebugEnabled())
            {
                log.debug((new StringBuilder()).append("Caching '").append(authscheme.getSchemeName()).append("' auth scheme for ").append(httphost).toString());
            }
            ((AuthCache) (obj)).put(httphost, authscheme);
        }
    }

    public Map getChallenges(HttpHost httphost, HttpResponse httpresponse, HttpContext httpcontext)
        throws MalformedChallengeException
    {
        return handler.getChallenges(httpresponse, httpcontext);
    }

    public AuthenticationHandler getHandler()
    {
        return handler;
    }

    public boolean isAuthenticationRequested(HttpHost httphost, HttpResponse httpresponse, HttpContext httpcontext)
    {
        return handler.isAuthenticationRequested(httpresponse, httpcontext);
    }

    public Queue select(Map map, HttpHost httphost, HttpResponse httpresponse, HttpContext httpcontext)
        throws MalformedChallengeException
    {
        LinkedList linkedlist;
        CredentialsProvider credentialsprovider;
        if (map == null)
        {
            throw new IllegalArgumentException("Map of auth challenges may not be null");
        }
        if (httphost == null)
        {
            throw new IllegalArgumentException("Host may not be null");
        }
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        linkedlist = new LinkedList();
        credentialsprovider = (CredentialsProvider)httpcontext.getAttribute("http.auth.credentials-provider");
        if (credentialsprovider != null) goto _L2; else goto _L1
_L1:
        log.debug("Credentials provider not set in the context");
_L4:
        return linkedlist;
_L2:
        httpresponse = handler.selectScheme(map, httpresponse, httpcontext);
        httpresponse.processChallenge((Header)map.get(httpresponse.getSchemeName().toLowerCase(Locale.US)));
        map = credentialsprovider.getCredentials(new AuthScope(httphost.getHostName(), httphost.getPort(), httpresponse.getRealm(), httpresponse.getSchemeName()));
        if (map != null)
        {
            linkedlist.add(new AuthOption(httpresponse, map));
            return linkedlist;
        }
        continue; /* Loop/switch isn't completed */
        map;
        if (log.isWarnEnabled())
        {
            log.warn(map.getMessage(), map);
            return linkedlist;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
