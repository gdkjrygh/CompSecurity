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
//            g, af, R, aG

public final class ab extends ee
    implements g
{

    private int e;
    private int f;
    private a3 g;

    private ab()
    {
        g = a3.b;
        g();
    }

    private ab(b4 b4)
    {
        super(b4);
        g = a3.b;
        g();
    }

    ab(b4 b4, aG ag)
    {
        this(b4);
    }

    private static ab d()
    {
        return new ab();
    }

    static ab f()
    {
        return d();
    }

    private void g()
    {
        if (!af.j());
    }

    public P a()
    {
        return c();
    }

    protected aH a()
    {
        return R.D().a(org/whispersystems/af, org/whispersystems/ab);
    }

    public cR a()
    {
        return e();
    }

    public eJ a()
    {
        return a();
    }

    public eJ a(eL el, z z)
    {
        return a(el, z);
    }

    public eK a()
    {
        return a();
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

    public ab a()
    {
        return d().a(c());
    }

    public ab a(int i)
    {
        e = e | 1;
        f = i;
        f();
        return this;
    }

    public ab a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof af))
                {
                    break label0;
                }
                p = a((af)p);
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

    public ab a(a3 a3_1)
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
            e = e | 2;
            g = a3_1;
            f();
            return this;
        }
    }

    public ab a(eL el, z z)
    {
        el = (af)af.PARSER.a(el, z);
        if (el != null)
        {
            try
            {
                a(((af) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (af)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((af) (el)));
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

    public ab a(af af1)
    {
        af af2;
        try
        {
            af2 = af.l();
        }
        // Misplaced declaration of an exception variable
        catch (af af1)
        {
            throw af1;
        }
        if (af1 == af2)
        {
            return this;
        }
        try
        {
            if (af1.i())
            {
                a(af1.g());
            }
        }
        // Misplaced declaration of an exception variable
        catch (af af1)
        {
            throw af1;
        }
        try
        {
            if (af1.k())
            {
                a(af1.b());
            }
        }
        // Misplaced declaration of an exception variable
        catch (af af1)
        {
            throw af1;
        }
        b(af1.c());
        return this;
    }

    public P b()
    {
        return b();
    }

    public cP b()
    {
        return R.A();
    }

    public cR b()
    {
        return c();
    }

    public af b()
    {
        return af.l();
    }

    public P c()
    {
        return e();
    }

    public cR c()
    {
        return b();
    }

    public ee c()
    {
        return a();
    }

    public af c()
    {
        int i = 1;
        af af1 = new af(this, null);
        int k = e;
        int j;
        if ((k & 1) != 1)
        {
            i = 0;
        }
        af.a(af1, f);
        j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        af.a(af1, g);
        af.b(af1, j);
        j();
        return af1;
    }

    public Object clone()
    {
        return a();
    }

    public final boolean d()
    {
        return true;
    }

    public af e()
    {
        Object obj = c();
        try
        {
            if (!((af) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((af) (obj));
    }
}
