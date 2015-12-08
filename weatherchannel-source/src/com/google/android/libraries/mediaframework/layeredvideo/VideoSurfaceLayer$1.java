// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            VideoSurfaceLayer, LayerManager, VideoSurfaceView

class this._cls0
    implements com.google.android.libraries.mediaframework.exoplayerextensions.tener
{

    final VideoSurfaceLayer this$0;

    public void onError(Exception exception)
    {
    }

    public void onStateChanged(boolean flag, int i)
    {
    }

    public void onVideoSizeChanged(int i, int j, int k, float f)
    {
        LogUtil.d("VideoSurfaceLayer", LoggingMetaTags.TWC_VIDEOS, "onVideoSizeChanged: player=%s, width=%s, height=%s, pixelWidthHeightRatio=%s", new Object[] {
            VideoSurfaceLayer.access$000(VideoSurfaceLayer.this).getPlayerName(), Integer.valueOf(i), Integer.valueOf(j), Float.valueOf(f)
        });
        VideoSurfaceView videosurfaceview = VideoSurfaceLayer.access$100(VideoSurfaceLayer.this);
        if (j == 0)
        {
            f = 1.0F;
        } else
        {
            f = ((float)i * f) / (float)j;
        }
        videosurfaceview.setVideoWidthHeightRatio(f);
    }

    per.Listener()
    {
        this$0 = VideoSurfaceLayer.this;
        super();
    }
}
