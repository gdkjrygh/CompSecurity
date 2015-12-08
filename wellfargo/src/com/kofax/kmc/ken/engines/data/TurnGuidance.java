// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class TurnGuidance extends Enum
{

    private static final TurnGuidance $VALUES[];
    public static final TurnGuidance TURN_CLOCKWISE;
    public static final TurnGuidance TURN_COUNTER_CLOCKWISE;
    public static final TurnGuidance TURN_OK;

    private TurnGuidance(String s, int i)
    {
        super(s, i);
    }

    public static TurnGuidance valueOf(String s)
    {
        return (TurnGuidance)Enum.valueOf(com/kofax/kmc/ken/engines/data/TurnGuidance, s);
    }

    public static TurnGuidance[] values()
    {
        return (TurnGuidance[])$VALUES.clone();
    }

    static 
    {
        TURN_COUNTER_CLOCKWISE = new TurnGuidance("TURN_COUNTER_CLOCKWISE", 0);
        TURN_CLOCKWISE = new TurnGuidance("TURN_CLOCKWISE", 1);
        TURN_OK = new TurnGuidance("TURN_OK", 2);
        $VALUES = (new TurnGuidance[] {
            TURN_COUNTER_CLOCKWISE, TURN_CLOCKWISE, TURN_OK
        });
    }
}
