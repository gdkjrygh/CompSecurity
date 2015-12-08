// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class HorizontalGuidance extends Enum
{

    private static final HorizontalGuidance $VALUES[];
    public static final HorizontalGuidance HORIZONTAL_MOVE_LEFT;
    public static final HorizontalGuidance HORIZONTAL_MOVE_OK;
    public static final HorizontalGuidance HORIZONTAL_MOVE_RIGHT;

    private HorizontalGuidance(String s, int i)
    {
        super(s, i);
    }

    public static HorizontalGuidance valueOf(String s)
    {
        return (HorizontalGuidance)Enum.valueOf(com/kofax/kmc/ken/engines/data/HorizontalGuidance, s);
    }

    public static HorizontalGuidance[] values()
    {
        return (HorizontalGuidance[])$VALUES.clone();
    }

    static 
    {
        HORIZONTAL_MOVE_LEFT = new HorizontalGuidance("HORIZONTAL_MOVE_LEFT", 0);
        HORIZONTAL_MOVE_RIGHT = new HorizontalGuidance("HORIZONTAL_MOVE_RIGHT", 1);
        HORIZONTAL_MOVE_OK = new HorizontalGuidance("HORIZONTAL_MOVE_OK", 2);
        $VALUES = (new HorizontalGuidance[] {
            HORIZONTAL_MOVE_LEFT, HORIZONTAL_MOVE_RIGHT, HORIZONTAL_MOVE_OK
        });
    }
}
