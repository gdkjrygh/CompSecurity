// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google:
//            d8, f7, ag, bp, 
//            d9, bR, eL, dG, 
//            fh, fz, ee, fn, 
//            ey, el, fa, a3, 
//            aH, z, dE, cP, 
//            eh, b4, P, b0, 
//            cR, ga

public final class d4 extends d8
    implements f7
{

    public static final int h = 2;
    public static final int j = 1;
    public static final int k = 4;
    public static fn l = new ag();
    private static final d4 m;
    public static final int q = 3;
    private static final long serialVersionUID = 0L;
    private Object e;
    private dG f;
    private Object g;
    private int i;
    private byte n;
    private int o;
    private Object p;
    private final bR r;

    private d4(eL el1, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = d9.c;
        super();
        n = -1;
        o = -1;
        a();
        fz1 = bR.a();
        flag = false;
_L16:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = el1.f();
        boolean flag1 = flag;
        j1;
        JVM INSTR lookupswitch 5: default 100
    //                   0: 296
    //                   10: 390
    //                   18: 383
    //                   26: 376
    //                   34: 206;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        boolean flag2 = a(el1, fz1, z, j1);
        if (flag2) goto _L8; else goto _L7
_L7:
        if (i1 == 0) goto _L10; else goto _L9
_L9:
        flag1 = true;
_L19:
        i = i | 1;
        p = el1.x();
        flag = flag1;
        if (i1 == 0) goto _L8; else goto _L11
_L11:
        i = i | 2;
        g = el1.x();
        flag = flag1;
        if (i1 == 0) goto _L8; else goto _L12
_L12:
        i = i | 4;
        e = el1.x();
        flag = flag1;
        if (i1 == 0) goto _L8; else goto _L6
_L6:
        if ((i & 8) != 8) goto _L14; else goto _L13
_L13:
        fh fh1 = f.i();
_L18:
        f = (dG)el1.a(dG.f, z);
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        fh1.a(f);
        f = fh1.b();
        i = i | 8;
        flag = flag1;
_L8:
        if (i1 == 0) goto _L16; else goto _L15
_L15:
        r = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L10; else goto _L17
_L17:
        flag = true;
          goto _L1
        el1;
        throw el1;
        el1;
        throw el1.a(this);
        el1;
        r = fz1.c();
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
_L14:
        fh1 = null;
          goto _L18
_L10:
        flag = true;
          goto _L8
_L5:
        flag1 = flag;
          goto _L12
_L4:
        flag1 = flag;
          goto _L11
_L3:
        flag1 = flag;
          goto _L19
    }

    d4(eL el1, z z, dE de)
    {
        this(el1, z);
    }

    private d4(ee ee1)
    {
        super(ee1);
        n = -1;
        o = -1;
        r = ee1.c();
    }

    d4(ee ee1, dE de)
    {
        this(ee1);
    }

    private d4(boolean flag)
    {
        n = -1;
        o = -1;
        r = bR.d();
    }

    static int a(d4 d4_1, int i1)
    {
        d4_1.i = i1;
        return i1;
    }

    public static d4 a(a3 a3_1)
    {
        return (d4)l.a(a3_1);
    }

    public static d4 a(a3 a3_1, z z)
    {
        return (d4)l.b(a3_1, z);
    }

    public static d4 a(eL el1)
    {
        return (d4)l.a(el1);
    }

    public static d4 a(eL el1, z z)
    {
        return (d4)l.b(el1, z);
    }

    public static d4 a(InputStream inputstream)
    {
        return (d4)l.a(inputstream);
    }

    public static d4 a(InputStream inputstream, z z)
    {
        return (d4)l.b(inputstream, z);
    }

    public static d4 a(byte abyte0[])
    {
        return (d4)l.a(abyte0);
    }

    public static d4 a(byte abyte0[], z z)
    {
        return (d4)l.a(abyte0, z);
    }

    static dG a(d4 d4_1, dG dg)
    {
        d4_1.f = dg;
        return dg;
    }

    public static ey a(d4 d4_1)
    {
        return g().a(d4_1);
    }

    static Object a(d4 d4_1, Object obj)
    {
        d4_1.p = obj;
        return obj;
    }

    private void a()
    {
        p = "";
        g = "";
        e = "";
        f = dG.f();
    }

    public static d4 b(InputStream inputstream)
    {
        return (d4)l.b(inputstream);
    }

    public static d4 b(InputStream inputstream, z z)
    {
        return (d4)l.a(inputstream, z);
    }

    static Object b(d4 d4_1)
    {
        return d4_1.p;
    }

    static Object b(d4 d4_1, Object obj)
    {
        d4_1.g = obj;
        return obj;
    }

    static Object c(d4 d4_1)
    {
        return d4_1.g;
    }

    static Object c(d4 d4_1, Object obj)
    {
        d4_1.e = obj;
        return obj;
    }

    static Object d(d4 d4_1)
    {
        return d4_1.e;
    }

    public static final cP e()
    {
        return el.D();
    }

    public static ey g()
    {
        return ey.f();
    }

    public static d4 n()
    {
        return m;
    }

    public eh a()
    {
        return s();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected ey a(b4 b4)
    {
        return new ey(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((i & 1) == 1)
        {
            fa1.d(1, f());
        }
        if ((i & 2) == 2)
        {
            fa1.d(2, k());
        }
        if ((i & 4) == 4)
        {
            fa1.d(3, h());
        }
        if ((i & 8) == 8)
        {
            fa1.d(4, f);
        }
        c().a(fa1);
    }

    public int b()
    {
        int i1 = o;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((i & 1) == 1)
        {
            j1 = 0 + fa.c(1, f());
        }
        i1 = j1;
        if ((i & 2) == 2)
        {
            i1 = j1 + fa.c(2, k());
        }
        j1 = i1;
        if ((i & 4) == 4)
        {
            j1 = i1 + fa.c(3, h());
        }
        i1 = j1;
        if ((i & 8) == 8)
        {
            i1 = j1 + fa.c(4, f);
        }
        i1 += c().b();
        o = i1;
        return i1;
    }

    public P b()
    {
        return b();
    }

    public d4 b()
    {
        return m;
    }

    public fn b()
    {
        return l;
    }

    public b0 c()
    {
        return f;
    }

    public final bR c()
    {
        return r;
    }

    public cR c()
    {
        return b();
    }

    public eh c()
    {
        return l();
    }

    public ga c()
    {
        return l();
    }

    public ga d()
    {
        return s();
    }

    public String d()
    {
        Object obj = p;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            p = s1;
        }
        return s1;
    }

    public final boolean d()
    {
        byte byte0 = n;
        if (byte0 != -1)
        {
            return byte0 == 1;
        }
        if (r() && !q().d())
        {
            n = 0;
            return false;
        } else
        {
            n = 1;
            return true;
        }
    }

    protected aH e()
    {
        return el.k().a(com/google/d4, com/google/ey);
    }

    public a3 f()
    {
        Object obj = p;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            p = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public a3 h()
    {
        Object obj = e;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            e = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public boolean i()
    {
        return (i & 4) == 4;
    }

    public boolean j()
    {
        return (i & 1) == 1;
    }

    public a3 k()
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

    public ey l()
    {
        return a(this);
    }

    public String m()
    {
        Object obj = e;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            e = s1;
        }
        return s1;
    }

    public boolean o()
    {
        return (i & 2) == 2;
    }

    public String p()
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

    public dG q()
    {
        return f;
    }

    public boolean r()
    {
        return (i & 8) == 8;
    }

    public ey s()
    {
        return g();
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        m = new d4(true);
        m.a();
    }
}
