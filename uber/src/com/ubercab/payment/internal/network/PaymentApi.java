// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.network;

import com.ubercab.payment.internal.network.model.CreateThirdPartyPaymentProfileRequest;
import retrofit.Callback;

public interface PaymentApi
{

    public abstract void create(CreateThirdPartyPaymentProfileRequest createthirdpartypaymentprofilerequest, Callback callback);
}
