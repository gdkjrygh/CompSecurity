// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.event;


public final class  extends Enum
{

    private static final UNPLAYABLE_IN_BACKGROUND $VALUES[];
    public static final UNPLAYABLE_IN_BACKGROUND LICENSE_SERVER_ERROR;
    public static final UNPLAYABLE_IN_BACKGROUND NO_STREAMS;
    public static final UNPLAYABLE_IN_BACKGROUND PLAYER_ERROR;
    public static final UNPLAYABLE_IN_BACKGROUND REQUEST_FAILED;
    public static final UNPLAYABLE_IN_BACKGROUND UNKNOWN;
    public static final UNPLAYABLE_IN_BACKGROUND UNPLAYABLE;
    public static final UNPLAYABLE_IN_BACKGROUND UNPLAYABLE_IN_BACKGROUND;
    public static final UNPLAYABLE_IN_BACKGROUND USER_CHECK_FAILED;
    public static final UNPLAYABLE_IN_BACKGROUND VIDEO_ERROR;
    public static final UNPLAYABLE_IN_BACKGROUND WATCH_NEXT_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/event/PlaybackServiceException$ErrorReason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final boolean isCritical()
    {
        return isIn(new isIn[] {
            UNKNOWN, VIDEO_ERROR, UNPLAYABLE, REQUEST_FAILED, USER_CHECK_FAILED, LICENSE_SERVER_ERROR, PLAYER_ERROR, NO_STREAMS, UNPLAYABLE_IN_BACKGROUND
        });
    }

    public final transient boolean isIn(UNPLAYABLE_IN_BACKGROUND aunplayable_in_background[])
    {
        boolean flag1 = false;
        int j = aunplayable_in_background.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (this != aunplayable_in_background[i])
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        VIDEO_ERROR = new <init>("VIDEO_ERROR", 1);
        UNPLAYABLE = new <init>("UNPLAYABLE", 2);
        REQUEST_FAILED = new <init>("REQUEST_FAILED", 3);
        USER_CHECK_FAILED = new <init>("USER_CHECK_FAILED", 4);
        LICENSE_SERVER_ERROR = new <init>("LICENSE_SERVER_ERROR", 5);
        PLAYER_ERROR = new <init>("PLAYER_ERROR", 6);
        NO_STREAMS = new <init>("NO_STREAMS", 7);
        WATCH_NEXT_ERROR = new <init>("WATCH_NEXT_ERROR", 8);
        UNPLAYABLE_IN_BACKGROUND = new <init>("UNPLAYABLE_IN_BACKGROUND", 9);
        $VALUES = (new .VALUES[] {
            UNKNOWN, VIDEO_ERROR, UNPLAYABLE, REQUEST_FAILED, USER_CHECK_FAILED, LICENSE_SERVER_ERROR, PLAYER_ERROR, NO_STREAMS, WATCH_NEXT_ERROR, UNPLAYABLE_IN_BACKGROUND
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
