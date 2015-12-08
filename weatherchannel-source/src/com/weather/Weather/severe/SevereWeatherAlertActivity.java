// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.severe;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.hurricane.HurricaneCentralActivity;
import com.weather.ads2.ui.AdHolder;
import com.weather.ads2.ui.DfpAd;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralSummaryRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralTag;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.config.ActivitiesConfig;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.WeatherAlert;
import com.weather.commons.facade.WeatherAlertsFacade;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.locations.LocationUtils;
import com.weather.commons.push.AlertList;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.ProductType;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.system.TwcBus;
import com.weather.facade.WeatherDataManager;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import dagger.ObjectGraph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.weather.Weather.severe:
//            PushAlertBeRecordFetcher

public class SevereWeatherAlertActivity extends TWCBaseActivity
{
    public static class SevereWeatherExpandableListAdapter extends BaseExpandableListAdapter
    {

        private final LayoutInflater inflater;
        private final List weatherAlertList;

        public Object getChild(int i, int j)
        {
            return weatherAlertList.get(i);
        }

        public long getChildId(int i, int j)
        {
            return (long)j;
        }

        public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
        {
            WeatherAlert weatheralert;
            Map map;
            if (view == null)
            {
                view = inflater.inflate(0x7f030096, viewgroup, false);
                viewgroup = new ViewHolderContentSevereWeatherAlert(view);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (ViewHolderContentSevereWeatherAlert)view.getTag();
            }
            weatheralert = (WeatherAlert)getChild(i, j);
            map = weatheralert.getParameters();
            viewgroup.setData(Joiner.on("\n\n").skipNulls().join(WeatherAlert.formatAlert((Iterable)map.get("SYNOPSIS")), WeatherAlert.formatAlert(weatheralert.getWarningText()), new Object[0]));
            return view;
        }

        public int getChildrenCount(int i)
        {
            return 1;
        }

        public Object getGroup(int i)
        {
            return weatherAlertList.get(i);
        }

        public int getGroupCount()
        {
            return weatherAlertList.size();
        }

        public long getGroupId(int i)
        {
            return (long)i;
        }

