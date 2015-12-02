// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ThirdPartyCredentials

public abstract class ThirdPartyCredentials
{

    public static final String THIRD_PARTY_ALIPAY = "alipay";
    public static final String THIRD_PARTY_BAIDU = "baidu";
    public static final String THIRD_PARTY_FACEBOOK = "facebook";
    public static final String THIRD_PARTY_GOOGLE = "google";

    public ThirdPartyCredentials()
    {
    }

    public static ThirdPartyCredentials create(String s)
    {
        return (new Shape_ThirdPartyCredentials()).setType(s);
    }

    public abstract String getAccessToken();

    public abstract String getRedirectUri();

    public abstract String getType();

    public abstract ThirdPartyCredentials setAccessToken(String s);

    public abstract ThirdPartyCredentials setRedirectUri(String s);

    abstract ThirdPartyCredentials setType(String s);
}
