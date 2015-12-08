// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.app.Application;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import com.ebay.redlasersdk.BarcodeScanActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package RLSDK:
//            g, f, d

public class h extends g
{

    protected boolean captureJpegOfNextPreviewFrame;
    protected ArrayList previewBuffers;

    protected h(Application application)
    {
        super(application);
        previewBuffers = new ArrayList();
    }

    public void addCallbackBuffer(byte abyte0[])
    {
        if (previewing)
        {
            camera.addCallbackBuffer(abyte0);
        }
    }

    protected void determineOrientation()
    {
        relativeCameraOrientation = 90;
        if (scanActivity.getOrientationSetting().equals("orientationLandscape"))
        {
            relativeCameraOrientation = 0;
        }
    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        super.onPreviewFrame(abyte0, camera);
        Object obj = configManager.a();
        if (previewBuffers.size() < 4)
        {
            byte abyte1[] = new byte[(((Point) (obj)).x * ((Point) (obj)).y * 3) / 2];
            camera.addCallbackBuffer(abyte1);
            camera = TAG;
            (new StringBuilder("Allocating buffer ")).append(previewBuffers.size()).append(".").toString();
            previewBuffers.add(abyte1);
        }
        if (captureJpegOfNextPreviewFrame)
        {
            captureJpegOfNextPreviewFrame = false;
            abyte0 = new YuvImage(abyte0, 17, ((Point) (obj)).x, ((Point) (obj)).y, null);
            camera = new Rect(0, 0, ((Point) (obj)).x, ((Point) (obj)).y);
            obj = new ByteArrayOutputStream();
            if (abyte0.compressToJpeg(camera, 80, ((java.io.OutputStream) (obj))))
            {
                frameEngine.a(((ByteArrayOutputStream) (obj)).toByteArray());
            }
        }
    }

    protected void openCamera()
        throws IOException
    {
        camera = Camera.open();
        if (camera == null)
        {
            throw new IOException();
        }
        if (scanActivity.getOrientationSetting().equals("orientationLandscape"))
        {
            camera.setDisplayOrientation(0);
            return;
        } else
        {
            camera.setDisplayOrientation(90);
            return;
        }
    }

    protected void startPreview()
    {
        String s = TAG;
        if (camera != null && !previewing)
        {
            previewing = true;
            previewBuffers.clear();
            captureJpegOfNextPreviewFrame = false;
            camera.setPreviewCallbackWithBuffer(this);
            camera.startPreview();
            Object obj = TAG;
            isAutoFocusing = false;
            isOnTimerForRepeatedAutoFocus = false;
            determineFocusMode(true);
            obj = configManager.a();
            int i = ((Point) (obj)).x;
            byte abyte0[] = new byte[(((Point) (obj)).y * i * 3) / 2];
            previewBuffers.add(abyte0);
            camera.addCallbackBuffer(abyte0);
            abyte0 = TAG;
        }
    }

    public void stopPreview(BarcodeScanActivity barcodescanactivity)
    {
        if (barcodescanactivity != scanActivity)
        {
            barcodescanactivity = TAG;
        } else
        if (camera != null && previewing)
        {
            previewing = false;
            camera.setPreviewCallbackWithBuffer(null);
            camera.stopPreview();
            previewBuffers.clear();
            return;
        }
    }

    public void takePicture()
    {
        if (previewing)
        {
            captureJpegOfNextPreviewFrame = true;
        }
    }
}
