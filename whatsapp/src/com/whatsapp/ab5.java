// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.Preference;
import com.whatsapp.fieldstats.l;
import com.whatsapp.fieldstats.o;

// Referenced classes of package com.whatsapp:
//            ft, App, SettingsContacts

class ab5
    implements android.preference.Preference.OnPreferenceClickListener
{

    final SettingsContacts a;

    ab5(SettingsContacts settingscontacts)
    {
        a = settingscontacts;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        ft.a(o.TELL_A_FRIEND, l.SETTINGS_CONTACTS);
        App.c(a);
        return true;
    }
}
