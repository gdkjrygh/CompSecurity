// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.P;
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
//            bq, aM, d, ap

public final class a3 extends ee
    implements bq
{

    private com.google.a3 e;
    private int f;
    private int g;
    private int h;

    private a3()
    {
        e = com.google.a3.b;
        b();
    }

    private a3(b4 b4)
    {
        super(b4);
        e = com.google.a3.b;
        b();
    }

    a3(b4 b4, ap ap)
    {
        this(b4);
    }

    private void b()
    {
        if (!aM.h());
    }

    private static a3 c()
    {
        return new a3();
    }

    static a3 g()
    {
        return c();
    }

    public P a()
    {
        return d();
    }

    protected aH a()
    {
        return org.whispersystems.d.e().a(org/whispersystems/aM, org/whispersystems/a3);
    }

    public cR a()
    {
        return e();
    }

    public eJ a()
    {
        return f();
    }

    public eJ a(eL el, z z)
    {
        return a(el, z);
    }

    public eK a()
    {
        return f();
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

    public a3 a(int i)
    {
        g = g | 1;
        h = i;
        f();
        return this;
    }

    public a3 a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof aM))
                {
                    break label0;
                }
                p = a((aM)p);
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

    public a3 a(com.google.a3 a3_1)
    {
        if (a3_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (com.google.a3 a3_1)
            {
                throw a3_1;
            }
        } else
        {
            g = g | 4;
            e = a3_1;
            f();
            return this;
        }
    }

    public a3 a(eL el, z z)
    {
        el = (aM)aM.n.a(el, z);
        if (el != null)
        {
            try
            {
                a(((aM) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (aM)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((aM) (el)));
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

    public a3 a(aM am)
    {
        aM am1;
        try
        {
            am1 = aM.b();
        }
        // Misplaced declaration of an exception variable
        catch (aM am)
        {
            throw am;
        }
        if (am == am1)
        {
            return this;
        }
        try
        {
            if (am.k())
            {
                a(am.c());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aM am)
        {
            throw am;
        }
        try
        {
            if (am.l())
            {
                b(am.m());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aM am)
        {
            throw am;
        }
        try
        {
            if (am.f())
            {
                a(am.j());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aM am)
        {
            throw am;
        }
        b(am.c());
        return this;
    }

    public aM a()
    {
        return aM.b();
    }

    public P b()
    {
        return a();
    }

    public cP b()
    {
        return org.whispersystems.d.c();
    }

    public cR b()
    {
        return d();
    }

    public a3 b(int i)
    {
        g = g | 2;
        f = i;
        f();
        return this;
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
        return f();
    }

    public Object clone()
    {
        return f();
    }

    public aM d()
    {
        int j = 1;
        aM am = new aM(this, null);
        int k = g;
        int i;
        if ((k & 1) != 1)
        {
            j = 0;
        }
        aM.b(am, h);
        i = j;
        if ((k & 2) == 2)
        {
            i = j | 2;
        }
        aM.c(am, f);
        j = i;
        if ((k & 4) == 4)
        {
            j = i | 4;
        }
        aM.a(am, e);
        aM.a(am, j);
        j();
        return am;
    }

    public final boolean d()
    {
        return true;
    }

    public aM e()
    {
        Object obj = d();
        try
        {
            if (!((aM) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((aM) (obj));
    }

    public a3 f()
    {
        return c().a(d());
    }
}
