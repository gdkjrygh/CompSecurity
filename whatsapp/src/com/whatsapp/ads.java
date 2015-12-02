// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, s3

final class ads
    implements Runnable
{

    private static final String z;

    ads()
    {
    }

    public void run()
    {
        try
        {
            App.ay.onChange(true);
            return;
        }
        catch (Exception exception)
        {
            Log.c(z, exception);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "R\030_?\001\\\032Lu\024J\006L?\003V\004[qHV\032]\177\025".toCharArray();
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
        byte byte0 = 103;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 51;
          goto _L8
_L3:
        byte0 = 104;
          goto _L8
_L4:
        byte0 = 47;
          goto _L8
        byte0 = 16;
          goto _L8
    }
}
