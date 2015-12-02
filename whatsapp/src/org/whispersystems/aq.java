// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.P;
import com.google.a3;
import com.google.aH;
import com.google.b4;
import com.google.bR;
import com.google.bp;
import com.google.cP;
import com.google.cR;
import com.google.d8;
import com.google.eL;
import com.google.ee;
import com.google.eh;
import com.google.fa;
import com.google.fn;
import com.google.fz;
import com.google.ga;
import com.google.z;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.whispersystems:
//            I, t, ac, aQ, 
//            R, aG

public final class aq extends d8
    implements I
{

    private static final aq g;
    public static fn h = new t();
    public static final int k = 2;
    public static final int l = 1;
    private static final long serialVersionUID = 0L;
    private final bR e;
    private int f;
    private a3 i;
    private a3 j;
    private int m;
    private byte n;

    private aq(eL el, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = ac.H;
        super();
        n = -1;
        f = -1;
        e();
        fz1 = bR.a();
        flag = false;
_L11:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = el.f();
        boolean flag1;
        boolean flag2;
        flag1 = flag;
        flag2 = flag;
        j1;
        JVM INSTR lookupswitch 3: default 84
    //                   0: 179
    //                   10: 108
    //                   18: 139;
           goto _L1 _L2 _L3 _L4
_L1:
        boolean flag3 = a(el, fz1, z, j1);
        if (flag3) goto _L6; else goto _L5
_L5:
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        flag1 = true;
_L3:
        m = m | 1;
        j = el.x();
        flag = flag1;
        if (i1 == 0) goto _L6; else goto _L9
_L9:
        flag2 = flag1;
_L4:
        m = m | 2;
        i = el.x();
        flag = flag2;
_L6:
        if (i1 == 0) goto _L11; else goto _L10
_L10:
        e = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L8; else goto _L12
_L12:
        flag = true;
          goto _L1
        el;
        throw el;
        el;
        throw el.a(this);
        el;
        e = fz1.c();
        d();
        throw el;
        el;
        throw el;
        el;
        throw el;
        el;
        throw (new bp(el.getMessage())).a(this);
_L8:
        flag = true;
          goto _L6
    }

    aq(eL el, z z, aG ag)
    {
        this(el, z);
    }

    private aq(ee ee1)
    {
        super(ee1);
        n = -1;
        f = -1;
        e = ee1.c();
    }

    aq(ee ee1, aG ag)
    {
        this(ee1);
    }

    private aq(boolean flag)
    {
        n = -1;
        f = -1;
        e = bR.d();
    }

    static int a(aq aq1, int i1)
    {
        aq1.m = i1;
        return i1;
    }

    static a3 a(aq aq1, a3 a3_1)
    {
        aq1.j = a3_1;
        return a3_1;
    }

    public static aQ a(aq aq1)
    {
        return b().a(aq1);
    }

    public static aq a(a3 a3_1)
    {
        return (aq)h.a(a3_1);
    }

    public static aq a(a3 a3_1, z z)
    {
        return (aq)h.b(a3_1, z);
    }

    public static aq a(eL el)
    {
        return (aq)h.a(el);
    }

    public static aq a(eL el, z z)
    {
        return (aq)h.b(el, z);
    }

    public static aq a(InputStream inputstream)
    {
        return (aq)h.a(inputstream);
    }

    public static aq a(InputStream inputstream, z z)
    {
        return (aq)h.a(inputstream, z);
    }

    public static aq a(byte abyte0[])
    {
        return (aq)h.a(abyte0);
    }

    public static aq a(byte abyte0[], z z)
    {
        return (aq)h.a(abyte0, z);
    }

    static a3 b(aq aq1, a3 a3_1)
    {
        aq1.i = a3_1;
        return a3_1;
    }

    public static aQ b()
    {
        return aQ.c();
    }

    public static aq b(InputStream inputstream)
    {
        return (aq)h.b(inputstream);
    }

    public static aq b(InputStream inputstream, z z)
    {
        return (aq)h.b(inputstream, z);
    }

    public static aq c()
    {
        return g;
    }

    private void e()
    {
        j = a3.b;
        i = a3.b;
    }

    public static final cP i()
    {
        return R.o();
    }

    static boolean l()
    {
        return d;
    }

    public eh a()
    {
        return a();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public aQ a()
    {
        return b();
    }

    protected aQ a(b4 b4)
    {
        return new aQ(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((m & 1) == 1)
        {
            fa1.d(1, j);
        }
        if ((m & 2) == 2)
        {
            fa1.d(2, i);
        }
        c().a(fa1);
    }

    public int b()
    {
        int i1 = f;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        if ((m & 1) == 1)
        {
            i1 = 0 + fa.c(1, j);
        }
        int j1 = i1;
        if ((m & 2) == 2)
        {
            j1 = i1 + fa.c(2, i);
        }
        i1 = j1 + c().b();
        f = i1;
        return i1;
    }

    public P b()
    {
        return f();
    }

    public fn b()
    {
        return h;
    }

    public final bR c()
    {
        return e;
    }

    public cR c()
    {
        return f();
    }

    public eh c()
    {
        return k();
    }

    public ga c()
    {
        return k();
    }

    public ga d()
    {
        return a();
    }

    public final boolean d()
    {
        byte byte0 = n;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            n = 1;
            return true;
        }
    }

    protected aH e()
    {
        return R.u().a(org/whispersystems/aq, org/whispersystems/aQ);
    }

    public aq f()
    {
        return g;
    }

    public a3 g()
    {
        return i;
    }

    public a3 h()
    {
        return j;
    }

    public boolean j()
    {
        return (m & 2) == 2;
    }

    public aQ k()
    {
        return a(this);
    }

    public boolean m()
    {
        return (m & 1) == 1;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        g = new aq(true);
        g.e();
    }
}
