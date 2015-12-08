// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


public class MediaSettings
{

    public String CPM;
    public String channel;
    public int completeCloseOffsetThreshold;
    public boolean isMediaAd;
    public double length;
    public String milestones;
    public String name;
    public String offsetMilestones;
    public String parentName;
    public String parentPod;
    public double parentPodPosition;
    public String playerID;
    public String playerName;
    public boolean segmentByMilestones;
    public boolean segmentByOffsetMilestones;
    public int trackSeconds;

    public MediaSettings()
    {
        trackSeconds = 0;
        completeCloseOffsetThreshold = 1;
    }

    public static MediaSettings adSettingsWith(String s, double d, String s1, String s2, String s3, double d1, 
            String s4)
    {
        MediaSettings mediasettings = new MediaSettings();
        mediasettings.isMediaAd = true;
        mediasettings.name = s;
        mediasettings.length = d;
        mediasettings.playerName = s1;
        mediasettings.parentName = s2;
        mediasettings.parentPod = s3;
        mediasettings.parentPodPosition = d1;
        mediasettings.CPM = s4;
        return mediasettings;
    }

    public static MediaSettings settingsWith(String s, double d, String s1, String s2)
    {
        MediaSettings mediasettings = new MediaSettings();
        mediasettings.name = s;
        mediasettings.length = d;
        mediasettings.playerName = s1;
        mediasettings.playerID = s2;
        return mediasettings;
    }
}
