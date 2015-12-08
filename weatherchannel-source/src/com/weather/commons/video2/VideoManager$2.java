// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.weather.commons.video2.dsx.VideoAsset;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.video2:
//            VideoManager

class val.playlist
    implements Receiver
{

    final VideoManager this$0;
    final boolean val$force;
    final String val$playlist;
    final Receiver val$resultReceiver;

    public void onCompletion(VideoAsset videoasset, String s)
    {
        LogUtil.d("VideoManager", LoggingMetaTags.TWC_VIDEOS, "retrieved video: id=%s", new Object[] {
            videoasset.getId()
        });
        addVideo(videoasset);
        VideoManager.access$200(VideoManager.this, videoasset, val$playlist, val$resultReceiver, val$force);
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((VideoAsset)obj, (String)obj1);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (String)obj);
    }

    public void onError(Throwable throwable, String s)
    {
        s = VideoManager.this;
        Receiver receiver = val$resultReceiver;
        boolean flag = val$force;
        if (val$playlist == null)
        {
            throwable = "pl-editor-picks";
        } else
        {
            throwable = val$playlist;
        }
        s.requestPlaylistVideos(receiver, flag, throwable);
    }

    ()
    {
        this$0 = final_videomanager;
        val$resultReceiver = receiver;
        val$force = flag;
        val$playlist = String.this;
        super();
    }
}
