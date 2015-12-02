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
//            d8, bk, aS, bp, 
//            d9, bR, eL, fM, 
//            b, d7, dM, d5, 
//            dq, de, fX, dg, 
//            eN, v, fz, ee, 
//            fn, eQ, el, dB, 
//            fa, cR, a3, cc, 
//            aH, f8, e2, z, 
//            dE, cP, b4, eh, 
//            P, bg, ga, fE

public final class dS extends d8
    implements bk
{

    public static final int A = 3;
    public static final int C = 10;
    public static final int E = 7;
    public static fn f = new aS();
    public static final int i = 2;
    public static final int j = 8;
    public static final int k = 9;
    public static final int p = 4;
    public static final int q = 11;
    public static final int r = 5;
    private static final long serialVersionUID = 0L;
    public static final int t = 6;
    public static final int w = 1;
    private static final dS z;
    private List B;
    private List D;
    private List F;
    private b e;
    private final bR g;
    private List h;
    private int l;
    private dg m;
    private byte n;
    private Object o;
    private de s;
    private List u;
    private int v;
    private List x;
    private Object y;

    private dS(eL el1, z z1)
    {
        fz fz1;
        int l1;
        int i2;
        int i7;
        i7 = d9.c;
        super();
        n = -1;
        l = -1;
        s();
        l1 = 0;
        fz1 = bR.a();
        i2 = 0;
_L58:
        int i1;
        int j1;
        int k1;
        i1 = l1;
        if (i2 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = l1;
        i1 = l1;
        j1 = l1;
        int j7 = el1.f();
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        k1 = i2;
        k6 = i2;
        l4 = i2;
        i5 = i2;
        j3 = l1;
        j5 = i2;
        k3 = l1;
        k5 = i2;
        l3 = l1;
        l5 = i2;
        i4 = l1;
        i1 = i2;
        j2 = l1;
        i6 = i2;
        i3 = l1;
        k4 = i2;
        k2 = l1;
        j6 = i2;
        j4 = l1;
        l6 = i2;
        l2 = l1;
        j7;
        JVM INSTR lookupswitch 14: default 268
    //                   0: 1865
    //                   10: 312
    //                   18: 363
    //                   26: 414
    //                   34: 497
    //                   42: 588
    //                   50: 679
    //                   58: 773
    //                   66: 867
    //                   74: 2349
    //                   80: 1156
    //                   82: 1250
    //                   88: 1427
    //                   90: 1521;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        i1 = l1;
        j1 = l1;
        boolean flag = a(el1, fz1, z1, j7);
        i1 = l1;
        if (flag) goto _L17; else goto _L16
_L16:
        i2 = 1;
        k1 = 1;
        i1 = l1;
        if (i7 == 0) goto _L17; else goto _L3
_L3:
        i1 = l1;
        j1 = l1;
        v = v | 1;
        i1 = l1;
        j1 = l1;
        o = el1.x();
        i2 = k1;
        i1 = l1;
        if (i7 == 0) goto _L17; else goto _L18
_L18:
        k6 = k1;
_L4:
        i1 = l1;
        j1 = l1;
        v = v | 2;
        i1 = l1;
        j1 = l1;
        y = el1.x();
        i2 = k6;
        i1 = l1;
        if (i7 == 0) goto _L17; else goto _L19
_L19:
        l4 = k6;
_L5:
        j2 = l1;
        if ((l1 & 4) == 4) goto _L21; else goto _L20
_L20:
        k1 = l1;
        i1 = l1;
        j1 = l1;
        e = new fM();
        j2 = l1 | 4;
_L21:
        i1 = j2;
        j1 = j2;
        e.a(el1.x());
        i2 = l4;
        i1 = j2;
        if (i7 == 0) goto _L17; else goto _L22
_L22:
        j3 = j2;
        i5 = l4;
_L6:
        l1 = j3;
        if ((j3 & 0x20) == 32) goto _L24; else goto _L23
_L23:
        k1 = j3;
        i1 = j3;
        j1 = j3;
        F = new ArrayList();
        l1 = j3 | 0x20;
_L24:
        i1 = l1;
        j1 = l1;
        F.add(el1.a(d7.i, z1));
        i2 = i5;
        i1 = l1;
        if (i7 == 0) goto _L17; else goto _L25
_L25:
        k3 = l1;
        j5 = i5;
_L7:
        l1 = k3;
        if ((k3 & 0x40) == 64) goto _L27; else goto _L26
_L26:
        k1 = k3;
        i1 = k3;
        j1 = k3;
        D = new ArrayList();
        l1 = k3 | 0x40;
_L27:
        i1 = l1;
        j1 = l1;
        D.add(el1.a(dM.i, z1));
        i2 = j5;
        i1 = l1;
        if (i7 == 0) goto _L17; else goto _L28
_L28:
        l3 = l1;
        k5 = j5;
_L8:
        l1 = l3;
        if ((l3 & 0x80) == 128) goto _L30; else goto _L29
_L29:
        k1 = l3;
        i1 = l3;
        j1 = l3;
        x = new ArrayList();
        l1 = l3 | 0x80;
_L30:
        i1 = l1;
        j1 = l1;
        x.add(el1.a(d5.m, z1));
        i2 = k5;
        i1 = l1;
        if (i7 == 0) goto _L17; else goto _L31
_L31:
        i4 = l1;
        l5 = k5;
_L9:
        j2 = i4;
        if ((i4 & 0x100) == 256) goto _L33; else goto _L32
_L32:
        k1 = i4;
        i1 = i4;
        j1 = i4;
        u = new ArrayList();
        j2 = i4 | 0x100;
_L33:
        k1 = j2;
        i1 = j2;
        j1 = j2;
        u.add(el1.a(dq.r, z1));
        i2 = l5;
        i1 = j2;
        if (i7 == 0) goto _L17; else goto _L34
_L34:
        i1 = l5;
_L10:
        i2 = i1;
        k1 = j2;
        i1 = j2;
        j1 = j2;
        if ((v & 4) != 4) goto _L36; else goto _L35
_L35:
        k1 = j2;
        i1 = j2;
        j1 = j2;
        Object obj = s.q();
_L61:
        i1 = j2;
        j1 = j2;
        s = (de)el1.a(de.j, z1);
        if (obj == null) goto _L38; else goto _L37
_L37:
        i1 = j2;
        j1 = j2;
        ((fX) (obj)).a(s);
        i1 = j2;
        j1 = j2;
        s = ((fX) (obj)).k();
_L38:
        k1 = j2;
        i1 = j2;
        j1 = j2;
        v = v | 4;
        i1 = j2;
        j1 = i2;
        if (i7 == 0) goto _L40; else goto _L39
_L39:
        l1 = j2;
_L11:
        k1 = l1;
        i1 = l1;
        j1 = l1;
        if ((v & 8) != 8) goto _L42; else goto _L41
_L41:
        k1 = l1;
        i1 = l1;
        j1 = l1;
        obj = m.e();
_L60:
        i1 = l1;
        j1 = l1;
        m = (dg)el1.a(dg.g, z1);
        if (obj == null) goto _L44; else goto _L43
_L43:
        i1 = l1;
        j1 = l1;
        ((eN) (obj)).a(m);
        i1 = l1;
        j1 = l1;
        m = ((eN) (obj)).g();
_L44:
        i1 = l1;
        j1 = l1;
        v = v | 8;
        i1 = l1;
        j1 = i2;
        if (i7 == 0) goto _L40; else goto _L45
_L45:
        i3 = l1;
        i6 = i2;
_L12:
        l1 = i3;
        if ((i3 & 8) == 8) goto _L47; else goto _L46
_L46:
        k1 = i3;
        i1 = i3;
        j1 = i3;
        B = new ArrayList();
        l1 = i3 | 8;
_L47:
        k1 = l1;
        i1 = l1;
        j1 = l1;
        B.add(Integer.valueOf(el1.c()));
        i2 = i6;
        i1 = l1;
        if (i7 == 0) goto _L17; else goto _L48
_L48:
        k2 = l1;
        k4 = i6;
_L13:
        k1 = k2;
        i1 = k2;
        j1 = k2;
        i2 = el1.b(el1.l());
        l1 = k2;
        if ((k2 & 8) == 8)
        {
            break MISSING_BLOCK_LABEL_1339;
        }
        i1 = k2;
        j1 = k2;
        k1 = el1.p();
        l1 = k2;
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_1339;
        }
        k1 = k2;
        i1 = k2;
        j1 = k2;
        B = new ArrayList();
        l1 = k2 | 8;
_L50:
        k1 = l1;
        i1 = l1;
        j1 = l1;
        if (el1.p() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = l1;
        i1 = l1;
        j1 = l1;
        B.add(Integer.valueOf(el1.c()));
        if (i7 == 0) goto _L50; else goto _L49
_L49:
        i1 = l1;
        j1 = l1;
        el1.a(i2);
        i2 = k4;
        i1 = l1;
        if (i7 == 0) goto _L17; else goto _L51
_L51:
        j4 = l1;
        j6 = k4;
_L14:
        l1 = j4;
        if ((j4 & 0x10) == 16) goto _L53; else goto _L52
_L52:
        k1 = j4;
        i1 = j4;
        j1 = j4;
        h = new ArrayList();
        l1 = j4 | 0x10;
_L53:
        k1 = l1;
        i1 = l1;
        j1 = l1;
        h.add(Integer.valueOf(el1.c()));
        i2 = j6;
        i1 = l1;
        if (i7 == 0) goto _L17; else goto _L54
_L54:
        l2 = l1;
        l6 = j6;
_L15:
        k1 = l2;
        i1 = l2;
        j1 = l2;
        i2 = el1.b(el1.l());
        l1 = l2;
        if ((l2 & 0x10) == 16)
        {
            break MISSING_BLOCK_LABEL_1610;
        }
        i1 = l2;
        j1 = l2;
        k1 = el1.p();
        l1 = l2;
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_1610;
        }
        k1 = l2;
        i1 = l2;
        j1 = l2;
        h = new ArrayList();
        l1 = l2 | 0x10;
_L56:
        k1 = l1;
        i1 = l1;
        j1 = l1;
        if (el1.p() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = l1;
        i1 = l1;
        j1 = l1;
        h.add(Integer.valueOf(el1.c()));
        if (i7 == 0) goto _L56; else goto _L55
_L55:
        k1 = l1;
        i1 = l1;
        j1 = l1;
        el1.a(i2);
        i1 = l1;
        i2 = l6;
_L17:
        l1 = i1;
        if (i7 == 0) goto _L58; else goto _L57
_L57:
        if ((i1 & 4) == 4)
        {
            try
            {
                e = new v(e);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x20) == 32)
        {
            try
            {
                F = Collections.unmodifiableList(F);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x40) == 64)
        {
            try
            {
                D = Collections.unmodifiableList(D);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x80) == 128)
        {
            try
            {
                x = Collections.unmodifiableList(x);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x100) == 256)
        {
            try
            {
                u = Collections.unmodifiableList(u);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 8) == 8)
        {
            try
            {
                B = Collections.unmodifiableList(B);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x10) == 16)
        {
            try
            {
                h = Collections.unmodifiableList(h);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        g = fz1.c();
        d();
        return;
_L2:
        i2 = 1;
        j1 = 1;
        i1 = l1;
        if (i7 == 0) goto _L17; else goto _L59
_L59:
        i2 = j1;
          goto _L1
        el1;
        k1 = l1;
        i1 = l1;
        j1 = l1;
        throw el1;
        el1;
        i1 = k1;
        throw el1.a(this);
        el1;
        if ((i1 & 4) == 4)
        {
            try
            {
                e = new v(e);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x20) == 32)
        {
            try
            {
                F = Collections.unmodifiableList(F);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x40) == 64)
        {
            try
            {
                D = Collections.unmodifiableList(D);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x80) == 128)
        {
            try
            {
                x = Collections.unmodifiableList(x);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x100) == 256)
        {
            try
            {
                u = Collections.unmodifiableList(u);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 8) == 8)
        {
            try
            {
                B = Collections.unmodifiableList(B);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x10) == 16)
        {
            try
            {
                h = Collections.unmodifiableList(h);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        g = fz1.c();
        d();
        throw el1;
        el1;
        i1 = l1;
        j1 = l1;
        throw el1;
        el1;
        i1 = l1;
        j1 = l1;
        throw el1;
        el1;
        k1 = l1;
        i1 = l1;
        j1 = l1;
        throw el1;
        el1;
        i1 = j1;
        throw (new bp(el1.getMessage())).a(this);
        el1;
        k1 = j2;
        i1 = j2;
        j1 = j2;
        throw el1;
        el1;
        k1 = l1;
        i1 = l1;
        j1 = l1;
        throw el1;
        el1;
        k1 = l1;
        i1 = l1;
        j1 = l1;
        throw el1;
        el1;
        k1 = l1;
        i1 = l1;
        j1 = l1;
        throw el1;
        el1;
        k1 = j2;
        i1 = j2;
        j1 = j2;
        throw el1;
        el1;
        k1 = l1;
        i1 = l1;
        j1 = l1;
        throw el1;
        el1;
        k1 = l1;
        i1 = l1;
        j1 = l1;
        throw el1;
        el1;
        k1 = k2;
        i1 = k2;
        j1 = k2;
        throw el1;
        el1;
        k1 = l1;
        i1 = l1;
        j1 = l1;
        throw el1;
        el1;
        k1 = l2;
        i1 = l2;
        j1 = l2;
        throw el1;
_L40:
        i2 = j1;
          goto _L17
_L42:
        obj = null;
          goto _L60
_L36:
        obj = null;
          goto _L61
    }

    dS(eL el1, z z1, dE de1)
    {
        this(el1, z1);
    }

    private dS(ee ee1)
    {
        super(ee1);
        n = -1;
        l = -1;
        g = ee1.c();
    }

    dS(ee ee1, dE de1)
    {
        this(ee1);
    }

    private dS(boolean flag)
    {
        n = -1;
        l = -1;
        g = bR.d();
    }

    static int a(dS ds, int i1)
    {
        ds.v = i1;
        return i1;
    }

    static b a(dS ds, b b1)
    {
        ds.e = b1;
        return b1;
    }

    public static dS a(a3 a3_1)
    {
        return (dS)f.a(a3_1);
    }

    public static dS a(a3 a3_1, z z1)
    {
        return (dS)f.b(a3_1, z1);
    }

    public static dS a(eL el1)
    {
        return (dS)f.a(el1);
    }

    public static dS a(eL el1, z z1)
    {
        return (dS)f.b(el1, z1);
    }

    public static dS a(InputStream inputstream)
    {
        return (dS)f.a(inputstream);
    }

    public static dS a(InputStream inputstream, z z1)
    {
        return (dS)f.a(inputstream, z1);
    }

    public static dS a(byte abyte0[])
    {
        return (dS)f.a(abyte0);
    }

    public static dS a(byte abyte0[], z z1)
    {
        return (dS)f.a(abyte0, z1);
    }

    static de a(dS ds, de de1)
    {
        ds.s = de1;
        return de1;
    }

    static dg a(dS ds, dg dg1)
    {
        ds.m = dg1;
        return dg1;
    }

    static Object a(dS ds, Object obj)
    {
        ds.o = obj;
        return obj;
    }

    static List a(dS ds)
    {
        return ds.u;
    }

    static List a(dS ds, List list)
    {
        ds.u = list;
        return list;
    }

    public static dS b(InputStream inputstream)
    {
        return (dS)f.b(inputstream);
    }

    public static dS b(InputStream inputstream, z z1)
    {
        return (dS)f.b(inputstream, z1);
    }

    static Object b(dS ds, Object obj)
    {
        ds.y = obj;
        return obj;
    }

    static List b(dS ds)
    {
        return ds.h;
    }

    static List b(dS ds, List list)
    {
        ds.F = list;
        return list;
    }

    static List c(dS ds)
    {
        return ds.D;
    }

    static List c(dS ds, List list)
    {
        ds.x = list;
        return list;
    }

    static Object d(dS ds)
    {
        return ds.o;
    }

    static List d(dS ds, List list)
    {
        ds.h = list;
        return list;
    }

    public static eQ e(dS ds)
    {
        return h().a(ds);
    }

    static List e(dS ds, List list)
    {
        ds.B = list;
        return list;
    }

    static Object f(dS ds)
    {
        return ds.y;
    }

    static List f(dS ds, List list)
    {
        ds.D = list;
        return list;
    }

    static List g(dS ds)
    {
        return ds.x;
    }

    public static eQ h()
    {
        return eQ.x();
    }

    static List h(dS ds)
    {
        return ds.B;
    }

    static List i(dS ds)
    {
        return ds.F;
    }

    static b j(dS ds)
    {
        return ds.e;
    }

    public static final cP m()
    {
        return el.C();
    }

    private void s()
    {
        o = "";
        y = "";
        e = fM.a;
        B = Collections.emptyList();
        h = Collections.emptyList();
        F = Collections.emptyList();
        D = Collections.emptyList();
        x = Collections.emptyList();
        u = Collections.emptyList();
        s = de.u();
        m = dg.c();
    }

    public static dS x()
    {
        return z;
    }

    public List A()
    {
        return F;
    }

    public List B()
    {
        return D;
    }

    public boolean C()
    {
        return (v & 4) == 4;
    }

    public List D()
    {
        return u;
    }

    public int E()
    {
        return D.size();
    }

    public boolean F()
    {
        return (v & 1) == 1;
    }

    public List G()
    {
        return D;
    }

    public boolean H()
    {
        return (v & 2) == 2;
    }

    public int I()
    {
        return h.size();
    }

    public de J()
    {
        return s;
    }

    public List K()
    {
        return h;
    }

    public dB a(int i1)
    {
        return (dB)x.get(i1);
    }

    protected eQ a(b4 b4)
    {
        return new eQ(b4, null);
    }

    public eh a()
    {
        return g();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public void a(fa fa1)
    {
        boolean flag = false;
        int k1 = d9.c;
        b();
        if ((v & 1) == 1)
        {
            fa1.d(1, u());
        }
        if ((v & 2) == 2)
        {
            fa1.d(2, b());
        }
        int i1 = 0;
        do
        {
            if (i1 >= e.size())
            {
                break;
            }
            fa1.d(3, e.a(i1));
            i1++;
        } while (k1 == 0);
        i1 = 0;
        do
        {
label0:
            {
                if (i1 < F.size())
                {
                    fa1.d(4, (cR)F.get(i1));
                    if (k1 == 0)
                    {
                        break label0;
                    }
                }
                i1 = 0;
                do
                {
label1:
                    {
                        if (i1 < D.size())
                        {
                            fa1.d(5, (cR)D.get(i1));
                            if (k1 == 0)
                            {
                                break label1;
                            }
                        }
                        i1 = 0;
                        do
                        {
label2:
                            {
                                if (i1 < x.size())
                                {
                                    fa1.d(6, (cR)x.get(i1));
                                    if (k1 == 0)
                                    {
                                        break label2;
                                    }
                                }
                                i1 = 0;
                                do
                                {
label3:
                                    {
                                        if (i1 < u.size())
                                        {
                                            fa1.d(7, (cR)u.get(i1));
                                            if (k1 == 0)
                                            {
                                                break label3;
                                            }
                                        }
                                        if ((v & 4) == 4)
                                        {
                                            fa1.d(8, s);
                                        }
                                        if ((v & 8) == 8)
                                        {
                                            fa1.d(9, m);
                                        }
                                        i1 = 0;
                                        do
                                        {
label4:
                                            {
                                                int j1 = ((flag) ? 1 : 0);
                                                if (i1 < B.size())
                                                {
                                                    fa1.c(10, ((Integer)B.get(i1)).intValue());
                                                    if (k1 == 0)
                                                    {
                                                        break label4;
                                                    }
                                                    j1 = ((flag) ? 1 : 0);
                                                }
                                                do
                                                {
                                                    if (j1 >= h.size())
                                                    {
                                                        break;
                                                    }
                                                    fa1.c(11, ((Integer)h.get(j1)).intValue());
                                                    j1++;
                                                } while (k1 == 0);
                                                c().a(fa1);
                                                return;
                                            }
                                            i1++;
                                        } while (true);
                                    }
                                    i1++;
                                } while (true);
                            }
                            i1++;
                        } while (true);
                    }
                    i1++;
                } while (true);
            }
            i1++;
        } while (true);
    }

    public boolean a()
    {
        return (v & 8) == 8;
    }

    public int b()
    {
        boolean flag = false;
        int k2 = d9.c;
        int i1 = l;
        if (i1 != -1)
        {
            return i1;
        }
        int j1;
        int l1;
        int i2;
        if ((v & 1) == 1)
        {
            i1 = fa.c(1, u()) + 0;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if ((v & 2) == 2)
        {
            j1 = i1 + fa.c(2, b());
        }
        i2 = 0;
        i1 = 0;
        do
        {
            l1 = i1;
            if (i2 >= e.size())
            {
                break;
            }
            l1 = i1 + fa.b(e.a(i2));
            i2++;
            i1 = l1;
        } while (k2 == 0);
        i1 = d().size();
        i2 = 0;
        i1 = j1 + l1 + i1 * 1;
        l1 = i2;
        do
        {
label0:
            {
                int k1 = i1;
                if (l1 < F.size())
                {
                    i1 += fa.c(4, (cR)F.get(l1));
                    if (k2 == 0)
                    {
                        break label0;
                    }
                    k1 = i1;
                }
                l1 = 0;
                do
                {
label1:
                    {
                        i1 = k1;
                        if (l1 < D.size())
                        {
                            i1 = k1 + fa.c(5, (cR)D.get(l1));
                            if (k2 == 0)
                            {
                                break label1;
                            }
                        }
                        l1 = 0;
                        do
                        {
label2:
                            {
                                k1 = i1;
                                if (l1 < x.size())
                                {
                                    i1 += fa.c(6, (cR)x.get(l1));
                                    if (k2 == 0)
                                    {
                                        break label2;
                                    }
                                    k1 = i1;
                                }
                                l1 = 0;
                                do
                                {
label3:
                                    {
                                        i1 = k1;
                                        if (l1 < u.size())
                                        {
                                            i1 = k1 + fa.c(7, (cR)u.get(l1));
                                            if (k2 == 0)
                                            {
                                                break label3;
                                            }
                                        }
                                        k1 = i1;
                                        if ((v & 4) == 4)
                                        {
                                            k1 = i1 + fa.c(8, s);
                                        }
                                        l1 = k1;
                                        if ((v & 8) == 8)
                                        {
                                            l1 = k1 + fa.c(9, m);
                                        }
                                        int j2 = 0;
                                        i1 = 0;
                                        do
                                        {
label4:
                                            {
                                                k1 = i1;
                                                if (j2 < B.size())
                                                {
                                                    i1 += fa.d(((Integer)B.get(j2)).intValue());
                                                    if (k2 == 0)
                                                    {
                                                        break label4;
                                                    }
                                                    k1 = i1;
                                                }
                                                int l2 = i().size();
                                                i1 = 0;
                                                j2 = ((flag) ? 1 : 0);
                                                do
                                                {
                                                    if (j2 >= h.size())
                                                    {
                                                        break;
                                                    }
                                                    i1 = fa.d(((Integer)h.get(j2)).intValue()) + i1;
                                                    j2++;
                                                } while (k2 == 0);
                                                i1 = i1 + (l1 + k1 + l2 * 1) + K().size() * 1 + c().b();
                                                l = i1;
                                                return i1;
                                            }
                                            j2++;
                                        } while (true);
                                    }
                                    l1++;
                                    k1 = i1;
                                } while (true);
                            }
                            l1++;
                        } while (true);
                    }
                    l1++;
                    k1 = i1;
                } while (true);
            }
            l1++;
        } while (true);
    }

    public int b(int i1)
    {
        return ((Integer)B.get(i1)).intValue();
    }

    public P b()
    {
        return q();
    }

    public a3 b()
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

    public fn b()
    {
        return f;
    }

    public final bR c()
    {
        return g;
    }

    public bg c()
    {
        return m;
    }

    public cR c()
    {
        return q();
    }

    public cc c(int i1)
    {
        return (cc)D.get(i1);
    }

    public eh c()
    {
        return j();
    }

    public ga c()
    {
        return j();
    }

    public int d(int i1)
    {
        return ((Integer)h.get(i1)).intValue();
    }

    public ga d()
    {
        return g();
    }

    public List d()
    {
        return e;
    }

    public final boolean d()
    {
        boolean flag = true;
        int j1 = d9.c;
        int i1 = n;
        if (i1 != -1)
        {
            if (i1 != 1)
            {
                flag = false;
            }
            return flag;
        }
        i1 = 0;
        do
        {
            if (i1 >= o())
            {
                break;
            }
            if (!j(i1).d())
            {
                n = 0;
                return false;
            }
            i1++;
        } while (j1 == 0);
        i1 = 0;
        do
        {
            if (i1 >= E())
            {
                break;
            }
            if (!l(i1).d())
            {
                n = 0;
                return false;
            }
            i1++;
        } while (j1 == 0);
        i1 = 0;
        do
        {
            if (i1 >= t())
            {
                break;
            }
            if (!h(i1).d())
            {
                n = 0;
                return false;
            }
            i1++;
        } while (j1 == 0);
        i1 = 0;
        do
        {
            if (i1 >= p())
            {
                break;
            }
            if (!k(i1).d())
            {
                n = 0;
                return false;
            }
            i1++;
        } while (j1 == 0);
        if (C() && !J().d())
        {
            n = 0;
            return false;
        } else
        {
            n = 1;
            return true;
        }
    }

    public a3 e(int i1)
    {
        return e.a(i1);
    }

    protected aH e()
    {
        return el.m().a(com/google/dS, com/google/eQ);
    }

    public dg e()
    {
        return m;
    }

    public f8 f(int i1)
    {
        return (f8)u.get(i1);
    }

    public List f()
    {
        return x;
    }

    public eQ g()
    {
        return h();
    }

    public String g(int i1)
    {
        return (String)e.get(i1);
    }

    public d5 h(int i1)
    {
        return (d5)x.get(i1);
    }

    public e2 i(int i1)
    {
        return (e2)F.get(i1);
    }

    public List i()
    {
        return B;
    }

    public d7 j(int i1)
    {
        return (d7)F.get(i1);
    }

    public eQ j()
    {
        return e(this);
    }

    public int k()
    {
        return B.size();
    }

    public dq k(int i1)
    {
        return (dq)u.get(i1);
    }

    public int l()
    {
        return e.size();
    }

    public dM l(int i1)
    {
        return (dM)D.get(i1);
    }

    public List n()
    {
        return x;
    }

    public int o()
    {
        return F.size();
    }

    public int p()
    {
        return u.size();
    }

    public dS q()
    {
        return z;
    }

    public String r()
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

    public int t()
    {
        return x.size();
    }

    public a3 u()
    {
        Object obj = o;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            o = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public List v()
    {
        return u;
    }

    public List w()
    {
        return F;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    public fE y()
    {
        return s;
    }

    public String z()
    {
        Object obj = o;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            o = s1;
        }
        return s1;
    }

    static 
    {
        z = new dS(true);
        z.s();
    }
}
