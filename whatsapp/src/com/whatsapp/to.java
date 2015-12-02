// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            DeleteAccountConfirmation, App

class to extends Handler
{

    private static final String z[];
    final DeleteAccountConfirmation a;

    to(DeleteAccountConfirmation deleteaccountconfirmation)
    {
        a = deleteaccountconfirmation;
        super();
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        Log.i(z[1]);
        if (DeleteAccountConfirmation.c() == a)
        {
            a.removeDialog(1);
            if (App.f(App.au) != 0)
            {
                Log.w(z[0]);
                a.showDialog(3);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\020*`rI\021.otI\027 bqT\006\"#sT\025#cp\020\020*`rI\021bjvT\030*h";
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
                obj = "\020*`rI\021.otI\027 bqT\006\"#cT\031*cbI[*tgT\006*h";
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
        byte byte0 = 61;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 116;
          goto _L9
_L5:
        byte0 = 79;
          goto _L9
_L6:
        byte0 = 12;
          goto _L9
        byte0 = 23;
          goto _L9
    }
}
