// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, tt, ao6, ey

class wm
    implements Runnable
{

    private static final String z;
    final App a;

    wm(App app)
    {
        a = app;
        super();
    }

    public void run()
    {
        if (a.aq.b())
        {
            Log.i(z);
            App.aD().post(new ao6(this, a.aq.g(), a.aq.b(), a.aq.a(), a.aq.f().b()));
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ".\017\034>P;\004YwH~\023\026j\033'\030\r>H;\023\r>O1]\n{I(\030\013%\033-\036\021{_+\021\020p\\~\r\013{\0335\030\000>H;\023\035wU9".toCharArray();
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
        byte byte0 = 59;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 94;
          goto _L8
_L3:
        byte0 = 125;
          goto _L8
_L4:
        byte0 = 121;
          goto _L8
        byte0 = 30;
          goto _L8
    }
}
