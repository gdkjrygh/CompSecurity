// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import com.ubercab.client.core.model.Note;
import com.ubercab.rider.realtime.response.FareEstimateResponse;
import java.util.Iterator;
import java.util.List;

public final class fvp
{

    private final fvf a;
    private final fvl b;
    private final fvy c;
    private final fwb d;
    private final fwg e;
    private final fww f;
    private final dal g;
    private final fxp h;
    private final List i;

    public fvp(fvf fvf1, fvl fvl1, fvy fvy1, fwb fwb1, fwg fwg1, fww fww1, dal dal, 
            fxp fxp1)
    {
        a = fvf1;
        b = fvl1;
        c = fvy1;
        d = fwb1;
        e = fwg1;
        f = fww1;
        g = dal;
        h = fxp1;
        i = (new gkf()).a(d).a(h).a(c).a(a).a(b).a(e).a(f).a();
    }

    public final void a()
    {
        d.c();
        h.e();
        a.q();
        b.b();
        e.b();
    }

    public final void a(ViewGroup viewgroup)
    {
        d.a(viewgroup);
        h.a(viewgroup);
        c.a(viewgroup);
        a.a(viewgroup);
        b.a(viewgroup);
        e.a(viewgroup);
        f.a(viewgroup);
    }

    public final void a(Note note)
    {
        a.a(note);
    }

    public final void a(FareEstimateResponse fareestimateresponse)
    {
        a.a(fareestimateresponse);
        f.a(fareestimateresponse);
    }

    public final void a(daq daq)
    {
        f.a(daq);
    }

    public final void a(dnf dnf)
    {
        a.a(dnf);
        f.a(dnf);
    }

    public final void a(fvq fvq)
    {
        d.a(fvq);
        h.a(fvq);
        c.a(fvq);
        a.a(fvq);
        b.a(fvq);
        f.a(fvq);
    }

    public final void a(fyi fyi)
    {
        d.g();
        a.a(fyi);
        f.a(fyi);
    }

    public final void a(fzc fzc)
    {
        d.e();
        h.d();
        c.g();
        a.a(fzc);
        b.a();
        e.a();
        f.g();
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            e.e();
            return;
        } else
        {
            a.u();
            return;
        }
    }

    public final void b()
    {
        d.d();
        h.f();
        a.r();
        b.c();
        e.c();
    }

    public final void b(fvq fvq)
    {
        d.b(fvq);
        h.b(fvq);
        c.b(fvq);
        a.b(fvq);
        b.b(fvq);
        f.i();
    }

    public final void c()
    {
        a.w();
        f.f();
    }

    public final void d()
    {
        a.p();
    }

    public final void e()
    {
        a.t();
    }

    public final void f()
    {
        a.w();
    }

    public final void g()
    {
        e.d();
    }

    public final void h()
    {
        a.s();
    }

    public final void i()
    {
        d.f();
    }

    public final void j()
    {
        d.h();
    }

    public final void k()
    {
        d.j();
    }

    public final void l()
    {
        a.v();
    }

    public final int m()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext();)
        {
            fvr fvr1 = (fvr)iterator.next();
            if (fvr1.m())
            {
                return fvr1.o();
            }
        }

        return 0;
    }

    public final int n()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext();)
        {
            fvr fvr1 = (fvr)iterator.next();
            if (fvr1.m())
            {
                return fvr1.n();
            }
        }

        return 0;
    }

    public final Note o()
    {
        return a.y();
    }

    public final boolean p()
    {
        if (!d.i() && !h.c() && !c.f() && !e.f() && !a.x())
        {
            f.p();
            return false;
        } else
        {
            return true;
        }
    }

    public final boolean q()
    {
        return f.h();
    }
}
