// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.ads2.ui.AdHolder;
import com.weather.ads2.ui.DfpAd;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.config.ActivitiesConfig;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.news.provider.BreakingNewsData;
import com.weather.commons.news.provider.CachingBreakingNewsDataFetcher;
import com.weather.commons.news.provider.PushAlertArticleFetcher;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.ProductType;
import com.weather.commons.share.ShareSimpleUrlSupport;
import com.weather.commons.share.ShareableUrl;
import com.weather.commons.share.SimpleShareableUrl;
import com.weather.commons.share.SimpleUrlSharer;
import com.weather.dal2.net.Receiver;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.news.ui:
//            NewsContentBuilder

public class BreakingNewsActivity extends TWCBaseActivity
{

    public static final String ARTICLE_ID = "ArticleId";
    private static final String TAG = "BreakingNewsActivity";
    private final AdHolder adHolder;
    private ArticlePojo article;
    final Receiver articleReceiver = new Receiver() {

        final BreakingNewsActivity this$0;

        public void onCompletion(BreakingNewsData breakingnewsdata, String s)
        {
            articles = ImmutableList.copyOf(breakingnewsdata.getArticles());
            runOnUiThread(breakingnewsdata. new Runnable() {

                final _cls1 this$1;
                final BreakingNewsData val$result;

                public void run()
                {
                    List list = result.getOrder();
                    if (position < list.size())
                    {
                        article = (ArticlePojo)articles.get(((Integer)list.get(position)).intValue());
                        buildNews();
                    }
                }

            
            {
                this$1 = final__pcls1;
                result = BreakingNewsData.this;
                super();
            }
            });
        }

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((BreakingNewsData)obj, (String)obj1);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (String)obj);
        }

        public void onError(Throwable throwable, String s)
        {
            LogUtil.e("BreakingNewsActivity", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("Error fetching breaking news article. Data returned:").append(s).toString(), new Object[0]);
        }

            
            {
                this$0 = BreakingNewsActivity.this;
                super();
            }
    };
    private List articles;
    private final DfpAd dfpAd = DfpAd.builder().build();
    private NewsContentBuilder newsBuilder;
    private SimpleUrlSharer newsSharer;
    private int position;
    private String previousPage;
    final Receiver pushAlertArticleReceiver = new Receiver() {

        final BreakingNewsActivity this$0;

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((String)obj, obj1);
        }

        public void onCompletion(String s, Object obj)
        {
            runOnUiThread(s. new Runnable() {

                final _cls2 this$1;
                final String val$result;

                public void run()
                {
                    try
                    {
                        article = ArticlePojo.fromJson(result);
                        buildNews();
                        return;
                    }
                    catch (JSONException jsonexception)
                    {
                        LogUtil.e("BreakingNewsActivity", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("error parsing JSON:").append(jsonexception).toString(), new Object[0]);
                    }
                }

            
            {
                this$1 = final__pcls2;
                result = String.this;
                super();
            }
            });
        }

        public void onError(Throwable throwable, Object obj)
        {
            LogUtil.e("BreakingNewsActivity", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("error fetching articles:").append(obj).toString(), new Object[0]);
        }

            
            {
                this$0 = BreakingNewsActivity.this;
                super();
            }
    };

    public BreakingNewsActivity()
    {
        articles = new ArrayList();
        previousPage = com.weather.commons.analytics.LocalyticsTags.ScreenName.MAIN_FEED.getName();
        adHolder = new AdHolder(dfpAd);
    }

    private void buildNews()
    {
        recordLocalyticsBreakingNowContent(article);
        newsBuilder = new NewsContentBuilder(this, (LinearLayout)findViewById(com.weather.commons.R.id.news_article_container), article);
        newsBuilder.build();
    }

    private void configureShare()
    {
        try
        {
            newsSharer = new SimpleUrlSharer(this, new ShareSimpleUrlSupport(this, com.weather.commons.R.string.news_share_subject_template_, com.weather.commons.R.string.share_message_template_, com.weather.commons.R.string.news_share_twitter_template_, com.weather.commons.R.string.news_share_chooser_title, ConfigurationManagers.getInstance().getFlagshipConfig().newsShareUrl) {

                final BreakingNewsActivity this$0;

                public void fireBeacon(ShareableUrl shareableurl)
                {
                    HashMap hashmap = new HashMap();
                    hashmap.put(com.weather.commons.analytics.LocalyticsTags.ScreenName.SHARE_ARTICLE, shareableurl.getTitle());
                    com.weather.commons.analytics.LocalyticsTags.ScreenName screenname = com.weather.commons.analytics.LocalyticsTags.ScreenName.SHARE_ARTICLE_TYPE;
                    if (article == null)
                    {
                        shareableurl = "";
                    } else
                    {
                        shareableurl = article.type;
                    }
                    hashmap.put(screenname, shareableurl);
                    hashmap.put(com.weather.commons.analytics.LocalyticsTags.ScreenName.MODULE, com.weather.commons.analytics.LocalyticsTags.ScreenName.BREAKING_NOW_MODULE.getName());
                    LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.SHARE, hashmap);
                }

            
            {
                this$0 = BreakingNewsActivity.this;
                super(context, i, j, k, l, s);
            }
            });
            return;
        }
        catch (ConfigException configexception)
        {
            throw new IllegalArgumentException("Flagship config not available", configexception);
        }
    }

    private void recordLocalyticsBreakingNowContent(ArticlePojo articlepojo)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(com.weather.commons.analytics.LocalyticsTags.ScreenName.ARTICLE_TYPE, articlepojo.type);
        hashmap.put(com.weather.commons.analytics.LocalyticsTags.ScreenName.CLICKED_ARTICLE_POSITION, String.valueOf(position + 1));
        hashmap.put(com.weather.commons.analytics.LocalyticsTags.ScreenName.PREVIOUS_PAGE, previousPage);
        LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.BREAKING_NOW_CONTENT, hashmap);
    }

    private void setupAd()
    {
        dfpAd.init((View)Preconditions.checkNotNull(findViewById(com.weather.commons.R.id.news_frame)));
        adHolder.init(getAdSlotName());
        addInitialTargetingToAd(dfpAd, getIntent());
    }

    public String getAdSlotName()
    {
        return ConfigurationManagers.getInstance().getActivitiesConfig().getAdSlot("breaking-news");
    }

    public ShareableUrl getSharable()
    {
        String s2 = "";
        String s3 = "";
        String s1 = s2;
        String s = s3;
        if (article != null)
        {
            s1 = s2;
            s = s3;
            if (article.title != null)
            {
                s1 = s2;
                s = s3;
                if (article.url != null)
                {
                    s1 = article.title;
                    s = article.url;
                }
            }
        }
        return new SimpleShareableUrl(s1, s);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.weather.commons.R.layout.news_scroller);
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayShowTitleEnabled(true);
            bundle.setDisplayHomeAsUpEnabled(true);
        }
        bundle = getIntent();
        if (bundle == null)
        {
            return;
        }
        Bundle bundle1 = bundle.getExtras();
        if (bundle1 != null && bundle1.containsKey(AlertResponseField.PRODUCT.getName()) && bundle1.getString(AlertResponseField.PRODUCT.getName()).equalsIgnoreCase(ProductType.PRODUCT_BREAKINGNEWS.getProductName()))
        {
            bundle = bundle1.getString(AlertResponseField.ARTICLE_ID.getName());
            previousPage = com.weather.commons.analytics.LocalyticsTags.ScreenName.BREAKING_NEWS_ALERTS.getName();
            (new PushAlertArticleFetcher()).asyncFetch(bundle, pushAlertArticleReceiver);
        } else
        {
            position = bundle.getIntExtra("BREAKING_NEWS_ITEM_POSITION", 0);
            CachingBreakingNewsDataFetcher.getInstance().asyncFetch("breaking", true, articleReceiver, "breaking");
        }
        setupAd();
        configureShare();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.weather.commons.R.menu.sharable_activity_menu, menu);
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
        if (i != com.weather.commons.R.id.menu_item_share) goto _L2; else goto _L1
_L1:
        menuitem = getSharable();
        newsSharer.share(menuitem);
_L4:
        return true;
_L2:
        if (i == 0x102002c)
        {
            onReturnToMainFeed();
            menuitem = NavUtils.getParentActivityIntent(this);
            menuitem.addFlags(0x4000000);
            startActivity(menuitem);
            finish();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onStart()
    {
        super.onStart();
        adHolder.resume();
    }

    protected void onStop()
    {
        adHolder.pause();
        if (newsBuilder != null)
        {
            newsBuilder.tagSlideShowLocalyticsEvent();
        }
        super.onStop();
    }



/*
    static List access$002(BreakingNewsActivity breakingnewsactivity, List list)
    {
        breakingnewsactivity.articles = list;
        return list;
    }

*/




/*
    static ArticlePojo access$202(BreakingNewsActivity breakingnewsactivity, ArticlePojo articlepojo)
    {
        breakingnewsactivity.article = articlepojo;
        return articlepojo;
    }

*/

}
