// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            ee, b7, d8, el, 
//            dA, aH, bp, fn, 
//            b4, dE, P, cR, 
//            eL, z, eJ, eK, 
//            eh, ga, cP

public final class eG extends ee
    implements b7
{

    private int e;
    private int f;
    private int g;

    private eG()
    {
        b();
    }

    private eG(b4 b4)
    {
        super(b4);
        b();
    }

    eG(b4 b4, dE de)
    {
        this(b4);
    }

    private void b()
    {
        if (!d8.d);
    }

    private static eG e()
    {
        return new eG();
    }

    static eG f()
    {
        return e();
    }

    public P a()
    {
        return g();
    }

    protected aH a()
    {
        return el.K().a(com/google/dA, com/google/eG);
    }

    public cR a()
    {
        return c();
    }

    public eG a()
    {
        return e().a(g());
    }

    public eG a(int i)
    {
        e = e | 1;
        f = i;
        f();
        return this;
    }

    public eG a(P p)
    {
        if (p instanceof dA)
        {
            return a((dA)p);
        } else
        {
            super.a(p);
            return this;
        }
    }

    public eG a(dA da)
    {
        if (da == dA.g())
        {
            return this;
        }
        if (da.k())
        {
            a(da.i());
        }
        if (da.e())
        {
            b(da.a());
        }
        b(da.c());
        return this;
    }

    public eG a(eL el1, z z)
    {
        el1 = (dA)dA.m.a(el1, z);
        if (el1 != null)
        {
            try
            {
                a(((dA) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        return this;
        z;
        el1 = (dA)z.g();
        throw z;
        z;
_L2:
        if (el1 != null)
        {
            try
            {
                a(((dA) (el1)));
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

    public eJ a()
    {
        return a();
    }

    public eJ a(eL el1, z z)
    {
        return a(el1, z);
    }

    public eK a()
    {
        return a();
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

    public ga a(eL el1, z z)
    {
        return a(el1, z);
    }

    public P b()
    {
        return d();
    }

    public cP b()
    {
        return el.y();
    }

    public cR b()
    {
        return g();
    }

    public eG b(int i)
    {
        e = e | 2;
        g = i;
        f();
        return this;
    }

    public P c()
    {
        return c();
    }

    public cR c()
    {
        return d();
    }

    public dA c()
    {
        dA da = g();
        if (!da.d())
        {
            throw b(da);
        } else
        {
            return da;
        }
    }

    public ee c()
    {
        return a();
    }

    public Object clone()
    {
        return a();
    }

    public dA d()
    {
        return dA.g();
    }

    public final boolean d()
    {
        return true;
    }

    public dA g()
    {
        int i = 1;
        dA da = new dA(this, null);
        int k = e;
        int j;
        if ((k & 1) != 1)
        {
            i = 0;
        }
        dA.b(da, f);
        j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        dA.a(da, g);
        dA.c(da, j);
        j();
        return da;
    }
}
