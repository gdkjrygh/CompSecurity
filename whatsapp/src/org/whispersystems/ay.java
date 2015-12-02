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
//            br, ac, au, R, 
//            bk, aG

public final class ay extends ee
    implements br
{

    private List e;
    private a_ f;
    private int g;
    private ac h;
    private cW i;

    private ay()
    {
        h = ac.G();
        e = Collections.emptyList();
        k();
    }

    private ay(b4 b4)
    {
        super(b4);
        h = ac.G();
        e = Collections.emptyList();
        k();
    }

    ay(b4 b4, aG ag)
    {
        this(b4);
    }

    private cW a()
    {
        try
        {
            if (i == null)
            {
                i = new cW(h, g(), e());
                h = null;
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return i;
    }

    private static ay b()
    {
        return new ay();
    }

    static ay c()
    {
        return b();
    }

    private void e()
    {
        try
        {
            if ((g & 2) != 2)
            {
                e = new ArrayList(e);
                g = g | 2;
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    private a_ g()
    {
        a_ a_1 = f;
        if (a_1 == null)
        {
            List list;
            NullPointerException nullpointerexception;
            int j;
            boolean flag;
            try
            {
                list = e;
                j = g;
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
            if ((j & 2) == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = new a_(list, flag, g(), e());
            e = null;
        }
        return f;
        nullpointerexception;
        throw nullpointerexception;
    }

    private void k()
    {
        try
        {
            if (au.i())
            {
                a();
                g();
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
        return l();
    }

    protected aH a()
    {
        return R.p().a(org/whispersystems/au, org/whispersystems/ay);
    }

    public cR a()
    {
        return h();
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

    public ay a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof au))
                {
                    break label0;
                }
                p = a((au)p);
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

    public ay a(eL el, z z)
    {
        el = (au)au.f.a(el, z);
        if (el != null)
        {
            try
            {
                a(((au) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (au)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((au) (el)));
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

    public ay a(Iterable iterable)
    {
        a_ a_1;
        try
        {
            a_1 = f;
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
        e();
        ee.a(iterable, e);
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        f.a(iterable);
        return this;
        return this;
    }

    public ay a(ac ac1)
    {
        cW cw = i;
        if (cw != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (ac1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (ac ac1)
            {
                throw ac1;
            }
        }
        break MISSING_BLOCK_LABEL_27;
        ac1;
        throw ac1;
        h = ac1;
        f();
        if (ac.H == 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        i.b(ac1);
        g = g | 1;
        return this;
        ac1;
        throw ac1;
    }

    public ay a(au au1)
    {
        a_ a_1 = null;
        int j = ac.H;
        Object obj;
        try
        {
            obj = au.j();
        }
        // Misplaced declaration of an exception variable
        catch (au au1)
        {
            throw au1;
        }
        if (au1 == obj)
        {
            return this;
        }
        boolean flag;
        try
        {
            if (au1.f())
            {
                b(au1.l());
            }
        }
        // Misplaced declaration of an exception variable
        catch (au au1)
        {
            throw au1;
        }
        obj = f;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        flag = au.a(au1).isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        flag = e.isEmpty();
        if (flag)
        {
            try
            {
                e = au.a(au1);
                g = g & -3;
            }
            // Misplaced declaration of an exception variable
            catch (au au1)
            {
                throw au1;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_120;
            }
        }
        e();
        e.addAll(au.a(au1));
        f();
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        flag = au.a(au1).isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        flag = f.b();
        if (flag)
        {
            try
            {
                f.f();
                f = null;
                e = au.a(au1);
                g = g & -3;
                if (au.e())
                {
                    a_1 = g();
                }
            }
            // Misplaced declaration of an exception variable
            catch (au au1)
            {
                throw au1;
            }
            try
            {
                f = a_1;
            }
            // Misplaced declaration of an exception variable
            catch (au au1)
            {
                throw au1;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_223;
            }
        }
        f.a(au.a(au1));
        b(au1.c());
        return this;
        au1;
        try
        {
            throw au1;
        }
        // Misplaced declaration of an exception variable
        catch (au au1) { }
        try
        {
            throw au1;
        }
        // Misplaced declaration of an exception variable
        catch (au au1) { }
        throw au1;
        au1;
        try
        {
            throw au1;
        }
        // Misplaced declaration of an exception variable
        catch (au au1) { }
        try
        {
            throw au1;
        }
        // Misplaced declaration of an exception variable
        catch (au au1) { }
        throw au1;
    }

    public P b()
    {
        return f();
    }

    public cP b()
    {
        return R.y();
    }

    public cR b()
    {
        return l();
    }

    public ay b(ac ac1)
    {
        int j = ac.H;
        Object obj = i;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        int i1 = g;
        if ((i1 & 1) != 1)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        ac ac2;
        obj = h;
        ac2 = ac.G();
        if (obj != ac2)
        {
            try
            {
                h = ac.b(h).a(ac1).c();
            }
            // Misplaced declaration of an exception variable
            catch (ac ac1)
            {
                throw ac1;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_70;
            }
        }
        h = ac1;
        try
        {
            f();
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw ac1;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        i.a(ac1);
        g = g | 1;
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
    }

    public P c()
    {
        return h();
    }

    public cR c()
    {
        return f();
    }

    public ee c()
    {
        return d();
    }

    public Object clone()
    {
        return d();
    }

    public ay d()
    {
        return b().a(l());
    }

    public final boolean d()
    {
        return true;
    }

    public au f()
    {
        return au.j();
    }

    public au h()
    {
        Object obj = l();
        try
        {
            if (!((au) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((au) (obj));
    }

    public au l()
    {
        au au1;
        int j;
        int i1;
        i1 = ac.H;
        au1 = new au(this, null);
        int j1 = g;
        j = 0;
        if ((j1 & 1) == 1)
        {
            j = 1;
        }
        cW cw = i;
        if (cw == null)
        {
            NullPointerException nullpointerexception;
            a_ a_1;
            try
            {
                au.a(au1, h);
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_71;
            }
        }
        au.a(au1, (ac)i.g());
        a_1 = f;
        if (a_1 == null)
        {
            NullPointerException nullpointerexception2;
            try
            {
                if ((g & 2) == 2)
                {
                    e = Collections.unmodifiableList(e);
                    g = g & -3;
                }
            }
            catch (NullPointerException nullpointerexception3)
            {
                throw nullpointerexception3;
            }
            try
            {
                au.a(au1, e);
            }
            catch (NullPointerException nullpointerexception4)
            {
                throw nullpointerexception4;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_138;
            }
        }
        au.a(au1, f.i());
        au.a(au1, j);
        j();
        return au1;
        nullpointerexception;
        throw nullpointerexception;
        nullpointerexception2;
        throw nullpointerexception2;
    }
}
