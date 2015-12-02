// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;

import java.util.Map;

public final class NearbyVehiclesEvent
{

    private final Map mNearbyVehicles;

    public NearbyVehiclesEvent(Map map)
    {
        mNearbyVehicles = map;
    }

    public final Map getNearbyVehicles()
    {
        return mNearbyVehicles;
    }
}
