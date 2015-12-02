// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_ContactsResponse

public abstract class ContactsResponse
{

    public ContactsResponse()
    {
    }

    public static ContactsResponse create()
    {
        return new Shape_ContactsResponse();
    }

    public abstract List getContacts();

    public abstract int getTotalUserContacts();

    public abstract ContactsResponse setContacts(List list);

    public abstract ContactsResponse setTotalUserContacts(int i);
}
