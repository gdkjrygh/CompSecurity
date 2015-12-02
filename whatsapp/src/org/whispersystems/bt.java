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
//            a9, a2, R, aG

public final class bt extends ee
    implements a9
{

    private a3 e;
    private int f;
    private int g;
    private a3 h;
    private a3 i;

    private bt()
    {
        e = a3.b;
        i = a3.b;
        h = a3.b;
        g();
    }

    private bt(b4 b4)
    {
        super(b4);
        e = a3.b;
        i = a3.b;
        h = a3.b;
        g();
    }

    bt(b4 b4, aG ag)
    {
        this(b4);
    }

    private static bt c()
    {
        return new bt();
    }

    static bt e()
    {
        return c();
    }

    private void g()
    {
        if (!a2.a());
    }

    public P a()
    {
        return a();
    }

    protected aH a()
    {
        return R.l().a(org/whispersystems/a2, org/whispersystems/bt);
    }

    public cR a()
    {
        return d();
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

    public a2 a()
    {
        int k = 1;
        a2 a2_1 = new a2(this, null);
        int l = g;
        int j;
        if ((l & 1) != 1)
        {
            k = 0;
        }
        a2.a(a2_1, f);
        j = k;
        if ((l & 2) == 2)
        {
            j = k | 2;
        }
        a2.b(a2_1, e);
        k = j;
        if ((l & 4) == 4)
        {
            k = j | 4;
        }
        a2.c(a2_1, i);
        j = k;
        if ((l & 8) == 8)
        {
            j = k | 8;
        }
        a2.a(a2_1, h);
        a2.b(a2_1, j);
        j();
        return a2_1;
    }

    public bt a(int j)
    {
        g = g | 1;
        f = j;
        f();
        return this;
    }

    public bt a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof a2))
                {
                    break label0;
                }
                p = a((a2)p);
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

    public bt a(a3 a3_1)
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
            i = a3_1;
            f();
            return this;
        }
    }

    public bt a(eL el, z z)
    {
        el = (a2)a2.PARSER.a(el, z);
        if (el != null)
        {
            try
            {
                a(((a2) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (a2)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((a2) (el)));
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

    public bt a(a2 a2_1)
    {
        a2 a2_2;
        try
        {
            a2_2 = a2.n();
        }
        // Misplaced declaration of an exception variable
        catch (a2 a2_1)
        {
            throw a2_1;
        }
        if (a2_1 == a2_2)
        {
            return this;
        }
        try
        {
            if (a2_1.p())
            {
                a(a2_1.c());
            }
        }
        // Misplaced declaration of an exception variable
        catch (a2 a2_1)
        {
            throw a2_1;
        }
        try
        {
            if (a2_1.e())
            {
                b(a2_1.k());
            }
        }
        // Misplaced declaration of an exception variable
        catch (a2 a2_1)
        {
            throw a2_1;
        }
        try
        {
            if (a2_1.q())
            {
                a(a2_1.b());
            }
        }
        // Misplaced declaration of an exception variable
        catch (a2 a2_1)
        {
            throw a2_1;
        }
        try
        {
            if (a2_1.i())
            {
                c(a2_1.g());
            }
        }
        // Misplaced declaration of an exception variable
        catch (a2 a2_1)
        {
            throw a2_1;
        }
        b(a2_1.c());
        return this;
    }

    public P b()
    {
        return b();
    }

    public cP b()
    {
        return R.v();
    }

    public cR b()
    {
        return a();
    }

    public a2 b()
    {
        return a2.n();
    }

    public bt b(a3 a3_1)
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
            g = g | 2;
            e = a3_1;
            f();
            return this;
        }
    }

    public P c()
    {
        return d();
    }

    public cR c()
    {
        return b();
    }

    public ee c()
    {
        return f();
    }

    public bt c(a3 a3_1)
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
            h = a3_1;
            f();
            return this;
        }
    }

    public Object clone()
    {
        return f();
    }

    public a2 d()
    {
        Object obj = a();
        try
        {
            if (!((a2) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((a2) (obj));
    }

    public final boolean d()
    {
        return true;
    }

    public bt f()
    {
        return c().a(a());
    }
}
