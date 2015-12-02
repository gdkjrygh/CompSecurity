// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google:
//            d8, aa, aA, bp, 
//            d9, bR, eL, dK, 
//            ft, fz, ee, fn, 
//            eR, el, fa, aH, 
//            a3, z, dE, cP, 
//            b4, eh, P, cR, 
//            ga, e6

public final class dD extends d8
    implements aa
{

    public static final int f = 3;
    public static final int h = 2;
    public static fn j = new aA();
    private static final dD k;
    public static final int p = 1;
    private static final long serialVersionUID = 0L;
    private int e;
    private byte g;
    private final bR i;
    private Object l;
    private int m;
    private dK n;
    private int o;

    private dD(eL el1, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = d9.c;
        super();
        g = -1;
        m = -1;
        n();
        fz1 = bR.a();
        flag = false;
_L14:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = el1.f();
        boolean flag1 = flag;
        j1;
        JVM INSTR lookupswitch 4: default 92
    //                   0: 258
    //                   10: 342
    //                   16: 335
    //                   26: 171;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        boolean flag2 = a(el1, fz1, z, j1);
        if (flag2) goto _L7; else goto _L6
_L6:
        if (i1 == 0) goto _L9; else goto _L8
_L8:
        flag1 = true;
_L17:
        o = o | 1;
        l = el1.x();
        flag = flag1;
        if (i1 == 0) goto _L7; else goto _L10
_L10:
        o = o | 2;
        e = el1.c();
        flag = flag1;
        if (i1 == 0) goto _L7; else goto _L5
_L5:
        if ((o & 4) != 4) goto _L12; else goto _L11
_L11:
        ft ft1 = n.j();
_L16:
        n = (dK)el1.a(dK.l, z);
        if (ft1 == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        ft1.a(n);
        n = ft1.n();
        o = o | 4;
        flag = flag1;
_L7:
        if (i1 == 0) goto _L14; else goto _L13
_L13:
        i = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L9; else goto _L15
_L15:
        flag = true;
          goto _L1
        el1;
        throw el1;
        el1;
        throw el1.a(this);
        el1;
        i = fz1.c();
        d();
        throw el1;
        el1;
        throw el1;
        el1;
        throw el1;
        el1;
        throw (new bp(el1.getMessage())).a(this);
        el1;
        throw el1;
_L12:
        ft1 = null;
          goto _L16
_L9:
        flag = true;
          goto _L7
_L4:
        flag1 = flag;
          goto _L10
_L3:
        flag1 = flag;
          goto _L17
    }

    dD(eL el1, z z, dE de)
    {
        this(el1, z);
    }

    private dD(ee ee1)
    {
        super(ee1);
        g = -1;
        m = -1;
        i = ee1.c();
    }

    dD(ee ee1, dE de)
    {
        this(ee1);
    }

    private dD(boolean flag)
    {
        g = -1;
        m = -1;
        i = bR.d();
    }

    static int a(dD dd, int i1)
    {
        dd.e = i1;
        return i1;
    }

    public static dD a(a3 a3_1)
    {
        return (dD)j.a(a3_1);
    }

    public static dD a(a3 a3_1, z z)
    {
        return (dD)j.b(a3_1, z);
    }

    public static dD a(eL el1)
    {
        return (dD)j.a(el1);
    }

    public static dD a(eL el1, z z)
    {
        return (dD)j.b(el1, z);
    }

    public static dD a(InputStream inputstream)
    {
        return (dD)j.a(inputstream);
    }

    public static dD a(InputStream inputstream, z z)
    {
        return (dD)j.a(inputstream, z);
    }

    public static dD a(byte abyte0[])
    {
        return (dD)j.a(abyte0);
    }

    public static dD a(byte abyte0[], z z)
    {
        return (dD)j.a(abyte0, z);
    }

    static dK a(dD dd, dK dk)
    {
        dd.n = dk;
        return dk;
    }

    public static eR a()
    {
        return eR.b();
    }

    static Object a(dD dd)
    {
        return dd.l;
    }

    static Object a(dD dd, Object obj)
    {
        dd.l = obj;
        return obj;
    }

    static int b(dD dd, int i1)
    {
        dd.o = i1;
        return i1;
    }

    public static dD b(InputStream inputstream)
    {
        return (dD)j.b(inputstream);
    }

    public static dD b(InputStream inputstream, z z)
    {
        return (dD)j.b(inputstream, z);
    }

    public static eR b(dD dd)
    {
        return a().a(dd);
    }

    private void n()
    {
        l = "";
        e = 0;
        n = dK.h();
    }

    public static final cP o()
    {
        return el.G();
    }

    public static dD p()
    {
        return k;
    }

    protected eR a(b4 b4)
    {
        return new eR(b4, null);
    }

    public eh a()
    {
        return i();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public void a(fa fa1)
    {
        b();
        if ((o & 1) == 1)
        {
            fa1.d(1, m());
        }
        if ((o & 2) == 2)
        {
            fa1.c(2, e);
        }
        if ((o & 4) == 4)
        {
            fa1.d(3, n);
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
        if ((o & 1) == 1)
        {
            j1 = 0 + fa.c(1, m());
        }
        i1 = j1;
        if ((o & 2) == 2)
        {
            i1 = j1 + fa.h(2, e);
        }
        j1 = i1;
        if ((o & 4) == 4)
        {
            j1 = i1 + fa.c(3, n);
        }
        i1 = j1 + c().b();
        m = i1;
        return i1;
    }

    public P b()
    {
        return k();
    }

    public eR b()
    {
        return b(this);
    }

    public fn b()
    {
        return j;
    }

    public final bR c()
    {
        return i;
    }

    public cR c()
    {
        return k();
    }

    public eh c()
    {
        return b();
    }

    public ga c()
    {
        return b();
    }

    public boolean c()
    {
        return (o & 4) == 4;
    }

    public ga d()
    {
        return i();
    }

    public final boolean d()
    {
        byte byte0 = g;
        if (byte0 != -1)
        {
            return byte0 == 1;
        }
        if (c() && !l().d())
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
        return el.I().a(com/google/dD, com/google/eR);
    }

    public boolean e()
    {
        return (o & 2) == 2;
    }

    public boolean f()
    {
        return (o & 1) == 1;
    }

    public int g()
    {
        return e;
    }

    public e6 h()
    {
        return n;
    }

    public eR i()
    {
        return a();
    }

    public String j()
    {
        Object obj = l;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            l = s;
        }
        return s;
    }

    public dD k()
    {
        return k;
    }

    public dK l()
    {
        return n;
    }

    public a3 m()
    {
        Object obj = l;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            l = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        k = new dD(true);
        k.n();
    }
}
