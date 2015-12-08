// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


public class AnalyticsSettingsData
{

    public static final int DEFAULT_SAMPLING_RATE = 1;
    public final String analyticsURL;
    public final int flushIntervalSeconds;
    public final int maxByteSizePerFile;
    public final int maxFileCountPerSend;
    public final int maxPendingSendFileCount;
    public final int samplingRate;
    public final boolean trackCustomEvents;
    public final boolean trackPredefinedEvents;

    public AnalyticsSettingsData(String s, int i, int j, int k, int l, boolean flag)
    {
        this(s, i, j, k, l, flag, true, 1);
    }

    public AnalyticsSettingsData(String s, int i, int j, int k, int l, boolean flag, int i1)
    {
        this(s, i, j, k, l, flag, true, i1);
    }

    public AnalyticsSettingsData(String s, int i, int j, int k, int l, boolean flag, boolean flag1, 
            int i1)
    {
        analyticsURL = s;
        flushIntervalSeconds = i;
        maxByteSizePerFile = j;
        maxFileCountPerSend = k;
        maxPendingSendFileCount = l;
        trackCustomEvents = flag;
        trackPredefinedEvents = flag1;
        samplingRate = i1;
    }
}
