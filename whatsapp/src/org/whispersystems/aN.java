// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.P;
import com.google.aH;
import com.google.a_;
import com.google.b4;
import com.google.bp;
import com.google.cP;
import com.google.cR;
import com.google.cW;
import com.google.eJ;
import com.google.eK;
import com.google.eL;
import com.google.ee;
import com.google.eh;
import com.google.fn;
import com.google.ga;
import com.google.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package org.whispersystems:
//            am, af, ag, a5, 
//            R, ac, ab, ai, 
//            aG

public final class aN extends ee
    implements am
{

    private ag e;
    private int f;
    private int g;
    private cW h;
    private a_ i;
    private af j;
    private List k;
    private cW l;

    private aN()
    {
        j = af.l();
        e = ag.a();
        k = Collections.emptyList();
        k();
    }

    private aN(b4 b4)
    {
        super(b4);
        j = af.l();
        e = ag.a();
        k = Collections.emptyList();
        k();
    }

    aN(b4 b4, aG ag1)
    {
        this(b4);
    }

    private static aN a()
    {
        return new aN();
    }

    private a_ b()
    {
        if (i == null)
        {
            List list = k;
            boolean flag;
            if ((g & 8) == 8)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = new a_(list, flag, g(), e());
            k = null;
        }
        return i;
    }

    private void g()
    {
        if ((g & 8) != 8)
        {
            k = new ArrayList(k);
            g = g | 8;
        }
    }

    private cW h()
    {
        if (l == null)
        {
            l = new cW(e, g(), e());
            e = null;
        }
        return l;
    }

    private void k()
    {
        if (a5.r())
        {
            l();
            h();
            b();
        }
    }

    private cW l()
    {
        if (h == null)
        {
            h = new cW(j, g(), e());
            j = null;
        }
        return h;
    }

    static aN n()
    {
        return a();
    }

    public P a()
    {
        return d();
    }

    protected aH a()
    {
        return R.t().a(org/whispersystems/a5, org/whispersystems/aN);
    }

    public cR a()
    {
        return m();
    }

    public eJ a()
    {
        return c();
    }

    public eJ a(eL el, z z)
    {
        return a(el, z);
    }

    public eK a()
    {
        return c();
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

    public aN a(int i1)
    {
        g = g | 1;
        f = i1;
        f();
        return this;
    }

    public aN a(P p)
    {
        if (p instanceof a5)
        {
            return a((a5)p);
        } else
        {
            super.a(p);
            return this;
        }
    }

    public aN a(eL el, z z)
    {
        el = (a5)a5.i.a(el, z);
        if (el != null)
        {
            try
            {
                a(((a5) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (a5)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((a5) (el)));
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

    public aN a(a5 a5_1)
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
                    i1 = ac.H;
                    if (a5_1 == a5.l())
                    {
                        return this;
                    }
                    if (a5_1.j())
                    {
                        a(a5_1.c());
                    }
                    if (a5_1.v())
                    {
                        a(a5_1.n());
                    }
                    if (a5_1.u())
                    {
                        a(a5_1.k());
                    }
                    if (i != null)
                    {
                        break label1;
                    }
                    if (a5.a(a5_1).isEmpty())
                    {
                        break label0;
                    }
                    if (k.isEmpty())
                    {
                        k = a5.a(a5_1);
                        g = g & -9;
                        if (i1 == 0)
                        {
                            break label2;
                        }
                    }
                    g();
                    k.addAll(a5.a(a5_1));
                }
                f();
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (a5.a(a5_1).isEmpty())
            {
                break label0;
            }
            if (i.b())
            {
                i.f();
                i = null;
                k = a5.a(a5_1);
                g = g & -9;
                if (a5.q())
                {
                    a_1 = b();
                }
                i = a_1;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            i.a(a5.a(a5_1));
        }
        b(a5_1.c());
        return this;
    }

    public aN a(af af1)
    {
label0:
        {
label1:
            {
                int i1;
label2:
                {
                    i1 = ac.H;
                    if (h != null)
                    {
                        break label1;
                    }
                    if ((g & 2) == 2 && j != af.l())
                    {
                        j = af.a(j).a(af1).c();
                        if (i1 == 0)
                        {
                            break label2;
                        }
                    }
                    j = af1;
                }
                f();
                if (i1 == 0)
                {
                    break label0;
                }
            }
            h.a(af1);
        }
        g = g | 2;
        return this;
    }

    public aN a(ag ag1)
    {
label0:
        {
label1:
            {
                int i1;
label2:
                {
                    i1 = ac.H;
                    if (l != null)
                    {
                        break label1;
                    }
                    if ((g & 4) == 4 && e != ag.a())
                    {
                        e = ag.a(e).a(ag1).b();
                        if (i1 == 0)
                        {
                            break label2;
                        }
                    }
                    e = ag1;
                }
                f();
                if (i1 == 0)
                {
                    break label0;
                }
            }
            l.a(ag1);
        }
        g = g | 4;
        return this;
    }

    public P b()
    {
        return e();
    }

    public cP b()
    {
        return org.whispersystems.R.z();
    }

    public cR b()
    {
        return d();
    }

    public P c()
    {
        return m();
    }

    public cR c()
    {
        return e();
    }

    public ee c()
    {
        return c();
    }

    public aN c()
    {
        return a().a(d());
    }

    public Object clone()
    {
        return c();
    }

    public a5 d()
    {
label0:
        {
            int i1 = 1;
            int k1 = ac.H;
            a5 a5_1 = new a5(this, null);
            int l1 = g;
            int j1;
            if ((l1 & 1) != 1)
            {
                i1 = 0;
            }
            a5.b(a5_1, f);
            if ((l1 & 2) == 2)
            {
                i1 |= 2;
            }
            if (h == null)
            {
                a5.a(a5_1, j);
                if (k1 == 0)
                {
                    break label0;
                }
            }
            a5.a(a5_1, (af)h.g());
        }
label1:
        {
            j1 = i1;
            if ((l1 & 4) == 4)
            {
                j1 = i1 | 4;
            }
            if (l == null)
            {
                a5.a(a5_1, e);
                if (k1 == 0)
                {
                    break label1;
                }
            }
            a5.a(a5_1, (ag)l.g());
        }
label2:
        {
            if (i == null)
            {
                if ((g & 8) == 8)
                {
                    k = Collections.unmodifiableList(k);
                    g = g & -9;
                }
                a5.a(a5_1, k);
                if (k1 == 0)
                {
                    break label2;
                }
            }
            a5.a(a5_1, i.i());
        }
        a5.a(a5_1, j1);
        j();
        return a5_1;
    }

    public final boolean d()
    {
        return true;
    }

    public a5 e()
    {
        return a5.l();
    }

    public a5 m()
    {
        a5 a5_1 = d();
        if (!a5_1.d())
        {
            throw b(a5_1);
        } else
        {
            return a5_1;
        }
    }
}
