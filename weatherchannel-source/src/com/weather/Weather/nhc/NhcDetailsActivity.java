// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.nhc;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.ads2.ui.AdHolder;
import com.weather.ads2.ui.DfpAd;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.MultiActivitySummaryManager;
import com.weather.commons.analytics.hurricane.HurricaneCentralSummaryRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralTag;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.facade.WeatherAlert;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import dagger.ObjectGraph;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.weather.Weather.nhc:
//            NhcWeatherAlertFetcher

public class NhcDetailsActivity extends TWCBaseActivity
{
    public static final class NhcData extends Enum
    {

        private static final NhcData $VALUES[];
        public static final NhcData DISCUSSION_DETAILS;
        public static final NhcData PUBLIC_ADVISORY;
        private final com.weather.commons.analytics.LocalyticsTags.ScreenName screenName;
        private final LocalyticsEvent showEvent;

        public static NhcData valueOf(String s)
        {
            return (NhcData)Enum.valueOf(com/weather/Weather/nhc/NhcDetailsActivity$NhcData, s);
        }

        public static NhcData[] values()
        {
            return (NhcData[])$VALUES.clone();
        }

        com.weather.commons.analytics.LocalyticsTags.ScreenName getScreenName()
        {
            return screenName;
        }

        LocalyticsEvent getShowEvent()
        {
            return showEvent;
        }

        static 
        {
            PUBLIC_ADVISORY = new NhcData("PUBLIC_ADVISORY", 0, com.weather.commons.analytics.LocalyticsTags.ScreenName.PUBLIC_ADVISORY, LocalyticsEvent.HC_PUBLIC_ADVISORY);
            DISCUSSION_DETAILS = new NhcData("DISCUSSION_DETAILS", 1, com.weather.commons.analytics.LocalyticsTags.ScreenName.TROPICAL_DISCUSSION, LocalyticsEvent.HC_TROPICAL_DISCUSSION);
            $VALUES = (new NhcData[] {
                PUBLIC_ADVISORY, DISCUSSION_DETAILS
            });
        }

        private NhcData(String s, int i, com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, LocalyticsEvent localyticsevent)
        {
            super(s, i);
            screenName = screenname;
            showEvent = localyticsevent;
        }
    }


    public static final String NHC_DATA_ID_EXTRA_KEY = "com.weather.Weather.nhc.NHC_DATA_ID_EXTRA_KEY";
    public static final String NHC_STORM_ID_EXTRA_KEY = "com.weather.Weather.nhc.NHC_STORM_ID_EXTRA_KEY";
    private static final String TAG = "NhcDetailsActivity";
    private static ObjectGraph testingGraph;
    private final AdHolder adHolder;
    private TextView detailView;
    private final DfpAd dfpAd = DfpAd.builder().build();
    private TextView headerView;
    LocalyticsHandler localyticsHandler;
    MultiActivitySummaryManager multiActivitySummaryManager;
    private NhcData nhcData;
    NhcWeatherAlertFetcher nhcWeatherAlertFetcher;
    private String stormID;

    public NhcDetailsActivity()
    {
        nhcData = NhcData.PUBLIC_ADVISORY;
        adHolder = new AdHolder(dfpAd);
    }

    public static Intent getIntent(Context context, Serializable serializable, String s)
    {
        context = new Intent(context, com/weather/Weather/nhc/NhcDetailsActivity);
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.weather.Weather.nhc.NHC_DATA_ID_EXTRA_KEY", serializable);
        bundle.putString("com.weather.Weather.nhc.NHC_STORM_ID_EXTRA_KEY", s);
        context.putExtras(bundle);
        context.setFlags(0x10000000);
        return context;
    }

    private void handleIntent()
    {
        Object obj = getIntent();
        if (obj != null)
        {
            addInitialTargetingToAd(dfpAd, ((Intent) (obj)));
            obj = ((Intent) (obj)).getExtras();
            if (obj != null && ((Bundle) (obj)).containsKey("com.weather.Weather.nhc.NHC_DATA_ID_EXTRA_KEY") && ((Bundle) (obj)).containsKey("com.weather.Weather.nhc.NHC_STORM_ID_EXTRA_KEY"))
            {
                nhcData = (NhcData)((Bundle) (obj)).getSerializable("com.weather.Weather.nhc.NHC_DATA_ID_EXTRA_KEY");
                if (nhcData == null)
                {
                    nhcData = NhcData.PUBLIC_ADVISORY;
                }
                stormID = ((Bundle) (obj)).getString("com.weather.Weather.nhc.NHC_STORM_ID_EXTRA_KEY");
                setActionBar(nhcData);
                setInitialData();
                return;
            }
        }
    }

