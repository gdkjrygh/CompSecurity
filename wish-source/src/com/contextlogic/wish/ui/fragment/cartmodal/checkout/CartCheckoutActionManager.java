// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

public abstract class CartCheckoutActionManager
{

    protected CartManager cartManager;

    public CartCheckoutActionManager(CartManager cartmanager)
    {
        cartManager = cartmanager;
    }

    public abstract void checkout();

    public abstract String getCheckoutButtonText();

    public abstract boolean onBackPressed();

    public abstract boolean shouldShowPaymentCredentials();

    protected void trackEvent(WishAnalyticsEvent wishanalyticsevent)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), null, null, null);
    }
}
