// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.text.format.DateUtils;
import android.widget.TextView;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            ak8, fm, MediaData, App, 
//            u5, pr, au2

class sx extends Handler
{

    private static final String z;
    long a;
    final ak8 b;

    sx(ak8 ak8_1)
    {
        b = ak8_1;
        super();
    }

    public void handleMessage(Message message)
    {
        if (ak8.h(b) != null)
        {
            long l = System.currentTimeMillis() - ak8.j(b);
            ak8.d(b).setText(DateUtils.formatElapsedTime((int)(l / 1000L)));
            ak8.c(b).sendEmptyMessageDelayed(0, 50L);
            if (ak8.e(b) == null && l > 1000L && ak8.h(b).c().length() > 0L)
            {
                message = new MediaData();
                message.autodownloadRetryEnabled = true;
                message.file = ak8.h(b).c();
                c4 c4_1 = new c4(ak8.a(b), (byte[])null, message);
                c4_1.I = App.U();
                c4_1.f = 1;
                c4_1.w = 2;
                c4_1.n = 1;
                c4_1.L = ((MediaData) (message)).file.getName();
                c4_1.t = 0L;
                App.b(c4_1, u5.d(ak8.a(b)));
                ak8.a(b, new pr(c4_1, ak8.h(b).d()));
                message.uploader = ak8.e(b);
                ak8.e(b).k();
            }
            if (a + 1000L < System.currentTimeMillis() && ak8.a(b) != null)
            {
                a = System.currentTimeMillis();
                App.a(ak8.a(b), 1);
                if (ak8.h(b).c().length() > (long)au2.q * 0x100000L)
                {
                    Log.i((new StringBuilder()).append(z).append(ak8.h(b).c().length()).toString());
                    b.b(true);
                }
            }
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\033{\003\023m\003{\036\025'\013}\006\025d\004y\003\004(".toCharArray();
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
        byte byte0 = 8;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 109;
          goto _L8
_L3:
        byte0 = 20;
          goto _L8
_L4:
        byte0 = 106;
          goto _L8
        byte0 = 112;
          goto _L8
    }
}
