// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body.payment;


// Referenced classes of package com.ubercab.rider.realtime.request.body.payment:
//            TokenData, Shape_TokenDataAlipay

public abstract class TokenDataAlipay
    implements TokenData
{

    public static final String ACK_TYPE_M = "M";
    public static final String ACK_TYPE_S = "S";

    public TokenDataAlipay()
    {
    }

    public static TokenDataAlipay create(String s, String s1, String s2)
    {
        return (new Shape_TokenDataAlipay()).setAlipayId(s).setAlipayMobile(s1).setAckType(s2);
    }

    public abstract String getAckType();

    public abstract String getAlipayId();

    public abstract String getAlipayMobile();

    abstract TokenDataAlipay setAckType(String s);

    abstract TokenDataAlipay setAlipayId(String s);

    abstract TokenDataAlipay setAlipayMobile(String s);
}
