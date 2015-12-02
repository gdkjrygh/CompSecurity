// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.whatsapp:
//            App, k, mk

final class aoy extends Handler
{

    private static final String z[];

    aoy()
    {
    }

    public void handleMessage(Message message)
    {
label0:
        {
            if (message.what == 0)
            {
                App.q(z[0]);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.az.g();
            App.R.c();
            App.q(z[1]);
        }
        App.al();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = ".f\016Vhi9AQ}/f\004Ppiw\016Ml(w\025P";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = ";q\007Q}:|A@w'`\000@l:";
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
        byte0 = 73;
          goto _L9
_L5:
        byte0 = 20;
          goto _L9
_L6:
        byte0 = 97;
          goto _L9
        byte0 = 35;
          goto _L9
    }
}
