// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import com.weather.dal2.net.Receiver;

// Referenced classes of package com.weather.commons.news.provider:
//            CachingBreakingNewsDataFetcher, BreakingNewsData

class this._cls0
    implements Receiver
{

    final CachingBreakingNewsDataFetcher this$0;

    public void onCompletion(BreakingNewsData breakingnewsdata, String s)
    {
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((BreakingNewsData)obj, (String)obj1);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (String)obj);
    }

    public void onError(Throwable throwable, String s)
    {
    }

    ()
    {
        this$0 = CachingBreakingNewsDataFetcher.this;
        super();
    }
}
