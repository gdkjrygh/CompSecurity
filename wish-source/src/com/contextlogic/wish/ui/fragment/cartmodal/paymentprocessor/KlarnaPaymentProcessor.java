// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import ch.boye.httpclientandroidlib.client.utils.URIBuilder;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.user.UserStatusManager;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            CartPaymentProcessor

public class KlarnaPaymentProcessor extends CartPaymentProcessor
{

    public KlarnaPaymentProcessor(CartManager cartmanager)
    {
        super(cartmanager);
    }

    public static String getKlarnaCheckoutUrl(CartManager cartmanager, boolean flag)
    {
        String s = String.format("https://%s/m/klarna/checkout", new Object[] {
            WishApi.getInstance().getConfig().getApiBaseUrlString()
        });
        URIBuilder uribuilder;
        String s1;
        try
        {
            uribuilder = new URIBuilder(s);
            s1 = cartmanager.getCheckoutOfferId();
        }
        // Misplaced declaration of an exception variable
        catch (CartManager cartmanager)
        {
            return s;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        uribuilder.addParameter("checkout_offer_id", s1);
        if (!CartExperimentManager.canCheckoutWithKlarnaHybrid(cartmanager)) goto _L2; else goto _L1
_L1:
        if (CartExperimentManager.canUseImproveKlarnaCheckout()) goto _L4; else goto _L3
_L3:
        uribuilder.addParameter("show_in_modal", "true");
_L2:
        return uribuilder.build().toString();
_L4:
        if (!cartmanager.hasValidBillingInfo() || !flag)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        uribuilder.addParameter("express_checkout", "true");
        uribuilder.addParameter("show_in_modal", "false");
          goto _L2
        uribuilder.addParameter("express_checkout", "false");
        uribuilder.addParameter("show_in_modal", "true");
          goto _L2
    }

    public static String getPaymentMethodImageUrl(int i)
    {
        return (new StringBuilder()).append("https://cdn.klarna.com/1.0/shared/image/generic/badge/").append(UserStatusManager.getInstance().getKlarnaCountryCode()).append("/checkout/long-blue.png?width=").append(Math.min(i, 880)).toString();
    }

    public void checkout(CartPaymentProcessor.SuccessListener successlistener, CartPaymentProcessor.FailureListener failurelistener)
    {
        handleSuccessfulPayment();
        failurelistener = new Bundle();
        String s = getKlarnaCheckoutUrl(cartManager, true);
        failurelistener.putString(CartPaymentProcessor.DATA_KEY_BUY_URL, s);
        if (CartExperimentManager.canCheckoutWithKlarnaHybrid(cartManager))
        {
            failurelistener.putBoolean(CartPaymentProcessor.DATA_KEY_SHOW_IN_MODAL, true);
        }
        successlistener.onSuccess(this, failurelistener);
    }
}
