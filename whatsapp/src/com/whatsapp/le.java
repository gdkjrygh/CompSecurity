// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            SettingsAutodownload, App

class le
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final SettingsAutodownload a;

    le(SettingsAutodownload settingsautodownload)
    {
        a = settingsautodownload;
        super();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        App.a(1, SettingsAutodownload.b((CharSequence[])(CharSequence[])obj));
        return true;
    }
}
