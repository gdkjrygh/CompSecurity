// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;


// Referenced classes of package com.weather.dal2.locations:
//            CurrentLocationChangeEvent

public static final class A extends Enum
{

    private static final FOLLOW_ME $VALUES[];
    public static final FOLLOW_ME APP_RESTORE;
    public static final FOLLOW_ME CLICK_THRU;
    public static final FOLLOW_ME FOLLOW_ME;
    public static final FOLLOW_ME LOCATION_ADDED;
    public static final FOLLOW_ME LOCATION_DELETED;
    public static final FOLLOW_ME USER_SELECTED;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/weather/dal2/locations/CurrentLocationChangeEvent$Cause, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        APP_RESTORE = new <init>("APP_RESTORE", 0);
        USER_SELECTED = new <init>("USER_SELECTED", 1);
        LOCATION_ADDED = new <init>("LOCATION_ADDED", 2);
        LOCATION_DELETED = new <init>("LOCATION_DELETED", 3);
        CLICK_THRU = new <init>("CLICK_THRU", 4);
        FOLLOW_ME = new <init>("FOLLOW_ME", 5);
        $VALUES = (new .VALUES[] {
            APP_RESTORE, USER_SELECTED, LOCATION_ADDED, LOCATION_DELETED, CLICK_THRU, FOLLOW_ME
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
