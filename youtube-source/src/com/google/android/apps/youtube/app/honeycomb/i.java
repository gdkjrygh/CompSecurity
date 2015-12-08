// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.content.Intent;
import android.preference.Preference;
import com.google.android.apps.youtube.app.DebugShowOfflineQueueActivity;

final class i
    implements android.preference.Preference.OnPreferenceClickListener
{

    final SettingsActivity.DeveloperPrefsFragment a;

    i(SettingsActivity.DeveloperPrefsFragment developerprefsfragment)
    {
        a = developerprefsfragment;
        super();
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        preference = new Intent(a.getActivity(), com/google/android/apps/youtube/app/DebugShowOfflineQueueActivity);
        preference.putExtra("ancestor_classname", a.getActivity().getClass().getCanonicalName());
        a.startActivity(preference);
        return true;
    }
}
