// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.FeatureCollection;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupVenue_ZoneCollection

public abstract class ction
    implements FeatureCollection
{

    public static ction create(List list)
    {
        return (new Shape_GuidedPickupVenue_ZoneCollection()).setFeatures(list);
    }

    public abstract List getFeatures();

    abstract ction.setFeatures setFeatures(List list);

    public ction()
    {
    }
}
