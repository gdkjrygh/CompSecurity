// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.analytics;

import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

public class AniviaAnalytics
{
    public static interface Attribute
    {

        public static final String CARD_TYPE = "cardType";
        public static final String NAME = "name";
        public static final String SCAN_TYPE = "scan_type";
        public static final String SECTION = "section";
    }

    public static interface Event
    {

        public static final String ADD_CARD = "paymentMethodAddCard";
        public static final String GET_STARTED = "mobilePayGetStarted";
        public static final String MPAY_TC = "mobilePayTC";
        public static final String PAGE_VIEW = "pageView";
        public static final String SETUP_ADD_CARD = "setupAddCard";
        public static final String TRY_NOW = "mobilePayTryNow";
        public static final String VIEW_ERECEIPT = "mobileSubmiteReceipt";
    }

    public static interface Value
    {

        public static final String AGREE = "agree";
        public static final String CARD_TYPE_CC = "credit or debit card";
        public static final String CARD_TYPE_GC = "gift card";
        public static final String CODE_QR = "qr code";
        public static final String DISAGREE = "cancel";
        public static final String MPAY = "mobile pay";
        public static final String MPAY_CC = "mobile pay credit card";
        public static final String MPAY_CONFIRM = "mobile pay confirmation";
        public static final String MPAY_CREATE_PIN = "mobile pay create pin";
        public static final String MPAY_ENTER_PIN = "mobile pay enter pin";
        public static final String MPAY_GC = "mobile pay gift card";
        public static final String MPAY_HOW_TO = "how to use mobile pay";
        public static final String MPAY_METHODS = "mobile payment methods";
        public static final String MPAY_MORE_INFO = "how to use mobile pay";
        public static final String MPAY_SCAN = "mobile pay scan";
        public static final String MPAY_TC = "mobile pay terms and conditions";
        public static final String WHY_MOBILE_PAY = "why mobile pay";
    }


    public AniviaAnalytics()
    {
    }

    public static void sendPageViewEvent()
    {
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "mobile payment methods").putString("section", "mobile pay"));
    }
}
