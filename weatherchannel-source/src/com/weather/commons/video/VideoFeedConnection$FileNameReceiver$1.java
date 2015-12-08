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

class val.userData
    implements Runnable
{

    final val.userData this$0;
    final String val$result;
    final Object val$userData;

    public void run()
    {
        try
        {
            AdaptiveVideoFeedParser adaptivevideofeedparser = new AdaptiveVideoFeedParser(Files.toString(new File(val$result), Charsets.UTF_8), cess._mth200(this._cls0.this));
            cess._mth300(this._cls0.this).onCompletion(adaptivevideofeedparser.parseList(), val$userData);
            return;
        }
        catch (Throwable throwable)
        {
            VideoFeedConnection.access$400(VideoFeedConnection.getInstance()).invalidate(cess._mth200(this._cls0.this));
            cess._mth300(this._cls0.this).onError(throwable, val$userData);
            return;
        }
    }

    ()
    {
        this$0 = final_;
        val$result = s;
        val$userData = Object.this;
        super();
    }
}
