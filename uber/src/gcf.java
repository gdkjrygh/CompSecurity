// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class gcf
    implements hst
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
    private final hzb j;
    private final hzb k;
    private final hzb l;
    private final hzb m;
    private final hzb n;
    private final hzb o;
    private final hzb p;
    private final hzb q;
    private final hzb r;
    private final hzb s;

    private gcf(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, 
            hzb hzb7, hzb hzb8, hzb hzb9, hzb hzb10, hzb hzb11, hzb hzb12, hzb hzb13, 
            hzb hzb14, hzb hzb15, hzb hzb16, hzb hzb17)
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
        }
        i = hzb7;
        if (!a && hzb8 == null)
        {
            throw new AssertionError();
        }
        j = hzb8;
        if (!a && hzb9 == null)
        {
            throw new AssertionError();
        }
        k = hzb9;
        if (!a && hzb10 == null)
        {
            throw new AssertionError();
        }
        l = hzb10;
        if (!a && hzb11 == null)
        {
            throw new AssertionError();
        }
        m = hzb11;
        if (!a && hzb12 == null)
        {
            throw new AssertionError();
        }
        n = hzb12;
        if (!a && hzb13 == null)
        {
            throw new AssertionError();
        }
        o = hzb13;
        if (!a && hzb14 == null)
        {
            throw new AssertionError();
        }
        p = hzb14;
        if (!a && hzb15 == null)
        {
            throw new AssertionError();
        }
        q = hzb15;
        if (!a && hzb16 == null)
        {
            throw new AssertionError();
        }
        r = hzb16;
        if (!a && hzb17 == null)
        {
            throw new AssertionError();
        } else
        {
            s = hzb17;
            return;
        }
    }

    public static hst a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7, 
            hzb hzb8, hzb hzb9, hzb hzb10, hzb hzb11, hzb hzb12, hzb hzb13, hzb hzb14, 
            hzb hzb15, hzb hzb16, hzb hzb17)
    {
        return new gcf(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6, hzb7, hzb8, hzb9, hzb10, hzb11, hzb12, hzb13, hzb14, hzb15, hzb16, hzb17);
    }

    private gca b()
    {
        gca gca1 = new gca((Application)c.a(), (dqt)d.a(), (cjf)e.a(), (cev)f.a(), (gju)g.a(), (hkr)h.a(), (hku)i.a(), (gmg)j.a(), (evt)k.a(), (cjn)l.a(), (fzl)m.a(), (cgh)n.a(), o, (dpg)p.a(), (czf)q.a(), (dal)r.a(), (fte)s.a());
        b.injectMembers(gca1);
        return gca1;
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!gcf.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
