// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller;

import android.content.Context;
import android.content.Intent;
import com.walmartlabs.payment.controller.edit.PaymentEditActivity;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.GiftCard;

public class PaymentNavigationUtil
{

    public PaymentNavigationUtil()
    {
    }

    public static void launchAddCreditCard(Context context)
    {
        Intent intent = new Intent(context, com/walmartlabs/payment/controller/edit/PaymentEditActivity);
        intent.putExtra(PaymentEditActivity.EXTRA_ADD_CREDIT_CARD, true);
        context.startActivity(intent);
    }

    public static void launchAddGiftCard(Context context)
    {
        Intent intent = new Intent(context, com/walmartlabs/payment/controller/edit/PaymentEditActivity);
        intent.putExtra(PaymentEditActivity.EXTRA_ADD_GIFT_CARD, true);
        context.startActivity(intent);
    }

    public static void viewCreditCard(Context context, CreditCard creditcard)
    {
        Intent intent = new Intent(context, com/walmartlabs/payment/controller/edit/PaymentEditActivity);
        intent.putExtra(PaymentEditActivity.EXTRA_PAYMENT_METHOD, creditcard);
        context.startActivity(intent);
    }

    public static void viewGiftCard(Context context, GiftCard giftcard)
    {
        Intent intent = new Intent(context, com/walmartlabs/payment/controller/edit/PaymentEditActivity);
        intent.putExtra(PaymentEditActivity.EXTRA_PAYMENT_METHOD, giftcard);
        context.startActivity(intent);
    }
}
