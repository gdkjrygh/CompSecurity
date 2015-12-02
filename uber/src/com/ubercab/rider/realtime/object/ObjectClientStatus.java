// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hla;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectClientStatus

abstract class ObjectClientStatus
    implements hla
{

    ObjectClientStatus()
    {
    }

    public static ObjectClientStatus create()
    {
        return new Shape_ObjectClientStatus();
    }
}
