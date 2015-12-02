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
//            bm, D, ac, b0, 
//            R, aG

public final class aP extends d8
    implements bm
{

    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int KEY_FIELD_NUMBER = 2;
    public static fn PARSER = new D();
    private static final aP g;
    private static final long serialVersionUID = 0L;
    private int e;
    private int f;
    private int h;
    private byte i;
    private final bR j;
    private a3 k;

    private aP(eL el, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = ac.H;
        super();
        i = -1;
        f = -1;
        h();
        fz1 = bR.a();
        flag = false;
_L11:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = el.f();
        boolean flag1;
        boolean flag2;
        flag1 = flag;
        flag2 = flag;
        j1;
        JVM INSTR lookupswitch 3: default 84
    //                   0: 179
    //                   8: 108
    //                   18: 139;
           goto _L1 _L2 _L3 _L4
_L1:
        boolean flag3 = a(el, fz1, z, j1);
        if (flag3) goto _L6; else goto _L5
_L5:
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        flag1 = true;
_L3:
        h = h | 1;
        e = el.a();
        flag = flag1;
        if (i1 == 0) goto _L6; else goto _L9
_L9:
        flag2 = flag1;
_L4:
        h = h | 2;
        k = el.x();
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
        el;
        throw el;
        el;
        throw el.a(this);
        el;
        j = fz1.c();
        d();
        throw el;
        el;
        throw el;
        el;
        throw el;
        el;
        throw (new bp(el.getMessage())).a(this);
_L8:
        flag = true;
          goto _L6
    }

    aP(eL el, z z, aG ag)
    {
        this(el, z);
    }

    private aP(ee ee1)
    {
        super(ee1);
        i = -1;
        f = -1;
        j = ee1.c();
    }

    aP(ee ee1, aG ag)
    {
        this(ee1);
    }

    private aP(boolean flag)
    {
        i = -1;
        f = -1;
        j = bR.d();
    }

    static int a(aP ap, int i1)
    {
        ap.h = i1;
        return i1;
    }

    static a3 a(aP ap, a3 a3_1)
    {
        ap.k = a3_1;
        return a3_1;
    }

    public static aP a(a3 a3_1)
    {
        return (aP)PARSER.a(a3_1);
    }

    public static aP a(a3 a3_1, z z)
    {
        return (aP)PARSER.b(a3_1, z);
    }

    public static aP a(eL el)
    {
        return (aP)PARSER.a(el);
    }

    public static aP a(eL el, z z)
    {
        return (aP)PARSER.b(el, z);
    }

    public static aP a(InputStream inputstream)
    {
        return (aP)PARSER.a(inputstream);
    }

    public static aP a(InputStream inputstream, z z)
    {
        return (aP)PARSER.b(inputstream, z);
    }

    public static aP a(byte abyte0[])
    {
        return (aP)PARSER.a(abyte0);
    }

    public static aP a(byte abyte0[], z z)
    {
        return (aP)PARSER.a(abyte0, z);
    }

    public static b0 a(aP ap)
    {
        return l().a(ap);
    }

    static int b(aP ap, int i1)
    {
        ap.e = i1;
        return i1;
    }

    public static aP b(InputStream inputstream)
    {
        return (aP)PARSER.b(inputstream);
    }

    public static aP b(InputStream inputstream, z z)
    {
        return (aP)PARSER.a(inputstream, z);
    }

    static boolean b()
    {
        return d;
    }

    public static aP e()
    {
        return g;
    }

    private void h()
    {
        e = 0;
        k = a3.b;
    }

    public static final cP i()
    {
        return R.s();
    }

    public static b0 l()
    {
        return b0.b();
    }

    public eh a()
    {
        return c();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected b0 a(b4 b4)
    {
        return new b0(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((h & 1) == 1)
        {
            fa1.i(1, e);
        }
        if ((h & 2) == 2)
        {
            fa1.d(2, k);
        }
        c().a(fa1);
    }

    public boolean a()
    {
        return (h & 1) == 1;
    }

    public int b()
    {
        int i1 = f;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        if ((h & 1) == 1)
        {
            i1 = 0 + fa.g(1, e);
        }
        int j1 = i1;
        if ((h & 2) == 2)
        {
            j1 = i1 + fa.c(2, k);
        }
        i1 = j1 + c().b();
        f = i1;
        return i1;
    }

    public P b()
    {
        return f();
    }

    public fn b()
    {
        return PARSER;
    }

    public final bR c()
    {
        return j;
    }

    public cR c()
    {
        return f();
    }

    public eh c()
    {
        return j();
    }

    public ga c()
    {
        return j();
    }

    public b0 c()
    {
        return l();
    }

    public a3 d()
    {
        return k;
    }

    public ga d()
    {
        return c();
    }

    public final boolean d()
    {
        byte byte0 = i;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            i = 1;
            return true;
        }
    }

    protected aH e()
    {
        return R.a().a(org/whispersystems/aP, org/whispersystems/b0);
    }

    public aP f()
    {
        return g;
    }

    public int g()
    {
        return e;
    }

    public b0 j()
    {
        return a(this);
    }

    public boolean k()
    {
        return (h & 2) == 2;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        g = new aP(true);
        g.h();
    }
}
