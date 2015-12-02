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
//            am, x, ac, af, 
//            ab, ag, ai, aF, 
//            aN, R, f, aG, 
//            g, l

public final class a5 extends d8
    implements am
{

    public static final int f = 2;
    public static fn i = new x();
    public static final int m = 1;
    public static final int n = 4;
    public static final int o = 3;
    private static final a5 p;
    private static final long serialVersionUID = 0L;
    private int e;
    private final bR g;
    private List h;
    private byte j;
    private ag k;
    private int l;
    private int q;
    private af r;

    private a5(eL el, z z)
    {
        fz fz1;
        int i1;
        int j1;
        int j2;
        j1 = 0;
        j2 = ac.H;
        super();
        j = -1;
        e = -1;
        e();
        fz1 = bR.a();
        i1 = 0;
_L25:
        int k1;
        int l1;
        int i2;
        k1 = i1;
        if (j1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = i1;
        k1 = i1;
        i2 = i1;
        int k2 = el.f();
        boolean flag;
        l1 = j1;
        flag = j1;
        k2;
        JVM INSTR lookupswitch 5: default 120
    //                   0: 600
    //                   8: 157
    //                   18: 795
    //                   26: 792
    //                   34: 474;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        k1 = i1;
        i2 = i1;
        boolean flag1 = a(el, fz1, z, k2);
        k1 = i1;
        if (flag1) goto _L8; else goto _L7
_L7:
        if (j2 == 0) goto _L10; else goto _L9
_L9:
        l1 = 1;
_L3:
        k1 = i1;
        i2 = i1;
        l = l | 1;
        k1 = i1;
        i2 = i1;
        q = el.a();
        j1 = l1;
        k1 = i1;
        if (j2 == 0) goto _L8; else goto _L11
_L11:
        j1 = l1;
_L4:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        if ((l & 2) != 2) goto _L13; else goto _L12
_L12:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        Object obj = r.c();
_L28:
        k1 = i1;
        i2 = i1;
        r = (af)el.a(af.PARSER, z);
        if (obj == null) goto _L15; else goto _L14
_L14:
        k1 = i1;
        i2 = i1;
        ((ab) (obj)).a(r);
        k1 = i1;
        i2 = i1;
        r = ((ab) (obj)).c();
_L15:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        l = l | 2;
        k1 = j1;
        if (j2 == 0) goto _L16; else goto _L5
_L5:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        if ((l & 4) != 4) goto _L18; else goto _L17
_L17:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        obj = k.j();
_L27:
        k1 = i1;
        i2 = i1;
        k = (ag)el.a(ag.PARSER, z);
        if (obj == null) goto _L20; else goto _L19
_L19:
        k1 = i1;
        i2 = i1;
        ((ai) (obj)).a(k);
        k1 = i1;
        i2 = i1;
        k = ((ai) (obj)).b();
_L20:
        k1 = i1;
        i2 = i1;
        l = l | 4;
        k1 = j1;
        if (j2 == 0) goto _L16; else goto _L21
_L21:
        flag = j1;
_L6:
        j1 = i1;
        if ((i1 & 8) == 8) goto _L23; else goto _L22
_L22:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        h = new ArrayList();
        j1 = i1 | 8;
_L23:
        l1 = j1;
        k1 = j1;
        i2 = j1;
        h.add(el.a(aF.PARSER, z));
        k1 = j1;
        j1 = ((flag) ? 1 : 0);
_L8:
        i1 = k1;
        if (j2 == 0) goto _L25; else goto _L24
_L24:
        if ((k1 & 8) == 8)
        {
            try
            {
                h = Collections.unmodifiableList(h);
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        g = fz1.c();
        d();
        return;
_L2:
        if (j2 == 0) goto _L10; else goto _L26
_L26:
        j1 = 1;
          goto _L1
        el;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        throw el;
        el;
        k1 = l1;
        throw el.a(this);
        el;
        if ((k1 & 8) == 8)
        {
            try
            {
                h = Collections.unmodifiableList(h);
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        g = fz1.c();
        d();
        throw el;
        el;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        throw el;
        el;
        k1 = i2;
        throw (new bp(el.getMessage())).a(this);
        el;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        throw el;
        el;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        throw el;
        el;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        throw el;
_L16:
        j1 = k1;
        k1 = i1;
          goto _L8
_L18:
        obj = null;
          goto _L27
_L13:
        obj = null;
          goto _L28
_L10:
        j1 = 1;
        k1 = i1;
          goto _L8
    }

    a5(eL el, z z, aG ag1)
    {
        this(el, z);
    }

    private a5(ee ee1)
    {
        super(ee1);
        j = -1;
        e = -1;
        g = ee1.c();
    }

    a5(ee ee1, aG ag1)
    {
        this(ee1);
    }

    private a5(boolean flag)
    {
        j = -1;
        e = -1;
        g = bR.d();
    }

    static int a(a5 a5_1, int i1)
    {
        a5_1.l = i1;
        return i1;
    }

    static List a(a5 a5_1)
    {
        return a5_1.h;
    }

    static List a(a5 a5_1, List list)
    {
        a5_1.h = list;
        return list;
    }

    public static a5 a(a3 a3)
    {
        return (a5)i.a(a3);
    }

    public static a5 a(a3 a3, z z)
    {
        return (a5)i.b(a3, z);
    }

    public static a5 a(eL el)
    {
        return (a5)i.a(el);
    }

    public static a5 a(eL el, z z)
    {
        return (a5)i.b(el, z);
    }

    public static a5 a(InputStream inputstream)
    {
        return (a5)i.a(inputstream);
    }

    public static a5 a(InputStream inputstream, z z)
    {
        return (a5)i.b(inputstream, z);
    }

    public static a5 a(byte abyte0[])
    {
        return (a5)i.a(abyte0);
    }

    public static a5 a(byte abyte0[], z z)
    {
        return (a5)i.a(abyte0, z);
    }

    public static aN a()
    {
        return aN.n();
    }

    static af a(a5 a5_1, af af1)
    {
        a5_1.r = af1;
        return af1;
    }

    static ag a(a5 a5_1, ag ag1)
    {
        a5_1.k = ag1;
        return ag1;
    }

    static int b(a5 a5_1, int i1)
    {
        a5_1.q = i1;
        return i1;
    }

    public static a5 b(InputStream inputstream)
    {
        return (a5)i.b(inputstream);
    }

    public static a5 b(InputStream inputstream, z z)
    {
        return (a5)i.a(inputstream, z);
    }

    public static aN b(a5 a5_1)
    {
        return a().a(a5_1);
    }

    private void e()
    {
        q = 0;
        r = af.l();
        k = ag.a();
        h = Collections.emptyList();
    }

    public static a5 l()
    {
        return p;
    }

    static boolean q()
    {
        return d;
    }

    static boolean r()
    {
        return d;
    }

    public static final cP s()
    {
        return org.whispersystems.R.z();
    }

    public eh a()
    {
        return p();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public aF a(int i1)
    {
        return (aF)h.get(i1);
    }

    protected aN a(b4 b4)
    {
        return new aN(b4, null);
    }

    public void a(fa fa1)
    {
        int j1 = ac.H;
        b();
        if ((l & 1) == 1)
        {
            fa1.i(1, q);
        }
        if ((l & 2) == 2)
        {
            fa1.d(2, r);
        }
        if ((l & 4) == 4)
        {
            fa1.d(3, k);
        }
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < h.size())
                {
                    fa1.d(4, (cR)h.get(i1));
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
        if ((l & 1) == 1)
        {
            j1 = fa.g(1, q) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if ((l & 2) == 2)
        {
            i1 = j1 + fa.c(2, r);
        }
        j1 = i1;
        if ((l & 4) == 4)
        {
            j1 = i1 + fa.c(3, k);
        }
        i1 = j1;
        j1 = ((flag) ? 1 : 0);
        do
        {
            if (j1 >= h.size())
            {
                break;
            }
            i1 = fa.c(4, (cR)h.get(j1)) + i1;
            j1++;
        } while (k1 == 0);
        i1 += c().b();
        e = i1;
        return i1;
    }

    public P b()
    {
        return t();
    }

    public fn b()
    {
        return i;
    }

    public f b(int i1)
    {
        return (f)h.get(i1);
    }

    public int c()
    {
        return q;
    }

    public final bR c()
    {
        return g;
    }

    public cR c()
    {
        return t();
    }

    public eh c()
    {
        return f();
    }

    public ga c()
    {
        return f();
    }

    public ga d()
    {
        return p();
    }

    public final boolean d()
    {
        byte byte0 = j;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            j = 1;
            return true;
        }
    }

    protected aH e()
    {
        return R.t().a(org/whispersystems/a5, org/whispersystems/aN);
    }

    public aN f()
    {
        return b(this);
    }

    public g g()
    {
        return r;
    }

    public l h()
    {
        return k;
    }

    public List i()
    {
        return h;
    }

    public boolean j()
    {
        return (l & 1) == 1;
    }

    public ag k()
    {
        return k;
    }

    public List m()
    {
        return h;
    }

    public af n()
    {
        return r;
    }

    public int o()
    {
        return h.size();
    }

    public aN p()
    {
        return a();
    }

    public a5 t()
    {
        return p;
    }

    public boolean u()
    {
        return (l & 4) == 4;
    }

    public boolean v()
    {
        return (l & 2) == 2;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        p = new a5(true);
        p.e();
    }
}