    private void setActionBar(NhcData nhcdata)
    {
        ActionBar actionbar;
        if (nhcdata == NhcData.PUBLIC_ADVISORY)
        {
            nhcdata = getString(0x7f070258);
        } else
        {
            nhcdata = getString(0x7f070306);
        }
        LogUtil.d("NhcDetailsActivity", LoggingMetaTags.TWC_UI, "setActionBar %s", new Object[] {
            nhcdata
        });
        actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(nhcdata);
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayShowTitleEnabled(true);
            setActionBarColor();
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                actionbar.setDisplayShowTitleEnabled(false);
                actionbar.setDisplayShowTitleEnabled(true);
            }
        }
    }

    private void setInitialData()
    {
        nhcWeatherAlertFetcher.refresh(false, new Receiver() {

            final NhcDetailsActivity this$0;

            public volatile void onCompletion(Object obj, Object obj1)
            {
                onCompletion((List)obj, obj1);
            }

            public void onCompletion(List list, Object obj)
            {
                updateAlerts(list);
            }

            public void onError(Throwable throwable, Object obj)
            {
                LogUtil.e("NhcDetailsActivity", LoggingMetaTags.TWC_UI, "Failed to get Nhc details data", new Object[] {
                    throwable.getMessage()
                });
            }

            
            {
                this$0 = NhcDetailsActivity.this;
                super();
            }
        }, null);
    }

    static void setTestingGraph(ObjectGraph objectgraph)
    {
        testingGraph = objectgraph;
    }

    private void updateAlerts(final List result)
    {
        runOnUiThread(new Runnable() {

            final NhcDetailsActivity this$0;
            final List val$result;

            public void run()
            {
                updateAlertsOnUiThread(result);
            }

            
            {
                this$0 = NhcDetailsActivity.this;
                result = list;
                super();
            }
        });
    }

    private void updateAlertsOnUiThread(List list)
    {
        if (!list.isEmpty() && stormID != null && nhcData != null)
        {
            list = NhcWeatherAlertFetcher.getWeatherAlert(list, stormID, nhcData);
            if (list != null)
            {
                headerView.setText(list.getHeadline());
                detailView.setText(WeatherAlert.formatAlert(list.getWarningText()));
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (testingGraph == null)
        {
            bundle = FlagshipApplication.getInstance().getBaseObjectGraph();
        } else
        {
            bundle = testingGraph;
        }
        bundle.inject(this);
        setContentView(0x7f03007c);
        bundle = (View)Preconditions.checkNotNull(findViewById(0x7f0d01db));
        headerView = (TextView)findViewById(0x7f0d01dc);
        detailView = (TextView)findViewById(0x7f0d01de);
        dfpAd.init(bundle);
        adHolder.init("weather.hurricane.details");
        handleIntent();
        if (stormID == null)
        {
            localyticsHandler.tagEvent(nhcData.getShowEvent());
            return;
        } else
        {
            localyticsHandler.tagEvent(nhcData.getShowEvent(), ImmutableMap.of(HurricaneCentralTag.CURRENT_STORM, stormID));
            return;
        }
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
        handleIntent();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            menuitem = NavUtils.getParentActivityIntent(this);
            break;
        }
        menuitem.addFlags(0x4000000);
        menuitem.putExtra("com.weather.moduleId", "hurricanes_bulletins");
        startActivity(menuitem);
        finish();
        return true;
    }

    protected void onPause()
    {
        adHolder.pause();
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        adHolder.resume();
        localyticsHandler.tagScreen(nhcData.getScreenName());
        localyticsHandler.getHurricaneCentralSummaryRecorder().recordResumeOnScreen(nhcData.getScreenName());
        multiActivitySummaryManager.registerSummary(LocalyticsEvent.HURRICANE_CENTRAL_SUMMARY);
    }


}
