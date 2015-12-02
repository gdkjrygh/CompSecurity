// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.os.Vibrator;
import com.whatsapp.App;
import com.whatsapp.cr;
import com.whatsapp.my;

// Referenced classes of package com.whatsapp.qrcode:
//            QrCodeActivity

class k
    implements cr
{

    private static final String z;
    final QrCodeActivity a;

    k(QrCodeActivity qrcodeactivity)
    {
        a = qrcodeactivity;
        super();
    }

    public void a()
    {
        if (my.l(QrCodeActivity.f(a)))
        {
            ((Vibrator)a.getSystemService(z)).vibrate(75L);
            a.finish();
        }
    }

    public void a(int i)
    {
label0:
        {
            if (i == 403)
            {
                QrCodeActivity.b(a);
                if (QrCodeActivity.m == 0)
                {
                    break label0;
                }
            }
            App.b(a.getBaseContext(), 0x7f0e0211, 1);
            a.finish();
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "^0\001kh\\6\021".toCharArray();
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
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 9;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 40;
          goto _L8
_L3:
        byte0 = 89;
          goto _L8
_L4:
        byte0 = 99;
          goto _L8
        byte0 = 25;
          goto _L8
    }
}
