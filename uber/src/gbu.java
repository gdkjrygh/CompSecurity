// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gbu
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

    private gbu(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, 
            hzb hzb7, hzb hzb8, hzb hzb9, hzb hzb10, hzb hzb11)
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
        } else
        {
            m = hzb11;
            return;
        }
    }

    public static hst a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7, 
            hzb hzb8, hzb hzb9, hzb hzb10, hzb hzb11)
    {
        return new gbu(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6, hzb7, hzb8, hzb9, hzb10, hzb11);
    }

    private gbr b()
    {
        gbr gbr1 = new gbr((Context)c.a(), (cev)d.a(), (cjn)e.a(), (eel)f.a(), (fzl)g.a(), (cjf)h.a(), (gmg)i.a(), (chp)j.a(), (dpg)k.a(), (hku)l.a(), (dqt)m.a());
        b.injectMembers(gbr1);
        return gbr1;
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!gbu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
