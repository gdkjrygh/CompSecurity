// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.cj;

// Referenced classes of package com.whatsapp:
//            App, tn

class al_
    implements cj
{

    private static final String z;
    final String a;
    final tn b;

    al_(tn tn, String s)
    {
        b = tn;
        a = s;
        super();
    }

    public void a(String s)
    {
        App.aJ = a;
        App.o((new StringBuilder()).append(App.k()).append(z).toString());
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "sR/A|RUrWdC\017oS`".toCharArray();
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
    //                   1 92
    //                   2 98
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 20;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 51;
          goto _L8
_L3:
        byte0 = 33;
          goto _L8
_L4:
        byte0 = 1;
          goto _L8
        byte0 = 54;
          goto _L8
    }
}
