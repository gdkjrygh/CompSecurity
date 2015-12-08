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
//            InvoiceItemCollection, DeletedInvoiceItem

public class InvoiceItem extends APIResource
{

    Integer amount;
    String currency;
    String customer;
    Long date;
    String description;
    String id;
    String invoice;
    Boolean livemode;

    public InvoiceItem()
    {
    }

    public static InvoiceItemCollection all(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return all(map, null);
    }

    public static InvoiceItemCollection all(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (InvoiceItemCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/InvoiceItem), map, com/stripe/model/InvoiceItemCollection, s);
    }

    public static InvoiceItem create(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return create(map, null);
    }

    public static InvoiceItem create(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (InvoiceItem)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/InvoiceItem), map, com/stripe/model/InvoiceItem, s);
    }

    public static InvoiceItem retrieve(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return retrieve(s, null);
    }

    public static InvoiceItem retrieve(String s, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (InvoiceItem)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/InvoiceItem, s), null, com/stripe/model/InvoiceItem, s1);
    }

    public DeletedInvoiceItem delete()
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return delete(null);
    }

    public DeletedInvoiceItem delete(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (DeletedInvoiceItem)request(com.stripe.net.APIResource.RequestMethod.DELETE, instanceURL(com/stripe/model/InvoiceItem, id), null, com/stripe/model/DeletedInvoiceItem, s);
    }

    public Integer getAmount()
    {
        return amount;
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

    public String getDescription()
    {
        return description;
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

    public void setAmount(Integer integer)
    {
        amount = integer;
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

    public void setDescription(String s)
    {
        description = s;
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

    public InvoiceItem update(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return update(map, null);
    }

    public InvoiceItem update(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (InvoiceItem)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/InvoiceItem, id), map, com/stripe/model/InvoiceItem, s);
    }
}
