// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.news;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.os.Bundle;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.config.ActivitiesConfig;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.news.ui.NewsActivity;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class TopStoriesActivity extends NewsActivity
{

    private static final String TAG = "TopStoriesActivity";
    private static final int TOP_STORY_LOADER = 10;

    public TopStoriesActivity()
    {
    }

    public static Intent getIntent(Context context)
    {
        context = new Intent(context, com/weather/Weather/news/TopStoriesActivity);
        context.setFlags(0x10000000);
        return context;
    }

    private void initLoader()
    {
        getLoaderManager().initLoader(10, null, this);
    }

    public String getAdSlotName()
    {
        return ConfigurationManagers.getInstance().getActivitiesConfig().getAdSlot("news");
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!hasDeepLink())
        {
            initLoader();
            return;
        } else
        {
            LogUtil.d("TopStoriesActivity", LoggingMetaTags.TWC_DEEPLINK, "waiting for deep link to load", new Object[0]);
            return;
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return null;

        case 10: // '\n'
            return createCursorLoader(com.weather.commons.news.provider.NewsContract.Article.TOP_STORY_CONTENT_URI);
        }
    }

    public void onNewsArticlesUpdated(com.weather.commons.news.provider.NewsDownloadService.NewsArticlesUpdated newsarticlesupdated)
    {
        LogUtil.d("TopStoriesActivity", LoggingMetaTags.TWC_DEEPLINK, "updated news: hasDeep=%b failure=%b", new Object[] {
            Boolean.valueOf(newsarticlesupdated.hasDeepLink()), Boolean.valueOf(newsarticlesupdated.isFailure())
        });
        if (newsarticlesupdated.hasDeepLink() || newsarticlesupdated.isFailure())
        {
            runOnUiThread(new Runnable() {

                final TopStoriesActivity this$0;

                public void run()
                {
                    initLoader();
                }

            
            {
                this$0 = TopStoriesActivity.this;
                super();
            }
            });
        }
    }

    protected void onResume()
    {
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.NEWS_DETAILS);
        super.onResume();
    }

    protected void onReturnToMainFeed()
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.NEWS_DETAILS.getName());
    }

}
