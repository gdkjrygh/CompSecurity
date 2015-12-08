// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            SubtitleWindow, SubtitleWindowTextTimeline, SubtitleWindowSettingsTimeline, am

public final class Subtitles
    implements Serializable
{

    public static final int INVALID_EVENT_TIME = -1;
    private transient List eventTimes;
    private final List windows;

    private Subtitles(List list)
    {
        windows = Collections.unmodifiableList(list);
        initEventTimes();
    }

    Subtitles(List list, am am)
    {
        this(list);
    }

    private void initEventTimes()
    {
        TreeSet treeset = new TreeSet();
        for (int i = 0; i < windows.size(); i++)
        {
            SubtitleWindow subtitlewindow = (SubtitleWindow)windows.get(i);
            treeset.addAll(subtitlewindow.textTimeline.startTimes);
            treeset.addAll(subtitlewindow.textTimeline.endTimes);
            treeset.addAll(subtitlewindow.settingsTimeline.startTimes);
        }

        eventTimes = Collections.unmodifiableList(new ArrayList(treeset));
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        initEventTimes();
    }

    public final List getEventTimes()
    {
        return eventTimes;
    }

    public final List getSubtitleWindowSnapshotsAt(int i)
    {
        LinkedList linkedlist = new LinkedList();
        for (int j = 0; j < windows.size(); j++)
        {
            linkedlist.add(((SubtitleWindow)windows.get(j)).getSubtitleWindowSnapshotAt(i));
        }

        return linkedlist;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < windows.size(); i++)
        {
            stringbuilder.append("[").append(((SubtitleWindow)windows.get(i)).toString()).append("]");
        }

        return stringbuilder.toString();
    }
}
