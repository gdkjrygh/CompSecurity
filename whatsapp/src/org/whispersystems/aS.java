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
//            bV, u, ac, aT, 
//            R, aG

public final class aS extends d8
    implements bV
{

    public static final int e = 3;
    private static final aS f;
    public static fn i = new u();
    public static final int n = 2;
    public static final int o = 1;
    private static final long serialVersionUID = 0L;
    private int g;
    private a3 h;
    private int j;
    private byte k;
    private a3 l;
    private int m;
    private final bR p;

    private aS(eL el, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = ac.H;
        super();
        k = -1;
        m = -1;
        l();
        fz1 = bR.a();
        flag = false;
_L13:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = el.f();
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = flag;
        flag2 = flag;
        flag3 = flag;
        j1;
        JVM INSTR lookupswitch 4: default 96
    //                   0: 222
    //                   8: 120
    //                   18: 151
    //                   26: 182;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        boolean flag4 = a(el, fz1, z, j1);
        if (flag4) goto _L7; else goto _L6
_L6:
        if (i1 == 0) goto _L9; else goto _L8
_L8:
        flag1 = true;
_L3:
        g = g | 1;
        j = el.a();
        flag = flag1;
        if (i1 == 0) goto _L7; else goto _L10
_L10:
        flag2 = flag1;
_L4:
        g = g | 2;
        h = el.x();
        flag = flag2;
        if (i1 == 0) goto _L7; else goto _L11
_L11:
        flag3 = flag2;
_L5:
        g = g | 4;
        l = el.x();
        flag = flag3;
_L7:
        if (i1 == 0) goto _L13; else goto _L12
_L12:
        p = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L9; else goto _L14
_L14:
        flag = true;
          goto _L1
        el;
        throw el;
        el;
        throw el.a(this);
        el;
        p = fz1.c();
        d();
        throw el;
        el;
        throw el;
        el;
        throw el;
        el;
        throw el;
        el;
        throw (new bp(el.getMessage())).a(this);
_L9:
        flag = true;
          goto _L7
    }

    aS(eL el, z z, aG ag)
    {
        this(el, z);
    }

    private aS(ee ee1)
    {
        super(ee1);
        k = -1;
        m = -1;
        p = ee1.c();
    }

    aS(ee ee1, aG ag)
    {
        this(ee1);
    }

    private aS(boolean flag)
    {
        k = -1;
        m = -1;
        p = bR.d();
    }

    static int a(aS as, int i1)
    {
        as.j = i1;
        return i1;
    }

    static a3 a(aS as, a3 a3_1)
    {
        as.l = a3_1;
        return a3_1;
    }

    public static aS a(a3 a3_1)
    {
        return (aS)i.a(a3_1);
    }

    public static aS a(a3 a3_1, z z)
    {
        return (aS)i.b(a3_1, z);
    }

    public static aS a(eL el)
    {
        return (aS)i.a(el);
    }

    public static aS a(eL el, z z)
    {
        return (aS)i.b(el, z);
    }

    public static aS a(InputStream inputstream)
    {
        return (aS)i.b(inputstream);
    }

    public static aS a(InputStream inputstream, z z)
    {
        return (aS)i.a(inputstream, z);
    }

    public static aS a(byte abyte0[])
    {
        return (aS)i.a(abyte0);
    }

    public static aS a(byte abyte0[], z z)
    {
        return (aS)i.a(abyte0, z);
    }

    public static aT a(aS as)
    {
        return d().a(as);
    }

    static int b(aS as, int i1)
    {
        as.g = i1;
        return i1;
    }

    static a3 b(aS as, a3 a3_1)
    {
        as.h = a3_1;
        return a3_1;
    }

    public static aS b(InputStream inputstream)
    {
        return (aS)i.a(inputstream);
    }

    public static aS b(InputStream inputstream, z z)
    {
        return (aS)i.b(inputstream, z);
    }

    public static aT d()
    {
        return aT.g();
    }

    public static final cP f()
    {
        return R.x();
    }

    public static aS i()
    {
        return f;
    }

    private void l()
    {
        j = 0;
        h = a3.b;
        l = a3.b;
    }

    static boolean m()
    {
        return d;
    }

    public eh a()
    {
        return e();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected aT a(b4 b4)
    {
        return new aT(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((g & 1) == 1)
        {
            fa1.i(1, j);
        }
        if ((g & 2) == 2)
        {
            fa1.d(2, h);
        }
        if ((g & 4) == 4)
        {
            fa1.d(3, l);
        }
        c().a(fa1);
    }

    public int b()
    {
        int i1 = m;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((g & 1) == 1)
        {
            j1 = 0 + fa.g(1, j);
        }
        i1 = j1;
        if ((g & 2) == 2)
        {
            i1 = j1 + fa.c(2, h);
        }
        j1 = i1;
        if ((g & 4) == 4)
        {
            j1 = i1 + fa.c(3, l);
        }
        i1 = j1 + c().b();
        m = i1;
        return i1;
    }

    public P b()
    {
        return g();
    }

    public a3 b()
    {
        return l;
    }

    public fn b()
    {
        return i;
    }

    public final bR c()
    {
        return p;
    }

    public cR c()
    {
        return g();
    }

    public eh c()
    {
        return c();
    }

    public ga c()
    {
        return c();
    }

    public aT c()
    {
        return a(this);
    }

    public ga d()
    {
        return e();
    }

    public final boolean d()
    {
        byte byte0 = k;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            k = 1;
            return true;
        }
    }

    protected aH e()
    {
        return R.e().a(org/whispersystems/aS, org/whispersystems/aT);
    }

    public aT e()
    {
        return d();
    }

    public aS g()
    {
        return f;
    }

    public boolean h()
    {
        return (g & 1) == 1;
    }

    public boolean j()
    {
        return (g & 4) == 4;
    }

    public a3 k()
    {
        return h;
    }

    public boolean n()
    {
        return (g & 2) == 2;
    }

    public int o()
    {
        return j;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        f = new aS(true);
        f.l();
    }
}
