// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class  extends Enum
{

    private static final CROP_QUICKANALYSIS $VALUES[];
    public static final CROP_QUICKANALYSIS CROP_AUTO;
    public static final CROP_QUICKANALYSIS CROP_NONE;
    public static final CROP_QUICKANALYSIS CROP_QUICKANALYSIS;
    public static final CROP_QUICKANALYSIS CROP_TETRAGON;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/data/BasicSettingsProfile$CropType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CROP_NONE = new <init>("CROP_NONE", 0);
        CROP_AUTO = new <init>("CROP_AUTO", 1);
        CROP_TETRAGON = new <init>("CROP_TETRAGON", 2);
        CROP_QUICKANALYSIS = new <init>("CROP_QUICKANALYSIS", 3);
        $VALUES = (new .VALUES[] {
            CROP_NONE, CROP_AUTO, CROP_TETRAGON, CROP_QUICKANALYSIS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