        public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = inflater.inflate(0x7f030097, viewgroup, false);
                viewgroup = new ViewHolderHeadlineSevereWeatherAlert(view);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (ViewHolderHeadlineSevereWeatherAlert)view.getTag();
            }
            viewgroup.setData(((WeatherAlert)getGroup(i)).getDescription());
            return view;
        }

        public boolean hasStableIds()
        {
            return true;
        }

        public boolean isChildSelectable(int i, int j)
        {
            return true;
        }

        public void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
            if (datasetobserver == null)
            {
                return;
            } else
            {
                super.unregisterDataSetObserver(datasetobserver);
                return;
            }
        }

        SevereWeatherExpandableListAdapter(List list, Context context)
        {
            weatherAlertList = list;
            inflater = LayoutInflater.from(context);
        }
    }

    private static final class ViewHolderContentSevereWeatherAlert
    {

        private final TextView severeWeatherAlertContentTextView;

        public void setData(CharSequence charsequence)
        {
            severeWeatherAlertContentTextView.setText(charsequence);
        }

        ViewHolderContentSevereWeatherAlert(View view)
        {
            severeWeatherAlertContentTextView = (TextView)view.findViewById(0x7f0d0256);
        }
    }

    private static final class ViewHolderHeadlineSevereWeatherAlert
    {

        private final TextView severeWeatherAlertHeadlineTextView;

        public void setData(CharSequence charsequence)
        {
            severeWeatherAlertHeadlineTextView.setText(charsequence);
        }

        ViewHolderHeadlineSevereWeatherAlert(View view)
        {
            severeWeatherAlertHeadlineTextView = (TextView)view.findViewById(0x7f0d0257);
        }
    }


    public static final String HEADLINE_TO_EXPAND_EXTRA_KEY = "com.weather.Weather.SevereWeatherAlertActivity.expandHeadline";
    private static final String TAG = "SevereAlertActivity";
    private static ObjectGraph testingGraph;
    private final AdHolder adHolder;
    private List alertsBeingShown;
    private List alertsList;
    ConfigurationManagers configurationManagers;
    private final DfpAd dfpAd = DfpAd.builder().build();
    private ExpandableListView expandableListView;
    private String headlineToExpand;
    private View hurricaneAlertDivider;
    private View hurricaneCentralButton;
    private List receivedPushAlerts;
    private ScrollView scNoAlerts;
    private String tropicalCycloneId;

    public SevereWeatherAlertActivity()
    {
        alertsList = new ArrayList();
        receivedPushAlerts = new ArrayList();
        adHolder = new AdHolder(dfpAd);
        alertsBeingShown = ImmutableList.of();
    }

    private void checkPushAlerts(Intent intent)
    {
        (new PushAlertBeRecordFetcher()).asyncFetch(intent, new Receiver() {

            final SevereWeatherAlertActivity this$0;

            public volatile void onCompletion(Object obj, Object obj1)
            {
                onCompletion((String)obj, obj1);
            }

            public void onCompletion(String s, Object obj)
            {
            /* block-local class not found */
            class _cls1 {}

                runOnUiThread(new _cls1(s));
            }

            public void onError(Throwable throwable, Object obj)
            {
            }

            
            {
                this$0 = SevereWeatherAlertActivity.this;
                super();
            }
        });
    }

    private static String getAdSlotName()
    {
        return ConfigurationManagers.getInstance().getActivitiesConfig().getAdSlot("severe_weather_alert");
    }

    public static Intent getIntent(Context context)
    {
        context = new Intent(context, com/weather/Weather/severe/SevereWeatherAlertActivity);
        context.setFlags(0x10000000);
        return context;
    }

    private void handleIntent()
    {
        LocationManager locationmanager = FlagshipApplication.getInstance().getLocationManager();
        Intent intent = getIntent();
        if (intent != null)
        {
            addInitialTargetingToAd(dfpAd, intent);
            Object obj = intent.getExtras();
            if (obj != null)
            {
                headlineToExpand = ((Bundle) (obj)).getString("com.weather.Weather.SevereWeatherAlertActivity.expandHeadline");
            }
            if (obj != null && ((Bundle) (obj)).containsKey(AlertResponseField.PRODUCT.getName()) && ((Bundle) (obj)).getString(AlertResponseField.PRODUCT.getName()).equalsIgnoreCase(ProductType.PRODUCT_SEVERE.getProductName()))
            {
                AlertList.severeList.clearList();
                String s = ((Bundle) (obj)).getString(AlertResponseField.LOC_TYPE.getName());
                obj = ((Bundle) (obj)).getString(AlertResponseField.LOCATION.getName());
                checkPushAlerts(intent);
                if (s != null && obj != null)
                {
                    locationmanager.setLocation(s, ((String) (obj)));
                    return;
                }
            } else
            {
                setInitialData();
                return;
            }
        }
    }

    private void setActionBar(String s, int i)
    {
        ActionBar actionbar;
        LogUtil.d("SevereAlertActivity", LoggingMetaTags.TWC_UI, "setActionBar locationName=%s, lowestSeverityNumber=%s", new Object[] {
            s, Integer.valueOf(i)
        });
        actionbar = getActionBar();
        if (actionbar == null) goto _L2; else goto _L1
_L1:
        actionbar.setDisplayOptions(12);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setTitle(s);
        actionbar.setSubtitle(getString(0x7f0702ad));
        i;
        JVM INSTR tableswitch 1 3: default 88
    //                   1 111
    //                   2 135
    //                   3 135;
           goto _L3 _L4 _L5 _L5
_L3:
        setActionBarColor();
_L7:
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            actionbar.setDisplayShowTitleEnabled(false);
            actionbar.setDisplayShowTitleEnabled(true);
        }
_L2:
        return;
_L4:
        actionbar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(0x7f0b008e)));
        continue; /* Loop/switch isn't completed */
