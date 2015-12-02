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
//            j, aJ, R, aG

public final class bx extends ee
    implements j
{

    private int e;
    private a3 f;
    private a3 g;
    private a3 h;
    private a3 i;
    private a3 j;
    private a3 k;
    private int l;

    private bx()
    {
        f = a3.b;
        h = a3.b;
        k = a3.b;
        g = a3.b;
        i = a3.b;
        j = a3.b;
        b();
    }

    private bx(b4 b4)
    {
        super(b4);
        f = a3.b;
        h = a3.b;
        k = a3.b;
        g = a3.b;
        i = a3.b;
        j = a3.b;
        b();
    }

    bx(b4 b4, aG ag)
    {
        this(b4);
    }

    private static bx a()
    {
        return new bx();
    }

    private void b()
    {
        if (!aJ.e());
    }

    static bx f()
    {
        return a();
    }

    public P a()
    {
        return c();
    }

    protected aH a()
    {
        return R.d().a(org/whispersystems/aJ, org/whispersystems/bx);
    }

    public cR a()
    {
        return g();
    }

    public eJ a()
    {
        return d();
    }

    public eJ a(eL el, z z)
    {
        return a(el, z);
    }

    public eK a()
    {
        return d();
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

    public bx a(int i1)
    {
        l = l | 1;
        e = i1;
        f();
        return this;
    }

    public bx a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof aJ))
                {
                    break label0;
                }
                p = a((aJ)p);
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

    public bx a(a3 a3_1)
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
            l = l | 0x40;
            j = a3_1;
            f();
            return this;
        }
    }

    public bx a(eL el, z z)
    {
        el = (aJ)aJ.t.a(el, z);
        if (el != null)
        {
            try
            {
                a(((aJ) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (aJ)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((aJ) (el)));
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

    public bx a(aJ aj)
    {
        aJ aj1;
        try
        {
            aj1 = aJ.f();
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj)
        {
            throw aj;
        }
        if (aj == aj1)
        {
            return this;
        }
        try
        {
            if (aj.i())
            {
                a(aj.v());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj)
        {
            throw aj;
        }
        try
        {
            if (aj.m())
            {
                f(aj.g());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj)
        {
            throw aj;
        }
        try
        {
            if (aj.s())
            {
                b(aj.r());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj)
        {
            throw aj;
        }
        try
        {
            if (aj.x())
            {
                e(aj.b());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj)
        {
            throw aj;
        }
        try
        {
            if (aj.k())
            {
                d(aj.w());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj)
        {
            throw aj;
        }
        try
        {
            if (aj.h())
            {
                c(aj.n());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj)
        {
            throw aj;
        }
        try
        {
            if (aj.o())
            {
                a(aj.l());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj)
        {
            throw aj;
        }
        b(aj.c());
        return this;
    }

    public P b()
    {
        return e();
    }

    public cP b()
    {
        return R.k();
    }

    public cR b()
    {
        return c();
    }

    public bx b(a3 a3_1)
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
            l = l | 4;
            h = a3_1;
            f();
            return this;
        }
    }

    public P c()
    {
        return g();
    }

    public cR c()
    {
        return e();
    }

    public ee c()
    {
        return d();
    }

    public aJ c()
    {
        int j1 = 1;
        aJ aj = new aJ(this, null);
        int k1 = l;
        int i1;
        if ((k1 & 1) != 1)
        {
            j1 = 0;
        }
        aJ.b(aj, e);
        i1 = j1;
        if ((k1 & 2) == 2)
        {
            i1 = j1 | 2;
        }
        aJ.e(aj, f);
        j1 = i1;
        if ((k1 & 4) == 4)
        {
            j1 = i1 | 4;
        }
        aJ.d(aj, h);
        i1 = j1;
        if ((k1 & 8) == 8)
        {
            i1 = j1 | 8;
        }
        aJ.f(aj, k);
        j1 = i1;
        if ((k1 & 0x10) == 16)
        {
            j1 = i1 | 0x10;
        }
        aJ.c(aj, g);
        i1 = j1;
        if ((k1 & 0x20) == 32)
        {
            i1 = j1 | 0x20;
        }
        aJ.a(aj, i);
        j1 = i1;
        if ((k1 & 0x40) == 64)
        {
            j1 = i1 | 0x40;
        }
        aJ.b(aj, j);
        aJ.a(aj, j1);
        j();
        return aj;
    }

    public bx c(a3 a3_1)
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
            l = l | 0x20;
            i = a3_1;
            f();
            return this;
        }
    }

    public Object clone()
    {
        return d();
    }

    public bx d()
    {
        return a().a(c());
    }

    public bx d(a3 a3_1)
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
            l = l | 0x10;
            g = a3_1;
            f();
            return this;
        }
    }

    public final boolean d()
    {
        return true;
    }

    public aJ e()
    {
        return aJ.f();
    }

    public bx e(a3 a3_1)
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
            l = l | 8;
            k = a3_1;
            f();
            return this;
        }
    }

    public bx f(a3 a3_1)
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
            l = l | 2;
            f = a3_1;
            f();
            return this;
        }
    }

    public aJ g()
    {
        Object obj = c();
        try
        {
            if (!((aJ) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((aJ) (obj));
    }
}
