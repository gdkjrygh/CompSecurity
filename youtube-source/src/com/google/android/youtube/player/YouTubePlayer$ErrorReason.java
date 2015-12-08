// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;


public final class A extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN AUTOPLAY_DISABLED;
    public static final UNKNOWN BLOCKED_FOR_APP;
    public static final UNKNOWN EMBEDDING_DISABLED;
    public static final UNKNOWN EMPTY_PLAYLIST;
    public static final UNKNOWN INTERNAL_ERROR;
    public static final UNKNOWN NETWORK_ERROR;
    public static final UNKNOWN NOT_PLAYABLE;
    public static final UNKNOWN PLAYER_VIEW_NOT_VISIBLE;
    public static final UNKNOWN PLAYER_VIEW_TOO_SMALL;
    public static final UNKNOWN UNABLE_TO_USE_TEXTUREVIEW;
    public static final UNKNOWN UNAUTHORIZED_OVERLAY;
    public static final UNKNOWN UNEXPECTED_SERVICE_DISCONNECTION;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN USER_DECLINED_HIGH_BANDWIDTH;
    public static final UNKNOWN USER_DECLINED_RESTRICTED_CONTENT;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/google/android/youtube/player/YouTubePlayer$ErrorReason, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        EMBEDDING_DISABLED = new <init>("EMBEDDING_DISABLED", 0);
        BLOCKED_FOR_APP = new <init>("BLOCKED_FOR_APP", 1);
        NOT_PLAYABLE = new <init>("NOT_PLAYABLE", 2);
        NETWORK_ERROR = new <init>("NETWORK_ERROR", 3);
        UNAUTHORIZED_OVERLAY = new <init>("UNAUTHORIZED_OVERLAY", 4);
        PLAYER_VIEW_TOO_SMALL = new <init>("PLAYER_VIEW_TOO_SMALL", 5);
        PLAYER_VIEW_NOT_VISIBLE = new <init>("PLAYER_VIEW_NOT_VISIBLE", 6);
        EMPTY_PLAYLIST = new <init>("EMPTY_PLAYLIST", 7);
        AUTOPLAY_DISABLED = new <init>("AUTOPLAY_DISABLED", 8);
        USER_DECLINED_RESTRICTED_CONTENT = new <init>("USER_DECLINED_RESTRICTED_CONTENT", 9);
        USER_DECLINED_HIGH_BANDWIDTH = new <init>("USER_DECLINED_HIGH_BANDWIDTH", 10);
        UNEXPECTED_SERVICE_DISCONNECTION = new <init>("UNEXPECTED_SERVICE_DISCONNECTION", 11);
        UNABLE_TO_USE_TEXTUREVIEW = new <init>("UNABLE_TO_USE_TEXTUREVIEW", 12);
        INTERNAL_ERROR = new <init>("INTERNAL_ERROR", 13);
        UNKNOWN = new <init>("UNKNOWN", 14);
        $VALUES = (new .VALUES[] {
            EMBEDDING_DISABLED, BLOCKED_FOR_APP, NOT_PLAYABLE, NETWORK_ERROR, UNAUTHORIZED_OVERLAY, PLAYER_VIEW_TOO_SMALL, PLAYER_VIEW_NOT_VISIBLE, EMPTY_PLAYLIST, AUTOPLAY_DISABLED, USER_DECLINED_RESTRICTED_CONTENT, 
            USER_DECLINED_HIGH_BANDWIDTH, UNEXPECTED_SERVICE_DISCONNECTION, UNABLE_TO_USE_TEXTUREVIEW, INTERNAL_ERROR, UNKNOWN
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
