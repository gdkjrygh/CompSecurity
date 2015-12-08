// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


final class  extends Enum
{

    private static final IMAGE_REP_BOTH_BUFFERED $VALUES[];
    public static final IMAGE_REP_BOTH_BUFFERED IMAGE_REP_BITMAP_NONE;
    public static final IMAGE_REP_BOTH_BUFFERED IMAGE_REP_BOTH_BUFFERED;
    public static final IMAGE_REP_BOTH_BUFFERED IMAGE_REP_BOTH_STORED;
    public static final IMAGE_REP_BOTH_BUFFERED IMAGE_REP_FILE_BUFFERED;
    public static final IMAGE_REP_BOTH_BUFFERED IMAGE_REP_FILE_STORED;
    public static final IMAGE_REP_BOTH_BUFFERED IMAGE_REP_NONE_NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$BitmapSerialization, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IMAGE_REP_NONE_NONE = new <init>("IMAGE_REP_NONE_NONE", 0);
        IMAGE_REP_FILE_STORED = new <init>("IMAGE_REP_FILE_STORED", 1);
        IMAGE_REP_FILE_BUFFERED = new <init>("IMAGE_REP_FILE_BUFFERED", 2);
        IMAGE_REP_BITMAP_NONE = new <init>("IMAGE_REP_BITMAP_NONE", 3);
        IMAGE_REP_BOTH_STORED = new <init>("IMAGE_REP_BOTH_STORED", 4);
        IMAGE_REP_BOTH_BUFFERED = new <init>("IMAGE_REP_BOTH_BUFFERED", 5);
        $VALUES = (new .VALUES[] {
            IMAGE_REP_NONE_NONE, IMAGE_REP_FILE_STORED, IMAGE_REP_FILE_BUFFERED, IMAGE_REP_BITMAP_NONE, IMAGE_REP_BOTH_STORED, IMAGE_REP_BOTH_BUFFERED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
