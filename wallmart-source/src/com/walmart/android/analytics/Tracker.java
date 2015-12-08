// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;

import android.content.Context;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.StoreLocatorFilterEvent;
import com.walmart.android.events.AppBackgroundEvent;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.analytics.AnalyticsEvent;
import com.walmartlabs.analytics.AnalyticsPageView;
import com.walmartlabs.analytics.GoogleAnalyticsEvent;
import com.walmartlabs.analytics.anivia.AniviaAnalyticsPageView;
import com.walmartlabs.analytics.anivia.AniviaEventJackson;
import com.walmartlabs.anivia.AniviaEventAsJson;
import com.walmartlabs.anivia.AniviaTracker;

// Referenced classes of package com.walmart.android.analytics:
//            GoogleAnalytics, OkHttpSender

public class Tracker
{

    private AniviaTracker mAniviaTracker;

    public Tracker()
    {
    }

    public AniviaTracker getAniviaTracker()
    {
        return mAniviaTracker;
    }

    public void onAnalyticsEvent(AnalyticsEvent analyticsevent)
    {
        if ("Store Finder".equals(analyticsevent.category))
        {
            if ("Apply Store Filter".equals(analyticsevent.action))
            {
                analyticsevent = analyticsevent.label.split(":");
                int j = analyticsevent.length;
                for (int i = 0; i < j; i++)
                {
                    GoogleAnalytics.trackEvent("Store Search", "Filter", analyticsevent[i]);
                }

                MessageBus.getBus().post(new StoreLocatorFilterEvent(analyticsevent));
            }
            return;
        } else
        {
            GoogleAnalytics.trackEvent(analyticsevent.category, analyticsevent.action, analyticsevent.label, analyticsevent.value);
            return;
        }
    }

    public void onAnalyticsPageView(AnalyticsPageView analyticspageview)
    {
        GoogleAnalytics.trackPageView(analyticspageview.page);
        if (analyticspageview instanceof AniviaAnalyticsPageView)
        {
            analyticspageview = (AniviaAnalyticsPageView)analyticspageview;
            onAniviaEventJsonBuilder((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", ((AniviaAnalyticsPageView) (analyticspageview)).aniviaPage));
        }
    }

    public void onAniviaEvent(AniviaEventJackson aniviaeventjackson)
    {
        mAniviaTracker.trackEvent(aniviaeventjackson);
        if (aniviaeventjackson instanceof GoogleAnalyticsEvent)
        {
            aniviaeventjackson = (GoogleAnalyticsEvent)aniviaeventjackson;
            GoogleAnalytics.trackEvent(aniviaeventjackson.getCategory(), aniviaeventjackson.getAction(), aniviaeventjackson.getLabel(), aniviaeventjackson.getValue());
        }
    }

    public void onAniviaEventAsJson(AniviaEventAsJson aniviaeventasjson)
    {
        if (aniviaeventasjson.eventAsJson != null)
        {
            mAniviaTracker.trackEventAsJson(aniviaeventasjson.eventAsJson);
        }
    }

    public void onAniviaEventJsonBuilder(com.walmartlabs.anivia.AniviaEventAsJson.Builder builder)
    {
        mAniviaTracker.trackEventAsJson(builder);
    }

    public void onAppBackground(AppBackgroundEvent appbackgroundevent)
    {
        mAniviaTracker.flushEvents();
    }

    public void start(Context context)
    {
        GoogleAnalytics.start(context);
        mAniviaTracker = new AniviaTracker(context, new OkHttpSender());
        mAniviaTracker.setApplicationId("wm_us");
        mAniviaTracker.start();
        MessageBus.getBus().register(this);
    }

    public void stop()
    {
        MessageBus.getBus().unregister(this);
        GoogleAnalytics.stop();
        mAniviaTracker.stop();
    }
}
