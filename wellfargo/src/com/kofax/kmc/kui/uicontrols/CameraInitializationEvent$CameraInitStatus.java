// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


public final class  extends Enum
{

    public static final CAMERA_USE_VIDEO_FRAME_CHANGED CAMERA_IMAGE_RESOLUTION_CHANGED;
    public static final CAMERA_USE_VIDEO_FRAME_CHANGED CAMERA_STATUS_UNKNOWN;
    public static final CAMERA_USE_VIDEO_FRAME_CHANGED CAMERA_USE_VIDEO_FRAME_CHANGED;
    public static final CAMERA_USE_VIDEO_FRAME_CHANGED CAMERA_VIEW_CREATED;
    private static final CAMERA_USE_VIDEO_FRAME_CHANGED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kui/uicontrols/CameraInitializationEvent$CameraInitStatus, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        CAMERA_STATUS_UNKNOWN = new <init>("CAMERA_STATUS_UNKNOWN", 0);
        CAMERA_VIEW_CREATED = new <init>("CAMERA_VIEW_CREATED", 1);
        CAMERA_IMAGE_RESOLUTION_CHANGED = new <init>("CAMERA_IMAGE_RESOLUTION_CHANGED", 2);
        CAMERA_USE_VIDEO_FRAME_CHANGED = new <init>("CAMERA_USE_VIDEO_FRAME_CHANGED", 3);
        a = (new a[] {
            CAMERA_STATUS_UNKNOWN, CAMERA_VIEW_CREATED, CAMERA_IMAGE_RESOLUTION_CHANGED, CAMERA_USE_VIDEO_FRAME_CHANGED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
