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
//            Card

public class Token extends APIResource
{

    Integer amount;
    Card card;
    Long created;
    String currency;
    String id;
    Boolean livemode;
    Boolean used;

    public Token()
    {
    }

    public static Token create(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return create(map, null);
    }

    public static Token create(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Token)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Token), map, com/stripe/model/Token, s);
    }

    public static Token retrieve(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return retrieve(s, null);
    }

    public static Token retrieve(String s, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Token)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Token, s), null, com/stripe/model/Token, s1);
    }

    public Integer getAmount()
    {
        return amount;
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

    public String getId()
    {
        return id;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Boolean getUsed()
    {
        return used;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
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

    public void setId(String s)
    {
        id = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setUsed(Boolean boolean1)
    {
        used = boolean1;
    }
}
