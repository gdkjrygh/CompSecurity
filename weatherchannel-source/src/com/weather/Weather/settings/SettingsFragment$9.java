// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.preference.ListPreference;
import android.preference.Preference;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.TwcBus;
import com.weather.util.DataUnits;

// Referenced classes of package com.weather.Weather.settings:
//            SettingsFragment

class this._cls0
    implements android.preference.enceChangeListener
{

    final SettingsFragment this$0;

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        SettingsFragment.access$200(SettingsFragment.this).setSummary(obj.toString());
        SettingsFragment.access$200(SettingsFragment.this).setValue(obj.toString());
        preference = SettingsFragment.access$200(SettingsFragment.this).getValue();
        preference = DataUnits.getUnitType(SettingsFragment.access$200(SettingsFragment.this).findIndexOfValue(preference));
        if (DataUnits.setCurrentUnitType(preference))
        {
            DataAccessLayer.BUS.post(preference);
            boolean _tmp = SettingsFragment.access$302(true);
        }
        return true;
    }

    Listener()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
