// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hlb;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectContact

public abstract class ObjectContact
    implements hlb
{

    public ObjectContact()
    {
    }

    public static ObjectContact create()
    {
        return new Shape_ObjectContact();
    }
}
