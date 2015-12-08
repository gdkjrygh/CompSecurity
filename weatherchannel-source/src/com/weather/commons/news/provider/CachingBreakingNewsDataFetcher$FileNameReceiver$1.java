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

class val.userData
    implements Runnable
{

    final val.userData this$1;
    final String val$result;
    final Object val$userData;

    public void run()
    {
        try
        {
            String s = Files.toString(new File(val$result), Charsets.UTF_8);
            cess._mth100(this._cls1.this).onCompletion(BreakingNewsData.fromJsonString(s), val$userData);
            return;
        }
        catch (Throwable throwable)
        {
            CachingBreakingNewsDataFetcher.access$300(_fld0).invalidate(cess._mth200(this._cls1.this));
            cess._mth100(this._cls1.this).onError(throwable, val$userData);
            return;
        }
    }

    Y()
    {
        this$1 = final_y;
        val$result = s;
        val$userData = Object.this;
        super();
    }
}
