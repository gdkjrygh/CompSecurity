// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import android.content.Context;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.models.CardBuilder;
import com.contextlogic.wish.api.service.GetBraintreeClientTokenService;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.CreditCardContainer;
import java.io.Serializable;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishShippingInfo

public class WishCachedBillingInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x2a9fbec7b2b8b31L;
    private WishShippingInfo billingAddress;
    private String cardNonce;
    private String lastFourDigits;

    public WishCachedBillingInfo(final Context context, final String cardNumber, final String cardCvv, final int expiryMonth, final int expiryYear, WishShippingInfo wishshippinginfo)
    {
        billingAddress = wishshippinginfo;
        lastFourDigits = cardNumber.trim().substring(cardNumber.length() - 4);
        if (context != null)
        {
            (new GetBraintreeClientTokenService()).requestService(new com.contextlogic.wish.api.service.GetBraintreeClientTokenService.SuccessCallback() {

                final WishCachedBillingInfo this$0;
                final String val$cardCvv;
                final String val$cardNumber;
                final Context val$context;
                final int val$expiryMonth;
                final int val$expiryYear;

                public void onServiceSucceeded(String s)
                {
                    s = Braintree.getInstance(context, s);
                    s.addListener(new com.braintreepayments.api.Braintree.PaymentMethodNonceListener() {

                        final _cls1 this$1;

                        public void onPaymentMethodNonce(String s)
                        {
                            cardNonce = s;
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    s.tokenize((new CardBuilder()).cardNumber(cardNumber).expirationDate(CreditCardContainer.getFormattedExpiryDate(expiryMonth, expiryYear)).cvv(cardCvv));
                }

            
            {
                this$0 = WishCachedBillingInfo.this;
                context = context1;
                cardNumber = s;
                expiryMonth = i;
                expiryYear = j;
                cardCvv = s1;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final WishCachedBillingInfo this$0;

                public void onServiceFailed()
                {
                }

            
            {
                this$0 = WishCachedBillingInfo.this;
                super();
            }
            });
        }
    }

    public void clearNonce()
    {
        cardNonce = null;
    }

    public WishShippingInfo getBillingAddress()
    {
        return billingAddress;
    }

    public String getCardNonce()
    {
        return cardNonce;
    }

    public String getLastFourDigits()
    {
        return lastFourDigits;
    }


/*
    static String access$002(WishCachedBillingInfo wishcachedbillinginfo, String s)
    {
        wishcachedbillinginfo.cardNonce = s;
        return s;
    }

*/
}
