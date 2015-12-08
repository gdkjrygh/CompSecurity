// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


public final class StreamSenseEventType extends Enum
{

    public static final StreamSenseEventType AD_CLICK;
    public static final StreamSenseEventType AD_END;
    public static final StreamSenseEventType AD_PAUSE;
    public static final StreamSenseEventType AD_PLAY;
    public static final StreamSenseEventType BUFFER;
    public static final StreamSenseEventType CUSTOM;
    public static final StreamSenseEventType END;
    public static final StreamSenseEventType HEART_BEAT;
    public static final StreamSenseEventType KEEP_ALIVE;
    public static final StreamSenseEventType PAUSE;
    public static final StreamSenseEventType PLAY;
    private static final StreamSenseEventType c[];
    private String a;
    private int b;

    private StreamSenseEventType(String s, int i, String s1, int j)
    {
        super(s, i);
        a = s1;
        b = j;
    }

    public static StreamSenseEventType valueOf(String s)
    {
        return (StreamSenseEventType)Enum.valueOf(com/comscore/streaming/StreamSenseEventType, s);
    }

    public static StreamSenseEventType[] values()
    {
        return (StreamSenseEventType[])c.clone();
    }

    public int getCode()
    {
        return b;
    }

    public String getName()
    {
        return a;
    }

    public String toString()
    {
        return getName();
    }

    static 
    {
        PLAY = new StreamSenseEventType("PLAY", 0, "play", 0);
        PAUSE = new StreamSenseEventType("PAUSE", 1, "pause", 1);
        END = new StreamSenseEventType("END", 2, "end", 2);
        BUFFER = new StreamSenseEventType("BUFFER", 3, "buffer", 3);
        KEEP_ALIVE = new StreamSenseEventType("KEEP_ALIVE", 4, "keep-alive", 4);
        HEART_BEAT = new StreamSenseEventType("HEART_BEAT", 5, "hb", 5);
        CUSTOM = new StreamSenseEventType("CUSTOM", 6, "custom", 6);
        AD_PLAY = new StreamSenseEventType("AD_PLAY", 7, "ad_play", 7);
        AD_PAUSE = new StreamSenseEventType("AD_PAUSE", 8, "ad_pause", 8);
        AD_END = new StreamSenseEventType("AD_END", 9, "ad_end", 9);
        AD_CLICK = new StreamSenseEventType("AD_CLICK", 10, "ad_click", 10);
        c = (new StreamSenseEventType[] {
            PLAY, PAUSE, END, BUFFER, KEEP_ALIVE, HEART_BEAT, CUSTOM, AD_PLAY, AD_PAUSE, AD_END, 
            AD_CLICK
        });
    }
}
