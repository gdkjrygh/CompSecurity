// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.mapapi.search.route;

import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.TaxiInfo;

public final class TransitRouteLine extends RouteLine
{

    private TaxiInfo a;

    TransitRouteLine()
    {
    }

    public final TaxiInfo getTaxitInfo()
    {
        return a;
    }
}
