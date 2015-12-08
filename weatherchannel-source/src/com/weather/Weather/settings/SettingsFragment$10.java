// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.app.AlertDialog;
import android.preference.Preference;
import com.weather.Weather.locations.FindMeUtil;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsAttribute;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsAttributeValue;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsSummaryRecorder;
import com.weather.commons.service.AbstractNotificationService;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.lbs.LbsUtil;

// Referenced classes of package com.weather.Weather.settings:
//            SettingsFragment

class this._cls0
    implements android.preference.nceChangeListener
{

    final SettingsFragment this$0;

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        obj = (Boolean)obj;
        boolean flag;
        boolean flag1;
        if (((Boolean) (obj)).booleanValue())
        {
            preference = LocalyticsGeneralSettingsAttributeValue.ON;
        } else
        {
            preference = LocalyticsGeneralSettingsAttributeValue.OFF;
        }
        SettingsFragment.access$000(SettingsFragment.this).getGeneralSettingsSummaryRecorder().putValue(LocalyticsGeneralSettingsAttribute.FOLLOW_ME_FORECAST_CLICKED, preference.getAttributeValue());
        flag1 = true;
        if (((Boolean) (obj)).booleanValue())
        {
            flag = flag1;
            if (!LbsUtil.getInstance().isLbsAvailable())
            {
                FindMeUtil.showLBSDisabledDialogFragment(SettingsFragment.access$100(SettingsFragment.this)).show();
                flag = false;
            }
        } else
        {
            preference = FollowMe.getInstance().getLocation();
            flag = flag1;
            if (preference != null)
            {
                flag = flag1;
                if (preference.hasAlert(com.weather.dal2.locations.ype.temperature))
                {
                    AbstractNotificationService.cancelNotification(getActivity());
                    return true;
                }
            }
        }
        return flag;
    }

    ervice()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
