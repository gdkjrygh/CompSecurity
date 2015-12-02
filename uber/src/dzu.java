// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderApplication;
import java.util.concurrent.ExecutorService;

public final class dzu
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

    private dzu(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, 
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

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7, 
            hzb hzb8, hzb hzb9, hzb hzb10, hzb hzb11, hzb hzb12, hzb hzb13, hzb hzb14, 
            hzb hzb15, hzb hzb16, hzb hzb17)
    {
        return new dzu(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6, hzb7, hzb8, hzb9, hzb10, hzb11, hzb12, hzb13, hzb14, hzb15, hzb16, hzb17);
    }

    private void a(dzs dzs1)
    {
        if (dzs1 == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(dzs1);
            dzs1.a = (RiderApplication)c.a();
            dzs1.b = (hka)d.a();
            dzs1.c = (chp)e.a();
            dzs1.d = (dcv)f.a();
            dzs1.e = (cev)g.a();
            dzs1.f = (ExecutorService)h.a();
            dzs1.g = (gmg)i.a();
            dzs1.h = (efa)j.a();
            dzs1.i = (dwx)k.a();
            dzs1.j = (hkr)l.a();
            dzs1.k = (hch)m.a();
            dzs1.l = (dak)n.a();
            dzs1.m = (eky)o.a();
            dzs1.n = (czf)p.a();
            dzs1.o = (dal)q.a();
            dzs1.p = (dao)r.a();
            dzs1.q = (cin)s.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((dzs)obj);
    }

    static 
    {
        boolean flag;
        if (!dzu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
