// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import com.walmart.android.service.AsyncCallback;

// Referenced classes of package com.walmart.android.service.saver:
//            AddRequest, FeedbackRequest, RedeemRequest, RegisterRequest

public interface SaverService
{

    public static final String ADD_RECEIPT = "/addReceipt.json";
    public static final String DEV_PROD_URL_SECURE = "https://esaver.mobile.walmart.com:4333";
    public static final String DEV_STAGING_URL_SECURE = "https://esaver.mobile.walmart.com:4334";
    public static final String FAQ = "/appConfig/sc-faq.html";
    public static final String FEEDBACK = "/feedback.json";
    public static final String NEARBY_COMPETITORS = "/findNearByCompetitors.json";
    public static final String PRODUCTION_URL_SECURE = "https://store.mobile.walmart.com";
    public static final String RECEIPTS_SUMMARY = "/dashboard.json";
    public static final String RECEIPT_DETAILS = "/dashboard/receipt/%1$s.json";
    public static final String RECOMMENDATIONS = "/athena/irs-ws/hop/1.0/mobileContent";
    public static final String REDEEM = "/user/redeemCredit.json";
    public static final String REGISTER = "/user/register.json";
    public static final String SERVICE = "/sc/v3";
    public static final String STG0_URL_SECURE = "https://store-stg0.mobile.walmart.com";
    public static final String STG1_URL_SECURE = "https://store-stg1.mobile.walmart.com";
    public static final String STG2_URL_SECURE = "https://store-stg2.mobile.walmart.com";

    public abstract void addReceipt(AddRequest addrequest, AsyncCallback asynccallback);

    public abstract void findNearbyCompetitors(String s, AsyncCallback asynccallback);

    public abstract void getReceipt(String s, String s1, AsyncCallback asynccallback);

    public abstract void getReceiptsSummary(AsyncCallback asynccallback);

    public abstract void getRecommendations(String s, AsyncCallback asynccallback);

    public abstract void postFeedback(FeedbackRequest feedbackrequest, AsyncCallback asynccallback);

    public abstract void redeem(RedeemRequest redeemrequest, AsyncCallback asynccallback);

    public abstract void register(RegisterRequest registerrequest, AsyncCallback asynccallback);
}
