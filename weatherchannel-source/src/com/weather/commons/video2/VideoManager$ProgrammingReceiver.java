// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.cache.Cache;
import com.google.common.collect.ImmutableList;
import com.weather.commons.video2.dsx.VideoProgrammingEndpoint;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.commons.video2:
//            VideoManager, VideoMessage

private final class <init>
    implements Receiver
{

    private final Receiver notificationReceiver;
    final VideoManager this$0;
    private final Stopwatch watch;

    public void onCompletion(VideoProgrammingEndpoint videoprogrammingendpoint, <init> <init>1)
    {
        Object obj;
        List list;
        Object obj1;
        Preconditions.checkNotNull(<init>1);
        list = videoprogrammingendpoint.getModuleVideos();
        obj1 = videoprogrammingendpoint.getRightNowVideo();
        VideoMessage videomessage;
        if (obj1 == null)
        {
            obj = Collections.emptyList();
        } else
        {
            obj = ImmutableList.of(obj1);
        }
        videomessage = videoprogrammingendpoint.getWidgetVideo();
        if (videomessage == null)
        {
            videoprogrammingendpoint = Collections.emptyList();
        } else
        {
            videoprogrammingendpoint = ImmutableList.of(videomessage);
        }
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "ProgrammingReceiver.onCompletion for video editorialFeed=%s, main count=%s, rightNowVideo=%s, widgetVideo=%s, watch=%s", new Object[] {
            <init>1, Integer.valueOf(list.size()), obj1, videomessage, watch
        });
        VideoManager.access$800(VideoManager.this).put(this._fld0, list);
        for (obj1 = list.iterator(); ((Iterator) (obj1)).hasNext(); addVideo(videomessage))
        {
            videomessage = (VideoMessage)((Iterator) (obj1)).next();
        }

        VideoManager.access$800(VideoManager.this).put(NOW, obj);
        VideoMessage videomessage1;
        for (obj1 = ((List) (obj)).iterator(); ((Iterator) (obj1)).hasNext(); addVideo(videomessage1))
        {
            videomessage1 = (VideoMessage)((Iterator) (obj1)).next();
        }

        VideoManager.access$800(VideoManager.this).put(, videoprogrammingendpoint);
        VideoMessage videomessage2;
        for (obj1 = videoprogrammingendpoint.iterator(); ((Iterator) (obj1)).hasNext(); addVideo(videomessage2))
        {
            videomessage2 = (VideoMessage)((Iterator) (obj1)).next();
        }

        obj1 = Collections.emptyList();
        ther.commons.video2.VideoManager.EditorialFeed[<init>1.l()];
        JVM INSTR tableswitch 1 3: default 324
    //                   1 339
    //                   2 345
    //                   3 350;
           goto _L1 _L2 _L3 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        videoprogrammingendpoint = ((VideoProgrammingEndpoint) (obj1));
_L6:
        notificationReceiver.onCompletion(videoprogrammingendpoint, <init>1);
        return;
_L2:
        videoprogrammingendpoint = list;
        continue; /* Loop/switch isn't completed */
_L3:
        videoprogrammingendpoint = ((VideoProgrammingEndpoint) (obj));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((VideoProgrammingEndpoint)obj, (onCompletion)obj1);
    }

    public void onError(Throwable throwable, onCompletion oncompletion)
    {
        Preconditions.checkNotNull(oncompletion);
        ExceptionUtil.logExceptionError("VideoManager", (new StringBuilder()).append("ProgrammingReceiver.onError: failed while trying to get feed. editorialFeed=").append(oncompletion).toString(), throwable);
        notificationReceiver.onError(throwable, oncompletion);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (onError)obj);
    }

    private A(Receiver receiver)
    {
        this$0 = VideoManager.this;
        super();
        watch = Stopwatch.createStarted();
        notificationReceiver = (Receiver)Preconditions.checkNotNull(receiver);
    }

    notificationReceiver(Receiver receiver, notificationReceiver notificationreceiver)
    {
        this(receiver);
    }
}
