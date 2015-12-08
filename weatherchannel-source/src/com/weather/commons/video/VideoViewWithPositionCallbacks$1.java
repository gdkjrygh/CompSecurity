// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.os.Handler;
import java.util.Collection;

// Referenced classes of package com.weather.commons.video:
//            VideoViewWithPositionCallbacks

class this._cls0
    implements Runnable
{

    final VideoViewWithPositionCallbacks this$0;

    public void run()
    {
        VideoViewWithPositionCallbacks.access$000(VideoViewWithPositionCallbacks.this);
        if (!VideoViewWithPositionCallbacks.access$100(VideoViewWithPositionCallbacks.this).isEmpty())
        {
            VideoViewWithPositionCallbacks.access$300(VideoViewWithPositionCallbacks.this).postDelayed(VideoViewWithPositionCallbacks.access$200(VideoViewWithPositionCallbacks.this), 500L);
        }
    }

    ()
    {
        this$0 = VideoViewWithPositionCallbacks.this;
        super();
    }
}
