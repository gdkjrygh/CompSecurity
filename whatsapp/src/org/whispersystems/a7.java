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
//            bU, p, d, aC, 
//            ap

public final class a7 extends d8
    implements bU
{

    public static fn e = new p();
    private static final a7 f;
    public static final int h = 5;
    public static final int j = 2;
    public static final int k = 4;
    public static final int o = 3;
    private static final long serialVersionUID = 0L;
    public static final int t = 6;
    public static final int v = 1;
    private byte g;
    private int i;
    private a3 l;
    private a3 m;
    private final bR n;
    private int p;
    private int q;
    private int r;
    private a3 s;
    private int u;

    private a7(eL el, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = d.a;
        super();
        g = -1;
        u = -1;
        t();
        fz1 = bR.a();
        flag = false;
_L19:
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
        boolean flag6;
        flag1 = flag;
        flag2 = flag;
        flag3 = flag;
        flag4 = flag;
        flag5 = flag;
        flag6 = flag;
        j1;
        JVM INSTR lookupswitch 7: default 132
    //                   0: 354
    //                   8: 156
    //                   18: 187
    //                   26: 219
    //                   34: 251
    //                   40: 283
    //                   48: 314;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        boolean flag7 = a(el, fz1, z, j1);
        if (flag7) goto _L10; else goto _L9
_L9:
        if (i1 == 0) goto _L12; else goto _L11
_L11:
        flag1 = true;
_L3:
        r = r | 2;
        p = el.a();
        flag = flag1;
        if (i1 == 0) goto _L10; else goto _L13
_L13:
        flag2 = flag1;
_L4:
        r = r | 8;
        m = el.x();
        flag = flag2;
        if (i1 == 0) goto _L10; else goto _L14
_L14:
        flag3 = flag2;
_L5:
        r = r | 0x10;
        s = el.x();
        flag = flag3;
        if (i1 == 0) goto _L10; else goto _L15
_L15:
        flag4 = flag3;
_L6:
        r = r | 0x20;
        l = el.x();
        flag = flag4;
        if (i1 == 0) goto _L10; else goto _L16
_L16:
        flag5 = flag4;
_L7:
        r = r | 1;
        q = el.a();
        flag = flag5;
        if (i1 == 0) goto _L10; else goto _L17
_L17:
        flag6 = flag5;
_L8:
        r = r | 4;
        i = el.a();
        flag = flag6;
_L10:
        if (i1 == 0) goto _L19; else goto _L18
_L18:
        n = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L12; else goto _L20
_L20:
        flag = true;
          goto _L1
        el;
        throw el;
        el;
        throw el.a(this);
        el;
        n = fz1.c();
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
        throw el;
        el;
        throw (new bp(el.getMessage())).a(this);
_L12:
        flag = true;
          goto _L10
    }

    a7(eL el, z z, ap ap)
    {
        this(el, z);
    }

    private a7(ee ee1)
    {
        super(ee1);
        g = -1;
        u = -1;
        n = ee1.c();
    }

    a7(ee ee1, ap ap)
    {
        this(ee1);
    }

    private a7(boolean flag)
    {
        g = -1;
        u = -1;
        n = bR.d();
    }

    static int a(a7 a7_1, int i1)
    {
        a7_1.i = i1;
        return i1;
    }

    static a3 a(a7 a7_1, a3 a3_1)
    {
        a7_1.m = a3_1;
        return a3_1;
    }

    public static a7 a(a3 a3_1)
    {
        return (a7)e.a(a3_1);
    }

    public static a7 a(a3 a3_1, z z)
    {
        return (a7)e.b(a3_1, z);
    }

    public static a7 a(eL el)
    {
        return (a7)e.a(el);
    }

    public static a7 a(eL el, z z)
    {
        return (a7)e.b(el, z);
    }

    public static a7 a(InputStream inputstream)
    {
        return (a7)e.a(inputstream);
    }

    public static a7 a(InputStream inputstream, z z)
    {
        return (a7)e.a(inputstream, z);
    }

    public static a7 a(byte abyte0[])
    {
        return (a7)e.a(abyte0);
    }

    public static a7 a(byte abyte0[], z z)
    {
        return (a7)e.a(abyte0, z);
    }

    public static aC a(a7 a7_1)
    {
        return l().a(a7_1);
    }

    static int b(a7 a7_1, int i1)
    {
        a7_1.q = i1;
        return i1;
    }

    static a3 b(a7 a7_1, a3 a3_1)
    {
        a7_1.l = a3_1;
        return a3_1;
    }

    public static a7 b(InputStream inputstream)
    {
        return (a7)e.b(inputstream);
    }

    public static a7 b(InputStream inputstream, z z)
    {
        return (a7)e.b(inputstream, z);
    }

    static int c(a7 a7_1, int i1)
    {
        a7_1.p = i1;
        return i1;
    }

    static a3 c(a7 a7_1, a3 a3_1)
    {
        a7_1.s = a3_1;
        return a3_1;
    }

    static int d(a7 a7_1, int i1)
    {
        a7_1.r = i1;
        return i1;
    }

    public static a7 h()
    {
        return f;
    }

    public static aC l()
    {
        return aC.e();
    }

    static boolean p()
    {
        return d;
    }

    public static final cP r()
    {
        return org.whispersystems.d.d();
    }

    private void t()
    {
        q = 0;
        p = 0;
        i = 0;
        m = a3.b;
        s = a3.b;
        l = a3.b;
    }

    public eh a()
    {
        return u();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public aC a()
    {
        return a(this);
    }

    protected aC a(b4 b4)
    {
        return new aC(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((r & 2) == 2)
        {
            fa1.i(1, p);
        }
        if ((r & 8) == 8)
        {
            fa1.d(2, m);
        }
        if ((r & 0x10) == 16)
        {
            fa1.d(3, s);
        }
        if ((r & 0x20) == 32)
        {
            fa1.d(4, l);
        }
        if ((r & 1) == 1)
        {
            fa1.i(5, q);
        }
        if ((r & 4) == 4)
        {
            fa1.i(6, i);
        }
        c().a(fa1);
    }

    public int b()
    {
        int i1 = u;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((r & 2) == 2)
        {
            j1 = 0 + fa.g(1, p);
        }
        i1 = j1;
        if ((r & 8) == 8)
        {
            i1 = j1 + fa.c(2, m);
        }
        j1 = i1;
        if ((r & 0x10) == 16)
        {
            j1 = i1 + fa.c(3, s);
        }
        i1 = j1;
        if ((r & 0x20) == 32)
        {
            i1 = j1 + fa.c(4, l);
        }
        j1 = i1;
        if ((r & 1) == 1)
        {
            j1 = i1 + fa.g(5, q);
        }
        i1 = j1;
        if ((r & 4) == 4)
        {
            i1 = j1 + fa.g(6, i);
        }
        i1 += c().b();
        u = i1;
        return i1;
    }

    public P b()
    {
        return n();
    }

    public fn b()
    {
        return e;
    }

    public int c()
    {
        return i;
    }

    public final bR c()
    {
        return n;
    }

    public cR c()
    {
        return n();
    }

    public eh c()
    {
        return a();
    }

    public ga c()
    {
        return a();
    }

    public a3 d()
    {
        return l;
    }

    public ga d()
    {
        return u();
    }

    public final boolean d()
    {
        byte byte0 = g;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            g = 1;
            return true;
        }
    }

    public a3 e()
    {
        return m;
    }

    protected aH e()
    {
        return org.whispersystems.d.f().a(org/whispersystems/a7, org/whispersystems/aC);
    }

    public int f()
    {
        return p;
    }

    public a3 g()
    {
        return s;
    }

    public boolean i()
    {
        return (r & 2) == 2;
    }

    public boolean j()
    {
        return (r & 4) == 4;
    }

    public boolean k()
    {
        return (r & 8) == 8;
    }

    public int m()
    {
        return q;
    }

    public a7 n()
    {
        return f;
    }

    public boolean o()
    {
        return (r & 0x20) == 32;
    }

    public boolean q()
    {
        return (r & 0x10) == 16;
    }

    public boolean s()
    {
        return (r & 1) == 1;
    }

    public aC u()
    {
        return l();
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        f = new a7(true);
        f.t();
    }
}
