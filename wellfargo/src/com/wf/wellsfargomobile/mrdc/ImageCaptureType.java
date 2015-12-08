// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;


public final class ImageCaptureType extends Enum
{

    private static final ImageCaptureType $VALUES[];
    public static final ImageCaptureType INSUFFICIENT_CAMERA;
    public static final ImageCaptureType NONE;
    public static final ImageCaptureType OTHER;
    public static final ImageCaptureType STILL;
    public static final ImageCaptureType USER_CANCELLED;
    public static final ImageCaptureType VIDEO;

    private ImageCaptureType(String s, int i)
    {
        super(s, i);
    }

    public static ImageCaptureType valueOf(String s)
    {
        return (ImageCaptureType)Enum.valueOf(com/wf/wellsfargomobile/mrdc/ImageCaptureType, s);
    }

    public static ImageCaptureType[] values()
    {
        return (ImageCaptureType[])$VALUES.clone();
    }

    static 
    {
        NONE = new ImageCaptureType("NONE", 0);
        VIDEO = new ImageCaptureType("VIDEO", 1);
        STILL = new ImageCaptureType("STILL", 2);
        USER_CANCELLED = new ImageCaptureType("USER_CANCELLED", 3);
        INSUFFICIENT_CAMERA = new ImageCaptureType("INSUFFICIENT_CAMERA", 4);
        OTHER = new ImageCaptureType("OTHER", 5);
        $VALUES = (new ImageCaptureType[] {
            NONE, VIDEO, STILL, USER_CANCELLED, INSUFFICIENT_CAMERA, OTHER
        });
    }
}
