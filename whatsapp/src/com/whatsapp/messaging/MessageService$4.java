// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            MessageService, c, h

class  extends BroadcastReceiver
{

    private static final String z[];
    final MessageService a;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if (MessageService.q().equals(intent.getAction()))
            {
                Log.i((new StringBuilder()).append(z[0]).append(MessageService.g(a)).toString());
                if (!MessageService.g(a))
                {
                    break label0;
                }
                c.b(MessageService.c(a));
                if (h.a == 0)
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
        obj = "br\021\001Biz\023\007\004yzN\022\001sz\017\005@jv\017\026\bh2\025\030\000\177mN\027\004hzA\022\002tq\004\022\031sp\017%\005hz\000\025?\177~\005\bW";
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
                obj = "oq\n\037\002mqA\030\003nz\017\005Mhz\002\024\004lz\005Q\004t?\002\035\004\177q\025Q\035sq\006\024\037:m\004\022\bsi\004\003M";
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
        byte byte0 = 109;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 26;
          goto _L9
_L5:
        byte0 = 31;
          goto _L9
_L6:
        byte0 = 97;
          goto _L9
        byte0 = 113;
          goto _L9
    }

    (MessageService messageservice)
    {
        a = messageservice;
        super();
    }
}
