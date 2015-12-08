// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class CheckSide extends Enum
{

    private static final CheckSide $VALUES[];
    public static final CheckSide BACK;
    public static final CheckSide FRONT;
    public static final CheckSide NONE;

    private CheckSide(String s, int i)
    {
        super(s, i);
    }

    public static CheckSide valueOf(String s)
    {
        return (CheckSide)Enum.valueOf(com/kofax/kmc/ken/engines/data/CheckSide, s);
    }

    public static CheckSide[] values()
    {
        return (CheckSide[])$VALUES.clone();
    }

    static 
    {
        FRONT = new CheckSide("FRONT", 0);
        BACK = new CheckSide("BACK", 1);
        NONE = new CheckSide("NONE", 2);
        $VALUES = (new CheckSide[] {
            FRONT, BACK, NONE
        });
    }
}
