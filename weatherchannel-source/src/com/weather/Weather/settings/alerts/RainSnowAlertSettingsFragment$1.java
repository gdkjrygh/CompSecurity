// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.view.View;
import android.widget.AdapterView;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.dal2.locations.FixedLocations;
import com.weather.util.device.LocaleUtil;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            RainSnowAlertSettingsFragment

class this._cls0
    implements android.widget.rtSettingsFragment._cls1
{

    final RainSnowAlertSettingsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag = true;
        RainSnowAlertSettingsFragment.access$702(RainSnowAlertSettingsFragment.this, true);
        if (!UpsCommonUtil.isLoggedIntoNamedAccount() && LocaleUtil.isDeviceInUS())
        {
            showWeatherProfileDialog();
            return;
        }
        if (RainSnowAlertSettingsFragment.access$800(RainSnowAlertSettingsFragment.this).isSelected(i))
        {
            flag = false;
        }
        RainSnowAlertSettingsFragment.access$800(RainSnowAlertSettingsFragment.this).changeSelectState(i);
        FixedLocations.getInstance().setNotification(RainSnowAlertSettingsFragment.access$800(RainSnowAlertSettingsFragment.this).getItem(i), com.weather.dal2.locations., flag);
    }

    I()
    {
        this$0 = RainSnowAlertSettingsFragment.this;
        super();
    }
}
