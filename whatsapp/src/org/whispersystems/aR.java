// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.P;
import com.google.a3;
import com.google.aH;
import com.google.b4;
import com.google.bp;
import com.google.cP;
import com.google.cR;
import com.google.eJ;
import com.google.eK;
import com.google.eL;
import com.google.ee;
import com.google.eh;
import com.google.fn;
import com.google.ga;
import com.google.z;

// Referenced classes of package org.whispersystems:
//            aH, aA, d, ap

public final class aR extends ee
    implements org.whispersystems.aH
{

    private a3 e;
    private a3 f;
    private int g;
    private int h;
    private int i;

    private aR()
    {
        f = a3.b;
        e = a3.b;
        g();
    }

    private aR(b4 b4)
    {
        super(b4);
        f = a3.b;
        e = a3.b;
        g();
    }

    aR(b4 b4, ap ap)
    {
        this(b4);
    }

    private static aR b()
    {
        return new aR();
    }

    static aR c()
    {
        return b();
    }

    private void g()
    {
        if (!aA.c());
    }

    public P a()
    {
        return d();
    }

    protected aH a()
    {
        return org.whispersystems.d.a().a(org/whispersystems/aA, org/whispersystems/aR);
    }

    public cR a()
    {
        return e();
    }

    public eJ a()
    {
        return h();
    }

    public eJ a(eL el, z z)
    {
        return a(el, z);
    }

    public eK a()
    {
        return h();
    }

    public eK a(P p)
    {
        return a(p);
    }

    public eK a(eL el, z z)
    {
        return a(el, z);
    }

    public eh a(P p)
    {
        return a(p);
    }

    public ga a(eL el, z z)
    {
        return a(el, z);
    }

    public aA a()
    {
        return aA.i();
    }

    public aR a(int j)
    {
        g = g | 2;
        i = j;
        f();
        return this;
    }

    public aR a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof aA))
                {
                    break label0;
                }
                p = a((aA)p);
            }
            // Misplaced declaration of an exception variable
            catch (P p)
            {
                throw p;
            }
            return p;
        }
        super.a(p);
        return this;
    }

    public aR a(a3 a3_1)
    {
        if (a3_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (a3 a3_1)
            {
                throw a3_1;
            }
        } else
        {
            g = g | 8;
            e = a3_1;
            f();
            return this;
        }
    }

    public aR a(eL el, z z)
    {
        el = (aA)aA.o.a(el, z);
        if (el != null)
        {
            try
            {
                a(((aA) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (aA)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((aA) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        throw z;
        z;
        el = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public aR a(aA aa)
    {
        aA aa1;
        try
        {
            aa1 = aA.i();
        }
        // Misplaced declaration of an exception variable
        catch (aA aa)
        {
            throw aa;
        }
        if (aa == aa1)
        {
            return this;
        }
        try
        {
            if (aa.o())
            {
                b(aa.f());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aA aa)
        {
            throw aa;
        }
        try
        {
            if (aa.l())
            {
                a(aa.j());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aA aa)
        {
            throw aa;
        }
        try
        {
            if (aa.a())
            {
                b(aa.q());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aA aa)
        {
            throw aa;
        }
        try
        {
            if (aa.e())
            {
                a(aa.m());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aA aa)
        {
            throw aa;
        }
        b(aa.c());
        return this;
    }

    public P b()
    {
        return a();
    }

    public cP b()
    {
        return org.whispersystems.d.b();
    }

    public cR b()
    {
        return d();
    }

    public aR b(int j)
    {
        g = g | 1;
        h = j;
        f();
        return this;
    }

    public aR b(a3 a3_1)
    {
        if (a3_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (a3 a3_1)
            {
                throw a3_1;
            }
        } else
        {
            g = g | 4;
            f = a3_1;
            f();
            return this;
        }
    }

    public P c()
    {
        return e();
    }

    public cR c()
    {
        return a();
    }

    public ee c()
    {
        return h();
    }

    public Object clone()
    {
        return h();
    }

    public aA d()
    {
        int k = 1;
        aA aa = new aA(this, null);
        int l = g;
        int j;
        if ((l & 1) != 1)
        {
            k = 0;
        }
        aA.c(aa, h);
        j = k;
        if ((l & 2) == 2)
        {
            j = k | 2;
        }
        aA.a(aa, i);
        k = j;
        if ((l & 4) == 4)
        {
            k = j | 4;
        }
        aA.b(aa, f);
        j = k;
        if ((l & 8) == 8)
        {
            j = k | 8;
        }
        aA.a(aa, e);
        aA.b(aa, j);
        j();
        return aa;
    }

    public final boolean d()
    {
        return true;
    }

    public aA e()
    {
        Object obj = d();
        try
        {
            if (!((aA) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((aA) (obj));
    }

    public aR h()
    {
        return b().a(d());
    }
}
