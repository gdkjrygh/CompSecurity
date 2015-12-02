// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c3;
import com.whatsapp.util.Log;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            wc, qi

class xs extends wc
{

    private static final String z;
    final qi j;

    xs(qi qi, String s, String s1, Vector vector, int i, c3 c3)
    {
        j = qi;
        super(s, s1, vector, i, c3);
    }

    public void a(String s)
    {
        Log.i(z);
        super.a(s);
    }

    static 
    {
        char ac[];
        int i;
        int k;
        ac = "nho\026\001bho\026\013j{i\026\b}G~Z\rfwqf\njl@^\013`mo\031\032}}~M\034/\177mV\f\1778Kv=@8~]\035/hvZ\rzjz".toCharArray();
        k = ac.length;
        i = 0;
_L7:
        char c;
        if (k <= i)
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
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 121;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 15;
          goto _L8
_L3:
        byte0 = 24;
          goto _L8
_L4:
        byte0 = 31;
          goto _L8
        byte0 = 57;
          goto _L8
    }
}
