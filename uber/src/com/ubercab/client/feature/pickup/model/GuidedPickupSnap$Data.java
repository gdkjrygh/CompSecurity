// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupSnap_Data

public abstract class ion
{

    public static ion create(String s, String s1, ion ion)
    {
        return (new Shape_GuidedPickupSnap_Data()).setKind(s).setId(s1).setLocation(ion);
    }

    public abstract String getId();

    public abstract String getKind();

    public abstract ion getLocation();

    abstract ion setId(String s);

    abstract ion setKind(String s);

    abstract ion setLocation(ion ion);

    public ion()
    {
    }
}
