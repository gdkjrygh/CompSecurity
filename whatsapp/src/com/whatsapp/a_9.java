// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, DeleteAccount, DeleteAccountConfirmation

class a_9 extends Handler
{

    private static final String z[];
    final DeleteAccount a;

    a_9(DeleteAccount deleteaccount)
    {
        a = deleteaccount;
        super();
    }

    public void handleMessage(Message message)
    {
        int i = App.am;
        message.what;
        JVM INSTR tableswitch 1 4: default 40
    //                   1 41
    //                   2 99
    //                   3 139
    //                   4 168;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        Log.w(z[1]);
        DeleteAccount.a(a).removeMessages(4);
        a.removeDialog(1);
        a.startActivity(new Intent(a, com/whatsapp/DeleteAccountConfirmation));
        a.finish();
        if (i == 0) goto _L1; else goto _L3
_L3:
        Log.w(z[3]);
        DeleteAccount.a(a).removeMessages(4);
        a.removeDialog(1);
        a.a(0x7f0e0117);
        if (i == 0) goto _L1; else goto _L4
_L4:
        Log.e(z[0]);
        a.removeDialog(1);
        a.showDialog(109);
        if (i == 0) goto _L1; else goto _L5
_L5:
        Log.e(z[2]);
        DeleteAccount.a(a).removeMessages(4);
        a.removeDialog(1);
        a.showDialog(109);
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\f\037kf1\rWf`&\007\017iwj\r\bul7";
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
                obj = "\f\037kf1\rWf`&\007\017iwj\013\022b`.E\024rn'\r\b(n$\034\031o";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\f\037kf1\rWf`&\007\017iwj\034\023jf*\035\016";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\f\037kf1\rWf`&\007\017iwj\013\022b`.E\024rn'\r\b(n,\033\027fw&\0";
                i = 3;
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
        byte byte0 = 69;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 104;
          goto _L9
_L5:
        byte0 = 122;
          goto _L9
_L6:
        byte0 = 7;
          goto _L9
        byte0 = 3;
          goto _L9
    }
}
