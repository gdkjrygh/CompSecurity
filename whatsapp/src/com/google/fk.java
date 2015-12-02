// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            ee, f6, d8, el, 
//            dP, aH, bp, fn, 
//            b4, dE, P, cR, 
//            eJ, eL, z, eK, 
//            eh, ga, cP

public final class fk extends ee
    implements f6
{

    private Object e;
    private boolean f;
    private int g;

    private fk()
    {
        e = "";
        k();
    }

    private fk(b4 b4)
    {
        super(b4);
        e = "";
        k();
    }

    fk(b4 b4, dE de)
    {
        this(b4);
    }

    static fk e()
    {
        return f();
    }

    private static fk f()
    {
        return new fk();
    }

    private void k()
    {
        if (!d8.d);
    }

    public P a()
    {
        return g();
    }

    protected aH a()
    {
        return el.v().a(com/google/dP, com/google/fk);
    }

    public cR a()
    {
        return d();
    }

    public eJ a()
    {
        return c();
    }

    public eJ a(eL el1, z z)
    {
        return a(el1, z);
    }

    public eK a()
    {
        return c();
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

    public fk a(P p)
    {
        if (p instanceof dP)
        {
            return a((dP)p);
        } else
        {
            super.a(p);
            return this;
        }
    }

    public fk a(dP dp)
    {
        if (dp == dP.k())
        {
            return this;
        }
        if (dp.e())
        {
            g = g | 1;
            e = dP.b(dp);
            f();
        }
        if (dp.a())
        {
            a(dp.f());
        }
        b(dp.c());
        return this;
    }

    public fk a(eL el1, z z)
    {
        el1 = (dP)dP.e.a(el1, z);
        if (el1 != null)
        {
            try
            {
                a(((dP) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        return this;
        z;
        el1 = (dP)z.g();
        throw z;
        z;
_L2:
        if (el1 != null)
        {
            try
            {
                a(((dP) (el1)));
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

    public fk a(boolean flag)
    {
        g = g | 2;
        f = flag;
        f();
        return this;
    }

    public ga a(eL el1, z z)
    {
        return a(el1, z);
    }

    public boolean a()
    {
        return (g & 1) == 1;
    }

    public P b()
    {
        return h();
    }

    public cP b()
    {
        return el.w();
    }

    public cR b()
    {
        return g();
    }

    public boolean b()
    {
        return (g & 2) == 2;
    }

    public P c()
    {
        return d();
    }

    public cR c()
    {
        return h();
    }

    public ee c()
    {
        return c();
    }

    public fk c()
    {
        return f().a(g());
    }

    public Object clone()
    {
        return c();
    }

    public dP d()
    {
        dP dp = g();
        if (!dp.d())
        {
            throw b(dp);
        } else
        {
            return dp;
        }
    }

    public final boolean d()
    {
        while (!a() || !b()) 
        {
            return false;
        }
        return true;
    }

    public dP g()
    {
        int i = 1;
        dP dp = new dP(this, null);
        int l = g;
        int j;
        if ((l & 1) != 1)
        {
            i = 0;
        }
        dP.a(dp, e);
        j = i;
        if ((l & 2) == 2)
        {
            j = i | 2;
        }
        dP.a(dp, f);
        dP.a(dp, j);
        j();
        return dp;
    }

    public dP h()
    {
        return dP.k();
    }
}
