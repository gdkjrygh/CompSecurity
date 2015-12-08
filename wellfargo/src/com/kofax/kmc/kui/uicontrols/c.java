// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            ICameraSource

final class c
    implements ICameraSource
{

    private static boolean a = false;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private static final int h = 6;
    private static final int i = 7;
    private static final int j = 8;
    private static final int k = 9;
    private static final int l = 10;
    private static final int m = 11;
    private static final int n = 12;
    private static final int o = 13;
    private static final int p = 14;
    private static final int q = 15;
    private static final int r = 16;
    private a b;
    private final android.hardware.Camera.CameraInfo s = new android.hardware.Camera.CameraInfo();
    private RuntimeException t;
    private final Thread.UncaughtExceptionHandler u = new _cls1();

    public c()
    {
        Camera.getCameraInfo(0, s);
    }

    static RuntimeException a(c c1, RuntimeException runtimeexception)
    {
        c1.t = runtimeexception;
        return runtimeexception;
    }

    private void a()
    {
        if (t != null)
        {
            a = false;
            b.getLooper().quit();
            b = null;
            throw t;
        }
        break MISSING_BLOCK_LABEL_39;
        Exception exception;
        exception;
        t = null;
        throw exception;
        t = null;
        return;
    }

    private void a(int i1)
    {
        a(i1, ((Object) ((Object[])null)));
    }

    private void a(int i1, Object obj)
    {
        if (!a)
        {
            throw new IllegalStateException("Camera is not open");
        }
        a a1 = b;
        a1;
        JVM INSTR monitorenter ;
        if (obj != null) goto _L2; else goto _L1
_L1:
        b.sendEmptyMessage(i1);
_L3:
        b.wait();
        a();
_L4:
        a1;
        JVM INSTR monitorexit ;
        return;
_L2:
        b.obtainMessage(i1, obj).sendToTarget();
          goto _L3
        obj;
        a();
          goto _L4
        obj;
        a1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        a();
        throw obj;
          goto _L3
    }

    public void addCallbackBuffer(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        a(7, abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    public void autoFocus(ICameraSource.AutoFocusCallback autofocuscallback)
    {
        this;
        JVM INSTR monitorenter ;
        a(8, autofocuscallback);
        this;
        JVM INSTR monitorexit ;
        return;
        autofocuscallback;
        throw autofocuscallback;
    }

    public void cancelAutoFocus()
    {
        this;
        JVM INSTR monitorenter ;
        a(9);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(2);
        b.getLooper().quit();
        b = null;
        a = false;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
        exception;
        a = false;
        throw exception;
    }

    public int getOrientation()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = s.orientation;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public ICameraSource.Parameters getParameters()
    {
        this;
        JVM INSTR monitorenter ;
        b b1;
        if (b.d == null)
        {
            a(13);
        }
        b1 = new b(b.d);
        this;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isCameraOpen()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isFrontFacing()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        int i1 = s.facing;
        if (i1 != 1)
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public android.hardware.Camera.Size makeSize(Point point)
    {
        if (!a || point == null)
        {
            return null;
        } else
        {
            Camera camera = b.b;
            camera.getClass();
            return new android.hardware.Camera.Size(camera, point.x, point.y);
        }
    }

    public void open()
    {
        this;
        JVM INSTR monitorenter ;
        if (a)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_CAMERA_ALREADY_OPEN);
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        obj = new HandlerThread("Camera Handler Thread");
        ((HandlerThread) (obj)).start();
        obj = ((HandlerThread) (obj)).getLooper();
        b = new a(((Looper) (obj)), Looper.myLooper());
        ((Looper) (obj)).getThread().setUncaughtExceptionHandler(u);
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        RuntimeException runtimeexception;
        b.sendEmptyMessage(1);
        b.wait();
        runtimeexception = b.c;
        if (runtimeexception == null) goto _L2; else goto _L1
_L1:
        throw b.c;
        Exception exception1;
        exception1;
        b.c = null;
        throw exception1;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        finally { }
        ((Looper) (obj)).quit();
        b = null;
        a();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        a = true;
        a();
          goto _L3
        a();
        throw obj;
    }

    public void setAutoFocusMoveCallback(ICameraSource.AutoFocusMoveCallback autofocusmovecallback)
    {
        this;
        JVM INSTR monitorenter ;
        a(10, autofocusmovecallback);
        this;
        JVM INSTR monitorexit ;
        return;
        autofocusmovecallback;
        throw autofocusmovecallback;
    }

    public void setDisplayOrientation(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        a(11, Integer.valueOf(i1));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setErrorCallback(ICameraSource.ErrorCallback errorcallback)
    {
        this;
        JVM INSTR monitorenter ;
        a(12, errorcallback);
        this;
        JVM INSTR monitorexit ;
        return;
        errorcallback;
        throw errorcallback;
    }

    public void setParameters(ICameraSource.Parameters parameters)
    {
        this;
        JVM INSTR monitorenter ;
        if (!(parameters instanceof b))
        {
            throw new IllegalArgumentException("Parameters constructed elsewhere.  Unsupported.");
        }
        break MISSING_BLOCK_LABEL_24;
        parameters;
        this;
        JVM INSTR monitorexit ;
        throw parameters;
        a(14, ((b)parameters).a());
        this;
        JVM INSTR monitorexit ;
    }

    public void setPreviewCallback(ICameraSource.PreviewCallback previewcallback)
    {
        this;
        JVM INSTR monitorenter ;
        a(5, previewcallback);
        this;
        JVM INSTR monitorexit ;
        return;
        previewcallback;
        throw previewcallback;
    }

    public void setPreviewCallbackWithBuffer(ICameraSource.PreviewCallback previewcallback, Lock lock)
    {
        this;
        JVM INSTR monitorenter ;
        b.a = lock;
        a(6, previewcallback);
        this;
        JVM INSTR monitorexit ;
        return;
        previewcallback;
        throw previewcallback;
    }

    public void setPreviewDisplay(SurfaceHolder surfaceholder)
    {
        this;
        JVM INSTR monitorenter ;
        a(15, surfaceholder);
        this;
        JVM INSTR monitorexit ;
        return;
        surfaceholder;
        throw surfaceholder;
    }

    public void startPreview()
    {
        this;
        JVM INSTR monitorenter ;
        a(3);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void stopPreview()
    {
        this;
        JVM INSTR monitorenter ;
        a(4);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void takePicture(ICameraSource.ShutterCallback shuttercallback, ICameraSource.PictureCallback picturecallback)
    {
        this;
        JVM INSTR monitorenter ;
        b.a(shuttercallback, picturecallback);
        this;
        JVM INSTR monitorexit ;
        return;
        shuttercallback;
        throw shuttercallback;
    }

    static 
    {
        a = false;
    }

    private class _cls1
        implements Thread.UncaughtExceptionHandler
    {

        final c a;

        public void uncaughtException(Thread thread, Throwable throwable)
        {
            if (throwable.getClass().isInstance(java/lang/RuntimeException))
            {
                c.a(a, (RuntimeException)throwable);
                return;
            } else
            {
                c.a(a, new RuntimeException(throwable));
                return;
            }
        }

        _cls1()
        {
            a = c.this;
            super();
        }
    }


    private class a extends Handler
    {

        Lock a;
        Camera b;
        RuntimeException c;
        android.hardware.Camera.Parameters d;
        ICameraSource.PreviewCallback e;
        ICameraSource.AutoFocusCallback f;
        ICameraSource.ErrorCallback g;
        ICameraSource.PictureCallback h;
        ICameraSource.ShutterCallback i;
        SurfaceHolder j;
        final c k;
        private final Handler l;
        private final Looper m;
        private final android.hardware.Camera.ShutterCallback n = new _cls2();
        private final android.hardware.Camera.PreviewCallback o = new _cls4();
        private final android.hardware.Camera.AutoFocusCallback p = new _cls5();
        private final android.hardware.Camera.ErrorCallback q = new _cls6();
        private final android.hardware.Camera.PictureCallback r = new _cls7();

        static android.hardware.Camera.ShutterCallback a(a a1)
        {
            return a1.n;
        }

        private void a()
        {
            b.release();
            b = null;
        }

        private void a(ICameraSource.AutoFocusMoveCallback autofocusmovecallback)
        {
            class _cls3
                implements android.hardware.Camera.AutoFocusMoveCallback
            {

                final ICameraSource.AutoFocusMoveCallback a;
                final a b;

                public void onAutoFocusMoving(boolean flag, Camera camera)
                {
                    class _cls1
                        implements Runnable
                    {

                        final Camera a;
                        final boolean b;
                        final _cls3 c;

                        public void run()
                        {
                            if (a != c.b.b)
                            {
                                Log.e("DeviceCamera", (new StringBuilder()).append("UNEXPECTED CAMERA!  '").append(a).append("'").toString());
                                return;
                            } else
                            {
                                c.a.onAutoFocusMoving(b);
                                return;
                            }
                        }

                            _cls1(Camera camera, boolean flag)
                            {
                                c = _cls3.this;
                                a = camera;
                                b = flag;
                                super();
                            }
                    }

                    if (a != null)
                    {
                        a.c(b).post(new _cls1(camera, flag));
                    }
                }

                _cls3(ICameraSource.AutoFocusMoveCallback autofocusmovecallback)
                {
                    b = a.this;
                    a = autofocusmovecallback;
                    super();
                }
            }

            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                b.setAutoFocusMoveCallback(new _cls3(autofocusmovecallback));
            }
        }

        static android.hardware.Camera.PictureCallback b(a a1)
        {
            return a1.r;
        }

        static Handler c(a a1)
        {
            return a1.l;
        }

        public void a(ICameraSource.ShutterCallback shuttercallback, ICameraSource.PictureCallback picturecallback)
        {
            this;
            JVM INSTR monitorenter ;
            this;
            JVM INSTR monitorenter ;
            h = picturecallback;
            i = shuttercallback;
            class _cls1
                implements Runnable
            {

                final a a;

                public void run()
                {
                    this;
                    JVM INSTR monitorenter ;
                    a.b.takePicture(a.a(a), null, null, a.b(a));
                    this;
                    JVM INSTR monitorexit ;
                    return;
                    Exception exception;
                    exception;
                    throw exception;
                }

                _cls1()
                {
                    a = a.this;
                    super();
                }
            }

            post(new _cls1());
            this;
            JVM INSTR monitorexit ;
            this;
            JVM INSTR monitorexit ;
            return;
            shuttercallback;
            this;
            JVM INSTR monitorexit ;
            throw shuttercallback;
            shuttercallback;
            this;
            JVM INSTR monitorexit ;
            throw shuttercallback;
        }

        public void handleMessage(Message message)
        {
            Object obj = null;
            this;
            JVM INSTR monitorenter ;
            message.what;
            JVM INSTR tableswitch 1 16: default 636
        //                       1 161
        //                       2 222
        //                       3 271
        //                       4 281
        //                       5 291
        //                       6 330
        //                       7 371
        //                       8 407
        //                       9 495
        //                       10 505
        //                       11 519
        //                       12 539
        //                       13 564
        //                       14 578
        //                       15 236
        //                       16 608;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L17:
            break MISSING_BLOCK_LABEL_608;
_L1:
            throw new RuntimeException((new StringBuilder()).append("Invalid message=").append(message.what).toString());
            obj;
            if (message.what != 2 && b != null)
            {
                a();
            }
            c.a(k, new RuntimeException(((Throwable) (obj))));
            notify();
_L19:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            if (b != null)
            {
                break; /* Loop/switch isn't completed */
            }
            b = Camera.open();
            if (b == null)
            {
                b = Camera.open(0);
            }
            if (b == null)
            {
                c = new RuntimeException("camera == null");
            }
_L20:
            notify();
            if (true) goto _L19; else goto _L18
_L18:
            message;
            throw message;
_L3:
            a();
              goto _L20
            message;
            notify();
            throw message;
_L16:
            j = (SurfaceHolder)message.obj;
            b.setPreviewDisplay(j);
              goto _L20
            obj;
            throw new RuntimeException(((Throwable) (obj)));
_L4:
            b.startPreview();
              goto _L20
_L5:
            b.stopPreview();
              goto _L20
_L6:
            Camera camera;
            e = (ICameraSource.PreviewCallback)message.obj;
            camera = b;
            if (e != null)
            {
                break MISSING_BLOCK_LABEL_322;
            }
_L21:
            camera.setPreviewCallback(((android.hardware.Camera.PreviewCallback) (obj)));
              goto _L20
            obj = o;
              goto _L21
_L7:
            e = (ICameraSource.PreviewCallback)message.obj;
            camera = b;
            if (e != null)
            {
                break MISSING_BLOCK_LABEL_363;
            }
            obj = null;
_L22:
            camera.setPreviewCallbackWithBuffer(((android.hardware.Camera.PreviewCallback) (obj)));
              goto _L20
            obj = o;
              goto _L22
_L8:
            if (message.obj != null)
            {
                a.lock();
            }
            b.addCallbackBuffer((byte[])(byte[])message.obj);
              goto _L20
_L9:
            f = (ICameraSource.AutoFocusCallback)message.obj;
            b.autoFocus(p);
              goto _L20
            Exception exception;
            exception;
            Log.e("CAMERA FAIL", "", exception);
            if (p != null)
            {
                p.onAutoFocus(false, b);
            }
            b.cancelAutoFocus();
            b.setPreviewDisplay(j);
            b.autoFocus(p);
              goto _L20
_L10:
            b.cancelAutoFocus();
              goto _L20
_L11:
            a((ICameraSource.AutoFocusMoveCallback)message.obj);
              goto _L20
_L12:
            b.setDisplayOrientation(((Integer)message.obj).intValue());
              goto _L20
_L13:
            g = (ICameraSource.ErrorCallback)message.obj;
            b.setErrorCallback(q);
              goto _L20
_L14:
            d = b.getParameters();
              goto _L20
_L15:
            android.hardware.Camera.Parameters parameters = b.getParameters();
            parameters.unflatten((String)message.obj);
            b.setParameters(parameters);
              goto _L20
            h = (ICameraSource.PictureCallback)message.obj;
            b.takePicture(null, null, null, r);
              goto _L20
        }

        a(Looper looper, Looper looper1)
        {
            k = c.this;
            super(looper);
            class _cls2
                implements android.hardware.Camera.ShutterCallback
            {

                final a a;

                public void onShutter()
                {
                    ICameraSource.ShutterCallback shuttercallback = a.i;
                    class _cls1
                        implements Runnable
                    {

                        final ICameraSource.ShutterCallback a;
                        final _cls2 b;

                        public void run()
                        {
                            a.onShutter();
                        }

                            _cls1(ICameraSource.ShutterCallback shuttercallback)
                            {
                                b = _cls2.this;
                                a = shuttercallback;
                                super();
                            }
                    }

                    if (shuttercallback != null)
                    {
                        a.c(a).post(new _cls1(shuttercallback));
                    }
                }

                _cls2()
                {
                    a = a.this;
                    super();
                }
            }

            class _cls4
                implements android.hardware.Camera.PreviewCallback
            {

                final a a;

                public void onPreviewFrame(byte abyte0[], Camera camera)
                {
                    if (a.a != null)
                    {
                        a.a.unlock();
                        ICameraSource.PreviewCallback previewcallback = a.e;
                        if (previewcallback != null)
                        {
                            class _cls1
                                implements Runnable
                            {

                                final Camera a;
                                final ICameraSource.PreviewCallback b;
                                final byte c[];
                                final _cls4 d;

                                public void run()
                                {
                                    if (a != d.a.b)
                                    {
                                        Log.e("DeviceCamera", (new StringBuilder()).append("UNEXPECTED CAMERA!  '").append(a).append("'").toString());
                                        return;
                                    } else
                                    {
                                        b.onPreviewFrame(c);
                                        return;
                                    }
                                }

                            _cls1(Camera camera, ICameraSource.PreviewCallback previewcallback, byte abyte0[])
                            {
                                d = _cls4.this;
                                a = camera;
                                b = previewcallback;
                                c = abyte0;
                                super();
                            }
                            }

                            a.c(a).post(new _cls1(camera, previewcallback, abyte0));
                            return;
                        }
                    }
                }

                _cls4()
                {
                    a = a.this;
                    super();
                }
            }

            class _cls5
                implements android.hardware.Camera.AutoFocusCallback
            {

                final a a;

                public void onAutoFocus(boolean flag, Camera camera)
                {
                    ICameraSource.AutoFocusCallback autofocuscallback = a.f;
                    class _cls1
                        implements Runnable
                    {

                        final Camera a;
                        final ICameraSource.AutoFocusCallback b;
                        final boolean c;
                        final _cls5 d;

                        public void run()
                        {
                            if (a != d.a.b)
                            {
                                Log.e("DeviceCamera", (new StringBuilder()).append("UNEXPECTED CAMERA!  '").append(a).append("'").toString());
                                return;
                            } else
                            {
                                b.onAutoFocus(c);
                                return;
                            }
                        }

                            _cls1(Camera camera, ICameraSource.AutoFocusCallback autofocuscallback, boolean flag)
                            {
                                d = _cls5.this;
                                a = camera;
                                b = autofocuscallback;
                                c = flag;
                                super();
                            }
                    }

                    if (autofocuscallback != null)
                    {
                        a.c(a).post(new _cls1(camera, autofocuscallback, flag));
                    }
                }

                _cls5()
                {
                    a = a.this;
                    super();
                }
            }

            class _cls6
                implements android.hardware.Camera.ErrorCallback
            {

                final a a;

                public void onError(int i1, Camera camera)
                {
                    ICameraSource.ErrorCallback errorcallback = a.g;
                    class _cls1
                        implements Runnable
                    {

                        final Camera a;
                        final ICameraSource.ErrorCallback b;
                        final int c;
                        final _cls6 d;

                        public void run()
                        {
                            if (a != d.a.b)
                            {
                                Log.e("DeviceCamera", (new StringBuilder()).append("UNEXPECTED CAMERA!  '").append(a).append("'").toString());
                                return;
                            } else
                            {
                                b.onError(c);
                                return;
                            }
                        }

                            _cls1(Camera camera, ICameraSource.ErrorCallback errorcallback, int i1)
                            {
                                d = _cls6.this;
                                a = camera;
                                b = errorcallback;
                                c = i1;
                                super();
                            }
                    }

                    if (errorcallback != null)
                    {
                        a.c(a).post(new _cls1(camera, errorcallback, i1));
                    }
                }

                _cls6()
                {
                    a = a.this;
                    super();
                }
            }

            class _cls7
                implements android.hardware.Camera.PictureCallback
            {

                final a a;

                public void onPictureTaken(byte abyte0[], Camera camera)
                {
                    ICameraSource.PictureCallback picturecallback = a.h;
                    class _cls1
                        implements Runnable
                    {

                        final Camera a;
                        final ICameraSource.PictureCallback b;
                        final byte c[];
                        final _cls7 d;

                        public void run()
                        {
                            if (a != d.a.b)
                            {
                                Log.e("DeviceCamera", (new StringBuilder()).append("UNEXPECTED CAMERA!  '").append(a).append("'").toString());
                                return;
                            } else
                            {
                                b.onPictureTaken(c);
                                return;
                            }
                        }

                            _cls1(Camera camera, ICameraSource.PictureCallback picturecallback, byte abyte0[])
                            {
                                d = _cls7.this;
                                a = camera;
                                b = picturecallback;
                                c = abyte0;
                                super();
                            }
                    }

                    if (picturecallback != null)
                    {
                        a.c(a).post(new _cls1(camera, picturecallback, abyte0));
                    }
                }

                _cls7()
                {
                    a = a.this;
                    super();
                }
            }

            m = looper1;
            l = new Handler(m);
        }
    }


    private class b
        implements ICameraSource.Parameters
    {

        private final android.hardware.Camera.Parameters a;

        public String a()
        {
            return a.flatten();
        }

        public Flash getFlashMode()
        {
            Flash flash = Flash.AUTO;
            String s1 = a.getFlashMode();
            if (s1 == "auto")
            {
                flash = Flash.AUTO;
            } else
            {
                if (s1 == "on")
                {
                    return Flash.ON;
                }
                if (s1 == "off")
                {
                    return Flash.OFF;
                }
                if (s1 == "torch")
                {
                    return Flash.TORCH;
                }
            }
            return flash;
        }

        public List getFocusAreas()
        {
            Object obj = a.getFocusAreas();
            ArrayList arraylist = new ArrayList();
            android.hardware.Camera.Area area;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new ICameraSource.Area(area.rect, area.weight)))
            {
                area = (android.hardware.Camera.Area)((Iterator) (obj)).next();
            }

            return arraylist;
        }

        public ICameraSource.FocusMode getFocusMode()
        {
            ICameraSource.FocusMode focusmode = ICameraSource.FocusMode.AUTO;
            Object obj = a.getFocusMode();
            if (obj == "auto")
            {
                try
                {
                    return ICameraSource.FocusMode.AUTO;
                }
                catch (Exception exception) { }
                break MISSING_BLOCK_LABEL_55;
            }
            if (obj != "continuous-picture")
            {
                break MISSING_BLOCK_LABEL_32;
            }
            return ICameraSource.FocusMode.CONTINUOUS_PICTURE;
            if (obj != "continuous-video")
            {
                break MISSING_BLOCK_LABEL_42;
            }
            return ICameraSource.FocusMode.CONTINUOUS_VIDEO;
            if (obj != "infinity")
            {
                break MISSING_BLOCK_LABEL_55;
            }
            obj = ICameraSource.FocusMode.INFINITY;
            return ((ICameraSource.FocusMode) (obj));
            return focusmode;
        }

        public int getMaxNumFocusAreas()
        {
            int i1;
            try
            {
                i1 = a.getMaxNumFocusAreas();
            }
            catch (Exception exception)
            {
                return 0;
            }
            return i1;
        }

        public int getPictureFormat()
        {
            return a.getPictureFormat();
        }

        public Point getPictureSize()
        {
            android.hardware.Camera.Size size = a.getPictureSize();
            return new Point(size.width, size.height);
        }

        public int getPreviewFormat()
        {
            return 17;
        }

        public Point getPreviewSize()
        {
            android.hardware.Camera.Size size = a.getPreviewSize();
            return new Point(size.width, size.height);
        }

        public List getSupportedFlashModes()
        {
            ArrayList arraylist = new ArrayList();
            Object obj = a.getSupportedFlashModes();
            if (obj == null)
            {
                return null;
            }
            obj = ((List) (obj)).iterator();
_L3:
            String s1;
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_137;
            }
            s1 = (String)((Iterator) (obj)).next();
            if (!s1.equals("auto")) goto _L2; else goto _L1
_L1:
            arraylist.add(Flash.AUTO);
              goto _L3
_L2:
label0:
            {
                if (!s1.equals("off"))
                {
                    break label0;
                }
                arraylist.add(Flash.OFF);
            }
              goto _L3
            if (!s1.equals("on")) goto _L5; else goto _L4
_L4:
            arraylist.add(Flash.ON);
              goto _L3
_L5:
            if (!s1.equals("torch")) goto _L3; else goto _L6
_L6:
            arraylist.add(Flash.TORCH);
              goto _L3
            Exception exception;
            exception;
            return arraylist;
        }

        public List getSupportedFocusModes()
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = a.getSupportedFocusModes().iterator();
_L3:
            String s1;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_149;
            }
            s1 = (String)iterator.next();
            if (!s1.equals("auto")) goto _L2; else goto _L1
_L1:
            arraylist.add(ICameraSource.FocusMode.AUTO);
              goto _L3
_L2:
label0:
            {
                if (!s1.equals("continuous-picture"))
                {
                    break label0;
                }
                arraylist.add(ICameraSource.FocusMode.DELAYED_CONTINUOUS_PICTURE);
                arraylist.add(ICameraSource.FocusMode.CONTINUOUS_PICTURE);
            }
              goto _L3
            if (!s1.equals("continuous-video")) goto _L5; else goto _L4
_L4:
            arraylist.add(ICameraSource.FocusMode.DELAYED_CONTINUOUS_VIDEO);
            arraylist.add(ICameraSource.FocusMode.CONTINUOUS_VIDEO);
              goto _L3
_L5:
            if (!s1.equals("infinity")) goto _L3; else goto _L6
_L6:
            arraylist.add(ICameraSource.FocusMode.INFINITY);
              goto _L3
            Exception exception;
            exception;
            return arraylist;
        }

        public List getSupportedPictureSizes()
        {
            ArrayList arraylist = new ArrayList();
            try
            {
                android.hardware.Camera.Size size;
                for (Iterator iterator = a.getSupportedPictureSizes().iterator(); iterator.hasNext(); arraylist.add(new Point(size.width, size.height)))
                {
                    size = (android.hardware.Camera.Size)iterator.next();
                }

            }
            catch (Exception exception) { }
            return arraylist;
        }

        public List getSupportedPreviewSizes()
        {
            ArrayList arraylist = new ArrayList();
            try
            {
                android.hardware.Camera.Size size;
                for (Iterator iterator = a.getSupportedPreviewSizes().iterator(); iterator.hasNext(); arraylist.add(new Point(size.width, size.height)))
                {
                    size = (android.hardware.Camera.Size)iterator.next();
                }

            }
            catch (Exception exception) { }
            return arraylist;
        }

        public void setFlashMode(Flash flash)
        {
            if (flash == null)
            {
                throw new NullPointerException();
            }
            _cls2.a[flash.ordinal()];
            JVM INSTR tableswitch 1 3: default 48
        //                       1 60
        //                       2 66
        //                       3 72;
               goto _L1 _L2 _L3 _L4
_L1:
            flash = "auto";
_L6:
            a.setFlashMode(flash);
            return;
_L2:
            flash = "off";
            continue; /* Loop/switch isn't completed */
_L3:
            flash = "on";
            continue; /* Loop/switch isn't completed */
_L4:
            flash = "torch";
            if (true) goto _L6; else goto _L5
_L5:
        }

        public void setFocusAreas(List list)
        {
            ArrayList arraylist = new ArrayList();
            if (list == null)
            {
                list = null;
            } else
            {
                ICameraSource.Area area;
                for (list = list.iterator(); list.hasNext(); arraylist.add(new android.hardware.Camera.Area(area.a(), area.b())))
                {
                    area = (ICameraSource.Area)list.next();
                }

                list = arraylist;
            }
            a.setFocusAreas(list);
        }

        public void setFocusMode(ICameraSource.FocusMode focusmode)
        {
            _cls2.b[focusmode.ordinal()];
            JVM INSTR tableswitch 1 3: default 36
        //                       1 48
        //                       2 54
        //                       3 60;
               goto _L1 _L2 _L3 _L4
_L1:
            focusmode = "auto";
_L6:
            a.setFocusMode(focusmode);
            return;
_L2:
            focusmode = "continuous-picture";
            continue; /* Loop/switch isn't completed */
_L3:
            focusmode = "continuous-video";
            continue; /* Loop/switch isn't completed */
_L4:
            focusmode = "infinity";
            if (true) goto _L6; else goto _L5
_L5:
        }

        public void setPictureSize(Point point)
        {
            a.setPictureSize(point.x, point.y);
        }

        public void setPreviewSize(Point point)
        {
            a.setPreviewSize(point.x, point.y);
        }

        public b(android.hardware.Camera.Parameters parameters)
        {
            a = parameters;
        }

        private class _cls2
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[ICameraSource.FocusMode.values().length];
                try
                {
                    b[ICameraSource.FocusMode.CONTINUOUS_PICTURE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[ICameraSource.FocusMode.CONTINUOUS_VIDEO.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[ICameraSource.FocusMode.INFINITY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[ICameraSource.FocusMode.AUTO.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[Flash.values().length];
                try
                {
                    a[Flash.OFF.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Flash.ON.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Flash.TORCH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Flash.AUTO.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }

}
