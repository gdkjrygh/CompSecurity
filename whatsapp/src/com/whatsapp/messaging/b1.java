// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            as, t

class b1 extends Handler
{

    private static final String z;
    final as a;

    private b1(as as1)
    {
        a = as1;
        super();
    }

    b1(as as1, t t)
    {
        this(as1);
    }

    public void a()
    {
        removeMessages(0);
    }

    public void a(c4 c4_1, long l)
    {
        sendMessageDelayed(Message.obtain(this, 0, c4_1), l);
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (bg.a(((c4)message.obj).M, 4) < 0)
        {
            Log.w(z);
            removeMessages(0);
            as.a(a, true);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\034\033%\006\004\007\031;\030N\007\002<\031EK\033&\021Y\001\0250\037[\020Y;\031E\001".toCharArray();
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
        byte byte0 = 43;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 100;
          goto _L8
_L3:
        byte0 = 118;
          goto _L8
_L4:
        byte0 = 85;
          goto _L8
        byte0 = 118;
          goto _L8
    }
}
