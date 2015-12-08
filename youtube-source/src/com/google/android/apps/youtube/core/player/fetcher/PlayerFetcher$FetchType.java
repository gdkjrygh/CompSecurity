// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.fetcher;


public final class Q extends Enum
{

    private static final BOTH $VALUES[];
    public static final BOTH BOTH;
    public static final BOTH GDATA_ONLY;
    public static final BOTH PLAYER_SERVICE_ONLY;

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/google/android/apps/youtube/core/player/fetcher/PlayerFetcher$FetchType, s);
    }

    public static Q[] values()
    {
        return (Q[])$VALUES.clone();
    }

    final boolean shouldRequestGData()
    {
        return this == GDATA_ONLY || this == BOTH;
    }

    final boolean shouldRequestPlayerService()
    {
        return this == PLAYER_SERVICE_ONLY || this == BOTH;
    }

    static 
    {
        PLAYER_SERVICE_ONLY = new <init>("PLAYER_SERVICE_ONLY", 0);
        GDATA_ONLY = new <init>("GDATA_ONLY", 1);
        BOTH = new <init>("BOTH", 2);
        $VALUES = (new .VALUES[] {
            PLAYER_SERVICE_ONLY, GDATA_ONLY, BOTH
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
