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
//            M, o, d, ao, 
//            ap

public final class a8 extends d8
    implements M
{

    public static final int e = 1;
    public static final int f = 4;
    public static final int k = 2;
    private static final a8 m;
    public static final int o = 5;
    public static fn p = new o();
    private static final long serialVersionUID = 0L;
    public static final int t = 3;
    private a3 g;
    private a3 h;
    private int i;
    private int j;
    private byte l;
    private int n;
    private a3 q;
    private a3 r;
    private final bR s;

    private a8(eL el, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = d.a;
        super();
        l = -1;
        n = -1;
        q();
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
    //                   42: 269;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        boolean flag6 = a(el, fz1, z, j1);
        if (flag6) goto _L9; else goto _L8
_L8:
        if (i1 == 0) goto _L11; else goto _L10
_L10:
        flag1 = true;
_L3:
        i = i | 1;
        j = el.a();
        flag = flag1;
        if (i1 == 0) goto _L9; else goto _L12
_L12:
        flag2 = flag1;
_L4:
        i = i | 2;
        r = el.x();
        flag = flag2;
        if (i1 == 0) goto _L9; else goto _L13
_L13:
        flag3 = flag2;
_L5:
        i = i | 4;
        q = el.x();
        flag = flag3;
        if (i1 == 0) goto _L9; else goto _L14
_L14:
        flag4 = flag3;
_L6:
        i = i | 8;
        h = el.x();
        flag = flag4;
        if (i1 == 0) goto _L9; else goto _L15
_L15:
        flag5 = flag4;
_L7:
        i = i | 0x10;
        g = el.x();
        flag = flag5;
_L9:
        if (i1 == 0) goto _L17; else goto _L16
_L16:
        s = fz1.c();
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
        s = fz1.c();
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

    a8(eL el, z z, ap ap)
    {
        this(el, z);
    }

    private a8(ee ee1)
    {
        super(ee1);
        l = -1;
        n = -1;
        s = ee1.c();
    }

    a8(ee ee1, ap ap)
    {
        this(ee1);
    }

    private a8(boolean flag)
    {
        l = -1;
        n = -1;
        s = bR.d();
    }

    static int a(a8 a8_1, int i1)
    {
        a8_1.i = i1;
        return i1;
    }

    static a3 a(a8 a8_1, a3 a3_1)
    {
        a8_1.h = a3_1;
        return a3_1;
    }

    public static a8 a(a3 a3_1)
    {
        return (a8)p.a(a3_1);
    }

    public static a8 a(a3 a3_1, z z)
    {
        return (a8)p.b(a3_1, z);
    }

    public static a8 a(eL el)
    {
        return (a8)p.a(el);
    }

    public static a8 a(eL el, z z)
    {
        return (a8)p.b(el, z);
    }

    public static a8 a(InputStream inputstream)
    {
        return (a8)p.b(inputstream);
    }

    public static a8 a(InputStream inputstream, z z)
    {
        return (a8)p.a(inputstream, z);
    }

    public static a8 a(byte abyte0[])
    {
        return (a8)p.a(abyte0);
    }

    public static a8 a(byte abyte0[], z z)
    {
        return (a8)p.a(abyte0, z);
    }

    public static ao a(a8 a8_1)
    {
        return e().a(a8_1);
    }

    static int b(a8 a8_1, int i1)
    {
        a8_1.j = i1;
        return i1;
    }

    static a3 b(a8 a8_1, a3 a3_1)
    {
        a8_1.r = a3_1;
        return a3_1;
    }

    public static a8 b(InputStream inputstream)
    {
        return (a8)p.a(inputstream);
    }

    public static a8 b(InputStream inputstream, z z)
    {
        return (a8)p.b(inputstream, z);
    }

    static a3 c(a8 a8_1, a3 a3_1)
    {
        a8_1.g = a3_1;
        return a3_1;
    }

    static a3 d(a8 a8_1, a3 a3_1)
    {
        a8_1.q = a3_1;
        return a3_1;
    }

    public static a8 d()
    {
        return m;
    }

    public static ao e()
    {
        return ao.e();
    }

    public static final cP g()
    {
        return org.whispersystems.d.g();
    }

    static boolean k()
    {
        return d;
    }

    private void q()
    {
        j = 0;
        r = a3.b;
        q = a3.b;
        h = a3.b;
        g = a3.b;
    }

    public eh a()
    {
        return h();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected ao a(b4 b4)
    {
        return new ao(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((i & 1) == 1)
        {
            fa1.i(1, j);
        }
        if ((i & 2) == 2)
        {
            fa1.d(2, r);
        }
        if ((i & 4) == 4)
        {
            fa1.d(3, q);
        }
        if ((i & 8) == 8)
        {
            fa1.d(4, h);
        }
        if ((i & 0x10) == 16)
        {
            fa1.d(5, g);
        }
        c().a(fa1);
    }

    public int b()
    {
        int i1 = n;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((i & 1) == 1)
        {
            j1 = 0 + fa.g(1, j);
        }
        i1 = j1;
        if ((i & 2) == 2)
        {
            i1 = j1 + fa.c(2, r);
        }
        j1 = i1;
        if ((i & 4) == 4)
        {
            j1 = i1 + fa.c(3, q);
        }
        i1 = j1;
        if ((i & 8) == 8)
        {
            i1 = j1 + fa.c(4, h);
        }
        j1 = i1;
        if ((i & 0x10) == 16)
        {
            j1 = i1 + fa.c(5, g);
        }
        i1 = j1 + c().b();
        n = i1;
        return i1;
    }

    public P b()
    {
        return f();
    }

    public a3 b()
    {
        return q;
    }

    public fn b()
    {
        return p;
    }

    public final bR c()
    {
        return s;
    }

    public cR c()
    {
        return f();
    }

    public eh c()
    {
        return r();
    }

    public ga c()
    {
        return r();
    }

    public boolean c()
    {
        return (i & 1) == 1;
    }

    public ga d()
    {
        return h();
    }

    public final boolean d()
    {
        byte byte0 = l;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            l = 1;
            return true;
        }
    }

    protected aH e()
    {
        return org.whispersystems.d.j().a(org/whispersystems/a8, org/whispersystems/ao);
    }

    public a8 f()
    {
        return m;
    }

    public ao h()
    {
        return e();
    }

    public boolean i()
    {
        return (i & 0x10) == 16;
    }

    public boolean j()
    {
        return (i & 4) == 4;
    }

    public int l()
    {
        return j;
    }

    public a3 m()
    {
        return r;
    }

    public a3 n()
    {
        return h;
    }

    public a3 o()
    {
        return g;
    }

    public boolean p()
    {
        return (i & 8) == 8;
    }

    public ao r()
    {
        return a(this);
    }

    public boolean s()
    {
        return (i & 2) == 2;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        m = new a8(true);
        m.q();
    }
}
