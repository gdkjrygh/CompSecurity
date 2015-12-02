// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.tray.TraySafetyNetLayout;

public final class gff
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private gff(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3)
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
        } else
        {
            e = hzb3;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new gff(hsr1, hzb1, hzb2, hzb3);
    }

    private void a(TraySafetyNetLayout traysafetynetlayout)
    {
        if (traysafetynetlayout == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(traysafetynetlayout);
            traysafetynetlayout.a = (chp)c.a();
            traysafetynetlayout.b = (drc)d.a();
            traysafetynetlayout.c = (gfn)e.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((TraySafetyNetLayout)obj);
    }

    static 
    {
        boolean flag;
        if (!gff.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
