// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.request;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.request:
//            Shape_AirtelDepositRequest

public abstract class AirtelDepositRequest
{

    public AirtelDepositRequest()
    {
    }

    public static AirtelDepositRequest create(double d, boolean flag, String s, String s1, String s2)
    {
        return (new Shape_AirtelDepositRequest()).setAmount(d).setBonus(flag).setDevice(s).setEncryptedPayload(s1).setEncryptedKey(s2);
    }

    public abstract double getAmount();

    public abstract boolean getBonus();

    public abstract String getDevice();

    public abstract String getEncryptedKey();

    public abstract String getEncryptedPayload();

    abstract AirtelDepositRequest setAmount(double d);

    abstract AirtelDepositRequest setBonus(boolean flag);

    abstract AirtelDepositRequest setDevice(String s);

    abstract AirtelDepositRequest setEncryptedKey(String s);

    abstract AirtelDepositRequest setEncryptedPayload(String s);
}
