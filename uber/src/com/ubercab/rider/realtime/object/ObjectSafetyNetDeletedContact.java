// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hmq;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectSafetyNetDeletedContact

public abstract class ObjectSafetyNetDeletedContact
    implements hmq
{

    public ObjectSafetyNetDeletedContact()
    {
    }

    public static ObjectSafetyNetDeletedContact create(String s)
    {
        Shape_ObjectSafetyNetDeletedContact shape_objectsafetynetdeletedcontact = new Shape_ObjectSafetyNetDeletedContact();
        shape_objectsafetynetdeletedcontact.setId(s);
        return shape_objectsafetynetdeletedcontact;
    }
}
