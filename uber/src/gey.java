// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.tray.TrayPaymentLayout;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.TextView;

public final class gey extends gfm
{

    final TrayPaymentLayout a;

    private gey(TrayPaymentLayout traypaymentlayout)
    {
        a = traypaymentlayout;
        super(traypaymentlayout);
    }

    public gey(TrayPaymentLayout traypaymentlayout, byte byte0)
    {
        this(traypaymentlayout);
    }

    public final int a()
    {
        if (f())
        {
            return super.a();
        } else
        {
            return 0;
        }
    }

    public final void a(gfj gfj1)
    {
        android.graphics.drawable.Drawable drawable = null;
        super.a(gfj1);
        PaymentProfile paymentprofile;
        boolean flag;
        if (!a.a.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        paymentprofile = a.c.a();
        if (TrayPaymentLayout.a(a) != null && TrayPaymentLayout.a(a).equals(paymentprofile))
        {
            return;
        }
        gfj1 = gfj1.b();
        if (gfj1 != null)
        {
            gfj1 = gfj1.getPaymentProfiles();
        } else
        {
            gfj1 = null;
        }
        if (gfj1 != null && paymentprofile != null)
        {
            TrayPaymentLayout.a(a, paymentprofile);
            String s = paymentprofile.getCardType();
            drawable = esj.a(a.getContext(), s);
            if (drawable == null)
            {
                ijg.a(com/ubercab/client/feature/trip/tray/TrayPaymentLayout.getSimpleName()).d("No paymentDrawable found for: %s", new Object[] {
                    s
                });
            }
            gfj1 = dui.a(a.getContext(), paymentprofile, gfj1, true);
        } else
        {
            gfj1 = null;
        }
        TrayPaymentLayout.a(a, drawable);
        a.mPaymentText.setText(gfj1);
    }

    public final int b()
    {
        if (f())
        {
            return super.b();
        } else
        {
            return 0;
        }
    }
}
