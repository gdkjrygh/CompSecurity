// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.util.Pair;
import java.io.Serializable;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            SubtitleWindowTextTimeline, SubtitleWindowSettingsTimeline, SubtitleWindowSettings, SubtitleWindowSnapshot, 
//            ac

public final class SubtitleWindow
    implements Serializable
{

    private final int id;
    final SubtitleWindowSettingsTimeline settingsTimeline;
    final SubtitleWindowTextTimeline textTimeline;

    private SubtitleWindow(int i, SubtitleWindowTextTimeline subtitlewindowtexttimeline, SubtitleWindowSettingsTimeline subtitlewindowsettingstimeline)
    {
        id = i;
        textTimeline = subtitlewindowtexttimeline;
        settingsTimeline = subtitlewindowsettingstimeline;
    }

    SubtitleWindow(int i, SubtitleWindowTextTimeline subtitlewindowtexttimeline, SubtitleWindowSettingsTimeline subtitlewindowsettingstimeline, ac ac)
    {
        this(i, subtitlewindowtexttimeline, subtitlewindowsettingstimeline);
    }

    public final int getId()
    {
        return id;
    }

    public final Pair getRollUpTextAt(int i)
    {
        return textTimeline.getRollUpTextAt(i);
    }

    public final SubtitleWindowSettings getSettingsAt(int i)
    {
        return settingsTimeline.getSettingsAt(i);
    }

    public final SubtitleWindowSnapshot getSubtitleWindowSnapshotAt(int i)
    {
        SubtitleWindowSettings subtitlewindowsettings = getSettingsAt(i);
        Pair pair;
        if (subtitlewindowsettings != null && subtitlewindowsettings.rollUp)
        {
            pair = getRollUpTextAt(i);
        } else
        {
            pair = getTextAt(i);
        }
        return new SubtitleWindowSnapshot(id, i, (String)pair.first, (String)pair.second, subtitlewindowsettings);
    }

    public final Pair getTextAt(int i)
    {
        return textTimeline.getTextAt(i);
    }

    public final String toString()
    {
        return String.format("id: %d text: %s settings: %s", new Object[] {
            Integer.valueOf(id), textTimeline.toString(), settingsTimeline.toString()
        });
    }
}
