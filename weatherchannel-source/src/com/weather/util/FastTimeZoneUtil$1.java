// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import com.google.common.cache.CacheLoader;
import java.util.TimeZone;

// Referenced classes of package com.weather.util:
//            FastTimeZoneUtil

static final class  extends CacheLoader
{

    public volatile Object load(Object obj)
        throws Exception
    {
        return load((String)obj);
    }

    public TimeZone load(String s)
    {
        return TimeZone.getTimeZone(s);
    }

    ()
    {
    }
}
