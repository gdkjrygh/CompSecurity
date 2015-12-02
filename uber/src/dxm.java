// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.about.OtherFragment;
import com.ubercab.client.feature.legal.LegalFragment;
import com.ubercab.rider.realtime.model.Trip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dxm extends LegalFragment
{

    Application c;
    hku d;
    dpg e;
    dak f;
    private boolean i;
    private boolean j;
    private icl k;

    public dxm()
    {
    }

    static dsz a(dxm dxm1)
    {
        return dxm1.g;
    }

    public static dxm a()
    {
        return new dxm();
    }

    private void a(dxn dxn1)
    {
        dxn1.a(this);
    }

    static boolean a(dxm dxm1, boolean flag)
    {
        dxm1.j = flag;
        return flag;
    }

    private dxn b(dfp dfp)
    {
        return dxv.a().a(new djb(this)).a(dfp).a();
    }

    static boolean b(dxm dxm1)
    {
        return dxm1.j;
    }

    static boolean b(dxm dxm1, boolean flag)
    {
        dxm1.i = flag;
        return flag;
    }

    static boolean c(dxm dxm1)
    {
        return dxm1.i;
    }

    static void d(dxm dxm1)
    {
        dxm1.h();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dxn)czj);
    }

    protected final List b()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(Arrays.asList(new dsx[] {
            new dsx(0, getString(0x7f0700b2)), new dsx(1, getString(0x7f070491)), new dsx(2, getString(0x7f070372)), new dsx(3, getString(0x7f07043b))
        }));
        if (j)
        {
            arraylist.add(new dsx(4, getString(0x7f070308)));
        }
        if (i)
        {
            arraylist.add(new dsx(5, getString(0x7f07067e)));
        }
        return arraylist;
    }

    public final cic f()
    {
        return l.cn;
    }

    protected final void g()
    {
    }

    public void onPause()
    {
        super.onPause();
        k.b();
    }

    public void onPingEvent(dar dar1)
    {
        if (!e.n())
        {
            Ping ping = dar1.a();
            boolean flag;
            boolean flag1;
            if (dul.f(ping) && ping.getTrip().getIsZeroTolerance())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (f.c() != null)
            {
                dar1 = f.c().getLocation();
            } else
            {
                dar1 = null;
            }
            flag1 = OtherFragment.a(c, ping.getCity(), dar1);
            if (g.isEmpty() || j != flag1 || i != flag)
            {
                j = flag1;
                i = flag;
                h();
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        k = ica.a(d.b(), d.h(), new dxp((byte)0)).a(ico.a()).c(new dxo(this, (byte)0));
    }
}
