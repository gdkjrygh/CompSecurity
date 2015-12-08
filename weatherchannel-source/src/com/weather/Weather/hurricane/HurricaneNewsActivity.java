// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.common.base.Preconditions;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.ads2.ui.AdHolder;
import com.weather.ads2.ui.DfpAd;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.MultiActivitySummaryManager;
import com.weather.commons.analytics.hurricane.HurricaneCentralSummaryRecorder;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.news.ui.NewsContentBuilder;
import com.weather.commons.share.ShareSimpleUrlSupport;
import com.weather.commons.share.ShareableUrl;
import com.weather.commons.share.SimpleShareableUrl;
import com.weather.commons.share.SimpleUrlSharer;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.util.config.ConfigException;
import dagger.ObjectGraph;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

public class HurricaneNewsActivity extends TWCBaseActivity
{

    public static final String ARTICLE_EXTRA_KEY = "com.weather.Weather.hurricane.article";
    private static ObjectGraph testObjectGraph;
    private final AdHolder adHolder;
    private ArticlePojo article;
    private final DfpAd dfpAd = DfpAd.builder().build();
    LocalyticsHandler localyticsHandler;
    MultiActivitySummaryManager multiActivitySummaryManager;

    public HurricaneNewsActivity()
    {
        adHolder = new AdHolder(dfpAd);
    }

    private void buildNews()
    {
        if (article == null)
        {
            return;
        } else
        {
            (new NewsContentBuilder(this, (LinearLayout)findViewById(0x7f0d0068), article)).build();
            return;
        }
    }

    public static Intent createIntent(Context context, ArticlePojo articlepojo)
    {
        context = new Intent(context, com/weather/Weather/hurricane/HurricaneNewsActivity);
        context.putExtra("com.weather.Weather.hurricane.article", JsonObjectMapper.toJson(articlepojo));
        return context;
    }

    private SimpleUrlSharer createSharer()
    {
        SimpleUrlSharer simpleurlsharer;
        try
        {
            simpleurlsharer = new SimpleUrlSharer(this, new ShareSimpleUrlSupport(this, 0x7f0701e0, 0x7f0702b2, 0x7f0701e1, 0x7f070544, ConfigurationManagers.getInstance().getFlagshipConfig().newsShareUrl) {

                final HurricaneNewsActivity this$0;

                public void fireBeacon(ShareableUrl shareableurl)
                {
                    HashMap hashmap = new HashMap();
                    hashmap.put(com.weather.commons.analytics.LocalyticsTags.ScreenName.SHARE_ARTICLE, shareableurl.getTitle());
                    com.weather.commons.analytics.LocalyticsTags.ScreenName screenname = com.weather.commons.analytics.LocalyticsTags.ScreenName.SHARE_ARTICLE_TYPE;
                    if (article == null || article.type == null)
                    {
                        shareableurl = "";
                    } else
                    {
                        shareableurl = article.type;
                    }
                    hashmap.put(screenname, shareableurl);
                    localyticsHandler.tagEvent(LocalyticsEvent.SHARE, hashmap);
                }

            
            {
                this$0 = HurricaneNewsActivity.this;
                super(context, i, j, k, l, s);
            }
            });
        }
        catch (ConfigException configexception)
        {
            throw new IllegalArgumentException("Flagship config not available", configexception);
        }
        return simpleurlsharer;
    }

    private ShareableUrl getSharable()
    {
        if (article == null)
        {
            return null;
        }
        String s;
        String s1;
        if (article.title == null)
        {
            s = "";
        } else
        {
            s = article.title;
        }
        if (article.url == null)
        {
            s1 = "";
        } else
        {
            s1 = article.url;
        }
        return new SimpleShareableUrl(s, s1);
    }

    static void setTestObjectGraph(ObjectGraph objectgraph)
    {
        testObjectGraph = objectgraph;
    }

    private void setupAd()
    {
        dfpAd.init((View)Preconditions.checkNotNull(findViewById(0x7f0d006f)));
        adHolder.init("weather.hurricane.details");
        addInitialTargetingToAd(dfpAd, getIntent());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (testObjectGraph == null)
        {
            bundle = FlagshipApplication.getInstance().getBaseObjectGraph();
        } else
        {
            bundle = testObjectGraph;
        }
        bundle.inject(this);
        setContentView(0x7f03007a);
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayShowTitleEnabled(true);
            bundle.setDisplayHomeAsUpEnabled(true);
        }
        createSharer();
        setupAd();
        bundle = getIntent();
        if (bundle != null)
        {
            bundle = bundle.getStringExtra("com.weather.Weather.hurricane.article");
            if (bundle != null)
            {
                try
                {
                    article = (ArticlePojo)JsonObjectMapper.fromJson(bundle, com/weather/commons/news/provider/ArticlePojo);
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.e(TAG, "Activity started with an invalid article", bundle);
                }
            }
        }
        buildNews();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100006, menu);
        return true;
    }

    protected void onDestroy()
    {
        adHolder.destroy();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i != 0x7f0d0361) goto _L2; else goto _L1
_L1:
        menuitem = getSharable();
        if (menuitem == null)
        {
            Toast.makeText(this, 0x7f0701f7, 0).show();
        } else
        {
            createSharer().share(menuitem);
        }
_L4:
        return true;
_L2:
        if (i == 0x102002c)
        {
            menuitem = NavUtils.getParentActivityIntent(this);
            menuitem.addFlags(0x4000000);
            menuitem.putExtra("com.weather.moduleId", "news");
            startActivity(menuitem);
            finish();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onStart()
    {
        super.onStart();
        localyticsHandler.getHurricaneCentralSummaryRecorder().recordResumeOnScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.HURRICANE_CENTRAL_NEWS);
        localyticsHandler.tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.HURRICANE_CENTRAL_NEWS);
        multiActivitySummaryManager.registerSummary(LocalyticsEvent.HURRICANE_CENTRAL_SUMMARY);
        adHolder.resume();
    }

    protected void onStop()
    {
        adHolder.pause();
        super.onStop();
    }

}
