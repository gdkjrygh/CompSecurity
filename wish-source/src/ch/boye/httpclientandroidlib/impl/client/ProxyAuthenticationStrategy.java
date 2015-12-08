// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.auth.AuthScheme;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.util.Map;
import java.util.Queue;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            AuthenticationStrategyImpl

public class ProxyAuthenticationStrategy extends AuthenticationStrategyImpl
{

    public ProxyAuthenticationStrategy()
    {
        super(407, "Proxy-Authenticate", "http.auth.proxy-scheme-pref");
    }

    public volatile void authFailed(HttpHost httphost, AuthScheme authscheme, HttpContext httpcontext)
    {
        super.authFailed(httphost, authscheme, httpcontext);
    }

    public volatile void authSucceeded(HttpHost httphost, AuthScheme authscheme, HttpContext httpcontext)
    {
        super.authSucceeded(httphost, authscheme, httpcontext);
    }

    public volatile Map getChallenges(HttpHost httphost, HttpResponse httpresponse, HttpContext httpcontext)
        throws MalformedChallengeException
    {
        return super.getChallenges(httphost, httpresponse, httpcontext);
    }

    public volatile boolean isAuthenticationRequested(HttpHost httphost, HttpResponse httpresponse, HttpContext httpcontext)
    {
        return super.isAuthenticationRequested(httphost, httpresponse, httpcontext);
    }

    public volatile Queue select(Map map, HttpHost httphost, HttpResponse httpresponse, HttpContext httpcontext)
        throws MalformedChallengeException
    {
        return super.select(map, httphost, httpresponse, httpcontext);
    }
}
