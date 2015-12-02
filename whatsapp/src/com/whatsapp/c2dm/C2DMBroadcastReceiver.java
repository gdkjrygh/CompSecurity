// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.c2dm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.whatsapp.c2dm:
//            b, C2DMRegistrar

public class C2DMBroadcastReceiver extends BroadcastReceiver
{

    private static final String z;

    public C2DMBroadcastReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
label0:
        {
            if (intent.getAction().equals(z))
            {
                b.a(context, intent, true);
                if (!C2DMRegistrar.c)
                {
                    break label0;
                }
            }
            C2DMRegistrar.a(context, intent);
        }
        setResultCode(-1);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "6i\036\006\023:i\024D\021{g\035L\006:o\027\006\027gb\036\006\035;r\026F\000{T6k1\034P6".toCharArray();
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
        byte byte0 = 116;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 85;
          goto _L8
_L3:
        byte0 = 6;
          goto _L8
_L4:
        byte0 = 115;
          goto _L8
        byte0 = 40;
          goto _L8
    }
}
