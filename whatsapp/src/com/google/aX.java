// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            at, a0, bQ, gV, 
//            k, dZ, gh

final class aX extends at
{

    private static final String z;

    aX(bQ bq)
    {
        super(bq);
    }

    public String c()
    {
        int i = a0.b;
        if (b().b() < 48)
        {
            throw gV.a();
        }
        Object obj = new StringBuilder();
        b(((StringBuilder) (obj)), 8);
        int j = a().a(48, 2);
        ((StringBuilder) (obj)).append(z);
        ((StringBuilder) (obj)).append(j);
        ((StringBuilder) (obj)).append(')');
        j = a().a(50, 10);
        if (j / 100 == 0)
        {
            ((StringBuilder) (obj)).append('0');
        }
        if (j / 10 == 0)
        {
            ((StringBuilder) (obj)).append('0');
        }
        ((StringBuilder) (obj)).append(j);
        ((StringBuilder) (obj)).append(a().a(60, null).a());
        obj = ((StringBuilder) (obj)).toString();
        if (i != 0)
        {
            gh.a++;
        }
        return ((String) (obj));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "'Q,F".toCharArray();
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
        byte byte0 = 85;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 15;
          goto _L8
_L3:
        byte0 = 98;
          goto _L8
_L4:
        byte0 = 21;
          goto _L8
        byte0 = 117;
          goto _L8
    }
}
