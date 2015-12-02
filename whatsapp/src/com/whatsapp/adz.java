// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.telephony.PhoneStateListener;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, akr

class adz extends PhoneStateListener
{

    private static final String z[];
    final App a;

    adz(App app)
    {
        a = app;
        super();
    }

    public void onCallStateChanged(int i, String s)
    {
        int j = App.am;
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 60
    //                   1 33
    //                   2 48;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        Log.i(z[1]);
        akr.o();
        if (j == 0) goto _L1; else goto _L4
_L4:
        Log.i(z[0]);
        if (j == 0) goto _L1; else goto _L2
_L2:
        Log.i(z[2]);
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "T\fRqs\013\027I~bADRypL\013Rt";
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
                obj = "T\fRqs\013\027I~bADOvxC\rSx";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "T\fRqs\013\027I~bADT{zA";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 22;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 36;
          goto _L9
_L5:
        byte0 = 100;
          goto _L9
_L6:
        byte0 = 61;
          goto _L9
        byte0 = 31;
          goto _L9
    }
}
