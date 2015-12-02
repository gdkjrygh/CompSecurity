// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.whatsapp.util.s;

// Referenced classes of package com.whatsapp:
//            MediaView, App, xv

class ip
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final MediaView a;

    private ip(MediaView mediaview)
    {
        a = mediaview;
        super();
    }

    ip(MediaView mediaview, xv xv)
    {
        this(mediaview);
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        try
        {
            seekbar.setProgress(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SeekBar seekbar)
        {
            return;
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        if (MediaView.h(a) != null && MediaView.h(a).f())
        {
            MediaView.h(a).h();
        }
        MediaView.u(a).removeMessages(0);
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
label0:
        {
            int i = App.am;
            if (MediaView.h(a) != null)
            {
                if (com.whatsapp.MediaView.s(a) == 4)
                {
                    MediaView.h(a).b((int)((float)MediaView.h(a).a() * ((float)seekbar.getProgress() / (float)seekbar.getMax())));
                    MediaView.h(a).i();
                    MediaView.u(a).sendEmptyMessage(0);
                    MediaView.g(a).setImageResource(0x7f0205d2);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                MediaView.i(a, (int)((float)MediaView.h(a).a() * ((float)seekbar.getProgress() / (float)seekbar.getMax())));
                if (i == 0)
                {
                    break label0;
                }
            }
            seekbar.setProgress(0);
        }
    }
}
