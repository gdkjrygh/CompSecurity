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
//            bl, C, ac, aP, 
//            b0, a2, bp, R, 
//            a9, aG, bm

public final class aw extends d8
    implements bl
{

    private static final aw g;
    public static final int h = 3;
    public static final int m = 2;
    public static final int o = 1;
    public static final int q = 4;
    public static fn r = new C();
    private static final long serialVersionUID = 0L;
    private int e;
    private aP f;
    private a3 i;
    private a3 j;
    private byte k;
    private final bR l;
    private int n;
    private List p;

    private aw(eL el, z z)
    {
        fz fz1;
        int i1;
        int j1;
        int k2;
        j1 = 0;
        k2 = ac.H;
        super();
        k = -1;
        e = -1;
        e();
        fz1 = bR.a();
        i1 = 0;
_L22:
        int k1;
        int l1;
        int j2;
        k1 = i1;
        if (j1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = i1;
        k1 = i1;
        j2 = i1;
        int l2 = el.f();
        int i2;
        boolean flag;
        l1 = j1;
        i2 = j1;
        flag = j1;
        l2;
        JVM INSTR lookupswitch 5: default 124
    //                   0: 518
    //                   10: 161
    //                   18: 212
    //                   26: 697
    //                   34: 392;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        k1 = i1;
        j2 = i1;
        boolean flag1 = a(el, fz1, z, l2);
        k1 = i1;
        if (flag1) goto _L8; else goto _L7
_L7:
        if (k2 == 0) goto _L10; else goto _L9
_L9:
        l1 = 1;
_L3:
        k1 = i1;
        j2 = i1;
        n = n | 1;
        k1 = i1;
        j2 = i1;
        j = el.x();
        j1 = l1;
        k1 = i1;
        if (k2 == 0) goto _L8; else goto _L11
_L11:
        i2 = l1;
_L4:
        k1 = i1;
        j2 = i1;
        n = n | 2;
        k1 = i1;
        j2 = i1;
        i = el.x();
        j1 = i2;
        k1 = i1;
        if (k2 == 0) goto _L8; else goto _L12
_L12:
        j1 = i2;
_L5:
        l1 = i1;
        k1 = i1;
        j2 = i1;
        if ((n & 4) != 4) goto _L14; else goto _L13
_L13:
        l1 = i1;
        k1 = i1;
        j2 = i1;
        b0 b0_1 = f.j();
_L24:
        k1 = i1;
        j2 = i1;
        f = (aP)el.a(aP.PARSER, z);
        if (b0_1 == null) goto _L16; else goto _L15
_L15:
        k1 = i1;
        j2 = i1;
        b0_1.a(f);
        k1 = i1;
        j2 = i1;
        f = b0_1.e();
_L16:
        k1 = i1;
        j2 = i1;
        n = n | 4;
        if (k2 == 0) goto _L18; else goto _L17
_L17:
        flag = j1;
_L6:
        j1 = i1;
        if ((i1 & 8) == 8) goto _L20; else goto _L19
_L19:
        l1 = i1;
        k1 = i1;
        j2 = i1;
        p = new ArrayList();
        j1 = i1 | 8;
_L20:
        l1 = j1;
        k1 = j1;
        j2 = j1;
        p.add(el.a(a2.PARSER, z));
        k1 = j1;
        j1 = ((flag) ? 1 : 0);
_L8:
        i1 = k1;
        if (k2 == 0) goto _L22; else goto _L21
_L21:
        if ((k1 & 8) == 8)
        {
            try
            {
                p = Collections.unmodifiableList(p);
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        l = fz1.c();
        d();
        return;
_L2:
        if (k2 == 0) goto _L10; else goto _L23
_L23:
        j1 = 1;
          goto _L1
        el;
        l1 = i1;
        k1 = i1;
        j2 = i1;
        throw el;
        el;
        k1 = l1;
        throw el.a(this);
        el;
        if ((k1 & 8) == 8)
        {
            try
            {
                p = Collections.unmodifiableList(p);
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        l = fz1.c();
        d();
        throw el;
        el;
        k1 = i1;
        j2 = i1;
        throw el;
        el;
        l1 = i1;
        k1 = i1;
        j2 = i1;
        throw el;
        el;
        k1 = j2;
        throw (new bp(el.getMessage())).a(this);
        el;
        l1 = i1;
        k1 = i1;
        j2 = i1;
        throw el;
        el;
        l1 = i1;
        k1 = i1;
        j2 = i1;
        throw el;
_L18:
        k1 = i1;
          goto _L8
_L14:
        b0_1 = null;
          goto _L24
_L10:
        j1 = 1;
        k1 = i1;
          goto _L8
    }

    aw(eL el, z z, aG ag)
    {
        this(el, z);
    }

    private aw(ee ee1)
    {
        super(ee1);
        k = -1;
        e = -1;
        l = ee1.c();
    }

    aw(ee ee1, aG ag)
    {
        this(ee1);
    }

    private aw(boolean flag)
    {
        k = -1;
        e = -1;
        l = bR.d();
    }

    static int a(aw aw1, int i1)
    {
        aw1.n = i1;
        return i1;
    }

    static a3 a(aw aw1, a3 a3_1)
    {
        aw1.i = a3_1;
        return a3_1;
    }

    static List a(aw aw1)
    {
        return aw1.p;
    }

    static List a(aw aw1, List list)
    {
        aw1.p = list;
        return list;
    }

    static aP a(aw aw1, aP ap)
    {
        aw1.f = ap;
        return ap;
    }

    public static aw a(a3 a3_1)
    {
        return (aw)r.a(a3_1);
    }

    public static aw a(a3 a3_1, z z)
    {
        return (aw)r.b(a3_1, z);
    }

    public static aw a(eL el)
    {
        return (aw)r.a(el);
    }

    public static aw a(eL el, z z)
    {
        return (aw)r.b(el, z);
    }

    public static aw a(InputStream inputstream)
    {
        return (aw)r.a(inputstream);
    }

    public static aw a(InputStream inputstream, z z)
    {
        return (aw)r.b(inputstream, z);
    }

    public static aw a(byte abyte0[])
    {
        return (aw)r.a(abyte0);
    }

    public static aw a(byte abyte0[], z z)
    {
        return (aw)r.a(abyte0, z);
    }

    static a3 b(aw aw1, a3 a3_1)
    {
        aw1.j = a3_1;
        return a3_1;
    }

    public static aw b()
    {
        return g;
    }

    public static aw b(InputStream inputstream)
    {
        return (aw)r.b(inputstream);
    }

    public static aw b(InputStream inputstream, z z)
    {
        return (aw)r.a(inputstream, z);
    }

    public static org.whispersystems.bp b(aw aw1)
    {
        return s().a(aw1);
    }

    private void e()
    {
        j = a3.b;
        i = a3.b;
        f = aP.e();
        p = Collections.emptyList();
    }

    public static final cP h()
    {
        return R.w();
    }

    static boolean k()
    {
        return d;
    }

    static boolean n()
    {
        return d;
    }

    public static org.whispersystems.bp s()
    {
        return bp.c();
    }

    public eh a()
    {
        return a();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public a2 a(int i1)
    {
        return (a2)p.get(i1);
    }

    public org.whispersystems.bp a()
    {
        return s();
    }

    protected org.whispersystems.bp a(b4 b4)
    {
        return new org.whispersystems.bp(b4, null);
    }

    public void a(fa fa1)
    {
        int j1 = ac.H;
        b();
        if ((n & 1) == 1)
        {
            fa1.d(1, j);
        }
        if ((n & 2) == 2)
        {
            fa1.d(2, i);
        }
        if ((n & 4) == 4)
        {
            fa1.d(3, f);
        }
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < p.size())
                {
                    fa1.d(4, (cR)p.get(i1));
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                c().a(fa1);
                return;
            }
            i1++;
        } while (true);
    }

    public int b()
    {
        boolean flag = false;
        int k1 = ac.H;
        int i1 = e;
        if (i1 != -1)
        {
            return i1;
        }
        int j1;
        if ((n & 1) == 1)
        {
            j1 = fa.c(1, j) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if ((n & 2) == 2)
        {
            i1 = j1 + fa.c(2, i);
        }
        j1 = i1;
        if ((n & 4) == 4)
        {
            j1 = i1 + fa.c(3, f);
        }
        i1 = j1;
        j1 = ((flag) ? 1 : 0);
        do
        {
            if (j1 >= p.size())
            {
                break;
            }
            i1 = fa.c(4, (cR)p.get(j1)) + i1;
            j1++;
        } while (k1 == 0);
        i1 += c().b();
        e = i1;
        return i1;
    }

    public P b()
    {
        return j();
    }

    public fn b()
    {
        return r;
    }

    public a9 b(int i1)
    {
        return (a9)p.get(i1);
    }

    public final bR c()
    {
        return l;
    }

    public cR c()
    {
        return j();
    }

    public eh c()
    {
        return i();
    }

    public ga c()
    {
        return i();
    }

    public boolean c()
    {
        return (n & 2) == 2;
    }

    public int d()
    {
        return p.size();
    }

    public ga d()
    {
        return a();
    }

    public final boolean d()
    {
        byte byte0 = k;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            k = 1;
            return true;
        }
    }

    protected aH e()
    {
        return R.f().a(org/whispersystems/aw, org/whispersystems/bp);
    }

    public boolean f()
    {
        return (n & 4) == 4;
    }

    public aP g()
    {
        return f;
    }

    public org.whispersystems.bp i()
    {
        return b(this);
    }

    public aw j()
    {
        return g;
    }

    public bm l()
    {
        return f;
    }

    public boolean m()
    {
        return (n & 1) == 1;
    }

    public a3 o()
    {
        return i;
    }

    public a3 p()
    {
        return j;
    }

    public List q()
    {
        return p;
    }

    public List r()
    {
        return p;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        g = new aw(true);
        g.e();
    }
}
