// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;

import ch.boye.httpclientandroidlib.FormattedHeader;
import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.auth.AuthenticationException;
import ch.boye.httpclientandroidlib.auth.ChallengeState;
import ch.boye.httpclientandroidlib.auth.ContextAwareAuthScheme;
import ch.boye.httpclientandroidlib.auth.Credentials;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.util.Locale;

public abstract class AuthSchemeBase
    implements ContextAwareAuthScheme
{

    private ChallengeState challengeState;

    public AuthSchemeBase()
    {
        this(null);
    }

    public AuthSchemeBase(ChallengeState challengestate)
    {
        challengeState = challengestate;
    }

    public Header authenticate(Credentials credentials, HttpRequest httprequest, HttpContext httpcontext)
        throws AuthenticationException
    {
        return authenticate(credentials, httprequest);
    }

    public ChallengeState getChallengeState()
    {
        return challengeState;
    }

    public boolean isProxy()
    {
        return challengeState != null && challengeState == ChallengeState.PROXY;
    }

    protected abstract void parseChallenge(CharArrayBuffer chararraybuffer, int i, int j)
        throws MalformedChallengeException;

    public void processChallenge(Header header)
        throws MalformedChallengeException
    {
        if (header == null)
        {
            throw new IllegalArgumentException("Header may not be null");
        }
        Object obj = header.getName();
        int i;
        if (((String) (obj)).equalsIgnoreCase("WWW-Authenticate"))
        {
            challengeState = ChallengeState.TARGET;
        } else
        if (((String) (obj)).equalsIgnoreCase("Proxy-Authenticate"))
        {
            challengeState = ChallengeState.PROXY;
        } else
        {
            throw new MalformedChallengeException((new StringBuilder()).append("Unexpected header name: ").append(((String) (obj))).toString());
        }
        if (header instanceof FormattedHeader)
        {
            obj = ((FormattedHeader)header).getBuffer();
            i = ((FormattedHeader)header).getValuePos();
        } else
        {
            obj = header.getValue();
            if (obj == null)
            {
                throw new MalformedChallengeException("Header value is null");
            }
            header = new CharArrayBuffer(((String) (obj)).length());
            header.append(((String) (obj)));
            i = 0;
        }
        for (header = ((Header) (obj)); i < header.length() && HTTP.isWhitespace(header.charAt(i)); i++) { }
        int j;
        for (j = i; j < header.length() && !HTTP.isWhitespace(header.charAt(j)); j++) { }
        obj = header.substring(i, j);
        if (!((String) (obj)).equalsIgnoreCase(getSchemeName()))
        {
            throw new MalformedChallengeException((new StringBuilder()).append("Invalid scheme identifier: ").append(((String) (obj))).toString());
        } else
        {
            parseChallenge(header, j, header.length());
            return;
        }
    }

    public String toString()
    {
        String s = getSchemeName();
        if (s != null)
        {
            return s.toUpperCase(Locale.US);
        } else
        {
            return super.toString();
        }
    }
}
