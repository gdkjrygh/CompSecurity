// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_AuthenticateThirdPartyBody, ThirdPartyCredentials

public abstract class AuthenticateThirdPartyBody
{

    public AuthenticateThirdPartyBody()
    {
    }

    public static AuthenticateThirdPartyBody create(ThirdPartyCredentials thirdpartycredentials)
    {
        return (new Shape_AuthenticateThirdPartyBody()).setCredentials(thirdpartycredentials);
    }

    public static AuthenticateThirdPartyBody createGoogleAuthBody(ThirdPartyCredentials thirdpartycredentials, String s, String s1)
    {
        return create(thirdpartycredentials).setLogin(s).setGoogleOauthToken(s1);
    }

    public abstract ThirdPartyCredentials getCredentials();

    public abstract String getGoogleOauthToken();

    public abstract String getLogin();

    abstract AuthenticateThirdPartyBody setCredentials(ThirdPartyCredentials thirdpartycredentials);

    abstract AuthenticateThirdPartyBody setGoogleOauthToken(String s);

    abstract AuthenticateThirdPartyBody setLogin(String s);
}
