// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import com.ubercab.client.core.model.AnonymousPhoneNumberRequest;
import retrofit.Callback;

public interface PhoneNumberAnonymizationApi
{

    public abstract void getAnonymousNumber(String s, AnonymousPhoneNumberRequest anonymousphonenumberrequest, Callback callback);

    public abstract void initiateAnonymousInboundCall(String s, AnonymousPhoneNumberRequest anonymousphonenumberrequest, Callback callback);
}
