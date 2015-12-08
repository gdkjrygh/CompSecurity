// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.flu;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.weather.Weather.feed.FeedAdConfig;

// Referenced classes of package com.weather.Weather.flu:
//            ColdFluInjection

class this._cls0
    implements Supplier
{

    final ColdFluInjection this$0;

    public FeedAdConfig get()
    {
        return new FeedAdConfig(100, 100, ImmutableList.of());
    }

    public volatile Object get()
    {
        return get();
    }

    ()
    {
        this$0 = ColdFluInjection.this;
        super();
    }
}
