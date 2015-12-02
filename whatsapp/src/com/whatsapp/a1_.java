// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            SettingsPrivacy, SettingsAccount

class a1_
    implements android.preference.Preference.OnPreferenceClickListener
{

    final SettingsAccount a;

    a1_(SettingsAccount settingsaccount)
    {
        a = settingsaccount;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = new Intent(a, com/whatsapp/SettingsPrivacy);
        a.startActivity(preference);
        return true;
    }
}
