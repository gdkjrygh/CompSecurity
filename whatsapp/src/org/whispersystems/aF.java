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
//            f, z, ac, aj, 
//            R, aG

public final class aF extends d8
    implements f
{

    public static final int ITERATION_FIELD_NUMBER = 1;
    public static fn PARSER = new org.whispersystems.z();
    public static final int SEED_FIELD_NUMBER = 2;
    private static final aF k;
    private static final long serialVersionUID = 0L;
    private int e;
    private int f;
    private final bR g;
    private byte h;
    private int i;
    private a3 j;

    private aF(eL el, z z1)
    {
        fz fz1;
        boolean flag;
        int i1;
        i1 = ac.H;
        super();
        h = -1;
        f = -1;
        e();
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
        boolean flag3 = a(el, fz1, z1, j1);
        if (flag3) goto _L6; else goto _L5
_L5:
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        flag1 = true;
_L3:
        e = e | 1;
        i = el.a();
        flag = flag1;
        if (i1 == 0) goto _L6; else goto _L9
_L9:
        flag2 = flag1;
_L4:
        e = e | 2;
        j = el.x();
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
        throw (new bp(el.getMessage())).a(this);
_L8:
        flag = true;
          goto _L6
    }

    aF(eL el, z z1, aG ag)
    {
        this(el, z1);
    }

    private aF(ee ee1)
    {
        super(ee1);
        h = -1;
        f = -1;
        g = ee1.c();
    }

    aF(ee ee1, aG ag)
    {
        this(ee1);
    }

    private aF(boolean flag)
    {
        h = -1;
        f = -1;
        g = bR.d();
    }

    static int a(aF af, int i1)
    {
        af.i = i1;
        return i1;
    }

    static a3 a(aF af, a3 a3_1)
    {
        af.j = a3_1;
        return a3_1;
    }

    public static aF a(a3 a3_1)
    {
        return (aF)PARSER.a(a3_1);
    }

    public static aF a(a3 a3_1, z z1)
    {
        return (aF)PARSER.b(a3_1, z1);
    }

    public static aF a(eL el)
    {
        return (aF)PARSER.a(el);
    }

    public static aF a(eL el, z z1)
    {
        return (aF)PARSER.b(el, z1);
    }

    public static aF a(InputStream inputstream)
    {
        return (aF)PARSER.b(inputstream);
    }

    public static aF a(InputStream inputstream, z z1)
    {
        return (aF)PARSER.a(inputstream, z1);
    }

    public static aF a(byte abyte0[])
    {
        return (aF)PARSER.a(abyte0);
    }

    public static aF a(byte abyte0[], z z1)
    {
        return (aF)PARSER.a(abyte0, z1);
    }

    public static aj a(aF af)
    {
        return i().a(af);
    }

    static int b(aF af, int i1)
    {
        af.e = i1;
        return i1;
    }

    public static aF b(InputStream inputstream)
    {
        return (aF)PARSER.a(inputstream);
    }

    public static aF b(InputStream inputstream, z z1)
    {
        return (aF)PARSER.b(inputstream, z1);
    }

    private void e()
    {
        i = 0;
        j = a3.b;
    }

    public static aj i()
    {
        return aj.e();
    }

    public static aF j()
    {
        return k;
    }

    static boolean l()
    {
        return d;
    }

    public static final cP m()
    {
        return R.j();
    }

    public eh a()
    {
        return g();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected aj a(b4 b4)
    {
        return new aj(b4, null);
    }

    public void a(fa fa1)
    {
        b();
        if ((e & 1) == 1)
        {
            fa1.i(1, i);
        }
        if ((e & 2) == 2)
        {
            fa1.d(2, j);
        }
        c().a(fa1);
    }

    public boolean a()
    {
        return (e & 2) == 2;
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
            i1 = 0 + fa.g(1, i);
        }
        int j1 = i1;
        if ((e & 2) == 2)
        {
            j1 = i1 + fa.c(2, j);
        }
        i1 = j1 + c().b();
        f = i1;
        return i1;
    }

    public P b()
    {
        return n();
    }

    public fn b()
    {
        return PARSER;
    }

    public aj b()
    {
        return a(this);
    }

    public final bR c()
    {
        return g;
    }

    public cR c()
    {
        return n();
    }

    public eh c()
    {
        return b();
    }

    public ga c()
    {
        return b();
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
        } else
        {
            h = 1;
            return true;
        }
    }

    protected aH e()
    {
        return R.q().a(org/whispersystems/aF, org/whispersystems/aj);
    }

    public boolean f()
    {
        return (e & 1) == 1;
    }

    public aj g()
    {
        return i();
    }

    public int h()
    {
        return i;
    }

    public a3 k()
    {
        return j;
    }

    public aF n()
    {
        return k;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        k = new aF(true);
        k.e();
    }
}
