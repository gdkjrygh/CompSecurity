// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            Voip, VoiceService, App

class ne
    implements android.os.Handler.Callback
{

    private static final String z[];
    final VoiceService a;

    ne(VoiceService voiceservice)
    {
        a = voiceservice;
        super();
    }

    public boolean handleMessage(Message message)
    {
        if (!Voip.h())
        {
            Log.e(z[1]);
            return false;
        }
        message.what;
        JVM INSTR tableswitch 0 2: default 48
    //                   0 50
    //                   1 89
    //                   2 106;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        Log.i(z[2]);
        if (Voip.getCurrentCallState() != Voip.CallState.RECEIVED_CALL) goto _L6; else goto _L5
_L5:
        a.D();
        if (App.am == 0) goto _L7; else goto _L6
_L6:
        a.o();
_L7:
        return true;
_L3:
        Log.i(z[0]);
        a.o();
        return true;
_L4:
        Log.i(z[3]);
        a.a(a.getString(0x7f0e0487));
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\r{X\r+\030u]\021+\032wR\030t\017qUPf\016`\034\023k\0179P\036p\022bTPp\022yT\022q\017";
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
                obj = "\r{X\r+\030u]\021P\022yT\022q\017\\P\023`\027qC]s\0364P\017a[z^\t$\022z\021\034j[uR\tm\rq\021\036e\027x";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\r{X\r+\030u]\021+\025{EPe\030wT\rpV`X\020a\024aE";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\r{X\r+\030u]\021+\bq_\031)\030u]\021)\024rW\030vV`X\020a\024aE";
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
    //                   0 196
    //                   1 202
    //                   2 208
    //                   3 214;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_214;
_L3:
        byte byte0 = 4;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 123;
          goto _L9
_L5:
        byte0 = 20;
          goto _L9
_L6:
        byte0 = 49;
          goto _L9
        byte0 = 125;
          goto _L9
    }
}
