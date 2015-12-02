// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ContactsBody

public abstract class ContactsBody
{

    public ContactsBody()
    {
    }

    public static ContactsBody create()
    {
        return new Shape_ContactsBody();
    }

    public abstract List getContacts();

    public abstract ContactsBody setContacts(List list);
}
