// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;

import com.google.common.base.Predicate;
import com.weather.util.StringUtils;
import com.weather.util.ZipCodeUtils;

// Referenced classes of package com.weather.commons.locations:
//            LocationUtils

private static class <init>
    implements Predicate
{

    public volatile boolean apply(Object obj)
    {
        return apply((String)obj);
    }

    public boolean apply(String s)
    {
        return !StringUtils.hasAnyDigits(s) || ZipCodeUtils.isZipCode(s);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
