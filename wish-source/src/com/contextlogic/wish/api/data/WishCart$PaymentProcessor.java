// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishCart

public static final class value extends Enum
{

    private static final Ebanx $VALUES[];
    public static final Ebanx Adyen;
    public static final Ebanx Boleto;
    public static final Ebanx Braintree;
    public static final Ebanx BraintreePayPal;
    public static final Ebanx Ebanx;
    public static final Ebanx Klarna;
    public static final Ebanx Oxxo;
    public static final Ebanx PayPal;
    public static final Ebanx Stripe;
    public static List creditCardPaymentProcessors;
    private int value;

    public static value getCreditCardProcessor(int i, value value1)
    {
        for (Iterator iterator = creditCardPaymentProcessors.iterator(); iterator.hasNext();)
        {
            value value2 = (creditCardPaymentProcessors)iterator.next();
            if (value2.getValue() == i)
            {
                return value2;
            }
        }

        return value1;
    }

    public static getValue valueOf(String s)
    {
        return (getValue)Enum.valueOf(com/contextlogic/wish/api/data/WishCart$PaymentProcessor, s);
    }

    public static getValue[] values()
    {
        return (getValue[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        PayPal = new <init>("PayPal", 0, 0);
        Braintree = new <init>("Braintree", 1, 1);
        Stripe = new <init>("Stripe", 2, 3);
        Boleto = new <init>("Boleto", 3, 6);
        Klarna = new <init>("Klarna", 4, 8);
        Adyen = new <init>("Adyen", 5, 9);
        Ebanx = new <init>("Ebanx", 6, 10);
        Oxxo = new <init>("Oxxo", 7, 11);
        BraintreePayPal = new <init>("BraintreePayPal", 8, 16);
        $VALUES = (new .VALUES[] {
            PayPal, Braintree, Stripe, Boleto, Klarna, Adyen, Ebanx, Oxxo, BraintreePayPal
        });
        creditCardPaymentProcessors = Arrays.asList(new creditCardPaymentProcessors[] {
            Braintree, Stripe, Adyen, Ebanx
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
