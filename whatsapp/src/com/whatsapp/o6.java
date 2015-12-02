// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            au9, asw, SettingsContacts

class o6
    implements android.preference.Preference.OnPreferenceClickListener
{

    final SettingsContacts a;

    o6(SettingsContacts settingscontacts)
    {
        a = settingscontacts;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        asw.a(new au9(a, null), new Void[0]);
        return true;
    }
}
