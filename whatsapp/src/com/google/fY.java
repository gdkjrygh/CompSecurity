// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            fp, g2, d8, a_, 
//            el, d_, aH, dw, 
//            d9, bp, fn, b4, 
//            dE, P, cR, eJ, 
//            eL, z, eK, eh, 
//            ga, cP, ee

public final class fY extends fp
    implements g2
{

    private int f;
    private List g;
    private a_ h;

    private fY()
    {
        g = Collections.emptyList();
        k();
    }

    private fY(b4 b4)
    {
        super(b4);
        g = Collections.emptyList();
        k();
    }

    fY(b4 b4, dE de)
    {
        this(b4);
    }

    static fY c()
    {
        return e();
    }

    private void d()
    {
        if ((f & 1) != 1)
        {
            g = new ArrayList(g);
            f = f | 1;
        }
    }

    private static fY e()
    {
        return new fY();
    }

    private void k()
    {
        if (d8.d)
        {
            l();
        }
    }

    private a_ l()
    {
        boolean flag = true;
        if (h == null)
        {
            List list = g;
            if ((f & 1) != 1)
            {
                flag = false;
            }
            h = new a_(list, flag, g(), e());
            g = null;
        }
        return h;
    }

    public P a()
    {
        return f();
    }

    protected aH a()
    {
        return el.F().a(com/google/d_, com/google/fY);
    }

    public cR a()
    {
        return a();
    }

    public d_ a()
    {
        d_ d_1 = f();
        if (!d_1.d())
        {
            throw b(d_1);
        } else
        {
            return d_1;
        }
    }

    public dw a(int i)
    {
        if (h == null)
        {
            return (dw)g.get(i);
        } else
        {
            return (dw)h.b(i);
        }
    }

    public eJ a()
    {
        return g();
    }

    public eJ a(eL el1, z z)
    {
        return a(el1, z);
    }

    public eK a()
    {
        return g();
    }

    public eK a(P p)
    {
        return a(p);
    }

    public eK a(eL el1, z z)
    {
        return a(el1, z);
    }

    public eh a(P p)
    {
        return a(p);
    }

    public fY a(P p)
    {
        if (p instanceof d_)
        {
            return a((d_)p);
        } else
        {
            super.a(p);
            return this;
        }
    }

    public fY a(d_ d_1)
    {
label0:
        {
            a_ a_1;
            int i;
label1:
            {
label2:
                {
                    a_1 = null;
                    i = d9.c;
                    if (d_1 == d_.c())
                    {
                        return this;
                    }
                    if (h != null)
                    {
                        break label1;
                    }
                    if (d_.b(d_1).isEmpty())
                    {
                        break label0;
                    }
                    if (g.isEmpty())
                    {
                        g = d_.b(d_1);
                        f = f & -2;
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    d();
                    g.addAll(d_.b(d_1));
                }
                f();
                if (i == 0)
                {
                    break label0;
                }
            }
            if (d_.b(d_1).isEmpty())
            {
                break label0;
            }
            if (h.b())
            {
                h.f();
                h = null;
                g = d_.b(d_1);
                f = f & -2;
                if (d8.d)
                {
                    a_1 = l();
                }
                h = a_1;
                if (i == 0)
                {
                    break label0;
                }
            }
            h.a(d_.b(d_1));
        }
        a(((d2) (d_1)));
        b(d_1.c());
        return this;
    }

    public fY a(eL el1, z z)
    {
        el1 = (d_)d_.k.a(el1, z);
        if (el1 != null)
        {
            try
            {
                a(((d_) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        return this;
        z;
        el1 = (d_)z.g();
        throw z;
        z;
_L2:
        if (el1 != null)
        {
            try
            {
                a(((d_) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        throw z;
        z;
        el1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ga a(eL el1, z z)
    {
        return a(el1, z);
    }

    public int b()
    {
        if (h == null)
        {
            return g.size();
        } else
        {
            return h.a();
        }
    }

    public P b()
    {
        return h();
    }

    public cP b()
    {
        return el.l();
    }

    public cR b()
    {
        return f();
    }

    public P c()
    {
        return a();
    }

    public cR c()
    {
        return h();
    }

    public ee c()
    {
        return g();
    }

    public fp c()
    {
        return g();
    }

    public Object clone()
    {
        return g();
    }

    public final boolean d()
    {
        int i;
        int j;
        j = d9.c;
        i = 0;
_L4:
        if (i >= b())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a(i).d()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i++;
        if (j == 0) goto _L4; else goto _L3
_L3:
        if (!a()) goto _L1; else goto _L5
_L5:
        return true;
    }

    public d_ f()
    {
        d_ d_1;
label0:
        {
            d_1 = new d_(this, null);
            int i = f;
            if (h == null)
            {
                if ((f & 1) == 1)
                {
                    g = Collections.unmodifiableList(g);
                    f = f & -2;
                }
                d_.a(d_1, g);
                if (d9.c == 0)
                {
                    break label0;
                }
            }
            d_.a(d_1, h.i());
        }
        j();
        return d_1;
    }

    public fY g()
    {
        return e().a(f());
    }

    public d_ h()
    {
        return d_.c();
    }
}
