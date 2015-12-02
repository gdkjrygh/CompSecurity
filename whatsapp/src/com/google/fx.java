// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            fp, em, gD, a_, 
//            d8, el, dz, aH, 
//            dw, d9, bp, fn, 
//            b4, dE, P, cR, 
//            eJ, eL, z, eK, 
//            eh, ga, cP, ee

public final class fx extends fp
    implements em
{

    private int f;
    private gD g;
    private boolean h;
    private boolean i;
    private Object j;
    private boolean k;
    private boolean l;
    private a_ m;
    private List n;

    private fx()
    {
        g = gD.STRING;
        j = "";
        n = Collections.emptyList();
        k();
    }

    private fx(b4 b4)
    {
        super(b4);
        g = gD.STRING;
        j = "";
        n = Collections.emptyList();
        k();
    }

    fx(b4 b4, dE de)
    {
        this(b4);
    }

    private void a()
    {
        try
        {
            if ((f & 0x40) != 64)
            {
                n = new ArrayList(n);
                f = f | 0x40;
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    private a_ d()
    {
        a_ a_1 = m;
        if (a_1 == null)
        {
            List list;
            NullPointerException nullpointerexception;
            int i1;
            boolean flag;
            try
            {
                list = n;
                i1 = f;
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
            if ((i1 & 0x40) == 64)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            m = new a_(list, flag, g(), e());
            n = null;
        }
        return m;
        nullpointerexception;
        throw nullpointerexception;
    }

    private static fx f()
    {
        return new fx();
    }

    static fx g()
    {
        return f();
    }

    private void k()
    {
        try
        {
            if (d8.d)
            {
                d();
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    public P a()
    {
        return e();
    }

    protected aH a()
    {
        return el.M().a(com/google/dz, com/google/fx);
    }

    public cR a()
    {
        return l();
    }

    public dw a(int i1)
    {
label0:
        {
            dw dw1;
            try
            {
                if (m != null)
                {
                    break label0;
                }
                dw1 = (dw)n.get(i1);
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return dw1;
        }
        return (dw)m.b(i1);
    }

    public eJ a()
    {
        return b();
    }

    public eJ a(eL el1, z z)
    {
        return a(el1, z);
    }

    public eK a()
    {
        return b();
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

    public fx a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof dz))
                {
                    break label0;
                }
                p = a((dz)p);
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

    public fx a(dz dz1)
    {
        a_ a_1 = null;
        int i1 = d9.c;
        Object obj;
        try
        {
            obj = dz.p();
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1)
        {
            throw dz1;
        }
        if (dz1 == obj)
        {
            return this;
        }
        boolean flag;
        try
        {
            if (dz1.n())
            {
                a(dz1.w());
            }
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1)
        {
            throw dz1;
        }
        try
        {
            if (dz1.r())
            {
                b(dz1.u());
            }
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1)
        {
            throw dz1;
        }
        try
        {
            if (dz1.s())
            {
                c(dz1.j());
            }
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1)
        {
            throw dz1;
        }
        try
        {
            if (dz1.e())
            {
                a(dz1.q());
            }
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1)
        {
            throw dz1;
        }
        try
        {
            if (dz1.m())
            {
                f = f | 0x10;
                j = dz.b(dz1);
                f();
            }
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1)
        {
            throw dz1;
        }
        try
        {
            if (dz1.f())
            {
                d(dz1.t());
            }
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1)
        {
            throw dz1;
        }
        obj = m;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        flag = dz.c(dz1).isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        flag = n.isEmpty();
        if (flag)
        {
            try
            {
                n = dz.c(dz1);
                f = f & 0xffffffbf;
            }
            // Misplaced declaration of an exception variable
            catch (dz dz1)
            {
                throw dz1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_214;
            }
        }
        a();
        n.addAll(dz.c(dz1));
        f();
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        flag = dz.c(dz1).isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        flag = m.b();
        if (flag)
        {
            try
            {
                m.f();
                m = null;
                n = dz.c(dz1);
                f = f & 0xffffffbf;
                if (d8.d)
                {
                    a_1 = d();
                }
            }
            // Misplaced declaration of an exception variable
            catch (dz dz1)
            {
                throw dz1;
            }
            try
            {
                m = a_1;
            }
            // Misplaced declaration of an exception variable
            catch (dz dz1)
            {
                throw dz1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_317;
            }
        }
        m.a(dz.c(dz1));
        a(((d2) (dz1)));
        b(dz1.c());
        return this;
        dz1;
        try
        {
            throw dz1;
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1) { }
        try
        {
            throw dz1;
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1) { }
        throw dz1;
        dz1;
        try
        {
            throw dz1;
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1) { }
        try
        {
            throw dz1;
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1) { }
        throw dz1;
    }

    public fx a(eL el1, z z)
    {
        el1 = (dz)dz.y.a(el1, z);
        if (el1 != null)
        {
            try
            {
                a(((dz) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        return this;
        z;
        el1 = (dz)z.g();
        throw z;
        z;
_L2:
        if (el1 != null)
        {
            try
            {
                a(((dz) (el1)));
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

    public fx a(gD gd)
    {
        if (gd == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (gD gd)
            {
                throw gd;
            }
        } else
        {
            f = f | 1;
            g = gd;
            f();
            return this;
        }
    }

    public fx a(boolean flag)
    {
        f = f | 8;
        l = flag;
        f();
        return this;
    }

    public ga a(eL el1, z z)
    {
        return a(el1, z);
    }

    public P b()
    {
        return h();
    }

    public cP b()
    {
        return el.A();
    }

    public cR b()
    {
        return e();
    }

    public fx b()
    {
        return f().a(e());
    }

    public fx b(boolean flag)
    {
        f = f | 2;
        h = flag;
        f();
        return this;
    }

    public int c()
    {
label0:
        {
            int i1;
            try
            {
                if (m != null)
                {
                    break label0;
                }
                i1 = n.size();
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return i1;
        }
        return m.a();
    }

    public P c()
    {
        return l();
    }

    public cR c()
    {
        return h();
    }

    public ee c()
    {
        return b();
    }

    public fp c()
    {
        return b();
    }

    public fx c(boolean flag)
    {
        f = f | 4;
        k = flag;
        f();
        return this;
    }

    public Object clone()
    {
        return b();
    }

    public fx d(boolean flag)
    {
        f = f | 0x20;
        i = flag;
        f();
        return this;
    }

    public final boolean d()
    {
        int i1;
        int j1;
        j1 = d9.c;
        i1 = 0;
_L4:
        if (i1 >= c())
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        try
        {
            flag = a(i1).d();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1++;
        if (j1 == 0) goto _L4; else goto _L3
_L3:
        boolean flag1;
        try
        {
            flag1 = a();
        }
        catch (NullPointerException nullpointerexception1)
        {
            throw nullpointerexception1;
        }
        if (flag1)
        {
            return true;
        }
          goto _L1
        if (true) goto _L4; else goto _L5
_L5:
    }

    public dz e()
    {
        int j1 = 1;
        dz dz1 = new dz(this, null);
        int k1 = f;
        NullPointerException nullpointerexception;
        a_ a_1;
        int i1;
        if ((k1 & 1) != 1)
        {
            j1 = 0;
        }
        dz.a(dz1, g);
        i1 = j1;
        if ((k1 & 2) == 2)
        {
            i1 = j1 | 2;
        }
        dz.b(dz1, h);
        j1 = i1;
        if ((k1 & 4) == 4)
        {
            j1 = i1 | 4;
        }
        dz.d(dz1, k);
        i1 = j1;
        if ((k1 & 8) == 8)
        {
            i1 = j1 | 8;
        }
        dz.a(dz1, l);
        j1 = i1;
        if ((k1 & 0x10) == 16)
        {
            j1 = i1 | 0x10;
        }
        dz.a(dz1, j);
        i1 = j1;
        if ((k1 & 0x20) == 32)
        {
            i1 = j1 | 0x20;
        }
        dz.c(dz1, i);
        a_1 = m;
        if (a_1 != null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        try
        {
            if ((f & 0x40) == 64)
            {
                n = Collections.unmodifiableList(n);
                f = f & 0xffffffbf;
            }
        }
        // Misplaced declaration of an exception variable
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        dz.a(dz1, n);
        if (d9.c == 0)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        dz.a(dz1, m.i());
        dz.a(dz1, i1);
        j();
        return dz1;
        nullpointerexception;
        throw nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
    }

    public dz h()
    {
        return dz.p();
    }

    public dz l()
    {
        Object obj = e();
        try
        {
            if (!((dz) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((dz) (obj));
    }
}
