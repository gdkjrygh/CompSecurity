// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.FormattedHeader;
import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.auth.AuthOption;
import ch.boye.httpclientandroidlib.auth.AuthScheme;
import ch.boye.httpclientandroidlib.auth.AuthSchemeRegistry;
import ch.boye.httpclientandroidlib.auth.AuthScope;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.client.AuthCache;
import ch.boye.httpclientandroidlib.client.AuthenticationStrategy;
import ch.boye.httpclientandroidlib.client.CredentialsProvider;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            BasicAuthCache

class AuthenticationStrategyImpl
    implements AuthenticationStrategy
{

    private static final List DEFAULT_SCHEME_PRIORITY = Collections.unmodifiableList(Arrays.asList(new String[] {
        "negotiate", "Kerberos", "NTLM", "Digest", "Basic"
    }));
    private final int challengeCode;
    private final String headerName;
    public HttpClientAndroidLog log;
    private final String prefParamName;

    AuthenticationStrategyImpl(int i, String s, String s1)
    {
        log = new HttpClientAndroidLog(getClass());
        challengeCode = i;
        headerName = s;
        prefParamName = s1;
    }

    public void authFailed(HttpHost httphost, AuthScheme authscheme, HttpContext httpcontext)
    {
        if (httphost == null)
        {
            throw new IllegalArgumentException("Host may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        authscheme = (AuthCache)httpcontext.getAttribute("http.auth.auth-cache");
        if (authscheme != null)
        {
            if (log.isDebugEnabled())
            {
                log.debug((new StringBuilder()).append("Clearing cached auth scheme for ").append(httphost).toString());
            }
            authscheme.remove(httphost);
        }
    }

    public void authSucceeded(HttpHost httphost, AuthScheme authscheme, HttpContext httpcontext)
    {
        if (httphost == null)
        {
            throw new IllegalArgumentException("Host may not be null");
        }
        if (authscheme == null)
        {
            throw new IllegalArgumentException("Auth scheme may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        if (isCachable(authscheme))
        {
            AuthCache authcache = (AuthCache)httpcontext.getAttribute("http.auth.auth-cache");
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
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        httpresponse = httpresponse.getHeaders(headerName);
        httpcontext = new HashMap(httpresponse.length);
        int l = httpresponse.length;
        for (int k = 0; k < l; k++)
        {
            Header header = httpresponse[k];
            int i;
            if (header instanceof FormattedHeader)
            {
                httphost = ((FormattedHeader)header).getBuffer();
            } else
            {
                String s = header.getValue();
                if (s == null)
                {
                    throw new MalformedChallengeException("Header value is null");
                }
                httphost = new CharArrayBuffer(s.length());
                httphost.append(s);
                i = 0;
            }
            for (i = ((FormattedHeader)header).getValuePos(); i < httphost.length() && HTTP.isWhitespace(httphost.charAt(i)); i++) { }
            int j;
            for (j = i; j < httphost.length() && !HTTP.isWhitespace(httphost.charAt(j)); j++) { }
            httpcontext.put(httphost.substring(i, j).toLowerCase(Locale.US), header);
        }

        return httpcontext;
    }

    public boolean isAuthenticationRequested(HttpHost httphost, HttpResponse httpresponse, HttpContext httpcontext)
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        return httpresponse.getStatusLine().getStatusCode() == challengeCode;
    }

    protected boolean isCachable(AuthScheme authscheme)
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

    public Queue select(Map map, HttpHost httphost, HttpResponse httpresponse, HttpContext httpcontext)
        throws MalformedChallengeException
    {
        LinkedList linkedlist;
        AuthSchemeRegistry authschemeregistry;
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
        authschemeregistry = (AuthSchemeRegistry)httpcontext.getAttribute("http.authscheme-registry");
        if (authschemeregistry != null) goto _L2; else goto _L1
_L1:
        log.debug("Auth scheme registry not set in the context");
_L6:
        return linkedlist;
_L2:
        CredentialsProvider credentialsprovider;
        credentialsprovider = (CredentialsProvider)httpcontext.getAttribute("http.auth.credentials-provider");
        if (credentialsprovider == null)
        {
            log.debug("Credentials provider not set in the context");
            return linkedlist;
        }
        List list = (List)httpresponse.getParams().getParameter(prefParamName);
        httpcontext = list;
        if (list == null)
        {
            httpcontext = DEFAULT_SCHEME_PRIORITY;
        }
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Authentication schemes in the order of preference: ").append(httpcontext).toString());
        }
        httpcontext = httpcontext.iterator();
_L4:
        String s;
        Object obj;
        if (!httpcontext.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        s = (String)httpcontext.next();
        obj = (Header)map.get(s.toLowerCase(Locale.US));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        AuthScheme authscheme;
        authscheme = authschemeregistry.getAuthScheme(s, httpresponse.getParams());
        authscheme.processChallenge(((Header) (obj)));
        obj = credentialsprovider.getCredentials(new AuthScope(httphost.getHostName(), httphost.getPort(), authscheme.getRealm(), authscheme.getSchemeName()));
        if (obj != null)
        {
            try
            {
                linkedlist.add(new AuthOption(authscheme, ((ch.boye.httpclientandroidlib.auth.Credentials) (obj))));
            }
            catch (IllegalStateException illegalstateexception)
            {
                if (log.isWarnEnabled())
                {
                    log.warn((new StringBuilder()).append("Authentication scheme ").append(s).append(" not supported").toString());
                }
            }
        }
        break; /* Loop/switch isn't completed */
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Challenge for ").append(s).append(" authentication scheme not available").toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

}
