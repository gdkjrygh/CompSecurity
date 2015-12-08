// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            SubtitleWindowSettings, ag

public final class SubtitleWindowSettingsTimeline
    implements Serializable
{

    private final List settings;
    final List startTimes;

    private SubtitleWindowSettingsTimeline(List list, List list1)
    {
        c.a(list);
        c.a(list1);
        boolean flag;
        if (list.size() == list1.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag, "startTimes and settings differ in size");
        startTimes = Collections.unmodifiableList(list);
        settings = Collections.unmodifiableList(list1);
    }

    SubtitleWindowSettingsTimeline(List list, List list1, ag ag)
    {
        this(list, list1);
    }

    public final SubtitleWindowSettings getSettingsAt(int i)
    {
        this;
        JVM INSTR monitorenter ;
        i = Collections.binarySearch(startTimes, Integer.valueOf(i));
        if (i < 0) goto _L2; else goto _L1
_L1:
        SubtitleWindowSettings subtitlewindowsettings = (SubtitleWindowSettings)settings.get(i);
_L4:
        this;
        JVM INSTR monitorexit ;
        return subtitlewindowsettings;
_L2:
        i = -i - 2;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        subtitlewindowsettings = (SubtitleWindowSettings)settings.get(i);
        continue; /* Loop/switch isn't completed */
        subtitlewindowsettings = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < startTimes.size(); i++)
        {
            stringbuilder.append("[").append(startTimes.get(i)).append(": ").append(settings.get(i)).append("]");
        }

        return stringbuilder.toString();
    }
}