_L5:
        actionbar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(0x7f0b008d)));
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void setAlertsOnUiThread(CurrentWeatherFacade currentweatherfacade)
    {
        WeatherAlertsFacade weatheralertsfacade = currentweatherfacade.getWeatherAlertsFacade();
        Object obj;
        int i;
        if (weatheralertsfacade == null)
        {
            obj = ImmutableList.of();
        } else
        {
            obj = weatheralertsfacade.getAlertsList();
        }
        if (currentweatherfacade.getSavedLocation() == null)
        {
            currentweatherfacade = null;
        } else
        {
            currentweatherfacade = currentweatherfacade.getSavedLocation().getNickname();
        }
        if (weatheralertsfacade == null)
        {
            i = 0;
        } else
        {
            i = weatheralertsfacade.getLowestSeverityNumber();
        }
        setActionBar(currentweatherfacade, i);
        if (!((List) (obj)).isEmpty() && receivedPushAlerts.isEmpty())
        {
            setWeatherAlertsList(((List) (obj)));
            alertsList = ((List) (obj));
            return;
        }
        if (!receivedPushAlerts.isEmpty())
        {
            if (((List) (obj)).containsAll(receivedPushAlerts))
            {
                setWeatherAlertsList(((List) (obj)));
                alertsList = ((List) (obj));
                return;
            } else
            {
                setWeatherAlertsList(receivedPushAlerts);
                return;
            }
        } else
        {
            scNoAlerts.setVisibility(0);
            expandableListView.setVisibility(8);
            hurricaneCentralButton.setVisibility(8);
            hurricaneAlertDivider.setVisibility(8);
            return;
        }
    }

    private void setInitialData()
    {
        SavedLocation savedlocation = setupLocation();
        setWeatherAlertsData(FlagshipApplication.getInstance().getWeatherDataManager().getCurrentWeatherFacade(savedlocation));
    }

    static void setTestingGraph(ObjectGraph objectgraph)
    {
        testingGraph = objectgraph;
    }

    private void setWeatherAlertsList(List list)
    {
        Object obj;
        String s;
        boolean flag1;
        flag1 = false;
        scNoAlerts.setVisibility(8);
        s = headlineToExpand;
        obj = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        Iterator iterator1;
        int i;
        i = 0;
        iterator1 = alertsBeingShown.iterator();
_L12:
        obj = s;
        if (!iterator1.hasNext()) goto _L2; else goto _L3
_L3:
        obj = (WeatherAlert)iterator1.next();
        if (!expandableListView.isGroupExpanded(i)) goto _L5; else goto _L4
_L4:
        obj = ((WeatherAlert) (obj)).getDescription();
_L2:
        expandableListView.setAdapter(new SevereWeatherExpandableListAdapter(list, this));
        expandableListView.setVisibility(0);
        alertsBeingShown = ImmutableList.copyOf(list);
        if (list.size() != 1) goto _L7; else goto _L6
_L6:
        expandableListView.expandGroup(0);
_L14:
        int j;
        j = 0;
        i = 0;
        if (!configurationManagers.getFlagshipConfig().hurricaneCentralEnabled) goto _L9; else goto _L8
_L8:
        list = list.iterator();
_L11:
        j = i;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (WeatherAlert)list.next();
        j = i | ((WeatherAlert) (obj)).isForTropicalCyclone();
        i = j;
        if (j == 0) goto _L11; else goto _L10
_L10:
        Iterator iterator;
        boolean flag;
        try
        {
            tropicalCycloneId = ((WeatherAlert) (obj)).getTropicalCycloneId();
            obj = tropicalCycloneId;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IllegalStateException("Unable to get flagship config", list);
        }
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = j;
        if (!flag) goto _L11; else goto _L9
_L9:
        if (j != 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        hurricaneCentralButton.setVisibility(i);
        hurricaneAlertDivider.setVisibility(i);
        return;
_L5:
        i++;
          goto _L12
_L7:
        if (obj == null) goto _L14; else goto _L13
_L13:
        i = 0;
        iterator = list.iterator();
_L15:
        if (iterator.hasNext())
        {
label0:
            {
                if (!((String) (obj)).equals(((WeatherAlert)iterator.next()).getDescription()))
                {
                    break label0;
                }
                expandableListView.expandGroup(i);
                headlineToExpand = null;
            }
        }
          goto _L14
        i++;
          goto _L15
    }

    private SavedLocation setupLocation()
    {
        LocationManager locationmanager = FlagshipApplication.getInstance().getLocationManager();
        SavedLocation savedlocation = null;
        Object obj = getIntent();
        if (obj != null)
        {
            SavedLocation savedlocation1 = locationmanager.getCurrentLocation();
            savedlocation = savedlocation1;
            if (savedlocation1 == null)
            {
                obj = LocationUtils.getViewIntentUri(((Intent) (obj)));
                savedlocation = savedlocation1;
                if (obj != null)
                {
                    LocationUtils.addLocationFromUri(((android.net.Uri) (obj)));
                    savedlocation = locationmanager.getCurrentLocation();
                }
            }
        }
        SavedLocation savedlocation2 = savedlocation;
        if (savedlocation == null)
        {
            locationmanager.setCurrentLocation();
            savedlocation2 = locationmanager.getCurrentLocation();
        }
        return savedlocation2;
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
        configurationManagers = (ConfigurationManagers)bundle.get(com/weather/commons/config/ConfigurationManagers);
        setContentView(0x7f030095);
        expandableListView = (ExpandableListView)findViewById(0x7f0d0255);
        scNoAlerts = (ScrollView)findViewById(0x7f0d0253);
        hurricaneAlertDivider = findViewById(0x7f0d0252);
        hurricaneCentralButton = findViewById(0x7f0d0251);
        hurricaneCentralButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SevereWeatherAlertActivity this$0;

            public void onClick(View view)
            {
                view = new Intent(SevereWeatherAlertActivity.this, com/weather/Weather/hurricane/HurricaneCentralActivity);
                view.putExtra("com.weather.Weather.hurricane.STORM_ID_ARG_KEY", tropicalCycloneId);
                startActivity(view);
            }

            
            {
                this$0 = SevereWeatherAlertActivity.this;
                super();
            }
        });
        bundle = (View)Preconditions.checkNotNull(findViewById(0x7f0d0250));
        dfpAd.init(bundle);
        adHolder.init(getAdSlotName());
        handleIntent();
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
            onReturnToMainFeed();
            break;
        }
        menuitem = NavUtils.getParentActivityIntent(this);
        menuitem.addFlags(0x4000000);
        menuitem.putExtra("com.weather.moduleId", "top");
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

    protected void onResume()
    {
        super.onResume();
        adHolder.resume();
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.SEVERE_WEATHER_DETAILS);
        DataAccessLayer.BUS.register(this);
    }

    protected void onReturnToHurricaneCentralFeed()
    {
        LocalyticsHandler.getInstance().getHurricaneCentralSummaryRecorder().putValue(HurricaneCentralTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.SEVERE_WEATHER_DETAILS.getName());
    }

    protected void onReturnToMainFeed()
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.SEVERE_WEATHER_DETAILS.getName());
    }

    public void setWeatherAlertsData(final CurrentWeatherFacade cwf)
    {
        LogUtil.d("SevereAlertActivity", LoggingMetaTags.TWC_UI, "setWeatherAlertData cwf=%s", new Object[] {
            cwf
        });
        if (cwf == null)
        {
            return;
        } else
        {
            runOnUiThread(new Runnable() {

                final SevereWeatherAlertActivity this$0;
                final CurrentWeatherFacade val$cwf;

                public void run()
                {
                    setAlertsOnUiThread(cwf);
                }

            
            {
                this$0 = SevereWeatherAlertActivity.this;
                cwf = currentweatherfacade;
                super();
            }
            });
            return;
        }
    }




/*
    static List access$102(SevereWeatherAlertActivity severeweatheralertactivity, List list)
    {
        severeweatheralertactivity.receivedPushAlerts = list;
        return list;
    }

*/



}
