// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.response;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.response:
//            Shape_AirtelValidateCodeResponse

public abstract class AirtelValidateCodeResponse
    implements Parcelable
{

    public AirtelValidateCodeResponse()
    {
    }

    public static AirtelValidateCodeResponse create()
    {
        return new Shape_AirtelValidateCodeResponse();
    }

    public static AirtelValidateCodeResponse create(String s, boolean flag)
    {
        return (new Shape_AirtelValidateCodeResponse()).setAirtelMoneyToken(s).setExistingAccount(flag);
    }

    public abstract String getAirtelMoneyToken();

    public abstract boolean getExistingAccount();

    abstract AirtelValidateCodeResponse setAirtelMoneyToken(String s);

    abstract AirtelValidateCodeResponse setExistingAccount(boolean flag);
}
