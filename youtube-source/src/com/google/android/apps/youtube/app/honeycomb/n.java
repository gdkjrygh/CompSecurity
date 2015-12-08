// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import com.google.android.apps.youtube.core.ui.SubtitleWindowView;

final class n
    implements Runnable
{

    final SettingsActivity.SubtitlesPrefsFragment a;

    n(SettingsActivity.SubtitlesPrefsFragment subtitlesprefsfragment)
    {
        a = subtitlesprefsfragment;
        super();
    }

    public final void run()
    {
        SettingsActivity.SubtitlesPrefsFragment.a(a);
        SettingsActivity.SubtitlesPrefsFragment.b(a).setVisibility(0);
    }
}
