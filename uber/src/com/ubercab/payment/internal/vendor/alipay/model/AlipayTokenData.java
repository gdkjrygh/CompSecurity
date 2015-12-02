// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.alipay.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.internal.vendor.alipay.model:
//            Shape_AlipayTokenData

public abstract class AlipayTokenData
    implements Parcelable
{

    public AlipayTokenData()
    {
    }

    public static AlipayTokenData create(String s, String s1)
    {
        return (new Shape_AlipayTokenData()).setAlipayId(s).setAlipayMobile(s1);
    }

    public abstract String getAlipayId();

    public abstract String getAlipayMobile();

    abstract AlipayTokenData setAlipayId(String s);

    abstract AlipayTokenData setAlipayMobile(String s);
}
