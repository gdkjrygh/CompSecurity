// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            SettingsAutodownload, SettingsChat

class rp
    implements android.preference.Preference.OnPreferenceClickListener
{

    final SettingsChat a;

    rp(SettingsChat settingschat)
    {
        a = settingschat;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        a.startActivity(new Intent(a, com/whatsapp/SettingsAutodownload));
        return false;
    }
}
