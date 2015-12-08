// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations.adapters.policy;


public final class FollowMePolicy extends Enum
{

    private static final FollowMePolicy $VALUES[];
    public static final FollowMePolicy EXCLUDED;
    public static final FollowMePolicy INCLUDED;

    private FollowMePolicy(String s, int i)
    {
        super(s, i);
    }

    public static FollowMePolicy valueOf(String s)
    {
        return (FollowMePolicy)Enum.valueOf(com/weather/Weather/locations/adapters/policy/FollowMePolicy, s);
    }

    public static FollowMePolicy[] values()
    {
        return (FollowMePolicy[])$VALUES.clone();
    }

    static 
    {
        INCLUDED = new FollowMePolicy("INCLUDED", 0);
        EXCLUDED = new FollowMePolicy("EXCLUDED", 1);
        $VALUES = (new FollowMePolicy[] {
            INCLUDED, EXCLUDED
        });
    }
}
