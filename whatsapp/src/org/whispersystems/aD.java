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
//            N, s, d, aI, 
//            ap

public final class aD extends d8
    implements N
{

    public static final int h = 4;
    public static final int i = 2;
    public static final int j = 1;
    private static final aD k;
    public static final int n = 3;
    public static fn o = new s();
    private static final long serialVersionUID = 0L;
    private int e;
    private a3 f;
    private int g;
    private a3 l;
    private final bR m;
    private int p;
    private int q;
    private byte r;

    private aD(eL el, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = d.a;
        super();
        r = -1;
        p = -1;
        f();
        fz1 = bR.a();
        flag = false;
_L15:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = el.f();
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag1 = flag;
        flag2 = flag;
        flag3 = flag;
        flag4 = flag;
        j1;
        JVM INSTR lookupswitch 5: default 108
    //                   0: 266
    //                   10: 132
    //                   16: 163
    //                   24: 194
    //                   34: 225;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        boolean flag5 = a(el, fz1, z, j1);
        if (flag5) goto _L8; else goto _L7
_L7:
        if (i1 == 0) goto _L10; else goto _L9
_L9:
        flag1 = true;
_L3:
        e = e | 1;
        f = el.x();
        flag = flag1;
        if (i1 == 0) goto _L8; else goto _L11
_L11:
        flag2 = flag1;
_L4:
        e = e | 2;
        q = el.a();
        flag = flag2;
        if (i1 == 0) goto _L8; else goto _L12
_L12:
        flag3 = flag2;
_L5:
        e = e | 4;
        g = el.a();
        flag = flag3;
        if (i1 == 0) goto _L8; else goto _L13
_L13:
        flag4 = flag3;
_L6:
        e = e | 8;
        l = el.x();
        flag = flag4;
_L8:
        if (i1 == 0) goto _L15; else goto _L14
_L14:
        m = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L10; else goto _L16
_L16:
        flag = true;
          goto _L1
        el;
        throw el;
        el;
        throw el.a(this);
        el;
        m = fz1.c();
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
        throw (new bp(el.getMessage())).a(this);
_L10:
        flag = true;
          goto _L8
    }

    aD(eL el, z z, ap ap)
    {
        this(el, z);
    }

    private aD(ee ee1)
    {
        super(ee1);
        r = -1;
        p = -1;
        m = ee1.c();
    }

    aD(ee ee1, ap ap)
    {
        this(ee1);
    }

    private aD(boolean flag)
    {
        r = -1;
        p = -1;
        m = bR.d();
    }

    static int a(aD ad, int i1)
    {
        ad.q = i1;
        return i1;
    }

    static a3 a(aD ad, a3 a3_1)
    {
        ad.f = a3_1;
        return a3_1;
    }

    public static aD a(a3 a3_1)
    {
        return (aD)o.a(a3_1);
    }

    public static aD a(a3 a3_1, z z)
    {
        return (aD)o.b(a3_1, z);
    }

    public static aD a(eL el)
    {
        return (aD)o.a(el);
    }

    public static aD a(eL el, z z)
    {
        return (aD)o.b(el, z);
    }

    public static aD a(InputStream inputstream)
    {
        return (aD)o.b(inputstream);
    }

    public static aD a(InputStream inputstream, z z)
    {
        return (aD)o.a(inputstream, z);
    }

    public static aD a(byte abyte0[])
    {
        return (aD)o.a(abyte0);
    }

    public static aD a(byte abyte0[], z z)
    {
        return (aD)o.a(abyte0, z);
    }

    public static aI a()
    {
        return aI.b();
    }

    public static aI a(aD ad)
    {
        return a().a(ad);
    }

    static int b(aD ad, int i1)
    {
        ad.g = i1;
        return i1;
    }

    static a3 b(aD ad, a3 a3_1)
    {
        ad.l = a3_1;
        return a3_1;
    }

    public static aD b(InputStream inputstream)
    {
        return (aD)o.a(inputstream);
    }

    public static aD b(InputStream inputstream, z z)
    {
        return (aD)o.b(inputstream, z);
    }

    static int c(aD ad, int i1)
    {
        ad.e = i1;
        return i1;
    }

    public static final cP d()
    {
        return org.whispersystems.d.k();
    }

    private void f()
    {
        f = a3.b;
        q = 0;
        g = 0;
        l = a3.b;
    }

    static boolean i()
    {
        return d;
    }

    public static aD q()
    {
        return k;
    }

    public eh a()
    {
        return e();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected aI a(b4 b4)
    {
        return new aI(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((e & 1) == 1)
        {
            fa1.d(1, f);
        }
        if ((e & 2) == 2)
        {
            fa1.i(2, q);
        }
        if ((e & 4) == 4)
        {
            fa1.i(3, g);
        }
        if ((e & 8) == 8)
        {
            fa1.d(4, l);
        }
        c().a(fa1);
    }

    public int b()
    {
        int i1 = p;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((e & 1) == 1)
        {
            j1 = 0 + fa.c(1, f);
        }
        i1 = j1;
        if ((e & 2) == 2)
        {
            i1 = j1 + fa.g(2, q);
        }
        j1 = i1;
        if ((e & 4) == 4)
        {
            j1 = i1 + fa.g(3, g);
        }
        i1 = j1;
        if ((e & 8) == 8)
        {
            i1 = j1 + fa.c(4, l);
        }
        i1 += c().b();
        p = i1;
        return i1;
    }

    public P b()
    {
        return h();
    }

    public fn b()
    {
        return o;
    }

    public int c()
    {
        return q;
    }

    public final bR c()
    {
        return m;
    }

    public cR c()
    {
        return h();
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
        return e();
    }

    public final boolean d()
    {
        byte byte0 = r;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            r = 1;
            return true;
        }
    }

    protected aH e()
    {
        return org.whispersystems.d.i().a(org/whispersystems/aD, org/whispersystems/aI);
    }

    public aI e()
    {
        return a();
    }

    public boolean g()
    {
        return (e & 1) == 1;
    }

    public aD h()
    {
        return k;
    }

    public a3 j()
    {
        return l;
    }

    public aI k()
    {
        return a(this);
    }

    public boolean l()
    {
        return (e & 8) == 8;
    }

    public int m()
    {
        return g;
    }

    public boolean n()
    {
        return (e & 2) == 2;
    }

    public a3 o()
    {
        return f;
    }

    public boolean p()
    {
        return (e & 4) == 4;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        k = new aD(true);
        k.f();
    }
}
