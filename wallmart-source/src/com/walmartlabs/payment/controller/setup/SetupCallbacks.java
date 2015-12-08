// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;


public interface SetupCallbacks
{

    public abstract void onAddCreditCard();

    public abstract void onAddGiftCard();

    public abstract void onSetupCreditCards();

    public abstract void onSetupGiftCards();

    public abstract void onTermsConditionsAccepted();

    public abstract void onTryNow();
}
