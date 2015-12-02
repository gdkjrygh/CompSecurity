// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.bankcard;

import com.ubercab.payment.internal.vendor.creditcard.model.RequestData;
import retrofit.Callback;

public interface BankCardApi
{

    public abstract void addBankCard(RequestData requestdata, Callback callback);
}
