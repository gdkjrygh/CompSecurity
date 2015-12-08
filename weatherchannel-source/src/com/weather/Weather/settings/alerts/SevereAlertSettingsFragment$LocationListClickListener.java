// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.view.View;
import android.widget.AdapterView;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.util.device.LocaleUtil;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            SevereAlertSettingsFragment

private class <init>
    implements android.widget.ionListClickListener
{

    final SevereAlertSettingsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        SevereAlertSettingsFragment.access$102(SevereAlertSettingsFragment.this, true);
        boolean flag;
        boolean flag1;
        if (!UpsCommonUtil.isLoggedIntoNamedAccount() && !LocaleUtil.deviceCountryIsNonUsAndSupportsSevereAlerts())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!adapter.isSelected(i))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && adapter.getSelectedLocationsCount() >= 1 && flag1)
        {
            showWeatherProfileDialog();
            return;
        }
        adapter.changeSelectState(i);
        adapterview = adapter.getItem(i);
        if (adapter.positionRefersToFollowMe(i))
        {
            FollowMe.getInstance().setNotification(com.weather.dal2.locations.Me, flag1);
        } else
        {
            FixedLocations.getInstance().setNotification(adapterview, com.weather.dal2.locations.Me, flag1);
        }
        AlertServiceManager.getInstance().setNeedsSync(true);
    }

    private ()
    {
        this$0 = SevereAlertSettingsFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
