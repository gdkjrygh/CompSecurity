// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.baidu.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.internal.vendor.baidu.model:
//            Shape_BaiduWalletTokenData

public abstract class BaiduWalletTokenData
    implements Parcelable
{

    public BaiduWalletTokenData()
    {
    }

    public static BaiduWalletTokenData create(String s, String s1, String s2)
    {
        return (new Shape_BaiduWalletTokenData()).setContractNo(s).setCardNo(s1).setOrderNo(s2);
    }

    public abstract String getCardNo();

    public abstract String getContractNo();

    public abstract String getOrderNo();

    abstract BaiduWalletTokenData setCardNo(String s);

    abstract BaiduWalletTokenData setContractNo(String s);

    abstract BaiduWalletTokenData setOrderNo(String s);
}
