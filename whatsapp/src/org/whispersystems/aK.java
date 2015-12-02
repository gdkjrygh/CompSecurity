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
//            m, G, ac, bX, 
//            R, aG

public final class aK extends d8
    implements m
{

    public static final int BASEKEY_FIELD_NUMBER = 2;
    public static fn PARSER = new G();
    public static final int PREKEYID_FIELD_NUMBER = 1;
    public static final int SIGNEDPREKEYID_FIELD_NUMBER = 3;
    private static final aK j;
    private static final long serialVersionUID = 0L;
    private final bR e;
    private int f;
    private int g;
    private byte h;
    private int i;
    private a3 k;
    private int l;

    private aK(eL el, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = ac.H;
        super();
        h = -1;
        i = -1;
        h();
        fz1 = bR.a();
        flag = false;
_L13:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = el.f();
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = flag;
        flag2 = flag;
        flag3 = flag;
        j1;
        JVM INSTR lookupswitch 4: default 96
    //                   0: 222
    //                   8: 120
    //                   18: 151
    //                   24: 182;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        boolean flag4 = a(el, fz1, z, j1);
        if (flag4) goto _L7; else goto _L6
_L6:
        if (i1 == 0) goto _L9; else goto _L8
_L8:
        flag1 = true;
_L3:
        f = f | 1;
        l = el.a();
        flag = flag1;
        if (i1 == 0) goto _L7; else goto _L10
_L10:
        flag2 = flag1;
_L4:
        f = f | 4;
        k = el.x();
        flag = flag2;
        if (i1 == 0) goto _L7; else goto _L11
_L11:
        flag3 = flag2;
_L5:
        f = f | 2;
        g = el.c();
        flag = flag3;
_L7:
        if (i1 == 0) goto _L13; else goto _L12
_L12:
        e = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L9; else goto _L14
_L14:
        flag = true;
          goto _L1
        el;
        throw el;
        el;
        throw el.a(this);
        el;
        e = fz1.c();
        d();
        throw el;
        el;
        throw el;
        el;
        throw el;
        el;
        throw el;
        el;
        throw (new bp(el.getMessage())).a(this);
_L9:
        flag = true;
          goto _L7
    }

    aK(eL el, z z, aG ag)
    {
        this(el, z);
    }

    private aK(ee ee1)
    {
        super(ee1);
        h = -1;
        i = -1;
        e = ee1.c();
    }

    aK(ee ee1, aG ag)
    {
        this(ee1);
    }

    private aK(boolean flag)
    {
        h = -1;
        i = -1;
        e = bR.d();
    }

    static int a(aK ak, int i1)
    {
        ak.g = i1;
        return i1;
    }

    static a3 a(aK ak, a3 a3_1)
    {
        ak.k = a3_1;
        return a3_1;
    }

    public static aK a(a3 a3_1)
    {
        return (aK)PARSER.a(a3_1);
    }

    public static aK a(a3 a3_1, z z)
    {
        return (aK)PARSER.b(a3_1, z);
    }

    public static aK a(eL el)
    {
        return (aK)PARSER.a(el);
    }

    public static aK a(eL el, z z)
    {
        return (aK)PARSER.b(el, z);
    }

    public static aK a(InputStream inputstream)
    {
        return (aK)PARSER.b(inputstream);
    }

    public static aK a(InputStream inputstream, z z)
    {
        return (aK)PARSER.b(inputstream, z);
    }

    public static aK a(byte abyte0[])
    {
        return (aK)PARSER.a(abyte0);
    }

    public static aK a(byte abyte0[], z z)
    {
        return (aK)PARSER.a(abyte0, z);
    }

    public static bX a(aK ak)
    {
        return i().a(ak);
    }

    static int b(aK ak, int i1)
    {
        ak.f = i1;
        return i1;
    }

    public static aK b(InputStream inputstream)
    {
        return (aK)PARSER.a(inputstream);
    }

    public static aK b(InputStream inputstream, z z)
    {
        return (aK)PARSER.a(inputstream, z);
    }

    static boolean b()
    {
        return d;
    }

    static int c(aK ak, int i1)
    {
        ak.l = i1;
        return i1;
    }

    public static aK g()
    {
        return j;
    }

    private void h()
    {
        l = 0;
        g = 0;
        k = a3.b;
    }

    public static bX i()
    {
        return bX.a();
    }

    public static final cP m()
    {
        return R.i();
    }

    public eh a()
    {
        return k();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected bX a(b4 b4)
    {
        return new bX(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((f & 1) == 1)
        {
            fa1.i(1, l);
        }
        if ((f & 4) == 4)
        {
            fa1.d(2, k);
        }
        if ((f & 2) == 2)
        {
            fa1.c(3, g);
        }
        c().a(fa1);
    }

    public boolean a()
    {
        return (f & 1) == 1;
    }

    public int b()
    {
        int i1 = i;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((f & 1) == 1)
        {
            j1 = 0 + fa.g(1, l);
        }
        i1 = j1;
        if ((f & 4) == 4)
        {
            i1 = j1 + fa.c(2, k);
        }
        j1 = i1;
        if ((f & 2) == 2)
        {
            j1 = i1 + fa.h(3, g);
        }
        i1 = j1 + c().b();
        i = i1;
        return i1;
    }

    public P b()
    {
        return d();
    }

    public fn b()
    {
        return PARSER;
    }

    public a3 c()
    {
        return k;
    }

    public final bR c()
    {
        return e;
    }

    public cR c()
    {
        return d();
    }

    public eh c()
    {
        return e();
    }

    public ga c()
    {
        return e();
    }

    public ga d()
    {
        return k();
    }

    public aK d()
    {
        return j;
    }

    public final boolean d()
    {
        byte byte0 = h;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            h = 1;
            return true;
        }
    }

    protected aH e()
    {
        return R.E().a(org/whispersystems/aK, org/whispersystems/bX);
    }

    public bX e()
    {
        return a(this);
    }

    public int f()
    {
        return l;
    }

    public boolean j()
    {
        return (f & 4) == 4;
    }

    public bX k()
    {
        return i();
    }

    public int l()
    {
        return g;
    }

    public boolean n()
    {
        return (f & 2) == 2;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        j = new aK(true);
        j.h();
    }
}
