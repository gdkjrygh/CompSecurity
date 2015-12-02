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
//            d8, bg, a2, bp, 
//            d9, bR, eL, dc, 
//            fz, ee, fn, eN, 
//            el, cw, cR, fa, 
//            aH, z, dE, a3, 
//            cP, b4, eh, P, 
//            ga

public final class dg extends d8
    implements bg
{

    private static final dg e;
    public static fn g = new a2();
    public static final int h = 1;
    private static final long serialVersionUID = 0L;
    private int f;
    private byte i;
    private List j;
    private final bR k;

    private dg(eL el1, z z)
    {
        fz fz1;
        boolean flag;
        boolean flag1;
        int l;
        flag1 = false;
        l = d9.c;
        super();
        i = -1;
        f = -1;
        h();
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
        int i1 = el1.f();
        boolean flag3 = flag1;
        i1;
        JVM INSTR lookupswitch 2: default 92
    //                   0: 248
    //                   10: 128;
           goto _L1 _L2 _L3
_L1:
        flag2 = flag;
        flag4 = flag;
        boolean flag6 = a(el1, fz1, z, i1);
        flag2 = flag;
        if (flag6) goto _L5; else goto _L4
_L4:
        if (l == 0) goto _L7; else goto _L6
_L6:
        flag3 = true;
_L3:
        flag1 = flag;
        if ((flag & true)) goto _L9; else goto _L8
_L8:
        flag5 = flag;
        flag2 = flag;
        flag4 = flag;
        j = new ArrayList();
        flag1 = flag | true;
_L9:
        flag5 = flag1;
        flag2 = flag1;
        flag4 = flag1;
        j.add(el1.a(dc.k, z));
        flag2 = flag1;
        flag1 = flag3;
_L5:
        flag = flag2;
        if (l == 0) goto _L11; else goto _L10
_L10:
        if ((flag2 & true))
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
        k = fz1.c();
        d();
        return;
_L2:
        if (l == 0) goto _L7; else goto _L12
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
                j = Collections.unmodifiableList(j);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        k = fz1.c();
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

    dg(eL el1, z z, dE de)
    {
        this(el1, z);
    }

    private dg(ee ee1)
    {
        super(ee1);
        i = -1;
        f = -1;
        k = ee1.c();
    }

    dg(ee ee1, dE de)
    {
        this(ee1);
    }

    private dg(boolean flag)
    {
        i = -1;
        f = -1;
        k = bR.d();
    }

    public static dg a(a3 a3)
    {
        return (dg)g.a(a3);
    }

    public static dg a(a3 a3, z z)
    {
        return (dg)g.b(a3, z);
    }

    public static dg a(eL el1)
    {
        return (dg)g.a(el1);
    }

    public static dg a(eL el1, z z)
    {
        return (dg)g.b(el1, z);
    }

    public static dg a(InputStream inputstream)
    {
        return (dg)g.a(inputstream);
    }

    public static dg a(InputStream inputstream, z z)
    {
        return (dg)g.a(inputstream, z);
    }

    public static dg a(byte abyte0[])
    {
        return (dg)g.a(abyte0);
    }

    public static dg a(byte abyte0[], z z)
    {
        return (dg)g.a(abyte0, z);
    }

    public static eN a()
    {
        return eN.e();
    }

    static List a(dg dg1)
    {
        return dg1.j;
    }

    static List a(dg dg1, List list)
    {
        dg1.j = list;
        return list;
    }

    public static dg b(InputStream inputstream)
    {
        return (dg)g.b(inputstream);
    }

    public static dg b(InputStream inputstream, z z)
    {
        return (dg)g.b(inputstream, z);
    }

    public static eN b(dg dg1)
    {
        return a().a(dg1);
    }

    public static dg c()
    {
        return e;
    }

    public static final cP d()
    {
        return el.b();
    }

    private void h()
    {
        j = Collections.emptyList();
    }

    public cw a(int l)
    {
        return (cw)j.get(l);
    }

    protected eN a(b4 b4)
    {
        return new eN(b4, null);
    }

    public eh a()
    {
        return g();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    public void a(fa fa1)
    {
        int i1 = d9.c;
        b();
        int l = 0;
        do
        {
label0:
            {
                if (l < j.size())
                {
                    fa1.d(1, (cR)j.get(l));
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                c().a(fa1);
                return;
            }
            l++;
        } while (true);
    }

    public int b()
    {
        int k1 = d9.c;
        int l = f;
        if (l != -1)
        {
            return l;
        }
        int i1 = 0;
        l = 0;
        do
        {
label0:
            {
                int j1 = l;
                if (i1 < j.size())
                {
                    l += fa.c(1, (cR)j.get(i1));
                    if (k1 == 0)
                    {
                        break label0;
                    }
                    j1 = l;
                }
                l = c().b() + j1;
                f = l;
                return l;
            }
            i1++;
        } while (true);
    }

    public P b()
    {
        return f();
    }

    public dc b(int l)
    {
        return (dc)j.get(l);
    }

    public fn b()
    {
        return g;
    }

    public List b()
    {
        return j;
    }

    public final bR c()
    {
        return k;
    }

    public cR c()
    {
        return f();
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
        return g();
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
        return el.O().a(com/google/dg, com/google/eN);
    }

    public eN e()
    {
        return b(this);
    }

    public dg f()
    {
        return e;
    }

    public eN g()
    {
        return a();
    }

    public int i()
    {
        return j.size();
    }

    public List j()
    {
        return j;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        e = new dg(true);
        e.h();
    }
}
