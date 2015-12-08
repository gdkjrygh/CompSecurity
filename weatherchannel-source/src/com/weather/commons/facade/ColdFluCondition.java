// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;


public final class ColdFluCondition extends Enum
{

    private static final ColdFluCondition $VALUES[];
    public static final ColdFluCondition LOCAL;
    public static final ColdFluCondition NONE;
    public static final ColdFluCondition REGIONAL;
    public static final ColdFluCondition SPORADIC;
    public static final ColdFluCondition WIDESPREAD;
    private final String condition;

    private ColdFluCondition(String s, int i, String s1)
    {
        super(s, i);
        condition = s1;
    }

    public static ColdFluCondition valueOf(String s)
    {
        return (ColdFluCondition)Enum.valueOf(com/weather/commons/facade/ColdFluCondition, s);
    }

    public static ColdFluCondition[] values()
    {
        return (ColdFluCondition[])$VALUES.clone();
    }

    public String getCondition()
    {
        return condition;
    }

    static 
    {
        WIDESPREAD = new ColdFluCondition("WIDESPREAD", 0, "Widespread");
        REGIONAL = new ColdFluCondition("REGIONAL", 1, "Regional");
        LOCAL = new ColdFluCondition("LOCAL", 2, "Local Activity");
        SPORADIC = new ColdFluCondition("SPORADIC", 3, "Sporadic");
        NONE = new ColdFluCondition("NONE", 4, "No Activity");
        $VALUES = (new ColdFluCondition[] {
            WIDESPREAD, REGIONAL, LOCAL, SPORADIC, NONE
        });
    }
}
