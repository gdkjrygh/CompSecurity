// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.androidextra.Base64;
import ch.boye.httpclientandroidlib.auth.AuthenticationException;
import ch.boye.httpclientandroidlib.auth.ChallengeState;
import ch.boye.httpclientandroidlib.auth.Credentials;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.auth.params.AuthParams;
import ch.boye.httpclientandroidlib.message.BufferedHeader;
import ch.boye.httpclientandroidlib.protocol.BasicHttpContext;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import ch.boye.httpclientandroidlib.util.EncodingUtils;
import java.security.Principal;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.auth:
//            RFC2617Scheme

public class BasicScheme extends RFC2617Scheme
{

    private boolean complete;

    public BasicScheme()
    {
        this(null);
    }

    public BasicScheme(ChallengeState challengestate)
    {
        super(challengestate);
        complete = false;
    }

    public static Header authenticate(Credentials credentials, String s, boolean flag)
    {
        if (credentials == null)
        {
            throw new IllegalArgumentException("Credentials may not be null");
        }
        if (s == null)
        {
            throw new IllegalArgumentException("charset may not be null");
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(credentials.getUserPrincipal().getName());
        stringbuilder.append(":");
        if (credentials.getPassword() == null)
        {
            credentials = "null";
        } else
        {
            credentials = credentials.getPassword();
        }
        stringbuilder.append(credentials);
        credentials = Base64.encode(EncodingUtils.getBytes(stringbuilder.toString(), s), 2);
        s = new CharArrayBuffer(32);
        if (flag)
        {
            s.append("Proxy-Authorization");
        } else
        {
            s.append("Authorization");
        }
        s.append(": Basic ");
        s.append(credentials, 0, credentials.length);
        return new BufferedHeader(s);
    }

    public Header authenticate(Credentials credentials, HttpRequest httprequest)
        throws AuthenticationException
    {
        return authenticate(credentials, httprequest, ((HttpContext) (new BasicHttpContext())));
    }

    public Header authenticate(Credentials credentials, HttpRequest httprequest, HttpContext httpcontext)
        throws AuthenticationException
    {
        if (credentials == null)
        {
            throw new IllegalArgumentException("Credentials may not be null");
        }
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else
        {
            return authenticate(credentials, AuthParams.getCredentialCharset(httprequest.getParams()), isProxy());
        }
    }

    public String getSchemeName()
    {
        return "basic";
    }

    public boolean isComplete()
    {
        return complete;
    }

    public boolean isConnectionBased()
    {
        return false;
    }

    public void processChallenge(Header header)
        throws MalformedChallengeException
    {
        super.processChallenge(header);
        complete = true;
    }
}
