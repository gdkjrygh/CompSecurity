// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.android.abc.machine_vision;


public final class m_value extends Enum
{

    private static final BEST_RECTANGLE $VALUES[];
    public static final BEST_RECTANGLE BEST_RECTANGLE;
    public static final BEST_RECTANGLE MICR;
    private int m_value;

    public static m_value valueOf(String s)
    {
        return (m_value)Enum.valueOf(com/kofax/android/abc/machine_vision/CheckGuidance$GuidanceSource, s);
    }

    public static m_value[] values()
    {
        return (m_value[])$VALUES.clone();
    }

    public int value()
    {
        return m_value;
    }

    static 
    {
        MICR = new <init>("MICR", 0, 0);
        BEST_RECTANGLE = new <init>("BEST_RECTANGLE", 1, 1);
        $VALUES = (new .VALUES[] {
            MICR, BEST_RECTANGLE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        m_value = j;
    }
}
