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
//            a9, E, ac, bt, 
//            R, aG

public final class a2 extends d8
    implements a9
{

    public static final int CIPHERKEY_FIELD_NUMBER = 2;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int IV_FIELD_NUMBER = 4;
    public static final int MACKEY_FIELD_NUMBER = 3;
    public static fn PARSER = new E();
    private static final a2 k;
    private static final long serialVersionUID = 0L;
    private a3 e;
    private int f;
    private final bR g;
    private byte h;
    private int i;
    private a3 j;
    private a3 l;
    private int m;

    private a2(eL el, z z)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = ac.H;
        super();
        h = -1;
        i = -1;
        j();
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
    //                   8: 132
    //                   18: 163
    //                   26: 194
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
        m = m | 1;
        f = el.a();
        flag = flag1;
        if (i1 == 0) goto _L8; else goto _L11
_L11:
        flag2 = flag1;
_L4:
        m = m | 2;
        j = el.x();
        flag = flag2;
        if (i1 == 0) goto _L8; else goto _L12
_L12:
        flag3 = flag2;
_L5:
        m = m | 4;
        l = el.x();
        flag = flag3;
        if (i1 == 0) goto _L8; else goto _L13
_L13:
        flag4 = flag3;
_L6:
        m = m | 8;
        e = el.x();
        flag = flag4;
_L8:
        if (i1 == 0) goto _L15; else goto _L14
_L14:
        g = fz1.c();
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
        g = fz1.c();
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

    a2(eL el, z z, aG ag)
    {
        this(el, z);
    }

    private a2(ee ee1)
    {
        super(ee1);
        h = -1;
        i = -1;
        g = ee1.c();
    }

    a2(ee ee1, aG ag)
    {
        this(ee1);
    }

    private a2(boolean flag)
    {
        h = -1;
        i = -1;
        g = bR.d();
    }

    static int a(a2 a2_1, int i1)
    {
        a2_1.f = i1;
        return i1;
    }

    static a3 a(a2 a2_1, a3 a3_1)
    {
        a2_1.e = a3_1;
        return a3_1;
    }

    public static a2 a(a3 a3_1)
    {
        return (a2)PARSER.a(a3_1);
    }

    public static a2 a(a3 a3_1, z z)
    {
        return (a2)PARSER.b(a3_1, z);
    }

    public static a2 a(eL el)
    {
        return (a2)PARSER.a(el);
    }

    public static a2 a(eL el, z z)
    {
        return (a2)PARSER.b(el, z);
    }

    public static a2 a(InputStream inputstream)
    {
        return (a2)PARSER.b(inputstream);
    }

    public static a2 a(InputStream inputstream, z z)
    {
        return (a2)PARSER.b(inputstream, z);
    }

    public static a2 a(byte abyte0[])
    {
        return (a2)PARSER.a(abyte0);
    }

    public static a2 a(byte abyte0[], z z)
    {
        return (a2)PARSER.a(abyte0, z);
    }

    public static bt a(a2 a2_1)
    {
        return h().a(a2_1);
    }

    static boolean a()
    {
        return d;
    }

    static int b(a2 a2_1, int i1)
    {
        a2_1.m = i1;
        return i1;
    }

    static a3 b(a2 a2_1, a3 a3_1)
    {
        a2_1.j = a3_1;
        return a3_1;
    }

    public static a2 b(InputStream inputstream)
    {
        return (a2)PARSER.a(inputstream);
    }

    public static a2 b(InputStream inputstream, z z)
    {
        return (a2)PARSER.a(inputstream, z);
    }

    static a3 c(a2 a2_1, a3 a3_1)
    {
        a2_1.l = a3_1;
        return a3_1;
    }

    public static bt h()
    {
        return bt.e();
    }

    private void j()
    {
        f = 0;
        j = a3.b;
        l = a3.b;
        e = a3.b;
    }

    public static final cP l()
    {
        return R.v();
    }

    public static a2 n()
    {
        return k;
    }

    public eh a()
    {
        return f();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected bt a(b4 b4)
    {
        return new bt(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((m & 1) == 1)
        {
            fa1.i(1, f);
        }
        if ((m & 2) == 2)
        {
            fa1.d(2, j);
        }
        if ((m & 4) == 4)
        {
            fa1.d(3, l);
        }
        if ((m & 8) == 8)
        {
            fa1.d(4, e);
        }
        c().a(fa1);
    }

    public int b()
    {
        int i1 = i;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        if ((m & 1) == 1)
        {
            j1 = 0 + fa.g(1, f);
        }
        i1 = j1;
        if ((m & 2) == 2)
        {
            i1 = j1 + fa.c(2, j);
        }
        j1 = i1;
        if ((m & 4) == 4)
        {
            j1 = i1 + fa.c(3, l);
        }
        i1 = j1;
        if ((m & 8) == 8)
        {
            i1 = j1 + fa.c(4, e);
        }
        i1 += c().b();
        i = i1;
        return i1;
    }

    public P b()
    {
        return o();
    }

    public a3 b()
    {
        return l;
    }

    public fn b()
    {
        return PARSER;
    }

    public int c()
    {
        return f;
    }

    public final bR c()
    {
        return g;
    }

    public cR c()
    {
        return o();
    }

    public eh c()
    {
        return m();
    }

    public ga c()
    {
        return m();
    }

    public ga d()
    {
        return f();
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
        return R.l().a(org/whispersystems/a2, org/whispersystems/bt);
    }

    public boolean e()
    {
        return (m & 2) == 2;
    }

    public bt f()
    {
        return h();
    }

    public a3 g()
    {
        return e;
    }

    public boolean i()
    {
        return (m & 8) == 8;
    }

    public a3 k()
    {
        return j;
    }

    public bt m()
    {
        return a(this);
    }

    public a2 o()
    {
        return k;
    }

    public boolean p()
    {
        return (m & 1) == 1;
    }

    public boolean q()
    {
        return (m & 4) == 4;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        k = new a2(true);
        k.j();
    }
}
