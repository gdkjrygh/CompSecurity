// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_SafetyNetDeleteContactsBody

public abstract class SafetyNetDeleteContactsBody
{

    public SafetyNetDeleteContactsBody()
    {
    }

    public static SafetyNetDeleteContactsBody create(List list)
    {
        return (new Shape_SafetyNetDeleteContactsBody()).setContacts(list);
    }

    public abstract List getContacts();

    public abstract SafetyNetDeleteContactsBody setContacts(List list);
}
