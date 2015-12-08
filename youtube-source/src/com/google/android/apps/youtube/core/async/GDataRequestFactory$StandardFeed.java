// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import java.util.Locale;

public final class Q extends Enum
{

    private static final ON_THE_WEB $VALUES[];
    public static final ON_THE_WEB MOST_DISCUSSED;
    public static final ON_THE_WEB MOST_LINKED;
    public static final ON_THE_WEB MOST_POPULAR;
    public static final ON_THE_WEB MOST_RESPONDED;
    public static final ON_THE_WEB MOST_VIEWED;
    public static final ON_THE_WEB ON_THE_WEB;
    public static final ON_THE_WEB RECENTLY_FEATURED;
    public static final ON_THE_WEB TOP_FAVORITES;
    public static final ON_THE_WEB TOP_RATED;
    public static final ON_THE_WEB WATCH_ON_MOBILE;

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$StandardFeed, s);
    }

    public static Q[] values()
    {
        return (Q[])$VALUES.clone();
    }

    public final String toString()
    {
        return super.toString().toLowerCase(Locale.US);
    }

    static 
    {
        MOST_VIEWED = new <init>("MOST_VIEWED", 0);
        TOP_RATED = new <init>("TOP_RATED", 1);
        MOST_DISCUSSED = new <init>("MOST_DISCUSSED", 2);
        TOP_FAVORITES = new <init>("TOP_FAVORITES", 3);
        MOST_RESPONDED = new <init>("MOST_RESPONDED", 4);
        MOST_POPULAR = new <init>("MOST_POPULAR", 5);
        MOST_LINKED = new <init>("MOST_LINKED", 6);
        RECENTLY_FEATURED = new <init>("RECENTLY_FEATURED", 7);
        WATCH_ON_MOBILE = new <init>("WATCH_ON_MOBILE", 8);
        ON_THE_WEB = new <init>("ON_THE_WEB", 9);
        $VALUES = (new .VALUES[] {
            MOST_VIEWED, TOP_RATED, MOST_DISCUSSED, TOP_FAVORITES, MOST_RESPONDED, MOST_POPULAR, MOST_LINKED, RECENTLY_FEATURED, WATCH_ON_MOBILE, ON_THE_WEB
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
