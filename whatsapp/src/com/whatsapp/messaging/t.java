// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            as

class t
    implements android.os.Handler.Callback
{

    private static final String z;
    final as a;

    t(as as1)
    {
        a = as1;
        super();
    }

    public boolean handleMessage(Message message)
    {
        Log.e(z);
        a.f();
        return true;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "vh9P4}`;Vrm`fLtil'\017ogh,Onz*,Xkgw,D".toCharArray();
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
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 27;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 14;
          goto _L8
_L3:
        byte0 = 5;
          goto _L8
_L4:
        byte0 = 73;
          goto _L8
        byte0 = 32;
          goto _L8
    }
}
