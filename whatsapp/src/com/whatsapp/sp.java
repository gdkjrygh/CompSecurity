// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, ChangeNumber, EnterPhoneNumber

class sp extends Handler
{

    private static final String z[];
    final ChangeNumber a;

    sp(ChangeNumber changenumber)
    {
        a = changenumber;
        super();
    }

    public void handleMessage(Message message)
    {
        int i = App.am;
        message.what;
        JVM INSTR tableswitch 1 4: default 40
    //                   1 41
    //                   2 103
    //                   3 143
    //                   4 172;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        Log.w(z[0]);
        ChangeNumber.d(a).removeMessages(4);
        a.removeDialog(1);
        if (ChangeNumber.a().equals(EnterPhoneNumber.t))
        {
            break; /* Loop/switch isn't completed */
        }
        a.showDialog(2);
        if (i == 0) goto _L1; else goto _L6
_L6:
        ChangeNumber.b(a);
        if (i == 0) goto _L1; else goto _L3
_L3:
        Log.w(z[1]);
        ChangeNumber.d(a).removeMessages(4);
        a.removeDialog(1);
        a.a(0x7f0e0117);
        if (i == 0) goto _L1; else goto _L4
_L4:
        Log.e(z[3]);
        a.removeDialog(1);
        a.showDialog(109);
        if (i == 0) goto _L1; else goto _L5
_L5:
        Log.e(z[2]);
        ChangeNumber.d(a).removeMessages(4);
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
        obj = "k.\031@Cm(\rCFm4WMLm%\023\003J}+\032KV'+\031ZG`";
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
                obj = "k.\031@Cm(\rCFm4WMLm%\023\003J}+\032KV'+\021]Ii2\033F";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "k.\031@Cm(\rCFm4WZMe#\027[P";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "k.\031@Cm(\rCFm4WKVz)\n";
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
        byte0 = 8;
          goto _L9
_L5:
        byte0 = 70;
          goto _L9
_L6:
        byte0 = 120;
          goto _L9
        byte0 = 46;
          goto _L9
    }
}
