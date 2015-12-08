// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class  extends Enum
{

    private static final ROTATE_AUTO $VALUES[];
    public static final ROTATE_AUTO ROTATE_180;
    public static final ROTATE_AUTO ROTATE_270;
    public static final ROTATE_AUTO ROTATE_90;
    public static final ROTATE_AUTO ROTATE_AUTO;
    public static final ROTATE_AUTO ROTATE_NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/data/BasicSettingsProfile$RotateType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ROTATE_NONE = new <init>("ROTATE_NONE", 0);
        ROTATE_90 = new <init>("ROTATE_90", 1);
        ROTATE_180 = new <init>("ROTATE_180", 2);
        ROTATE_270 = new <init>("ROTATE_270", 3);
        ROTATE_AUTO = new <init>("ROTATE_AUTO", 4);
        $VALUES = (new .VALUES[] {
            ROTATE_NONE, ROTATE_90, ROTATE_180, ROTATE_270, ROTATE_AUTO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
