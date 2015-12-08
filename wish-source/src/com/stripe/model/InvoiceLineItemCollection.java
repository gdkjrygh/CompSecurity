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

public class InvoiceLineItemCollection extends APIResource
{

    Integer count;
    List data;
    String url;

    public InvoiceLineItemCollection()
    {
    }

    public InvoiceLineItemCollection all(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return all(map, null);
    }

    public InvoiceLineItemCollection all(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        String s1 = String.format("%s%s", new Object[] {
            "https://api.stripe.com", getURL()
        });
        return (InvoiceLineItemCollection)request(com.stripe.net.APIResource.RequestMethod.GET, s1, map, com/stripe/model/InvoiceLineItemCollection, s);
    }

    public Integer getCount()
    {
        return count;
    }

    public List getData()
    {
        return data;
    }

    public String getURL()
    {
        return url;
    }
}
