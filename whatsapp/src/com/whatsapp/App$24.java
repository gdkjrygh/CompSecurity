// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App

class dcastReceiver extends BroadcastReceiver
{

    private static final String z[];
    final App a;

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = App.aI.getBackgroundDataSetting();
        Log.i((new StringBuilder()).append(z[1]).append(flag).toString());
        if (!flag)
        {
            App.b(context, true);
            App.a(context);
        }
        App.i(z[0]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "Ck\t\022oOk\003Pm\016t\026SkEw\027\022oAt\024O";
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
                obj = "At\024\023jAg\017[zOq\nX%De\020]'Ej\005^dE`D";
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
    //                   2 168
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 8;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 32;
          goto _L9
_L5:
        byte0 = 4;
          goto _L9
_L6:
        byte0 = 100;
          goto _L9
        byte0 = 60;
          goto _L9
    }

    nt(App app)
    {
        a = app;
        super();
    }
}
