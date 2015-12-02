// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            SettingsAutodownload, App

class a89
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final SettingsAutodownload a;

    a89(SettingsAutodownload settingsautodownload)
    {
        a = settingsautodownload;
        super();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        int i = SettingsAutodownload.b((CharSequence[])(CharSequence[])obj);
        App.a(3, i);
        if ((i & 4) != 0)
        {
            a.showDialog(1);
        }
        return true;
    }
}
