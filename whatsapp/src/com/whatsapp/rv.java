// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            zb

class rv
    implements Runnable
{

    private static final String z;
    final zb a;

    rv(zb zb)
    {
        a = zb;
        super();
    }

    public void run()
    {
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            stringbuilder.append(z);
        } while (true);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "a4[3&au".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 75;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 4;
          goto _L8
_L3:
        byte0 = 85;
          goto _L8
_L4:
        byte0 = 47;
          goto _L8
        byte0 = 19;
          goto _L8
    }
}
