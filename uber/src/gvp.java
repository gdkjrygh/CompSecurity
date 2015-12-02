// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import com.ubercab.payment.internal.vendor.airtel.AirtelApi;

public final class gvp
{

    public gvp()
    {
    }

    static AirtelApi a(grs grs1)
    {
        return (AirtelApi)grs1.a(com/ubercab/payment/internal/vendor/airtel/AirtelApi);
    }

    static gsm a(Resources resources)
    {
        return new gsm(resources.getString(gsg.ub__payment_airtel_money_public_key), "RSA/ECB/PKCS1Padding");
    }

    static gsj b(Resources resources)
    {
        return new gsl(resources.getString(gsg.ub__payment_airtel_money_mpin_public_key));
    }
}
