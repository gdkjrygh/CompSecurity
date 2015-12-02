// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, akr

final class HeadsetPlugBroadcastReceiver extends BroadcastReceiver
{

    private static final String z[];

    HeadsetPlugBroadcastReceiver()
    {
    }

    public void a(Context context)
    {
        context.registerReceiver(this, new IntentFilter(z[2]));
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        int i = intent.getIntExtra(z[0], 0);
        if (App.aE && i < 1)
        {
            akr.o();
        }
        if (i >= 1)
        {
            flag = true;
        }
        App.aE = flag;
        Log.i((new StringBuilder()).append(z[1]).append(i).toString());
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "[DSwq";
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
                obj = "I@B,|MQVpq\\\037";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "I^Vq{AT\034jz\\U\\w:ISFj{F\036zFUlcwWKx|gD";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 20;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 40;
          goto _L9
_L5:
        byte0 = 48;
          goto _L9
_L6:
        byte0 = 50;
          goto _L9
        byte0 = 3;
          goto _L9
    }
}
