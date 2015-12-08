// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;


public class WalletRegisteredEvent
{

    public final EReceiptManager.RegisteredPhoneNumberResult isRegistered;

    public WalletRegisteredEvent(EReceiptManager.RegisteredPhoneNumberResult registeredphonenumberresult)
    {
        isRegistered = registeredphonenumberresult;
    }
}
