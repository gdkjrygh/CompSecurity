// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.messaging.h;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, VoiceService, abi

final class abv extends Handler
{

    private static final String z[];
    final VoiceService a;

    private abv(VoiceService voiceservice, Looper looper)
    {
        a = voiceservice;
        super(looper);
    }

    abv(VoiceService voiceservice, Looper looper, abi abi)
    {
        this(voiceservice, looper);
    }

    public void handleMessage(Message message)
    {
        int i = App.am;
        long l = System.currentTimeMillis();
        Message message1;
        int j;
        long l1;
        try
        {
            j = message.what;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        j;
        JVM INSTR tableswitch 0 1: default 40
    //                   0 76
    //                   1 87;
           goto _L1 _L2 _L3
_L1:
        try
        {
            throw new IllegalStateException((new StringBuilder()).append(z[3]).append(message.what).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
_L2:
        getLooper().quit();
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        message1 = (Message)message.obj;
        if (message1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        h.a(message1, a);
        if (i != 0) goto _L1; else goto _L4
_L4:
        l1 = System.currentTimeMillis();
        Log.i((new StringBuilder()).append(z[1]).append(message.what).append(z[0]).append(l1 - l).append(z[2]).toString());
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "q_\023\032z\"_\033[";
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
                obj = "'U\026\013%\"_\r\rc2_P\bc6T\036\027U%R\r\036k5\025\022\bm~";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "qW\f";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "$T\024\025e&T_\026o\"I\036\034oq";
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
        byte byte0 = 10;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 81;
          goto _L9
_L5:
        byte0 = 58;
          goto _L9
_L6:
        byte0 = 127;
          goto _L9
        byte0 = 123;
          goto _L9
    }
}
