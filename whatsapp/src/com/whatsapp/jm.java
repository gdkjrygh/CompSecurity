// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, k, og

final class jm
    implements android.os.Handler.Callback
{

    private static final String z[];

    jm()
    {
    }

    public boolean handleMessage(Message message)
    {
        Bundle bundle;
        String s;
        og og1;
        int i;
        i = App.am;
        bundle = (Bundle)message.obj;
        s = bundle.getString(z[6]);
        og1 = App.az.f(s);
        if (og1 == null) goto _L2; else goto _L1
_L1:
        message.what;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 74
    //                   1 106
    //                   2 187
    //                   3 209;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        return true;
_L3:
        Log.a(z[1], null, new Object[] {
            s, Integer.valueOf(message.arg1)
        });
        if (i == 0) goto _L2; else goto _L4
_L4:
        og1.d = bundle.getString(z[5]);
        og1.b = bundle.getLong(z[2]);
        Log.b(z[3], null, new Object[] {
            s, og1.d, Long.valueOf(og1.b)
        });
        App.az.i(og1);
        App.o(s);
        if (i == 0) goto _L2; else goto _L5
_L5:
        Log.b(z[4], null, new Object[] {
            s
        });
        if (i == 0) goto _L2; else goto _L6
_L6:
        Log.b(z[0], null, new Object[] {
            s
        });
        og1.d = null;
        og1.b = 0L;
        App.az.i(og1);
        App.o(s);
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "h`|Jdnq}J?k`d\\dj%bPt2 {";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "h`|Jdnq}J?idaUuk%bPt2 {\031s`am\0045k";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "{le\\c{deI";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "h`|Jdnq}J?}`k\\yy`l\0310ell\0045|%{Mq{p{\0045|%|P}jv|X}\1778-]";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "h`|Jdnq}J?ajkQqabm\031zfa5\034c";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "|qiMe|";
                byte0 = 4;
                i = 5;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "ell";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 272
    //                   3 279;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_279;
_L3:
        byte byte1 = 16;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 15;
          goto _L9
_L5:
        byte1 = 5;
          goto _L9
_L6:
        byte1 = 8;
          goto _L9
        byte1 = 57;
          goto _L9
    }
}
