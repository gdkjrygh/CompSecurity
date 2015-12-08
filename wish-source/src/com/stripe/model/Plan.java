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
//            PlanCollection, DeletedPlan

public class Plan extends APIResource
{

    Integer amount;
    String currency;
    String id;
    String interval;
    Integer intervalCount;
    Boolean livemode;
    String name;
    Integer trialPeriodDays;

    public Plan()
    {
    }

    public static PlanCollection all(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return all(map, null);
    }

    public static PlanCollection all(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (PlanCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Plan), map, com/stripe/model/PlanCollection, s);
    }

    public static Plan create(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return create(map, null);
    }

    public static Plan create(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Plan)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Plan), map, com/stripe/model/Plan, s);
    }

    public static Plan retrieve(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return retrieve(s, null);
    }

    public static Plan retrieve(String s, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Plan)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Plan, s), null, com/stripe/model/Plan, s1);
    }

    public DeletedPlan delete()
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return delete(null);
    }

    public DeletedPlan delete(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (DeletedPlan)request(com.stripe.net.APIResource.RequestMethod.DELETE, instanceURL(com/stripe/model/Plan, id), null, com/stripe/model/DeletedPlan, s);
    }

    public Integer getAmount()
    {
        return amount;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getId()
    {
        return id;
    }

    public String getInterval()
    {
        return interval;
    }

    public Integer getIntervalCount()
    {
        return intervalCount;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public String getName()
    {
        return name;
    }

    public Integer getTrialPeriodDays()
    {
        return trialPeriodDays;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setInterval(String s)
    {
        interval = s;
    }

    public void setIntervalCount(Integer integer)
    {
        intervalCount = integer;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setTrialPeriodDays(Integer integer)
    {
        trialPeriodDays = integer;
    }

    public Plan update(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return update(map, null);
    }

    public Plan update(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Plan)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Plan, id), map, com/stripe/model/Plan, s);
    }
}
