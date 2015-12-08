// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.news;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.util.app.AbstractTwcApplication;

// Referenced classes of package com.weather.Weather.news:
//            BaseNewsModule, TopStoriesActivity

public class NewsModule extends BaseNewsModule
{

    private static final int NEWS_LOADER = 0;

    public NewsModule(Context context, ModuleConfig moduleconfig, Handler handler, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler)
    {
        super(context, moduleconfig, handler, clickablelocalyticsmodulehandler);
    }

    protected String getBeaconString()
    {
        return AbstractTwcApplication.getRootContext().getString(0x7f0704ae);
    }

    protected Intent getNewsActivityIntent(int i)
    {
        Intent intent = new Intent(context, com/weather/Weather/news/TopStoriesActivity);
        intent.putExtra("SELECTED_ITEM", i);
        return intent;
    }

    protected void initLoader()
    {
        ((Activity)context).getLoaderManager().initLoader(0, null, this);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return new CursorLoader(context, com.weather.commons.news.provider.NewsContract.Article.TOP_STORY_CONTENT_URI, new String[] {
                "article_title", "article_image_small_url"
            }, null, null, null);
        }
    }

    public volatile void onLoadFinished(Loader loader, Cursor cursor)
    {
        super.onLoadFinished(loader, cursor);
    }

    public volatile void onLoaderReset(Loader loader)
    {
        super.onLoaderReset(loader);
    }
}
