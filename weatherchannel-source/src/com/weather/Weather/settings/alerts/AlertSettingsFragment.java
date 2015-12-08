// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.google.common.base.Preconditions;
import com.weather.Weather.ups.ui.LoginActivity;
import com.weather.Weather.ups.ui.SignUpActivity;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSource;
import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.push.ProductType;
import com.weather.commons.ups.backend.AnalyticsWpDialogListener;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

public abstract class AlertSettingsFragment extends Fragment
{
    private class SignupDialogListener extends AnalyticsWpDialogListener
    {

        final AlertSettingsFragment this$0;

        public void onCancel()
        {
            updateSwitchAndLayout();
        }

        public void onClickNegative()
        {
            updateSwitchAndLayout();
        }

        SignupDialogListener(String s, LocalyticsUpsSignupSource localyticsupssignupsource, LocalyticsHandler localyticshandler)
        {
            this$0 = AlertSettingsFragment.this;
            super(s, localyticsupssignupsource, localyticshandler);
        }
    }


    protected static final int ALERT_SOUND_REQUEST_CODE = 1;
    protected Switch actionBarMenuSwitch;
    private final ProductType alertType;
    protected final int dialogDescriptionResId;
    private View footerView;
    private final boolean isLbsRequiredToEnableAlert;
    private final boolean isLoginRequiredToEnableAlert;
    protected final int layoutId;
    protected final com.weather.util.prefs.TwcPrefs.Keys lightKey;
    protected LinearLayout noDataText;
    protected final com.weather.util.prefs.TwcPrefs.Keys overallKey;
    protected final Prefs prefs = TwcPrefs.getInstance();
    protected LinearLayout settingsLayout;
    protected TextView sound;
    protected final com.weather.util.prefs.TwcPrefs.Keys soundKey;
    protected final int titleResId;
    protected final com.weather.util.prefs.TwcPrefs.Keys vibrationKey;

    public AlertSettingsFragment(ProductType producttype, int i, int j, com.weather.util.prefs.TwcPrefs.Keys keys, com.weather.util.prefs.TwcPrefs.Keys keys1, com.weather.util.prefs.TwcPrefs.Keys keys2, com.weather.util.prefs.TwcPrefs.Keys keys3, 
            int k, boolean flag, boolean flag1)
    {
        alertType = (ProductType)Preconditions.checkNotNull(producttype);
        titleResId = i;
        layoutId = j;
        overallKey = keys;
        soundKey = keys1;
        vibrationKey = keys2;
        lightKey = keys3;
        dialogDescriptionResId = k;
        isLoginRequiredToEnableAlert = flag;
        isLbsRequiredToEnableAlert = flag1;
    }

