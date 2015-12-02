// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.SoundPool;
import android.os.Handler;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            ak8, fm, dx, App

class abt
    implements Runnable
{

    private static final String z[];
    final ak8 a;

    abt(ak8 ak8_1)
    {
        a = ak8_1;
        super();
    }

    public void run()
    {
        ak8.a(a, System.currentTimeMillis());
        if (ak8.h(a) == null) goto _L2; else goto _L1
_L1:
        int i;
        Log.i(z[1]);
        i = android.os.Build.VERSION.SDK_INT;
        Exception exception;
        if (i >= 16)
        {
            try
            {
                ak8.e().setVolume(ak8.f(a), 0.0F, 0.0F);
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                throw exception;
            }
        }
        ak8.h(a).e();
        ak8.c(a).sendEmptyMessage(0);
_L3:
        return;
        exception;
        throw exception;
        exception;
        Log.a(z[2], exception);
        a.b(false);
        ak8.i(a).a(0x7f0e0168);
        if (App.am == 0) goto _L3; else goto _L2
_L2:
        Log.i(z[0]);
        return;
        exception;
        throw exception;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\023\035m}M\013\035p{\007\026\006el\\\023\035m}M\013\035p{\007\026\031mn";
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
                obj = "\023\035m}M\013\035p{\007\026\006el\\\023\035m}M\013\035p{\007\026\006el\\";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\023\035m}M\013\035p{\007\026\006el\\\023\035m}M\013\035p{\007\026\006el\\\003\023mrM\001";
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
    //                   3 194;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        byte byte0 = 40;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 101;
          goto _L9
_L5:
        byte0 = 114;
          goto _L9
_L6:
        byte0 = 4;
          goto _L9
        byte0 = 30;
          goto _L9
    }
}
