// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;


public final class  extends Enum
{

    private static final SEQUENCE_EMPTY $VALUES[];
    public static final SEQUENCE_EMPTY NEW;
    public static final SEQUENCE_EMPTY SEQUENCE_EMPTY;
    public static final SEQUENCE_EMPTY VIDEO_LOADING;
    public static final SEQUENCE_EMPTY VIDEO_PLAYBACK_ERROR;
    public static final SEQUENCE_EMPTY VIDEO_PLAYBACK_LOADED;
    public static final SEQUENCE_EMPTY VIDEO_WATCH_LOADED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/sequencer/PlaybackSequencer$SequencerStage, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final transient boolean isIn(e_3B_.clone aclone[])
    {
        boolean flag1 = false;
        int j = aclone.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (this != aclone[i])
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

    public final boolean isOrPast(e_3B_.clone clone)
    {
        return ordinal() >= clone.ordinal();
    }

    static 
    {
        NEW = new <init>("NEW", 0);
        VIDEO_LOADING = new <init>("VIDEO_LOADING", 1);
        VIDEO_PLAYBACK_ERROR = new <init>("VIDEO_PLAYBACK_ERROR", 2);
        VIDEO_PLAYBACK_LOADED = new <init>("VIDEO_PLAYBACK_LOADED", 3);
        VIDEO_WATCH_LOADED = new <init>("VIDEO_WATCH_LOADED", 4);
        SEQUENCE_EMPTY = new <init>("SEQUENCE_EMPTY", 5);
        $VALUES = (new .VALUES[] {
            NEW, VIDEO_LOADING, VIDEO_PLAYBACK_ERROR, VIDEO_PLAYBACK_LOADED, VIDEO_WATCH_LOADED, SEQUENCE_EMPTY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
