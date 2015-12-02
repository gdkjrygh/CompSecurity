// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.hardware.Camera;
import com.whatsapp.App;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.qrcode:
//            b, QrCodeActivity, QrCodeView

class p
    implements b
{

    private static final String z;
    final QrCodeActivity a;

    p(QrCodeActivity qrcodeactivity)
    {
        a = qrcodeactivity;
        super();
    }

    public void a()
    {
        Log.i(z);
        QrCodeActivity.b(a, true);
        if (!QrCodeActivity.a(a))
        {
            QrCodeActivity.e(a).c().setOneShotPreviewCallback(QrCodeActivity.c(a));
        }
    }

    public void b()
    {
        App.b(a, 0x7f0e0081, 1);
        a.finish();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "r,\005\020'j(\r\007*,.\026\026%j;\023\0016b:\035".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 83;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 3;
          goto _L8
_L3:
        byte0 = 94;
          goto _L8
_L4:
        byte0 = 100;
          goto _L8
        byte0 = 115;
          goto _L8
    }
}
