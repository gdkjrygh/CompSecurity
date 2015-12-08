// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.ebay.redlasersdk.BarcodeScanActivity;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.List;

// Referenced classes of package RLSDK:
//            f, d, e, k

public class g extends Handler
    implements android.hardware.Camera.AutoFocusCallback, android.hardware.Camera.ErrorCallback, android.hardware.Camera.PictureCallback, android.hardware.Camera.PreviewCallback, android.view.SurfaceHolder.Callback
{

    public static final int FOCUS_STYLE_CONTINUOUS = 3;
    public static final int FOCUS_STYLE_INITIAL = 5;
    public static final int FOCUS_STYLE_OFF = 1;
    public static final int FOCUS_STYLE_POINT = 4;
    public static final int FOCUS_STYLE_REPEATED = 2;
    protected static final String TAG = RLSDK/g.getSimpleName();
    protected static g cameraManager;
    protected Camera camera;
    protected Matrix cameraToPreviewMatrix;
    protected final f configManager = new f();
    protected Display display;
    protected int focusStyle;
    protected d frameEngine;
    protected boolean isAutoFocusing;
    protected boolean isOnTimerForRepeatedAutoFocus;
    protected boolean isTakingPicture;
    protected Context mContext;
    protected FrameLayout mPreviewParentView;
    protected k mPreviewSurface;
    protected boolean mPreviewSurfaceIsAttached;
    protected boolean previewing;
    int relativeCameraOrientation;
    protected BarcodeScanActivity scanActivity;

    protected g(Application application)
    {
        isTakingPicture = false;
        mContext = application;
        application = mContext;
        display = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay();
    }

    public static g get()
    {
        return cameraManager;
    }

    public static void init(Application application)
    {
        if (cameraManager != null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 14) goto _L2; else goto _L1
_L1:
        Class class1 = Class.forName("RLSDK.j");
_L3:
        cameraManager = (g)class1.getDeclaredConstructors()[0].newInstance(new Object[] {
            application
        });
        return;
_L2:
        if (i < 9)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        class1 = Class.forName("RLSDK.i");
          goto _L3
        if (i < 8)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        class1 = Class.forName("RLSDK.h");
          goto _L3
        class1 = Class.forName("RLSDK.g");
          goto _L3
        application;
        application = TAG;
        return;
        application;
        String s = TAG;
        (new StringBuilder("Unknown Exception: ")).append(application.toString()).toString();
    }

    public void addCallbackBuffer(byte abyte0[])
    {
    }

    protected Point calculatePreviewSurfaceSize()
    {
        Object obj = Build.MODEL;
        float f2 = mPreviewParentView.getWidth();
        float f3 = mPreviewParentView.getHeight();
        Point point = configManager.a();
        int i = relativeCameraOrientation;
        float f1;
        float f4;
        float f5;
        if (i == 90 || i == 270)
        {
            f1 = f2;
            f4 = f3;
        } else
        {
            f1 = f3;
            f4 = f2;
        }
        f4 /= point.x;
        f5 = f1 / (float)point.y;
        if (f4 > f5)
        {
            f1 = f4;
        } else
        {
            f1 = f5;
        }
        if (((String) (obj)).equals("HTC VLE_U") || ((String) (obj)).equals("HTC One X") || ((String) (obj)).equals("R800x"))
        {
            if (f4 < f5)
            {
                f1 = f4;
            } else
            {
                f1 = f5;
            }
        }
        cameraToPreviewMatrix = new Matrix();
        cameraToPreviewMatrix.postTranslate(-point.x / 2, -point.y / 2);
        if (isCameraFrontFacing())
        {
            cameraToPreviewMatrix.postScale(-1F, 1.0F);
        }
        cameraToPreviewMatrix.postRotate(i);
        cameraToPreviewMatrix.postScale(f1, f1);
        cameraToPreviewMatrix.postTranslate(f2 / 2.0F, f3 / 2.0F);
        if (((String) (obj)).equalsIgnoreCase("Nexus 7") && (i == 90 || i == 270))
        {
            cameraToPreviewMatrix.postTranslate(0.0F, 75F);
        }
        obj = new RectF(0.0F, 0.0F, point.x, point.y);
        cameraToPreviewMatrix.mapRect(((RectF) (obj)));
        return new Point((int)((RectF) (obj)).width(), (int)((RectF) (obj)).height());
    }

    public Matrix cameraToPreviewMatrix()
    {
        return cameraToPreviewMatrix;
    }

    public void closeDriver(BarcodeScanActivity barcodescanactivity)
    {
        if (barcodescanactivity != scanActivity)
        {
            barcodescanactivity = TAG;
            return;
        }
        if (camera != null)
        {
            camera.release();
            camera = null;
            barcodescanactivity = TAG;
        }
        scanActivity = null;
    }

    protected void determineFocusMode(boolean flag)
    {
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        List list = parameters.getSupportedFocusModes();
        String s = new String();
        if (list.contains("continuous-picture"))
        {
            String s2 = "continuous-picture";
            focusStyle = 3;
            s = s2;
            if (list.contains("macro"))
            {
                s = s2;
                if (flag)
                {
                    s = "macro";
                    focusStyle = 5;
                }
            }
        } else
        if (list.contains("macro"))
        {
            s = "macro";
            focusStyle = 2;
        } else
        if (list.contains("auto"))
        {
            s = "auto";
            focusStyle = 2;
        } else
        {
            focusStyle = 1;
        }
        if (frameEngine != null)
        {
            if (focusStyle == 1)
            {
                frameEngine.a(true);
            } else
            {
                frameEngine.a(false);
            }
        }
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        camera.cancelAutoFocus();
        parameters.setFocusMode(s);
        camera.setParameters(parameters);
        (new StringBuilder("Setting focus mode to ")).append(s).toString();
        return;
        String s1 = TAG;
        return;
        RuntimeException runtimeexception;
        runtimeexception;
    }

    protected void determineOrientation()
    {
        relativeCameraOrientation = 0;
    }

    public Point getCameraResolution()
    {
        Point point = configManager.a();
        if (display.getOrientation() == 0)
        {
            return new Point(point.y, point.x);
        } else
        {
            return point;
        }
    }

    protected int getOpenedCameraIndex()
    {
        return 0;
    }

    public int getSelectedCameraIndex()
    {
        return 0;
    }

    public boolean getTorch()
    {
        String s;
        if (camera != null)
        {
            if ((s = camera.getParameters().getFlashMode()) != null && s.equals("torch"))
            {
                return true;
            }
        }
        return false;
    }

    public void handleMessage(Message message)
    {
        isOnTimerForRepeatedAutoFocus = false;
        if (message.what == 2 && camera != null && previewing && (focusStyle == 2 || focusStyle == 5))
        {
            performAutoFocus();
        }
    }

    protected boolean isCameraFrontFacing()
    {
        return false;
    }

    public boolean isTorchAvailable()
    {
        List list;
        if (camera != null)
        {
            if ((list = camera.getParameters().getSupportedFlashModes()) != null && list.contains("torch"))
            {
                return true;
            }
        }
        return false;
    }

    public void onAutoFocus(boolean flag, Camera camera1)
    {
        isAutoFocusing = false;
        if (focusStyle == 2)
        {
            if (!isOnTimerForRepeatedAutoFocus)
            {
                isOnTimerForRepeatedAutoFocus = true;
                sendEmptyMessageDelayed(2, 1500L);
            }
        } else
        if (focusStyle == 5)
        {
            determineFocusMode(false);
            return;
        }
    }

    public void onError(int i, Camera camera1)
    {
        if (i != 100) goto _L2; else goto _L1
_L1:
        Log.e(TAG, "camera error - server died; instantiating new camera object");
        camera1.release();
        Camera.open();
_L4:
        if (scanActivity != null)
        {
            scanActivity.onCameraError(i);
        }
        return;
_L2:
        if (i == 1)
        {
            Log.e(TAG, "camera error - unknown");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPictureTaken(byte abyte0[], Camera camera1)
    {
        camera1 = TAG;
        if (isTakingPicture)
        {
            frameEngine.a(abyte0);
            startPreview();
            previewing = true;
            isTakingPicture = false;
        }
    }

    public void onPreviewFrame(byte abyte0[], Camera camera1)
    {
        if (frameEngine != null && previewing)
        {
            camera1 = configManager.a();
            frameEngine.a(abyte0, ((Point) (camera1)).x, ((Point) (camera1)).y, relativeCameraOrientation);
        }
    }

    public void onTapEvent(int i, int j)
    {
        if (mPreviewSurfaceIsAttached)
        {
            performAutoFocus();
        }
    }

    protected void openCamera()
        throws IOException
    {
        camera = Camera.open();
        if (camera == null)
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    public void openDriver(BarcodeScanActivity barcodescanactivity, FrameLayout framelayout)
        throws IOException
    {
        if (scanActivity == barcodescanactivity)
        {
            barcodescanactivity = TAG;
        } else
        {
            if (scanActivity != null)
            {
                barcodescanactivity = TAG;
                throw new e("Another BarcodeScanActivity has the camera open.");
            }
            scanActivity = barcodescanactivity;
            barcodescanactivity = TAG;
            if (camera == null)
            {
                try
                {
                    openCamera();
                    camera.setErrorCallback(this);
                    configManager.a(camera);
                    determineOrientation();
                    mPreviewParentView = framelayout;
                    barcodescanactivity = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
                    if (mPreviewSurface != null)
                    {
                        mPreviewSurface.getHolder().removeCallback(this);
                        mPreviewParentView.removeView(mPreviewSurface);
                        mPreviewSurface = null;
                        mPreviewSurfaceIsAttached = false;
                    }
                    mPreviewSurface = new k(mContext);
                    framelayout = mPreviewSurface.getHolder();
                    framelayout.setType(3);
                    mPreviewParentView.addView(mPreviewSurface, barcodescanactivity);
                    framelayout.addCallback(this);
                    if (mPreviewSurface.getHolder().getSurface().isValid())
                    {
                        barcodescanactivity = calculatePreviewSurfaceSize();
                        barcodescanactivity = new android.widget.FrameLayout.LayoutParams(((Point) (barcodescanactivity)).x, ((Point) (barcodescanactivity)).y, 17);
                        mPreviewParentView.updateViewLayout(mPreviewSurface, barcodescanactivity);
                        camera.setPreviewDisplay(mPreviewSurface.getHolder());
                        mPreviewSurfaceIsAttached = true;
                        scanActivity.onCameraPreviewStarted();
                        if (focusStyle == 2 || focusStyle == 5)
                        {
                            performAutoFocus();
                        }
                    }
                    startPreview();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (BarcodeScanActivity barcodescanactivity)
                {
                    scanActivity.onCameraError(1);
                }
                return;
            }
        }
    }

    protected void performAutoFocus()
    {
        Object obj;
        if (camera != null)
        {
            if ((obj = camera.getParameters()) != null && ((obj = ((android.hardware.Camera.Parameters) (obj)).getFocusMode()) != null && (((String) (obj)).equals("macro") || ((String) (obj)).equals("auto")) && !isAutoFocusing))
            {
                try
                {
                    isAutoFocusing = true;
                    camera.autoFocus(this);
                    return;
                }
                catch (Exception exception)
                {
                    isAutoFocusing = false;
                }
                if (!isOnTimerForRepeatedAutoFocus)
                {
                    isOnTimerForRepeatedAutoFocus = true;
                    sendEmptyMessageDelayed(2, 100L);
                    return;
                }
            }
        }
    }

    public Matrix previewToCameraMatix()
    {
        if (cameraToPreviewMatrix == null)
        {
            return null;
        } else
        {
            Matrix matrix = new Matrix();
            cameraToPreviewMatrix.invert(matrix);
            return matrix;
        }
    }

    public void setPreviewFrameHandler(d d1)
    {
        frameEngine = d1;
    }

    public void setSelectedCameraIndex(int i)
    {
    }

    public void setTorch(boolean flag)
    {
        android.hardware.Camera.Parameters parameters;
        List list;
        try
        {
            parameters = camera.getParameters();
            list = parameters.getSupportedFlashModes();
        }
        catch (RuntimeException runtimeexception)
        {
            return;
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (!list.contains("torch"))
        {
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        parameters.setFlashMode("torch");
_L2:
        camera.setParameters(parameters);
        return;
        parameters.setFlashMode("off");
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void startPreview()
    {
        if (camera != null && !previewing)
        {
            previewing = true;
            camera.setPreviewCallback(this);
            camera.startPreview();
            isAutoFocusing = false;
            isOnTimerForRepeatedAutoFocus = false;
            determineFocusMode(true);
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
            camera.setPreviewCallback(null);
            camera.stopPreview();
            return;
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int l)
    {
        surfaceholder = TAG;
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        for (surfaceholder = TAG; camera == null || mPreviewSurfaceIsAttached;)
        {
            return;
        }

        mPreviewSurfaceIsAttached = true;
        try
        {
            surfaceholder = calculatePreviewSurfaceSize();
            surfaceholder = new android.widget.FrameLayout.LayoutParams(((Point) (surfaceholder)).x, ((Point) (surfaceholder)).y, 17);
            mPreviewParentView.updateViewLayout(mPreviewSurface, surfaceholder);
            if (camera != null)
            {
                camera.setPreviewDisplay(mPreviewSurface.getHolder());
            }
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            surfaceholder.printStackTrace();
        }
        if (focusStyle == 2 || focusStyle == 5)
        {
            performAutoFocus();
        }
        scanActivity.onCameraPreviewStarted();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        mPreviewSurfaceIsAttached = false;
    }

    public void takePicture()
    {
        Object obj;
        obj = TAG;
        if (camera == null || isTakingPicture)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = camera.getParameters();
        if (!((android.hardware.Camera.Parameters) (obj)).getSupportedPictureFormats().contains(Integer.valueOf(256)))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ((android.hardware.Camera.Parameters) (obj)).setPictureFormat(256);
        ((android.hardware.Camera.Parameters) (obj)).setJpegQuality(80);
        camera.setParameters(((android.hardware.Camera.Parameters) (obj)));
        previewing = false;
        isTakingPicture = true;
        camera.takePicture(null, null, this);
        camera.setPreviewCallback(null);
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.e(TAG, "Not taking picture because camera.setParameters failed.");
        return;
    }

}
