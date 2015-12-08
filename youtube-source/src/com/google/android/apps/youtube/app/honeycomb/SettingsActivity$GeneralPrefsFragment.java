// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.notification.b;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.client.at;
import com.google.android.apps.youtube.core.player.BackgroundPlayerService;
import com.google.android.youtube.s;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            m

public class Y extends PreferenceFragment
    implements android.content.angeListener
{

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        addPreferencesFromResource(s.d);
        getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        Object obj = (YouTubeApplication)getActivity().getApplication();
        if (!((YouTubeApplication) (obj)).C().g())
        {
            getPreferenceScreen().removePreference(findPreference("default_hq"));
            getPreferenceScreen().removePreference(findPreference("upload_policy"));
        }
        if (!((YouTubeApplication) (obj)).w())
        {
            getPreferenceScreen().removePreference(findPreference("background_audio_enabled"));
        }
        bundle = (ListPreference)findPreference("country");
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = GDataRequestFactory.a.iterator(); iterator.hasNext(); arraylist.add(new Locale("", (String)iterator.next()))) { }
        Collections.sort(arraylist, new m(this, Collator.getInstance()));
        CharSequence acharsequence[] = new CharSequence[arraylist.size()];
        CharSequence acharsequence1[] = new CharSequence[arraylist.size()];
        obj = ((YouTubeApplication) (obj)).s();
        int i = 0;
        int j = -1;
        for (; i < arraylist.size(); i++)
        {
            acharsequence[i] = ((Locale)arraylist.get(i)).getDisplayCountry();
            acharsequence1[i] = ((Locale)arraylist.get(i)).getCountry();
            if (acharsequence1[i].equals(obj))
            {
                j = i;
            }
        }

        bundle.setEntries(acharsequence);
        bundle.setEntryValues(acharsequence1);
        if (j != -1)
        {
            bundle.setValueIndex(j);
        }
    }

    public void onDestroy()
    {
        getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s1)
    {
        YouTubeApplication youtubeapplication = (YouTubeApplication)getActivity().getApplication();
        if (!"dev_retention_enabled".equals(s1)) goto _L2; else goto _L1
_L1:
        if (!((CheckBoxPreference)findPreference("dev_retention_enabled")).isChecked())
        {
            L.e("Resetting retention client.");
            youtubeapplication.j().b();
            L.e("Clearing visitor ID.");
            sharedpreferences.edit().j("visitor_id").j();
        }
_L4:
        return;
_L2:
        if (!"video_notifications_enabled".equals(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((CheckBoxPreference)findPreference("video_notifications_enabled")).isChecked()) goto _L4; else goto _L3
_L3:
        L.e("Registering for notifications.");
        youtubeapplication.n().a();
        return;
        if (!"background_audio_enabled".equals(s1)) goto _L4; else goto _L5
_L5:
        if (!((CheckBoxPreference)findPreference("background_audio_enabled")).isChecked())
        {
            youtubeapplication.stopService(new Intent(youtubeapplication, com/google/android/apps/youtube/core/player/BackgroundPlayerService));
        }
        sharedpreferences.edit().stopService("show_background_feature_dialog", false).stopService();
        return;
    }

    public Y()
    {
    }
}
