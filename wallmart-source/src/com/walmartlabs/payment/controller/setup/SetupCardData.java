// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import com.walmartlabs.payment.controller.settings.GiftCardState;

public class SetupCardData
{

    private static SetupCardData sInstance = new SetupCardData();
    private final GiftCardState mGiftCardState = new GiftCardState();
    private boolean mHasCreditCardPayData;
    private boolean mHasGiftCardPayData;

    private SetupCardData()
    {
        mHasGiftCardPayData = false;
        mHasCreditCardPayData = false;
    }

    public static SetupCardData getInstance()
    {
        return sInstance;
    }

    public GiftCardState getGiftCardState()
    {
        return mGiftCardState;
    }

    public boolean hasCreditCardPayData()
    {
        return mHasCreditCardPayData;
    }

    public boolean hasGiftCardPayData()
    {
        return mHasGiftCardPayData;
    }

    public void setHasCreditCardPayData(boolean flag)
    {
        mHasCreditCardPayData = flag;
    }

    public void setHasGiftCardPayData(boolean flag)
    {
        mHasGiftCardPayData = flag;
    }

}
