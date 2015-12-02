// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            SettingsChat, Settings

class a9z
    implements android.preference.Preference.OnPreferenceClickListener
{

    final Settings a;

    a9z(Settings settings)
    {
        a = settings;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = new Intent(a, com/whatsapp/SettingsChat);
        a.startActivity(preference);
        return true;
    }
}
