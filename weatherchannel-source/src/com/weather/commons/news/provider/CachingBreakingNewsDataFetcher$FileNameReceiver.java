// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.weather.dal2.cache.FileCache;
import com.weather.dal2.net.Receiver;
import java.io.File;

// Referenced classes of package com.weather.commons.news.provider:
//            CachingBreakingNewsDataFetcher, BreakingNewsData

private class <init>
    implements Receiver
{

    private final Receiver articleReceiver;
    private final String breakingKey;
    final CachingBreakingNewsDataFetcher this$0;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(final String result, final Object userData)
    {
        (new Thread(new Runnable() {

            final CachingBreakingNewsDataFetcher.FileNameReceiver this$1;
            final String val$result;
            final Object val$userData;

            public void run()
            {
                try
                {
                    String s = Files.toString(new File(result), Charsets.UTF_8);
                    articleReceiver.onCompletion(BreakingNewsData.fromJsonString(s), userData);
                    return;
                }
                catch (Throwable throwable)
                {
                    CachingBreakingNewsDataFetcher.access$300(this$0).invalidate(breakingKey);
                    articleReceiver.onError(throwable, userData);
                    return;
                }
            }

            
            {
                this$1 = CachingBreakingNewsDataFetcher.FileNameReceiver.this;
                result = s;
                userData = obj;
                super();
            }
        })).start();
    }

    public void onError(Throwable throwable, Object obj)
    {
        articleReceiver.onError(throwable, obj);
    }



    private _cls1.val.userData(String s, Receiver receiver)
    {
        this$0 = CachingBreakingNewsDataFetcher.this;
        super();
        breakingKey = s;
        articleReceiver = receiver;
    }

    articleReceiver(String s, Receiver receiver, articleReceiver articlereceiver)
    {
        this(s, receiver);
    }
}
