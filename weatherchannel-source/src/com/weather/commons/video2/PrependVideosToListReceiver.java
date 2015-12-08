// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.weather.commons.video2:
//            VideoListMerger, VideoMessage

public class PrependVideosToListReceiver
    implements Receiver
{

    private static final String TAG = "PrependVideoToListReceiver";
    private final List videosToPrepend;
    private final Receiver wrappedReceiver;

    public PrependVideosToListReceiver(Receiver receiver, VideoMessage videomessage)
    {
        this(receiver, ((List) (ImmutableList.of(Preconditions.checkNotNull(videomessage)))));
    }

    public PrependVideosToListReceiver(Receiver receiver, List list)
    {
        wrappedReceiver = (Receiver)Preconditions.checkNotNull(receiver);
        videosToPrepend = ImmutableList.copyOf((Collection)Preconditions.checkNotNull(list));
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((List)obj, obj1);
    }

    public void onCompletion(List list, Object obj)
    {
        wrappedReceiver.onCompletion((new VideoListMerger()).add(videosToPrepend).add(list).getMergedResult(), obj);
    }

    public void onError(Throwable throwable, Object obj)
    {
        LogUtil.d("PrependVideoToListReceiver", LoggingMetaTags.TWC_VIDEOS, "Ignoring playlist/collection failure: \"%s\", returning original videos", new Object[] {
            (new StringBuilder()).append(throwable.getClass().getSimpleName()).append(':').append(throwable.getMessage()).toString()
        });
        wrappedReceiver.onCompletion((new VideoListMerger()).add(videosToPrepend).getMergedResult(), obj);
    }
}
