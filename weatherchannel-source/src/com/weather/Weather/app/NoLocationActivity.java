// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import com.weather.Weather.locations.FindMeUtil;
import com.weather.Weather.locations.TypeAheadSearchViewUtil;
import com.weather.Weather.settings.SettingsActivity;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.locations.LocationReceiver;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.CurrentLocation;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.LocationChange;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.system.TwcBus;
import com.weather.facade.WeatherDataManager;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.EnumSet;

// Referenced classes of package com.weather.Weather.app:
//            FlagshipApplication

public final class NoLocationActivity extends TWCBaseActivity
{

    private TypeAheadSearchViewUtil typeAheadSearchViewUtil;

    public NoLocationActivity()
    {
    }

    private void findLocation()
    {
        if (LbsUtil.getInstance().isLbsDisabledAndCanBeEnabled())
        {
            LogUtil.d(TAG, LoggingMetaTags.TWC_GENERAL, "findLocation, lbs off and can be enabled", new Object[0]);
            FindMeUtil.showLBSDisabledDialogFragment(this, new com.weather.Weather.locations.FindMeUtil.LBSDisabledDialogListener() {

                final NoLocationActivity this$0;

                public void onDialogLaterClick()
                {
                    focusSearchBox();
                }

            
            {
                this$0 = NoLocationActivity.this;
                super();
            }
            }).show();
            return;
        }
        LogUtil.d(TAG, LoggingMetaTags.TWC_GENERAL, "findLocation, lbs on or lbs off and cannot be enabled", new Object[0]);
        if (TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_LBS, true))
        {
            LogUtil.d(TAG, LoggingMetaTags.TWC_GENERAL, "findLocation, follow me is on", new Object[0]);
            FollowMe.getInstance().activateLbs(-1);
            showSearchMessage(0x7f07026a);
            return;
        } else
        {
            LogUtil.d(TAG, LoggingMetaTags.TWC_GENERAL, "findLocation, follow me is off", new Object[0]);
            focusSearchBox();
            return;
        }
    }

    private void focusSearchBox()
    {
        showSearchMessage(0x7f070268);
        if (typeAheadSearchViewUtil != null)
        {
            typeAheadSearchViewUtil.clickSearchItem();
        }
    }

    private void showSearchMessage(int i)
    {
        TextView textview = (TextView)findViewById(0x7f0d0105);
        if (textview != null)
        {
            textview.setText(getResources().getString(i));
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            if (LbsUtil.getInstance().isLbsAvailable())
            {
                FollowMe.getInstance().activateLbs(-1);
                showSearchMessage(0x7f07026a);
                return;
            } else
            {
                showSearchMessage(0x7f070268);
                return;
            }
        } else
        {
            showSearchMessage(0x7f070268);
            return;
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!FlagshipApplication.getInstance().getLocationManager().hasLocation())
        {
            setContentView(0x7f03008a);
            bundle = getActionBar();
            if (bundle != null)
            {
                bundle.setTitle(getResources().getString(0x7f070057));
            }
            return;
        } else
        {
            setResult(-1);
            finish();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(0x7f100001, menu);
        return true;
    }

    public void onLocationChange(final LocationChange followMe)
    {
        final SavedLocationsSnapshot snapshot = followMe.getSnapshot();
        if (!followMe.getFlags().contains(com.weather.dal2.locations.LocationChange.Flags.LIST) || !followMe.getFlags().contains(com.weather.dal2.locations.LocationChange.Flags.ITEM_ADDED)) goto _L2; else goto _L1
_L1:
        runOnUiThread(new Runnable() {

            final NoLocationActivity this$0;
            final SavedLocationsSnapshot val$snapshot;

            public void run()
            {
                SavedLocation savedlocation = snapshot.getActiveLocation();
                if (savedlocation != null)
                {
                    FixedLocations.getInstance().setNotification(savedlocation, com.weather.dal2.locations.SavedLocation.AlertType.temperature, true);
                }
                setResult(-1);
                finish();
            }

            
            {
                this$0 = NoLocationActivity.this;
                snapshot = savedlocationssnapshot;
                super();
            }
        });
_L4:
        FlagshipApplication.getInstance().getWeatherDataManager().postOnGoingTemperatureNotifications();
        return;
_L2:
        if (followMe.getFlags().contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_ACTIVATED))
        {
            followMe = snapshot.getFollowMeLocation();
            if (followMe != null)
            {
                runOnUiThread(new Runnable() {

                    final NoLocationActivity this$0;
                    final SavedLocation val$followMe;

                    public void run()
                    {
                        CurrentLocation.getInstance().setLocation(followMe, "NoLocationActivity.onLocationChange() - FOLLOW_ME_ACTIVATED", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.FOLLOW_ME);
                        FollowMe.getInstance().setTemperatureNotification(true);
                        setResult(-1);
                        finish();
                    }

            
            {
                this$0 = NoLocationActivity.this;
                followMe = savedlocation;
                super();
            }
                });
            }
        } else
        if (followMe.getFlags().contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_ACTIVATION_FAILURE))
        {
            runOnUiThread(new Runnable() {

                final NoLocationActivity this$0;

                public void run()
                {
                    showSearchMessage(0x7f070268);
                }

            
            {
                this$0 = NoLocationActivity.this;
                super();
            }
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131559261: 
            startActivity(new Intent(this, com/weather/Weather/settings/SettingsActivity));
            break;
        }
        return true;
    }

    protected void onPause()
    {
        DataAccessLayer.BUS.unregister(this);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        typeAheadSearchViewUtil = new TypeAheadSearchViewUtil(menu, 0x7f0d035b, new LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_ADDED));
        typeAheadSearchViewUtil.setupMainFeedSearchView(this, -1);
        findLocation();
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onResume()
    {
        super.onResume();
        if (LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            LogUtil.d(TAG, LoggingMetaTags.TWC_GENERAL, "onResume, LBS enabled", new Object[0]);
            showSearchMessage(0x7f07026a);
        }
        DataAccessLayer.BUS.register(this);
    }


}
