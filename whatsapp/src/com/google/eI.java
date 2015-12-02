// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            ee, f8, gK, fK, 
//            dz, d8, cW, el, 
//            dq, aH, d9, fx, 
//            bp, fn, b4, dE, 
//            P, cR, eL, z, 
//            eJ, eK, eh, ga, 
//            cP

public final class eI extends ee
    implements f8
{

    private int e;
    private int f;
    private Object g;
    private cW h;
    private gK i;
    private Object j;
    private Object k;
    private Object l;
    private fK m;
    private dz n;

    private eI()
    {
        g = "";
        i = gK.LABEL_OPTIONAL;
        m = fK.TYPE_DOUBLE;
        l = "";
        k = "";
        j = "";
        n = dz.p();
        b();
    }

    private eI(b4 b4)
    {
        super(b4);
        g = "";
        i = gK.LABEL_OPTIONAL;
        m = fK.TYPE_DOUBLE;
        l = "";
        k = "";
        j = "";
        n = dz.p();
        b();
    }

    eI(b4 b4, dE de)
    {
        this(b4);
    }

    private void b()
    {
        try
        {
            if (d8.d)
            {
                e();
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    static eI d()
    {
        return j();
    }

    private cW e()
    {
        try
        {
            if (h == null)
            {
                h = new cW(n, g(), e());
                n = null;
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return h;
    }

    private static eI j()
    {
        return new eI();
    }

    public P a()
    {
        return g();
    }

    protected aH a()
    {
        return el.n().a(com/google/dq, com/google/eI);
    }

    public cR a()
    {
        return a();
    }

    public dq a()
    {
        Object obj = g();
        try
        {
            if (!((dq) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((dq) (obj));
    }

    public eI a(int i1)
    {
        e = e | 2;
        f = i1;
        f();
        return this;
    }

    public eI a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof dq))
                {
                    break label0;
                }
                p = a((dq)p);
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

    public eI a(dq dq1)
    {
        dq dq2;
        try
        {
            dq2 = dq.i();
        }
        // Misplaced declaration of an exception variable
        catch (dq dq1)
        {
            throw dq1;
        }
        if (dq1 == dq2)
        {
            return this;
        }
        try
        {
            if (dq1.B())
            {
                e = e | 1;
                g = dq.c(dq1);
                f();
            }
        }
        // Misplaced declaration of an exception variable
        catch (dq dq1)
        {
            throw dq1;
        }
        try
        {
            if (dq1.q())
            {
                a(dq1.o());
            }
        }
        // Misplaced declaration of an exception variable
        catch (dq dq1)
        {
            throw dq1;
        }
        try
        {
            if (dq1.c())
            {
                a(dq1.w());
            }
        }
        // Misplaced declaration of an exception variable
        catch (dq dq1)
        {
            throw dq1;
        }
        try
        {
            if (dq1.p())
            {
                a(dq1.f());
            }
        }
        // Misplaced declaration of an exception variable
        catch (dq dq1)
        {
            throw dq1;
        }
        try
        {
            if (dq1.m())
            {
                e = e | 0x10;
                l = dq.d(dq1);
                f();
            }
        }
        // Misplaced declaration of an exception variable
        catch (dq dq1)
        {
            throw dq1;
        }
        try
        {
            if (dq1.u())
            {
                e = e | 0x20;
                k = dq.e(dq1);
                f();
            }
        }
        // Misplaced declaration of an exception variable
        catch (dq dq1)
        {
            throw dq1;
        }
        try
        {
            if (dq1.a())
            {
                e = e | 0x40;
                j = dq.b(dq1);
                f();
            }
        }
        // Misplaced declaration of an exception variable
        catch (dq dq1)
        {
            throw dq1;
        }
        try
        {
            if (dq1.r())
            {
                a(dq1.z());
            }
        }
        // Misplaced declaration of an exception variable
        catch (dq dq1)
        {
            throw dq1;
        }
        b(dq1.c());
        return this;
    }

    public eI a(dz dz1)
    {
        int i1 = d9.c;
        Object obj = h;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        int j1 = e;
        if ((j1 & 0x80) != 128)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        dz dz2;
        obj = n;
        dz2 = dz.p();
        if (obj != dz2)
        {
            try
            {
                n = dz.a(n).a(dz1).e();
            }
            // Misplaced declaration of an exception variable
            catch (dz dz1)
            {
                throw dz1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_74;
            }
        }
        n = dz1;
        try
        {
            f();
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1)
        {
            throw dz1;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        h.a(dz1);
        e = e | 0x80;
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
    }

    public eI a(eL el1, z z)
    {
        el1 = (dq)dq.r.a(el1, z);
        if (el1 != null)
        {
            try
            {
                a(((dq) (el1)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        return this;
        z;
        el1 = (dq)z.g();
        throw z;
        z;
_L2:
        if (el1 != null)
        {
            try
            {
                a(((dq) (el1)));
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

    public eI a(fK fk)
    {
        if (fk == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (fK fk)
            {
                throw fk;
            }
        } else
        {
            e = e | 8;
            m = fk;
            f();
            return this;
        }
    }

    public eI a(gK gk)
    {
        if (gk == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (gK gk)
            {
                throw gk;
            }
        } else
        {
            e = e | 4;
            i = gk;
            f();
            return this;
        }
    }

    public eJ a()
    {
        return i();
    }

    public eJ a(eL el1, z z)
    {
        return a(el1, z);
    }

    public eK a()
    {
        return i();
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

    public ga a(eL el1, z z)
    {
        return a(el1, z);
    }

    public P b()
    {
        return c();
    }

    public cP b()
    {
        return el.s();
    }

    public cR b()
    {
        return g();
    }

    public P c()
    {
        return a();
    }

    public cR c()
    {
        return c();
    }

    public dq c()
    {
        return dq.i();
    }

    public ee c()
    {
        return i();
    }

    public Object clone()
    {
        return i();
    }

    public final boolean d()
    {
        boolean flag;
        try
        {
            flag = h();
        }
        catch (NullPointerException nullpointerexception)
        {
            try
            {
                throw nullpointerexception;
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (!f().d())
        {
            return false;
        }
        return true;
    }

    public dz f()
    {
label0:
        {
            dz dz1;
            try
            {
                if (h != null)
                {
                    break label0;
                }
                dz1 = n;
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return dz1;
        }
        return (dz)h.e();
    }

    public dq g()
    {
        int j1 = 1;
        dq dq1 = new dq(this, null);
        int k1 = e;
        cW cw;
        int i1;
        if ((k1 & 1) != 1)
        {
            j1 = 0;
        }
        dq.c(dq1, g);
        i1 = j1;
        if ((k1 & 2) == 2)
        {
            i1 = j1 | 2;
        }
        dq.a(dq1, f);
        j1 = i1;
        if ((k1 & 4) == 4)
        {
            j1 = i1 | 4;
        }
        dq.a(dq1, i);
        i1 = j1;
        if ((k1 & 8) == 8)
        {
            i1 = j1 | 8;
        }
        dq.a(dq1, m);
        j1 = i1;
        if ((k1 & 0x10) == 16)
        {
            j1 = i1 | 0x10;
        }
        dq.b(dq1, l);
        i1 = j1;
        if ((k1 & 0x20) == 32)
        {
            i1 = j1 | 0x20;
        }
        dq.d(dq1, k);
        j1 = i1;
        if ((k1 & 0x40) == 64)
        {
            j1 = i1 | 0x40;
        }
        dq.a(dq1, j);
        if ((k1 & 0x80) == 128)
        {
            i1 = j1 | 0x80;
        } else
        {
            i1 = j1;
        }
        try
        {
            cw = h;
        }
        catch (NullPointerException nullpointerexception)
        {
            try
            {
                throw nullpointerexception;
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
        }
        if (cw != null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        dq.a(dq1, n);
        if (d9.c == 0)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        dq.a(dq1, (dz)h.g());
        dq.b(dq1, i1);
        j();
        return dq1;
    }

    public boolean h()
    {
        int i1;
        try
        {
            i1 = e;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return (i1 & 0x80) == 128;
    }

    public eI i()
    {
        return j().a(g());
    }
}
