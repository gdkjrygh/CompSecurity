// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.trip.SuggestedVehicleViewBannerView;
import com.ubercab.rider.realtime.model.FareSuggestedVehicleView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fxc
    implements fqi
{

    private final LayoutInflater a;
    private final gmg b;
    private final fqg c;
    private final fte d;
    private final dal e;
    private final chp f;
    private final gju g;
    private final RiderActivity h;
    private final Set i = new HashSet();
    private long j;
    private ViewGroup k;
    private SuggestedVehicleViewBannerView l;
    private FareSuggestedVehicleView m;

    public fxc(RiderActivity rideractivity, fte fte1, gmg gmg1, fqg fqg1, dal dal1, chp chp1, gju gju1)
    {
        h = rideractivity;
        a = (LayoutInflater)gjz.a(rideractivity.getLayoutInflater());
        b = gmg1;
        c = fqg1;
        d = fte1;
        e = dal1;
        f = chp1;
        g = gju1;
    }

    static chp a(fxc fxc1)
    {
        return fxc1.f;
    }

    private void b(FareSuggestedVehicleView faresuggestedvehicleview)
    {
        m = faresuggestedvehicleview;
        g();
        b();
    }

    private void d()
    {
        if (l == null)
        {
            if (f())
            {
                if (!e.n())
                {
                    f.a(l.iY);
                    e.o();
                }
                e();
                return;
            }
            e.e();
            f.a(l.iX);
            l = (SuggestedVehicleViewBannerView)a.inflate(0x7f0301fa, k, false);
            k.addView(l, 0);
            l.a(this);
        }
        l.a(m.getTagline());
    }

    private void e()
    {
        if (l != null)
        {
            l.a();
            l = null;
        }
        m = null;
    }

    private boolean f()
    {
        return e.d() >= 5;
    }

    private void g()
    {
        j = gju.b();
    }

    private boolean h()
    {
        return gju.b() - j > 110L;
    }

    public final void a()
    {
        f.a(n.ju);
        switch (d.g())
        {
        default:
            ijg.d("%s OnClick for invalid state %s", new Object[] {
                getClass().getSimpleName(), Integer.valueOf(d.g())
            });
            return;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            (new android.app.AlertDialog.Builder(h)).setTitle(m.getConfirmationTitle()).setMessage(m.getConfirmationMessage()).setPositiveButton(0x7f0702f8, new android.content.DialogInterface.OnClickListener() {

                final fxc a;

                public final void onClick(DialogInterface dialoginterface, int i1)
                {
                    a.c();
                }

            
            {
                a = fxc.this;
                super();
            }
            }).setNegativeButton(0x7f07007b, new android.content.DialogInterface.OnClickListener() {

                final fxc a;

                public final void onClick(DialogInterface dialoginterface, int i1)
                {
                    fxc.a(a).a(n.jv);
                }

            
            {
                a = fxc.this;
                super();
            }
            }).show();
            break;
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        k = viewgroup;
    }

    public final void a(FareSuggestedVehicleView faresuggestedvehicleview)
    {
        b(faresuggestedvehicleview);
    }

    public final void a(dnf dnf1)
    {
        if (!dnf1.e())
        {
            return;
        } else
        {
            m = ((Ping)dnf1.g()).getSuggestedVehicleView();
            b(((Ping)dnf1.g()).getSuggestedVehicleView());
            return;
        }
    }

    public final void a(dnj dnj1)
    {
        if (dnj1.i())
        {
            dnj1 = m.getVehicleViewId().toString();
            d.c(dnj1);
            e();
        } else
        if (403 == dnj1.n())
        {
            e();
            return;
        }
    }

    public final void a(fxd fxd1)
    {
        i.add(fxd1);
    }

    public final void a(fyi fyi1)
    {
        if (fyi1.a() == null)
        {
            e();
        }
    }

    public final void b()
    {
        if (b.a(dbf.c))
        {
            e();
            return;
        }
        if (m == null)
        {
            e();
            return;
        }
        if (h())
        {
            e();
            return;
        }
        d.g();
        JVM INSTR tableswitch 3 6: default 80
    //                   3 91
    //                   4 105
    //                   5 105
    //                   6 105;
           goto _L1 _L2 _L3 _L3 _L3
_L3:
        break MISSING_BLOCK_LABEL_105;
_L1:
        boolean flag = false;
_L4:
        if (flag)
        {
            d();
            return;
        } else
        {
            e();
            return;
        }
_L2:
        flag = b.a(dbf.bg);
          goto _L4
        flag = b.a(dbf.bh);
          goto _L4
    }

    final void c()
    {
        e.f();
        f.a(n.jw);
        c.a(m.getFareInfo());
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((fxd)iterator.next()).a(m)) { }
        if (3 == d.g())
        {
            e();
        }
    }
}
