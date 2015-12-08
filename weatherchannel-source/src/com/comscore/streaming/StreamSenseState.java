// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


// Referenced classes of package com.comscore.streaming:
//            StreamSenseEventType

public final class StreamSenseState extends Enum
{

    public static final StreamSenseState BUFFERING;
    public static final StreamSenseState IDLE;
    public static final StreamSenseState PAUSED;
    public static final StreamSenseState PLAYING;
    private static final StreamSenseState d[];
    private String a;
    private int b;
    private StreamSenseEventType c;

    private StreamSenseState(String s, int i, String s1, int j, StreamSenseEventType streamsenseeventtype)
    {
        super(s, i);
        a = s1;
        b = j;
        c = streamsenseeventtype;
    }

    public static StreamSenseState valueOf(String s)
    {
        return (StreamSenseState)Enum.valueOf(com/comscore/streaming/StreamSenseState, s);
    }

    public static StreamSenseState[] values()
    {
        return (StreamSenseState[])d.clone();
    }

    public int getCode()
    {
        return b;
    }

    public String getName()
    {
        return a;
    }

    public StreamSenseEventType toEventType()
    {
        return c;
    }

    public String toString()
    {
        return getName();
    }

    static 
    {
        IDLE = new StreamSenseState("IDLE", 0, "idle", 0, StreamSenseEventType.END);
        PLAYING = new StreamSenseState("PLAYING", 1, "playing", 1, StreamSenseEventType.PLAY);
        PAUSED = new StreamSenseState("PAUSED", 2, "paused", 2, StreamSenseEventType.PAUSE);
        BUFFERING = new StreamSenseState("BUFFERING", 3, "buffering", 3, StreamSenseEventType.BUFFER);
        d = (new StreamSenseState[] {
            IDLE, PLAYING, PAUSED, BUFFERING
        });
    }
}
