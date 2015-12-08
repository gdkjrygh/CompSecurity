// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.youtube.p;

public final class stringId extends Enum
{

    private static final TOP_FAVORITED $VALUES[];
    public static final TOP_FAVORITED MOST_DISCUSSED;
    public static final TOP_FAVORITED MOST_VIEWED;
    public static final TOP_FAVORITED TOP_FAVORITED;
    public static final TOP_FAVORITED TOP_RATED;
    public final TOP_FAVORITED feed;
    public final int stringId;

    public static stringId valueOf(String s)
    {
        return (stringId)Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$StatisticFilter, s);
    }

    public static stringId[] values()
    {
        return (stringId[])$VALUES.clone();
    }

    static 
    {
        MOST_VIEWED = new <init>("MOST_VIEWED", 0, T_VIEWED, p.fH);
        TOP_RATED = new <init>("TOP_RATED", 1, _RATED, p.fJ);
        MOST_DISCUSSED = new <init>("MOST_DISCUSSED", 2, T_DISCUSSED, p.fG);
        TOP_FAVORITED = new <init>("TOP_FAVORITED", 3, _FAVORITES, p.fI);
        $VALUES = (new .VALUES[] {
            MOST_VIEWED, TOP_RATED, MOST_DISCUSSED, TOP_FAVORITED
        });
    }

    private (String s, int i,  , int j)
    {
        super(s, i);
        feed = ;
        stringId = j;
    }
}
