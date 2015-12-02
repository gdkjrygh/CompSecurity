// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.EditCreditCardFragment;

public final class epe
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

    private epe(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, 
            hzb hzb7, hzb hzb8, hzb hzb9, hzb hzb10, hzb hzb11, hzb hzb12, hzb hzb13)
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
        } else
        {
            o = hzb13;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7, 
            hzb hzb8, hzb hzb9, hzb hzb10, hzb hzb11, hzb hzb12, hzb hzb13)
    {
        return new epe(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6, hzb7, hzb8, hzb9, hzb10, hzb11, hzb12, hzb13);
    }

    private void a(EditCreditCardFragment editcreditcardfragment)
    {
        if (editcreditcardfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(editcreditcardfragment);
            editcreditcardfragment.c = (chp)c.a();
            editcreditcardfragment.d = (eqm)d.a();
            editcreditcardfragment.e = (cev)e.a();
            editcreditcardfragment.f = (hkr)f.a();
            editcreditcardfragment.g = (hku)g.a();
            editcreditcardfragment.h = (eoy)h.a();
            editcreditcardfragment.i = (gmg)i.a();
            editcreditcardfragment.j = (hkj)j.a();
            editcreditcardfragment.k = (dpg)k.a();
            editcreditcardfragment.l = (dkn)l.a();
            editcreditcardfragment.m = (eyy)m.a();
            editcreditcardfragment.n = (hkm)n.a();
            editcreditcardfragment.o = (dal)o.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((EditCreditCardFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!epe.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
