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
//            TransferCollection, TransferTransactionCollection, Summary

public class Transfer extends APIResource
{

    Integer amount;
    Long date;
    String description;
    String id;
    List otherTransfers;
    String status;
    Summary summary;

    public Transfer()
    {
    }

    public static TransferCollection all(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return all(map, null);
    }

    public static TransferCollection all(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (TransferCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Transfer), map, com/stripe/model/TransferCollection, s);
    }

    public static Transfer retrieve(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return retrieve(s, null);
    }

    public static Transfer retrieve(String s, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Transfer)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Transfer, s), null, com/stripe/model/Transfer, s1);
    }

    public Integer getAmount()
    {
        return amount;
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

    public List getOtherTransfers()
    {
        return otherTransfers;
    }

    public String getStatus()
    {
        return status;
    }

    public Summary getSummary()
    {
        return summary;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
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

    public void setOtherTransfers(List list)
    {
        otherTransfers = list;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setSummary(Summary summary1)
    {
        summary = summary1;
    }

    public TransferTransactionCollection transactions(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return transactions(map, null);
    }

    public TransferTransactionCollection transactions(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (TransferTransactionCollection)request(com.stripe.net.APIResource.RequestMethod.GET, String.format("%s/transactions", new Object[] {
            instanceURL(com/stripe/model/Transfer, getId())
        }), map, com/stripe/model/TransferTransactionCollection, s);
    }
}
