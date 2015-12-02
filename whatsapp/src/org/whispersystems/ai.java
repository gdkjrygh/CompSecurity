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
//            l, ag, R, aG

public final class ai extends ee
    implements l
{

    private a3 e;
    private int f;
    private a3 g;

    private ai()
    {
        g = a3.b;
        e = a3.b;
        g();
    }

    private ai(b4 b4)
    {
        super(b4);
        g = a3.b;
        e = a3.b;
        g();
    }

    ai(b4 b4, aG ag1)
    {
        this(b4);
    }

    private static ai d()
    {
        return new ai();
    }

    static ai e()
    {
        return d();
    }

    private void g()
    {
        if (!ag.h());
    }

    public P a()
    {
        return b();
    }

    protected aH a()
    {
        return R.r().a(org/whispersystems/ag, org/whispersystems/ai);
    }

    public cR a()
    {
        return h();
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

    public ai a()
    {
        return d().a(b());
    }

    public ai a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof ag))
                {
                    break label0;
                }
                p = a((ag)p);
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

    public ai a(a3 a3_1)
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
            f = f | 1;
            g = a3_1;
            f();
            return this;
        }
    }

    public ai a(eL el, z z)
    {
        el = (ag)ag.PARSER.a(el, z);
        if (el != null)
        {
            try
            {
                a(((ag) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (ag)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((ag) (el)));
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

    public ai a(ag ag1)
    {
        ag ag2;
        try
        {
            ag2 = ag.a();
        }
        // Misplaced declaration of an exception variable
        catch (ag ag1)
        {
            throw ag1;
        }
        if (ag1 == ag2)
        {
            return this;
        }
        try
        {
            if (ag1.f())
            {
                a(ag1.i());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ag ag1)
        {
            throw ag1;
        }
        try
        {
            if (ag1.b())
            {
                b(ag1.c());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ag ag1)
        {
            throw ag1;
        }
        b(ag1.c());
        return this;
    }

    public P b()
    {
        return c();
    }

    public cP b()
    {
        return R.b();
    }

    public cR b()
    {
        return b();
    }

    public ag b()
    {
        int i = 1;
        ag ag1 = new ag(this, null);
        int k = f;
        int j;
        if ((k & 1) != 1)
        {
            i = 0;
        }
        ag.a(ag1, g);
        j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        ag.b(ag1, e);
        ag.a(ag1, j);
        j();
        return ag1;
    }

    public ai b(a3 a3_1)
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
            e = a3_1;
            f();
            return this;
        }
    }

    public P c()
    {
        return h();
    }

    public cR c()
    {
        return c();
    }

    public ee c()
    {
        return a();
    }

    public ag c()
    {
        return ag.a();
    }

    public Object clone()
    {
        return a();
    }

    public final boolean d()
    {
        return true;
    }

    public ag h()
    {
        Object obj = b();
        try
        {
            if (!((ag) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((ag) (obj));
    }
}
