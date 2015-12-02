// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.payment.AddPaymentActivity;
import com.ubercab.client.feature.trip.overlay.AddPaymentOverlayView;

public final class fva extends fwh
    implements gci
{

    private final dal a;

    public fva(RiderActivity rideractivity, dal dal1)
    {
        super(rideractivity);
        a = dal1;
    }

    private AddPaymentOverlayView l()
    {
        AddPaymentOverlayView addpaymentoverlayview = (AddPaymentOverlayView)f().getLayoutInflater().inflate(0x7f0301e8, g(), false);
        addpaymentoverlayview.a(this);
        return addpaymentoverlayview;
    }

    public final void a(int i)
    {
        if (a())
        {
            i();
            ((AddPaymentOverlayView)e()).a(a(((android.app.Activity) (f()))) - i);
            j();
        }
    }

    public final boolean a()
    {
        return super.a() && !a.h();
    }

    public final void b()
    {
        f().startActivityForResult(AddPaymentActivity.a(f(), null), 3003);
        c();
    }

    protected final void c()
    {
        super.c();
        a.g();
    }

    final View d()
    {
        return l();
    }
}
