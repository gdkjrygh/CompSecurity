// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.google.common.base.Function;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsBuckets

static final class 
    implements Function
{

    public volatile Object apply(Object obj)
    {
        return apply((Long)obj);
    }

    public String apply(Long long1)
    {
        if (long1 == null)
        {
            return null;
        } else
        {
            return okup(long1.longValue());
        }
    }

    public String toString()
    {
        return "Seconds to TimeSpentInSeconds";
    }

    ()
    {
    }
}
