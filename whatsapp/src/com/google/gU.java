// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google:
//            fc, gw, dM, b2, 
//            fH, dI, fW, gH, 
//            c7, cP, bd, fl, 
//            P

public final class gU
    implements fc, gw
{

    private static final String z;
    private final int a;
    private dI b[];
    private final cP c;
    private dM d;
    private final String e;
    private final fW f;

    private gU(dM dm, fW fw, cP cp, int i)
    {
        a = i;
        d = dm;
        e = b2.a(fw, cp, dm.k());
        f = fw;
        c = cp;
        if (dm.g() == 0)
        {
            throw new fH(this, z, null);
        }
        b = new dI[dm.g()];
        for (i = 0; i < dm.g(); i++)
        {
            b[i] = new dI(dm.a(i), fw, this, i, null);
        }

        fW.a(fw).a(this);
    }

    gU(dM dm, fW fw, cP cp, int i, bd bd)
    {
        this(dm, fw, cp, i);
    }

    private void a(dM dm)
    {
        d = dm;
        for (int i = 0; i < b.length; i++)
        {
            dI.a(b[i], dm.a(i));
        }

    }

    static void a(gU gu, dM dm)
    {
        gu.a(dm);
    }

    public dI a(int i)
    {
        return (dI)gH.b(fW.a(f)).get(new c7(this, i));
    }

    public dI a(String s)
    {
        s = fW.a(f).a((new StringBuilder()).append(e).append('.').append(s).toString());
        if (s != null && (s instanceof dI))
        {
            return (dI)s;
        } else
        {
            return null;
        }
    }

    public fW a()
    {
        return f;
    }

    public fl a(int i)
    {
        return a(i);
    }

    public List a()
    {
        return Collections.unmodifiableList(Arrays.asList(b));
    }

    public dM b()
    {
        return d;
    }

    public String b()
    {
        return d.k();
    }

    public String c()
    {
        return e;
    }

    public P d()
    {
        return b();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\177~M\0261\032}M\b6\032sW\0256[yV[#N0T\036#Id\030\024,_0N\032.Ou\026".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 66;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 58;
          goto _L8
_L3:
        byte0 = 16;
          goto _L8
_L4:
        byte0 = 56;
          goto _L8
        byte0 = 123;
          goto _L8
    }
}
