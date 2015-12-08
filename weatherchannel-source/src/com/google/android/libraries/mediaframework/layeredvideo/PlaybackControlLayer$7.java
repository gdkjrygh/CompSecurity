// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.os.Handler;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.exoplayer.util.PlayerControl;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            PlaybackControlLayer, LayerManager

class this._cls0
    implements android.widget.Listener
{

    final PlaybackControlLayer this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag && PlaybackControlLayer.access$1300(PlaybackControlLayer.this))
        {
            seekbar = getLayerManager().getControl();
            long l = seekbar.getDuration();
            l = ((long)i * l) / 1000L;
            seekbar.seekTo((int)l);
            if (PlaybackControlLayer.access$1400(PlaybackControlLayer.this) != null)
            {
                PlaybackControlLayer.access$1400(PlaybackControlLayer.this).setText(stringForTime((int)l));
                return;
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        show(0);
        PlaybackControlLayer.access$102(PlaybackControlLayer.this, true);
        PlaybackControlLayer.access$700(PlaybackControlLayer.this).removeMessages(2);
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        PlaybackControlLayer.access$102(PlaybackControlLayer.this, false);
        updateProgress();
        updatePlayPauseButton();
        show(2500);
        PlaybackControlLayer.access$700(PlaybackControlLayer.this).sendEmptyMessage(2);
    }

    ()
    {
        this$0 = PlaybackControlLayer.this;
        super();
    }
}
