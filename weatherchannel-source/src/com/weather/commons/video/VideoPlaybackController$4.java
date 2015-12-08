// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.weather.commons.video:
//            VideoPlaybackController, VideoViewWithPositionCallbacks

class val.clickThroughURL
    implements android.view.Controller._cls4
{

    final VideoPlaybackController this$0;
    final String val$clickThroughURL;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag1 = true;
        boolean flag;
        if (VideoPlaybackController.access$300(VideoPlaybackController.this).getCurrentPosition() > VideoPlaybackController.access$200(VideoPlaybackController.this))
        {
            flag = false;
        } else
        {
            flag = flag1;
            if (motionevent.getAction() == 1)
            {
                flag = flag1;
                if (!TextUtils.isEmpty(val$clickThroughURL))
                {
                    VideoPlaybackController.access$300(VideoPlaybackController.this).performClick();
                    return true;
                }
            }
        }
        return flag;
    }

    acks()
    {
        this$0 = final_videoplaybackcontroller;
        val$clickThroughURL = String.this;
        super();
    }
}
