// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupGeocodeRegion_PickupLocationProperties

public abstract class rties
{

    public static rties create(String s, String s1, String s2)
    {
        return (new Shape_GuidedPickupGeocodeRegion_PickupLocationProperties()).setId(s).setKind(s1).setName(s2);
    }

    public static setName create(String s, String s1, String s2, Float float1)
    {
        return (new Shape_GuidedPickupGeocodeRegion_PickupLocationProperties()).setId(s).setKind(s1).setName(s2).setRank(float1);
    }

    public abstract String getId();

    public abstract String getKind();

    public abstract String getName();

    public abstract Float getRank();

    abstract setRank setId(String s);

    abstract setRank setKind(String s);

    abstract setRank setName(String s);

    abstract setRank setRank(Float float1);

    public rties()
    {
    }
}
