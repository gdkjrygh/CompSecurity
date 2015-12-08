// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.weather.commons.video2.dsx.VideoOrderedListEndpoint;
import com.weather.dal2.cache.FileCache;
import com.weather.dal2.net.Receiver;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.video2:
//            VideoPlaylistConnection

private class <init>
    implements Receiver
{

    private final String playlistName;
    final VideoPlaylistConnection this$0;
    private final Receiver videoMessageReceiver;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(final String result, final Object userData)
    {
        (new Thread(new Runnable() {

            final VideoPlaylistConnection.FileNameReceiver this$1;
            final String val$result;
            final Object val$userData;

            public void run()
            {
                java.util.List list = VideoOrderedListEndpoint.fromJsonString(Files.toString(new File(result), Charsets.UTF_8)).getVideos();
                videoMessageReceiver.onCompletion(list, userData);
                return;
                Object obj;
                obj;
_L2:
                VideoPlaylistConnection.access$200(this$0).invalidate(playlistName);
                videoMessageReceiver.onError(((Throwable) (obj)), userData);
                return;
                obj;
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$1 = VideoPlaylistConnection.FileNameReceiver.this;
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



    private _cls1.val.userData(String s, Receiver receiver)
    {
        this$0 = VideoPlaylistConnection.this;
        super();
        playlistName = s;
        videoMessageReceiver = receiver;
    }

    videoMessageReceiver(String s, Receiver receiver, videoMessageReceiver videomessagereceiver)
    {
        this(s, receiver);
    }
}
