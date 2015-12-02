// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import com.ubercab.rider.realtime.request.body.CreatePaymentProfileBody;
import com.ubercab.rider.realtime.request.body.UpdatePaymentProfileRewardBody;
import ica;

public interface PaymentApi
{

    public abstract ica createPaymentProfile(CreatePaymentProfileBody createpaymentprofilebody);

    public abstract ica deletePaymentProfile(String s);

    public abstract ica updatePaymentProfileReward(String s, UpdatePaymentProfileRewardBody updatepaymentprofilerewardbody);
}
