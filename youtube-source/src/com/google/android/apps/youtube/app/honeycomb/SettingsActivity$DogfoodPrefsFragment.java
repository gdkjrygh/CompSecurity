// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.app.Activity;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.youtube.p;
import com.google.android.youtube.s;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            SettingsActivity

public class ActivationType extends PreferenceFragment
{

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        addPreferencesFromResource(s.c);
        getActivity().setTitle("Dogfood");
        findPreference("ExoPlayer").setTitle("ExoPlayer");
        findPreference("enable_exo_cache").setTitle("Enable ExoCache");
        findPreference("enable_exo_cache").setSummary("Enable caching the video stream");
        findPreference("ExoPlayer").setTitle("ExoPlayer");
        findPreference("show_exo_player_debug_messages").setTitle("Show ExoPlayer Debug Messages");
        findPreference("show_exo_player_debug_messages").setSummary("Show a toast indicating whether ExoPlayer was selected for playback");
        bundle = (YouTubeApplication)getActivity().getApplication();
        if (!PackageUtil.a(bundle))
        {
            getPreferenceScreen().removePreference(findPreference("ExoPlayer"));
            return;
        } else
        {
            boolean flag = PackageUtil.a(bundle);
            SettingsActivity.a(com.google.android.apps.youtube.datalib.innertube.model.media.alues(), com.google.android.apps.youtube.datalib.innertube.model.media.etDefaultValue(flag).rdinal(), (ListPreference)findPreference("ExoPlayer"), p.dS, getResources());
            return;
        }
    }

    public ActivationType()
    {
    }
}
