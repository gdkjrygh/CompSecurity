// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.google.common.cache.CacheLoader;
import java.util.Map;

// Referenced classes of package com.weather.ads2.targeting:
//            TargetingDataConnection

class this._cls0 extends CacheLoader
{

    final TargetingDataConnection this$0;

    public volatile Object load(Object obj)
        throws Exception
    {
        return load((String)obj);
    }

    public Map load(String s)
    {
        return loadData();
    }

    ()
    {
        this$0 = TargetingDataConnection.this;
        super();
    }
}
