// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App, VoiceService

class b extends BroadcastReceiver
{

    private static final String z[];
    final VoiceService a;
    private boolean b;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
label1:
            {
                int i = App.am;
                if (!z[0].equals(intent.getAction()))
                {
                    break label0;
                }
                int j = intent.getIntExtra(z[1], -1);
                boolean flag1 = VoiceService.q(a);
                if (j == 1)
                {
                    VoiceService.f(a, true);
                    b = false;
                    if (VoiceService.r(a) == null)
                    {
                        break label1;
                    }
                    context = VoiceService.r(a).getConnectedDevices().iterator();
                    do
                    {
                        if (!context.hasNext())
                        {
                            break;
                        }
                        intent = (BluetoothDevice)context.next();
                        if (!VoiceService.r(a).isAudioConnected(intent))
                        {
                            continue;
                        }
                        int k = intent.getBluetoothClass().getDeviceClass();
                        boolean flag;
                        if (k == 1032 || k == 1056 || k == 1028)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        b = flag;
                        if (b && i == 0)
                        {
                            break;
                        }
                    } while (i == 0);
                    if (i == 0)
                    {
                        break label1;
                    }
                }
                if (j == 0)
                {
                    VoiceService.f(a, false);
                    if (flag1 && !VoiceService.f(a) && b && a.e())
                    {
                        VoiceService.a(a, null);
                    }
                    b = false;
                }
            }
            VoiceService.n(a);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\000r\0220:\bxX/0\005u\027l\006\"S)\003\000%U9\035\0065]\"\007\n\"T7\f\022$X";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "\000r\0220:\bxX/0\005u\027l0\031h\004#{2_9\035\0244X?\r\n2H7\026\020";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 85;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 97;
          goto _L9
_L5:
        byte0 = 28;
          goto _L9
_L6:
        byte0 = 118;
          goto _L9
        byte0 = 66;
          goto _L9
    }

    lass(VoiceService voiceservice)
    {
        a = voiceservice;
        super();
        b = false;
    }
}
