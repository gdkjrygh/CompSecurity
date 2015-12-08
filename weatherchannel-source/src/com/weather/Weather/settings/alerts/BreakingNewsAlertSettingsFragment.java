// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.common.collect.ImmutableMap;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.push.ProductType;
import com.weather.util.prefs.Prefs;
import com.weather.util.sessionm.SessionMUtils;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            AlertSettingsFragment

public class BreakingNewsAlertSettingsFragment extends AlertSettingsFragment
{

    public BreakingNewsAlertSettingsFragment()
    {
        super(ProductType.PRODUCT_BREAKINGNEWS, 0x7f07027d, 0x7f03008b, com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERTS, com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERT_SOUND, com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERT_VIBRATION, com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERT_LIGHT, 0x7f07004c, true, false);
    }

    protected void logAction()
    {
        if (isAlertEnabled())
        {
            SessionMUtils.logAction("breakingnews_alert_signup");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (layoutinflater == null)
        {
            return null;
        } else
        {
            ((LinearLayout)layoutinflater.findViewById(0x7f0d023b)).addView(getFooterView());
            return layoutinflater;
        }
    }

    public void onPause()
    {
        super.onPause();
        LocalyticsHandler localyticshandler = LocalyticsHandler.getInstance();
        LocalyticsEvent localyticsevent = LocalyticsEvent.ALERT_SETTINGS;
        com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute alertattribute = com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.BREAKING_NEWS;
        String s;
        if (isAlertEnabled())
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        localyticshandler.tagEvent(localyticsevent, ImmutableMap.of(alertattribute, s, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.ALERT_SETTING_LOCATION, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttributeValues.ALERT_SETTING_SCREEN.getAttributeValue()));
        KahunaEvents.getInstance().setBreakingNewsAlerts(isAlertEnabled());
        localyticshandler = LocalyticsHandler.getInstance();
        localyticsevent = LocalyticsEvent.ALERT_SETTINGS;
        alertattribute = com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.BREAKING_NEWS;
        if (prefs.getBoolean(overallKey, false))
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        localyticshandler.tagEvent(localyticsevent, ImmutableMap.of(alertattribute, s, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.ALERT_SETTING_LOCATION, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttributeValues.ALERT_SETTING_SCREEN.getAttributeValue()));
    }

    public void onResume()
    {
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.BREAKING_NEWS_ALERTS);
        super.onResume();
    }
}
