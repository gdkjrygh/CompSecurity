// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_SelectPaymentProfileBody, ExtraPaymentData

public abstract class SelectPaymentProfileBody
{

    public SelectPaymentProfileBody()
    {
    }

    public static SelectPaymentProfileBody create()
    {
        return new Shape_SelectPaymentProfileBody();
    }

    public abstract ExtraPaymentData getExtraPaymentData();

    public abstract boolean getIsGoogleWalletRequest();

    public abstract String getPaymentProfileUUID();

    public abstract SelectPaymentProfileBody setExtraPaymentData(ExtraPaymentData extrapaymentdata);

    public abstract SelectPaymentProfileBody setIsGoogleWalletRequest(boolean flag);

    public abstract SelectPaymentProfileBody setPaymentProfileUUID(String s);
}
