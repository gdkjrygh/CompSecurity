// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google:
//            d8, f8, aD, bp, 
//            d9, bR, eL, gK, 
//            fz, fK, dz, fx, 
//            ee, fn, eI, el, 
//            a3, fa, aH, z, 
//            dE, cP, b4, eh, 
//            P, cR, ga, em

public final class dq extends d8
    implements f8
{

    public static final int e = 1;
    public static final int h = 7;
    public static final int i = 2;
    public static final int j = 8;
    public static final int l = 4;
    public static final int n = 5;
    public static fn r = new aD();
    public static final int s = 6;
    private static final long serialVersionUID = 0L;
    public static final int x = 3;
    private static final dq z;
    private gK f;
    private Object g;
    private Object k;
    private dz m;
    private fK o;
    private int p;
    private int q;
    private final bR t;
    private int u;
    private Object v;
    private byte w;
    private Object y;

    private dq(eL el1, z z1)
    {
        fz fz1;
        int i1;
        int k1;
        k1 = d9.c;
        super();
        w = -1;
        u = -1;
        h();
        fz1 = bR.a();
        i1 = 0;
_L28:
        if (i1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = el1.f();
        int j1 = i1;
        l1;
        JVM INSTR lookupswitch 9: default 132
    //                   0: 505
    //                   10: 645
    //                   18: 638
    //                   24: 631
    //                   32: 624
    //                   40: 617
    //                   50: 610
    //                   58: 603
    //                   66: 412;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        boolean flag = a(el1, fz1, z1, l1);
        if (flag) goto _L12; else goto _L11
_L11:
        if (k1 == 0) goto _L14; else goto _L13
_L13:
        j1 = 1;
_L31:
        p = p | 1;
        v = el1.x();
        i1 = j1;
        if (k1 == 0) goto _L12; else goto _L15
_L15:
        p = p | 0x20;
        g = el1.x();
        i1 = j1;
        if (k1 == 0) goto _L12; else goto _L16
_L16:
        p = p | 2;
        q = el1.c();
        i1 = j1;
        if (k1 == 0) goto _L12; else goto _L17
_L17:
        Object obj;
        i1 = el1.w();
        obj = gK.valueOf(i1);
        if (obj != null) goto _L19; else goto _L18
_L18:
        fz1.a(4, i1);
        i1 = j1;
        if (k1 == 0) goto _L12; else goto _L19
_L19:
        p = p | 4;
        f = ((gK) (obj));
        i1 = j1;
        if (k1 == 0) goto _L12; else goto _L20
_L20:
        i1 = el1.w();
        obj = fK.valueOf(i1);
        if (obj != null) goto _L22; else goto _L21
_L21:
        fz1.a(5, i1);
        i1 = j1;
        if (k1 == 0) goto _L12; else goto _L22
_L22:
        p = p | 8;
        o = ((fK) (obj));
        i1 = j1;
        if (k1 == 0) goto _L12; else goto _L23
_L23:
        p = p | 0x10;
        y = el1.x();
        i1 = j1;
        if (k1 == 0) goto _L12; else goto _L24
_L24:
        p = p | 0x40;
        k = el1.x();
        i1 = j1;
        if (k1 == 0) goto _L12; else goto _L10
_L10:
        if ((p & 0x80) != 128) goto _L26; else goto _L25
_L25:
        obj = m.y();
_L30:
        m = (dz)el1.a(dz.y, z1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        ((fx) (obj)).a(m);
        m = ((fx) (obj)).e();
        p = p | 0x80;
        i1 = j1;
_L12:
        if (k1 == 0) goto _L28; else goto _L27
_L27:
        t = fz1.c();
        d();
        return;
_L2:
        if (k1 == 0) goto _L14; else goto _L29
_L29:
        i1 = 1;
          goto _L1
        el1;
        throw el1;
        el1;
        throw el1.a(this);
        el1;
        t = fz1.c();
        d();
        throw el1;
        el1;
        throw el1;
        el1;
        throw el1;
        el1;
        throw el1;
        el1;
        throw (new bp(el1.getMessage())).a(this);
        el1;
        throw el1;
        el1;
        throw el1;
        el1;
        throw el1;
        el1;
        throw el1;
        el1;
        throw el1;
        el1;
        throw el1;
        el1;
        throw el1;
_L26:
        obj = null;
          goto _L30
_L14:
        i1 = 1;
          goto _L12
_L9:
        j1 = i1;
          goto _L24
_L8:
        j1 = i1;
          goto _L23
_L7:
        j1 = i1;
          goto _L20
_L6:
        j1 = i1;
          goto _L17
_L5:
        j1 = i1;
          goto _L16
_L4:
        j1 = i1;
          goto _L15
_L3:
        j1 = i1;
          goto _L31
    }

    dq(eL el1, z z1, dE de)
    {
        this(el1, z1);
    }

    private dq(ee ee1)
    {
        super(ee1);
        w = -1;
        u = -1;
        t = ee1.c();
    }

    dq(ee ee1, dE de)
    {
        this(ee1);
    }

    private dq(boolean flag)
    {
        w = -1;
        u = -1;
        t = bR.d();
    }

    static int a(dq dq1, int i1)
    {
        dq1.q = i1;
        return i1;
    }

    public static dq a(a3 a3_1)
    {
        return (dq)r.a(a3_1);
    }

    public static dq a(a3 a3_1, z z1)
    {
        return (dq)r.b(a3_1, z1);
    }

    public static dq a(eL el1)
    {
        return (dq)r.a(el1);
    }

    public static dq a(eL el1, z z1)
    {
        return (dq)r.b(el1, z1);
    }

    public static dq a(InputStream inputstream)
    {
        return (dq)r.b(inputstream);
    }

    public static dq a(InputStream inputstream, z z1)
    {
        return (dq)r.b(inputstream, z1);
    }

    public static dq a(byte abyte0[])
    {
        return (dq)r.a(abyte0);
    }

    public static dq a(byte abyte0[], z z1)
    {
        return (dq)r.a(abyte0, z1);
    }

    static dz a(dq dq1, dz dz1)
    {
        dq1.m = dz1;
        return dz1;
    }

    public static eI a(dq dq1)
    {
        return t().a(dq1);
    }

    static fK a(dq dq1, fK fk)
    {
        dq1.o = fk;
        return fk;
    }

    static gK a(dq dq1, gK gk)
    {
        dq1.f = gk;
        return gk;
    }

    static Object a(dq dq1, Object obj)
    {
        dq1.k = obj;
        return obj;
    }

    static int b(dq dq1, int i1)
    {
        dq1.p = i1;
        return i1;
    }

    public static dq b(InputStream inputstream)
    {
        return (dq)r.a(inputstream);
    }

    public static dq b(InputStream inputstream, z z1)
    {
        return (dq)r.a(inputstream, z1);
    }

    static Object b(dq dq1)
    {
        return dq1.k;
    }

    static Object b(dq dq1, Object obj)
    {
        dq1.y = obj;
        return obj;
    }

    static Object c(dq dq1)
    {
        return dq1.v;
    }

    static Object c(dq dq1, Object obj)
    {
        dq1.v = obj;
        return obj;
    }

    static Object d(dq dq1)
    {
        return dq1.y;
    }

    static Object d(dq dq1, Object obj)
    {
        dq1.g = obj;
        return obj;
    }

    static Object e(dq dq1)
    {
        return dq1.g;
    }

    private void h()
    {
        v = "";
        q = 0;
        f = gK.LABEL_OPTIONAL;
        o = fK.TYPE_DOUBLE;
        y = "";
        g = "";
        k = "";
        m = dz.p();
    }

    public static dq i()
    {
        return z;
    }

    public static eI t()
    {
        return eI.d();
    }

    public static final cP v()
    {
        return el.s();
    }

    public a3 A()
    {
        Object obj = v;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            v = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public boolean B()
    {
        return (p & 1) == 1;
    }

    protected eI a(b4 b4)
    {
        return new eI(b4, null);
    }

    public eh a()
    {
        return s();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public void a(fa fa1)
    {
        b();
        if ((p & 1) == 1)
        {
            fa1.d(1, A());
        }
        if ((p & 0x20) == 32)
        {
            fa1.d(2, b());
        }
        if ((p & 2) == 2)
        {
            fa1.c(3, q);
        }
        if ((p & 4) == 4)
        {
            fa1.e(4, f.getNumber());
        }
        if ((p & 8) == 8)
        {
            fa1.e(5, o.getNumber());
        }
        if ((p & 0x10) == 16)
        {
            fa1.d(6, n());
        }
        if ((p & 0x40) == 64)
        {
            fa1.d(7, k());
        }
        if ((p & 0x80) == 128)
        {
            fa1.d(8, m);
        }
        c().a(fa1);
    }

    public boolean a()
    {
        return (p & 0x40) == 64;
    }

    public int b()
    {
        int i1 = u;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((p & 1) == 1)
        {
            j1 = 0 + fa.c(1, A());
        }
        i1 = j1;
        if ((p & 0x20) == 32)
        {
            i1 = j1 + fa.c(2, b());
        }
        j1 = i1;
        if ((p & 2) == 2)
        {
            j1 = i1 + fa.h(3, q);
        }
        i1 = j1;
        if ((p & 4) == 4)
        {
            i1 = j1 + fa.b(4, f.getNumber());
        }
        j1 = i1;
        if ((p & 8) == 8)
        {
            j1 = i1 + fa.b(5, o.getNumber());
        }
        i1 = j1;
        if ((p & 0x10) == 16)
        {
            i1 = j1 + fa.c(6, n());
        }
        j1 = i1;
        if ((p & 0x40) == 64)
        {
            j1 = i1 + fa.c(7, k());
        }
        i1 = j1;
        if ((p & 0x80) == 128)
        {
            i1 = j1 + fa.c(8, m);
        }
        i1 += c().b();
        u = i1;
        return i1;
    }

    public P b()
    {
        return x();
    }

    public a3 b()
    {
        Object obj = g;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            g = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public fn b()
    {
        return r;
    }

    public final bR c()
    {
        return t;
    }

    public cR c()
    {
        return x();
    }

    public eh c()
    {
        return y();
    }

    public ga c()
    {
        return y();
    }

    public boolean c()
    {
        return (p & 4) == 4;
    }

    public em d()
    {
        return m;
    }

    public ga d()
    {
        return s();
    }

    public final boolean d()
    {
        byte byte0 = w;
        if (byte0 != -1)
        {
            return byte0 == 1;
        }
        if (r() && !z().d())
        {
            w = 0;
            return false;
        } else
        {
            w = 1;
            return true;
        }
    }

    protected aH e()
    {
        return el.n().a(com/google/dq, com/google/eI);
    }

    public String e()
    {
        Object obj = k;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            k = s1;
        }
        return s1;
    }

    public fK f()
    {
        return o;
    }

    public String g()
    {
        Object obj = g;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            g = s1;
        }
        return s1;
    }

    public String j()
    {
        Object obj = v;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            v = s1;
        }
        return s1;
    }

    public a3 k()
    {
        Object obj = k;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            k = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public String l()
    {
        Object obj = y;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            y = s1;
        }
        return s1;
    }

    public boolean m()
    {
        return (p & 0x10) == 16;
    }

    public a3 n()
    {
        Object obj = y;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            y = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public int o()
    {
        return q;
    }

    public boolean p()
    {
        return (p & 8) == 8;
    }

    public boolean q()
    {
        return (p & 2) == 2;
    }

    public boolean r()
    {
        return (p & 0x80) == 128;
    }

    public eI s()
    {
        return t();
    }

    public boolean u()
    {
        return (p & 0x20) == 32;
    }

    public gK w()
    {
        return f;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    public dq x()
    {
        return z;
    }

    public eI y()
    {
        return a(this);
    }

    public dz z()
    {
        return m;
    }

    static 
    {
        z = new dq(true);
        z.h();
    }
}
