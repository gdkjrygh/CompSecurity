// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.profiles.ProfileContainerView;
import com.ubercab.client.feature.trip.tray.TrayProfilesLayout;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;

public final class gfa extends gfm
{

    final TrayProfilesLayout a;

    public gfa(TrayProfilesLayout trayprofileslayout)
    {
        a = trayprofileslayout;
        super(trayprofileslayout);
        l();
    }

    public static boolean a(gfa gfa1)
    {
        return gfa1.c();
    }

    private static boolean b(gfk gfk1)
    {
        return gfk1 != null && (gfk1.b() == gdq.a || gfk1.b() == gdq.b);
    }

    private boolean c()
    {
        return e != null && e.b() == gdq.a;
    }

    private void l()
    {
        a(a.e.f());
    }

    public final int a()
    {
        gfq gfq1;
        if (i && h != null)
        {
            if ((gfq1 = k().d()) != null && gfq1.b() == gfr.e)
            {
                return a.i;
            }
        }
        return 0;
    }

    public final void a(City city, Client client)
    {
        if (e == null || b(e))
        {
            a.mProfileContainerView.a(a.g.b());
            if (city != null && client != null && client.getPaymentProfiles() != null)
            {
                a.mProfileContainerView.a(city, client.getPaymentProfiles(), client.getCreditBalances());
                a.mProfileContainerView.c();
                boolean flag = dum.k(a.e.b());
                city = a.mProfileContainerView;
                if (flag && (!g() || c()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                city.a(flag);
            }
        }
    }

    public final void a(gfj gfj1)
    {
        super.a(gfj1);
        l();
        if (!f())
        {
            return;
        }
        if (a.d.a(dbf.cg) && !a.h)
        {
            TrayProfilesLayout.a(a);
            return;
        } else
        {
            b(gfj1);
            return;
        }
    }

    public final void a(gfk gfk1)
    {
        super.a(gfk1);
        if (f() && gfk1 != null)
        {
            boolean flag = dum.k(a.e.b());
            switch (com.ubercab.client.feature.trip.tray.TrayProfilesLayout._cls1.a[gfk1.b().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                a.mProfileContainerView.a(flag);
                return;

            case 2: // '\002'
                gfk1 = a.mProfileContainerView;
                if (!g() && flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                gfk1.a(flag);
                return;

            case 3: // '\003'
                break;
            }
            if (g())
            {
                ProfileContainerView profilecontainerview = a.mProfileContainerView;
                float f;
                if (flag)
                {
                    f = gfk1.c();
                } else
                {
                    f = 0.0F;
                }
                profilecontainerview.a(f);
                return;
            }
        }
    }

    public final int b()
    {
        if (!i)
        {
            return 0;
        } else
        {
            return a.i;
        }
    }

    public final void b(gfj gfj1)
    {
        if (gfj1 == null)
        {
            return;
        } else
        {
            a(gfj1.a(), gfj1.b());
            return;
        }
    }
}
