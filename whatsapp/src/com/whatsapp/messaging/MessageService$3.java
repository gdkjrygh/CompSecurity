// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.App;
import com.whatsapp.Voip;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            h, MessageService, c

class  extends BroadcastReceiver
{

    private static final String z[];
    final MessageService a;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            int i = h.a;
            if (MessageService.p().equals(intent.getAction()))
            {
                Log.i(z[0]);
                if (!App.v(a))
                {
                    MessageService.j(a);
                    MessageService.h(a);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                if (Voip.h())
                {
                    MessageService.e(a);
                    c.b(MessageService.c(a));
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                c.a(MessageService.c(a), false);
                if (i == 0)
                {
                    break label0;
                }
            }
            Log.w((new StringBuilder()).append(z[1]).append(intent).toString());
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "k2\001\0224`:\003\024rp:^\016tt0\004\0266g6\034\007i<+\030\017~|*\005";
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
                obj = "f1\032\ftd1Q\013ug:\037\026;a:\022\007re:\025Br}\177\035\r||*\005Biv<\024\013mv-Q";
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
        char c1 = obj[j];
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
        byte byte0 = 27;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 19;
          goto _L9
_L5:
        byte0 = 95;
          goto _L9
_L6:
        byte0 = 113;
          goto _L9
        byte0 = 98;
          goto _L9
    }

    (MessageService messageservice)
    {
        a = messageservice;
        super();
    }
}
