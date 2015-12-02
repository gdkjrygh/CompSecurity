// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            fp, e6, a_, d8, 
//            el, dK, aH, dw, 
//            d9, bp, fn, b4, 
//            dE, P, cR, eJ, 
//            eL, z, eK, eh, 
//            ga, cP, ee

public final class ft extends fp
    implements e6
{

    private int f;
    private List g;
    private a_ h;

    private ft()
    {
        g = Collections.emptyList();
        k();
    }

    private ft(b4 b4)
    {
        super(b4);
        g = Collections.emptyList();
        k();
    }

    ft(b4 b4, dE de)
    {
        this(b4);
    }

    private static ft a()
    {
        return new ft();
    }

    private void c()
    {
        if ((f & 1) != 1)
        {
            g = new ArrayList(g);
            f = f | 1;
        }
    }

    private a_ g()
    {
        boolean flag = true;
        if (h == null)
        {
            List list = g;
            if ((f & 1) != 1)
            {
                flag = false;
            }
            h = new a_(list, flag, g(), e());
            g = null;
        }
        return h;
    }

    private void k()
    {
        if (d8.d)
        {
            g();
        }
    }

    static ft m()
    {
        return a();
    }

    public P a()
    {
        return n();
    }

    protected aH a()
    {
        return el.d().a(com/google/dK, com/google/ft);
    }

    public cR a()
    {
        return e();
    }

    public dw a(int i)
    {
        if (h == null)
        {
            return (dw)g.get(i);
        } else
        {
            return (dw)h.b(i);
        }
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

    public eh a(P p)
    {
        return a(p);
    }

    public ft a(P p)
    {
        if (p instanceof dK)
        {
            return a((dK)p);
        } else
        {
            super.a(p);
            return this;
        }
    }

    public ft a(dK dk)
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
                    if (dk == dK.h())
                    {
                        return this;
                    }
                    if (h != null)
                    {
                        break label1;
                    }
                    if (dK.b(dk).isEmpty())
                    {
                        break label0;
                    }
                    if (g.isEmpty())
                    {
                        g = dK.b(dk);
                        f = f & -2;
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    c();
                    g.addAll(dK.b(dk));
                }
                f();
                if (i == 0)
                {
                    break label0;
                }
            }
            if (dK.b(dk).isEmpty())
            {
                break label0;
            }
            if (h.b())
            {
                h.f();
                h = null;
                g = dK.b(dk);
                f = f & -2;
                if (d8.d)
                {
                    a_1 = g();
                }
                h = a_1;
                if (i == 0)
                {
                    break label0;
                }
            }
            h.a(dK.b(dk));
        }
        a(((d2) (dk)));
        b(dk.c());
        return this;
    }

    public ft a(eL el1, z z)
    {
        el1 = (dK)dK.l.a(el1, z);
        if (el1 != null)
        {
            try
            {
                a(((dK) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        return this;
        z;
        el1 = (dK)z.g();
        throw z;
        z;
_L2:
        if (el1 != null)
        {
            try
            {
                a(((dK) (el1)));
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

    public ga a(eL el1, z z)
    {
        return a(el1, z);
    }

    public P b()
    {
        return d();
    }

    public cP b()
    {
        return el.E();
    }

    public cR b()
    {
        return n();
    }

    public P c()
    {
        return e();
    }

    public cR c()
    {
        return d();
    }

    public ee c()
    {
        return f();
    }

    public fp c()
    {
        return f();
    }

    public Object clone()
    {
        return f();
    }

    public dK d()
    {
        return dK.h();
    }

    public final boolean d()
    {
        int i;
        int j;
        j = d9.c;
        i = 0;
_L4:
        if (i >= l())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a(i).d()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i++;
        if (j == 0) goto _L4; else goto _L3
_L3:
        if (!a()) goto _L1; else goto _L5
_L5:
        return true;
    }

    public dK e()
    {
        dK dk = n();
        if (!dk.d())
        {
            throw b(dk);
        } else
        {
            return dk;
        }
    }

    public ft f()
    {
        return a().a(n());
    }

    public int l()
    {
        if (h == null)
        {
            return g.size();
        } else
        {
            return h.a();
        }
    }

    public dK n()
    {
        dK dk;
label0:
        {
            dk = new dK(this, null);
            int i = f;
            if (h == null)
            {
                if ((f & 1) == 1)
                {
                    g = Collections.unmodifiableList(g);
                    f = f & -2;
                }
                dK.a(dk, g);
                if (d9.c == 0)
                {
                    break label0;
                }
            }
            dK.a(dk, h.i());
        }
        j();
        return dk;
    }
}
