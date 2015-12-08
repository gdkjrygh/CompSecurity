// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.news;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.news.provider.BreakingNewsData;
import com.weather.commons.news.provider.CachingBreakingNewsDataFetcher;
import com.weather.commons.video2.ThumbnailSize;
import com.weather.dal2.net.Receiver;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.ArrayList;
import java.util.List;

public class BreakingNowModule extends Module
{

    private static final String TAG = "BreakingNowModule";
    private View article1;
    private View article2;
    private View article3;
    Receiver articleReceiver;
    private BreakingNewsData breakingNewsData;
    private final CachingBreakingNewsDataFetcher breakingNewsDataFetcher;
    private TextView invalidData;
    private final ClickableLocalyticsModuleHandler localyticsModuleHandler;
    private final List newsHolders;
    private final ThumbnailSize thumbnailSizes[];

    public BreakingNowModule(Context context, ModuleConfig moduleconfig, Handler handler, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler)
    {
        this(context, moduleconfig, handler, clickablelocalyticsmodulehandler, CachingBreakingNewsDataFetcher.getInstance());
    }

    BreakingNowModule(Context context, ModuleConfig moduleconfig, Handler handler, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler, CachingBreakingNewsDataFetcher cachingbreakingnewsdatafetcher)
    {
        super(context, moduleconfig, handler, clickablelocalyticsmodulehandler);
        newsHolders = new ArrayList();
        thumbnailSizes = (new ThumbnailSize[] {
            ThumbnailSize.LARGE, ThumbnailSize.MEDIUM, ThumbnailSize.MEDIUM
        });
        articleReceiver = new _cls1();
        localyticsModuleHandler = clickablelocalyticsmodulehandler;
        breakingNewsDataFetcher = cachingbreakingnewsdatafetcher;
    }

    public static boolean isBreakingAvailable()
    {
        return TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ACTIVE, false);
    }

    private boolean showHide()
    {
        if (article1 == null || article2 == null || article3 == null || invalidData == null)
        {
            return false;
        }
        if (breakingNewsData.getOrder().size() < 3)
        {
            article1.setVisibility(4);
            article2.setVisibility(4);
            article3.setVisibility(4);
            invalidData.setVisibility(0);
            return false;
        } else
        {
            article1.setVisibility(0);
            article2.setVisibility(0);
            article3.setVisibility(0);
            invalidData.setVisibility(8);
            return true;
        }
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = (View)Preconditions.checkNotNull(LayoutInflater.from(context).inflate(0x7f030015, viewgroup, false));
        invalidData = (TextView)Preconditions.checkNotNull(viewgroup.findViewById(0x7f0d0073));
        article1 = (View)Preconditions.checkNotNull(viewgroup.findViewById(0x7f0d0072));
        article2 = (View)Preconditions.checkNotNull(viewgroup.findViewById(0x7f0d0074));
        article3 = (View)Preconditions.checkNotNull(viewgroup.findViewById(0x7f0d0075));
    /* block-local class not found */
    class BreakingNewsViewHolder {}

        newsHolders.add(new BreakingNewsViewHolder(article1));
        newsHolders.add(new BreakingNewsViewHolder(article2));
        newsHolders.add(new BreakingNewsViewHolder(article3));
        return viewgroup;
    }

    public void onBreakingNewsRefresh(com.weather.commons.news.provider.BreakingNewsService.BreakingNewsFeedRefresh breakingnewsfeedrefresh)
    {
        updateUi(null);
    }

    protected void updateUi(Object obj)
    {
        breakingNewsDataFetcher.asyncFetch("breaking", true, articleReceiver, "breaking");
    }



/*
    static BreakingNewsData access$002(BreakingNowModule breakingnowmodule, BreakingNewsData breakingnewsdata)
    {
        breakingnowmodule.breakingNewsData = breakingnewsdata;
        return breakingnewsdata;
    }

*/











    /* member class not found */
    class _cls1 {}

}
