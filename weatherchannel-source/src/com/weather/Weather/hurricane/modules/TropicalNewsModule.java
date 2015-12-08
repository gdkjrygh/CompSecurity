// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.common.base.Predicate;
import com.weather.Weather.hurricane.HurricaneNewsActivity;
import com.weather.Weather.news.AbstractSingleArticleModule;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.news.provider.Tags;
import com.weather.commons.tropical.TropicalStormNewsFetcher;
import com.weather.dal2.net.Receiver;
import com.weather.util.TwcPreconditions;
import java.util.Iterator;
import java.util.List;

public class TropicalNewsModule extends AbstractSingleArticleModule
{
    private static final class StormIdFilter
        implements Predicate
    {

        private final String stormId;

        public boolean apply(ArticlePojo articlepojo)
        {
            if (articlepojo != null) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            if (stormId == null || articlepojo.tags == null || articlepojo.tags.getStorms().isEmpty())
            {
                return true;
            }
            articlepojo = articlepojo.tags.getStorms().iterator();
            String s;
            do
            {
                if (!articlepojo.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                s = (String)articlepojo.next();
            } while (!stormId.equals(s));
            break; /* Loop/switch isn't completed */
            if (true) goto _L1; else goto _L3
_L3:
            return true;
        }

        public volatile boolean apply(Object obj)
        {
            return apply((ArticlePojo)obj);
        }

        StormIdFilter(String s)
        {
            stormId = s;
        }
    }


    private final Receiver loadHurricaneOnErrorReceiver = new _cls2();
    private final int newsIndex;
    private final Receiver noAlternateReceiver = new _cls1();
    String stormId;
    TropicalStormNewsFetcher tropicalStormNewsFetcher;

    public TropicalNewsModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler, int i)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
        newsIndex = TwcPreconditions.checkNonNegative(i);
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
        if (stormId != null)
        {
            TropicalStormNewsFetcher tropicalstormnewsfetcher = tropicalStormNewsFetcher;
            String s = stormId;
            Receiver receiver;
            if (newsIndex == 0)
            {
                receiver = loadHurricaneOnErrorReceiver;
            } else
            {
                receiver = noAlternateReceiver;
            }
            tropicalstormnewsfetcher.asyncFetch(s, receiver, null);
        } else
        if (newsIndex == 0)
        {
            tropicalStormNewsFetcher.asyncFetchHurricaneArticles(noAlternateReceiver, null);
            return;
        }
    }








    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
