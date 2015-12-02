// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            vj

class mv extends Handler
{

    private static final String z;
    final vj a;

    mv(vj vj1)
    {
        a = vj1;
        super();
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        Log.e(z);
        vj.b(a).removeMessages(1);
        if (android.os.Build.VERSION.SDK_INT < 17 ? !vj.a(a).isFinishing() : !vj.a(a).isDestroyed())
        {
            vj.a(a).showDialog(200);
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
        ac = "\031\034\0075^\026\024\006;K\033\026\0079P\n\025\0059J@\r\0341]\000\f\001".toCharArray();
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
        byte byte0 = 56;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 111;
          goto _L8
_L3:
        byte0 = 121;
          goto _L8
_L4:
        byte0 = 117;
          goto _L8
        byte0 = 92;
          goto _L8
    }
}
