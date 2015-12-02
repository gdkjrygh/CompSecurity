// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            ee, gP, d8, a_, 
//            el, du, aH, dS, 
//            d9, bp, fn, b4, 
//            dE, P, cR, eJ, 
//            eL, z, eK, eh, 
//            ga, cP

public final class eT extends ee
    implements gP
{

    private a_ e;
    private int f;
    private List g;

    private eT()
    {
        g = Collections.emptyList();
        b();
    }

    private eT(b4 b4)
    {
        super(b4);
        g = Collections.emptyList();
        b();
    }

    eT(b4 b4, dE de)
    {
        this(b4);
    }

    private void b()
    {
        if (d8.d)
        {
            h();
        }
    }

    static eT c()
    {
        return g();
    }

    private static eT g()
    {
        return new eT();
    }

    private a_ h()
    {
        boolean flag = true;
        if (e == null)
        {
            List list = g;
            if ((f & 1) != 1)
            {
                flag = false;
            }
            e = new a_(list, flag, g(), e());
            g = null;
        }
        return e;
    }

    private void k()
    {
        if ((f & 1) != 1)
        {
            g = new ArrayList(g);
            f = f | 1;
        }
    }

    public P a()
    {
        return a();
    }

    protected aH a()
    {
        return el.c().a(com/google/du, com/google/eT);
    }

    public cR a()
    {
        return e();
    }

    public dS a(int i)
    {
        if (e == null)
        {
            return (dS)g.get(i);
        } else
        {
            return (dS)e.b(i);
        }
    }

    public du a()
    {
        du du1;
label0:
        {
            du1 = new du(this, null);
            int i = f;
            if (e == null)
            {
                if ((f & 1) == 1)
                {
                    g = Collections.unmodifiableList(g);
                    f = f & -2;
                }
                du.a(du1, g);
                if (d9.c == 0)
                {
                    break label0;
                }
            }
            du.a(du1, e.i());
        }
        j();
        return du1;
    }

    public eJ a()
    {
        return f();
    }

    public eJ a(eL el1, z z)
    {
        return a(el1, z);
    }

    public eK a()
    {
        return f();
    }

    public eK a(P p)
    {
        return a(p);
    }

    public eK a(eL el1, z z)
    {
        return a(el1, z);
    }

    public eT a(P p)
    {
        if (p instanceof du)
        {
            return a((du)p);
        } else
        {
            super.a(p);
            return this;
        }
    }

    public eT a(du du1)
    {
label0:
        {
            a_ a_1;
            int i;
label1:
            {
label2:
                {
                    a_1 = null;
                    i = d9.c;
                    if (du1 == du.a())
                    {
                        return this;
                    }
                    if (e != null)
                    {
                        break label1;
                    }
                    if (du.b(du1).isEmpty())
                    {
                        break label0;
                    }
                    if (g.isEmpty())
                    {
                        g = du.b(du1);
                        f = f & -2;
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    k();
                    g.addAll(du.b(du1));
                }
                f();
                if (i == 0)
                {
                    break label0;
                }
            }
            if (du.b(du1).isEmpty())
            {
                break label0;
            }
            if (e.b())
            {
                e.f();
                e = null;
                g = du.b(du1);
                f = f & -2;
                if (d8.d)
                {
                    a_1 = h();
                }
                e = a_1;
                if (i == 0)
                {
                    break label0;
                }
            }
            e.a(du.b(du1));
        }
        b(du1.c());
        return this;
    }

    public eT a(eL el1, z z)
    {
        el1 = (du)du.k.a(el1, z);
        if (el1 != null)
        {
            try
            {
                a(((du) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        return this;
        z;
        el1 = (du)z.g();
        throw z;
        z;
_L2:
        if (el1 != null)
        {
            try
            {
                a(((du) (el1)));
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
        return l();
    }

    public cP b()
    {
        return el.H();
    }

    public cR b()
    {
        return a();
    }

    public P c()
    {
        return e();
    }

    public cR c()
    {
        return l();
    }

    public ee c()
    {
        return f();
    }

    public Object clone()
    {
        return f();
    }

    public int d()
    {
        if (e == null)
        {
            return g.size();
        } else
        {
            return e.a();
        }
    }

    public final boolean d()
    {
        int j = d9.c;
        int i = 0;
        do
        {
            if (i >= d())
            {
                break;
            }
            if (!a(i).d())
            {
                return false;
            }
            i++;
        } while (j == 0);
        return true;
    }

    public du e()
    {
        du du1 = a();
        if (!du1.d())
        {
            throw b(du1);
        } else
        {
            return du1;
        }
    }

    public eT f()
    {
        return g().a(a());
    }

    public du l()
    {
        return du.a();
    }
}
