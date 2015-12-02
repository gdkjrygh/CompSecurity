// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.os.Message;

// Referenced classes of package com.whatsapp:
//            App, SetStatus

class a_5
    implements android.os.Handler.Callback
{

    private static final String z[];
    final SetStatus a;

    a_5(SetStatus setstatus)
    {
        a = setstatus;
        super();
    }

    public boolean handleMessage(Message message)
    {
label0:
        {
            if (message.what == 0)
            {
                App.b(App.au, 0x7f0e0405, 0);
                App.o((new StringBuilder()).append(App.k()).append(z[0]).toString());
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.f(((Bundle)message.obj).getString(z[1]));
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "YL\t\005HxKT\023Pi\021I\027T";
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
                obj = "jKF\006Uj";
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
        byte byte0 = 32;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 25;
          goto _L9
_L5:
        byte0 = 63;
          goto _L9
_L6:
        byte0 = 39;
          goto _L9
        byte0 = 114;
          goto _L9
    }
}