    private void showSelectSoundDialog()
    {
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
        intent.putExtra("android.intent.extra.ringtone.TITLE", getString(0x7f070278));
        Object obj = prefs.getString(soundKey, "");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = null;
        } else
        {
            obj = Uri.parse(((String) (obj)));
        }
        intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", ((android.os.Parcelable) (obj)));
        startActivityForResult(intent, 1);
    }

    private void updateSoundSummary()
    {
        Object obj;
        Object obj1;
label0:
        {
            obj = getActivity();
            if (obj != null && sound != null)
            {
                obj1 = prefs.getString(soundKey, "");
                if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    break label0;
                }
                sound.setText(0x7f07027a);
            }
            return;
        }
        obj1 = RingtoneManager.getRingtone(((android.content.Context) (obj)), Uri.parse(((String) (obj1))));
        if (obj1 != null)
        {
            obj = ((Ringtone) (obj1)).getTitle(((android.content.Context) (obj)));
            sound.setText(((CharSequence) (obj)));
            return;
        } else
        {
            sound.setText(0x7f07027a);
            return;
        }
    }

    private void updateSwitchAndLayout(boolean flag)
    {
        if (!flag && !UpsCommonUtil.isLoggedIntoNamedAccount() && isLoginRequiredToEnableAlert)
        {
            prefs.putBoolean(overallKey, false);
            AlertServiceManager.getInstance().setNeedsSync(true);
        }
        flag = isAlertEnabled();
        if (actionBarMenuSwitch != null)
        {
            actionBarMenuSwitch.setChecked(flag);
        }
        updateLayoutVisibility(flag);
    }

    protected View getFooterView()
    {
        return footerView;
    }

    protected boolean isAlertEnabled()
    {
        return prefs.getBoolean(overallKey, false);
    }

    protected abstract void logAction();

    protected void onActionBarMenuSwitchDisabled()
    {
        toggleAlertState(false);
    }

    protected void onActionBarMenuSwitchEnabled()
    {
        if (isLbsRequiredToEnableAlert && !LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            actionBarMenuSwitch.setChecked(false);
            prefs.putBoolean(overallKey, false);
            Toast.makeText(getActivity(), getActivity().getString(0x7f07030c), 1).show();
        } else
        {
            toggleAlertState(true);
            if (isLoginRequiredToEnableAlert && !UpsCommonUtil.isLoggedIntoNamedAccount())
            {
                showWeatherProfileDialog();
                return;
            }
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1 && i == 1)
        {
            intent = (Uri)intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            Prefs prefs1 = prefs;
            com.weather.util.prefs.TwcPrefs.Keys keys = soundKey;
            if (intent == null)
            {
                intent = "";
            } else
            {
                intent = intent.toString();
            }
            prefs1.putString(keys, intent);
            updateSoundSummary();
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100008, menu);
        actionBarMenuSwitch = (Switch)menu.findItem(0x7f0d0363).getActionView().findViewById(0x7f0d0025);
        actionBarMenuSwitch.setChecked(isAlertEnabled());
        actionBarMenuSwitch.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final AlertSettingsFragment this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    onActionBarMenuSwitchEnabled();
                    return;
                } else
                {
                    onActionBarMenuSwitchDisabled();
                    return;
                }
            }

            
            {
                this$0 = AlertSettingsFragment.this;
                super();
            }
        });
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (getActivity() == null)
        {
            return null;
        } else
        {
            bundle = layoutinflater.inflate(layoutId, viewgroup, false);
            settingsLayout = (LinearLayout)bundle.findViewById(0x7f0d023b);
            noDataText = (LinearLayout)bundle.findViewById(0x7f0d003d);
            setHasOptionsMenu(true);
            footerView = layoutinflater.inflate(0x7f03000c, viewgroup, false);
            ((LinearLayout)footerView.findViewById(0x7f0d003f)).setOnClickListener(new android.view.View.OnClickListener() {

                final AlertSettingsFragment this$0;

                public void onClick(View view)
                {
                    showSelectSoundDialog();
                }

            
            {
                this$0 = AlertSettingsFragment.this;
                super();
            }
            });
            sound = (TextView)footerView.findViewById(0x7f0d0041);
            updateSoundSummary();
            layoutinflater = (CheckBox)footerView.findViewById(0x7f0d0042);
            layoutinflater.setChecked(prefs.getBoolean(vibrationKey, false));
            layoutinflater.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final AlertSettingsFragment this$0;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    prefs.putBoolean(vibrationKey, flag);
                }

            
            {
                this$0 = AlertSettingsFragment.this;
                super();
            }
            });
            layoutinflater = (CheckBox)footerView.findViewById(0x7f0d0043);
            layoutinflater.setChecked(prefs.getBoolean(lightKey, false));
            layoutinflater.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final AlertSettingsFragment this$0;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    prefs.putBoolean(lightKey, flag);
                }

            
            {
                this$0 = AlertSettingsFragment.this;
                super();
            }
            });
            return bundle;
        }
    }

    public void onPause()
    {
        logAction();
        KahunaEvents.getInstance().setAlerts(isAlertEnabled());
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = getActivity().getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(titleResId);
        }
        updateSwitchAndLayout();
    }

    protected void showWeatherProfileDialog()
    {
        String s = null;
        static class _cls5
        {

            static final int $SwitchMap$com$weather$commons$push$ProductType[];

            static 
            {
                $SwitchMap$com$weather$commons$push$ProductType = new int[ProductType.values().length];
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_BREAKINGNEWS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_RAINSNOW.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_REAL_TIME_RAIN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_SEVERE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_POLLEN.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_LIGHTNING_STRIKES.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.SIGNIFICANT_WEATHER_FORECAST.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls5..SwitchMap.com.weather.commons.push.ProductType[alertType.ordinal()];
        JVM INSTR tableswitch 1 7: default 56
    //                   1 67
    //                   2 113
    //                   3 128
    //                   4 135
    //                   5 142
    //                   6 149
    //                   7 156;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        throw new IllegalStateException("Attempt to show wp signup dialog with an unknown alert type");
_L2:
        LocalyticsUpsSignupSource localyticsupssignupsource;
        s = getString(0x7f0704e9);
        localyticsupssignupsource = LocalyticsUpsSignupSource.BREAKING_NEWS_ALERT;
_L10:
        UpsCommonUtil.displaySignUpPromptDialog(getActivity(), 0x7f070282, dialogDescriptionResId, new SignupDialogListener(s, localyticsupssignupsource, LocalyticsHandler.getInstance()), com/weather/Weather/ups/ui/SignUpActivity, com/weather/Weather/ups/ui/LoginActivity);
        return;
_L3:
        s = getString(0x7f0704ea);
        localyticsupssignupsource = LocalyticsUpsSignupSource.DAILY_PRECIP_ALERT;
        continue; /* Loop/switch isn't completed */
_L4:
        localyticsupssignupsource = LocalyticsUpsSignupSource.REAL_TIME_RAIN_ALERT;
        continue; /* Loop/switch isn't completed */
_L5:
        localyticsupssignupsource = LocalyticsUpsSignupSource.SEVERE_ALERT;
        continue; /* Loop/switch isn't completed */
_L6:
        localyticsupssignupsource = LocalyticsUpsSignupSource.POLLEN_ALERT;
        continue; /* Loop/switch isn't completed */
_L7:
        localyticsupssignupsource = LocalyticsUpsSignupSource.LIGHTNING_STRIKES_ALERT;
        continue; /* Loop/switch isn't completed */
_L8:
        localyticsupssignupsource = LocalyticsUpsSignupSource.SIGNIFICANT_WEATHER_FORECAST_ALERT;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected void toggleAlertState(boolean flag)
    {
        prefs.putBoolean(overallKey, flag);
        AlertServiceManager.getInstance().setNeedsSync(true);
        updateSwitchAndLayout(true);
    }

    protected void updateLayoutVisibility(boolean flag)
    {
        boolean flag1 = false;
        LinearLayout linearlayout = noDataText;
        int i;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        linearlayout.setVisibility(i);
        linearlayout = settingsLayout;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        linearlayout.setVisibility(i);
    }

    protected void updateSwitchAndLayout()
    {
        updateSwitchAndLayout(false);
    }

}
