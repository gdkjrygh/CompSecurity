// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google:
//            d8, b7, a9, bp, 
//            d9, bR, eL, fz, 
//            ee, fn, eG, el, 
//            fa, aH, z, dE, 
//            a3, cP, b4, eh, 
//            P, cR, ga

public final class dA extends d8
    implements b7
{

    public static final int i = 1;
    public static final int k = 2;
    public static fn m = new a9();
    private static final dA n;
    private static final long serialVersionUID = 0L;
    private int e;
    private int f;
    private final bR g;
    private int h;
    private int j;
    private byte l;

    private dA(eL el1, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = d9.c;
        super();
        l = -1;
        f = -1;
        h();
        fz1 = bR.a();
        flag = false;
_L11:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = el1.f();
        boolean flag1;
        boolean flag2;
        flag1 = flag;
        flag2 = flag;
        j1;
        JVM INSTR lookupswitch 3: default 84
    //                   0: 179
    //                   8: 108
    //                   16: 139;
           goto _L1 _L2 _L3 _L4
_L1:
        boolean flag3 = a(el1, fz1, z, j1);
        if (flag3) goto _L6; else goto _L5
_L5:
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        flag1 = true;
_L3:
        e = e | 1;
        h = el1.c();
        flag = flag1;
        if (i1 == 0) goto _L6; else goto _L9
_L9:
        flag2 = flag1;
_L4:
        e = e | 2;
        j = el1.c();
        flag = flag2;
_L6:
        if (i1 == 0) goto _L11; else goto _L10
_L10:
        g = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L8; else goto _L12
_L12:
        flag = true;
          goto _L1
        el1;
        throw el1;
        el1;
        throw el1.a(this);
        el1;
        g = fz1.c();
        d();
        throw el1;
        el1;
        throw el1;
        el1;
        throw el1;
        el1;
        throw (new bp(el1.getMessage())).a(this);
_L8:
        flag = true;
          goto _L6
    }

    dA(eL el1, z z, dE de)
    {
        this(el1, z);
    }

    private dA(ee ee1)
    {
        super(ee1);
        l = -1;
        f = -1;
        g = ee1.c();
    }

    dA(ee ee1, dE de)
    {
        this(ee1);
    }

    private dA(boolean flag)
    {
        l = -1;
        f = -1;
        g = bR.d();
    }

    static int a(dA da, int i1)
    {
        da.j = i1;
        return i1;
    }

    public static dA a(a3 a3)
    {
        return (dA)m.a(a3);
    }

    public static dA a(a3 a3, z z)
    {
        return (dA)m.b(a3, z);
    }

    public static dA a(eL el1)
    {
        return (dA)m.a(el1);
    }

    public static dA a(eL el1, z z)
    {
        return (dA)m.b(el1, z);
    }

    public static dA a(InputStream inputstream)
    {
        return (dA)m.a(inputstream);
    }

    public static dA a(InputStream inputstream, z z)
    {
        return (dA)m.b(inputstream, z);
    }

    public static dA a(byte abyte0[])
    {
        return (dA)m.a(abyte0);
    }

    public static dA a(byte abyte0[], z z)
    {
        return (dA)m.a(abyte0, z);
    }

    public static eG a(dA da)
    {
        return f().a(da);
    }

    static int b(dA da, int i1)
    {
        da.h = i1;
        return i1;
    }

    public static dA b(InputStream inputstream)
    {
        return (dA)m.b(inputstream);
    }

    public static dA b(InputStream inputstream, z z)
    {
        return (dA)m.a(inputstream, z);
    }

    static int c(dA da, int i1)
    {
        da.e = i1;
        return i1;
    }

    public static eG f()
    {
        return eG.f();
    }

    public static dA g()
    {
        return n;
    }

    private void h()
    {
        h = 0;
        j = 0;
    }

    public static final cP j()
    {
        return el.y();
    }

    public int a()
    {
        return j;
    }

    protected eG a(b4 b4)
    {
        return new eG(b4, null);
    }

    public eh a()
    {
        return c();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public void a(fa fa1)
    {
        b();
        if ((e & 1) == 1)
        {
            fa1.c(1, h);
        }
        if ((e & 2) == 2)
        {
            fa1.c(2, j);
        }
        c().a(fa1);
    }

    public int b()
    {
        int i1 = f;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        if ((e & 1) == 1)
        {
            i1 = 0 + fa.h(1, h);
        }
        int j1 = i1;
        if ((e & 2) == 2)
        {
            j1 = i1 + fa.h(2, j);
        }
        i1 = j1 + c().b();
        f = i1;
        return i1;
    }

    public P b()
    {
        return d();
    }

    public eG b()
    {
        return a(this);
    }

    public fn b()
    {
        return m;
    }

    public final bR c()
    {
        return g;
    }

    public cR c()
    {
        return d();
    }

    public eG c()
    {
        return f();
    }

    public eh c()
    {
        return b();
    }

    public ga c()
    {
        return b();
    }

    public dA d()
    {
        return n;
    }

    public ga d()
    {
        return c();
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
        return el.K().a(com/google/dA, com/google/eG);
    }

    public boolean e()
    {
        return (e & 2) == 2;
    }

    public int i()
    {
        return h;
    }

    public boolean k()
    {
        return (e & 1) == 1;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        n = new dA(true);
        n.h();
    }
}
