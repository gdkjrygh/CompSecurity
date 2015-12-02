// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hlh;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectEyeball

abstract class ObjectEyeball
    implements hlh
{

    ObjectEyeball()
    {
    }

    public static ObjectEyeball create()
    {
        return new Shape_ObjectEyeball();
    }
}
