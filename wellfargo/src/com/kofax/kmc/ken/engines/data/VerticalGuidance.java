// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class VerticalGuidance extends Enum
{

    private static final VerticalGuidance $VALUES[];
    public static final VerticalGuidance VERTICAL_MOVE_DOWN;
    public static final VerticalGuidance VERTICAL_MOVE_OK;
    public static final VerticalGuidance VERTICAL_MOVE_UP;

    private VerticalGuidance(String s, int i)
    {
        super(s, i);
    }

    public static VerticalGuidance valueOf(String s)
    {
        return (VerticalGuidance)Enum.valueOf(com/kofax/kmc/ken/engines/data/VerticalGuidance, s);
    }

    public static VerticalGuidance[] values()
    {
        return (VerticalGuidance[])$VALUES.clone();
    }

    static 
    {
        VERTICAL_MOVE_UP = new VerticalGuidance("VERTICAL_MOVE_UP", 0);
        VERTICAL_MOVE_DOWN = new VerticalGuidance("VERTICAL_MOVE_DOWN", 1);
        VERTICAL_MOVE_OK = new VerticalGuidance("VERTICAL_MOVE_OK", 2);
        $VALUES = (new VerticalGuidance[] {
            VERTICAL_MOVE_UP, VERTICAL_MOVE_DOWN, VERTICAL_MOVE_OK
        });
    }
}
