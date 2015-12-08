// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import java.util.EventObject;

public class CameraInitializationEvent extends EventObject
{

    private static final long serialVersionUID = 1L;
    private android.hardware.Camera.Size a;
    private CameraInitStatus b;

    public CameraInitializationEvent(Object obj, android.hardware.Camera.Size size, CameraInitStatus camerainitstatus)
    {
        super(obj);
        b = CameraInitStatus.CAMERA_STATUS_UNKNOWN;
        a = size;
        b = camerainitstatus;
    }

    public final CameraInitStatus getCameraInitStatus()
    {
        return b;
    }

    public final android.hardware.Camera.Size getDefaultImageResolution()
    {
        return a;
    }

    private class CameraInitStatus extends Enum
    {

        public static final CameraInitStatus CAMERA_IMAGE_RESOLUTION_CHANGED;
        public static final CameraInitStatus CAMERA_STATUS_UNKNOWN;
        public static final CameraInitStatus CAMERA_USE_VIDEO_FRAME_CHANGED;
        public static final CameraInitStatus CAMERA_VIEW_CREATED;
        private static final CameraInitStatus a[];

        public static CameraInitStatus valueOf(String s)
        {
            return (CameraInitStatus)Enum.valueOf(com/kofax/kmc/kui/uicontrols/CameraInitializationEvent$CameraInitStatus, s);
        }

        public static CameraInitStatus[] values()
        {
            return (CameraInitStatus[])a.clone();
        }

        static 
        {
            CAMERA_STATUS_UNKNOWN = new CameraInitStatus("CAMERA_STATUS_UNKNOWN", 0);
            CAMERA_VIEW_CREATED = new CameraInitStatus("CAMERA_VIEW_CREATED", 1);
            CAMERA_IMAGE_RESOLUTION_CHANGED = new CameraInitStatus("CAMERA_IMAGE_RESOLUTION_CHANGED", 2);
            CAMERA_USE_VIDEO_FRAME_CHANGED = new CameraInitStatus("CAMERA_USE_VIDEO_FRAME_CHANGED", 3);
            a = (new CameraInitStatus[] {
                CAMERA_STATUS_UNKNOWN, CAMERA_VIEW_CREATED, CAMERA_IMAGE_RESOLUTION_CHANGED, CAMERA_USE_VIDEO_FRAME_CHANGED
            });
        }

        private CameraInitStatus(String s, int i)
        {
            super(s, i);
        }
    }

}
