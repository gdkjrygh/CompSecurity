// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            Voip, App, VoiceService, a1f

class zu
    implements android.os.Handler.Callback
{

    private static final String z;
    final VoiceService a;

    zu(VoiceService voiceservice)
    {
        a = voiceservice;
        super();
    }

    public boolean handleMessage(Message message)
    {
label0:
        {
            message = Voip.getCallInfo();
            if (message != null)
            {
                long l;
                boolean flag;
                if (message.getCallState() == Voip.CallState.ACTIVE)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                l = message.getCallDuration();
                if (flag)
                {
                    Voip.checkStreamStatistics();
                    App.a(message.getPeerId(), l);
                }
                if (VoiceService.d(a) != null)
                {
                    VoiceService.d(a).a(flag, l, VoiceService.c(a));
                }
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.e(z);
        }
        VoiceService.s(a).sendEmptyMessageDelayed(0, 1000L);
        return true;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "PB?\037)VH$\006iBD5\016js]2\016rCe7\001bJH$OqC\r7\035c\006C9\033&OCv\016h\006L5\033oPHv\fgJA".toCharArray();
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
        byte byte0 = 6;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 38;
          goto _L8
_L3:
        byte0 = 45;
          goto _L8
_L4:
        byte0 = 86;
          goto _L8
        byte0 = 111;
          goto _L8
    }
}
