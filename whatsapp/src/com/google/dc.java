// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            d8, cw, aJ, bp, 
//            d9, bR, eL, fz, 
//            ee, fn, ej, el, 
//            fa, a3, aH, z, 
//            dE, cP, eh, b4, 
//            P, cR, ga

public final class dc extends d8
    implements cw
{

    public static final int e = 3;
    private static final dc h;
    public static fn k = new aJ();
    public static final int o = 1;
    public static final int r = 4;
    private static final long serialVersionUID = 0L;
    public static final int t = 2;
    private int f;
    private final bR g;
    private int i;
    private List j;
    private Object l;
    private int m;
    private byte n;
    private List p;
    private int q;
    private Object s;

    private dc(eL el1, z z)
    {
        fz fz1;
        int k1;
        int i2;
        int j3;
        i2 = 0;
        j3 = d9.c;
        super();
        m = -1;
        i = -1;
        n = -1;
        q = -1;
        p();
        fz1 = bR.a();
        k1 = 0;
_L27:
        int i1;
        int j1;
        int l1;
        i1 = k1;
        if (i2 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = k1;
        i1 = k1;
        j1 = k1;
        int k3 = el1.f();
        int j2;
        int k2;
        int l2;
        int i3;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag2 = i2;
        flag1 = i2;
        j2 = k1;
        flag3 = i2;
        l2 = k1;
        flag = i2;
        k2 = k1;
        flag4 = i2;
        l1 = k1;
        flag5 = i2;
        i3 = k1;
        k3;
        JVM INSTR lookupswitch 7: default 184
    //                   0: 923
    //                   8: 220
    //                   10: 307
    //                   16: 481
    //                   18: 572
    //                   26: 750
    //                   34: 813;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        i1 = k1;
        j1 = k1;
        boolean flag6 = a(el1, fz1, z, k3);
        i1 = k1;
        if (flag6) goto _L10; else goto _L9
_L9:
        if (j3 == 0) goto _L12; else goto _L11
_L11:
        flag2 = true;
_L3:
        j2 = k1;
        if ((k1 & 1) == 1) goto _L14; else goto _L13
_L13:
        l1 = k1;
        i1 = k1;
        j1 = k1;
        j = new ArrayList();
        j2 = k1 | 1;
_L14:
        l1 = j2;
        i1 = j2;
        j1 = j2;
        j.add(Integer.valueOf(el1.c()));
        i2 = ((flag2) ? 1 : 0);
        i1 = j2;
        if (j3 == 0) goto _L10; else goto _L15
_L15:
        flag1 = flag2;
_L4:
        l1 = j2;
        i1 = j2;
        j1 = j2;
        i2 = el1.b(el1.l());
        k1 = j2;
        if ((j2 & 1) == 1)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        i1 = j2;
        j1 = j2;
        l1 = el1.p();
        k1 = j2;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        l1 = j2;
        i1 = j2;
        j1 = j2;
        j = new ArrayList();
        k1 = j2 | 1;
_L17:
        l1 = k1;
        i1 = k1;
        j1 = k1;
        if (el1.p() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = k1;
        i1 = k1;
        j1 = k1;
        j.add(Integer.valueOf(el1.c()));
        if (j3 == 0) goto _L17; else goto _L16
_L16:
        i1 = k1;
        j1 = k1;
        el1.a(i2);
        i2 = ((flag1) ? 1 : 0);
        i1 = k1;
        if (j3 == 0) goto _L10; else goto _L18
_L18:
        l2 = k1;
        flag3 = flag1;
_L5:
        k1 = l2;
        if ((l2 & 2) == 2) goto _L20; else goto _L19
_L19:
        l1 = l2;
        i1 = l2;
        j1 = l2;
        p = new ArrayList();
        k1 = l2 | 2;
_L20:
        l1 = k1;
        i1 = k1;
        j1 = k1;
        p.add(Integer.valueOf(el1.c()));
        i2 = ((flag3) ? 1 : 0);
        i1 = k1;
        if (j3 == 0) goto _L10; else goto _L21
_L21:
        k2 = k1;
        flag = flag3;
_L6:
        l1 = k2;
        i1 = k2;
        j1 = k2;
        j2 = el1.b(el1.l());
        k1 = k2;
        if ((k2 & 2) == 2)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        i1 = k2;
        j1 = k2;
        l1 = el1.p();
        k1 = k2;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        l1 = k2;
        i1 = k2;
        j1 = k2;
        p = new ArrayList();
        k1 = k2 | 2;
_L23:
        l1 = k1;
        i1 = k1;
        j1 = k1;
        if (el1.p() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = k1;
        i1 = k1;
        j1 = k1;
        p.add(Integer.valueOf(el1.c()));
        if (j3 == 0) goto _L23; else goto _L22
_L22:
        i1 = k1;
        j1 = k1;
        i2 = k1;
        el1.a(j2);
        i2 = ((flag) ? 1 : 0);
        i1 = k1;
        if (j3 == 0) goto _L10; else goto _L24
_L24:
        l1 = k1;
        flag4 = flag;
_L7:
        i1 = l1;
        j1 = l1;
        i2 = l1;
        f = f | 1;
        i1 = l1;
        j1 = l1;
        i2 = l1;
        s = el1.x();
        i2 = ((flag4) ? 1 : 0);
        i1 = l1;
        if (j3 == 0) goto _L10; else goto _L25
_L25:
        i3 = l1;
        flag5 = flag4;
_L8:
        i1 = i3;
        j1 = i3;
        i2 = i3;
        f = f | 2;
        i1 = i3;
        j1 = i3;
        i2 = i3;
        l = el1.x();
        i1 = i3;
        i2 = ((flag5) ? 1 : 0);
_L10:
        k1 = i1;
        if (j3 == 0) goto _L27; else goto _L26
_L26:
        if ((i1 & 1) == 1)
        {
            try
            {
                j = Collections.unmodifiableList(j);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 2) == 2)
        {
            try
            {
                p = Collections.unmodifiableList(p);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        g = fz1.c();
        d();
        return;
_L2:
        if (j3 == 0) goto _L12; else goto _L28
_L28:
        i2 = 1;
          goto _L1
        el1;
        l1 = k1;
        i1 = k1;
        j1 = k1;
        throw el1;
        el1;
        i1 = l1;
        throw el1.a(this);
        el1;
        if ((i1 & 1) == 1)
        {
            try
            {
                j = Collections.unmodifiableList(j);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 2) == 2)
        {
            try
            {
                p = Collections.unmodifiableList(p);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        g = fz1.c();
        d();
        throw el1;
        el1;
        l1 = j2;
        i1 = j2;
        j1 = j2;
        throw el1;
        el1;
        i1 = j1;
        throw (new bp(el1.getMessage())).a(this);
        el1;
        l1 = k1;
        i1 = k1;
        j1 = k1;
        throw el1;
        el1;
        l1 = k2;
        i1 = k2;
        j1 = k2;
        throw el1;
        el1;
        i1 = i2;
        j1 = i2;
        throw el1;
        el1;
        l1 = i2;
        i1 = i2;
        j1 = i2;
        throw el1;
_L12:
        i2 = 1;
        i1 = k1;
          goto _L10
    }

    dc(eL el1, z z, dE de)
    {
        this(el1, z);
    }

    private dc(ee ee1)
    {
        super(ee1);
        m = -1;
        i = -1;
        n = -1;
        q = -1;
        g = ee1.c();
    }

    dc(ee ee1, dE de)
    {
        this(ee1);
    }

    private dc(boolean flag)
    {
        m = -1;
        i = -1;
        n = -1;
        q = -1;
        g = bR.d();
    }

    static int a(dc dc1, int i1)
    {
        dc1.f = i1;
        return i1;
    }

    public static dc a(a3 a3_1)
    {
        return (dc)k.a(a3_1);
    }

    public static dc a(a3 a3_1, z z)
    {
        return (dc)k.b(a3_1, z);
    }

    public static dc a(eL el1)
    {
        return (dc)k.a(el1);
    }

    public static dc a(eL el1, z z)
    {
        return (dc)k.b(el1, z);
    }

    public static dc a(InputStream inputstream)
    {
        return (dc)k.b(inputstream);
    }

    public static dc a(InputStream inputstream, z z)
    {
        return (dc)k.b(inputstream, z);
    }

    public static dc a(byte abyte0[])
    {
        return (dc)k.a(abyte0);
    }

    public static dc a(byte abyte0[], z z)
    {
        return (dc)k.a(abyte0, z);
    }

    static Object a(dc dc1, Object obj)
    {
        dc1.l = obj;
        return obj;
    }

    static List a(dc dc1)
    {
        return dc1.j;
    }

    static List a(dc dc1, List list)
    {
        dc1.p = list;
        return list;
    }

    public static dc b(InputStream inputstream)
    {
        return (dc)k.a(inputstream);
    }

    public static dc b(InputStream inputstream, z z)
    {
        return (dc)k.a(inputstream, z);
    }

    public static ej b(dc dc1)
    {
        return k().a(dc1);
    }

    static Object b(dc dc1, Object obj)
    {
        dc1.s = obj;
        return obj;
    }

    static List b(dc dc1, List list)
    {
        dc1.j = list;
        return list;
    }

    public static final cP c()
    {
        return el.i();
    }

    static List c(dc dc1)
    {
        return dc1.p;
    }

    static Object d(dc dc1)
    {
        return dc1.l;
    }

    static Object e(dc dc1)
    {
        return dc1.s;
    }

    public static dc g()
    {
        return h;
    }

    public static ej k()
    {
        return ej.a();
    }

    private void p()
    {
        j = Collections.emptyList();
        p = Collections.emptyList();
        s = "";
        l = "";
    }

    public int a()
    {
        return j.size();
    }

    public int a(int i1)
    {
        return ((Integer)j.get(i1)).intValue();
    }

    public eh a()
    {
        return f();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected ej a(b4 b4)
    {
        return new ej(b4, null);
    }

    public void a(fa fa1)
    {
        boolean flag = false;
        int j1 = d9.c;
        b();
        if (e().size() > 0)
        {
            fa1.j(10);
            fa1.j(m);
        }
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < j.size())
                {
                    fa1.g(((Integer)j.get(i1)).intValue());
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                i1 = ((flag) ? 1 : 0);
                if (o().size() > 0)
                {
                    fa1.j(18);
                    fa1.j(i);
                    i1 = ((flag) ? 1 : 0);
                }
                do
                {
                    if (i1 >= p.size())
                    {
                        break;
                    }
                    fa1.g(((Integer)p.get(i1)).intValue());
                    i1++;
                } while (j1 == 0);
                if ((f & 1) == 1)
                {
                    fa1.d(3, b());
                }
                if ((f & 2) == 2)
                {
                    fa1.d(4, j());
                }
                c().a(fa1);
                return;
            }
            i1++;
        } while (true);
    }

    public int b()
    {
        int i1;
        int j1;
        boolean flag;
        int l1;
        flag = false;
        l1 = d9.c;
        i1 = q;
        if (i1 != -1)
        {
            return i1;
        }
        j1 = 0;
        i1 = 0;
_L11:
        int k1 = i1;
        if (j1 >= j.size()) goto _L2; else goto _L1
_L1:
        i1 += fa.d(((Integer)j.get(j1)).intValue());
        if (l1 == 0) goto _L4; else goto _L3
_L3:
        k1 = i1;
_L2:
        j1 = 0 + k1;
        if (!e().isEmpty())
        {
            j1 = j1 + 1 + fa.d(k1);
        }
        m = k1;
        i1 = 0;
        k1 = ((flag) ? 1 : 0);
_L8:
        if (k1 >= p.size()) goto _L6; else goto _L5
_L5:
        i1 = fa.d(((Integer)p.get(k1)).intValue()) + i1;
        k1++;
        if (l1 == 0) goto _L8; else goto _L7
_L7:
        k1 = i1;
_L9:
        j1 += k1;
        i1 = j1;
        if (!o().isEmpty())
        {
            i1 = j1 + 1 + fa.d(k1);
        }
        i = k1;
        j1 = i1;
        if ((f & 1) == 1)
        {
            j1 = i1 + fa.c(3, b());
        }
        i1 = j1;
        if ((f & 2) == 2)
        {
            i1 = j1 + fa.c(4, j());
        }
        i1 = c().b() + i1;
        q = i1;
        return i1;
_L6:
        k1 = i1;
        if (true) goto _L9; else goto _L4
_L4:
        j1++;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public int b(int i1)
    {
        return ((Integer)p.get(i1)).intValue();
    }

    public P b()
    {
        return m();
    }

    public a3 b()
    {
        Object obj = s;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            s = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public fn b()
    {
        return k;
    }

    public final bR c()
    {
        return g;
    }

    public cR c()
    {
        return m();
    }

    public eh c()
    {
        return d();
    }

    public ga c()
    {
        return d();
    }

    public ej d()
    {
        return b(this);
    }

    public ga d()
    {
        return f();
    }

    public final boolean d()
    {
        byte byte0 = n;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            n = 1;
            return true;
        }
    }

    protected aH e()
    {
        return el.x().a(com/google/dc, com/google/ej);
    }

    public List e()
    {
        return j;
    }

    public ej f()
    {
        return k();
    }

    public int h()
    {
        return p.size();
    }

    public String i()
    {
        Object obj = l;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            l = s1;
        }
        return s1;
    }

    public a3 j()
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

    public boolean l()
    {
        return (f & 2) == 2;
    }

    public dc m()
    {
        return h;
    }

    public boolean n()
    {
        return (f & 1) == 1;
    }

    public List o()
    {
        return p;
    }

    public String q()
    {
        Object obj = s;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            s = s1;
        }
        return s1;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        h = new dc(true);
        h.p();
    }
}
