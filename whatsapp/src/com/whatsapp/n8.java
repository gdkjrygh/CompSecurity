// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.TimerTask;

// Referenced classes of package com.whatsapp:
//            a9q, App

class n8 extends TimerTask
{

    private static final String z;
    a9q a;

    public n8(a9q a9q1)
    {
        a = a9q1;
    }

    public void run()
    {
        if (a.k)
        {
            return;
        }
        Log.i((new StringBuilder()).append(z).append(a.j).toString());
        a.i = true;
        a.j;
        JVM INSTR tableswitch 2 2: default 72
    //                   2 87;
           goto _L1 _L2
_L1:
        a9q.m.remove(a.e);
        return;
_L2:
        App.au.ab().post(a9q.a(a));
        if (true) goto _L1; else goto _L3
_L3:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "Wd}g=QmLp*Atvq;ouzo*_tg-;Iqv8".toCharArray();
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
        byte byte0 = 79;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 48;
          goto _L8
_L3:
        byte0 = 1;
          goto _L8
_L4:
        byte0 = 19;
          goto _L8
        byte0 = 2;
          goto _L8
    }
}
