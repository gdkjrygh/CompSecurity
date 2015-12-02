// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            fp, d0, a_, d8, 
//            el, dJ, aH, dw, 
//            d9, bp, fn, b4, 
//            dE, P, cR, eJ, 
//            eL, z, eK, eh, 
//            ga, cP, ee

public final class f0 extends fp
    implements d0
{

    private int f;
    private a_ g;
    private List h;
    private boolean i;

    private f0()
    {
        i = true;
        h = Collections.emptyList();
        g();
    }

    private f0(b4 b4)
    {
        super(b4);
        i = true;
        h = Collections.emptyList();
        g();
    }

    f0(b4 b4, dE de)
    {
        this(b4);
    }

    private static f0 c()
    {
        return new f0();
    }

    static f0 d()
    {
        return c();
    }

    private a_ e()
    {
        if (g == null)
        {
            List list = h;
            boolean flag;
            if ((f & 2) == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g = new a_(list, flag, g(), e());
            h = null;
        }
        return g;
    }

    private void g()
    {
        if (d8.d)
        {
            e();
        }
    }

    private void k()
    {
        if ((f & 2) != 2)
        {
            h = new ArrayList(h);
            f = f | 2;
        }
    }

    public P a()
    {
        return h();
    }

    protected aH a()
    {
        return el.r().a(com/google/dJ, com/google/f0);
    }

    public cR a()
    {
        return b();
    }

    public dw a(int j)
    {
        if (g == null)
        {
            return (dw)h.get(j);
        } else
        {
            return (dw)g.b(j);
        }
    }

    public eJ a()
    {
        return a();
    }

    public eJ a(eL el1, z z)
    {
        return a(el1, z);
    }

    public eK a()
    {
        return a();
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

    public f0 a()
    {
        return c().a(h());
    }

    public f0 a(P p)
    {
        if (p instanceof dJ)
        {
            return a((dJ)p);
        } else
        {
            super.a(p);
            return this;
        }
    }

    public f0 a(dJ dj)
    {
label0:
        {
            a_ a_1;
            int j;
label1:
            {
label2:
                {
                    a_1 = null;
                    j = d9.c;
                    if (dj == dJ.m())
                    {
                        return this;
                    }
                    if (dj.k())
                    {
                        a(dj.e());
                    }
                    if (g != null)
                    {
                        break label1;
                    }
                    if (dJ.a(dj).isEmpty())
                    {
                        break label0;
                    }
                    if (h.isEmpty())
                    {
                        h = dJ.a(dj);
                        f = f & -3;
                        if (j == 0)
                        {
                            break label2;
                        }
                    }
                    k();
                    h.addAll(dJ.a(dj));
                }
                f();
                if (j == 0)
                {
                    break label0;
                }
            }
            if (dJ.a(dj).isEmpty())
            {
                break label0;
            }
            if (g.b())
            {
                g.f();
                g = null;
                h = dJ.a(dj);
                f = f & -3;
                if (d8.d)
                {
                    a_1 = e();
                }
                g = a_1;
                if (j == 0)
                {
                    break label0;
                }
            }
            g.a(dJ.a(dj));
        }
        a(((d2) (dj)));
        b(dj.c());
        return this;
    }

    public f0 a(eL el1, z z)
    {
        el1 = (dJ)dJ.o.a(el1, z);
        if (el1 != null)
        {
            try
            {
                a(((dJ) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        return this;
        z;
        el1 = (dJ)z.g();
        throw z;
        z;
_L2:
        if (el1 != null)
        {
            try
            {
                a(((dJ) (el1)));
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

    public f0 a(boolean flag)
    {
        f = f | 1;
        i = flag;
        f();
        return this;
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
        return el.z();
    }

    public cR b()
    {
        return h();
    }

    public dJ b()
    {
        dJ dj = h();
        if (!dj.d())
        {
            throw b(((P) (dj)));
        } else
        {
            return dj;
        }
    }

    public P c()
    {
        return b();
    }

    public cR c()
    {
        return l();
    }

    public ee c()
    {
        return a();
    }

    public fp c()
    {
        return a();
    }

    public Object clone()
    {
        return a();
    }

    public final boolean d()
    {
        int j;
        int i1;
        i1 = d9.c;
        j = 0;
_L4:
        if (j >= f())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a(j).d()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        j++;
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        if (!a()) goto _L1; else goto _L5
_L5:
        return true;
    }

    public int f()
    {
        if (g == null)
        {
            return h.size();
        } else
        {
            return g.a();
        }
    }

    public dJ h()
    {
label0:
        {
            int j = 1;
            dJ dj = new dJ(this, null);
            if ((f & 1) != 1)
            {
                j = 0;
            }
            dJ.a(dj, i);
            if (g == null)
            {
                if ((f & 2) == 2)
                {
                    h = Collections.unmodifiableList(h);
                    f = f & -3;
                }
                dJ.a(dj, h);
                if (d9.c == 0)
                {
                    break label0;
                }
            }
            dJ.a(dj, g.i());
        }
        dJ.a(dj, j);
        j();
        return dj;
    }

    public dJ l()
    {
        return dJ.m();
    }
}
