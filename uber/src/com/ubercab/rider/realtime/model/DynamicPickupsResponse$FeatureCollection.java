// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            GeoJsonCollection, Shape_DynamicPickupsResponse_FeatureCollection

public abstract class ction
    implements GeoJsonCollection
{

    public static transient ction create(ction action[])
    {
        return (new Shape_DynamicPickupsResponse_FeatureCollection()).setFeatures(Arrays.asList(action));
    }

    public abstract List getFeatures();

    abstract ction.setFeatures setFeatures(List list);

    public ction()
    {
    }
}
