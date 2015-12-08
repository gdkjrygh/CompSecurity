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
//            InvoiceCollection, Discount, InvoiceLineItemCollection

public class Invoice extends APIResource
{

    Integer amountDue;
    Integer attemptCount;
    Boolean attempted;
    String charge;
    Boolean closed;
    Long created;
    String currency;
    String customer;
    Long date;
    Discount discount;
    Integer endingBalance;
    String id;
    InvoiceLineItemCollection lines;
    Boolean livemode;
    Long nextPaymentAttempt;
    Boolean paid;
    Long periodEnd;
    Long periodStart;
    Integer startingBalance;
    Integer subtotal;
    Integer total;

    public Invoice()
    {
    }

    public static InvoiceCollection all(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return all(map, null);
    }

    public static InvoiceCollection all(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (InvoiceCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Invoice), map, com/stripe/model/InvoiceCollection, s);
    }

    public static Invoice create(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return create(map, null);
    }

    public static Invoice create(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Invoice)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Invoice), map, com/stripe/model/Invoice, s);
    }

    public static Invoice retrieve(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return retrieve(s, null);
    }

    public static Invoice retrieve(String s, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Invoice)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Invoice, s), null, com/stripe/model/Invoice, s1);
    }

    public static Invoice upcoming(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return upcoming(map, null);
    }

    public static Invoice upcoming(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Invoice)request(com.stripe.net.APIResource.RequestMethod.GET, String.format("%s/upcoming", new Object[] {
            classURL(com/stripe/model/Invoice)
        }), map, com/stripe/model/Invoice, s);
    }

    public Integer getAmountDue()
    {
        return amountDue;
    }

    public Integer getAttemptCount()
    {
        return attemptCount;
    }

    public Boolean getAttempted()
    {
        return attempted;
    }

    public String getCharge()
    {
        return charge;
    }

    public Boolean getClosed()
    {
        return closed;
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

    public Long getDate()
    {
        return date;
    }

    public Discount getDiscount()
    {
        return discount;
    }

    public Integer getEndingBalance()
    {
        return endingBalance;
    }

    public String getId()
    {
        return id;
    }

    public InvoiceLineItemCollection getLines()
    {
        return lines;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Long getNextPaymentAttempt()
    {
        return nextPaymentAttempt;
    }

    public Boolean getPaid()
    {
        return paid;
    }

    public Long getPeriodEnd()
    {
        return periodEnd;
    }

    public Long getPeriodStart()
    {
        return periodStart;
    }

    public Integer getStartingBalance()
    {
        return startingBalance;
    }

    public Integer getSubtotal()
    {
        return subtotal;
    }

    public Integer getTotal()
    {
        return total;
    }

    public Invoice pay()
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return pay(null);
    }

    public Invoice pay(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Invoice)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/pay", new Object[] {
            instanceURL(com/stripe/model/Invoice, getId())
        }), null, com/stripe/model/Invoice, s);
    }

    public void setAmountDue(Integer integer)
    {
        amountDue = integer;
    }

    public void setAttemptCount(Integer integer)
    {
        attemptCount = integer;
    }

    public void setAttempted(Boolean boolean1)
    {
        attempted = boolean1;
    }

    public void setCharge(String s)
    {
        charge = s;
    }

    public void setClosed(Boolean boolean1)
    {
        closed = boolean1;
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

    public void setDate(Long long1)
    {
        date = long1;
    }

    public void setDiscount(Discount discount1)
    {
        discount = discount1;
    }

    public void setEndingBalance(Integer integer)
    {
        endingBalance = integer;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setNextPaymentAttempt(Long long1)
    {
        nextPaymentAttempt = long1;
    }

    public void setPaid(Boolean boolean1)
    {
        paid = boolean1;
    }

    public void setPeriodEnd(Long long1)
    {
        periodEnd = long1;
    }

    public void setPeriodStart(Long long1)
    {
        periodStart = long1;
    }

    public void setStartingBalance(Integer integer)
    {
        startingBalance = integer;
    }

    public void setSubtotal(Integer integer)
    {
        subtotal = integer;
    }

    public void setTotal(Integer integer)
    {
        total = integer;
    }

    public Invoice update(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return update(map, null);
    }

    public Invoice update(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Invoice)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Invoice, id), map, com/stripe/model/Invoice, s);
    }
}
