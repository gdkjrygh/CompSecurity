// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.auth.AuthProtocolState;
import ch.boye.httpclientandroidlib.auth.AuthScheme;
import ch.boye.httpclientandroidlib.auth.AuthState;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.client.AuthenticationStrategy;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

public class HttpAuthenticator
{

    public HttpClientAndroidLog log;

    public HttpAuthenticator()
    {
        this(null);
    }

    public HttpAuthenticator(HttpClientAndroidLog httpclientandroidlog)
    {
        if (httpclientandroidlog == null)
        {
            httpclientandroidlog = new HttpClientAndroidLog(getClass());
        }
        log = httpclientandroidlog;
    }

    public boolean authenticate(HttpHost httphost, HttpResponse httpresponse, AuthenticationStrategy authenticationstrategy, AuthState authstate, HttpContext httpcontext)
    {
        Map map;
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append(httphost.toHostString()).append(" requested authentication").toString());
        }
        map = authenticationstrategy.getChallenges(httphost, httpresponse, httpcontext);
        if (!map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_72;
        }
        log.debug("Response contains no authentication challenges");
        return false;
        AuthScheme authscheme = authstate.getAuthScheme();
        static class _cls1
        {

            static final int $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState[];

            static 
            {
                $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState = new int[AuthProtocolState.values().length];
                try
                {
                    $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState[AuthProtocolState.CHALLENGED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState[AuthProtocolState.HANDSHAKE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState[AuthProtocolState.SUCCESS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState[AuthProtocolState.FAILURE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState[AuthProtocolState.UNCHALLENGED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.ch.boye.httpclientandroidlib.auth.AuthProtocolState[authstate.getState().ordinal()];
        JVM INSTR tableswitch 1 5: default 417
    //                   1 257
    //                   2 257
    //                   3 202
    //                   4 420
    //                   5 296;
           goto _L1 _L2 _L2 _L3 _L4 _L5
_L1:
        httphost = authenticationstrategy.select(map, httphost, httpresponse, httpcontext);
        if (httphost == null) goto _L7; else goto _L6
_L6:
        if (httphost.isEmpty()) goto _L7; else goto _L8
_L8:
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Selected authentication options: ").append(httphost).toString());
        }
        authstate.setState(AuthProtocolState.CHALLENGED);
        authstate.update(httphost);
        return true;
_L3:
        try
        {
            authstate.reset();
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            if (log.isWarnEnabled())
            {
                log.warn((new StringBuilder()).append("Malformed challenge: ").append(httphost.getMessage()).toString());
            }
            authstate.reset();
            return false;
        }
          goto _L1
_L2:
        if (authscheme != null) goto _L5; else goto _L9
_L9:
        log.debug("Auth scheme is null");
        authenticationstrategy.authFailed(httphost, null, httpcontext);
        authstate.reset();
        authstate.setState(AuthProtocolState.FAILURE);
        return false;
_L5:
        if (authscheme == null) goto _L1; else goto _L10
_L10:
        Header header = (Header)map.get(authscheme.getSchemeName().toLowerCase(Locale.US));
        if (header == null) goto _L12; else goto _L11
_L11:
        log.debug("Authorization challenge processed");
        authscheme.processChallenge(header);
        if (!authscheme.isComplete()) goto _L14; else goto _L13
_L13:
        log.debug("Authentication failed");
        authenticationstrategy.authFailed(httphost, authstate.getAuthScheme(), httpcontext);
        authstate.reset();
        authstate.setState(AuthProtocolState.FAILURE);
        return false;
_L14:
        authstate.setState(AuthProtocolState.HANDSHAKE);
        return true;
_L12:
        authstate.reset();
          goto _L1
_L7:
        return false;
_L4:
        return false;
    }

    public boolean isAuthenticationRequested(HttpHost httphost, HttpResponse httpresponse, AuthenticationStrategy authenticationstrategy, AuthState authstate, HttpContext httpcontext)
    {
        if (authenticationstrategy.isAuthenticationRequested(httphost, httpresponse, httpcontext))
        {
            return true;
        }
        _cls1..SwitchMap.ch.boye.httpclientandroidlib.auth.AuthProtocolState[authstate.getState().ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 62
    //                   2 62
    //                   3 60;
           goto _L1 _L2 _L2 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        authstate.setState(AuthProtocolState.UNCHALLENGED);
_L5:
        return false;
_L2:
        authstate.setState(AuthProtocolState.SUCCESS);
        authenticationstrategy.authSucceeded(httphost, authstate.getAuthScheme(), httpcontext);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
