// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_MobileVerificationRequest

public abstract class MobileVerificationRequest
{

    public MobileVerificationRequest()
    {
    }

    public static MobileVerificationRequest create(String s, String s1, String s2, String s3)
    {
        return (new Shape_MobileVerificationRequest()).setUserUuid(s).setStrategy(s1).setLocale(s2).setCountryIso2(s3);
    }

    public abstract String getCountryIso2();

    public abstract String getLocale();

    public abstract String getStrategy();

    public abstract String getUserUuid();

    abstract MobileVerificationRequest setCountryIso2(String s);

    abstract MobileVerificationRequest setLocale(String s);

    abstract MobileVerificationRequest setStrategy(String s);

    abstract MobileVerificationRequest setUserUuid(String s);
}
