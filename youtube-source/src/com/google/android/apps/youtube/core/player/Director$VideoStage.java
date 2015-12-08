// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


public final class  extends Enum
{

    private static final ENDED $VALUES[];
    public static final ENDED AD_LOADED;
    public static final ENDED AD_LOADING;
    public static final ENDED ENDED;
    public static final ENDED MEDIA_AD_PLAY_REQUESTED;
    public static final ENDED MEDIA_PLAYING_AD;
    public static final ENDED MEDIA_PLAYING_VIDEO;
    public static final ENDED MEDIA_VIDEO_PLAY_REQUESTED;
    public static final ENDED NEW;
    public static final ENDED PLAYBACK_LOADED;
    public static final ENDED READY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/Director$VideoStage, s);
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

    public final boolean isPlaying()
    {
        return isIn(new isIn[] {
            MEDIA_AD_PLAY_REQUESTED, MEDIA_PLAYING_AD, MEDIA_VIDEO_PLAY_REQUESTED, MEDIA_PLAYING_VIDEO
        });
    }

    public final boolean isPlayingAd()
    {
        return isIn(new isIn[] {
            MEDIA_AD_PLAY_REQUESTED, MEDIA_PLAYING_AD
        });
    }

    public final boolean isPlayingVideo()
    {
        return isIn(new isIn[] {
            MEDIA_VIDEO_PLAY_REQUESTED, MEDIA_PLAYING_VIDEO
        });
    }

    public final boolean onAd()
    {
        return isIn(new isIn[] {
            AD_LOADED, MEDIA_AD_PLAY_REQUESTED, MEDIA_PLAYING_AD
        });
    }

    static 
    {
        NEW = new <init>("NEW", 0);
        PLAYBACK_LOADED = new <init>("PLAYBACK_LOADED", 1);
        AD_LOADING = new <init>("AD_LOADING", 2);
        AD_LOADED = new <init>("AD_LOADED", 3);
        MEDIA_AD_PLAY_REQUESTED = new <init>("MEDIA_AD_PLAY_REQUESTED", 4);
        MEDIA_PLAYING_AD = new <init>("MEDIA_PLAYING_AD", 5);
        READY = new <init>("READY", 6);
        MEDIA_VIDEO_PLAY_REQUESTED = new <init>("MEDIA_VIDEO_PLAY_REQUESTED", 7);
        MEDIA_PLAYING_VIDEO = new <init>("MEDIA_PLAYING_VIDEO", 8);
        ENDED = new <init>("ENDED", 9);
        $VALUES = (new .VALUES[] {
            NEW, PLAYBACK_LOADED, AD_LOADING, AD_LOADED, MEDIA_AD_PLAY_REQUESTED, MEDIA_PLAYING_AD, READY, MEDIA_VIDEO_PLAY_REQUESTED, MEDIA_PLAYING_VIDEO, ENDED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
