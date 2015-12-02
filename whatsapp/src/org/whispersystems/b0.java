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
//            bm, aP, R, aG

public final class b0 extends ee
    implements bm
{

    private int e;
    private int f;
    private a3 g;

    private b0()
    {
        g = a3.b;
        g();
    }

    private b0(b4 b4)
    {
        super(b4);
        g = a3.b;
        g();
    }

    b0(b4 b4, aG ag)
    {
        this(b4);
    }

    static b0 b()
    {
        return d();
    }

    private static b0 d()
    {
        return new b0();
    }

    private void g()
    {
        if (!aP.b());
    }

    public P a()
    {
        return e();
    }

    protected aH a()
    {
        return R.a().a(org/whispersystems/aP, org/whispersystems/b0);
    }

    public cR a()
    {
        return a();
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

    public aP a()
    {
        Object obj = e();
        try
        {
            if (!((aP) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((aP) (obj));
    }

    public b0 a(int i)
    {
        f = f | 1;
        e = i;
        f();
        return this;
    }

    public b0 a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof aP))
                {
                    break label0;
                }
                p = a((aP)p);
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

    public b0 a(a3 a3_1)
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

    public b0 a(eL el, z z)
    {
        el = (aP)aP.PARSER.a(el, z);
        if (el != null)
        {
            try
            {
                a(((aP) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (aP)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((aP) (el)));
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

    public b0 a(aP ap)
    {
        aP ap1;
        try
        {
            ap1 = aP.e();
        }
        // Misplaced declaration of an exception variable
        catch (aP ap)
        {
            throw ap;
        }
        if (ap == ap1)
        {
            return this;
        }
        try
        {
            if (ap.a())
            {
                a(ap.g());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aP ap)
        {
            throw ap;
        }
        try
        {
            if (ap.k())
            {
                a(ap.d());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aP ap)
        {
            throw ap;
        }
        b(ap.c());
        return this;
    }

    public P b()
    {
        return c();
    }

    public cP b()
    {
        return R.s();
    }

    public cR b()
    {
        return e();
    }

    public P c()
    {
        return a();
    }

    public cR c()
    {
        return c();
    }

    public ee c()
    {
        return f();
    }

    public aP c()
    {
        return aP.e();
    }

    public Object clone()
    {
        return f();
    }

    public final boolean d()
    {
        return true;
    }

    public aP e()
    {
        int i = 1;
        aP ap = new aP(this, null);
        int k = f;
        int j;
        if ((k & 1) != 1)
        {
            i = 0;
        }
        aP.b(ap, e);
        j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        aP.a(ap, g);
        aP.a(ap, j);
        j();
        return ap;
    }

    public b0 f()
    {
        return d().a(e());
    }
}
