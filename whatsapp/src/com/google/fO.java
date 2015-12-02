// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            fp, bh, a_, d8, 
//            el, dv, aH, dw, 
//            d9, bp, fn, b4, 
//            dE, P, cR, eJ, 
//            eL, z, eK, eh, 
//            ga, cP, ee

public final class fO extends fp
    implements bh
{

    private boolean f;
    private boolean g;
    private List h;
    private int i;
    private a_ j;

    private fO()
    {
        h = Collections.emptyList();
        e();
    }

    private fO(b4 b4)
    {
        super(b4);
        h = Collections.emptyList();
        e();
    }

    fO(b4 b4, dE de)
    {
        this(b4);
    }

    private static fO b()
    {
        return new fO();
    }

    private a_ d()
    {
        if (j == null)
        {
            List list = h;
            boolean flag;
            if ((i & 4) == 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = new a_(list, flag, g(), e());
            h = null;
        }
        return j;
    }

    private void e()
    {
        if (d8.d)
        {
            d();
        }
    }

    private void k()
    {
        if ((i & 4) != 4)
        {
            h = new ArrayList(h);
            i = i | 4;
        }
    }

    static fO m()
    {
        return b();
    }

    public int a()
    {
        if (j == null)
        {
            return h.size();
        } else
        {
            return j.a();
        }
    }

    public P a()
    {
        return g();
    }

    protected aH a()
    {
        return el.e().a(com/google/dv, com/google/fO);
    }

    public cR a()
    {
        return c();
    }

    public dw a(int i1)
    {
        if (j == null)
        {
            return (dw)h.get(i1);
        } else
        {
            return (dw)j.b(i1);
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

    public fO a(P p)
    {
        if (p instanceof dv)
        {
            return a((dv)p);
        } else
        {
            super.a(p);
            return this;
        }
    }

    public fO a(dv dv1)
    {
label0:
        {
            a_ a_1;
            int i1;
label1:
            {
label2:
                {
                    a_1 = null;
                    i1 = d9.c;
                    if (dv1 == dv.m())
                    {
                        return this;
                    }
                    if (dv1.e())
                    {
                        b(dv1.n());
                    }
                    if (dv1.j())
                    {
                        a(dv1.b());
                    }
                    if (j != null)
                    {
                        break label1;
                    }
                    if (dv.a(dv1).isEmpty())
                    {
                        break label0;
                    }
                    if (h.isEmpty())
                    {
                        h = dv.a(dv1);
                        i = i & -5;
                        if (i1 == 0)
                        {
                            break label2;
                        }
                    }
                    k();
                    h.addAll(dv.a(dv1));
                }
                f();
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (dv.a(dv1).isEmpty())
            {
                break label0;
            }
            if (j.b())
            {
                j.f();
                j = null;
                h = dv.a(dv1);
                i = i & -5;
                if (d8.d)
                {
                    a_1 = d();
                }
                j = a_1;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            j.a(dv.a(dv1));
        }
        a(((d2) (dv1)));
        b(dv1.c());
        return this;
    }

    public fO a(eL el1, z z)
    {
        el1 = (dv)dv.f.a(el1, z);
        if (el1 != null)
        {
            try
            {
                a(((dv) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        return this;
        z;
        el1 = (dv)z.g();
        throw z;
        z;
_L2:
        if (el1 != null)
        {
            try
            {
                a(((dv) (el1)));
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

    public fO a(boolean flag)
    {
        i = i | 2;
        f = flag;
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
        return el.p();
    }

    public cR b()
    {
        return g();
    }

    public fO b(boolean flag)
    {
        i = i | 1;
        g = flag;
        f();
        return this;
    }

    public P c()
    {
        return c();
    }

    public cR c()
    {
        return l();
    }

    public dv c()
    {
        dv dv1 = g();
        if (!dv1.d())
        {
            throw b(dv1);
        } else
        {
            return dv1;
        }
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

    public final boolean d()
    {
        int i1;
        int j1;
        j1 = d9.c;
        i1 = 0;
_L4:
        if (i1 >= a())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a(i1).d()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1++;
        if (j1 == 0) goto _L4; else goto _L3
_L3:
        if (!a()) goto _L1; else goto _L5
_L5:
        return true;
    }

    public fO f()
    {
        return b().a(g());
    }

    public dv g()
    {
label0:
        {
            int i1 = 1;
            dv dv1 = new dv(this, null);
            int k1 = i;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            dv.a(dv1, g);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            dv.b(dv1, f);
            if (j == null)
            {
                if ((i & 4) == 4)
                {
                    h = Collections.unmodifiableList(h);
                    i = i & -5;
                }
                dv.a(dv1, h);
                if (d9.c == 0)
                {
                    break label0;
                }
            }
            dv.a(dv1, j.i());
        }
        dv.a(dv1, j1);
        j();
        return dv1;
    }

    public dv l()
    {
        return dv.m();
    }
}
