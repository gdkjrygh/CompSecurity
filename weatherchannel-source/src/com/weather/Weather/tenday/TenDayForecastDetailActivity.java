// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.tenday;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.google.common.base.Preconditions;
import com.weather.ads2.ui.AdHolder;
import com.weather.ads2.ui.DfpAd;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.config.ActivitiesConfig;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.facade.DailyWeatherFacade;
import com.weather.commons.locations.LocationUtils;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.Weather.tenday:
//            TenDayAdapter

public class TenDayForecastDetailActivity extends TWCBaseActivity
{

    public static final String SCROLL_TO_DATE_EXTRA = "com.weather.scrollToDate";
    public static final String SCROLL_TO_DATE_QS_PARAM = "date";
    public static final String SCROLL_TO_FRIDAY_EXTRA = "com.weather.scrollToFriday";
    private static final String TAG = "TenDayForecastDetailActivity";
    private final AdHolder adHolder;
    private TenDayAdapter adapter;
    private boolean alreadyAutoScrolled;
    private final DfpAd dfpAd = DfpAd.builder().build();
    private ListView listView;
    private String scrollToDate;
    private boolean scrollToFriday;

    public TenDayForecastDetailActivity()
    {
        adHolder = new AdHolder(dfpAd);
    }

    private static String getAdSlotName()
    {
        return ConfigurationManagers.getInstance().getActivitiesConfig().getAdSlot("ten-day");
    }

    private void handleNewIntent(Intent intent)
    {
        LogUtil.d("TenDayForecastDetailActivity", LoggingMetaTags.TWC_DEEPLINK, "handleNewIntent intent=%s", new Object[] {
            intent
        });
        if (intent != null)
        {
            scrollToDate = null;
            alreadyAutoScrolled = false;
            Uri uri = LocationUtils.getViewIntentUri(intent);
            scrollToDate = intent.getStringExtra("com.weather.scrollToDate");
            if (uri != null)
            {
                LocationUtils.addLocationFromUri(uri);
                if (scrollToDate == null)
                {
                    scrollToDate = uri.getQueryParameter("date");
                    LogUtil.d("TenDayForecastDetailActivity", LoggingMetaTags.TWC_DEEPLINK, "scrollToDate=%s", new Object[] {
                        scrollToDate
                    });
                }
            }
            scrollToFriday = intent.getBooleanExtra("com.weather.scrollToFriday", false);
        }
    }

    private void setData(DailyWeatherFacade dailyweatherfacade)
    {
        ActionBar actionbar = getActionBar();
        SavedLocation savedlocation = dailyweatherfacade.savedLocation;
        if (actionbar != null && savedlocation != null)
        {
            actionbar.setTitle(String.format(getResources().getString(0x7f070300), new Object[] {
                savedlocation.getNickname()
            }));
        }
        adapter.setData(dailyweatherfacade);
        if (!alreadyAutoScrolled)
        {
            alreadyAutoScrolled = true;
            if (scrollToFriday)
            {
                listView.setSelection(adapter.getFirstFridayPosition());
            } else
            if (!TextUtils.isEmpty(scrollToDate))
            {
                listView.setSelection(adapter.getPositionForDay(scrollToDate));
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayShowTitleEnabled(true);
            bundle.setDisplayHomeAsUpEnabled(true);
        }
        adapter = new TenDayAdapter(getBaseContext());
        setContentView(0x7f0300a4);
        listView = (ListView)Preconditions.checkNotNull(findViewById(0x7f0d028a));
        listView.setAdapter(adapter);
        dfpAd.init((View)Preconditions.checkNotNull(findViewById(0x7f0d0289)));
        adHolder.init(getAdSlotName());
        handleNewIntent(getIntent());
    }

    protected void onDestroy()
    {
        adHolder.destroy();
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        handleNewIntent(intent);
        setIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onReturnToMainFeed();
            break;
        }
        menuitem = NavUtils.getParentActivityIntent(this);
        menuitem.addFlags(0x4000000);
        menuitem.putExtra("com.weather.moduleId", "ten-day");
        startActivity(menuitem);
        finish();
        return true;
    }

    protected void onPause()
    {
        DataAccessLayer.BUS.unregister(this);
        adHolder.pause();
        super.onPause();
    }

    public void onReceiveData(final DailyWeatherFacade dwf)
    {
        Preconditions.checkNotNull(dwf);
        runOnUiThread(new Runnable() {

            final TenDayForecastDetailActivity this$0;
            final DailyWeatherFacade val$dwf;

            public void run()
            {
                setData(dwf);
            }

            
            {
                this$0 = TenDayForecastDetailActivity.this;
                dwf = dailyweatherfacade;
                super();
            }
        });
    }

    protected void onResume()
    {
        super.onResume();
        adHolder.resume();
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.TEN_DAY_DETAILS);
        DataAccessLayer.BUS.register(this);
    }

    protected void onReturnToMainFeed()
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.TEN_DAY_DETAILS.getName());
    }

}
