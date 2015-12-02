// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            as, t

class g extends Handler
{

    private static final String z;
    final as a;

    private g(as as1)
    {
        a = as1;
        super();
    }

    g(as as1, t t)
    {
        this(as1);
    }

    public void a()
    {
        removeMessages(1);
    }

    public void a(long l)
    {
        sendMessageDelayed(Message.obtain(this, 1), l);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            Log.i(z);
            break;
        }
        removeMessages(1);
        as.a(a, true);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "8G\000ZA#E\036D\013#^\031E\000oK\023^\0076O_O\0260C\002O\n".toCharArray();
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
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 110;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 64;
          goto _L8
_L3:
        byte0 = 42;
          goto _L8
_L4:
        byte0 = 112;
          goto _L8
        byte0 = 42;
          goto _L8
    }
}
