// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;


public final class ImageModeType extends Enum
{

    private static final ImageModeType $VALUES[];
    public static final ImageModeType FRONT;
    public static final ImageModeType REAR;

    private ImageModeType(String s, int i)
    {
        super(s, i);
    }

    public static ImageModeType valueOf(String s)
    {
        return (ImageModeType)Enum.valueOf(com/wf/wellsfargomobile/mrdc/ImageModeType, s);
    }

    public static ImageModeType[] values()
    {
        return (ImageModeType[])$VALUES.clone();
    }

    static 
    {
        FRONT = new ImageModeType("FRONT", 0);
        REAR = new ImageModeType("REAR", 1);
        $VALUES = (new ImageModeType[] {
            FRONT, REAR
        });
    }
}
