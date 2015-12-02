// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.ubercab.payment.internal.network.PaymentApi;
import com.ubercab.payment.internal.network.PaymentProfileClient;

public final class gst
{

    private final Application a;
    private final gry b;

    public gst(Application application)
    {
        a = application;
        b = ((grz)application).e();
    }

    public static PaymentApi a(grs grs1)
    {
        return (PaymentApi)grs1.a(com/ubercab/payment/internal/network/PaymentApi);
    }

    public static PaymentProfileClient b(grs grs1)
    {
        return new PaymentProfileClient(grs1);
    }

    public final chp a()
    {
        return b.e();
    }

    public final gmg b()
    {
        return b.f();
    }

    final grs c()
    {
        return b.aK();
    }

    final Resources d()
    {
        return a.getResources();
    }

    final LayoutInflater e()
    {
        return LayoutInflater.from(a);
    }
}
