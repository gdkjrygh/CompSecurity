// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableList;
import com.weather.commons.video2.dsx.VideoAssetList;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Iterator;

// Referenced classes of package com.weather.commons.video2:
//            VideoManager, VideoMessage, ChunkedMessage, RangedQuery

private final class <init>
    implements Receiver
{

    private final onError adaptor;
    final VideoManager this$0;
    private final Stopwatch watch;
    private final Receiver wrappedReceiver;

    public void onCompletion(VideoAssetList videoassetlist, RangedQuery rangedquery)
    {
        Preconditions.checkNotNull(rangedquery);
        videoassetlist = videoassetlist.getVideos();
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "ChunkReceiver.onCompletion with result size=%d, query=%s, watch=%s", new Object[] {
            Integer.valueOf(videoassetlist.size()), rangedquery, watch
        });
        VideoMessage videomessage;
        for (com.google.common.collect.UnmodifiableIterator unmodifiableiterator = videoassetlist.iterator(); unmodifiableiterator.hasNext(); addVideo(videomessage))
        {
            videomessage = (VideoMessage)unmodifiableiterator.next();
        }

        com.google.common.collect.  = ImmutableList.builder();
        for (videoassetlist = videoassetlist.iterator(); videoassetlist.hasNext(); .watch(new ChunkedMessage(rangedquery, (VideoMessage)videoassetlist.next()))) { }
        videoassetlist = .();
        wrappedReceiver.onCompletion(adaptor.adapt(videoassetlist), rangedquery);
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((VideoAssetList)obj, (RangedQuery)obj1);
    }

    public void onError(Throwable throwable, RangedQuery rangedquery)
    {
        Preconditions.checkNotNull(rangedquery);
        ExceptionUtil.logExceptionError("VideoManager", (new StringBuilder()).append("CollectionChunkReceiver.onError: failed while trying to get videos. query=").append(rangedquery).toString(), throwable);
        wrappedReceiver.onError(throwable, rangedquery);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (RangedQuery)obj);
    }

    private (Receiver receiver,  )
    {
        this$0 = VideoManager.this;
        super();
        watch = Stopwatch.createStarted();
        wrappedReceiver = (Receiver)Preconditions.checkNotNull(receiver);
        adaptor = ;
    }

    adaptor(Receiver receiver, adaptor adaptor1, adaptor adaptor2)
    {
        this(receiver, adaptor1);
    }
}
