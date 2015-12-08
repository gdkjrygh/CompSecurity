// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import java.util.EnumSet;

public final class PointerId extends Enum
{

    private static final PointerId $VALUES[];
    public static final PointerId CURRENT;
    public static final PointerId HOME;
    public static final PointerId NOTIFICATION1;
    public static final PointerId NOTIFICATION2;
    public static final PointerId SCHOOL;
    public static final PointerId WORK;
    public static final EnumSet WORK_SCHOOL_HOME;
    private final LocationChange.Flags flag;

    private PointerId(String s, int i, LocationChange.Flags flags)
    {
        super(s, i);
        flag = flags;
    }

    public static PointerId valueOf(String s)
    {
        return (PointerId)Enum.valueOf(com/weather/dal/locations/PointerId, s);
    }

    public static PointerId[] values()
    {
        return (PointerId[])$VALUES.clone();
    }

    public LocationChange.Flags getFlag()
    {
        return flag;
    }

    static 
    {
        HOME = new PointerId("HOME", 0, LocationChange.Flags.HOME);
        WORK = new PointerId("WORK", 1, LocationChange.Flags.WORK);
        SCHOOL = new PointerId("SCHOOL", 2, LocationChange.Flags.SCHOOL);
        CURRENT = new PointerId("CURRENT", 3, LocationChange.Flags.CURRENT);
        NOTIFICATION1 = new PointerId("NOTIFICATION1", 4, LocationChange.Flags.NOTIFICATION_CHANGE);
        NOTIFICATION2 = new PointerId("NOTIFICATION2", 5, LocationChange.Flags.NOTIFICATION_CHANGE);
        $VALUES = (new PointerId[] {
            HOME, WORK, SCHOOL, CURRENT, NOTIFICATION1, NOTIFICATION2
        });
        WORK_SCHOOL_HOME = EnumSet.of(WORK, SCHOOL, HOME);
    }
}
