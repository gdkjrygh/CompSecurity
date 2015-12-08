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

public class Account extends APIResource
{

    Boolean chargeEnabled;
    List currenciesSupported;
    Boolean detailsSubmitted;
    String email;
    String id;
    String statementDescriptor;

    public Account()
    {
    }

    public static Account retrieve()
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return retrieve(null);
    }

    public static Account retrieve(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Account)request(com.stripe.net.APIResource.RequestMethod.GET, singleClassURL(com/stripe/model/Account), null, com/stripe/model/Account, s);
    }

    public Boolean getChargeEnabled()
    {
        return chargeEnabled;
    }

    public List getCurrenciesSupported()
    {
        return currenciesSupported;
    }

    public Boolean getDetailsSubmitted()
    {
        return detailsSubmitted;
    }

    public String getEmail()
    {
        return email;
    }

    public String getId()
    {
        return id;
    }

    public String getStatementDescriptor()
    {
        return statementDescriptor;
    }
}
