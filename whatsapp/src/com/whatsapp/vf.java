// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.text.format.DateUtils;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.util.s;

// Referenced classes of package com.whatsapp:
//            App, RecordAudio

class vf extends Handler
{

    int a;
    final RecordAudio b;

    vf(RecordAudio recordaudio)
    {
        b = recordaudio;
        super();
        a = 0;
    }

    public void handleMessage(Message message)
    {
        int j;
        long l;
        j = App.am;
        if (RecordAudio.f(b) == 3)
        {
            int i = RecordAudio.n(b).b();
            if (i / 1000 != a)
            {
                RecordAudio.g(b).setText(DateUtils.formatElapsedTime(i / 1000));
                a = i / 1000;
            }
            RecordAudio.k(b).setProgress(i);
            RecordAudio.h(b).setProgress(i);
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_375;
            }
        }
        if (RecordAudio.f(b) != 1)
        {
            break MISSING_BLOCK_LABEL_375;
        }
        l = System.currentTimeMillis() - RecordAudio.c(b);
        if (l <= 0x1d4c0L) goto _L2; else goto _L1
_L1:
        RecordAudio.e(b);
        RecordAudio.c(b, 4);
        RecordAudio.a(b, RecordAudio.f(b));
        if (j == 0) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        long l1 = l / 1000L;
        RecordAudio.g(b).setText(DateUtils.formatElapsedTime(120L - l1));
        RecordAudio.a(b).setText(DateUtils.formatElapsedTime(l1));
        RecordAudio.k(b).setProgress((int)l);
_L5:
label0:
        {
label1:
            {
                if (!flag && !b.isFinishing() && (RecordAudio.f(b) == 3 && RecordAudio.n(b).f() || RecordAudio.f(b) == 1))
                {
                    RecordAudio.j(b).sendEmptyMessageDelayed(0, 50L);
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                if (RecordAudio.f(b) == 3)
                {
                    RecordAudio.h(b).setProgress(0);
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                if (RecordAudio.f(b) == 1)
                {
                    RecordAudio.k(b).setProgress(RecordAudio.k(b).getMax());
                }
            }
            RecordAudio.c(b, 4);
            RecordAudio.a(b, RecordAudio.f(b));
        }
        return;
_L4:
        flag = true;
          goto _L5
_L2:
        flag = false;
          goto _L6
        flag = false;
          goto _L5
    }
}
