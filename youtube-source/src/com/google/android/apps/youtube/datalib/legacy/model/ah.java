// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.L;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, SubtitleWindowSettings, SubtitleWindowSettingsTimeline

public final class ah
    implements r
{

    private final List a = new ArrayList();
    private final List b = new ArrayList();

    public ah()
    {
        a(0, SubtitleWindowSettings.DEFAULT_SUBTITLE_WINDOW_SETTINGS);
    }

    public final SubtitleWindowSettingsTimeline a()
    {
        return new SubtitleWindowSettingsTimeline(a, b, null);
    }

    public final ah a(int i, SubtitleWindowSettings subtitlewindowsettings)
    {
        if (!a.isEmpty() && i < ((Integer)a.get(a.size() - 1)).intValue())
        {
            L.c("subtitle settings are not given in non-decreasing start time order");
        }
        a.add(Integer.valueOf(i));
        b.add(subtitlewindowsettings);
        return this;
    }

    public final Object build()
    {
        return a();
    }
}
