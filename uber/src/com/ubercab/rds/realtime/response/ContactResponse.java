// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.realtime.response;

import java.util.List;

// Referenced classes of package com.ubercab.rds.realtime.response:
//            Shape_ContactResponse

public abstract class ContactResponse
{

    public ContactResponse()
    {
    }

    public static ContactResponse create()
    {
        return new Shape_ContactResponse();
    }

    public abstract String getCreatedAt();

    public abstract String getCsatOutcome();

    public abstract List getEvents();

    public abstract String getFlowNodeId();

    public abstract String getFlowNodeName();

    public abstract String getId();

    public abstract String getStatus();

    public abstract String getTerritoryId();

    public abstract String getTripDate();

    public abstract String getTripFare();

    public abstract String getTripId();

    public abstract int getUnreadMessageCount();

    public abstract String getUpdatedAt();

    public abstract ContactResponse setCreatedAt(String s);

    public abstract ContactResponse setCsatOutcome(String s);

    public abstract ContactResponse setEvents(List list);

    public abstract ContactResponse setFlowNodeId(String s);

    public abstract ContactResponse setFlowNodeName(String s);

    public abstract ContactResponse setId(String s);

    public abstract ContactResponse setStatus(String s);

    public abstract ContactResponse setTerritoryId(String s);

    public abstract ContactResponse setTripDate(String s);

    public abstract ContactResponse setTripFare(String s);

    public abstract ContactResponse setTripId(String s);

    public abstract ContactResponse setUnreadMessageCount(int i);

    public abstract ContactResponse setUpdatedAt(String s);
}
