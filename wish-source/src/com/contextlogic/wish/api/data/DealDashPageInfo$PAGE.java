// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;


// Referenced classes of package com.contextlogic.wish.api.data:
//            DealDashPageInfo

public static final class  extends Enum
{

    private static final COUNTDOWN $VALUES[];
    public static final COUNTDOWN ACCESS_BLOCKED;
    public static final COUNTDOWN ACCESS_GRANTED;
    public static final COUNTDOWN COUNTDOWN;
    public static final COUNTDOWN PLAYING;
    public static final COUNTDOWN TIMES_UP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/data/DealDashPageInfo$PAGE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ACCESS_BLOCKED = new <init>("ACCESS_BLOCKED", 0);
        ACCESS_GRANTED = new <init>("ACCESS_GRANTED", 1);
        TIMES_UP = new <init>("TIMES_UP", 2);
        PLAYING = new <init>("PLAYING", 3);
        COUNTDOWN = new <init>("COUNTDOWN", 4);
        $VALUES = (new .VALUES[] {
            ACCESS_BLOCKED, ACCESS_GRANTED, TIMES_UP, PLAYING, COUNTDOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
