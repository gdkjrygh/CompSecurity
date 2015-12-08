// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;


// Referenced classes of package com.sessionm.api:
//            SessionM

public static final class  extends Enum
{

    private static final STOPPING $VALUES[];
    public static final STOPPING STARTED_OFFLINE;
    public static final STOPPING STARTED_ONLINE;
    public static final STOPPING STARTING;
    public static final STOPPING STOPPED;
    public static final STOPPING STOPPING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/api/SessionM$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public boolean isStarted()
    {
        return this == STARTED_ONLINE || this == STARTED_OFFLINE;
    }

    static 
    {
        STOPPED = new <init>("STOPPED", 0);
        STARTING = new <init>("STARTING", 1);
        STARTED_ONLINE = new <init>("STARTED_ONLINE", 2);
        STARTED_OFFLINE = new <init>("STARTED_OFFLINE", 3);
        STOPPING = new <init>("STOPPING", 4);
        $VALUES = (new .VALUES[] {
            STOPPED, STARTING, STARTED_ONLINE, STARTED_OFFLINE, STOPPING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
