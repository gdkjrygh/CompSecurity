// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;

public final class value extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN RANDOMIZE;
    public static final UNKNOWN RANDOMLY_REVERSE;
    public static final UNKNOWN SORTED;
    public static final UNKNOWN UNKNOWN;
    private final int value;

    public static value fromValue(int i)
    {
        value avalue[] = values();
        int k = avalue.length;
        for (int j = 0; j < k; j++)
        {
            value value1 = avalue[j];
            if (value1.value == i)
            {
                return value1;
            }
        }

        return UNKNOWN;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/SurveyQuestion$RandomizeOptions, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        RANDOMIZE = new <init>("RANDOMIZE", 0, 0);
        RANDOMLY_REVERSE = new <init>("RANDOMLY_REVERSE", 1, 1);
        SORTED = new <init>("SORTED", 2, 2);
        UNKNOWN = new <init>("UNKNOWN", 3, -1);
        $VALUES = (new .VALUES[] {
            RANDOMIZE, RANDOMLY_REVERSE, SORTED, UNKNOWN
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = ((Integer)c.a(Integer.valueOf(j))).intValue();
    }
}
