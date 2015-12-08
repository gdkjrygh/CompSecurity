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
//            CustomerCollection, Subscription, DeletedCustomer, Discount, 
//            Card, NextRecurringCharge

public class Customer extends APIResource
{

    Integer accountBalance;
    Card activeCard;
    Long created;
    Boolean deleted;
    Boolean delinquent;
    String description;
    Discount discount;
    String email;
    String id;
    Boolean livemode;
    NextRecurringCharge nextRecurringCharge;
    String plan;
    Subscription subscription;
    Long trialEnd;

    public Customer()
    {
    }

    public static CustomerCollection all(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return all(map, null);
    }

    public static CustomerCollection all(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (CustomerCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Customer), map, com/stripe/model/CustomerCollection, s);
    }

    public static Customer create(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return create(map, null);
    }

    public static Customer create(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Customer)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Customer), map, com/stripe/model/Customer, s);
    }

    public static Customer retrieve(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return retrieve(s, null);
    }

    public static Customer retrieve(String s, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Customer)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Customer, s), null, com/stripe/model/Customer, s1);
    }

    public Subscription cancelSubscription()
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return cancelSubscription(null, null);
    }

    public Subscription cancelSubscription(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return cancelSubscription(null, s);
    }

    public Subscription cancelSubscription(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return cancelSubscription(map, null);
    }

    public Subscription cancelSubscription(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Subscription)request(com.stripe.net.APIResource.RequestMethod.DELETE, String.format("%s/subscription", new Object[] {
            instanceURL(com/stripe/model/Customer, id)
        }), map, com/stripe/model/Subscription, s);
    }

    public DeletedCustomer delete()
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return delete(null);
    }

    public DeletedCustomer delete(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (DeletedCustomer)request(com.stripe.net.APIResource.RequestMethod.DELETE, instanceURL(com/stripe/model/Customer, id), null, com/stripe/model/DeletedCustomer, s);
    }

    public void deleteDiscount()
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        deleteDiscount(null);
    }

    public void deleteDiscount(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        request(com.stripe.net.APIResource.RequestMethod.DELETE, String.format("%s/discount", new Object[] {
            instanceURL(com/stripe/model/Customer, id)
        }), null, com/stripe/model/Discount, s);
    }

    public Integer getAccountBalance()
    {
        return accountBalance;
    }

    public Card getActiveCard()
    {
        return activeCard;
    }

    public Long getCreated()
    {
        return created;
    }

    public Boolean getDeleted()
    {
        return deleted;
    }

    public Boolean getDelinquent()
    {
        return delinquent;
    }

    public String getDescription()
    {
        return description;
    }

    public Discount getDiscount()
    {
        return discount;
    }

    public String getEmail()
    {
        return email;
    }

    public String getId()
    {
        return id;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public NextRecurringCharge getNextRecurringCharge()
    {
        return nextRecurringCharge;
    }

    public String getPlan()
    {
        return plan;
    }

    public Subscription getSubscription()
    {
        return subscription;
    }

    public Long getTrialEnd()
    {
        return trialEnd;
    }

    public void setAccountBalance(Integer integer)
    {
        accountBalance = integer;
    }

    public void setActiveCard(Card card)
    {
        activeCard = card;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setDelinquent(Boolean boolean1)
    {
        delinquent = boolean1;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDiscount(Discount discount1)
    {
        discount = discount1;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setNextRecurringCharge(NextRecurringCharge nextrecurringcharge)
    {
        nextRecurringCharge = nextrecurringcharge;
    }

    public void setPlan(String s)
    {
        plan = s;
    }

    public void setSubscription(Subscription subscription1)
    {
        subscription = subscription1;
    }

    public void setTrialEnd(Long long1)
    {
        trialEnd = long1;
    }

    public Customer update(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return update(map, null);
    }

    public Customer update(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Customer)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Customer, id), map, com/stripe/model/Customer, s);
    }

    public Subscription updateSubscription(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return updateSubscription(map, null);
    }

    public Subscription updateSubscription(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Subscription)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/subscription", new Object[] {
            instanceURL(com/stripe/model/Customer, id)
        }), map, com/stripe/model/Subscription, s);
    }
}
