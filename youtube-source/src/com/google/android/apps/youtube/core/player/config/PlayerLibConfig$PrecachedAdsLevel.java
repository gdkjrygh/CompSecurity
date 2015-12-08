// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.config;


public final class  extends Enum
{

    private static final PRECACHE_AD_STREAM $VALUES[];
    public static final PRECACHE_AD_STREAM NONE;
    public static final PRECACHE_AD_STREAM PRECACHE_AD_METADATA;
    public static final PRECACHE_AD_STREAM PRECACHE_AD_STREAM;
    public static final PRECACHE_AD_STREAM SIMULATE_AD_LOAD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/config/PlayerLibConfig$PrecachedAdsLevel, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        SIMULATE_AD_LOAD = new <init>("SIMULATE_AD_LOAD", 1);
        PRECACHE_AD_METADATA = new <init>("PRECACHE_AD_METADATA", 2);
        PRECACHE_AD_STREAM = new <init>("PRECACHE_AD_STREAM", 3);
        $VALUES = (new .VALUES[] {
            NONE, SIMULATE_AD_LOAD, PRECACHE_AD_METADATA, PRECACHE_AD_STREAM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
