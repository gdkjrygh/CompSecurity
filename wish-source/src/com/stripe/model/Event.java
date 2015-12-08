// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            EventCollection, EventData

public class Event extends APIResource
{

    Long created;
    EventData data;
    String id;
    Boolean livemode;
    Integer pendingWebhooks;
    String type;

    public Event()
    {
    }

    public static EventCollection all(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return all(map, null);
    }

    public static EventCollection all(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (EventCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Event), map, com/stripe/model/EventCollection, s);
    }

    public static Event retrieve(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return retrieve(s, null);
    }

    public static Event retrieve(String s, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Event)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Event, s), null, com/stripe/model/Event, s1);
    }

    public Long getCreated()
    {
        return created;
    }

    public EventData getData()
    {
        return data;
    }

    public String getId()
    {
        return id;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Integer getPendingWebhooks()
    {
        return pendingWebhooks;
    }

    public String getType()
    {
        return type;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setData(EventData eventdata)
    {
        data = eventdata;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setPendingWebhooks(Integer integer)
    {
        pendingWebhooks = integer;
    }

    public void setType(String s)
    {
        type = s;
    }
}
