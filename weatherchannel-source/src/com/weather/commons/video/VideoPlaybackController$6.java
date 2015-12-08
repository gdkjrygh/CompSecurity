// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.widget.ImageView;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.video.vast.Vast;
import com.weather.util.app.AbstractTwcApplication;

// Referenced classes of package com.weather.commons.video:
//            VideoPlaybackController, VideoPlaybackSupport, VideoViewWithPositionCallbacks

class val.vast
    implements android.media.ener
{

    final VideoPlaybackController this$0;
    final Vast val$vast;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (VideoPlaybackController.access$500(VideoPlaybackController.this).shouldContinuePlaying())
        {
            VideoPlaybackController.access$1000(VideoPlaybackController.this, val$vast);
            if (val$vast.hasCreative())
            {
                VideoPlaybackController.access$002(VideoPlaybackController.this, true);
                VideoPlaybackController.access$300(VideoPlaybackController.this).setMediaController(null);
                VideoPlaybackController.access$300(VideoPlaybackController.this).addPositionListener(VideoPlaybackController.access$1100(VideoPlaybackController.this), VideoPlaybackController.access$200(VideoPlaybackController.this));
                VideoPlaybackController.access$800(VideoPlaybackController.this).setVisibility(0);
                VideoPlaybackController.access$300(VideoPlaybackController.this).addPositionListener(VideoPlaybackController.access$1200(VideoPlaybackController.this), 5000);
                if (!VideoPlaybackController.access$1300(VideoPlaybackController.this))
                {
                    Analytics.trackAction(AbstractTwcApplication.getRootContext().getResources().getString(com.weather.commons.tart), null);
                    VideoPlaybackController.access$1302(VideoPlaybackController.this, true);
                }
                return;
            } else
            {
                VideoPlaybackController.access$002(VideoPlaybackController.this, false);
                VideoPlaybackController.access$1100(VideoPlaybackController.this).onPositionChange();
                VideoPlaybackController.access$800(VideoPlaybackController.this).setVisibility(4);
                return;
            }
        } else
        {
            mediaplayer.pause();
            return;
        }
    }

    acks.PositionListener()
    {
        this$0 = final_videoplaybackcontroller;
        val$vast = Vast.this;
        super();
    }
}
