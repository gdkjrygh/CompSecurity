// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.widget.ImageView;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.video:
//            VideoPlaybackController

class this._cls0
    implements acks.PositionListener
{

    final VideoPlaybackController this$0;

    public void onPositionChange()
    {
        LogUtil.d("VideoPlaybackController", LoggingMetaTags.TWC_UI, "in hideLearnMoreListener.run", new Object[0]);
        VideoPlaybackController.access$800(VideoPlaybackController.this).setVisibility(4);
    }

    acks.PositionListener()
    {
        this$0 = VideoPlaybackController.this;
        super();
    }
}
