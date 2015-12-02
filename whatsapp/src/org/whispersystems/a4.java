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
//            ar, w, ac, a5, 
//            aE, R, am, aG

public final class a4 extends d8
    implements ar
{

    public static final int f = 1;
    private static final a4 j;
    public static fn k = new w();
    private static final long serialVersionUID = 0L;
    private int e;
    private byte g;
    private final bR h;
    private List i;

    private a4(eL el, z z)
    {
        fz fz1;
        boolean flag;
        boolean flag1;
        int i1;
        flag1 = false;
        i1 = ac.H;
        super();
        g = -1;
        e = -1;
        b();
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
        int j1 = el.f();
        boolean flag3 = flag1;
        j1;
        JVM INSTR lookupswitch 2: default 92
    //                   0: 248
    //                   10: 128;
           goto _L1 _L2 _L3
_L1:
        flag2 = flag;
        flag4 = flag;
        boolean flag6 = a(el, fz1, z, j1);
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
        i = new ArrayList();
        flag1 = flag | true;
_L9:
        flag5 = flag1;
        flag2 = flag1;
        flag4 = flag1;
        i.add(el.a(a5.i, z));
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
                i = Collections.unmodifiableList(i);
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        h = fz1.c();
        d();
        return;
_L2:
        if (i1 == 0) goto _L7; else goto _L12
_L12:
        flag1 = true;
          goto _L1
        el;
        flag5 = flag;
        flag2 = flag;
        flag4 = flag;
        throw el;
        el;
        flag2 = flag5;
        throw el.a(this);
        el;
        if ((flag2 & true))
        {
            try
            {
                i = Collections.unmodifiableList(i);
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                throw el;
            }
        }
        h = fz1.c();
        d();
        throw el;
        el;
        flag2 = flag4;
        throw (new bp(el.getMessage())).a(this);
_L7:
        flag1 = true;
        flag2 = flag;
          goto _L5
    }

    a4(eL el, z z, aG ag)
    {
        this(el, z);
    }

    private a4(ee ee1)
    {
        super(ee1);
        g = -1;
        e = -1;
        h = ee1.c();
    }

    a4(ee ee1, aG ag)
    {
        this(ee1);
    }

    private a4(boolean flag)
    {
        g = -1;
        e = -1;
        h = bR.d();
    }

    static List a(a4 a4_1)
    {
        return a4_1.i;
    }

    static List a(a4 a4_1, List list)
    {
        a4_1.i = list;
        return list;
    }

    public static a4 a(a3 a3)
    {
        return (a4)k.a(a3);
    }

    public static a4 a(a3 a3, z z)
    {
        return (a4)k.b(a3, z);
    }

    public static a4 a(eL el)
    {
        return (a4)k.a(el);
    }

    public static a4 a(eL el, z z)
    {
        return (a4)k.b(el, z);
    }

    public static a4 a(InputStream inputstream)
    {
        return (a4)k.b(inputstream);
    }

    public static a4 a(InputStream inputstream, z z)
    {
        return (a4)k.a(inputstream, z);
    }

    public static a4 a(byte abyte0[])
    {
        return (a4)k.a(abyte0);
    }

    public static a4 a(byte abyte0[], z z)
    {
        return (a4)k.a(abyte0, z);
    }

    static boolean a()
    {
        return d;
    }

    public static a4 b(InputStream inputstream)
    {
        return (a4)k.a(inputstream);
    }

    public static a4 b(InputStream inputstream, z z)
    {
        return (a4)k.b(inputstream, z);
    }

    public static aE b(a4 a4_1)
    {
        return l().a(a4_1);
    }

    private void b()
    {
        i = Collections.emptyList();
    }

    public static a4 f()
    {
        return j;
    }

    public static final cP g()
    {
        return R.g();
    }

    static boolean j()
    {
        return d;
    }

    public static aE l()
    {
        return aE.a();
    }

    public eh a()
    {
        return k();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected aE a(b4 b4)
    {
        return new aE(b4, null);
    }

    public am a(int i1)
    {
        return (am)i.get(i1);
    }

    public void a(fa fa1)
    {
        int j1 = ac.H;
        b();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < i.size())
                {
                    fa1.d(1, (cR)i.get(i1));
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
        int l1 = ac.H;
        int i1 = e;
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
                if (j1 < i.size())
                {
                    i1 += fa.c(1, (cR)i.get(j1));
                    if (l1 == 0)
                    {
                        break label0;
                    }
                    k1 = i1;
                }
                i1 = c().b() + k1;
                e = i1;
                return i1;
            }
            j1++;
        } while (true);
    }

    public P b()
    {
        return i();
    }

    public fn b()
    {
        return k;
    }

    public a5 b(int i1)
    {
        return (a5)i.get(i1);
    }

    public final bR c()
    {
        return h;
    }

    public cR c()
    {
        return i();
    }

    public eh c()
    {
        return c();
    }

    public ga c()
    {
        return c();
    }

    public aE c()
    {
        return b(this);
    }

    public ga d()
    {
        return k();
    }

    public List d()
    {
        return i;
    }

    public final boolean d()
    {
        byte byte0 = g;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            g = 1;
            return true;
        }
    }

    protected aH e()
    {
        return R.B().a(org/whispersystems/a4, org/whispersystems/aE);
    }

    public List e()
    {
        return i;
    }

    public int h()
    {
        return i.size();
    }

    public a4 i()
    {
        return j;
    }

    public aE k()
    {
        return l();
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    static 
    {
        j = new a4(true);
        j.b();
    }
}
