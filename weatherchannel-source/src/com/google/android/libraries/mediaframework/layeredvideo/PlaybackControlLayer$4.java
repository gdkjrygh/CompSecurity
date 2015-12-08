// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            PlaybackControlLayer

class this._cls0
    implements com.google.android.libraries.mediaframework.exoplayerextensions.er
{

    final PlaybackControlLayer this$0;

    public void onError(Exception exception)
    {
        PlaybackControlLayer.access$1000(PlaybackControlLayer.this);
    }

    public void onStateChanged(boolean flag, int i)
    {
        LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "control layer onStateChanged: player=%s, playWhenReady=%s, playbackState=%s", new Object[] {
            PlaybackControlLayer.access$400(PlaybackControlLayer.this), Boolean.valueOf(flag), ExoplayerUtil.getExoplayerStateString(i)
        });
        switch (i)
        {
        default:
            return;

        case 4: // '\004'
            if (!flag)
            {
                updateProgress();
            }
            // fall through

        case 1: // '\001'
        case 5: // '\005'
            PlaybackControlLayer.access$1000(PlaybackControlLayer.this);
            return;

        case 2: // '\002'
        case 3: // '\003'
            PlaybackControlLayer.access$1100(PlaybackControlLayer.this);
            return;
        }
    }

    public void onVideoSizeChanged(int i, int j, int k, float f)
    {
    }

    .Listener()
    {
        this$0 = PlaybackControlLayer.this;
        super();
    }
}
