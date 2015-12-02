// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.geojson.model;

import com.ubercab.rider.realtime.model.GeoJsonCollection;
import java.util.List;

public interface FeatureCollection
    extends GeoJsonCollection
{

    public abstract List getFeatures();
}
