// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.unionpay.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.internal.vendor.unionpay.model:
//            Shape_LianLianPayload

public abstract class LianLianPayload
    implements Parcelable
{

    private static final String ID_TYPE_NATIONAL = "0";

    public LianLianPayload()
    {
    }

    public static LianLianPayload createPayload(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return (new Shape_LianLianPayload()).setAcctName(s).setBindMob(s5).setCardNo(s1).setCvv2(s2).setIdNo(s4).setIdType("0").setValiDate(s3);
    }

    public abstract String getAcctName();

    public abstract String getBindMob();

    public abstract String getCardNo();

    public abstract String getCvv2();

    public abstract String getIdNo();

    public abstract String getIdType();

    public abstract String getValiDate();

    abstract LianLianPayload setAcctName(String s);

    abstract LianLianPayload setBindMob(String s);

    abstract LianLianPayload setCardNo(String s);

    abstract LianLianPayload setCvv2(String s);

    abstract LianLianPayload setIdNo(String s);

    abstract LianLianPayload setIdType(String s);

    abstract LianLianPayload setValiDate(String s);
}
