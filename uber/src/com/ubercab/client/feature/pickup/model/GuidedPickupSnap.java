// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupSnap

public abstract class GuidedPickupSnap
{

    public static final String STATUS_FAILURE = "failure";
    public static final String STATUS_SUCCESS = "success";

    public GuidedPickupSnap()
    {
    }

    public static GuidedPickupSnap create()
    {
        return create(null, true);
    }

    public static GuidedPickupSnap create(List list, boolean flag)
    {
        GuidedPickupSnap guidedpickupsnap = (new Shape_GuidedPickupSnap()).setData(list);
        if (flag)
        {
            list = "success";
        } else
        {
            list = "failure";
        }
        return guidedpickupsnap.setStatus(list);
    }

    public abstract List getData();

    public abstract String getStatus();

    abstract GuidedPickupSnap setData(List list);

    abstract GuidedPickupSnap setStatus(String s);
}
