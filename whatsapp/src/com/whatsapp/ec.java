// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            SettingsNotifications

class ec
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final SettingsNotifications a;

    ec(SettingsNotifications settingsnotifications)
    {
        a = settingsnotifications;
        super();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        ListPreference listpreference = (ListPreference)preference;
        int i = listpreference.findIndexOfValue((String)obj);
        preference.setSummary(listpreference.getEntries()[i].toString());
        return true;
    }
}
