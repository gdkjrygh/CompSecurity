// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.model;


// Referenced classes of package com.ubercab.payment.internal.model:
//            Shape_TokenData, GatewayInfo

public abstract class TokenData
{

    public TokenData()
    {
    }

    public static TokenData create(GatewayInfo gatewayinfo, GatewayInfo gatewayinfo1)
    {
        return (new Shape_TokenData()).setBraintree(gatewayinfo).setZaakpay(gatewayinfo1);
    }

    public abstract GatewayInfo getBraintree();

    public abstract GatewayInfo getZaakpay();

    public abstract TokenData setBraintree(GatewayInfo gatewayinfo);

    public abstract TokenData setZaakpay(GatewayInfo gatewayinfo);
}
