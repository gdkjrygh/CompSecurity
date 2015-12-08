// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class  extends Enum
{

    private static final IMAGE_REP_BOTH $VALUES[];
    public static final IMAGE_REP_BOTH IMAGE_REP_BITMAP;
    public static final IMAGE_REP_BOTH IMAGE_REP_BOTH;
    public static final IMAGE_REP_BOTH IMAGE_REP_FILE;
    public static final IMAGE_REP_BOTH IMAGE_REP_NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$ImageRep, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IMAGE_REP_NONE = new <init>("IMAGE_REP_NONE", 0);
        IMAGE_REP_BITMAP = new <init>("IMAGE_REP_BITMAP", 1);
        IMAGE_REP_FILE = new <init>("IMAGE_REP_FILE", 2);
        IMAGE_REP_BOTH = new <init>("IMAGE_REP_BOTH", 3);
        $VALUES = (new .VALUES[] {
            IMAGE_REP_NONE, IMAGE_REP_BITMAP, IMAGE_REP_FILE, IMAGE_REP_BOTH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
