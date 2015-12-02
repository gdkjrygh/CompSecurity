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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package org.whispersystems:
//            k, B, aw, bp, 
//            aJ, bx, aK, bX, 
//            R, bk, bl, aG, 
//            m, j

public final class ac extends d8
    implements k
{

    public static final int C = 13;
    public static final int E = 10;
    public static int H = 0;
    public static final int g = 2;
    public static final int h = 11;
    public static final int i = 5;
    public static fn j = new B();
    public static final int k = 8;
    private static final ac m;
    public static final int n = 3;
    public static final int p = 12;
    public static final int q = 9;
    private static final long serialVersionUID = 0L;
    public static final int t = 7;
    public static final int v = 6;
    public static final int x = 1;
    public static final int z = 4;
    private int A;
    private aJ B;
    private boolean D;
    private aw F;
    private final bR G;
    private int I;
    private int J;
    private int K;
    private a3 e;
    private aK f;
    private int l;
    private byte o;
    private a3 r;
    private a3 s;
    private a3 u;
    private List w;
    private int y;

    private ac(eL el, z z1)
    {
        fz fz1;
        int i1;
        int j1;
        int l5;
        i1 = 0;
        l5 = H;
        super();
        o = -1;
        A = -1;
        e();
        fz1 = bR.a();
        j1 = 0;
_L47:
        int k1;
        int l1;
        int j2;
        k1 = j1;
        if (i1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = j1;
        k1 = j1;
        l1 = j1;
        int i6 = el.f();
        int i2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        j4 = i1;
        k4 = i1;
        l4 = i1;
        i5 = i1;
        j5 = i1;
        j3 = i1;
        k1 = i1;
        i2 = j1;
        k3 = i1;
        j2 = j1;
        l3 = i1;
        k2 = j1;
        i4 = i1;
        l2 = j1;
        k5 = i1;
        i3 = j1;
        i6;
        JVM INSTR lookupswitch 14: default 248
    //                   0: 1363
    //                   8: 285
    //                   18: 336
    //                   26: 387
    //                   34: 438
    //                   40: 490
    //                   50: 1666
    //                   58: 682
    //                   66: 773
    //                   74: 1659
    //                   80: 1072
    //                   88: 1137
    //                   96: 1202
    //                   106: 1267;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        k1 = j1;
        l1 = j1;
        boolean flag = a(el, fz1, z1, i6);
        k1 = j1;
        if (flag) goto _L17; else goto _L16
_L16:
        if (l5 == 0) goto _L19; else goto _L18
_L18:
        j4 = 1;
_L3:
        k1 = j1;
        l1 = j1;
        y = y | 1;
        k1 = j1;
        l1 = j1;
        K = el.a();
        i1 = j4;
        k1 = j1;
        if (l5 == 0) goto _L17; else goto _L20
_L20:
        k4 = j4;
_L4:
        k1 = j1;
        l1 = j1;
        y = y | 2;
        k1 = j1;
        l1 = j1;
        e = el.x();
        i1 = k4;
        k1 = j1;
        if (l5 == 0) goto _L17; else goto _L21
_L21:
        l4 = k4;
_L5:
        k1 = j1;
        l1 = j1;
        y = y | 4;
        k1 = j1;
        l1 = j1;
        r = el.x();
        i1 = l4;
        k1 = j1;
        if (l5 == 0) goto _L17; else goto _L22
_L22:
        i5 = l4;
_L6:
        k1 = j1;
        l1 = j1;
        y = y | 8;
        k1 = j1;
        l1 = j1;
        u = el.x();
        i1 = i5;
        k1 = j1;
        if (l5 == 0) goto _L17; else goto _L23
_L23:
        j5 = i5;
_L7:
        k1 = j1;
        l1 = j1;
        y = y | 0x10;
        k1 = j1;
        l1 = j1;
        l = el.a();
        i1 = j5;
        k1 = j1;
        if (l5 == 0) goto _L17; else goto _L24
_L24:
        i2 = j5;
_L53:
        j2 = j1;
        k1 = j1;
        l1 = j1;
        if ((y & 0x20) != 32) goto _L26; else goto _L25
_L25:
        j2 = j1;
        k1 = j1;
        l1 = j1;
        Object obj = F.i();
_L51:
        k1 = j1;
        l1 = j1;
        F = (aw)el.a(aw.r, z1);
        if (obj == null) goto _L28; else goto _L27
_L27:
        k1 = j1;
        l1 = j1;
        ((org.whispersystems.bp) (obj)).a(F);
        k1 = j1;
        l1 = j1;
        F = ((org.whispersystems.bp) (obj)).l();
_L28:
        k1 = j1;
        l1 = j1;
        y = y | 0x20;
        k1 = j1;
        i1 = i2;
        if (l5 == 0) goto _L17; else goto _L29
_L29:
        j3 = i2;
_L9:
        i2 = j1;
        if ((j1 & 0x40) == 64) goto _L31; else goto _L30
_L30:
        j2 = j1;
        k1 = j1;
        l1 = j1;
        w = new ArrayList();
        i2 = j1 | 0x40;
_L31:
        j2 = i2;
        k1 = i2;
        l1 = i2;
        w.add(el.a(aw.r, z1));
        i1 = j3;
        k1 = i2;
        if (l5 == 0) goto _L17; else goto _L32
_L32:
        k1 = j3;
_L10:
        k2 = k1;
        j2 = i2;
        k1 = i2;
        l1 = i2;
        if ((y & 0x40) != 64) goto _L34; else goto _L33
_L33:
        j2 = i2;
        k1 = i2;
        l1 = i2;
        obj = B.t();
_L50:
        k1 = i2;
        l1 = i2;
        B = (aJ)el.a(aJ.t, z1);
        if (obj == null) goto _L36; else goto _L35
_L35:
        k1 = i2;
        l1 = i2;
        ((bx) (obj)).a(B);
        k1 = i2;
        l1 = i2;
        B = ((bx) (obj)).c();
_L36:
        j2 = i2;
        k1 = i2;
        l1 = i2;
        y = y | 0x40;
        k1 = i2;
        i1 = k2;
        if (l5 == 0) goto _L17; else goto _L37
_L37:
        j1 = i2;
_L52:
        j2 = j1;
        k1 = j1;
        l1 = j1;
        if ((y & 0x80) != 128) goto _L39; else goto _L38
_L38:
        j2 = j1;
        k1 = j1;
        l1 = j1;
        obj = f.e();
_L49:
        k1 = j1;
        l1 = j1;
        f = (aK)el.a(aK.PARSER, z1);
        if (obj == null) goto _L41; else goto _L40
_L40:
        k1 = j1;
        l1 = j1;
        ((bX) (obj)).a(f);
        k1 = j1;
        l1 = j1;
        f = ((bX) (obj)).c();
_L41:
        k1 = j1;
        l1 = j1;
        i1 = j1;
        y = y | 0x80;
        k1 = j1;
        i1 = k2;
        if (l5 == 0) goto _L17; else goto _L42
_L42:
        j2 = j1;
        k3 = k2;
_L12:
        k1 = j2;
        l1 = j2;
        i1 = j2;
        y = y | 0x100;
        k1 = j2;
        l1 = j2;
        i1 = j2;
        I = el.a();
        i1 = k3;
        k1 = j2;
        if (l5 == 0) goto _L17; else goto _L43
_L43:
        k2 = j2;
        l3 = k3;
_L13:
        k1 = k2;
        l1 = k2;
        i1 = k2;
        y = y | 0x200;
        k1 = k2;
        l1 = k2;
        i1 = k2;
        J = el.a();
        i1 = l3;
        k1 = k2;
        if (l5 == 0) goto _L17; else goto _L44
_L44:
        l2 = k2;
        i4 = l3;
_L14:
        k1 = l2;
        l1 = l2;
        i1 = l2;
        y = y | 0x400;
        k1 = l2;
        l1 = l2;
        i1 = l2;
        D = el.g();
        i1 = i4;
        k1 = l2;
        if (l5 == 0) goto _L17; else goto _L45
_L45:
        i3 = l2;
        k5 = i4;
_L15:
        k1 = i3;
        l1 = i3;
        i1 = i3;
        y = y | 0x800;
        k1 = i3;
        l1 = i3;
        i1 = i3;
        s = el.x();
        k1 = i3;
        i1 = k5;
_L17:
        j1 = k1;
        if (l5 == 0) goto _L47; else goto _L46
_L46:
        if ((k1 & 0x40) == 64)
        {
            try
            {
                w = Collections.unmodifiableList(w);
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        G = fz1.c();
        d();
        return;
_L2:
        if (l5 == 0) goto _L19; else goto _L48
_L48:
        i1 = 1;
          goto _L1
        el;
        j2 = j1;
        k1 = j1;
        l1 = j1;
        throw el;
        el;
        k1 = j2;
        throw el.a(this);
        el;
        if ((k1 & 0x40) == 64)
        {
            try
            {
                w = Collections.unmodifiableList(w);
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        G = fz1.c();
        d();
        throw el;
        el;
        k1 = j1;
        l1 = j1;
        throw el;
        el;
        k1 = j1;
        l1 = j1;
        throw el;
        el;
        k1 = j1;
        l1 = j1;
        throw el;
        el;
        k1 = j1;
        l1 = j1;
        throw el;
        el;
        j2 = j1;
        k1 = j1;
        l1 = j1;
        throw el;
        el;
        k1 = l1;
        throw (new bp(el.getMessage())).a(this);
        el;
        j2 = j1;
        k1 = j1;
        l1 = j1;
        throw el;
        el;
        j2 = j1;
        k1 = j1;
        l1 = j1;
        throw el;
        el;
        j2 = i2;
        k1 = i2;
        l1 = i2;
        throw el;
        el;
        j2 = j1;
        k1 = j1;
        l1 = j1;
        throw el;
        el;
        k1 = i1;
        l1 = i1;
        throw el;
        el;
        k1 = i1;
        l1 = i1;
        throw el;
        el;
        k1 = i1;
        l1 = i1;
        throw el;
        el;
        j2 = i1;
        k1 = i1;
        l1 = i1;
        throw el;
_L39:
        obj = null;
          goto _L49
_L34:
        obj = null;
          goto _L50
_L26:
        obj = null;
          goto _L51
_L19:
        i1 = 1;
        k1 = j1;
          goto _L17
_L11:
        k2 = i1;
          goto _L52
_L8:
        i2 = i1;
          goto _L53
    }

    ac(eL el, z z1, aG ag)
    {
        this(el, z1);
    }

    private ac(ee ee1)
    {
        super(ee1);
        o = -1;
        A = -1;
        G = ee1.c();
    }

    ac(ee ee1, aG ag)
    {
        this(ee1);
    }

    private ac(boolean flag)
    {
        o = -1;
        A = -1;
        G = bR.d();
    }

    static boolean A()
    {
        return d;
    }

    public static ac G()
    {
        return m;
    }

    public static final cP O()
    {
        return R.n();
    }

    static int a(ac ac1, int i1)
    {
        ac1.I = i1;
        return i1;
    }

    static a3 a(ac ac1, a3 a3_1)
    {
        ac1.u = a3_1;
        return a3_1;
    }

    static List a(ac ac1)
    {
        return ac1.w;
    }

    static List a(ac ac1, List list)
    {
        ac1.w = list;
        return list;
    }

    static aJ a(ac ac1, aJ aj)
    {
        ac1.B = aj;
        return aj;
    }

    static aK a(ac ac1, aK ak)
    {
        ac1.f = ak;
        return ak;
    }

    public static ac a(a3 a3_1)
    {
        return (ac)j.a(a3_1);
    }

    public static ac a(a3 a3_1, z z1)
    {
        return (ac)j.b(a3_1, z1);
    }

    public static ac a(eL el)
    {
        return (ac)j.a(el);
    }

    public static ac a(eL el, z z1)
    {
        return (ac)j.b(el, z1);
    }

    public static ac a(InputStream inputstream)
    {
        return (ac)j.b(inputstream);
    }

    public static ac a(InputStream inputstream, z z1)
    {
        return (ac)j.b(inputstream, z1);
    }

    public static ac a(byte abyte0[])
    {
        return (ac)j.a(abyte0);
    }

    public static ac a(byte abyte0[], z z1)
    {
        return (ac)j.a(abyte0, z1);
    }

    static aw a(ac ac1, aw aw1)
    {
        ac1.F = aw1;
        return aw1;
    }

    static boolean a(ac ac1, boolean flag)
    {
        ac1.D = flag;
        return flag;
    }

    static int b(ac ac1, int i1)
    {
        ac1.y = i1;
        return i1;
    }

    static a3 b(ac ac1, a3 a3_1)
    {
        ac1.s = a3_1;
        return a3_1;
    }

    public static ac b(InputStream inputstream)
    {
        return (ac)j.a(inputstream);
    }

    public static ac b(InputStream inputstream, z z1)
    {
        return (ac)j.a(inputstream, z1);
    }

    public static bk b(ac ac1)
    {
        return r().a(ac1);
    }

    static int c(ac ac1, int i1)
    {
        ac1.l = i1;
        return i1;
    }

    static a3 c(ac ac1, a3 a3_1)
    {
        ac1.e = a3_1;
        return a3_1;
    }

    static int d(ac ac1, int i1)
    {
        ac1.K = i1;
        return i1;
    }

    static a3 d(ac ac1, a3 a3_1)
    {
        ac1.r = a3_1;
        return a3_1;
    }

    static int e(ac ac1, int i1)
    {
        ac1.J = i1;
        return i1;
    }

    private void e()
    {
        K = 0;
        e = a3.b;
        r = a3.b;
        u = a3.b;
        l = 0;
        F = aw.b();
        w = Collections.emptyList();
        B = aJ.f();
        f = aK.g();
        I = 0;
        J = 0;
        D = false;
        s = a3.b;
    }

    static boolean j()
    {
        return d;
    }

    public static bk r()
    {
        return bk.a();
    }

    public int B()
    {
        return K;
    }

    public a3 C()
    {
        return s;
    }

    public bk D()
    {
        return r();
    }

    public boolean E()
    {
        return (y & 2) == 2;
    }

    public boolean F()
    {
        return (y & 0x100) == 256;
    }

    public m H()
    {
        return f;
    }

    public ac I()
    {
        return m;
    }

    public a3 J()
    {
        return r;
    }

    public boolean K()
    {
        return (y & 0x80) == 128;
    }

    public int L()
    {
        return w.size();
    }

    public aJ M()
    {
        return B;
    }

    public boolean N()
    {
        return (y & 1) == 1;
    }

    public eh a()
    {
        return D();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected bk a(b4 b4)
    {
        return new bk(b4, null);
    }

    public bl a(int i1)
    {
        return (bl)w.get(i1);
    }

    public void a(fa fa1)
    {
        int j1 = H;
        b();
        if ((y & 1) == 1)
        {
            fa1.i(1, K);
        }
        if ((y & 2) == 2)
        {
            fa1.d(2, e);
        }
        if ((y & 4) == 4)
        {
            fa1.d(3, r);
        }
        if ((y & 8) == 8)
        {
            fa1.d(4, u);
        }
        if ((y & 0x10) == 16)
        {
            fa1.i(5, l);
        }
        if ((y & 0x20) == 32)
        {
            fa1.d(6, F);
        }
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < w.size())
                {
                    fa1.d(7, (cR)w.get(i1));
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                if ((y & 0x40) == 64)
                {
                    fa1.d(8, B);
                }
                if ((y & 0x80) == 128)
                {
                    fa1.d(9, f);
                }
                if ((y & 0x100) == 256)
                {
                    fa1.i(10, I);
                }
                if ((y & 0x200) == 512)
                {
                    fa1.i(11, J);
                }
                if ((y & 0x400) == 1024)
                {
                    fa1.a(12, D);
                }
                if ((y & 0x800) == 2048)
                {
                    fa1.d(13, s);
                }
                c().a(fa1);
                return;
            }
            i1++;
        } while (true);
    }

    public boolean a()
    {
        return (y & 0x400) == 1024;
    }

    public int b()
    {
        boolean flag = false;
        int k1 = H;
        int i1 = A;
        if (i1 != -1)
        {
            return i1;
        }
        int j1;
        if ((y & 1) == 1)
        {
            j1 = fa.g(1, K) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if ((y & 2) == 2)
        {
            i1 = j1 + fa.c(2, e);
        }
        j1 = i1;
        if ((y & 4) == 4)
        {
            j1 = i1 + fa.c(3, r);
        }
        i1 = j1;
        if ((y & 8) == 8)
        {
            i1 = j1 + fa.c(4, u);
        }
        j1 = i1;
        if ((y & 0x10) == 16)
        {
            j1 = i1 + fa.g(5, l);
        }
        i1 = j1;
        if ((y & 0x20) == 32)
        {
            i1 = j1 + fa.c(6, F);
        }
        j1 = ((flag) ? 1 : 0);
        if (j1 >= w.size()) goto _L2; else goto _L1
_L1:
        i1 = fa.c(7, (cR)w.get(j1)) + i1;
        j1++;
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        j1 = i1;
_L4:
        i1 = j1;
        if ((y & 0x40) == 64)
        {
            i1 = j1 + fa.c(8, B);
        }
        j1 = i1;
        if ((y & 0x80) == 128)
        {
            j1 = i1 + fa.c(9, f);
        }
        i1 = j1;
        if ((y & 0x100) == 256)
        {
            i1 = j1 + fa.g(10, I);
        }
        j1 = i1;
        if ((y & 0x200) == 512)
        {
            j1 = i1 + fa.g(11, J);
        }
        i1 = j1;
        if ((y & 0x400) == 1024)
        {
            i1 = j1 + fa.b(12, D);
        }
        j1 = i1;
        if ((y & 0x800) == 2048)
        {
            j1 = i1 + fa.c(13, s);
        }
        i1 = j1 + c().b();
        A = i1;
        return i1;
_L2:
        j1 = i1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public P b()
    {
        return I();
    }

    public fn b()
    {
        return j;
    }

    public aw b(int i1)
    {
        return (aw)w.get(i1);
    }

    public boolean b()
    {
        return (y & 0x10) == 16;
    }

    public final bR c()
    {
        return G;
    }

    public cR c()
    {
        return I();
    }

    public eh c()
    {
        return x();
    }

    public ga c()
    {
        return x();
    }

    public ga d()
    {
        return D();
    }

    public final boolean d()
    {
        byte byte0 = o;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            o = 1;
            return true;
        }
    }

    protected aH e()
    {
        return R.C().a(org/whispersystems/ac, org/whispersystems/bk);
    }

    public j f()
    {
        return B;
    }

    public bl g()
    {
        return F;
    }

    public boolean h()
    {
        return (y & 0x20) == 32;
    }

    public int i()
    {
        return I;
    }

    public boolean k()
    {
        return (y & 8) == 8;
    }

    public a3 l()
    {
        return e;
    }

    public int m()
    {
        return l;
    }

    public a3 n()
    {
        return u;
    }

    public int o()
    {
        return J;
    }

    public boolean p()
    {
        return (y & 0x200) == 512;
    }

    public List q()
    {
        return w;
    }

    public boolean s()
    {
        return (y & 0x40) == 64;
    }

    public boolean t()
    {
        return (y & 4) == 4;
    }

    public boolean u()
    {
        return (y & 0x800) == 2048;
    }

    public aK v()
    {
        return f;
    }

    public List w()
    {
        return w;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    public bk x()
    {
        return b(this);
    }

    public aw y()
    {
        return F;
    }

    public boolean z()
    {
        return D;
    }

    static 
    {
        m = new ac(true);
        m.e();
    }
}
