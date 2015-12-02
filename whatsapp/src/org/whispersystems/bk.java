// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.P;
import com.google.a3;
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
//            k, aw, aJ, aK, 
//            ac, R, bx, bX, 
//            bp, aG

public final class bk extends ee
    implements k
{

    private int e;
    private cW f;
    private int g;
    private a3 h;
    private a3 i;
    private a3 j;
    private a_ k;
    private int l;
    private aK m;
    private cW n;
    private int o;
    private cW p;
    private boolean q;
    private int r;
    private aw s;
    private a3 t;
    private List u;
    private aJ v;

    private bk()
    {
        t = a3.b;
        h = a3.b;
        j = a3.b;
        s = aw.b();
        u = Collections.emptyList();
        v = aJ.f();
        m = aK.g();
        i = a3.b;
        l();
    }

    private bk(b4 b4)
    {
        super(b4);
        t = a3.b;
        h = a3.b;
        j = a3.b;
        s = aw.b();
        u = Collections.emptyList();
        v = aJ.f();
        m = aK.g();
        i = a3.b;
        l();
    }

    bk(b4 b4, aG ag)
    {
        this(b4);
    }

    static bk a()
    {
        return n();
    }

    private cW b()
    {
        try
        {
            if (p == null)
            {
                p = new cW(m, g(), e());
                m = null;
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return p;
    }

    private a_ e()
    {
        a_ a_1 = k;
        if (a_1 == null)
        {
            List list;
            NullPointerException nullpointerexception;
            int i1;
            boolean flag;
            try
            {
                list = u;
                i1 = l;
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
            k = new a_(list, flag, g(), e());
            u = null;
        }
        return k;
        nullpointerexception;
        throw nullpointerexception;
    }

    private cW g()
    {
        try
        {
            if (f == null)
            {
                f = new cW(v, g(), e());
                v = null;
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return f;
    }

    private cW h()
    {
        try
        {
            if (n == null)
            {
                n = new cW(s, g(), e());
                s = null;
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return n;
    }

    private void k()
    {
        try
        {
            if ((l & 0x40) != 64)
            {
                u = new ArrayList(u);
                l = l | 0x40;
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    private void l()
    {
        try
        {
            if (ac.A())
            {
                h();
                e();
                g();
                b();
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    private static bk n()
    {
        return new bk();
    }

    public P a()
    {
        return c();
    }

    protected aH a()
    {
        return R.C().a(org/whispersystems/ac, org/whispersystems/bk);
    }

    public cR a()
    {
        return m();
    }

    public eJ a()
    {
        return d();
    }

    public eJ a(eL el, z z)
    {
        return a(el, z);
    }

    public eK a()
    {
        return d();
    }

    public eK a(P p1)
    {
        return a(p1);
    }

    public eK a(eL el, z z)
    {
        return a(el, z);
    }

    public eh a(P p1)
    {
        return a(p1);
    }

    public ga a(eL el, z z)
    {
        return a(el, z);
    }

    public bk a(int i1)
    {
        l = l | 1;
        o = i1;
        f();
        return this;
    }

    public bk a(int i1, aw aw1)
    {
        a_ a_1 = k;
        if (a_1 != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (aw1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (aw aw1)
            {
                throw aw1;
            }
        }
        break MISSING_BLOCK_LABEL_27;
        aw1;
        throw aw1;
        k();
        u.set(i1, aw1);
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        k.a(i1, aw1);
        return this;
        aw1;
        throw aw1;
    }

    public bk a(P p1)
    {
label0:
        {
            try
            {
                if (!(p1 instanceof ac))
                {
                    break label0;
                }
                p1 = a((ac)p1);
            }
            // Misplaced declaration of an exception variable
            catch (P p1)
            {
                throw p1;
            }
            return p1;
        }
        super.a(p1);
        return this;
    }

    public bk a(a3 a3_1)
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
            l = l | 4;
            h = a3_1;
            f();
            return this;
        }
    }

    public bk a(eL el, z z)
    {
        el = (ac)ac.j.a(el, z);
        if (el != null)
        {
            try
            {
                a(((ac) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (ac)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((ac) (el)));
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

    public bk a(aJ aj)
    {
        int i1 = ac.H;
        Object obj = f;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        int j1 = l;
        if ((j1 & 0x80) != 128)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        aJ aj1;
        obj = v;
        aj1 = aJ.f();
        if (obj != aj1)
        {
            try
            {
                v = aJ.a(v).a(aj).c();
            }
            // Misplaced declaration of an exception variable
            catch (aJ aj)
            {
                throw aj;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_74;
            }
        }
        v = aj;
        try
        {
            f();
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj)
        {
            throw aj;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        f.a(aj);
        l = l | 0x80;
        return this;
        aj;
        try
        {
            throw aj;
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj) { }
        try
        {
            throw aj;
        }
        // Misplaced declaration of an exception variable
        catch (aJ aj) { }
        throw aj;
    }

    public bk a(aK ak)
    {
        int i1 = ac.H;
        Object obj = p;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        int j1 = l;
        if ((j1 & 0x100) != 256)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        aK ak1;
        obj = m;
        ak1 = aK.g();
        if (obj != ak1)
        {
            try
            {
                m = aK.a(m).a(ak).c();
            }
            // Misplaced declaration of an exception variable
            catch (aK ak)
            {
                throw ak;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_74;
            }
        }
        m = ak;
        try
        {
            f();
        }
        // Misplaced declaration of an exception variable
        catch (aK ak)
        {
            throw ak;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        p.a(ak);
        l = l | 0x100;
        return this;
        ak;
        try
        {
            throw ak;
        }
        // Misplaced declaration of an exception variable
        catch (aK ak) { }
        try
        {
            throw ak;
        }
        // Misplaced declaration of an exception variable
        catch (aK ak) { }
        throw ak;
    }

    public bk a(ac ac1)
    {
        a_ a_1 = null;
        int i1 = ac.H;
        Object obj;
        try
        {
            obj = ac.G();
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        if (ac1 == obj)
        {
            return this;
        }
        boolean flag;
        try
        {
            if (ac1.N())
            {
                a(ac1.B());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        try
        {
            if (ac1.E())
            {
                b(ac1.l());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        try
        {
            if (ac1.t())
            {
                a(ac1.J());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        try
        {
            if (ac1.k())
            {
                d(ac1.n());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        try
        {
            if (ac1.b())
            {
                e(ac1.m());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        try
        {
            if (ac1.h())
            {
                a(ac1.y());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        obj = k;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        flag = ac.a(ac1).isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        flag = u.isEmpty();
        if (flag)
        {
            try
            {
                u = ac.a(ac1);
                l = l & 0xffffffbf;
            }
            // Misplaced declaration of an exception variable
            catch (ac ac1)
            {
                throw ac1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_200;
            }
        }
        k();
        u.addAll(ac.a(ac1));
        f();
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        flag = ac.a(ac1).isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        flag = k.b();
        if (flag)
        {
            try
            {
                k.f();
                k = null;
                u = ac.a(ac1);
                l = l & 0xffffffbf;
                if (ac.j())
                {
                    a_1 = e();
                }
            }
            // Misplaced declaration of an exception variable
            catch (ac ac1)
            {
                throw ac1;
            }
            try
            {
                k = a_1;
            }
            // Misplaced declaration of an exception variable
            catch (ac ac1)
            {
                throw ac1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_303;
            }
        }
        k.a(ac.a(ac1));
        try
        {
            if (ac1.s())
            {
                a(ac1.M());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        try
        {
            if (ac1.K())
            {
                a(ac1.v());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        try
        {
            if (ac1.F())
            {
                d(ac1.i());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        try
        {
            if (ac1.p())
            {
                c(ac1.o());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        try
        {
            if (ac1.a())
            {
                a(ac1.z());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        try
        {
            if (ac1.u())
            {
                c(ac1.C());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        b(ac1.c());
        return this;
        ac1;
        try
        {
            throw ac1;
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1) { }
        try
        {
            throw ac1;
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1) { }
        throw ac1;
        ac1;
        try
        {
            throw ac1;
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1) { }
        try
        {
            throw ac1;
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1) { }
        throw ac1;
    }

    public bk a(aw aw1)
    {
        int i1 = ac.H;
        Object obj = n;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        int j1 = l;
        if ((j1 & 0x20) != 32)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        aw aw2;
        obj = s;
        aw2 = aw.b();
        if (obj != aw2)
        {
            try
            {
                s = aw.b(s).a(aw1).l();
            }
            // Misplaced declaration of an exception variable
            catch (aw aw1)
            {
                throw aw1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_72;
            }
        }
        s = aw1;
        try
        {
            f();
        }
        // Misplaced declaration of an exception variable
        catch (aw aw1)
        {
            throw aw1;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        n.a(aw1);
        l = l | 0x20;
        return this;
        aw1;
        try
        {
            throw aw1;
        }
        // Misplaced declaration of an exception variable
        catch (aw aw1) { }
        try
        {
            throw aw1;
        }
        // Misplaced declaration of an exception variable
        catch (aw aw1) { }
        throw aw1;
    }

    public bk a(boolean flag)
    {
        l = l | 0x800;
        q = flag;
        f();
        return this;
    }

    public P b()
    {
        return f();
    }

    public cP b()
    {
        return R.n();
    }

    public cR b()
    {
        return c();
    }

    public bk b(int i1)
    {
        a_ a_1;
        try
        {
            a_1 = k;
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
        if (a_1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        k();
        u.remove(i1);
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        k.c(i1);
        return this;
        return this;
    }

    public bk b(a3 a3_1)
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
            l = l | 2;
            t = a3_1;
            f();
            return this;
        }
    }

    public bk b(aK ak)
    {
        cW cw = p;
        if (cw != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (ak == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (aK ak)
            {
                throw ak;
            }
        }
        break MISSING_BLOCK_LABEL_27;
        ak;
        throw ak;
        m = ak;
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        p.b(ak);
        l = l | 0x100;
        return this;
        ak;
        throw ak;
    }

    public bk b(aw aw1)
    {
        a_ a_1 = k;
        if (a_1 != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (aw1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (aw aw1)
            {
                throw aw1;
            }
        }
        break MISSING_BLOCK_LABEL_27;
        aw1;
        throw aw1;
        k();
        u.add(aw1);
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        k.a(aw1);
        return this;
        aw1;
        throw aw1;
    }

    public P c()
    {
        return m();
    }

    public cR c()
    {
        return f();
    }

    public ee c()
    {
        return d();
    }

    public ac c()
    {
        int j1 = 1;
        int k1 = ac.H;
        ac ac1 = new ac(this, null);
        int l1 = l;
        NullPointerException nullpointerexception;
        Object obj;
        int i1;
        if ((l1 & 1) != 1)
        {
            j1 = 0;
        }
        ac.d(ac1, o);
        i1 = j1;
        if ((l1 & 2) == 2)
        {
            i1 = j1 | 2;
        }
        ac.c(ac1, t);
        j1 = i1;
        if ((l1 & 4) == 4)
        {
            j1 = i1 | 4;
        }
        ac.d(ac1, h);
        i1 = j1;
        if ((l1 & 8) == 8)
        {
            i1 = j1 | 8;
        }
        ac.a(ac1, j);
        j1 = i1;
        if ((l1 & 0x10) == 16)
        {
            j1 = i1 | 0x10;
        }
        ac.c(ac1, g);
        if ((l1 & 0x20) == 32)
        {
            j1 |= 0x20;
        }
        obj = n;
        if (obj == null)
        {
            try
            {
                ac.a(ac1, s);
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_202;
            }
        }
        ac.a(ac1, (aw)n.g());
        obj = k;
        if (obj == null)
        {
            try
            {
                if ((l & 0x40) == 64)
                {
                    u = Collections.unmodifiableList(u);
                    l = l & 0xffffffbf;
                }
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            try
            {
                ac.a(ac1, u);
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_271;
            }
        }
        ac.a(ac1, k.i());
        i1 = j1;
        if ((l1 & 0x80) == 128)
        {
            i1 = j1 | 0x40;
        }
        obj = f;
        if (obj == null)
        {
            try
            {
                ac.a(ac1, v);
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_330;
            }
        }
        ac.a(ac1, (aJ)f.g());
        j1 = i1;
        if ((l1 & 0x100) == 256)
        {
            j1 = i1 | 0x80;
        }
        obj = p;
        if (obj == null)
        {
            try
            {
                ac.a(ac1, m);
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_390;
            }
        }
        ac.a(ac1, (aK)p.g());
        if ((l1 & 0x200) == 512)
        {
            j1 |= 0x100;
        }
        ac.a(ac1, r);
        i1 = j1;
        if ((l1 & 0x400) == 1024)
        {
            i1 = j1 | 0x200;
        }
        ac.e(ac1, e);
        j1 = i1;
        if ((l1 & 0x800) == 2048)
        {
            j1 = i1 | 0x400;
        }
        ac.a(ac1, q);
        i1 = j1;
        if ((l1 & 0x1000) == 4096)
        {
            i1 = j1 | 0x800;
        }
        try
        {
            ac.b(ac1, i);
            ac.b(ac1, i1);
            j();
            if (R.A)
            {
                ac.H = k1 + 1;
            }
        }
        // Misplaced declaration of an exception variable
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return ac1;
        nullpointerexception;
        throw nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
    }

    public bk c(int i1)
    {
        l = l | 0x400;
        e = i1;
        f();
        return this;
    }

    public bk c(a3 a3_1)
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
            l = l | 0x1000;
            i = a3_1;
            f();
            return this;
        }
    }

    public bk c(aw aw1)
    {
        cW cw = n;
        if (cw != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (aw1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (aw aw1)
            {
                throw aw1;
            }
        }
        break MISSING_BLOCK_LABEL_27;
        aw1;
        throw aw1;
        s = aw1;
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        n.b(aw1);
        l = l | 0x20;
        return this;
        aw1;
        throw aw1;
    }

    public Object clone()
    {
        return d();
    }

    public bk d()
    {
        return n().a(c());
    }

    public bk d(int i1)
    {
        l = l | 0x200;
        r = i1;
        f();
        return this;
    }

    public bk d(a3 a3_1)
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
            l = l | 8;
            j = a3_1;
            f();
            return this;
        }
    }

    public final boolean d()
    {
        return true;
    }

    public bk e(int i1)
    {
        l = l | 0x10;
        g = i1;
        f();
        return this;
    }

    public ac f()
    {
        return ac.G();
    }

    public bk i()
    {
        cW cw;
        try
        {
            cw = p;
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
            break MISSING_BLOCK_LABEL_26;
        }
        m = aK.g();
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        p.a();
        l = l & 0xfffffeff;
        return this;
    }

    public ac m()
    {
        Object obj = c();
        try
        {
            if (!((ac) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((ac) (obj));
    }
}
