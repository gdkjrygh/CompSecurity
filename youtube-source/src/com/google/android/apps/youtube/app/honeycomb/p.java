// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.content.res.Resources;
import android.preference.ListPreference;
import com.google.android.apps.youtube.app.ui.SubtitlesColorListPreference;

public final class p
{

    public static void a(Resources resources, ListPreference listpreference, ListPreference listpreference1, ListPreference listpreference2, SubtitlesColorListPreference subtitlescolorlistpreference, ListPreference listpreference3, ListPreference listpreference4, SubtitlesColorListPreference subtitlescolorlistpreference1, 
            SubtitlesColorListPreference subtitlescolorlistpreference2, ListPreference listpreference5, SubtitlesColorListPreference subtitlescolorlistpreference3, ListPreference listpreference6)
    {
        a(listpreference, com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesScale.getScaleEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesScale.getScaleValueStrings(), 2);
        a(listpreference1, com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesPresetStyle.getStyleEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesPresetStyle.getStyleValueStrings(), 0);
        a(listpreference2, com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesFont.getFontEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesFont.getFontValueStrings(), 3);
        a(((ListPreference) (subtitlescolorlistpreference)), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getColorEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getColorValueStrings(), 0);
        subtitlescolorlistpreference.a(com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getColorValues());
        a(listpreference3, com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesOpacity.getOpacityEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesOpacity.getOpacityValueStrings(), 3);
        a(listpreference4, com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesEdgeType.getEdgeTypeEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesEdgeType.getEdgeTypeValueStrings(), 0);
        a(((ListPreference) (subtitlescolorlistpreference1)), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getColorEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getColorValueStrings(), 1);
        subtitlescolorlistpreference1.a(com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getColorValues());
        a(((ListPreference) (subtitlescolorlistpreference2)), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getBackgroundColorEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getBackgroundColorValueStrings(), 2);
        subtitlescolorlistpreference2.a(com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getBackgroundColorValues());
        a(listpreference5, com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesOpacity.getOpacityEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesOpacity.getOpacityValueStrings(), 3);
        a(((ListPreference) (subtitlescolorlistpreference3)), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getBackgroundColorEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getBackgroundColorValueStrings(), 0);
        subtitlescolorlistpreference3.a(com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesColor.getBackgroundColorValues());
        a(listpreference6, com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesOpacity.getOpacityEntryStrings(resources), com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences.SubtitlesOpacity.getOpacityValueStrings(), 3);
    }

    private static void a(ListPreference listpreference, String as[], String as1[], int i)
    {
        listpreference.setEntries(as);
        listpreference.setEntryValues(as1);
        if (listpreference.getEntry() == null)
        {
            listpreference.setValueIndex(i);
        }
        listpreference.setSummary("%s");
    }
}
