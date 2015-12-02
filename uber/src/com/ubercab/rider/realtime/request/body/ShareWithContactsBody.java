// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ShareWithContactsBody

public abstract class ShareWithContactsBody
{

    public ShareWithContactsBody()
    {
    }

    public static ShareWithContactsBody create()
    {
        return new Shape_ShareWithContactsBody();
    }

    public abstract List getContacts();

    public abstract String getSenderName();

    public abstract String getTripShareUrl();

    public abstract ShareWithContactsBody setContacts(List list);

    public abstract ShareWithContactsBody setSenderName(String s);

    public abstract ShareWithContactsBody setTripShareUrl(String s);
}
