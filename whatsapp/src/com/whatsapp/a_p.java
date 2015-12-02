// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            SettingsChat

class a_p
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final SettingsChat a;

    a_p(SettingsChat settingschat)
    {
        a = settingschat;
        super();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        ListPreference listpreference = (ListPreference)preference;
        int i = listpreference.findIndexOfValue((String)obj);
        obj = listpreference.getEntries()[i].toString();
        preference.setTitle(a.getString(0x7f0e03ac, new Object[] {
            obj
        }));
        return true;
    }
}
