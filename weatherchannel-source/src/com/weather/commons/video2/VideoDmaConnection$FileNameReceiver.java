// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.weather.commons.video2.dsx.VideoAssetList;
import com.weather.dal2.cache.FileCache;
import com.weather.dal2.net.Receiver;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.video2:
//            VideoDmaConnection, Dma

private class <init>
    implements Receiver
{

    private final Dma dma;
    final VideoDmaConnection this$0;
    private final Receiver videoMessageReceiver;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(final String result, final Object userData)
    {
        (new Thread(new Runnable() {

            final VideoDmaConnection.FileNameReceiver this$1;
            final String val$result;
            final Object val$userData;

            public void run()
            {
                String s = Files.toString(new File(result), Charsets.UTF_8);
                videoMessageReceiver.onCompletion(VideoAssetList.fromJsonString(s).getVideos(), userData);
                return;
                Object obj;
                obj;
_L2:
                VideoDmaConnection.access$200(this$0).invalidate(dma);
                videoMessageReceiver.onError(((Throwable) (obj)), userData);
                return;
                obj;
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$1 = VideoDmaConnection.FileNameReceiver.this;
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



    private _cls1.val.userData(Dma dma1, Receiver receiver)
    {
        this$0 = VideoDmaConnection.this;
        super();
        dma = dma1;
        videoMessageReceiver = receiver;
    }

    videoMessageReceiver(Dma dma1, Receiver receiver, videoMessageReceiver videomessagereceiver)
    {
        this(dma1, receiver);
    }
}
