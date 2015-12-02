// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class fwa
    implements hst
{

    static final boolean a;
    private final hzb b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;
    private final hzb h;
    private final hzb i;

    private fwa(hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7, 
            hzb hzb8)
    {
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        b = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        c = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        d = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        }
        e = hzb4;
        if (!a && hzb5 == null)
        {
            throw new AssertionError();
        }
        f = hzb5;
        if (!a && hzb6 == null)
        {
            throw new AssertionError();
        }
        g = hzb6;
        if (!a && hzb7 == null)
        {
            throw new AssertionError();
        }
        h = hzb7;
        if (!a && hzb8 == null)
        {
            throw new AssertionError();
        } else
        {
            i = hzb8;
            return;
        }
    }

    public static hst a(hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7, hzb hzb8)
    {
        return new fwa(hzb1, hzb2, hzb3, hzb4, hzb5, hzb6, hzb7, hzb8);
    }

    private fvy b()
    {
        return new fvy((chp)b.a(), (evn)c.a(), (ewg)d.a(), (ewh)e.a(), (ewj)f.a(), (RiderActivity)g.a(), (fta)h.a(), (fte)i.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fwa.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
