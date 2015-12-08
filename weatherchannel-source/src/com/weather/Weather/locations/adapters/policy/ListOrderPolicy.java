// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations.adapters.policy;


public final class ListOrderPolicy extends Enum
{

    private static final ListOrderPolicy $VALUES[];
    public static final ListOrderPolicy CHANGEABLE;
    public static final ListOrderPolicy FIXED;

    private ListOrderPolicy(String s, int i)
    {
        super(s, i);
    }

    public static ListOrderPolicy valueOf(String s)
    {
        return (ListOrderPolicy)Enum.valueOf(com/weather/Weather/locations/adapters/policy/ListOrderPolicy, s);
    }

    public static ListOrderPolicy[] values()
    {
        return (ListOrderPolicy[])$VALUES.clone();
    }

    static 
    {
        CHANGEABLE = new ListOrderPolicy("CHANGEABLE", 0);
        FIXED = new ListOrderPolicy("FIXED", 1);
        $VALUES = (new ListOrderPolicy[] {
            CHANGEABLE, FIXED
        });
    }
}
