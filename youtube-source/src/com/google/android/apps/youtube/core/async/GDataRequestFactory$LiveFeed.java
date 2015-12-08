// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import java.util.Locale;

public final class  extends Enum
{

    private static final RECENTLY_BROADCASTED $VALUES[];
    public static final RECENTLY_BROADCASTED FEATURED;
    public static final RECENTLY_BROADCASTED LIVE_NOW;
    public static final RECENTLY_BROADCASTED RECENTLY_BROADCASTED;
    public static final RECENTLY_BROADCASTED UPCOMING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$LiveFeed, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final String toString()
    {
        return super.toString().toLowerCase(Locale.US);
    }

    static 
    {
        FEATURED = new <init>("FEATURED", 0);
        LIVE_NOW = new <init>("LIVE_NOW", 1);
        UPCOMING = new <init>("UPCOMING", 2);
        RECENTLY_BROADCASTED = new <init>("RECENTLY_BROADCASTED", 3);
        $VALUES = (new .VALUES[] {
            FEATURED, LIVE_NOW, UPCOMING, RECENTLY_BROADCASTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
