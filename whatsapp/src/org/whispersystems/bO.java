// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.P;
import com.google.a3;
import com.google.aH;
import com.google.b4;
import com.google.bp;
import com.google.cP;
import com.google.cR;
import com.google.eJ;
import com.google.eK;
import com.google.eL;
import com.google.ee;
import com.google.eh;
import com.google.fn;
import com.google.ga;
import com.google.z;

// Referenced classes of package org.whispersystems:
//            bh, az, R, aG

public final class bO extends ee
    implements bh
{

    private int e;
    private int f;
    private a3 g;
    private long h;
    private a3 i;
    private a3 j;

    private bO()
    {
        j = a3.b;
        i = a3.b;
        g = a3.b;
        g();
    }

    private bO(b4 b4)
    {
        super(b4);
        j = a3.b;
        i = a3.b;
        g = a3.b;
        g();
    }

    bO(b4 b4, aG ag)
    {
        this(b4);
    }

    static bO b()
    {
        return h();
    }

    private void g()
    {
        if (!az.a());
    }

    private static bO h()
    {
        return new bO();
    }

    public P a()
    {
        return a();
    }

    protected aH a()
    {
        return R.m().a(org/whispersystems/az, org/whispersystems/bO);
    }

    public cR a()
    {
        return e();
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

    public az a()
    {
        int l = 1;
        az az1 = new az(this, null);
        int i1 = f;
        int k;
        if ((i1 & 1) != 1)
        {
            l = 0;
        }
        az.a(az1, e);
        k = l;
        if ((i1 & 2) == 2)
        {
            k = l | 2;
        }
        az.c(az1, j);
        l = k;
        if ((i1 & 4) == 4)
        {
            l = k | 4;
        }
        az.a(az1, i);
        k = l;
        if ((i1 & 8) == 8)
        {
            k = l | 8;
        }
        az.b(az1, g);
        l = k;
        if ((i1 & 0x10) == 16)
        {
            l = k | 0x10;
        }
        az.a(az1, h);
        az.b(az1, l);
        j();
        return az1;
    }

    public bO a(int k)
    {
        f = f | 1;
        e = k;
        f();
        return this;
    }

    public bO a(long l)
    {
        f = f | 0x10;
        h = l;
        f();
        return this;
    }

    public bO a(P p)
    {
label0:
        {
            try
            {
                if (!(p instanceof az))
                {
                    break label0;
                }
                p = a((az)p);
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

    public bO a(a3 a3_1)
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
            f = f | 8;
            g = a3_1;
            f();
            return this;
        }
    }

    public bO a(eL el, z z)
    {
        el = (az)az.i.a(el, z);
        if (el != null)
        {
            try
            {
                a(((az) (el)));
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        return this;
        z;
        el = (az)z.g();
        throw z;
        z;
_L2:
        if (el != null)
        {
            try
            {
                a(((az) (el)));
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

    public bO a(az az1)
    {
        az az2;
        try
        {
            az2 = az.j();
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            throw az1;
        }
        if (az1 == az2)
        {
            return this;
        }
        try
        {
            if (az1.q())
            {
                a(az1.d());
            }
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            throw az1;
        }
        try
        {
            if (az1.c())
            {
                c(az1.h());
            }
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            throw az1;
        }
        try
        {
            if (az1.f())
            {
                b(az1.p());
            }
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            throw az1;
        }
        try
        {
            if (az1.n())
            {
                a(az1.g());
            }
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            throw az1;
        }
        try
        {
            if (az1.b())
            {
                a(az1.o());
            }
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            throw az1;
        }
        b(az1.c());
        return this;
    }

    public P b()
    {
        return c();
    }

    public cP b()
    {
        return R.h();
    }

    public cR b()
    {
        return a();
    }

    public bO b(a3 a3_1)
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
            f = f | 4;
            i = a3_1;
            f();
            return this;
        }
    }

    public P c()
    {
        return e();
    }

    public cR c()
    {
        return c();
    }

    public ee c()
    {
        return d();
    }

    public az c()
    {
        return az.j();
    }

    public bO c(a3 a3_1)
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
            f = f | 2;
            j = a3_1;
            f();
            return this;
        }
    }

    public Object clone()
    {
        return d();
    }

    public bO d()
    {
        return h().a(a());
    }

    public final boolean d()
    {
        return true;
    }

    public az e()
    {
        Object obj = a();
        try
        {
            if (!((az) (obj)).d())
            {
                throw b(((P) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((az) (obj));
    }
}
