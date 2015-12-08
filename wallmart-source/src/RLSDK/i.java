// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.view.Display;
import android.view.WindowManager;
import java.io.IOException;

// Referenced classes of package RLSDK:
//            h, f

public class i extends h
{

    android.hardware.Camera.CameraInfo info;
    int openedCameraIndex;
    int selectedCameraIndex;

    protected i(Application application)
    {
        super(application);
        selectedCameraIndex = 0;
        info = new android.hardware.Camera.CameraInfo();
    }

    protected void determineOrientation()
    {
        Display display;
        boolean flag1;
        flag1 = false;
        Camera.getCameraInfo(openedCameraIndex, info);
        display = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay();
        display.getRotation();
        JVM INSTR tableswitch 0 3: default 68
    //                   0 231
    //                   1 236
    //                   2 242
    //                   3 249;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_249;
_L1:
        int j = 0;
_L6:
        if (info.orientation == 0)
        {
            Point point = configManager.a();
            boolean flag;
            boolean flag2;
            if (point.x > point.y)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (display.getWidth() > display.getHeight())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j == 90 || j == 270)
            {
                if (!flag)
                {
                    flag1 = true;
                }
            } else
            {
                flag1 = flag;
            }
            if (flag2 != flag1)
            {
                if (info.facing == 1)
                {
                    info.orientation = 270;
                } else
                {
                    info.orientation = 90;
                }
            }
        }
        relativeCameraOrientation = info.orientation - j;
        if (info.facing == 1)
        {
            relativeCameraOrientation = -info.orientation - j;
        }
        relativeCameraOrientation = (relativeCameraOrientation + 360) % 360;
        camera.setDisplayOrientation(relativeCameraOrientation);
        return;
_L2:
        j = 0;
          goto _L6
_L3:
        j = 90;
          goto _L6
_L4:
        j = 180;
          goto _L6
        j = 270;
          goto _L6
    }

    protected int getOpenedCameraIndex()
    {
        return openedCameraIndex;
    }

    public int getSelectedCameraIndex()
    {
        return selectedCameraIndex;
    }

    protected boolean isCameraFrontFacing()
    {
        Camera.getCameraInfo(openedCameraIndex, info);
        return info.facing == 1;
    }

    protected void openCamera()
        throws IOException
    {
        try
        {
            camera = Camera.open(selectedCameraIndex);
            openedCameraIndex = selectedCameraIndex;
        }
        catch (RuntimeException runtimeexception)
        {
            try
            {
                camera = Camera.open(0);
                openedCameraIndex = 0;
            }
            catch (Exception exception) { }
        }
        if (camera == null)
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    public void setSelectedCameraIndex(int j)
    {
        if (j < Camera.getNumberOfCameras())
        {
            selectedCameraIndex = j;
        }
    }
}
