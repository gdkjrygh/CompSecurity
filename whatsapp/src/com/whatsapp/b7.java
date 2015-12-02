// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            SettingsNetworkUsage, SettingsAccount

class b7
    implements android.preference.Preference.OnPreferenceClickListener
{

    final SettingsAccount a;

    b7(SettingsAccount settingsaccount)
    {
        a = settingsaccount;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        a.startActivity(new Intent(a, com/whatsapp/SettingsNetworkUsage));
        return false;
    }
}
