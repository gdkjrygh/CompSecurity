// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.ubercab.client.feature.payment.PaymentActivity;

public final class epr
    implements icg
{

    final PaymentActivity a;

    private epr(PaymentActivity paymentactivity)
    {
        a = paymentactivity;
        super();
    }

    public epr(PaymentActivity paymentactivity, byte byte0)
    {
        this(paymentactivity);
    }

    public final void a()
    {
        a.u();
    }

    public final volatile void a(Object obj)
    {
    }

    public final void a(Throwable throwable)
    {
        a.u();
        Toast.makeText(a, a.getString(0x7f070631), 0).show();
    }
}
