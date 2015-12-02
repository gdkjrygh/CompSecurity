// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hmt;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectTagline

abstract class ObjectTagline
    implements hmt
{

    ObjectTagline()
    {
    }

    static ObjectTagline create()
    {
        return new Shape_ObjectTagline();
    }
}
