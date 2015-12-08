// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.weather.Weather.app.SessionMBaseActivity;
import com.weather.Weather.settings.alerts.BreakingNewsAlertSettingsFragment;
import com.weather.Weather.settings.alerts.PollenAlertSettingsFragment;
import com.weather.Weather.settings.alerts.RainSnowAlertSettingsFragment;
import com.weather.Weather.settings.alerts.RealTimeAlertSettingsFragment;
import com.weather.Weather.settings.alerts.RealTimeAlertType;
import com.weather.Weather.settings.alerts.SevereAlertSettingsFragment;
import com.weather.Weather.settings.alerts.SignificantWeatherForecastAlertsSettingsFragment;
import com.weather.Weather.settings.alerts.WeatherAlertsSettingsFragment;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.ProductType;
import com.weather.commons.ups.backend.GooglePlusConnectionManager;
import com.weather.commons.ups.ui.AccountSettingsFragment;
import com.weather.commons.ups.ui.ChangeEmailFragment;
import com.weather.commons.ups.ui.ChangePasswordFragment;
import com.weather.commons.ups.ui.ProfileCompletionFragment;
import com.weather.util.app.FragmentHelper;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.Weather.settings:
//            SettingsFragment, OnGoingTemperatureSettingsFragment, AboutFragment

