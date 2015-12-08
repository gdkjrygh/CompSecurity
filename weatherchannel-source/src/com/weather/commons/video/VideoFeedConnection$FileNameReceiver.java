// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.weather.dal2.cache.FileCache;
import com.weather.dal2.net.Receiver;
import java.io.File;

// Referenced classes of package com.weather.commons.video:
//            VideoFeedConnection, AdaptiveVideoFeedParser

private static class <init>
    implements Receiver
{

    private final Receiver videoMessageReceiver;
    private final videoMessageReceiver videoType;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(final String result, final Object userData)
    {
        (new Thread(new Runnable() {

            final VideoFeedConnection.FileNameReceiver this$0;
            final String val$result;
            final Object val$userData;

            public void run()
            {
                try
                {
                    AdaptiveVideoFeedParser adaptivevideofeedparser = new AdaptiveVideoFeedParser(Files.toString(new File(result), Charsets.UTF_8), videoType);
                    videoMessageReceiver.onCompletion(adaptivevideofeedparser.parseList(), userData);
                    return;
                }
                catch (Throwable throwable)
                {
                    VideoFeedConnection.access$400(VideoFeedConnection.getInstance()).invalidate(videoType);
                    videoMessageReceiver.onError(throwable, userData);
                    return;
                }
            }

            
            {
                this$0 = VideoFeedConnection.FileNameReceiver.this;
                result = s;
                userData = obj;
                super();
            }
        })).start();
    }

    public void onError(Throwable throwable, Object obj)
    {
        videoMessageReceiver.onError(throwable, obj);
    }



    private _cls1.val.userData(_cls1.val.userData userdata, Receiver receiver)
    {
        videoType = userdata;
        videoMessageReceiver = receiver;
    }

    videoMessageReceiver(videoMessageReceiver videomessagereceiver, Receiver receiver, videoMessageReceiver videomessagereceiver1)
    {
        this(videomessagereceiver, receiver);
    }
}
