// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.client.feature.trip.ridepool.RideHijackView;

public final class eal
    implements eam, gdi
{

    private RideHijackView a;

    public eal()
    {
    }

    private void e()
    {
        a.a(this);
        a.a(null, true);
        a.b(0);
        a.a(0);
        a.e("SEE YOUR SAVINGS BY SWITCHING TO POOL!");
        a.a("uberPOOL");
        a.c("uberX");
        a.b("SAVE 15% MONEY");
        a.d("SAVE 30% TIME");
        a.a("UP TO 4 PEOPLE, HAVE YOUR OWN RIDE!", "UP TO 2 PEOPLE, SHARE YOUR RIDE!");
        a.c();
        a.e();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        a = (RideHijackView)layoutinflater.inflate(0x7f0301f1, viewgroup, false);
        e();
        return a;
    }

    public final void a()
    {
        a.d();
        a.b();
    }

    public final void b()
    {
        a.e();
        a.c();
    }

    public final void c()
    {
    }

    public final void d()
    {
    }
}
