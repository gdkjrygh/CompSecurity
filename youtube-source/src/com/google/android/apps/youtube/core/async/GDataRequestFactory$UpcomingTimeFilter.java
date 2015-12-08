// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.youtube.p;

public final class stringId extends Enum
{

    private static final NEXT_7_DAYS $VALUES[];
    public static final NEXT_7_DAYS NEXT_24_HOURS;
    public static final NEXT_7_DAYS NEXT_7_DAYS;
    public static final String PARAM_NAME = "upcoming";
    public final String filterTerm;
    public final int stringId;

    public static stringId valueOf(String s)
    {
        return (stringId)Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$UpcomingTimeFilter, s);
    }

    public static stringId[] values()
    {
        return (stringId[])$VALUES.clone();
    }

    public final String toString()
    {
        return filterTerm;
    }

    static 
    {
        NEXT_24_HOURS = new <init>("NEXT_24_HOURS", 0, "today", p.gc);
        NEXT_7_DAYS = new <init>("NEXT_7_DAYS", 1, "this_week", p.gd);
        $VALUES = (new .VALUES[] {
            NEXT_24_HOURS, NEXT_7_DAYS
        });
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        filterTerm = s1;
        stringId = j;
    }
}
