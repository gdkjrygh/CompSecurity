// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.P;
import com.google.a3;
import com.google.aH;
import com.google.a_;
import com.google.b4;
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
//            bl, aP, aw, R, 
//            ac, b0, aG, a2

public final class bp extends ee
    implements bl
{

    private int e;
    private a3 f;
    private a_ g;
    private List h;
    private a3 i;
    private aP j;
    private cW k;

    private bp()
    {
        f = a3.b;
        i = a3.b;
        j = aP.e();
        h = Collections.emptyList();
        g();
    }

    private bp(b4 b4)
    {
        super(b4);
        f = a3.b;
        i = a3.b;
        j = aP.e();
        h = Collections.emptyList();
        g();
    }

    bp(b4 b4, aG ag)
    {
        this(b4);
    }

    private void a()
    {
        try
        {
            if ((e & 8) != 8)
            {
                h = new ArrayList(h);
                e = e | 8;
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    static bp c()
    {
        return k();
    }

    private cW d()
    {
        try
        {
            if (k == null)
            {
                k = new cW(j, g(), e());
                j = null;
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return k;
    }

    private a_ e()
    {
        a_ a_1 = g;
        if (a_1 == null)
        {
            List list;
            NullPointerException nullpointerexception;
            int i1;
            boolean flag;
            try
            {
                list = h;
                i1 = e;
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
            if ((i1 & 8) == 8)
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
        nullpointerexception;
        throw nullpointerexception;
    }

    private void g()
    {
        try
        {
            if (aw.n())
            {
                d();
                e();
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    private static bp k()
    {
        return new bp();
    }

    public P a()
    {
        return l();
    }

    protected aH a()
    {
        return R.f().a(org/whispersystems/aw, org/whispersystems/bp);
    }

    public cR a()
    {
        return j();
    }

    public eJ a()
    {
        return h();
    }

    public eJ a(eL el, z z)
    {
        return a(el, z);
    }

    public eK a()
    {
        return h();
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

    public bp a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof aw))
                {
                    break label0;
                }
                p = a((aw)p);
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

    public bp a(a3 a3_1)
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
            e = e | 1;
            f = a3_1;
            f();
            return this;
        }
    }

    public bp a(eL el, z z)
    {
        el = (aw)aw.r.a(el, z);
        if (el != null)
        {
            try
            {
                a(((aw) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (aw)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((aw) (el)));
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

    public bp a(Iterable iterable)
    {
        a_ a_1;
        try
        {
            a_1 = g;
        }
        // Misplaced declaration of an exception variable
        catch (Iterable iterable)
        {
            try
            {
                throw iterable;
            }
            // Misplaced declaration of an exception variable
            catch (Iterable iterable)
            {
                throw iterable;
            }
        }
        if (a_1 != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        a();
        ee.a(iterable, h);
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        g.a(iterable);
        return this;
        return this;
    }

    public bp a(a2 a2)
    {
        a_ a_1 = g;
        if (a_1 != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (a2 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (a2 a2)
            {
                throw a2;
            }
        }
        break MISSING_BLOCK_LABEL_27;
        a2;
        throw a2;
        a();
        h.add(a2);
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        g.a(a2);
        return this;
        a2;
        throw a2;
    }

    public bp a(aP ap)
    {
        int i1 = ac.H;
        Object obj = k;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        int j1 = e;
        if ((j1 & 4) != 4)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        aP ap1;
        obj = j;
        ap1 = aP.e();
        if (obj != ap1)
        {
            try
            {
                j = aP.a(j).a(ap).e();
            }
            // Misplaced declaration of an exception variable
            catch (aP ap)
            {
                throw ap;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_70;
            }
        }
        j = ap;
        try
        {
            f();
        }
        // Misplaced declaration of an exception variable
        catch (aP ap)
        {
            throw ap;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        k.a(ap);
        e = e | 4;
        return this;
        ap;
        try
        {
            throw ap;
        }
        // Misplaced declaration of an exception variable
        catch (aP ap) { }
        try
        {
            throw ap;
        }
        // Misplaced declaration of an exception variable
        catch (aP ap) { }
        throw ap;
    }

    public bp a(aw aw1)
    {
        a_ a_1 = null;
        int i1 = ac.H;
        Object obj;
        try
        {
            obj = aw.b();
        }
        // Misplaced declaration of an exception variable
        catch (aw aw1)
        {
            throw aw1;
        }
        if (aw1 == obj)
        {
            return this;
        }
        boolean flag;
        try
        {
            if (aw1.m())
            {
                a(aw1.p());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aw aw1)
        {
            throw aw1;
        }
        try
        {
            if (aw1.c())
            {
                b(aw1.o());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aw aw1)
        {
            throw aw1;
        }
        try
        {
            if (aw1.f())
            {
                a(aw1.g());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aw aw1)
        {
            throw aw1;
        }
        obj = g;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        flag = aw.a(aw1).isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        flag = h.isEmpty();
        if (flag)
        {
            try
            {
                h = aw.a(aw1);
                e = e & -9;
            }
            // Misplaced declaration of an exception variable
            catch (aw aw1)
            {
                throw aw1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_152;
            }
        }
        a();
        h.addAll(aw.a(aw1));
        f();
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        flag = aw.a(aw1).isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        flag = g.b();
        if (flag)
        {
            try
            {
                g.f();
                g = null;
                h = aw.a(aw1);
                e = e & -9;
                if (aw.k())
                {
                    a_1 = e();
                }
            }
            // Misplaced declaration of an exception variable
            catch (aw aw1)
            {
                throw aw1;
            }
            try
            {
                g = a_1;
            }
            // Misplaced declaration of an exception variable
            catch (aw aw1)
            {
                throw aw1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_255;
            }
        }
        g.a(aw.a(aw1));
        b(aw1.c());
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

    public P b()
    {
        return i();
    }

    public cP b()
    {
        return R.w();
    }

    public cR b()
    {
        return l();
    }

    public bp b()
    {
        a_ a_1;
        try
        {
            a_1 = g;
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
            break MISSING_BLOCK_LABEL_37;
        }
        h = Collections.emptyList();
        e = e & -9;
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        g.h();
        return this;
        return this;
    }

    public bp b(a3 a3_1)
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
            i = a3_1;
            f();
            return this;
        }
    }

    public bp b(aP ap)
    {
        cW cw = k;
        if (cw != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (ap == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (aP ap)
            {
                throw ap;
            }
        }
        break MISSING_BLOCK_LABEL_27;
        ap;
        throw ap;
        j = ap;
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        k.b(ap);
        e = e | 4;
        return this;
        ap;
        throw ap;
    }

    public P c()
    {
        return j();
    }

    public cR c()
    {
        return i();
    }

    public ee c()
    {
        return h();
    }

    public Object clone()
    {
        return h();
    }

    public final boolean d()
    {
        return true;
    }

    public bp h()
    {
        return k().a(l());
    }

    public aw i()
    {
        return aw.b();
    }

    public aw j()
    {
        Object obj = l();
        try
        {
            if (!((aw) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((aw) (obj));
    }

    public aw l()
    {
        int i1 = 1;
        int k1 = ac.H;
        aw aw1 = new aw(this, null);
        int l1 = e;
        NullPointerException nullpointerexception;
        Object obj;
        int j1;
        if ((l1 & 1) != 1)
        {
            i1 = 0;
        }
        aw.b(aw1, f);
        j1 = i1;
        if ((l1 & 2) == 2)
        {
            j1 = i1 | 2;
        }
        aw.a(aw1, i);
        if ((l1 & 4) == 4)
        {
            i1 = j1 | 4;
        } else
        {
            i1 = j1;
        }
        obj = k;
        if (obj == null)
        {
            try
            {
                aw.a(aw1, j);
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_116;
            }
        }
        aw.a(aw1, (aP)k.g());
        obj = g;
        if (obj == null)
        {
            try
            {
                if ((e & 8) == 8)
                {
                    h = Collections.unmodifiableList(h);
                    e = e & -9;
                }
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            try
            {
                aw.a(aw1, h);
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_185;
            }
        }
        aw.a(aw1, g.i());
        aw.a(aw1, i1);
        j();
        return aw1;
        nullpointerexception;
        throw nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
    }
}
