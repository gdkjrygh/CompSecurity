// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.text.TextUtils;
import android.view.View;
import com.weather.commons.video.vast.Vast;

// Referenced classes of package com.weather.commons.video:
//            VideoPlaybackController

class val.vast
    implements android.view.Controller._cls5
{

    final VideoPlaybackController this$0;
    final String val$clickThroughURL;
    final Vast val$vast;

    public void onClick(View view)
    {
        if (!TextUtils.isEmpty(val$clickThroughURL))
        {
            view.setVisibility(4);
            VideoPlaybackController.access$900(VideoPlaybackController.this, val$vast);
        }
    }

    _cls9()
    {
        this$0 = final_videoplaybackcontroller;
        val$clickThroughURL = s;
        val$vast = Vast.this;
        super();
    }
}
