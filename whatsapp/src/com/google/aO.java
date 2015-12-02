// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            at, k, bQ

final class aO extends at
{

    private static final String z;

    aO(bQ bq)
    {
        super(bq);
    }

    public String c()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(z);
        int i = stringbuilder.length();
        stringbuilder.append(a().a(4, 4));
        a(stringbuilder, 8, i);
        return a().a(stringbuilder, 48);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "3s]x".toCharArray();
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
        byte byte0 = 68;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 27;
          goto _L8
_L3:
        byte0 = 67;
          goto _L8
_L4:
        byte0 = 108;
          goto _L8
        byte0 = 81;
          goto _L8
    }
}
