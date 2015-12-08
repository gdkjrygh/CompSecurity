// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.content.Intent;
import android.preference.Preference;
import com.weather.Weather.ups.ui.SignUpActivity;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSource;
import com.weather.commons.analytics.ups.LocalyticsUpsSupport;

// Referenced classes of package com.weather.Weather.settings:
//            SettingsFragment

class this._cls0
    implements android.preference.enceClickListener
{

    final SettingsFragment this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        LocalyticsUpsSupport.recordSignupStarted(SettingsFragment.access$000(SettingsFragment.this), LocalyticsUpsSignupSource.SETTINGS);
        startActivity(new Intent(SettingsFragment.access$100(SettingsFragment.this), com/weather/Weather/ups/ui/SignUpActivity));
        return true;
    }

    upport()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
