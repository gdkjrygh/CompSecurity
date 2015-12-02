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
//            d2, g2, aP, bp, 
//            d9, bR, eL, dw, 
//            fz, fp, fn, fY, 
//            el, fC, cR, fa, 
//            c, aH, z, dE, 
//            a3, cP, eh, b4, 
//            P, ga

public final class d_ extends d2
    implements g2
{

    public static final int h = 999;
    private static final d_ j;
    public static fn k = new aP();
    private static final long serialVersionUID = 0L;
    private int f;
    private byte g;
    private final bR i;
    private List l;

    private d_(eL el1, z z)
    {
        fz fz1;
        boolean flag;
        boolean flag1;
        int i1;
        flag1 = false;
        i1 = d9.c;
        super();
        g = -1;
        f = -1;
        e();
        fz1 = bR.a();
        flag = false;
_L11:
        boolean flag2;
        boolean flag4;
        boolean flag5;
        flag2 = flag;
        if (flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag5 = flag;
        flag2 = flag;
        flag4 = flag;
        int j1 = el1.f();
        boolean flag3 = flag1;
        j1;
        JVM INSTR lookupswitch 2: default 92
    //                   0: 248
    //                   7994: 128;
           goto _L1 _L2 _L3
_L1:
        flag2 = flag;
        flag4 = flag;
        boolean flag6 = a(el1, fz1, z, j1);
        flag2 = flag;
        if (flag6) goto _L5; else goto _L4
_L4:
        if (i1 == 0) goto _L7; else goto _L6
_L6:
        flag3 = true;
_L3:
        flag1 = flag;
        if ((flag & true)) goto _L9; else goto _L8
_L8:
        flag5 = flag;
        flag2 = flag;
        flag4 = flag;
        l = new ArrayList();
        flag1 = flag | true;
_L9:
        flag5 = flag1;
        flag2 = flag1;
        flag4 = flag1;
        l.add(el1.a(dw.t, z));
        flag2 = flag1;
        flag1 = flag3;
_L5:
        flag = flag2;
        if (i1 == 0) goto _L11; else goto _L10
_L10:
        if ((flag2 & true))
        {
            try
            {
                l = Collections.unmodifiableList(l);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        i = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L7; else goto _L12
_L12:
        flag1 = true;
          goto _L1
        el1;
        flag5 = flag;
        flag2 = flag;
        flag4 = flag;
        throw el1;
        el1;
        flag2 = flag5;
        throw el1.a(this);
        el1;
        if ((flag2 & true))
        {
            try
            {
                l = Collections.unmodifiableList(l);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        i = fz1.c();
        d();
        throw el1;
        el1;
        flag2 = flag4;
        throw (new bp(el1.getMessage())).a(this);
_L7:
        flag1 = true;
        flag2 = flag;
          goto _L5
    }

    d_(eL el1, z z, dE de)
    {
        this(el1, z);
    }

    private d_(fp fp1)
    {
        super(fp1);
        g = -1;
        f = -1;
        i = fp1.c();
    }

    d_(fp fp1, dE de)
    {
        this(fp1);
    }

    private d_(boolean flag)
    {
        g = -1;
        f = -1;
        i = bR.d();
    }

    public static d_ a(a3 a3)
    {
        return (d_)k.a(a3);
    }

    public static d_ a(a3 a3, z z)
    {
        return (d_)k.b(a3, z);
    }

    public static d_ a(eL el1)
    {
        return (d_)k.a(el1);
    }

    public static d_ a(eL el1, z z)
    {
        return (d_)k.b(el1, z);
    }

    public static d_ a(InputStream inputstream)
    {
        return (d_)k.a(inputstream);
    }

    public static d_ a(InputStream inputstream, z z)
    {
        return (d_)k.a(inputstream, z);
    }

    public static d_ a(byte abyte0[])
    {
        return (d_)k.a(abyte0);
    }

    public static d_ a(byte abyte0[], z z)
    {
        return (d_)k.a(abyte0, z);
    }

    public static fY a(d_ d_1)
    {
        return g().a(d_1);
    }

    static List a(d_ d_1, List list)
    {
        d_1.l = list;
        return list;
    }

    public static d_ b(InputStream inputstream)
    {
        return (d_)k.b(inputstream);
    }

    public static d_ b(InputStream inputstream, z z)
    {
        return (d_)k.b(inputstream, z);
    }

    static List b(d_ d_1)
    {
        return d_1.l;
    }

    public static d_ c()
    {
        return j;
    }

    private void e()
    {
        l = Collections.emptyList();
    }

    public static fY g()
    {
        return fY.c();
    }

    public static final cP j()
    {
        return el.l();
    }

    public eh a()
    {
        return f();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public fC a(int i1)
    {
        return (fC)l.get(i1);
    }

    public fY a()
    {
        return a(this);
    }

    protected fY a(b4 b4)
    {
        return new fY(b4, null);
    }

    public void a(fa fa1)
    {
        int j1 = d9.c;
        b();
        c c1 = b();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < l.size())
                {
                    fa1.d(999, (cR)l.get(i1));
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                c1.a(0x20000000, fa1);
                c().a(fa1);
                return;
            }
            i1++;
        } while (true);
    }

    public int b()
    {
        int l1 = d9.c;
        int i1 = f;
        if (i1 != -1)
        {
            return i1;
        }
        int j1 = 0;
        i1 = 0;
        do
        {
label0:
            {
                int k1 = i1;
                if (j1 < l.size())
                {
                    i1 += fa.c(999, (cR)l.get(j1));
                    if (l1 == 0)
                    {
                        break label0;
                    }
                    k1 = i1;
                }
                i1 = a() + k1 + c().b();
                f = i1;
                return i1;
            }
            j1++;
        } while (true);
    }

    public P b()
    {
        return b();
    }

    public d_ b()
    {
        return j;
    }

    public dw b(int i1)
    {
        return (dw)l.get(i1);
    }

    public fn b()
    {
        return k;
    }

    public final bR c()
    {
        return i;
    }

    public cR c()
    {
        return b();
    }

    public eh c()
    {
        return a();
    }

    public ga c()
    {
        return a();
    }

    public int d()
    {
        return l.size();
    }

    public ga d()
    {
        return f();
    }

    public final boolean d()
    {
        int j1 = d9.c;
        int i1 = g;
        if (i1 != -1)
        {
            return i1 == 1;
        }
        i1 = 0;
        do
        {
            if (i1 >= d())
            {
                break;
            }
            if (!b(i1).d())
            {
                g = 0;
                return false;
            }
            i1++;
        } while (j1 == 0);
        if (!c())
        {
            g = 0;
            return false;
        } else
        {
            g = 1;
            return true;
        }
    }

    protected aH e()
    {
        return el.F().a(com/google/d_, com/google/fY);
    }

    public fY f()
    {
        return g();
    }

    public List h()
    {
        return l;
    }

    public List i()
    {
        return l;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        j = new d_(true);
        j.e();
    }
}
