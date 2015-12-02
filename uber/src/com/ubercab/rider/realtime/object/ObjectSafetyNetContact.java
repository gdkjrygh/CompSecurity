// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hmp;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectSafetyNetContact

public abstract class ObjectSafetyNetContact
    implements hmp
{

    public ObjectSafetyNetContact()
    {
    }

    public static ObjectSafetyNetContact create(String s, String s1)
    {
        Shape_ObjectSafetyNetContact shape_objectsafetynetcontact = new Shape_ObjectSafetyNetContact();
        shape_objectsafetynetcontact.setName(s);
        shape_objectsafetynetcontact.setPhone(s1);
        return shape_objectsafetynetcontact;
    }
}
