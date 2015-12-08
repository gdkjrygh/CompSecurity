// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            HTML5InlineVideoJSInterface

public static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR COMPLETE;
    public static final ERROR ERROR;
    public static final ERROR IDLE;
    public static final ERROR INITIALIZED;
    public static final ERROR PAUSED;
    public static final ERROR PREPARED;
    public static final ERROR STARTED;
    public static final ERROR STOPPED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/ui/HTML5InlineVideoJSInterface$VideoState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IDLE = new <init>("IDLE", 0);
        INITIALIZED = new <init>("INITIALIZED", 1);
        PREPARED = new <init>("PREPARED", 2);
        STARTED = new <init>("STARTED", 3);
        STOPPED = new <init>("STOPPED", 4);
        PAUSED = new <init>("PAUSED", 5);
        COMPLETE = new <init>("COMPLETE", 6);
        ERROR = new <init>("ERROR", 7);
        $VALUES = (new .VALUES[] {
            IDLE, INITIALIZED, PREPARED, STARTED, STOPPED, PAUSED, COMPLETE, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
