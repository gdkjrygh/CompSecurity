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
//            f, aF, R, aG

public final class aj extends ee
    implements f
{

    private int e;
    private int f;
    private a3 g;

    private aj()
    {
        g = a3.b;
        g();
    }

    private aj(b4 b4)
    {
        super(b4);
        g = a3.b;
        g();
    }

    aj(b4 b4, aG ag)
    {
        this(b4);
    }

    private static aj d()
    {
        return new aj();
    }

    static aj e()
    {
        return d();
    }

    private void g()
    {
        if (!aF.l());
    }

    public P a()
    {
        return a();
    }

    protected aH a()
    {
        return R.q().a(org/whispersystems/aF, org/whispersystems/aj);
    }

    public cR a()
    {
        return b();
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

    public aF a()
    {
        int i = 1;
        aF af = new aF(this, null);
        int k = f;
        int j;
        if ((k & 1) != 1)
        {
            i = 0;
        }
        aF.a(af, e);
        j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        aF.a(af, g);
        aF.b(af, j);
        j();
        return af;
    }

    public aj a(int i)
    {
        f = f | 1;
        e = i;
        f();
        return this;
    }

    public aj a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof aF))
                {
                    break label0;
                }
                p = a((aF)p);
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

    public aj a(a3 a3_1)
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
            f = f | 2;
            g = a3_1;
            f();
            return this;
        }
    }

    public aj a(eL el, z z)
    {
        el = (aF)aF.PARSER.a(el, z);
        if (el != null)
        {
            try
            {
                a(((aF) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (aF)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((aF) (el)));
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

    public aj a(aF af)
    {
        aF af1;
        try
        {
            af1 = aF.j();
        }
        // Misplaced declaration of an exception variable
        catch (aF af)
        {
            throw af;
        }
        if (af == af1)
        {
            return this;
        }
        try
        {
            if (af.f())
            {
                a(af.h());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aF af)
        {
            throw af;
        }
        try
        {
            if (af.a())
            {
                a(af.k());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aF af)
        {
            throw af;
        }
        b(af.c());
        return this;
    }

    public P b()
    {
        return c();
    }

    public cP b()
    {
        return R.j();
    }

    public cR b()
    {
        return a();
    }

    public aF b()
    {
        Object obj = a();
        try
        {
            if (!((aF) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((aF) (obj));
    }

    public P c()
    {
        return b();
    }

    public cR c()
    {
        return c();
    }

    public ee c()
    {
        return h();
    }

    public aF c()
    {
        return aF.j();
    }

    public Object clone()
    {
        return h();
    }

    public final boolean d()
    {
        return true;
    }

    public aj h()
    {
        return d().a(a());
    }
}
