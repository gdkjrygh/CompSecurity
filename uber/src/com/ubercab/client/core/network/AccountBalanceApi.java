// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import retrofit.Callback;

public interface AccountBalanceApi
{

    public abstract void getCreditBalance(String s, Callback callback);

    public abstract void getUnpaidBills(String s, Callback callback);
}
