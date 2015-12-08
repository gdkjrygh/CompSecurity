// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.weather.Weather.hurricane.HurricaneNewsActivity;
import com.weather.Weather.news.AbstractSingleArticleModule;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.tropical.TropicalStormNewsFetcher;
import com.weather.dal2.net.Receiver;

public class TropicalUpdateNewsModule extends AbstractSingleArticleModule
{

    private final Receiver newsReceiver = new _cls1();
    TropicalStormNewsFetcher tropicalStormNewsFetcher;

    public TropicalUpdateNewsModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
    }

    protected void onArticleClicked(ArticlePojo articlepojo)
    {
        articlepojo = HurricaneNewsActivity.createIntent(context, articlepojo);
        String s = getFeedId();
        if (s != null)
        {
            articlepojo.putExtra("com.weather.fromFeed", s);
        }
        context.startActivity(articlepojo);
    }

    public void resume()
    {
        super.resume();
        tropicalStormNewsFetcher.asyncFetchUpdateArticles(newsReceiver, null);
    }



    /* member class not found */
    class _cls1 {}

}
