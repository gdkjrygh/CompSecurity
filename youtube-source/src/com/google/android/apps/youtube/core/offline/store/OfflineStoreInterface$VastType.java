// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.util.SparseArray;

public final class value extends Enum
{

    private static final value $VALUES[];
    public static final value EMPTY;
    public static final value FORECASTING;
    public static final value FULL;
    static final SparseArray lookup;
    private final int value;

    public static value fromValue(int i)
    {
        return (value)lookup.get(i);
    }

    public static lookup valueOf(String s)
    {
        return (lookup)Enum.valueOf(com/google/android/apps/youtube/core/offline/store/OfflineStoreInterface$VastType, s);
    }

    public static lookup[] values()
    {
        return (lookup[])$VALUES.clone();
    }

    public final int value()
    {
        return value;
    }

    static 
    {
        int i = 0;
        EMPTY = new <init>("EMPTY", 0, 0);
        FORECASTING = new <init>("FORECASTING", 1, 1);
        FULL = new <init>("FULL", 2, 2);
        $VALUES = (new .VALUES[] {
            EMPTY, FORECASTING, FULL
        });
        lookup = new SparseArray();
        value avalue[] = values();
        for (int j = avalue.length; i < j; i++)
        {
            value value1 = avalue[i];
            lookup.put(value1.value, value1);
        }

    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
