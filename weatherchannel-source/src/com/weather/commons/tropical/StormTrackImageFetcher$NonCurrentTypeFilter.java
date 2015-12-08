// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Predicate;

// Referenced classes of package com.weather.commons.tropical:
//            StormTrackImageFetcher, StormPosition

private static class typeToInclude
    implements Predicate
{

    private final apply typeToInclude;

    public boolean apply(StormPosition stormposition)
    {
        return stormposition == null || typeToInclude == stormposition.getStormType() && stormposition.getStatus() != typeToInclude;
    }

    public volatile boolean apply(Object obj)
    {
        return apply((StormPosition)obj);
    }

    ( )
    {
        typeToInclude = ;
    }
}
