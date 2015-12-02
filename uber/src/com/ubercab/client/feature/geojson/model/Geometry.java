// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.geojson.model;

import com.ubercab.rider.realtime.model.GeoJsonGeometry;

public abstract class Geometry
    implements GeoJsonGeometry
{

    public Geometry()
    {
    }

    public abstract Object getCoordinates();

    public int getLatIndex()
    {
        return 0;
    }

    public int getLngIndex()
    {
        return 1;
    }

    public abstract String getType();
}
