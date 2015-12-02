// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hle;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectDynamicFare

abstract class ObjectDynamicFare
    implements hle
{

    ObjectDynamicFare()
    {
    }

    public static ObjectDynamicFare create()
    {
        return new Shape_ObjectDynamicFare();
    }
}
