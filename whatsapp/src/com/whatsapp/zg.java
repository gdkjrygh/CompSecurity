// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.text.format.DateUtils;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.util.s;

// Referenced classes of package com.whatsapp:
//            RecordAudio, App

class zg
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final RecordAudio a;

    zg(RecordAudio recordaudio)
    {
        a = recordaudio;
        super();
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            RecordAudio.g(a).setText(DateUtils.formatElapsedTime(i / 1000));
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        if (RecordAudio.n(a) != null && RecordAudio.n(a).f())
        {
            RecordAudio.n(a).h();
        }
        RecordAudio.j(a).removeMessages(0);
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
label0:
        {
            if (RecordAudio.n(a) != null)
            {
                if (RecordAudio.f(a) != 3)
                {
                    break label0;
                }
                RecordAudio.n(a).b(seekbar.getProgress());
                RecordAudio.n(a).i();
                RecordAudio.j(a).sendEmptyMessage(0);
                RecordAudio.b(a).setImageResource(0x7f0205d2);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            seekbar.setProgress(0);
        }
    }
}
