// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            VoiceService, Voip, VoipActivity

class atj
    implements android.os.Handler.Callback
{

    private static final String z[];
    final VoiceService a;

    atj(VoiceService voiceservice)
    {
        a = voiceservice;
        super();
    }

    public boolean handleMessage(Message message)
    {
        boolean flag = true;
        message.what;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 46
    //                   1 225
    //                   2 55
    //                   3 67
    //                   4 302;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        flag = false;
_L8:
        return flag;
_L2:
        VoiceService.i(a);
        return true;
_L4:
        Voip.muteCall(VoiceService.e(a));
        return true;
_L5:
        message = new IntentFilter(z[4]);
        message = a.registerReceiver(null, message);
        if (message == null) goto _L8; else goto _L7
_L7:
        int i = message.getIntExtra(z[3], -1);
        int j;
        boolean flag1;
        if (i == 2 || i == 5)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i = message.getIntExtra(z[6], -1);
        j = message.getIntExtra(z[2], -1);
        i = (int)((float)(i * 100) / (float)j);
        Log.i((new StringBuilder()).append(z[0]).append(i).append(z[5]).append(flag1).toString());
        VoiceService.a(a).removeMessages(3);
        VoiceService.a(a).sendEmptyMessageDelayed(3, 60000L);
        return true;
_L3:
        if (!Voip.h())
        {
            Log.e(z[1]);
            return true;
        }
        message = new Intent(a, com/whatsapp/VoipActivity);
        message.setFlags(0x10000000);
        a.startActivity(message);
        VoiceService.a(a, false);
        message = VoiceService.b(a);
        if (message == null) goto _L8; else goto _L9
_L9:
        a.startForeground(0x7f0b001e, message);
        return true;
_L6:
        Voip.CallState callstate = Voip.CallState.values()[message.arg1];
        message = (Voip.CallInfo)message.obj;
        VoiceService.a(a, callstate, message);
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "IXo\b$\\Vj\024$]Vr\fnMNY\025dQ^r\027y\037Gc\nhZYrX6\037";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "IXo\b$\\Xk\025dQ\177g\026oSRtWC~yB4NmhQ0JkhU,JmcY9Hk~P1_fh@7Y`~H;Dr~H?T|vJ4+QX&\031hK^p\035+\\Vj\024";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "LTg\024n";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "LCg\f~L";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "^Yb\ndVS(\021eKRh\f%^Tr\021dQ\031D9_krT!T|\177G6Lzs";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\023\027e\020jMPo\026l\037\n&";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "SRp\035g";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 11;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 63;
          goto _L9
_L5:
        byte1 = 55;
          goto _L9
_L6:
        byte1 = 6;
          goto _L9
        byte1 = 120;
          goto _L9
    }
}
