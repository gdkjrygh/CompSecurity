// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.google.android.apps.youtube.app.am;
import com.google.android.youtube.s;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            SettingsActivity

public class  extends PreferenceFragment
{

    private am a;

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        addPreferencesFromResource(s.f);
        a = ((SettingsActivity)getActivity()).a();
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferencescreen, Preference preference)
    {
        preferencescreen = preference.getKey();
        if (!"pair_with_youtube_tv".equals(preferencescreen)) goto _L2; else goto _L1
_L1:
        a.b("", 0);
_L4:
        return true;
_L2:
        if ("edit_tvs".equals(preferencescreen))
        {
            a.f();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public ()
    {
    }
}
