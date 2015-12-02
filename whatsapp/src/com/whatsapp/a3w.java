// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            SettingsNotifications, Settings

class a3w
    implements android.preference.Preference.OnPreferenceClickListener
{

    final Settings a;

    a3w(Settings settings)
    {
        a = settings;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = new Intent(a, com/whatsapp/SettingsNotifications);
        a.startActivity(preference);
        return true;
    }
}
