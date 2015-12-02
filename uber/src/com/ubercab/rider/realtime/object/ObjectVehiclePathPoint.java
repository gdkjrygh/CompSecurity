// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hno;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectVehiclePathPoint

abstract class ObjectVehiclePathPoint
    implements hno
{

    ObjectVehiclePathPoint()
    {
    }

    public static ObjectVehiclePathPoint create()
    {
        return new Shape_ObjectVehiclePathPoint();
    }
}
