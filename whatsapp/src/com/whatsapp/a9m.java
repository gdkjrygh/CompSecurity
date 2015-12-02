// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import com.whatsapp.fieldstats.o;

// Referenced classes of package com.whatsapp:
//            ft, About, SettingsHelp

class a9m
    implements android.preference.Preference.OnPreferenceClickListener
{

    final SettingsHelp a;

    a9m(SettingsHelp settingshelp)
    {
        a = settingshelp;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        ft.a(o.ABOUT);
        preference = new Intent(a, com/whatsapp/About);
        a.startActivity(preference);
        return true;
    }
}
