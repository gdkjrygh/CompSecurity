// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            ee, f7, dG, cW, 
//            d8, el, d4, aH, 
//            d9, fh, bp, fn, 
//            b4, dE, P, cR, 
//            eJ, eL, z, eK, 
//            eh, ga, cP

public final class ey extends ee
    implements f7
{

    private int e;
    private dG f;
    private Object g;
    private cW h;
    private Object i;
    private Object j;

    private ey()
    {
        i = "";
        g = "";
        j = "";
        f = dG.f();
        d();
    }

    private ey(b4 b4)
    {
        super(b4);
        i = "";
        g = "";
        j = "";
        f = dG.f();
        d();
    }

    ey(b4 b4, dE de)
    {
        this(b4);
    }

    private cW b()
    {
        if (h == null)
        {
            h = new cW(f, g(), e());
            f = null;
        }
        return h;
    }

    private void d()
    {
        if (d8.d)
        {
            b();
        }
    }

    static ey f()
    {
        return i();
    }

    private static ey i()
    {
        return new ey();
    }

    public P a()
    {
        return g();
    }

    protected aH a()
    {
        return el.k().a(com/google/d4, com/google/ey);
    }

    public cR a()
    {
        return h();
    }

    public eJ a()
    {
        return e();
    }

    public eJ a(eL el1, z z)
    {
        return a(el1, z);
    }

    public eK a()
    {
        return e();
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

    public ey a(P p)
    {
        if (p instanceof d4)
        {
            return a((d4)p);
        } else
        {
            super.a(p);
            return this;
        }
    }

    public ey a(d4 d4_1)
    {
        if (d4_1 == d4.n())
        {
            return this;
        }
        if (d4_1.j())
        {
            e = e | 1;
            i = d4.b(d4_1);
            f();
        }
        if (d4_1.o())
        {
            e = e | 2;
            g = d4.c(d4_1);
            f();
        }
        if (d4_1.i())
        {
            e = e | 4;
            j = d4.d(d4_1);
            f();
        }
        if (d4_1.r())
        {
            a(d4_1.q());
        }
        b(d4_1.c());
        return this;
    }

    public ey a(dG dg)
    {
label0:
        {
label1:
            {
                int k;
label2:
                {
                    k = d9.c;
                    if (h != null)
                    {
                        break label1;
                    }
                    if ((e & 8) == 8 && f != dG.f())
                    {
                        f = dG.a(f).a(dg).b();
                        if (k == 0)
                        {
                            break label2;
                        }
                    }
                    f = dg;
                }
                f();
                if (k == 0)
                {
                    break label0;
                }
            }
            h.a(dg);
        }
        e = e | 8;
        return this;
    }

    public ey a(eL el1, z z)
    {
        el1 = (d4)d4.l.a(el1, z);
        if (el1 != null)
        {
            try
            {
                a(((d4) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        return this;
        z;
        el1 = (d4)z.g();
        throw z;
        z;
_L2:
        if (el1 != null)
        {
            try
            {
                a(((d4) (el1)));
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

    public boolean a()
    {
        return (e & 8) == 8;
    }

    public P b()
    {
        return c();
    }

    public cP b()
    {
        return el.D();
    }

    public cR b()
    {
        return g();
    }

    public P c()
    {
        return h();
    }

    public cR c()
    {
        return c();
    }

    public d4 c()
    {
        return d4.n();
    }

    public ee c()
    {
        return e();
    }

    public Object clone()
    {
        return e();
    }

    public final boolean d()
    {
        return !a() || j().d();
    }

    public ey e()
    {
        return i().a(g());
    }

    public d4 g()
    {
label0:
        {
            int l = 1;
            d4 d4_1 = new d4(this, null);
            int i1 = e;
            int k;
            if ((i1 & 1) != 1)
            {
                l = 0;
            }
            d4.a(d4_1, i);
            k = l;
            if ((i1 & 2) == 2)
            {
                k = l | 2;
            }
            d4.b(d4_1, g);
            l = k;
            if ((i1 & 4) == 4)
            {
                l = k | 4;
            }
            d4.c(d4_1, j);
            if ((i1 & 8) == 8)
            {
                k = l | 8;
            } else
            {
                k = l;
            }
            if (h == null)
            {
                d4.a(d4_1, f);
                if (d9.c == 0)
                {
                    break label0;
                }
            }
            d4.a(d4_1, (dG)h.g());
        }
        d4.a(d4_1, k);
        j();
        return d4_1;
    }

    public d4 h()
    {
        d4 d4_1 = g();
        if (!d4_1.d())
        {
            throw b(d4_1);
        } else
        {
            return d4_1;
        }
    }

    public dG j()
    {
        if (h == null)
        {
            return f;
        } else
        {
            return (dG)h.e();
        }
    }
}
