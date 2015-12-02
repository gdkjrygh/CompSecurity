// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.zaakpay;

import com.ubercab.payment.internal.vendor.zaakpay.model.ChargeBillRequestData;
import retrofit.Callback;

interface ZaakpayApi
{

    public abstract void chargeBill(String s, ChargeBillRequestData chargebillrequestdata, Callback callback);
}
