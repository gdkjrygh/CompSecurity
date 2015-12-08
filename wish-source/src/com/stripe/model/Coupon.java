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
//            CouponCollection, DeletedCoupon

public class Coupon extends APIResource
{

    Integer amountOff;
    String currency;
    String duration;
    Integer durationInMonths;
    String id;
    Boolean livemode;
    Integer maxRedemptions;
    Integer percentOff;
    Integer redeemBy;
    Integer timesRedeemed;

    public Coupon()
    {
    }

    public static CouponCollection all(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return all(map, null);
    }

    public static CouponCollection all(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (CouponCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Coupon), map, com/stripe/model/CouponCollection, s);
    }

    public static Coupon create(Map map)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return create(map, null);
    }

    public static Coupon create(Map map, String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Coupon)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Coupon), map, com/stripe/model/Coupon, s);
    }

    public static Coupon retrieve(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return retrieve(s, null);
    }

    public static Coupon retrieve(String s, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (Coupon)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Coupon, s), null, com/stripe/model/Coupon, s1);
    }

    public DeletedCoupon delete()
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return delete(null);
    }

    public DeletedCoupon delete(String s)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        return (DeletedCoupon)request(com.stripe.net.APIResource.RequestMethod.DELETE, instanceURL(com/stripe/model/Coupon, id), null, com/stripe/model/DeletedCoupon, s);
    }

    public Integer getAmountOff()
    {
        return amountOff;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getDuration()
    {
        return duration;
    }

    public Integer getDurationInMonths()
    {
        return durationInMonths;
    }

    public String getId()
    {
        return id;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Integer getMaxRedemptions()
    {
        return maxRedemptions;
    }

    public Integer getPercentOff()
    {
        return percentOff;
    }

    public Integer getRedeemBy()
    {
        return redeemBy;
    }

    public Integer getTimesRedeemed()
    {
        return timesRedeemed;
    }

    public void setAmountOff(Integer integer)
    {
        amountOff = integer;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setDuration(String s)
    {
        duration = s;
    }

    public void setDurationInMonths(Integer integer)
    {
        durationInMonths = integer;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setMaxRedemptions(Integer integer)
    {
        maxRedemptions = integer;
    }

    public void setPercentOff(Integer integer)
    {
        percentOff = integer;
    }

    public void setRedeemBy(Integer integer)
    {
        redeemBy = integer;
    }

    public void setTimesRedeemed(Integer integer)
    {
        timesRedeemed = integer;
    }
}
