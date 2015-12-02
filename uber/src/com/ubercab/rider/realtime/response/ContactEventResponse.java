// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_ContactEventResponse, ContactMessageResponse

public abstract class ContactEventResponse
{

    public ContactEventResponse()
    {
    }

    public static ContactEventResponse create()
    {
        return new Shape_ContactEventResponse();
    }

    public abstract List getActionsSummaries();

    public abstract String getInitiatorAvatarURL();

    public abstract String getInitiatorName();

    public abstract String getInitiatorType();

    public abstract ContactMessageResponse getMessage();

    public abstract String getTime();

    public abstract ContactEventResponse setActionsSummaries(List list);

    public abstract ContactEventResponse setInitiatorAvatarURL(String s);

    public abstract ContactEventResponse setInitiatorName(String s);

    public abstract ContactEventResponse setInitiatorType(String s);

    public abstract ContactEventResponse setMessage(ContactMessageResponse contactmessageresponse);

    public abstract ContactEventResponse setTime(String s);
}
