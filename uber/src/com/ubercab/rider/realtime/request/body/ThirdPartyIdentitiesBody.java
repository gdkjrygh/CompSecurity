// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ThirdPartyIdentitiesBody

public abstract class ThirdPartyIdentitiesBody
{

    public ThirdPartyIdentitiesBody()
    {
    }

    public static ThirdPartyIdentitiesBody create(String s)
    {
        return (new Shape_ThirdPartyIdentitiesBody()).setIdentityType(s);
    }

    public abstract String getAccessTokenCode();

    public abstract Long getEpoch();

    public abstract String getIdentityType();

    public abstract String getRedirectUri();

    public abstract String getRefreshToken();

    public abstract ThirdPartyIdentitiesBody setAccessTokenCode(String s);

    public abstract ThirdPartyIdentitiesBody setEpoch(Long long1);

    abstract ThirdPartyIdentitiesBody setIdentityType(String s);

    public abstract ThirdPartyIdentitiesBody setRedirectUri(String s);

    public abstract ThirdPartyIdentitiesBody setRefreshToken(String s);
}
