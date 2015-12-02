// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.tray.TrayProfilesLayout;

public final class gfb
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;
    private final hzb h;
    private final hzb i;

    private gfb(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, 
            hzb hzb7)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        }
        f = hzb4;
        if (!a && hzb5 == null)
        {
            throw new AssertionError();
        }
        g = hzb5;
        if (!a && hzb6 == null)
        {
            throw new AssertionError();
        }
        h = hzb6;
        if (!a && hzb7 == null)
        {
            throw new AssertionError();
        } else
        {
            i = hzb7;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7)
    {
        return new gfb(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6, hzb7);
    }

    private void a(TrayProfilesLayout trayprofileslayout)
    {
        if (trayprofileslayout == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(trayprofileslayout);
            trayprofileslayout.a = (chp)c.a();
            trayprofileslayout.b = (cev)d.a();
            trayprofileslayout.c = (hkr)e.a();
            trayprofileslayout.d = (gmg)f.a();
            trayprofileslayout.e = (eyy)g.a();
            trayprofileslayout.f = (gfn)h.a();
            trayprofileslayout.g = (fsx)i.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((TrayProfilesLayout)obj);
    }

    static 
    {
        boolean flag;
        if (!gfb.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
