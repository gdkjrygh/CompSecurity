// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.WallpaperManager;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.locations.FindMeUtil;
import com.weather.Weather.locations.TypeAheadSearchViewUtil;
import com.weather.beacons.analytics.Analytics;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.WidgetLocations;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.Weather.widgets:
//            WeatherWidgetProvider1x1, WeatherWidgetProvider2x2, WeatherWidgetProvider4x1, WeatherWidgetProvider4x2, 
//            WidgetLocationAdapter

public class WidgetConfigurationScreen extends TWCBaseActivity
{
    private class LocationReceiver
        implements Receiver
    {

        InputMethodManager inputMethodManager;
        SearchView searchView;
        final WidgetConfigurationScreen this$0;

        public void onCompletion(SavedLocation savedlocation, String s)
        {
        /* block-local class not found */
        class _cls1 {}

            runOnUiThread(new _cls1(savedlocation));
        }

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((SavedLocation)obj, (String)obj1);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (String)obj);
        }

        public void onError(Throwable throwable, String s)
        {
            ExceptionUtil.logExceptionError("WidgetConfigScreen", (new StringBuilder()).append("LocationReceiver.onError for location:").append(s).toString(), throwable);
        }

        LocationReceiver(SearchView searchview)
        {
            this$0 = WidgetConfigurationScreen.this;
            super();
            inputMethodManager = (InputMethodManager)getSystemService("input_method");
            searchView = searchview;
        }
    }


    private static final String TAG = "WidgetConfigScreen";
    private static final Map previewImages;
    private int appWidgetId;
    private AppWidgetProviderInfo providerInfo;
    private WidgetLocationAdapter widgetLocationAdapter;

    public WidgetConfigurationScreen()
    {
    }

    private void addLocations()
    {
        ListView listview = (ListView)findViewById(0x7f0d0351);
        widgetLocationAdapter = new WidgetLocationAdapter(this, FlagshipApplication.getInstance().getLocationManager().getFixedLocations());
        listview.setAdapter(widgetLocationAdapter);
    }

    private void enableLbs()
    {
        Toast.makeText(this, getResources().getString(0x7f0700f2), 0).show();
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_LBS, true);
    }

    private void setPreviewImage(View view)
    {
        String s = providerInfo.provider.getClassName();
        int i = ((Integer)previewImages.get(s)).intValue();
        ((ImageView)view.findViewById(0x7f0d0354)).setImageResource(i);
        try
        {
            ((ImageView)view.findViewById(0x7f0d0353)).setImageDrawable(WallpaperManager.getInstance(this).getDrawable());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }

    private void triggerUpdate(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            FollowMe.getInstance().activateLbs(appWidgetId);
        } else
        {
            WidgetLocations.getInstance().addLocation(savedlocation, appWidgetId);
            FixedLocations.getInstance().addLocation(savedlocation);
        }
        savedlocation = new Intent();
        savedlocation.putExtra("appWidgetId", appWidgetId);
        setResult(-1, savedlocation);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300d0);
        bundle = getIntent().getExtras();
        if (bundle == null || !bundle.containsKey("appWidgetId"))
        {
            Log.e("WidgetConfigScreen", "no extras provided in intent");
            finish();
            return;
        }
        appWidgetId = bundle.getInt("appWidgetId", 0);
        if (appWidgetId == 0)
        {
            finish();
            return;
        } else
        {
            providerInfo = AppWidgetManager.getInstance(this).getAppWidgetInfo(appWidgetId);
            bundle = (ListView)findViewById(0x7f0d0351);
            View view = LayoutInflater.from(this).inflate(0x7f0300d1, bundle, false);
            bundle.addHeaderView(view);
            setPreviewImage(view);
            bundle = (SearchView)view.findViewById(0x7f0d0355);
            bundle.setIconified(false);
            bundle.setQueryHint(getText(0x7f0703ed));
            (new TypeAheadSearchViewUtil(bundle, new LocationReceiver(bundle))).setupMainFeedSearchView(this, 0xff000000);
            addLocations();
            bundle.setSelected(true);
            bundle = new Intent();
            bundle.putExtra("appWidgetId", appWidgetId);
            setResult(0, bundle);
            return;
        }
    }

    public boolean onCreateOptionsMenu(final Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(0x7f100009, menu);
        final MenuItem item = menu.findItem(0x7f0d0364);
        item.getActionView().setOnClickListener(new android.view.View.OnClickListener() {

            final WidgetConfigurationScreen this$0;
            final MenuItem val$item;
            final Menu val$menu;

            public void onClick(View view)
            {
                menu.performIdentifierAction(item.getItemId(), 0);
            }

            
            {
                this$0 = WidgetConfigurationScreen.this;
                menu = menu1;
                item = menuitem;
                super();
            }
        });
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131559268: 
            menuitem = widgetLocationAdapter.getSelectedLocation();
            break;
        }
        boolean flag;
        if (menuitem == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!LbsUtil.getInstance().isLbsAvailable())
        {
            FindMeUtil.showLBSDisabledDialogFragment(this).show();
            return false;
        }
        if (!LbsUtil.getInstance().isLbsEnabledForApp() || !TwcPrefs.getInstance().contains(com.weather.util.prefs.TwcPrefs.Keys.USE_LBS))
        {
            enableLbs();
        }
_L4:
        ArrayMap arraymap = new ArrayMap(1);
        arraymap.put(BeaconTargetingParam.WIDGET_TYPE, providerInfo.provider.getShortClassName());
        Analytics.trackAction(getResources().getString(0x7f0704ec), arraymap);
        triggerUpdate(menuitem);
        finish();
        return true;
_L2:
        if (LbsUtil.getInstance().isLbsEnabledForAppAndDevice() && !TwcPrefs.getInstance().contains(com.weather.util.prefs.TwcPrefs.Keys.USE_LBS))
        {
            enableLbs();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onResume()
    {
        super.onResume();
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(getString(0x7f0703ef));
        }
    }

    static 
    {
        previewImages = new HashMap();
        previewImages.put(com/weather/Weather/widgets/WeatherWidgetProvider1x1.getName(), Integer.valueOf(0x7f0204b2));
        previewImages.put(com/weather/Weather/widgets/WeatherWidgetProvider2x2.getName(), Integer.valueOf(0x7f0204b3));
        previewImages.put(com/weather/Weather/widgets/WeatherWidgetProvider4x1.getName(), Integer.valueOf(0x7f0204b4));
        previewImages.put(com/weather/Weather/widgets/WeatherWidgetProvider4x2.getName(), Integer.valueOf(0x7f0204b5));
    }

}
