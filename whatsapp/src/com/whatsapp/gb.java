// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.Preference;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.z;
import com.whatsapp.util.x;

// Referenced classes of package com.whatsapp:
//            _1, SettingsPrivacy

class gb
    implements android.preference.Preference.OnPreferenceChangeListener
{

    final SettingsPrivacy a;

    gb(SettingsPrivacy settingsprivacy)
    {
        a = settingsprivacy;
        super();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        if (Boolean.TRUE.equals(obj))
        {
            x.a(new _1(this));
        }
        z.a(a.getApplicationContext(), ag.RECEIPTS_ENABLED, Boolean.valueOf(Boolean.TRUE.equals(obj)));
        return true;
    }
}
