// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;

import android.os.Handler;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

public class AnalyticsHelper
{

    private static final String TAG = com/walmart/android/analytics/AnalyticsHelper.getSimpleName();

    public AnalyticsHelper()
    {
    }

    public static String getWeeklyAdAllSpecialsName(String s)
    {
        String s1 = "weekly ad : all specials";
        if (!TextUtils.isEmpty(s))
        {
            s1 = (new StringBuilder()).append("weekly ad : all specials").append(" : ").append(s).toString();
        }
        return s1;
    }

    public static String getWeeklyAdFullPageName(int i, int j)
    {
        String s1 = (new StringBuilder()).append("weekly ad : full page : page ").append(i).toString();
        String s = s1;
        if (j > 0)
        {
            s = (new StringBuilder()).append(s1).append("-").append(j).toString();
        }
        return s;
    }

    public static String getWeeklyAdPageAndListName(int i, int j)
    {
        String s1 = (new StringBuilder()).append("weekly ad : page and list : page ").append(i).toString();
        String s = s1;
        if (j > 0)
        {
            s = (new StringBuilder()).append(s1).append("-").append(j).toString();
        }
        return s;
    }

    public static void post(Object obj)
    {
        MessageBus.getBus().post(obj);
    }

    public static void postOnHandler(Object obj, Handler handler)
    {
        handler.post(new Runnable(obj) {

            final Object val$object;

            public void run()
            {
                AnalyticsHelper.post(object);
            }

            
            {
                object = obj;
                super();
            }
        });
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareBrowsePageViewEvent(String s, String s1, String s2, String s3)
    {
        s = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", s).putString("section", s1).putString("subCategory", s2);
        if (s3 == null)
        {
            s3 = "null";
        }
        return s.putString("browseToken", s3);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareCreateAccountPageViewEvent()
    {
        return prepareSimplePageViewEvent("create account", "account", "account");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareFeedbackPageViewEvent()
    {
        return prepareSimplePageViewEvent("share your thoughts overlay", "user feedback", "user feedback");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareMobilePayPageViewEvent()
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "mobile payment methods").putString("section", "mobile pay");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareOrderDetailsPageViewEvent()
    {
        return prepareSimplePageViewEvent("order details", "account", "account");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareOrdersPageViewEvent()
    {
        return prepareSimplePageViewEvent("orders", "global nav", "global nav");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder preparePrivacyPolicyPageViewEvent()
    {
        return prepareSimplePageViewEvent("privacy policy", "global nav", "global nav");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareScanScreenPageViewEvent()
    {
        return prepareSimplePageViewEvent("home : scan", "homepage", "homepage");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareSearchFilterPageViewEvent()
    {
        return prepareSimplePageViewEvent("search filter", "search", "search");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareSearchResultsPageViewEvent()
    {
        return prepareSimplePageViewEvent("search results", "search", "search");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareSearchSortPageViewEvent()
    {
        return prepareSimplePageViewEvent("search sort", "search", "search");
    }

    private static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareSimplePageViewEvent(String s, String s1, String s2)
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", s).putString("section", s1).putString("subCategory", s2);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareStoreFilterPageViewEvent()
    {
        return prepareSimplePageViewEvent("store filter", "store", "store");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareTermsOfUsePageViewEvent()
    {
        return prepareSimplePageViewEvent("terms of use", "global nav", "global nav");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareWeeklyAdAllSpecialsPageViewEvent(String s)
    {
        return prepareSimplePageViewEvent(getWeeklyAdAllSpecialsName(s), "weekly ad", "weekly ad");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareWeeklyAdFullPagePageViewEvent(int i, int j, String s)
    {
        int k;
label0:
        {
            if (j >= 0)
            {
                k = j;
                if (i != j)
                {
                    break label0;
                }
            }
            k = -1;
        }
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", getWeeklyAdFullPageName(i, k)).putString("section", "weekly ad").putString("subCategory", "weekly ad").putString("weeklyAdId", s);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareWeeklyAdLandingPageViewEvent()
    {
        return prepareSimplePageViewEvent("weekly ad : landing", "weekly ad", "weekly ad");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareWeeklyAdPageAndListPageViewEvent(int i, int j, String s)
    {
        int k;
label0:
        {
            if (j >= 0)
            {
                k = j;
                if (i != j)
                {
                    break label0;
                }
            }
            k = -1;
        }
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", getWeeklyAdPageAndListName(i, k)).putString("section", "weekly ad").putString("subCategory", "weekly ad").putString("weeklyAdId", s);
    }

}
