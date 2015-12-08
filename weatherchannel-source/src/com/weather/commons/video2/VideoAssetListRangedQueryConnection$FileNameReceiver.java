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
//            VideoAssetListRangedQueryConnection, RangedQuery

private class <init>
    implements Receiver
{

    private final RangedQuery localQuery;
    final VideoAssetListRangedQueryConnection this$0;
    private final Receiver videoAssetListReceiver;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(String s, Object obj)
    {
        try
        {
            s = Files.toString(new File(s), Charsets.UTF_8);
            videoAssetListReceiver.onCompletion(VideoAssetList.fromJsonString(s), obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        VideoAssetListRangedQueryConnection.access$300(VideoAssetListRangedQueryConnection.this).invalidate(localQuery);
        videoAssetListReceiver.onError(s, obj);
    }

    public void onError(Throwable throwable, Object obj)
    {
        videoAssetListReceiver.onError(throwable, obj);
    }

    private (RangedQuery rangedquery, Receiver receiver)
    {
        this$0 = VideoAssetListRangedQueryConnection.this;
        super();
        localQuery = rangedquery;
        videoAssetListReceiver = receiver;
    }

    videoAssetListReceiver(RangedQuery rangedquery, Receiver receiver, videoAssetListReceiver videoassetlistreceiver)
    {
        this(rangedquery, receiver);
    }
}
