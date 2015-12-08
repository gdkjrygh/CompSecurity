// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.commons.video2:
//            VideoManager, VideoMessage

private final class <init>
    implements Receiver
{

    final VideoManager this$0;
    private final Stopwatch watch;
    private final Receiver wrappedReceiver;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((List)obj, obj1);
    }

    public void onCompletion(List list, Object obj)
    {
        Preconditions.checkNotNull(obj);
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "VideoListReceiver.onCompletion with result size=%d, userData=%s, watch=%s", new Object[] {
            Integer.valueOf(list.size()), obj, watch
        });
        VideoMessage videomessage;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "videoId=%s title=%s", new Object[] {
    videomessage.getId(), videomessage.getTeaserTitle()
}))
        {
            videomessage = (VideoMessage)iterator.next();
            addVideo(videomessage);
        }

        wrappedReceiver.onCompletion(list, obj);
    }

    public void onError(Throwable throwable, Object obj)
    {
        Preconditions.checkNotNull(obj);
        ExceptionUtil.logExceptionError("VideoManager", (new StringBuilder()).append("VideoListReceiver.onError: failed while trying to get videos. userData=").append(obj).toString(), throwable);
        wrappedReceiver.onError(throwable, obj);
    }

    private I(Receiver receiver)
    {
        this$0 = VideoManager.this;
        super();
        watch = Stopwatch.createStarted();
        wrappedReceiver = (Receiver)Preconditions.checkNotNull(receiver);
    }

    wrappedReceiver(Receiver receiver, wrappedReceiver wrappedreceiver)
    {
        this(receiver);
    }
}
