// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

// Referenced classes of package com.whatsapp:
//            VoiceService

class eiver extends BroadcastReceiver
{

    private static final String z[];
    final VoiceService a;

    public void onReceive(Context context, Intent intent)
    {
        int i;
        int j;
label0:
        {
            context = intent.getAction();
            if (z[2].equals(context))
            {
                i = intent.getIntExtra(z[0], 0);
                j = intent.getIntExtra(z[1], 0);
                if (i != j)
                {
                    break label0;
                }
            }
            return;
        }
        if ((j == 2 || VoiceService.q(a)) && (i == 3 || i == 0))
        {
            context = (AudioManager)a.getSystemService(z[3]);
            context.stopBluetoothSco();
            context.setBluetoothScoOn(false);
        }
        VoiceService.n(a);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "#&R1++,\030!(7-B,+6 \03036-._/!l-N76#fe\027\005\026\r";
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
                obj = "#&R1++,\030!(7-B,+6 \03036-._/!l-N76#ff\021\001\024\001y\026\027\035\033b\002\020\007";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "#&R1++,\030!(7-B,+6 \030+!#,E&0l8D,\"+$Sm%!<_,*l\013y\r\n\007\013b\n\013\f\027e\027\005\026\ri\000\f\003\006q\006\0";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "#=R*+";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 68;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 66;
          goto _L9
_L5:
        byte0 = 72;
          goto _L9
_L6:
        byte0 = 54;
          goto _L9
        byte0 = 67;
          goto _L9
    }

    eiver(VoiceService voiceservice)
    {
        a = voiceservice;
        super();
    }
}
