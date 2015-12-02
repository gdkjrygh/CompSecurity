// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.whatsapp:
//            VoiceService

class eiver extends BroadcastReceiver
{

    private static final String z;
    final VoiceService a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals(z))
        {
            a.w();
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "pk\034ktxaVpue`\026m5pf\fpt\177++ZIT@6FTWC".toCharArray();
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
        byte0 = 17;
          goto _L8
_L3:
        byte0 = 5;
          goto _L8
_L4:
        byte0 = 120;
          goto _L8
        byte0 = 25;
          goto _L8
    }

    eiver(VoiceService voiceservice)
    {
        a = voiceservice;
        super();
    }
}
