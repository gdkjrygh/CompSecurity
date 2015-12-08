// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;


public final class value extends Enum
{

    private static final CMT $VALUES[];
    public static final CMT C;
    public static final CMT CMT;
    public static final CMT CONN;
    public static final CMT CPN;
    public static final CMT MS;
    public static final CMT NO_OP;
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

        return NO_OP;
    }

    public static NO_OP valueOf(String s)
    {
        return (NO_OP)Enum.valueOf(com/google/android/apps/youtube/datalib/innertube/model/TrackingUrl$ClientParam, s);
    }

    public static NO_OP[] values()
    {
        return (NO_OP[])$VALUES.clone();
    }

    static 
    {
        MS = new <init>("MS", 0, -2);
        NO_OP = new <init>("NO_OP", 1, -1);
        C = new <init>("C", 2, 1);
        CPN = new <init>("CPN", 3, 2);
        CONN = new <init>("CONN", 4, 8);
        CMT = new <init>("CMT", 5, 10);
        $VALUES = (new .VALUES[] {
            MS, NO_OP, C, CPN, CONN, CMT
        });
    }


    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
