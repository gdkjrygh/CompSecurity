// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.PaymentProfile;

final class 
    implements gka
{

    private static boolean a(PaymentProfile paymentprofile)
    {
        return "Paytm".equals(paymentprofile.getCardType());
    }

    public final boolean apply(Object obj)
    {
        return a((PaymentProfile)obj);
    }

    ()
    {
    }
}
