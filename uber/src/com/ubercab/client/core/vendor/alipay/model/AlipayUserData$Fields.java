// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay.model;


// Referenced classes of package com.ubercab.client.core.vendor.alipay.model:
//            Shape_AlipayUserData_Fields

public abstract class ields
{

    public static ields create()
    {
        return new Shape_AlipayUserData_Fields();
    }

    public static ields create(boolean flag, String s, String s1, String s2)
    {
        return create().setIsIdAuth(flag).setMobile(s).setMobileCountryIso2(s1).setUserId(s2);
    }

    public abstract boolean getIsIdAuth();

    public abstract String getMobile();

    public abstract String getMobileCountryIso2();

    public abstract String getUserId();

    abstract setUserId setIsIdAuth(boolean flag);

    abstract setUserId setMobile(String s);

    abstract setUserId setMobileCountryIso2(String s);

    abstract setUserId setUserId(String s);

    public ields()
    {
    }
}
