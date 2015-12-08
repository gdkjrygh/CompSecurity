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
import java.util.List;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            ChargeCollection, Dispute, Card

public class Charge extends APIResource
{

    Integer amount;
    Integer amountRefunded;
    Card card;
    Long created;
    String currency;
    String customer;
    String description;
    Dispute dispute;
    Boolean disputed;
    String failureMessage;
    Integer fee;
    List feeDetails;
    String id;
    String invoice;
    Boolean livemode;
    Boolean paid;
    Boolean refunded;

    public Charge()
    {
    }

    public static ChargeCollection all(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return all(map, null);
    }

    public static ChargeCollection all(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (ChargeCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Charge), map, com/stripe/model/ChargeCollection, s);
    }

    public static Charge create(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return create(map, null);
    }

    public static Charge create(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Charge)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Charge), map, com/stripe/model/Charge, s);
    }

    public static Charge retrieve(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return retrieve(s, null);
    }

    public static Charge retrieve(String s, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Charge)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Charge, s), null, com/stripe/model/Charge, s1);
    }

    public Integer getAmount()
    {
        return amount;
    }

    public Integer getAmountRefunded()
    {
        return amountRefunded;
    }

    public Card getCard()
    {
        return card;
    }

    public Long getCreated()
    {
        return created;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getCustomer()
    {
        return customer;
    }

    public String getDescription()
    {
        return description;
    }

    public Dispute getDispute()
    {
        return dispute;
    }

    public Boolean getDisputed()
    {
        return disputed;
    }

    public String getFailureMessage()
    {
        return failureMessage;
    }

    public Integer getFee()
    {
        return fee;
    }

    public List getFeeDetails()
    {
        return feeDetails;
    }

    public String getId()
    {
        return id;
    }

    public String getInvoice()
    {
        return invoice;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Boolean getPaid()
    {
        return paid;
    }

    public Boolean getRefunded()
    {
        return refunded;
    }

    public Charge refund()
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return refund(null, null);
    }

    public Charge refund(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return refund((Map)null, s);
    }

    public Charge refund(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return refund(map, null);
    }

    public Charge refund(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Charge)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/refund", new Object[] {
            instanceURL(com/stripe/model/Charge, getId())
        }), map, com/stripe/model/Charge, s);
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setAmountRefunded(Integer integer)
    {
        amountRefunded = integer;
    }

    public void setCard(Card card1)
    {
        card = card1;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setCustomer(String s)
    {
        customer = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDispute(Dispute dispute1)
    {
        dispute = dispute1;
    }

    public void setDisputed(Boolean boolean1)
    {
        disputed = boolean1;
    }

    public void setFailureMessage(String s)
    {
        failureMessage = s;
    }

    public void setFee(Integer integer)
    {
        fee = integer;
    }

    public void setFeeDetails(List list)
    {
        feeDetails = list;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setInvoice(String s)
    {
        invoice = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setPaid(Boolean boolean1)
    {
        paid = boolean1;
    }

    public void setRefunded(Boolean boolean1)
    {
        refunded = boolean1;
    }

    public Dispute updateDispute(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Dispute)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/dispute", new Object[] {
            instanceURL(com/stripe/model/Charge, id)
        }), map, com/stripe/model/Dispute, s);
    }
}
