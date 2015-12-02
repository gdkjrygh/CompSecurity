// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.text.format.DateUtils;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.s;

// Referenced classes of package com.whatsapp:
//            App, MediaView

class vh extends Handler
{

    private static final String z;
    final MediaView a;

    vh(MediaView mediaview)
    {
        a = mediaview;
        super();
    }

    public void handleMessage(Message message)
    {
        int i = App.am;
        if (MediaView.h(a) != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            if (com.whatsapp.MediaView.s(a) != 4)
            {
                break label0;
            }
            if (MediaView.e(a).getMax() > 0)
            {
                int j = Math.min(MediaView.h(a).b(), MediaView.e(a).getMax());
                if (MediaView.l(a) / 1000 != j / 1000)
                {
                    MediaView.t(a).setText(DateUtils.formatElapsedTime(j / 1000));
                    MediaView.f(a, j);
                }
                MediaView.e(a).setProgress(j);
                if (i == 0)
                {
                    break label0;
                }
            }
            a.a(0x7f0e016f);
        }
        if (a.isFinishing() || com.whatsapp.MediaView.s(a) != 4 || !MediaView.h(a).f())
        {
            break; /* Loop/switch isn't completed */
        }
        MediaView.u(a).sendEmptyMessageDelayed(0, 50L);
        if (i == 0) goto _L1; else goto _L3
_L3:
        if (com.whatsapp.MediaView.s(a) == 5) goto _L1; else goto _L4
_L4:
        Log.i(z);
        MediaView.e(a).setProgress(MediaView.e(a).getMax());
        MediaView.t(a).setText(DateUtils.formatElapsedTime(MediaView.h(a).a() / 1000));
        MediaView.c(a, 5);
        MediaView.g(a).setImageResource(0x7f0205d3);
        return;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "7\023\032,l,\037\0332\";\003\032,bu\005\0331-.\031^6y5\006^6y;\002\0136".toCharArray();
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
        byte byte0 = 13;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 90;
          goto _L8
_L3:
        byte0 = 118;
          goto _L8
_L4:
        byte0 = 126;
          goto _L8
        byte0 = 69;
          goto _L8
    }
}
