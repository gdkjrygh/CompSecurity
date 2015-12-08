// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.app.ActionBar;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.NavUtils;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.sessionm.api.SessionM;
import com.weather.ads2.ui.AdHolder;
import com.weather.ads2.ui.DfpAd;
import com.weather.beacons.analytics.Analytics;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.locations.LocationUtils;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.news.provider.NewsDownloadService;
import com.weather.commons.share.ShareSimpleUrlSupport;
import com.weather.commons.share.ShareableUrl;
import com.weather.commons.share.SimpleUrlSharer;
import com.weather.commons.ui.CursorPagerAdapter;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.weather.commons.news.ui:
//            NewsPreviewListAdapter, NewsFragmentPagerAdapter, NewsDetailFragment

public abstract class NewsActivity extends TWCBaseActivity
    implements android.app.LoaderManager.LoaderCallbacks
{
    private class PageChangeListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        final NewsActivity this$0;

        private void fireNewsBeaconAndUpdateVisibleFragment()
        {
            if (currentFragment != null)
            {
                currentFragment.setVisible(false);
            }
            int i = viewPager.getCurrentItem();
            NewsActivity newsactivity = NewsActivity.this;
            NewsDetailFragment newsdetailfragment;
            if (i < cursorCursorPagerAdapter.getCount())
            {
                newsdetailfragment = (NewsDetailFragment)cursorCursorPagerAdapter.instantiateItem(viewPager, i);
            } else
            {
                newsdetailfragment = null;
            }
            newsactivity.currentFragment = newsdetailfragment;
            if (currentFragment != null)
            {
                currentFragment.setVisible(true);
            }
        }

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int j)
        {
        }

        public void onPageSelected(int i)
        {
            int j = cursorCursorPagerAdapter.getCount();
            boolean flag;
            if (leftArrow != null)
            {
                View view = leftArrow;
                ArticlePojo articlepojo;
                KahunaEvents kahunaevents;
                Date date;
                if (i > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setEnabled(flag);
            }
            if (rightArrow != null)
            {
                view = rightArrow;
                if (i < j - 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setEnabled(flag);
            }
            fireNewsBeaconAndUpdateVisibleFragment();
            if (aPageHasBeenSelected)
            {
                adHolder.refresh();
            }
            aPageHasBeenSelected = true;
            if (moreArticlesAdapter != null)
            {
                moreArticlesAdapter.setSelectedIndex(Integer.valueOf(i));
            }
            if (pageText != null)
            {
                pageText.setText(getString(com.weather.commons.R.string.news_page_position, new Object[] {
                    Integer.valueOf(i + 1), Integer.valueOf(j)
                }));
            }
            if (currentFragment != null)
            {
                articlepojo = currentFragment.getArticle();
                if (articlepojo != null)
                {
                    kahunaevents = KahunaEvents.getInstance();
                    date = new Date();
                    String s;
                    String s1;
                    if (articlepojo.url != null)
                    {
                        s = articlepojo.url;
                    } else
                    {
                        s = "";
                    }
                    if (articlepojo.teaserTitle != null)
                    {
                        s1 = articlepojo.teaserTitle;
                    } else
                    {
                        s1 = "";
                    }
                    kahunaevents.readNews(date, "", s, s1);
                }
            }
        }

        private PageChangeListener()
        {
            this$0 = NewsActivity.this;
            super();
        }

    }


    private static final String ARTICLE_ID_QUERY_PARAM = "id";
    private static final String PROJECTION[] = {
        "article_id", "article_title", "article_image_small_url", "article_json"
    };
    private static final List PROJECTION_LIST = ImmutableList.copyOf(Arrays.asList(PROJECTION));
    public static final String SELECTED_ITEM = "SELECTED_ITEM";
    private static final String TAG = "NewsActivity";
    private boolean aPageHasBeenSelected;
    private final AdHolder adHolder;
    private NewsDetailFragment currentFragment;
    private CursorPagerAdapter cursorCursorPagerAdapter;
    private final DfpAd dfpAd = DfpAd.builder().build();
    private final Handler handler = new Handler();
    private View leftArrow;
    private NewsPreviewListAdapter moreArticlesAdapter;
    private SimpleUrlSharer newsSharer;
    private TextView pageText;
    private View rightArrow;
    private ViewPager viewPager;

    public NewsActivity()
    {
        adHolder = new AdHolder(dfpAd);
    }

    private String getDeepLinkId()
    {
        Object obj = null;
        Object obj1 = getIntent();
        String s = obj;
        if (obj1 != null)
        {
            obj1 = LocationUtils.getViewIntentUri(((Intent) (obj1)));
            s = obj;
            if (obj1 != null)
            {
                s = Uri.parse(((Uri) (obj1)).toString()).getQueryParameter("id");
            }
        }
        return s;
    }

    private void goToPreviousArticle()
    {
        if (viewPager.getCurrentItem() > 0)
        {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1, true);
        }
    }

    private void handleIntent()
    {
        Object obj = getIntent();
        if (obj != null)
        {
            obj = LocationUtils.getViewIntentUri(((Intent) (obj)));
            if (obj != null)
            {
                LocationUtils.addLocationFromUri(((Uri) (obj)));
            }
            obj = getDeepLinkId();
            if (obj != null)
            {
                LogUtil.d("NewsActivity", LoggingMetaTags.TWC_NEWS, "handle deep link %s", new Object[] {
                    obj
                });
                startService(NewsDownloadService.getTopStoriesIntent(this, true, ((String) (obj))));
            }
        }
    }

    private void setupActionBar()
    {
        Object obj = getActionBar();
        if (obj != null)
        {
            ((ActionBar) (obj)).setDisplayShowTitleEnabled(true);
            ((ActionBar) (obj)).setDisplayHomeAsUpEnabled(true);
            ((ActionBar) (obj)).setDisplayShowCustomEnabled(true);
            ((ActionBar) (obj)).setDisplayUseLogoEnabled(true);
            ((ActionBar) (obj)).setCustomView(com.weather.commons.R.layout.news_action_bar);
            obj = ((ActionBar) (obj)).getCustomView();
            pageText = (TextView)((View) (obj)).findViewById(com.weather.commons.R.id.news_action_page_text);
            leftArrow = ((View) (obj)).findViewById(com.weather.commons.R.id.news_action_left_arrow);
            leftArrow.setOnClickListener(new android.view.View.OnClickListener() {

                final NewsActivity this$0;

                public void onClick(View view)
                {
                    goToPreviousArticle();
                }

            
            {
                this$0 = NewsActivity.this;
                super();
            }
            });
            rightArrow = ((View) (obj)).findViewById(com.weather.commons.R.id.news_action_right_arrow);
            rightArrow.setOnClickListener(new android.view.View.OnClickListener() {

                final NewsActivity this$0;

                public void onClick(View view)
                {
                    goToNextArticle();
                }

            
            {
                this$0 = NewsActivity.this;
                super();
            }
            });
        }
    }

    private void setupAd()
    {
        dfpAd.init((View)Preconditions.checkNotNull(findViewById(com.weather.commons.R.id.news_frame)));
        adHolder.init(getAdSlotName());
        addInitialTargetingToAd(dfpAd, getIntent());
    }

    private void setupMoreArticles(NewsPreviewListAdapter.ArticleSelectionListener articleselectionlistener)
    {
        RecyclerView recyclerview = (RecyclerView)findViewById(com.weather.commons.R.id.news_activity_more_list);
        if (recyclerview != null)
        {
            recyclerview.setLayoutManager(new LinearLayoutManager(recyclerview.getContext(), 1, false));
            moreArticlesAdapter = new NewsPreviewListAdapter(null, null, recyclerview);
            moreArticlesAdapter.setListener(articleselectionlistener);
            recyclerview.setAdapter(moreArticlesAdapter);
            recyclerview.setItemAnimator(new DefaultItemAnimator());
        }
        try
        {
            newsSharer = new SimpleUrlSharer(this, new ShareSimpleUrlSupport(this, com.weather.commons.R.string.news_share_subject_template_, com.weather.commons.R.string.share_message_template_, com.weather.commons.R.string.news_share_twitter_template_, com.weather.commons.R.string.news_share_chooser_title, ConfigurationManagers.getInstance().getFlagshipConfig().newsShareUrl) {

                final NewsActivity this$0;

                public void fireBeacon(ShareableUrl shareableurl)
                {
                    EnumMap enummap = new EnumMap(com/weather/beacons/targeting/BeaconTargetingParam);
                    enummap.put(BeaconTargetingParam.NEWS_ARTICLE, shareableurl.getTitle());
                    Analytics.trackAction(getShareBeaconResourceId(), enummap);
                }

            
            {
                this$0 = NewsActivity.this;
                super(context, i, j, k, l, s);
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (NewsPreviewListAdapter.ArticleSelectionListener articleselectionlistener)
        {
            EventLog.e("NewsActivity", "Flagship config not available", articleselectionlistener);
        }
    }

    protected Loader createCursorLoader(Uri uri)
    {
        return new CursorLoader(this, uri, PROJECTION, null, null, null);
    }

    protected abstract String getAdSlotName();

    protected String getBeaconString()
    {
        return getResources().getString(com.weather.commons.R.string.beacon_news_details);
    }

    protected String getShareBeaconResourceId()
    {
        return getResources().getString(com.weather.commons.R.string.beacon_news_share);
    }

    public void goToNextArticle()
    {
        if (viewPager.getCurrentItem() < viewPager.getAdapter().getCount() - 1)
        {
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
        }
    }

    protected boolean hasDeepLink()
    {
        return getDeepLinkId() != null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.weather.commons.R.layout.news_activity);
        setupActionBar();
        viewPager = (ViewPager)findViewById(com.weather.commons.R.id.news_article_view_pager);
        bundle = new NewsPreviewListAdapter.ArticleSelectionListener() {

            final NewsActivity this$0;

            public void onSelected(int i)
            {
                viewPager.setCurrentItem(i, false);
            }

            
            {
                this$0 = NewsActivity.this;
                super();
            }
        };
        cursorCursorPagerAdapter = new NewsFragmentPagerAdapter(getFragmentManager(), com/weather/commons/news/ui/NewsDetailFragment, PROJECTION_LIST, null, getAdSlotName(), bundle);
        viewPager.setAdapter(cursorCursorPagerAdapter);
        setupAd();
        setupMoreArticles(bundle);
        handleIntent();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.weather.commons.R.menu.news_menu, menu);
        super.addSessionMButton(menu);
        return true;
    }

    protected void onDestroy()
    {
        adHolder.destroy();
        handler.removeCallbacks(null);
        super.onDestroy();
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        LogUtil.d("NewsActivity", LoggingMetaTags.TWC_NEWS, "Number of rows loaded %d", new Object[] {
            Integer.valueOf(cursor.getCount())
        });
        cursorCursorPagerAdapter.swapCursor(cursor);
        if (moreArticlesAdapter != null)
        {
            moreArticlesAdapter.swapCursor(cursor);
        }
        loader = getIntent();
        if (loader != null)
        {
            if ((loader = loader.getExtras()) != null)
            {
                int i = loader.getInt("SELECTED_ITEM");
                loader = new PageChangeListener();
                viewPager.setCurrentItem(i, false);
                loader.onPageSelected(i);
                viewPager.setOnPageChangeListener(loader);
                return;
            }
        }
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        cursorCursorPagerAdapter.swapCursor(null);
        if (moreArticlesAdapter != null)
        {
            moreArticlesAdapter.swapCursor(null);
            moreArticlesAdapter.setSelectedIndex(null);
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == com.weather.commons.R.id.menu_item_share)
        {
            if (currentFragment != null)
            {
                menuitem = currentFragment.getSharable();
                newsSharer.share(menuitem);
            }
            return true;
        }
        switch (i)
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onReturnToMainFeed();
            break;
        }
        menuitem = NavUtils.getParentActivityIntent(this);
        menuitem.addFlags(0x4000000);
        menuitem.putExtra("com.weather.moduleId", "news");
        startActivity(menuitem);
        finish();
        return true;
    }

    protected void onPause()
    {
        if (isInUS)
        {
            SessionM.getInstance().onActivityPause(this);
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        if (isInUS)
        {
            SessionM.getInstance().setAutopresentMode(false);
            SessionM.getInstance().onActivityResume(this);
        }
    }

    protected void onStart()
    {
        super.onStart();
        adHolder.resume();
        if (isInUS)
        {
            SessionM.getInstance().onActivityStart(this);
        }
    }

    protected void onStop()
    {
        adHolder.pause();
        if (isInUS)
        {
            SessionM.getInstance().onActivityStop(this);
        }
        super.onStop();
    }






/*
    static NewsDetailFragment access$1002(NewsActivity newsactivity, NewsDetailFragment newsdetailfragment)
    {
        newsactivity.currentFragment = newsdetailfragment;
        return newsdetailfragment;
    }

*/






/*
    static boolean access$602(NewsActivity newsactivity, boolean flag)
    {
        newsactivity.aPageHasBeenSelected = flag;
        return flag;
    }

*/



}
