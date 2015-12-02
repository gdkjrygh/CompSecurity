// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            d8, fC, aK, bp, 
//            d9, bR, eL, dP, 
//            fz, ee, fn, ei, 
//            a3, el, cR, fa, 
//            f6, aH, z, dE, 
//            cP, eh, b4, P, 
//            ga

public final class dw extends d8
    implements fC
{

    public static final int i = 6;
    public static final int j = 4;
    public static final int l = 8;
    public static final int n = 3;
    public static final int o = 2;
    public static final int p = 7;
    public static final int q = 5;
    private static final dw r;
    private static final long serialVersionUID = 0L;
    public static fn t = new aK();
    private int e;
    private List f;
    private byte g;
    private double h;
    private a3 k;
    private long m;
    private long s;
    private Object u;
    private Object v;
    private final bR w;
    private int x;

    private dw(eL el1, z z)
    {
        fz fz1;
        boolean flag2;
        boolean flag3;
        int i1;
        flag3 = false;
        i1 = d9.c;
        super();
        g = -1;
        e = -1;
        k();
        fz1 = bR.a();
        flag2 = false;
_L23:
        boolean flag;
        boolean flag1;
        boolean flag4;
        flag = flag2;
        if (flag3)
        {
            break; /* Loop/switch isn't completed */
        }
        flag4 = flag2;
        flag = flag2;
        flag1 = flag2;
        int j1 = el1.f();
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        boolean flag11;
        boolean flag12;
        boolean flag13;
        boolean flag14;
        boolean flag15;
        boolean flag16;
        flag10 = flag3;
        flag11 = flag3;
        flag4 = flag2;
        flag12 = flag3;
        flag5 = flag2;
        flag13 = flag3;
        flag6 = flag2;
        flag14 = flag3;
        flag7 = flag2;
        flag15 = flag3;
        flag8 = flag2;
        flag16 = flag3;
        flag9 = flag2;
        j1;
        JVM INSTR lookupswitch 8: default 188
    //                   0: 721
    //                   18: 224
    //                   26: 312
    //                   32: 375
    //                   40: 438
    //                   49: 501
    //                   58: 565
    //                   66: 629;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        flag = flag2;
        flag1 = flag2;
        boolean flag17 = a(el1, fz1, z, j1);
        flag = flag2;
        if (flag17) goto _L11; else goto _L10
_L10:
        if (i1 == 0) goto _L13; else goto _L12
_L12:
        flag10 = true;
_L3:
        flag4 = flag2;
        if ((flag2 & true)) goto _L15; else goto _L14
_L14:
        flag4 = flag2;
        flag = flag2;
        flag1 = flag2;
        f = new ArrayList();
        flag4 = flag2 | true;
_L15:
        flag = flag4;
        flag2 = flag4;
        flag1 = flag4;
        f.add(el1.a(dP.e, z));
        flag3 = flag10;
        flag = flag4;
        if (i1 == 0) goto _L11; else goto _L16
_L16:
        flag11 = flag10;
_L4:
        flag = flag4;
        flag2 = flag4;
        flag1 = flag4;
        x = x | 1;
        flag = flag4;
        flag2 = flag4;
        flag1 = flag4;
        u = el1.x();
        flag3 = flag11;
        flag = flag4;
        if (i1 == 0) goto _L11; else goto _L17
_L17:
        flag5 = flag4;
        flag12 = flag11;
_L5:
        flag = flag5;
        flag3 = flag5;
        flag1 = flag5;
        x = x | 2;
        flag = flag5;
        flag3 = flag5;
        flag1 = flag5;
        m = el1.s();
        flag3 = flag12;
        flag = flag5;
        if (i1 == 0) goto _L11; else goto _L18
_L18:
        flag6 = flag5;
        flag13 = flag12;
_L6:
        flag = flag6;
        flag2 = flag6;
        flag1 = flag6;
        x = x | 4;
        flag = flag6;
        flag2 = flag6;
        flag1 = flag6;
        s = el1.i();
        flag3 = flag13;
        flag = flag6;
        if (i1 == 0) goto _L11; else goto _L19
_L19:
        flag7 = flag6;
        flag14 = flag13;
_L7:
        flag = flag7;
        flag3 = flag7;
        flag1 = flag7;
        x = x | 8;
        flag = flag7;
        flag3 = flag7;
        flag1 = flag7;
        h = el1.m();
        flag3 = flag14;
        flag = flag7;
        if (i1 == 0) goto _L11; else goto _L20
_L20:
        flag8 = flag7;
        flag15 = flag14;
_L8:
        flag = flag8;
        flag2 = flag8;
        flag1 = flag8;
        x = x | 0x10;
        flag = flag8;
        flag2 = flag8;
        flag1 = flag8;
        k = el1.x();
        flag3 = flag15;
        flag = flag8;
        if (i1 == 0) goto _L11; else goto _L21
_L21:
        flag9 = flag8;
        flag16 = flag15;
_L9:
        flag = flag9;
        flag3 = flag9;
        flag1 = flag9;
        x = x | 0x20;
        flag = flag9;
        flag3 = flag9;
        flag1 = flag9;
        v = el1.x();
        flag = flag9;
        flag3 = flag16;
_L11:
        flag2 = flag;
        if (i1 == 0) goto _L23; else goto _L22
_L22:
        if ((flag & true))
        {
            try
            {
                f = Collections.unmodifiableList(f);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        w = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L13; else goto _L24
_L24:
        flag3 = true;
          goto _L1
        el1;
        flag4 = flag2;
        flag = flag2;
        flag1 = flag2;
        throw el1;
        el1;
        flag = flag4;
        throw el1.a(this);
        el1;
        if ((flag & true))
        {
            try
            {
                f = Collections.unmodifiableList(f);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        w = fz1.c();
        d();
        throw el1;
        el1;
        flag = flag2;
        flag3 = flag2;
        flag1 = flag2;
        throw el1;
        el1;
        flag = flag3;
        flag2 = flag3;
        flag1 = flag3;
        throw el1;
        el1;
        flag = flag2;
        flag3 = flag2;
        flag1 = flag2;
        throw el1;
        el1;
        flag = flag3;
        flag2 = flag3;
        flag1 = flag3;
        throw el1;
        el1;
        flag = flag2;
        flag3 = flag2;
        flag1 = flag2;
        throw el1;
        el1;
        flag4 = flag3;
        flag = flag3;
        flag1 = flag3;
        throw el1;
        el1;
        flag = flag1;
        throw (new bp(el1.getMessage())).a(this);
_L13:
        flag3 = true;
        flag = flag2;
          goto _L11
    }

    dw(eL el1, z z, dE de)
    {
        this(el1, z);
    }

    private dw(ee ee1)
    {
        super(ee1);
        g = -1;
        e = -1;
        w = ee1.c();
    }

    dw(ee ee1, dE de)
    {
        this(ee1);
    }

    private dw(boolean flag)
    {
        g = -1;
        e = -1;
        w = bR.d();
    }

    static double a(dw dw1, double d1)
    {
        dw1.h = d1;
        return d1;
    }

    static int a(dw dw1, int i1)
    {
        dw1.x = i1;
        return i1;
    }

    static long a(dw dw1, long l1)
    {
        dw1.m = l1;
        return l1;
    }

    static a3 a(dw dw1, a3 a3_1)
    {
        dw1.k = a3_1;
        return a3_1;
    }

    public static dw a(a3 a3_1)
    {
        return (dw)t.a(a3_1);
    }

    public static dw a(a3 a3_1, z z)
    {
        return (dw)t.b(a3_1, z);
    }

    public static dw a(eL el1)
    {
        return (dw)t.a(el1);
    }

    public static dw a(eL el1, z z)
    {
        return (dw)t.b(el1, z);
    }

    public static dw a(InputStream inputstream)
    {
        return (dw)t.b(inputstream);
    }

    public static dw a(InputStream inputstream, z z)
    {
        return (dw)t.a(inputstream, z);
    }

    public static dw a(byte abyte0[])
    {
        return (dw)t.a(abyte0);
    }

    public static dw a(byte abyte0[], z z)
    {
        return (dw)t.a(abyte0, z);
    }

    static Object a(dw dw1)
    {
        return dw1.u;
    }

    static Object a(dw dw1, Object obj)
    {
        dw1.u = obj;
        return obj;
    }

    static List a(dw dw1, List list)
    {
        dw1.f = list;
        return list;
    }

    static long b(dw dw1, long l1)
    {
        dw1.s = l1;
        return l1;
    }

    public static dw b(InputStream inputstream)
    {
        return (dw)t.a(inputstream);
    }

    public static dw b(InputStream inputstream, z z)
    {
        return (dw)t.b(inputstream, z);
    }

    public static ei b(dw dw1)
    {
        return g().a(dw1);
    }

    static Object b(dw dw1, Object obj)
    {
        dw1.v = obj;
        return obj;
    }

    static Object c(dw dw1)
    {
        return dw1.v;
    }

    static List d(dw dw1)
    {
        return dw1.f;
    }

    public static ei g()
    {
        return ei.a();
    }

    private void k()
    {
        f = Collections.emptyList();
        u = "";
        m = 0L;
        s = 0L;
        h = 0.0D;
        k = a3.b;
        v = "";
    }

    public static final cP l()
    {
        return el.a();
    }

    public static dw n()
    {
        return r;
    }

    public dP a(int i1)
    {
        return (dP)f.get(i1);
    }

    public eh a()
    {
        return t();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected ei a(b4 b4)
    {
        return new ei(b4, null);
    }

    public String a()
    {
        Object obj = u;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            u = s1;
        }
        return s1;
    }

    public void a(fa fa1)
    {
        int j1 = d9.c;
        b();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < f.size())
                {
                    fa1.d(2, (cR)f.get(i1));
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                if ((x & 1) == 1)
                {
                    fa1.d(3, j());
                }
                if ((x & 2) == 2)
                {
                    fa1.d(4, m);
                }
                if ((x & 4) == 4)
                {
                    fa1.c(5, s);
                }
                if ((x & 8) == 8)
                {
                    fa1.b(6, h);
                }
                if ((x & 0x10) == 16)
                {
                    fa1.d(7, k);
                }
                if ((x & 0x20) == 32)
                {
                    fa1.d(8, m());
                }
                c().a(fa1);
                return;
            }
            i1++;
        } while (true);
    }

    public int b()
    {
        int l1 = d9.c;
        int i1 = e;
        if (i1 != -1)
        {
            return i1;
        }
        int k1 = 0;
        i1 = 0;
        do
        {
label0:
            {
                int j1 = i1;
                if (k1 < f.size())
                {
                    i1 += fa.c(2, (cR)f.get(k1));
                    if (l1 == 0)
                    {
                        break label0;
                    }
                    j1 = i1;
                }
                i1 = j1;
                if ((x & 1) == 1)
                {
                    i1 = j1 + fa.c(3, j());
                }
                j1 = i1;
                if ((x & 2) == 2)
                {
                    j1 = i1 + fa.f(4, m);
                }
                i1 = j1;
                if ((x & 4) == 4)
                {
                    i1 = j1 + fa.a(5, s);
                }
                j1 = i1;
                if ((x & 8) == 8)
                {
                    j1 = i1 + fa.a(6, h);
                }
                i1 = j1;
                if ((x & 0x10) == 16)
                {
                    i1 = j1 + fa.c(7, k);
                }
                j1 = i1;
                if ((x & 0x20) == 32)
                {
                    j1 = i1 + fa.c(8, m());
                }
                i1 = c().b() + j1;
                e = i1;
                return i1;
            }
            k1++;
        } while (true);
    }

    public P b()
    {
        return r();
    }

    public f6 b(int i1)
    {
        return (f6)f.get(i1);
    }

    public fn b()
    {
        return t;
    }

    public boolean b()
    {
        return (x & 1) == 1;
    }

    public final bR c()
    {
        return w;
    }

    public cR c()
    {
        return r();
    }

    public eh c()
    {
        return s();
    }

    public ga c()
    {
        return s();
    }

    public boolean c()
    {
        return (x & 0x10) == 16;
    }

    public ga d()
    {
        return t();
    }

    public List d()
    {
        return f;
    }

    public final boolean d()
    {
        int j1 = d9.c;
        int i1 = g;
        if (i1 != -1)
        {
            return i1 == 1;
        }
        i1 = 0;
        do
        {
            if (i1 >= p())
            {
                break;
            }
            if (!a(i1).d())
            {
                g = 0;
                return false;
            }
            i1++;
        } while (j1 == 0);
        g = 1;
        return true;
    }

    protected aH e()
    {
        return el.u().a(com/google/dw, com/google/ei);
    }

    public String e()
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

    public long f()
    {
        return s;
    }

    public boolean h()
    {
        return (x & 8) == 8;
    }

    public a3 i()
    {
        return k;
    }

    public a3 j()
    {
        Object obj = u;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            u = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public a3 m()
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

    public boolean o()
    {
        return (x & 2) == 2;
    }

    public int p()
    {
        return f.size();
    }

    public boolean q()
    {
        return (x & 0x20) == 32;
    }

    public dw r()
    {
        return r;
    }

    public ei s()
    {
        return b(this);
    }

    public ei t()
    {
        return g();
    }

    public double u()
    {
        return h;
    }

    public List v()
    {
        return f;
    }

    public long w()
    {
        return m;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    public boolean x()
    {
        return (x & 4) == 4;
    }

    static 
    {
        r = new dw(true);
        r.k();
    }
}
