// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            f0

class q0
    implements Runnable
{

    private static final String z;
    final f0 a;

    q0(f0 f0_1)
    {
        a = f0_1;
        super();
    }

    public void run()
    {
        f0.a(a, true);
        f0.a(a);
_L2:
        f0.a(a, false);
        return;
        Object obj;
        obj;
_L3:
        Log.a(z, ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
          goto _L3
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\177lj\037\"{f`\0235mfq\0352mjl\016\"jlq\030".toCharArray();
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
    //                   2 97
    //                   3 102;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_102;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 71;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 9;
          goto _L8
_L3:
        byte0 = 3;
          goto _L8
_L4:
        byte0 = 3;
          goto _L8
        byte0 = 124;
          goto _L8
    }
}
