// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.card.payment:
//            CardIOActivity, v, h

class CardScanner
    implements android.hardware.Camera.AutoFocusCallback, android.hardware.Camera.PreviewCallback, android.view.SurfaceHolder.Callback
{

    private static boolean b;
    private static boolean p;
    private static boolean q;
    private Bitmap a;
    private WeakReference c;
    private boolean d;
    private int e;
    private boolean f;
    private long g;
    private long h;
    private Camera i;
    private byte j[];
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    CardScanner(CardIOActivity cardioactivity, int i1)
    {
        d = false;
        e = 1;
        f = true;
        g = 0L;
        h = 0L;
        i = null;
        k = true;
        l = false;
        Intent intent = cardioactivity.getIntent();
        if (intent != null)
        {
            intent.getBooleanExtra("io.card.payment.suppressScan", false);
            d = false;
        }
        c = new WeakReference(cardioactivity);
        e = i1;
        nSetup(d, 6F);
    }

    static boolean a()
    {
        return !b && (nUseNeon() || nUseTegra());
    }

    private Camera b(int i1, int j1)
    {
        long l1 = System.currentTimeMillis();
        if (!k) goto _L2; else goto _L1
_L1:
        i1 = j1;
_L3:
        Camera camera = Camera.open();
        return camera;
        Object obj;
        obj;
        Log.w("card.io", "Wasn't able to connect to camera service. Waiting and trying again...");
        Thread.sleep(50L);
        j1 = i1;
_L4:
        i1 = j1;
        if (System.currentTimeMillis() - l1 < (long)j1) goto _L3; else goto _L2
_L2:
        Log.w("CardScanner", "camera connect timeout");
        return null;
        obj;
        Log.e("card.io", "Interrupted while waiting for camera", ((Throwable) (obj)));
        j1 = i1;
          goto _L4
        obj;
        Log.e("card.io", "Unexpected exception. Please report it to support@card.io", ((Throwable) (obj)));
        j1 = 0;
          goto _L4
    }

    private boolean b(SurfaceHolder surfaceholder)
    {
        if (!q && surfaceholder == null)
        {
            throw new AssertionError();
        }
        if (!q && surfaceholder.getSurface() == null)
        {
            throw new AssertionError();
        }
        (new StringBuilder("surfaceFrame: ")).append(String.valueOf(surfaceholder.getSurfaceFrame())).toString();
        f = true;
        if (k)
        {
            try
            {
                i.setPreviewDisplay(surfaceholder);
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("card.io", "can't set preview display", surfaceholder);
                return false;
            }
            try
            {
                i.startPreview();
                i.autoFocus(this);
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("card.io", "startPreview failed on camera. Error: ", surfaceholder);
                return false;
            }
        }
        return true;
    }

    private native void nCleanup();

    private native void nGetGuideFrame(int i1, int j1, int k1, Rect rect);

    private native void nResetAnalytics();

    private native void nScanFrame(byte abyte0[], int i1, int j1, int k1, h h1, Bitmap bitmap);

    private native void nSetup(boolean flag, float f1);

    private native void nSkipFrame();

    public static native boolean nUseNeon();

    public static native boolean nUseTegra();

    final Rect a(int i1, int j1)
    {
        int k1 = e;
        Rect rect = null;
        if (a())
        {
            rect = new Rect();
            nGetGuideFrame(k1, i1, j1, rect);
        }
        return rect;
    }

    final void a(int i1)
    {
        e = i1;
    }

    final void a(boolean flag)
    {
        if (!k)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        RuntimeException runtimeexception;
        boolean flag1;
        if (h < g)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        g = System.currentTimeMillis();
        i.autoFocus(this);
        if (flag)
        {
            try
            {
                m = m + 1;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (RuntimeException runtimeexception)
            {
                Log.w("CardScanner", (new StringBuilder("could not trigger auto focus: ")).append(runtimeexception).toString());
            }
            break MISSING_BLOCK_LABEL_89;
        }
        n = n + 1;
        return;
    }

    final boolean a(SurfaceHolder surfaceholder)
    {
        (new StringBuilder("resumeScanning(")).append(surfaceholder).append(")").toString();
        if (i == null)
        {
            b();
        }
        if (k && i == null)
        {
            return false;
        }
        if (!q && surfaceholder == null)
        {
            throw new AssertionError();
        }
        if (k && j == null)
        {
            (new StringBuilder("- mCamera:")).append(i).toString();
            int i1 = i.getParameters().getPreviewFormat();
            (new StringBuilder("- preview format: ")).append(i1).toString();
            i1 = ImageFormat.getBitsPerPixel(i1) / 8;
            (new StringBuilder("- bytes per pixel: ")).append(i1).toString();
            i1 = i1 * 0x4b000 * 3;
            (new StringBuilder("- buffer size: ")).append(i1).toString();
            j = new byte[i1];
            i.addCallbackBuffer(j);
        }
        surfaceholder.addCallback(this);
        surfaceholder.setType(3);
        if (k)
        {
            i.setPreviewCallbackWithBuffer(this);
        }
        if (l)
        {
            b(surfaceholder);
        }
        b(false);
        System.currentTimeMillis();
        nResetAnalytics();
        return true;
    }

    final void b()
    {
        f = true;
        g = 0L;
        h = 0L;
        m = 0;
        n = 0;
        o = 0;
        if (!k || i != null) goto _L2; else goto _L1
_L1:
        i = b(50, 5000);
        if (i != null) goto _L4; else goto _L3
_L3:
        Log.e("card.io", "prepare scanner couldn't connect to camera!");
_L8:
        return;
_L4:
        android.hardware.Camera.Parameters parameters;
        List list;
        i.setDisplayOrientation(90);
        parameters = i.getParameters();
        list = parameters.getSupportedPreviewSizes();
        if (list == null) goto _L6; else goto _L5
_L5:
        android.hardware.Camera.Size size;
        v.a(list);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_301;
            }
            size = (android.hardware.Camera.Size)iterator.next();
        } while (size.width != 640 || size.height != 480);
_L10:
        if (size == null)
        {
            Log.w("card.io", "Didn't find a supported 640x480 resolution, so forcing");
            size = (android.hardware.Camera.Size)list.get(0);
            size.width = 640;
            size.height = 480;
        }
_L6:
        (new StringBuilder("- parameters: ")).append(parameters).toString();
        parameters.setPreviewSize(640, 480);
        i.setParameters(parameters);
_L9:
        if (a != null) goto _L8; else goto _L7
_L7:
        a = Bitmap.createBitmap(428, 270, android.graphics.Bitmap.Config.ARGB_8888);
        return;
_L2:
        if (!k)
        {
            Log.w("CardScanner", "useCamera is false!");
        } else
        if (i != null)
        {
            (new StringBuilder("we already have a camera instance: ")).append(i).toString();
        }
          goto _L9
          goto _L8
        size = null;
          goto _L10
    }

    public final boolean b(boolean flag)
    {
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        (new StringBuilder("setFlashOn: ")).append(flag).toString();
        android.hardware.Camera.Parameters parameters = i.getParameters();
        String s;
        if (flag)
        {
            s = "torch";
        } else
        {
            s = "off";
        }
        parameters.setFlashMode(s);
        i.setParameters(parameters);
        o = o + 1;
        return true;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("CardScanner", (new StringBuilder("Could not set flash mode: ")).append(runtimeexception).toString());
        return false;
    }

    public final void c()
    {
        b(false);
        if (i != null)
        {
            try
            {
                i.stopPreview();
                i.setPreviewDisplay(null);
            }
            catch (IOException ioexception)
            {
                Log.w("card.io", "can't stop preview display", ioexception);
            }
            i.setPreviewCallback(null);
            i.release();
            j = null;
            i = null;
        }
    }

    public final void d()
    {
        if (i != null)
        {
            c();
        }
        nCleanup();
        j = null;
    }

    public final boolean e()
    {
        if (!k)
        {
            return false;
        } else
        {
            return i.getParameters().getFlashMode().equals("torch");
        }
    }

    public void onAutoFocus(boolean flag, Camera camera)
    {
        h = System.currentTimeMillis();
    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        Log.w("CardScanner", "frame is null! skipping");
_L4:
        return;
_L2:
        if (!p)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.e("CardScanner", "processing in progress.... dropping frame");
        nSkipFrame();
        if (camera != null)
        {
            camera.addCallbackBuffer(abyte0);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        h h1;
        p = true;
        if (f)
        {
            f = false;
            e = 1;
            ((CardIOActivity)c.get()).a(1);
        }
        h1 = new h();
        nScanFrame(abyte0, 640, 480, e, h1, a);
        boolean flag;
        if (h1.e >= 6F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L6; else goto _L5
_L5:
        a(false);
_L8:
        if (camera != null)
        {
            camera.addCallbackBuffer(abyte0);
        }
        p = false;
        return;
_L6:
        if (h1.b() || d && h1.a())
        {
            (new StringBuilder("detected card: ")).append(h1.c()).toString();
            ((CardIOActivity)c.get()).a(a, h1);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
        boolean flag;
        if (surfaceholder != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        String.format("Preview.surfaceChanged(holder?:%b, f:%d, w:%d, h:%d )", new Object[] {
            Boolean.valueOf(flag), Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1)
        });
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        if (i != null || !k)
        {
            l = true;
            b(surfaceholder);
            return;
        } else
        {
            Log.wtf("card.io", "CardScanner.surfaceCreated() - camera is null!");
            return;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (i != null)
        {
            try
            {
                i.stopPreview();
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("card.io", "error stopping camera", surfaceholder);
            }
        }
        l = false;
    }

    static 
    {
        boolean flag;
        if (!io/card/payment/CardScanner.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q = flag;
        b = false;
        System.loadLibrary("cardioDecider");
        (new StringBuilder("Loaded card.io decider library.  nUseNeon():")).append(nUseNeon()).append(",nUseTegra():").append(nUseTegra()).toString();
        if (nUseNeon() || nUseTegra())
        {
            System.loadLibrary("opencv_core");
            System.loadLibrary("opencv_imgproc");
        }
        if (!nUseNeon()) goto _L2; else goto _L1
_L1:
        System.loadLibrary("cardioRecognizer");
_L4:
        p = false;
        return;
_L2:
        UnsatisfiedLinkError unsatisfiedlinkerror;
        if (nUseTegra())
        {
            System.loadLibrary("cardioRecognizer_tegra2");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            Log.w("card.io", "unsupported processor - card.io scanning requires ARMv7 architecture");
            b = true;
        }
        // Misplaced declaration of an exception variable
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            Log.e("card.io", (new StringBuilder("Failed to load native library: ")).append(unsatisfiedlinkerror.getMessage()).toString());
            b = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
