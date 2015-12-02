// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            fc, cn, d4, fW, 
//            gH, ca, cP, fH, 
//            bd, P

public final class dm
    implements fc
{

    private static final String z[];
    private final String a;
    private final int b;
    private cP c;
    private final cn d;
    private cP e;
    private final fW f;
    private d4 g;

    private dm(d4 d4_1, fW fw, cn cn1, int i)
    {
        b = i;
        g = d4_1;
        f = fw;
        d = cn1;
        a = (new StringBuilder()).append(cn1.c()).append('.').append(d4_1.d()).toString();
        fW.a(fw).a(this);
    }

    dm(d4 d4_1, fW fw, cn cn1, int i, bd bd)
    {
        this(d4_1, fw, cn1, i);
    }

    private void a(d4 d4_1)
    {
        g = d4_1;
    }

    static void a(dm dm1)
    {
        dm1.b();
    }

    static void a(dm dm1, d4 d4_1)
    {
        dm1.a(d4_1);
    }

    private void b()
    {
        fc fc1 = fW.a(f).a(g.p(), this, ca.TYPES_ONLY);
        if (!(fc1 instanceof cP))
        {
            throw new fH(this, (new StringBuilder()).append('"').append(g.p()).append(z[0]).toString(), null);
        }
        c = (cP)fc1;
        fc1 = fW.a(f).a(g.m(), this, ca.TYPES_ONLY);
        if (!(fc1 instanceof cP))
        {
            throw new fH(this, (new StringBuilder()).append('"').append(g.m()).append(z[1]).toString(), null);
        } else
        {
            e = (cP)fc1;
            return;
        }
    }

    public d4 a()
    {
        return g;
    }

    public fW a()
    {
        return f;
    }

    public String b()
    {
        return g.d();
    }

    public String c()
    {
        return a;
    }

    public P d()
    {
        return a();
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "@1\035 o\f~\000s.B|\021 <\003v\021s;\033a\021}".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "@1\035 o\f~\000s.B|\021 <\003v\021s;\033a\021}".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 130
    //                   1 136
    //                   2 142
    //                   3 148;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_148;
_L1:
        byte0 = 79;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 98;
          goto _L7
_L3:
        byte0 = 17;
          goto _L7
_L4:
        byte0 = 116;
          goto _L7
        byte0 = 83;
          goto _L7
_L14:
        byte byte0;
        if (j <= i)
        {
            z = (new String[] {
                obj, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 210
    //                   1 216
    //                   2 222
    //                   3 228;
           goto _L8 _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_228;
_L8:
        byte byte1 = 79;
_L15:
        ac[i] = (char)(byte1 ^ c1);
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        byte1 = 98;
          goto _L15
_L10:
        byte1 = 17;
          goto _L15
_L11:
        byte1 = 116;
          goto _L15
        byte1 = 83;
          goto _L15
    }
}
