// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.collect.ImmutableMap;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.dal2.locations.FollowMe;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.sessionm.SessionMUtils;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            AlertSettingsFragment, RealTimeAlertType

public class RealTimeAlertSettingsFragment extends AlertSettingsFragment
{

    private static final String TAG = "RealTimeAlertSettingsFragment";
    private static RealTimeAlertType alertType;
    private boolean isAlertSwitchInitiallyOn;

    public RealTimeAlertSettingsFragment()
    {
        super(alertType.getProductType(), alertType.getTitleResourceId(), 0x7f03008e, alertType.getPreferenceKey(), alertType.getSoundPreferenceKey(), alertType.getVibrationPreferenceKey(), alertType.getLightPreferenceKey(), 0x7f07004c, alertType.isLoginRequiredToEnableAlert(), true);
    }

    public static RealTimeAlertSettingsFragment newInstance(RealTimeAlertType realtimealerttype)
    {
        alertType = realtimealerttype;
        return new RealTimeAlertSettingsFragment();
    }

    protected void logAction()
    {
        if (!TwcPrefs.getInstance().getBoolean(alertType.getPreferenceKey(), false)) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType[];

            static 
            {
                $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType = new int[RealTimeAlertType.values().length];
                try
                {
                    $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType[RealTimeAlertType.REAL_TIME_RAIN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType[RealTimeAlertType.LIGHTNING_STRIKES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[alertType.ordinal()];
        JVM INSTR tableswitch 1 2: default 48
    //                   1 49
    //                   2 55;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        SessionMUtils.logAction("real_time_rain_alert_signup");
        return;
_L4:
        SessionMUtils.logAction("lightning_alert_signup");
        return;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (getActivity() == null)
        {
            return null;
        }
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (layoutinflater == null)
        {
            return null;
        }
        viewgroup = (TextView)getFooterView().findViewById(0x7f0d0044);
        int i = alertType.getDisclaimerResourceId();
        if (i != 0)
        {
            viewgroup.setText(getString(i));
            viewgroup.setVisibility(0);
        }
        ((LinearLayout)layoutinflater.findViewById(0x7f0d023b)).addView(getFooterView());
        return layoutinflater;
    }

    public void onPause()
    {
        boolean flag;
        super.onPause();
        flag = TwcPrefs.getInstance().getBoolean(alertType.getPreferenceKey(), false);
        if (flag == isAlertSwitchInitiallyOn) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[alertType.ordinal()];
        JVM INSTR tableswitch 1 2: default 60
    //                   1 128
    //                   2 149;
           goto _L3 _L4 _L5
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_149;
_L6:
        if (FollowMe.getInstance().getLocation() != null)
        {
            LocalyticsHandler localyticshandler = LocalyticsHandler.getInstance();
            LocalyticsEvent localyticsevent = LocalyticsEvent.ALERT_SETTINGS;
            com.weather.commons.analytics.LocalyticsTags.Tags tags = alertType.getLocalyticsTag();
            String s;
            if (prefs.getBoolean(overallKey, false))
            {
                s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
            } else
            {
                s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
            }
            localyticshandler.tagEvent(localyticsevent, ImmutableMap.of(tags, s, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.ALERT_SETTING_LOCATION, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttributeValues.ALERT_SETTING_SCREEN.getAttributeValue()));
        }
_L2:
        return;
_L4:
        FollowMe.getInstance().setRealtimeRainNotification(flag);
        KahunaEvents.getInstance().setRealTimeRain(isAlertEnabled());
          goto _L6
        FollowMe.getInstance().setLightningStrikeNotification(flag);
        KahunaEvents.getInstance().setLighteningAlerts(isAlertEnabled());
          goto _L6
    }

    public void onResume()
    {
        super.onResume();
        LocalyticsHandler.getInstance().tagScreen(alertType.getLocalyticsScreenName());
        isAlertSwitchInitiallyOn = TwcPrefs.getInstance().getBoolean(alertType.getPreferenceKey(), false);
    }
}
