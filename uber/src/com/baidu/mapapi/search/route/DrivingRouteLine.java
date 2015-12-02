// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.mapapi.search.route;

import com.baidu.mapapi.search.core.RouteLine;
import java.util.List;

public class DrivingRouteLine extends RouteLine
{

    private boolean a;
    private List b;

    DrivingRouteLine()
    {
    }

    void a(List list)
    {
        b = list;
    }

    public List getWayPoints()
    {
        return b;
    }

    public boolean isSupportTraffic()
    {
        return a;
    }
}
