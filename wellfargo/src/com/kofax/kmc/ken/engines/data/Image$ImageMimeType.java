// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class  extends Enum
{

    private static final MIMETYPE_UNKNOWN $VALUES[];
    public static final MIMETYPE_UNKNOWN MIMETYPE_JPEG;
    public static final MIMETYPE_UNKNOWN MIMETYPE_PNG;
    public static final MIMETYPE_UNKNOWN MIMETYPE_TIFF;
    public static final MIMETYPE_UNKNOWN MIMETYPE_UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$ImageMimeType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MIMETYPE_JPEG = new <init>("MIMETYPE_JPEG", 0);
        MIMETYPE_PNG = new <init>("MIMETYPE_PNG", 1);
        MIMETYPE_TIFF = new <init>("MIMETYPE_TIFF", 2);
        MIMETYPE_UNKNOWN = new <init>("MIMETYPE_UNKNOWN", 3);
        $VALUES = (new .VALUES[] {
            MIMETYPE_JPEG, MIMETYPE_PNG, MIMETYPE_TIFF, MIMETYPE_UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
