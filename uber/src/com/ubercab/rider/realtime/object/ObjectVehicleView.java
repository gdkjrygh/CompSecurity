// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hnp;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectVehicleView

abstract class ObjectVehicleView
    implements hnp
{

    ObjectVehicleView()
    {
    }

    static ObjectVehicleView create()
    {
        return new Shape_ObjectVehicleView();
    }

    public boolean isDestinationEnabled()
    {
        return !"hidden".equals(getDestinationEntry());
    }

    public boolean isDestinationPreferred()
    {
        return "preferred".equals(getDestinationEntry());
    }

    public boolean isDestinationRequired()
    {
        return "requiredNotEditable".equals(getDestinationEntry());
    }
}
