// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth;


// Referenced classes of package ch.boye.httpclientandroidlib.auth:
//            AuthScheme, Credentials

public final class AuthOption
{

    private final AuthScheme authScheme;
    private final Credentials creds;

    public AuthOption(AuthScheme authscheme, Credentials credentials)
    {
        if (authscheme == null)
        {
            throw new IllegalArgumentException("Auth scheme may not be null");
        }
        if (credentials == null)
        {
            throw new IllegalArgumentException("User credentials may not be null");
        } else
        {
            authScheme = authscheme;
            creds = credentials;
            return;
        }
    }

    public AuthScheme getAuthScheme()
    {
        return authScheme;
    }

    public Credentials getCredentials()
    {
        return creds;
    }

    public String toString()
    {
        return authScheme.toString();
    }
}
