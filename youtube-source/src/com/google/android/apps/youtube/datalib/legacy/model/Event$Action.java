// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.youtube.p;

public final class targetsVideo extends Enum
{

    private static final BULLETIN_POSTED $VALUES[];
    public static final BULLETIN_POSTED BULLETIN_POSTED;
    public static final BULLETIN_POSTED FRIEND_ADDED;
    public static final BULLETIN_POSTED USER_SUBSCRIPTION_ADDED;
    public static final BULLETIN_POSTED VIDEO_ADDED_TO_PLAYLIST;
    public static final BULLETIN_POSTED VIDEO_COMMENTED;
    public static final BULLETIN_POSTED VIDEO_FAVORITED;
    public static final BULLETIN_POSTED VIDEO_LIKED;
    public static final BULLETIN_POSTED VIDEO_RECOMMENDED;
    public static final BULLETIN_POSTED VIDEO_SHARED;
    public static final BULLETIN_POSTED VIDEO_UPLOADED;
    public final int stringId;
    public final boolean targetsVideo;

    public static targetsVideo valueOf(String s)
    {
        return (targetsVideo)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/Event$Action, s);
    }

    public static targetsVideo[] values()
    {
        return (targetsVideo[])$VALUES.clone();
    }

    static 
    {
        VIDEO_LIKED = new <init>("VIDEO_LIKED", 0, p.bJ, true);
        VIDEO_SHARED = new <init>("VIDEO_SHARED", 1, p.bL, true);
        VIDEO_FAVORITED = new <init>("VIDEO_FAVORITED", 2, p.bI, true);
        VIDEO_COMMENTED = new <init>("VIDEO_COMMENTED", 3, p.bH, true);
        VIDEO_UPLOADED = new <init>("VIDEO_UPLOADED", 4, p.bM, true);
        VIDEO_RECOMMENDED = new <init>("VIDEO_RECOMMENDED", 5, p.bK, true);
        VIDEO_ADDED_TO_PLAYLIST = new <init>("VIDEO_ADDED_TO_PLAYLIST", 6, p.bG, true);
        FRIEND_ADDED = new <init>("FRIEND_ADDED", 7, p.bE, false);
        USER_SUBSCRIPTION_ADDED = new <init>("USER_SUBSCRIPTION_ADDED", 8, p.bF, false);
        BULLETIN_POSTED = new <init>("BULLETIN_POSTED", 9, p.bD, true);
        $VALUES = (new .VALUES[] {
            VIDEO_LIKED, VIDEO_SHARED, VIDEO_FAVORITED, VIDEO_COMMENTED, VIDEO_UPLOADED, VIDEO_RECOMMENDED, VIDEO_ADDED_TO_PLAYLIST, FRIEND_ADDED, USER_SUBSCRIPTION_ADDED, BULLETIN_POSTED
        });
    }

    private (String s, int i, int j, boolean flag)
    {
        super(s, i);
        stringId = j;
        targetsVideo = flag;
    }
}
