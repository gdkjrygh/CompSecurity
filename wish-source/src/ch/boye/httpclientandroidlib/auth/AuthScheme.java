// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpRequest;

// Referenced classes of package ch.boye.httpclientandroidlib.auth:
//            AuthenticationException, MalformedChallengeException, Credentials

public interface AuthScheme
{

    public abstract Header authenticate(Credentials credentials, HttpRequest httprequest)
        throws AuthenticationException;

    public abstract String getParameter(String s);

    public abstract String getRealm();

    public abstract String getSchemeName();

    public abstract boolean isComplete();

    public abstract boolean isConnectionBased();

    public abstract void processChallenge(Header header)
        throws MalformedChallengeException;
}
