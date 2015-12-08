// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.FormattedHeader;
import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.auth.AuthScheme;
import ch.boye.httpclientandroidlib.auth.AuthSchemeRegistry;
import ch.boye.httpclientandroidlib.auth.AuthenticationException;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.client.AuthenticationHandler;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public abstract class AbstractAuthenticationHandler
    implements AuthenticationHandler
{

    private static final List DEFAULT_SCHEME_PRIORITY = Collections.unmodifiableList(Arrays.asList(new String[] {
        "negotiate", "NTLM", "Digest", "Basic"
    }));
    public HttpClientAndroidLog log;

    public AbstractAuthenticationHandler()
    {
        log = new HttpClientAndroidLog(getClass());
    }

    protected List getAuthPreferences()
    {
        return DEFAULT_SCHEME_PRIORITY;
    }

    protected List getAuthPreferences(HttpResponse httpresponse, HttpContext httpcontext)
    {
        return getAuthPreferences();
    }

    protected Map parseChallenges(Header aheader[])
        throws MalformedChallengeException
    {
        HashMap hashmap = new HashMap(aheader.length);
        int l = aheader.length;
        for (int k = 0; k < l; k++)
        {
            Header header = aheader[k];
            CharArrayBuffer chararraybuffer;
            int i;
            if (header instanceof FormattedHeader)
            {
                chararraybuffer = ((FormattedHeader)header).getBuffer();
            } else
            {
                String s = header.getValue();
                if (s == null)
                {
                    throw new MalformedChallengeException("Header value is null");
                }
                chararraybuffer = new CharArrayBuffer(s.length());
                chararraybuffer.append(s);
                i = 0;
            }
            for (i = ((FormattedHeader)header).getValuePos(); i < chararraybuffer.length() && HTTP.isWhitespace(chararraybuffer.charAt(i)); i++) { }
            int j;
            for (j = i; j < chararraybuffer.length() && !HTTP.isWhitespace(chararraybuffer.charAt(j)); j++) { }
            hashmap.put(chararraybuffer.substring(i, j).toLowerCase(Locale.US), header);
        }

        return hashmap;
    }

    public AuthScheme selectScheme(Map map, HttpResponse httpresponse, HttpContext httpcontext)
        throws AuthenticationException
    {
        AuthSchemeRegistry authschemeregistry = (AuthSchemeRegistry)httpcontext.getAttribute("http.authscheme-registry");
        if (authschemeregistry == null)
        {
            throw new IllegalStateException("AuthScheme registry not set in HTTP context");
        }
        List list = getAuthPreferences(httpresponse, httpcontext);
        httpcontext = list;
        if (list == null)
        {
            httpcontext = DEFAULT_SCHEME_PRIORITY;
        }
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Authentication schemes in the order of preference: ").append(httpcontext).toString());
        }
        list = null;
        Iterator iterator = httpcontext.iterator();
        do
        {
label0:
            {
                httpcontext = list;
                String s;
                if (iterator.hasNext())
                {
                    s = (String)iterator.next();
                    if ((Header)map.get(s.toLowerCase(Locale.ENGLISH)) == null)
                    {
                        break label0;
                    }
                    if (log.isDebugEnabled())
                    {
                        log.debug((new StringBuilder()).append(s).append(" authentication scheme selected").toString());
                    }
                    try
                    {
                        httpcontext = authschemeregistry.getAuthScheme(s, httpresponse.getParams());
                    }
                    // Misplaced declaration of an exception variable
                    catch (HttpContext httpcontext)
                    {
                        if (log.isWarnEnabled())
                        {
                            log.warn((new StringBuilder()).append("Authentication scheme ").append(s).append(" not supported").toString());
                        }
                        continue;
                    }
                }
                if (httpcontext == null)
                {
                    throw new AuthenticationException((new StringBuilder()).append("Unable to respond to any of these challenges: ").append(map).toString());
                } else
                {
                    return httpcontext;
                }
            }
            if (log.isDebugEnabled())
            {
                log.debug((new StringBuilder()).append("Challenge for ").append(s).append(" authentication scheme not available").toString());
            }
        } while (true);
    }

}
