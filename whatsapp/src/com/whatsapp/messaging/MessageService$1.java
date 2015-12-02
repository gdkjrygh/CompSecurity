// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            h, MessageService, b3, a

class  extends BroadcastReceiver
{

    private static final String z[];
    final MessageService a;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            int i = h.a;
            if (z[3].equals(intent.getAction()))
            {
                if (!MessageService.d(a).post(new b3(this)))
                {
                    Log.w((new StringBuilder()).append(z[1]).append(intent).toString());
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            if (MessageService.l().equals(intent.getAction()))
            {
                if (!MessageService.d(a).post(new a(this)))
                {
                    Log.w((new StringBuilder()).append(z[2]).append(intent).toString());
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            Log.w((new StringBuilder()).append(z[0]).append(intent).toString());
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "gB\035\\KeBV[JfI\030F\004`I\025WMdI\022\022M|\f\025]J|I\025FMdE\002K\004`I\025WMdI\004\022";
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
                obj = "tM\037^Av\f\002]\004bC\005F\004qD\023QO\\I\002EK`G%FEfIV@Q|B\027PHw\026V";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "tM\037^Av\f\002]\004bC\005F\004qD\023QO\\I\002EK`G%FEfIV@Q|B\027PHw\026V";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "sB\022@K{HX\\Af\002\025]J|\0025}j\\i5fmDe\"k{Qd7|cW";
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
        byte byte0 = 36;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 18;
          goto _L9
_L5:
        byte0 = 44;
          goto _L9
_L6:
        byte0 = 118;
          goto _L9
        byte0 = 50;
          goto _L9
    }

    (MessageService messageservice)
    {
        a = messageservice;
        super();
    }
}
