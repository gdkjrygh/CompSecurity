// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google:
//            d8, f6, az, bp, 
//            d9, bR, eL, fz, 
//            ee, fn, fk, el, 
//            fa, aH, a3, z, 
//            dE, cP, eh, b4, 
//            P, cR, ga

public final class dP extends d8
    implements f6
{

    public static fn e = new az();
    public static final int g = 2;
    public static final int k = 1;
    private static final dP n;
    private static final long serialVersionUID = 0L;
    private boolean f;
    private byte h;
    private int i;
    private final bR j;
    private Object l;
    private int m;

    private dP(eL el1, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = d9.c;
        super();
        h = -1;
        i = -1;
        b();
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
    //                   10: 108
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
        m = m | 1;
        l = el1.x();
        flag = flag1;
        if (i1 == 0) goto _L6; else goto _L9
_L9:
        flag2 = flag1;
_L4:
        m = m | 2;
        f = el1.g();
        flag = flag2;
_L6:
        if (i1 == 0) goto _L11; else goto _L10
_L10:
        j = fz1.c();
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
        j = fz1.c();
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

    dP(eL el1, z z, dE de)
    {
        this(el1, z);
    }

    private dP(ee ee1)
    {
        super(ee1);
        h = -1;
        i = -1;
        j = ee1.c();
    }

    dP(ee ee1, dE de)
    {
        this(ee1);
    }

    private dP(boolean flag)
    {
        h = -1;
        i = -1;
        j = bR.d();
    }

    static int a(dP dp, int i1)
    {
        dp.m = i1;
        return i1;
    }

    public static dP a(a3 a3_1)
    {
        return (dP)e.a(a3_1);
    }

    public static dP a(a3 a3_1, z z)
    {
        return (dP)e.b(a3_1, z);
    }

    public static dP a(eL el1)
    {
        return (dP)e.a(el1);
    }

    public static dP a(eL el1, z z)
    {
        return (dP)e.b(el1, z);
    }

    public static dP a(InputStream inputstream)
    {
        return (dP)e.b(inputstream);
    }

    public static dP a(InputStream inputstream, z z)
    {
        return (dP)e.b(inputstream, z);
    }

    public static dP a(byte abyte0[])
    {
        return (dP)e.a(abyte0);
    }

    public static dP a(byte abyte0[], z z)
    {
        return (dP)e.a(abyte0, z);
    }

    public static fk a(dP dp)
    {
        return d().a(dp);
    }

    static Object a(dP dp, Object obj)
    {
        dp.l = obj;
        return obj;
    }

    static boolean a(dP dp, boolean flag)
    {
        dp.f = flag;
        return flag;
    }

    public static dP b(InputStream inputstream)
    {
        return (dP)e.a(inputstream);
    }

    public static dP b(InputStream inputstream, z z)
    {
        return (dP)e.a(inputstream, z);
    }

    static Object b(dP dp)
    {
        return dp.l;
    }

    private void b()
    {
        l = "";
        f = false;
    }

    public static fk d()
    {
        return fk.e();
    }

    public static final cP i()
    {
        return el.w();
    }

    public static dP k()
    {
        return n;
    }

    public eh a()
    {
        return g();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected fk a(b4 b4)
    {
        return new fk(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((m & 1) == 1)
        {
            fa1.d(1, h());
        }
        if ((m & 2) == 2)
        {
            fa1.a(2, f);
        }
        c().a(fa1);
    }

    public boolean a()
    {
        return (m & 2) == 2;
    }

    public int b()
    {
        int i1 = i;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        if ((m & 1) == 1)
        {
            i1 = 0 + fa.c(1, h());
        }
        int j1 = i1;
        if ((m & 2) == 2)
        {
            j1 = i1 + fa.b(2, f);
        }
        i1 = j1 + c().b();
        i = i1;
        return i1;
    }

    public P b()
    {
        return c();
    }

    public fn b()
    {
        return e;
    }

    public final bR c()
    {
        return j;
    }

    public cR c()
    {
        return c();
    }

    public dP c()
    {
        return n;
    }

    public eh c()
    {
        return j();
    }

    public ga c()
    {
        return j();
    }

    public ga d()
    {
        return g();
    }

    public final boolean d()
    {
        byte byte0 = h;
        if (byte0 != -1)
        {
            return byte0 == 1;
        }
        if (!e())
        {
            h = 0;
            return false;
        }
        if (!a())
        {
            h = 0;
            return false;
        } else
        {
            h = 1;
            return true;
        }
    }

    protected aH e()
    {
        return el.v().a(com/google/dP, com/google/fk);
    }

    public boolean e()
    {
        return (m & 1) == 1;
    }

    public boolean f()
    {
        return f;
    }

    public fk g()
    {
        return d();
    }

    public a3 h()
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

    public fk j()
    {
        return a(this);
    }

    public String l()
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

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        n = new dP(true);
        n.b();
    }
}
