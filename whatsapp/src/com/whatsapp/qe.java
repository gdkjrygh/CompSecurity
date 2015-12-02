// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.SeekBar;

// Referenced classes of package com.whatsapp:
//            VideoPreviewActivity, VideoView, ao0

class qe
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final VideoPreviewActivity a;

    qe(VideoPreviewActivity videopreviewactivity)
    {
        a = videopreviewactivity;
        super();
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            VideoPreviewActivity.a(a).seekTo(i);
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        if (!VideoPreviewActivity.a(a).isPlaying())
        {
            VideoPreviewActivity.f(a).a(seekbar.getProgress());
        }
        VideoPreviewActivity.a(a).seekTo(seekbar.getProgress());
        VideoPreviewActivity.c(a, false);
    }
}
