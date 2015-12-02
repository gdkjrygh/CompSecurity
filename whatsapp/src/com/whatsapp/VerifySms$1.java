// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, VerifySms

class Receiver extends BroadcastReceiver
{

    private static final String z[];
    final VerifySms a;

    public void onReceive(Context context, Intent intent)
    {
        int i;
        i = App.am;
        Log.i(z[13]);
        if (a.J) goto _L2; else goto _L1
_L1:
        int j;
        j = getResultCode();
        Log.i((new StringBuilder()).append(z[6]).append(j).toString());
        if (j == -1) goto _L4; else goto _L3
_L3:
        int k;
        k = intent.getIntExtra(z[11], 0);
        Log.i((new StringBuilder()).append(z[0]).append(k).toString());
        VerifySms.B(a);
        j;
        JVM INSTR tableswitch 2 4: default 136
    //                   2 238
    //                   3 136
    //                   4 206;
           goto _L5 _L6 _L5 _L7
_L5:
        k;
        JVM INSTR lookupswitch 2: default 164
    //                   16: 276
    //                   98: 307;
           goto _L8 _L9 _L10
_L8:
        Log.w(z[2]);
        a.g(z[12]);
        VerifySms.j(a);
_L4:
        if (i == 0) goto _L11; else goto _L2
_L2:
        Log.i(z[9]);
_L11:
        return;
_L7:
        Log.i(z[10]);
        a.g(z[4]);
        VerifySms.j(a);
        if (i == 0) goto _L4; else goto _L6
_L6:
        Log.i(z[8]);
        VerifySms.c(7);
        VerifySms.t(a);
        a.e(7);
        if (i == 0) goto _L4; else goto _L5
_L9:
        Log.i(z[3]);
        a.g(z[1]);
        VerifySms.j(a);
        if (i == 0) goto _L4; else goto _L10
_L10:
        if (!VerifySms.B().startsWith(z[5]) || VerifySms.B().startsWith(z[14]))
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(z[7]);
        VerifySms.c(6);
        VerifySms.t(a);
        a.e(4);
        if (i == 0) goto _L4; else goto _L8
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[15];
        obj = "TkZ\032\037[}E\000VQkF\007TPkK\026\020TkZ\\\034P|G\001Y";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "QkD\025TQkF\027TM{\\^\026D#K\001\034Fg\\\0";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "TkZ\032\037[}E\000VW`[\026\027V";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "TkZ\032\037[}E\000VM{\\^\026D#K\001\034Fg\\\0";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "QkD\025TQkF\027TM{\\^\026D#[\026\013TgK\026";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\t;\032";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "TkZ\032\037[}E\000VQkF\007TPkK\026\020TkZ\\\013G}]\037\r\002";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "TkZ\032\037[}E\000VOkP\032\032M";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "TkZ\032\037[}E\000VPoL\032\026\017aN\025";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "TkZ\032\037[}E\000VQkF\007TPkK\026\020TkZ\\\035G}\\\001\026[kL";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "TkZ\032\037[}E\000VM{\\^\026D#[\026\013TgK\026";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "G|Z\034\013aaL\026";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "QkD\025TQkF\027TQkF\027TDoA\037\fPk";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "TkZ\032\037[}E\000VQkF\007TPkK\026\020TkZ\\\020LzM\035\r";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\t;\032B";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_456;
_L3:
        byte byte1 = 121;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 34;
          goto _L9
_L5:
        byte1 = 14;
          goto _L9
_L6:
        byte1 = 40;
          goto _L9
        byte1 = 115;
          goto _L9
    }

    Receiver(VerifySms verifysms)
    {
        a = verifysms;
        super();
    }
}
