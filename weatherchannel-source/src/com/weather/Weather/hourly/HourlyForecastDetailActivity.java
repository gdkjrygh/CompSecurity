// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hourly;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.ads2.ui.AdHolder;
import com.weather.ads2.ui.DfpAd;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.config.ActivitiesConfig;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.facade.HourlyWeather;
import com.weather.commons.facade.HourlyWeatherFacade;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.locations.LocationUtils;
import com.weather.commons.push.AlertList;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.ProductType;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;

// Referenced classes of package com.weather.Weather.hourly:
//            HourlyAdapter

public class HourlyForecastDetailActivity extends TWCBaseActivity
{

    private final AdHolder adHolder;
    private HourlyAdapter adapter;
    private final DfpAd dfpAd = DfpAd.builder().build();
    private TextView headerDate;
    private final android.widget.AbsListView.OnScrollListener scrollListener = new android.widget.AbsListView.OnScrollListener() {

        final HourlyForecastDetailActivity this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
            if (adapter.getCount() > i)
            {
                updateHeader((HourlyWeather)adapter.getItem(i));
            }
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
        }

            
            {
                this$0 = HourlyForecastDetailActivity.this;
                super();
            }
    };

    public HourlyForecastDetailActivity()
    {
        adHolder = new AdHolder(dfpAd);
    }

    private static String getAdSlotName()
    {
        return ConfigurationManagers.getInstance().getActivitiesConfig().getAdSlot("hourly");
    }

    public static Intent getIntent(Context context)
    {
        context = new Intent(context, com/weather/Weather/hourly/HourlyForecastDetailActivity);
        context.setFlags(0x10000000);
        return context;
    }

    private void handleNewIntent()
    {
        LocationManager locationmanager;
        Object obj;
        locationmanager = FlagshipApplication.getInstance().getLocationManager();
        obj = getIntent();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        addInitialTargetingToAd(dfpAd, ((Intent) (obj)));
        obj = ((Intent) (obj)).getExtras();
        if (obj == null || !((Bundle) (obj)).containsKey(AlertResponseField.PRODUCT.getName()) || !((Bundle) (obj)).getString(AlertResponseField.PRODUCT.getName()).equalsIgnoreCase(ProductType.PRODUCT_RAINSNOW.getProductName()))
        {
            break; /* Loop/switch isn't completed */
        }
        AlertList.rainSnowList.clearList();
        obj = ((Bundle) (obj)).getString(AlertResponseField.LOCATION_CODE.getName());
        if (obj != null)
        {
            locationmanager.setCurrentLocation(((String) (obj)), "HourlyForecast.setCurrentLocation(extras)");
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        android.net.Uri uri = LocationUtils.getViewIntentUri(getIntent());
        if (uri != null)
        {
            LocationUtils.addLocationFromUri(uri);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void setData(HourlyWeatherFacade hourlyweatherfacade)
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null && hourlyweatherfacade.savedLocation != null)
        {
            actionbar.setTitle(String.format(getResources().getString(0x7f070164), new Object[] {
                hourlyweatherfacade.savedLocation.getNickname()
            }));
        }
        adapter.setHourlyWeatherList(hourlyweatherfacade.getFilteredHourlyList());
    }

    private void updateHeader(HourlyWeather hourlyweather)
    {
        headerDate.setText(hourlyweather.formatDay());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        adapter = new HourlyAdapter(this, 0x7f03005c);
        setContentView(0x7f030056);
        headerDate = (TextView)findViewById(0x7f0d0168);
        bundle = (ListView)Preconditions.checkNotNull((ListView)findViewById(0x7f0d0166));
        bundle.setAdapter(adapter);
        bundle.setOnScrollListener(scrollListener);
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayShowTitleEnabled(true);
            bundle.setDisplayHomeAsUpEnabled(true);
        }
        dfpAd.init((View)Preconditions.checkNotNull(findViewById(0x7f0d0165)));
        adHolder.init(getAdSlotName());
        handleNewIntent();
    }

    protected void onDestroy()
    {
        adHolder.destroy();
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        handleNewIntent();
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
        menuitem.putExtra("com.weather.moduleId", "hourly");
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

    public void onReceiveHourlyWeather(HourlyWeatherFacade hourlyweatherfacade)
    {
        setHourlyWeather(hourlyweatherfacade);
    }

    protected void onResume()
    {
        super.onResume();
        adHolder.resume();
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.HOURLY_DETAILS);
        DataAccessLayer.BUS.register(this);
    }

    protected void onReturnToMainFeed()
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.HOURLY_DETAILS.getName());
    }

    public void setHourlyWeather(final HourlyWeatherFacade hwf)
    {
        runOnUiThread(new Runnable() {

            final HourlyForecastDetailActivity this$0;
            final HourlyWeatherFacade val$hwf;

            public void run()
            {
                setData(hwf);
            }

            
            {
                this$0 = HourlyForecastDetailActivity.this;
                hwf = hourlyweatherfacade;
                super();
            }
        });
    }



}
