// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class  extends Enum
{

    private static final FLIP $VALUES[];
    public static final FLIP FLIP;
    public static final FLIP LEFT;
    public static final FLIP RIGHT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/data/BoundingTetragon$Rotation, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LEFT = new <init>("LEFT", 0);
        RIGHT = new <init>("RIGHT", 1);
        FLIP = new <init>("FLIP", 2);
        $VALUES = (new .VALUES[] {
            LEFT, RIGHT, FLIP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
