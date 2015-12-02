// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, c_, cu, bb

class i extends c
{

    private static final String z;
    final cu a;

    i(cu cu1)
    {
        a = cu1;
        super();
    }

    public void a(c_ c_1, String s)
    {
        c_.b(c_1.a(0), z);
        cu.d(a).g();
    }

    static 
    {
        char ac[];
        int j;
        int k;
        ac = "\036$W%\005\t".toCharArray();
        k = ac.length;
        j = 0;
_L7:
        char c1;
        if (k <= j)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[j];
        j % 5;
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
        byte byte0 = 115;
_L8:
        ac[j] = (char)(byte0 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 108;
          goto _L8
_L3:
        byte0 = 65;
          goto _L8
_L4:
        byte0 = 58;
          goto _L8
        byte0 = 74;
          goto _L8
    }
}
