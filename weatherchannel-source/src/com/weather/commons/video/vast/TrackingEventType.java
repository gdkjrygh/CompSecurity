// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video.vast;

import android.util.Log;

public final class TrackingEventType extends Enum
{

    private static final TrackingEventType $VALUES[];
    private static final String TAG = "TrackingEventType";
    public static final TrackingEventType UNRECOGNIZED;
    public static final TrackingEventType acceptInvitation;
    public static final TrackingEventType complete;
    public static final TrackingEventType creativeView;
    public static final TrackingEventType firstQuartile;
    public static final TrackingEventType fullscreen;
    public static final TrackingEventType midpoint;
    public static final TrackingEventType mute;
    public static final TrackingEventType pause;
    public static final TrackingEventType resume;
    public static final TrackingEventType rewind;
    public static final TrackingEventType start;
    public static final TrackingEventType thirdQuartile;
    public static final TrackingEventType unmute;

    private TrackingEventType(String s, int i)
    {
        super(s, i);
    }

    public static TrackingEventType getValue(String s)
    {
        TrackingEventType trackingeventtype;
        try
        {
            trackingeventtype = valueOf(s);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.w("TrackingEventType", (new StringBuilder()).append("Unrecognized tracking event type:").append(s).toString());
            return UNRECOGNIZED;
        }
        return trackingeventtype;
    }

    public static TrackingEventType valueOf(String s)
    {
        return (TrackingEventType)Enum.valueOf(com/weather/commons/video/vast/TrackingEventType, s);
    }

    public static TrackingEventType[] values()
    {
        return (TrackingEventType[])$VALUES.clone();
    }

    static 
    {
        start = new TrackingEventType("start", 0);
        firstQuartile = new TrackingEventType("firstQuartile", 1);
        midpoint = new TrackingEventType("midpoint", 2);
        thirdQuartile = new TrackingEventType("thirdQuartile", 3);
        complete = new TrackingEventType("complete", 4);
        mute = new TrackingEventType("mute", 5);
        unmute = new TrackingEventType("unmute", 6);
        rewind = new TrackingEventType("rewind", 7);
        pause = new TrackingEventType("pause", 8);
        resume = new TrackingEventType("resume", 9);
        fullscreen = new TrackingEventType("fullscreen", 10);
        acceptInvitation = new TrackingEventType("acceptInvitation", 11);
        creativeView = new TrackingEventType("creativeView", 12);
        UNRECOGNIZED = new TrackingEventType("UNRECOGNIZED", 13);
        $VALUES = (new TrackingEventType[] {
            start, firstQuartile, midpoint, thirdQuartile, complete, mute, unmute, rewind, pause, resume, 
            fullscreen, acceptInvitation, creativeView, UNRECOGNIZED
        });
    }
}
