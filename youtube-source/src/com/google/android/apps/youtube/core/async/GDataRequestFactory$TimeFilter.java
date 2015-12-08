// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.youtube.p;
import java.util.Locale;

public final class stringId extends Enum
{

    private static final ALL_TIME $VALUES[];
    public static final ALL_TIME ALL_TIME;
    public static final String PARAM_NAME = "time";
    public static final ALL_TIME THIS_MONTH;
    public static final ALL_TIME THIS_WEEK;
    public static final ALL_TIME TODAY;
    public final int stringId;

    public static stringId valueOf(String s)
    {
        return (stringId)Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$TimeFilter, s);
    }

    public static stringId[] values()
    {
        return (stringId[])$VALUES.clone();
    }

    public final String toString()
    {
        return super.toString().toLowerCase(Locale.US);
    }

    static 
    {
        TODAY = new <init>("TODAY", 0, p.gg);
        THIS_WEEK = new <init>("THIS_WEEK", 1, p.gf);
        THIS_MONTH = new <init>("THIS_MONTH", 2, p.ge);
        ALL_TIME = new <init>("ALL_TIME", 3, p.gb);
        $VALUES = (new .VALUES[] {
            TODAY, THIS_WEEK, THIS_MONTH, ALL_TIME
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        stringId = j;
    }
}
