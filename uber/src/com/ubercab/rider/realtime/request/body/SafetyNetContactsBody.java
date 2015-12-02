// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_SafetyNetContactsBody

public abstract class SafetyNetContactsBody
{

    public SafetyNetContactsBody()
    {
    }

    public static SafetyNetContactsBody create(List list)
    {
        return (new Shape_SafetyNetContactsBody()).setContacts(list);
    }

    public abstract List getContacts();

    public abstract SafetyNetContactsBody setContacts(List list);
}
