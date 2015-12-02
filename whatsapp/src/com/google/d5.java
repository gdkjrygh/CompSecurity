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
//            d8, dB, aw, bp, 
//            d9, bR, eL, d4, 
//            d_, fY, fz, ee, 
//            fn, eE, el, fa, 
//            cR, f7, aH, a3, 
//            z, dE, cP, b4, 
//            eh, P, ga, g2

public final class d5 extends d8
    implements dB
{

    private static final d5 h;
    public static final int k = 3;
    public static final int l = 1;
    public static fn m = new aw();
    public static final int n = 2;
    private static final long serialVersionUID = 0L;
    private int e;
    private Object f;
    private byte g;
    private List i;
    private final bR j;
    private int o;
    private d_ p;

    private d5(eL el1, z z)
    {
        fz fz1;
        int i1;
        int j1;
        int l2;
        j1 = 0;
        l2 = d9.c;
        super();
        g = -1;
        o = -1;
        e();
        fz1 = bR.a();
        i1 = 0;
_L19:
        int l1 = i1;
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        int i2;
        int j2;
        j2 = i1;
        l1 = i1;
        i2 = i1;
        int i3 = el1.f();
        int k1;
        int k2;
        k1 = i1;
        k2 = j1;
        i3;
        JVM INSTR lookupswitch 4: default 112
    //                   0: 458
    //                   10: 631
    //                   18: 624
    //                   26: 288;
           goto _L3 _L4 _L5 _L6 _L7
_L5:
        break MISSING_BLOCK_LABEL_631;
_L3:
        k1 = j1;
_L18:
        l1 = i1;
        i2 = i1;
        boolean flag = a(el1, fz1, z, i3);
        l1 = i1;
        if (flag) goto _L9; else goto _L8
_L8:
        if (l2 == 0) goto _L11; else goto _L10
_L10:
        k2 = 1;
_L21:
        l1 = i1;
        i2 = i1;
        e = e | 1;
        l1 = i1;
        i2 = i1;
        f = el1.x();
        k1 = k2;
        l1 = i1;
        if (l2 == 0) goto _L9; else goto _L12
_L12:
        j1 = i1;
        if ((i1 & 2) == 2)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        j2 = i1;
        l1 = i1;
        i2 = i1;
        i = new ArrayList();
        j1 = i1 | 2;
        j2 = j1;
        l1 = j1;
        i2 = j1;
        i.add(el1.a(d4.l, z));
        k1 = k2;
        l1 = j1;
        if (l2 == 0) goto _L9; else goto _L13
_L13:
        k1 = j1;
_L7:
        j2 = k1;
        l1 = k1;
        i2 = k1;
        if ((e & 2) != 2) goto _L15; else goto _L14
_L14:
        j2 = k1;
        l1 = k1;
        i2 = k1;
        fY fy = p.a();
_L20:
        l1 = k1;
        i2 = k1;
        p = (d_)el1.a(d_.k, z);
        if (fy == null)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        l1 = k1;
        i2 = k1;
        fy.a(p);
        l1 = k1;
        i2 = k1;
        p = fy.f();
        j2 = k1;
        l1 = k1;
        i2 = k1;
        e = e | 2;
        l1 = k1;
        k1 = k2;
_L9:
        if (l2 == 0) goto _L16; else goto _L2
_L2:
        if ((l1 & 2) == 2)
        {
            try
            {
                i = Collections.unmodifiableList(i);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        j = fz1.c();
        d();
        return;
_L4:
        if (l2 == 0) goto _L11; else goto _L17
_L17:
        k1 = 1;
          goto _L18
        el1;
        j2 = i1;
        l1 = i1;
        i2 = i1;
        throw el1;
        el1;
        l1 = j2;
        throw el1.a(this);
        el1;
        if ((l1 & 2) == 2)
        {
            try
            {
                i = Collections.unmodifiableList(i);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        j = fz1.c();
        d();
        throw el1;
        el1;
        l1 = i1;
        i2 = i1;
        throw el1;
        el1;
        j2 = i1;
        l1 = i1;
        i2 = i1;
        throw el1;
        el1;
        l1 = i2;
        throw (new bp(el1.getMessage())).a(this);
        el1;
        j2 = k1;
        l1 = k1;
        i2 = k1;
        throw el1;
_L16:
        j1 = k1;
        i1 = l1;
          goto _L19
_L15:
        fy = null;
          goto _L20
_L11:
        k1 = 1;
        l1 = i1;
          goto _L9
_L6:
        k2 = j1;
          goto _L12
        k2 = j1;
          goto _L21
    }

    d5(eL el1, z z, dE de)
    {
        this(el1, z);
    }

    private d5(ee ee1)
    {
        super(ee1);
        g = -1;
        o = -1;
        j = ee1.c();
    }

    d5(ee ee1, dE de)
    {
        this(ee1);
    }

    private d5(boolean flag)
    {
        g = -1;
        o = -1;
        j = bR.d();
    }

    static int a(d5 d5_1, int i1)
    {
        d5_1.e = i1;
        return i1;
    }

    public static d5 a(a3 a3_1)
    {
        return (d5)m.a(a3_1);
    }

    public static d5 a(a3 a3_1, z z)
    {
        return (d5)m.b(a3_1, z);
    }

    public static d5 a(eL el1)
    {
        return (d5)m.a(el1);
    }

    public static d5 a(eL el1, z z)
    {
        return (d5)m.b(el1, z);
    }

    public static d5 a(InputStream inputstream)
    {
        return (d5)m.b(inputstream);
    }

    public static d5 a(InputStream inputstream, z z)
    {
        return (d5)m.b(inputstream, z);
    }

    public static d5 a(byte abyte0[])
    {
        return (d5)m.a(abyte0);
    }

    public static d5 a(byte abyte0[], z z)
    {
        return (d5)m.a(abyte0, z);
    }

    static d_ a(d5 d5_1, d_ d_1)
    {
        d5_1.p = d_1;
        return d_1;
    }

    public static eE a(d5 d5_1)
    {
        return b().a(d5_1);
    }

    static Object a(d5 d5_1, Object obj)
    {
        d5_1.f = obj;
        return obj;
    }

    static List a(d5 d5_1, List list)
    {
        d5_1.i = list;
        return list;
    }

    public static d5 b(InputStream inputstream)
    {
        return (d5)m.a(inputstream);
    }

    public static d5 b(InputStream inputstream, z z)
    {
        return (d5)m.a(inputstream, z);
    }

    public static eE b()
    {
        return eE.a();
    }

    static List b(d5 d5_1)
    {
        return d5_1.i;
    }

    static Object c(d5 d5_1)
    {
        return d5_1.f;
    }

    private void e()
    {
        f = "";
        i = Collections.emptyList();
        p = d_.c();
    }

    public static final cP j()
    {
        return el.L();
    }

    public static d5 n()
    {
        return h;
    }

    public int a()
    {
        return i.size();
    }

    public d4 a(int i1)
    {
        return (d4)i.get(i1);
    }

    protected eE a(b4 b4)
    {
        return new eE(b4, null);
    }

    public eh a()
    {
        return o();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public void a(fa fa1)
    {
        int j1 = d9.c;
        b();
        if ((e & 1) == 1)
        {
            fa1.d(1, p());
        }
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < i.size())
                {
                    fa1.d(2, (cR)i.get(i1));
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                if ((e & 2) == 2)
                {
                    fa1.d(3, p);
                }
                c().a(fa1);
                return;
            }
            i1++;
        } while (true);
    }

    public int b()
    {
        int j1 = 0;
        int k1 = d9.c;
        int i1 = o;
        if (i1 != -1)
        {
            return i1;
        }
        if ((e & 1) == 1)
        {
            i1 = fa.c(1, p()) + 0;
        } else
        {
            i1 = 0;
        }
        do
        {
            if (j1 >= i.size())
            {
                break;
            }
            i1 = fa.c(2, (cR)i.get(j1)) + i1;
            j1++;
        } while (k1 == 0);
        j1 = i1;
        if ((e & 2) == 2)
        {
            j1 = i1 + fa.c(3, p);
        }
        i1 = j1 + c().b();
        o = i1;
        return i1;
    }

    public P b()
    {
        return q();
    }

    public f7 b(int i1)
    {
        return (f7)i.get(i1);
    }

    public fn b()
    {
        return m;
    }

    public final bR c()
    {
        return j;
    }

    public cR c()
    {
        return q();
    }

    public eE c()
    {
        return a(this);
    }

    public eh c()
    {
        return c();
    }

    public ga c()
    {
        return c();
    }

    public ga d()
    {
        return o();
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
            if (i1 >= a())
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
        if (k() && !h().d())
        {
            g = 0;
            return false;
        } else
        {
            g = 1;
            return true;
        }
    }

    protected aH e()
    {
        return el.B().a(com/google/d5, com/google/eE);
    }

    public String f()
    {
        Object obj = f;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            f = s;
        }
        return s;
    }

    public List g()
    {
        return i;
    }

    public d_ h()
    {
        return p;
    }

    public boolean i()
    {
        return (e & 1) == 1;
    }

    public boolean k()
    {
        return (e & 2) == 2;
    }

    public g2 l()
    {
        return p;
    }

    public List m()
    {
        return i;
    }

    public eE o()
    {
        return b();
    }

    public a3 p()
    {
        Object obj = f;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            f = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public d5 q()
    {
        return h;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        h = new d5(true);
        h.e();
    }
}
