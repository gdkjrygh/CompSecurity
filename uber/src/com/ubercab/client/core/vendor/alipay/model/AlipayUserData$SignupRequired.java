// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay.model;


// Referenced classes of package com.ubercab.client.core.vendor.alipay.model:
//            Shape_AlipayUserData_SignupRequired

public abstract class uired
{

    public static uired create()
    {
        return new Shape_AlipayUserData_SignupRequired();
    }

    public static uired create(uired uired)
    {
        return create().setFields(uired);
    }

    public abstract setFields getFields();

    abstract setFields setFields(setFields setfields);

    public uired()
    {
    }
}
