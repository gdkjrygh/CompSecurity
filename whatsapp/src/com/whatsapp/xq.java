// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, ChangeNumber, m7, VerifySms

final class xq extends Handler
{

    private static final String z[];

    xq(Looper looper)
    {
        super(looper);
    }

    public void handleMessage(Message message)
    {
        int i;
        long l;
        i = App.am;
        l = ChangeNumber.d(App.au);
        message.what;
        JVM INSTR tableswitch 5 7: default 40
    //                   5 41
    //                   6 73
    //                   7 114;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        Log.w(z[0]);
        App.a(App.ak(), App.au.getString(0x7f0e0088));
        ChangeNumber.c(App.au);
        if (i == 0) goto _L1; else goto _L3
_L3:
        Log.e(z[1]);
        App.a(App.ak(), App.au.getString(0x7f0e0083));
        m7.a(l, m7.d, true);
        ChangeNumber.c(App.au);
        if (i == 0) goto _L1; else goto _L4
_L4:
        Log.i(z[2]);
        App.a(App.ak(), App.au.getString(0x7f0e0089, new Object[] {
            ChangeNumber.c(), VerifySms.a(App.Z.cc, App.Z.number)
        }));
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\032#\032>l\034%\016=i\0349T4b\030'\0247$\n*\0265";
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
                obj = "\032#\032>l\034%\016=i\0349T4b\030'\0247$\037*\022<";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\032#\032>l\034%\016=i\0349T4b\030'\0247$\n>\0303n\n8";
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
        byte byte0 = 11;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 121;
          goto _L9
_L5:
        byte0 = 75;
          goto _L9
_L6:
        byte0 = 123;
          goto _L9
        byte0 = 80;
          goto _L9
    }
}
