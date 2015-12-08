// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class  extends Enum
{

    private static final FILE_BUFFERED $VALUES[];
    public static final FILE_BUFFERED FILE_BUFFERED;
    public static final FILE_BUFFERED FILE_NONE;
    public static final FILE_BUFFERED FILE_STORED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$ImageFileRep, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FILE_NONE = new <init>("FILE_NONE", 0);
        FILE_STORED = new <init>("FILE_STORED", 1);
        FILE_BUFFERED = new <init>("FILE_BUFFERED", 2);
        $VALUES = (new .VALUES[] {
            FILE_NONE, FILE_STORED, FILE_BUFFERED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
