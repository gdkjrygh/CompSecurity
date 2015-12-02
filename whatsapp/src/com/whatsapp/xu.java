// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import com.whatsapp.messaging.ay;

// Referenced classes of package com.whatsapp:
//            App, VoiceService

final class xu
    implements ay
{

    private static final String z[];

    xu()
    {
    }

    public void a(Message message)
    {
        Intent intent = new Intent(z[0], null, App.au, com/whatsapp/VoiceService);
        if (message.obj != null)
        {
            try
            {
                Parcelable parcelable = (Parcelable)message.obj;
                message.obj = null;
                intent.putExtra(z[1], parcelable);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                throw new RuntimeException(z[3]);
            }
        }
        intent.putExtra(z[2], message);
        App.au.startService(intent);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\n*;o-\016*\007g!\013<9m!";
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
                obj = "\0357,x%'==i!\0219=U)\035<+k#\035\0207h.";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\0357,x%'==i!\0219=U)\035<+k#\035";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\027-2*-\026o\033k(\024o\025o7\013.?od\021<xd+\fo\bk6\033*4k&\024*";
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
        byte byte0 = 68;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 120;
          goto _L9
_L5:
        byte0 = 79;
          goto _L9
_L6:
        byte0 = 88;
          goto _L9
        byte0 = 10;
          goto _L9
    }
}
