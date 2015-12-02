// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.expense.ExpenseInfoActivity;

public final class esc
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

    private esc(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6)
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
        } else
        {
            h = hzb6;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6)
    {
        return new esc(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6);
    }

    private void a(ExpenseInfoActivity expenseinfoactivity)
    {
        if (expenseinfoactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(expenseinfoactivity);
            expenseinfoactivity.h = (chp)c.a();
            expenseinfoactivity.i = (dpg)d.a();
            expenseinfoactivity.j = (dkn)e.a();
            expenseinfoactivity.k = (hkm)f.a();
            expenseinfoactivity.l = (czq)g.a();
            expenseinfoactivity.m = (gmg)h.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((ExpenseInfoActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!esc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
