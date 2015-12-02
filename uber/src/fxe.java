// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.overlay.SwitchProfileOverlayView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;

public final class fxe extends fwh
    implements gco
{

    private final chp a;
    private final dal b;
    private final hkr c;
    private final fte d;
    private boolean e;

    public fxe(RiderActivity rideractivity, dal dal1, chp chp1, hkr hkr1, fte fte1)
    {
        super(rideractivity);
        b = dal1;
        a = chp1;
        e = false;
        c = hkr1;
        d = fte1;
    }

    private SwitchProfileOverlayView l()
    {
        boolean flag1 = false;
        SwitchProfileOverlayView switchprofileoverlayview = (SwitchProfileOverlayView)f().getLayoutInflater().inflate(0x7f030157, g(), false);
        Object obj = c.b();
        boolean flag = flag1;
        if (obj != null)
        {
            obj = ((City) (obj)).findVehicleViewById(d.m());
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (!d.a())
                {
                    flag = flag1;
                    if (((VehicleView) (obj)).getLinkedVehicleViewId() == null)
                    {
                        flag = true;
                    }
                }
            }
        }
        switchprofileoverlayview.a(flag);
        switchprofileoverlayview.a(this);
        return switchprofileoverlayview;
    }

    public final void a(int i)
    {
        if (a())
        {
            i();
            ((SwitchProfileOverlayView)e()).a(a(((android.app.Activity) (f()))) - i);
            j();
        }
    }

    public final boolean a()
    {
        return super.a() && !b.m();
    }

    public final void b()
    {
        e = true;
        c();
    }

    protected final void c()
    {
        super.c();
        chp chp1 = a;
        n n1;
        if (e)
        {
            n1 = n.ic;
        } else
        {
            n1 = n.ib;
        }
        chp1.a(n1);
        b.l();
    }

    final View d()
    {
        return l();
    }

    final void k()
    {
        super.k();
    }
}
