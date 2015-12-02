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
//            bh, H, ac, bO, 
//            R, aG

public final class az extends d8
    implements bh
{

    private static final az e;
    public static fn i = new H();
    public static final int n = 1;
    public static final int o = 3;
    public static final int p = 5;
    public static final int r = 4;
    public static final int s = 2;
    private static final long serialVersionUID = 0L;
    private final bR f;
    private a3 g;
    private byte h;
    private a3 j;
    private a3 k;
    private int l;
    private long m;
    private int q;
    private int t;

    private az(eL el, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = ac.H;
        super();
        h = -1;
        l = -1;
        r();
        fz1 = bR.a();
        flag = false;
_L17:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = el.f();
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag1 = flag;
        flag2 = flag;
        flag3 = flag;
        flag4 = flag;
        flag5 = flag;
        j1;
        JVM INSTR lookupswitch 6: default 120
    //                   0: 310
    //                   8: 144
    //                   18: 175
    //                   26: 206
    //                   34: 237
    //                   41: 269;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        boolean flag6 = a(el, fz1, z, j1);
        if (flag6) goto _L9; else goto _L8
_L8:
        if (i1 == 0) goto _L11; else goto _L10
_L10:
        flag1 = true;
_L3:
        q = q | 1;
        t = el.a();
        flag = flag1;
        if (i1 == 0) goto _L9; else goto _L12
_L12:
        flag2 = flag1;
_L4:
        q = q | 2;
        k = el.x();
        flag = flag2;
        if (i1 == 0) goto _L9; else goto _L13
_L13:
        flag3 = flag2;
_L5:
        q = q | 4;
        g = el.x();
        flag = flag3;
        if (i1 == 0) goto _L9; else goto _L14
_L14:
        flag4 = flag3;
_L6:
        q = q | 8;
        j = el.x();
        flag = flag4;
        if (i1 == 0) goto _L9; else goto _L15
_L15:
        flag5 = flag4;
_L7:
        q = q | 0x10;
        m = el.k();
        flag = flag5;
_L9:
        if (i1 == 0) goto _L17; else goto _L16
_L16:
        f = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L11; else goto _L18
_L18:
        flag = true;
          goto _L1
        el;
        throw el;
        el;
        throw el.a(this);
        el;
        f = fz1.c();
        d();
        throw el;
        el;
        throw el;
        el;
        throw el;
        el;
        throw el;
        el;
        throw el;
        el;
        throw el;
        el;
        throw (new bp(el.getMessage())).a(this);
_L11:
        flag = true;
          goto _L9
    }

    az(eL el, z z, aG ag)
    {
        this(el, z);
    }

    private az(ee ee1)
    {
        super(ee1);
        h = -1;
        l = -1;
        f = ee1.c();
    }

    az(ee ee1, aG ag)
    {
        this(ee1);
    }

    private az(boolean flag)
    {
        h = -1;
        l = -1;
        f = bR.d();
    }

    static int a(az az1, int i1)
    {
        az1.t = i1;
        return i1;
    }

    static long a(az az1, long l1)
    {
        az1.m = l1;
        return l1;
    }

    static a3 a(az az1, a3 a3_1)
    {
        az1.g = a3_1;
        return a3_1;
    }

    public static az a(a3 a3_1)
    {
        return (az)i.a(a3_1);
    }

    public static az a(a3 a3_1, z z)
    {
        return (az)i.b(a3_1, z);
    }

    public static az a(eL el)
    {
        return (az)i.a(el);
    }

    public static az a(eL el, z z)
    {
        return (az)i.b(el, z);
    }

    public static az a(InputStream inputstream)
    {
        return (az)i.b(inputstream);
    }

    public static az a(InputStream inputstream, z z)
    {
        return (az)i.b(inputstream, z);
    }

    public static az a(byte abyte0[])
    {
        return (az)i.a(abyte0);
    }

    public static az a(byte abyte0[], z z)
    {
        return (az)i.a(abyte0, z);
    }

    public static bO a(az az1)
    {
        return i().a(az1);
    }

    static boolean a()
    {
        return d;
    }

    static int b(az az1, int i1)
    {
        az1.q = i1;
        return i1;
    }

    static a3 b(az az1, a3 a3_1)
    {
        az1.j = a3_1;
        return a3_1;
    }

    public static az b(InputStream inputstream)
    {
        return (az)i.a(inputstream);
    }

    public static az b(InputStream inputstream, z z)
    {
        return (az)i.a(inputstream, z);
    }

    static a3 c(az az1, a3 a3_1)
    {
        az1.k = a3_1;
        return a3_1;
    }

    public static bO i()
    {
        return bO.b();
    }

    public static az j()
    {
        return e;
    }

    public static final cP k()
    {
        return R.h();
    }

    private void r()
    {
        t = 0;
        k = a3.b;
        g = a3.b;
        j = a3.b;
        m = 0L;
    }

    public eh a()
    {
        return l();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected bO a(b4 b4)
    {
        return new bO(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((q & 1) == 1)
        {
            fa1.i(1, t);
        }
        if ((q & 2) == 2)
        {
            fa1.d(2, k);
        }
        if ((q & 4) == 4)
        {
            fa1.d(3, g);
        }
        if ((q & 8) == 8)
        {
            fa1.d(4, j);
        }
        if ((q & 0x10) == 16)
        {
            fa1.b(5, m);
        }
        c().a(fa1);
    }

    public int b()
    {
        int i1 = l;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((q & 1) == 1)
        {
            j1 = 0 + fa.g(1, t);
        }
        i1 = j1;
        if ((q & 2) == 2)
        {
            i1 = j1 + fa.c(2, k);
        }
        j1 = i1;
        if ((q & 4) == 4)
        {
            j1 = i1 + fa.c(3, g);
        }
        i1 = j1;
        if ((q & 8) == 8)
        {
            i1 = j1 + fa.c(4, j);
        }
        j1 = i1;
        if ((q & 0x10) == 16)
        {
            j1 = i1 + fa.e(5, m);
        }
        i1 = j1 + c().b();
        l = i1;
        return i1;
    }

    public P b()
    {
        return e();
    }

    public fn b()
    {
        return i;
    }

    public boolean b()
    {
        return (q & 0x10) == 16;
    }

    public final bR c()
    {
        return f;
    }

    public cR c()
    {
        return e();
    }

    public eh c()
    {
        return m();
    }

    public ga c()
    {
        return m();
    }

    public boolean c()
    {
        return (q & 2) == 2;
    }

    public int d()
    {
        return t;
    }

    public ga d()
    {
        return l();
    }

    public final boolean d()
    {
        byte byte0 = h;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            h = 1;
            return true;
        }
    }

    protected aH e()
    {
        return R.m().a(org/whispersystems/az, org/whispersystems/bO);
    }

    public az e()
    {
        return e;
    }

    public boolean f()
    {
        return (q & 4) == 4;
    }

    public a3 g()
    {
        return j;
    }

    public a3 h()
    {
        return k;
    }

    public bO l()
    {
        return i();
    }

    public bO m()
    {
        return a(this);
    }

    public boolean n()
    {
        return (q & 8) == 8;
    }

    public long o()
    {
        return m;
    }

    public a3 p()
    {
        return g;
    }

    public boolean q()
    {
        return (q & 1) == 1;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        e = new az(true);
        e.r();
    }
}
