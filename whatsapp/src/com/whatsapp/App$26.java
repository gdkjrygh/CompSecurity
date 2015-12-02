// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App

class dcastReceiver extends BroadcastReceiver
{

    private static final String z[];
    final App a;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            Log.i(z[0]);
            if (App.H() == null)
            {
                Log.i(z[1]);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.H().o();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "$93Ih,'$\022q(,,\023lj,;\026q7,'";
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
                obj = "$93Ih,'$\022q(,,\023lj,;\026q7,'Ik. 3";
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
        byte byte0 = 24;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 69;
          goto _L9
_L5:
        byte0 = 73;
          goto _L9
_L6:
        byte0 = 67;
          goto _L9
        byte0 = 102;
          goto _L9
    }

    nt(App app)
    {
        a = app;
        super();
    }
}
