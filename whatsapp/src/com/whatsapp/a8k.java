// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            l1

final class a8k
    implements Runnable
{

    private static final String z;
    final Handler a;

    a8k(Handler handler)
    {
        a = handler;
        super();
    }

    public void run()
    {
        try
        {
            l1.a();
        }
        catch (IOException ioexception)
        {
            Log.a(z, ioexception);
        }
        a.postDelayed(this, 0xdbba0L);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "<\0320Lby\033#Uy7\017bPd8\034+Pd0\0131\003v0\004'".toCharArray();
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
        byte byte0 = 16;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 89;
          goto _L8
_L3:
        byte0 = 104;
          goto _L8
_L4:
        byte0 = 66;
          goto _L8
        byte0 = 35;
          goto _L8
    }
}