public class SettingsActivity extends SessionMBaseActivity
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    public static final String MY_ALERTS_SETTING_EXTRA = "My Alerts";
    public static final String SETTING_EXTRA = "com.weather.Weather.SettingsActivity.setting";
    private static final String TAG = "SettingsActivity";
    private final Map fragmentParentMap = new HashMap();
    private final SettingsFragment settingsFragment = new SettingsFragment();

    public SettingsActivity()
    {
        fragmentParentMap.put(com/weather/Weather/settings/SettingsFragment.getName(), null);
        fragmentParentMap.put(com/weather/Weather/settings/alerts/WeatherAlertsSettingsFragment.getName(), settingsFragment);
        fragmentParentMap.put(com/weather/Weather/settings/OnGoingTemperatureSettingsFragment.getName(), settingsFragment);
        fragmentParentMap.put(com/weather/Weather/settings/AboutFragment.getName(), settingsFragment);
        fragmentParentMap.put(com/weather/commons/ups/ui/AccountSettingsFragment.getName(), settingsFragment);
        Object obj = new WeatherAlertsSettingsFragment();
        fragmentParentMap.put(com/weather/Weather/settings/alerts/PollenAlertSettingsFragment.getName(), obj);
        fragmentParentMap.put(com/weather/Weather/settings/alerts/RainSnowAlertSettingsFragment.getName(), obj);
        fragmentParentMap.put(com/weather/Weather/settings/alerts/BreakingNewsAlertSettingsFragment.getName(), obj);
        fragmentParentMap.put(com/weather/Weather/settings/alerts/SevereAlertSettingsFragment.getName(), obj);
        fragmentParentMap.put(com/weather/Weather/settings/alerts/RealTimeAlertSettingsFragment.getName(), obj);
        fragmentParentMap.put(com/weather/Weather/settings/alerts/SignificantWeatherForecastAlertsSettingsFragment.getName(), obj);
        obj = new AccountSettingsFragment();
        fragmentParentMap.put(com/weather/commons/ups/ui/ProfileCompletionFragment.getName(), obj);
        fragmentParentMap.put(com/weather/commons/ups/ui/ChangeEmailFragment.getName(), obj);
        fragmentParentMap.put(com/weather/commons/ups/ui/ChangePasswordFragment.getName(), obj);
    }

    private void goToHomeActivity()
    {
        onReturnToMainFeed();
        Intent intent = NavUtils.getParentActivityIntent(this);
        intent.addFlags(0x4000000);
        startActivity(intent);
        finish();
    }

    private void openAlertSettings(String s)
    {
        ProductType producttype = ProductType.getProduct(s);
        if (producttype != null)
        {
            static class _cls1
            {

                static final int $SwitchMap$com$weather$commons$push$ProductType[];

                static 
                {
                    $SwitchMap$com$weather$commons$push$ProductType = new int[ProductType.values().length];
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_RAINSNOW.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_REAL_TIME_RAIN.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_LIGHTNING_STRIKES.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_BREAKINGNEWS.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_POLLEN.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_SEVERE.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.weather.commons.push.ProductType[producttype.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                FragmentHelper.switchToNewFragment(getFragmentManager(), new RainSnowAlertSettingsFragment());
                return;

            case 2: // '\002'
                FragmentHelper.switchToNewFragment(getFragmentManager(), RealTimeAlertSettingsFragment.newInstance(RealTimeAlertType.REAL_TIME_RAIN));
                return;

            case 3: // '\003'
                FragmentHelper.switchToNewFragment(getFragmentManager(), RealTimeAlertSettingsFragment.newInstance(RealTimeAlertType.LIGHTNING_STRIKES));
                return;

            case 4: // '\004'
                FragmentHelper.switchToNewFragment(getFragmentManager(), new BreakingNewsAlertSettingsFragment());
                return;

            case 5: // '\005'
                FragmentHelper.switchToNewFragment(getFragmentManager(), new PollenAlertSettingsFragment());
                return;

            case 6: // '\006'
                FragmentHelper.switchToNewFragment(getFragmentManager(), new SevereAlertSettingsFragment());
                break;
            }
            return;
        } else
        {
            Log.e("SettingsActivity", (new StringBuilder()).append("unknown Alert Type:").append(s).toString());
            return;
        }
    }

    private void openSetting(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch -1009283189 -1009283189: default 24
    //                   -1009283189 70;
           goto _L1 _L2
_L2:
        if (s.equals("My Alerts"))
        {
            byte0 = 0;
        }
_L1:
        switch (byte0)
        {
        default:
            Log.e("SettingsActivity", (new StringBuilder()).append("unknown setting:").append(s).toString());
            return;

        case 0: // '\0'
            FragmentHelper.switchToNewFragment(getFragmentManager(), new WeatherAlertsSettingsFragment());
            break;
        }
        return;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        intent = GooglePlusConnectionManager.getInstance();
        if ((i == 1 || i == 2) && i == 1 && !intent.isConnected() && !intent.isConnecting())
        {
            LogUtil.e("SettingsActivity", LoggingMetaTags.TWC_UPS, "Error occurred on Google+ connect", new Object[0]);
            intent.setConnectionResult(null);
            intent.connect();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = getActionBar();
        if (obj != null)
        {
            ((ActionBar) (obj)).setTitle(0x7f070272);
            ((ActionBar) (obj)).setHomeButtonEnabled(true);
            ((ActionBar) (obj)).setDisplayHomeAsUpEnabled(true);
        }
        obj = getIntent().getExtras();
        if (bundle == null && obj == null)
        {
            FragmentHelper.switchToNewFragment(getFragmentManager(), settingsFragment);
        }
        if (obj != null)
        {
            bundle = ((Bundle) (obj)).getString(AlertResponseField.PRODUCT.getName(), "");
            if (!TextUtils.isEmpty(bundle))
            {
                openAlertSettings(bundle);
            } else
            {
                bundle = ((Bundle) (obj)).getString("com.weather.Weather.SettingsActivity.setting");
                if (!TextUtils.isEmpty(bundle))
                {
                    openSetting(bundle);
                    return;
                }
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        addSessionMButton(menu);
        return true;
    }

    protected void onDestroy()
    {
        GooglePlusConnectionManager.getInstance().disconnect();
        GooglePlusConnectionManager.getInstance().uninitializePlusClient();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            menuitem = getFragmentManager();
            break;
        }
        Fragment fragment = menuitem.findFragmentById(0x1020002);
        if (fragment != null && fragmentParentMap.containsKey(fragment.getClass().getName()))
        {
            fragment = (Fragment)fragmentParentMap.get(fragment.getClass().getName());
            if (fragment != null)
            {
                if (!menuitem.popBackStackImmediate(fragment.getClass().getName(), 1))
                {
                    menuitem.popBackStack(null, 1);
                }
                FragmentHelper.switchToNewFragment(menuitem, fragment);
                return true;
            } else
            {
                goToHomeActivity();
                return true;
            }
        } else
        {
            goToHomeActivity();
            return true;
        }
    }

    protected void onPause()
    {
        TwcPrefs.getInstance().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.SETTINGS);
        TwcPrefs.getInstance().registerOnSharedPreferenceChangeListener(this);
    }

    protected void onReturnToMainFeed()
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.SETTINGS.getName());
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT.toString().equals(s))
        {
            supportInvalidateOptionsMenu();
        }
    }
}
