// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            s, c, a, ICameraSource, 
//            AutoFocusResultListener

class CameraManager
{

    public static final int a = 1000;
    private static final String b = com/kofax/kmc/kui/uicontrols/CameraManager.getSimpleName();
    private static final Object c = new Object();
    private static final String d = "ADR6400L";
    private ICameraSource.PictureCallback A;
    private boolean B;
    private final ICameraSource.ShutterCallback C = new _cls3();
    private final ICameraSource.PictureCallback D = new _cls4();
    private final ICameraSource.AutoFocusCallback E = new _cls5();
    private a F;
    private PreviewProcessRawDataDelegate G;
    private boolean H;
    private final Bus e;
    private final b f = new b(null);
    private final Context g;
    private final ICameraSource h;
    private ICameraSource.ShutterCallback i;
    private CameraInitializationEvent.CameraInitStatus j;
    private Flash k;
    private Flash l;
    private com.kofax.kmc.kui.uicontrols.a m;
    private boolean n;
    private List o;
    private List p;
    private List q;
    private List r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private SurfaceHolder y;
    private ICameraSource.ErrorCallback z;

    public CameraManager(Context context, Bus bus, ICameraSource icamerasource)
    {
        j = CameraInitializationEvent.CameraInitStatus.CAMERA_VIEW_CREATED;
        k = null;
        l = Flash.OFF;
        n = false;
        o = new ArrayList();
        p = new ArrayList();
        q = new CopyOnWriteArrayList();
        r = new CopyOnWriteArrayList();
        s = 0;
        t = 0;
        v = false;
        w = false;
        x = false;
        z = new _cls1();
        A = new _cls2();
        B = false;
        F = new a(null);
        H = false;
        g = context;
        context = bus;
        if (bus == null)
        {
            context = com.kofax.kmc.kui.uicontrols.s.a(g);
        }
        e = context;
        context = icamerasource;
        if (icamerasource == null)
        {
            context = new c();
        }
        h = context;
        m = new com.kofax.kmc.kui.uicontrols.a(g);
        e.register(f);
    }

    private static int a(int i1)
    {
        switch (i1)
        {
        case 0: // '\0'
        default:
            return 0;

        case 1: // '\001'
            return 90;

        case 2: // '\002'
            return 180;

        case 3: // '\003'
            return 270;
        }
    }

    static int a(CameraManager cameramanager, int i1)
    {
        cameramanager.t = i1;
        return i1;
    }

    private Rect a(Rect rect, int i1, int j1)
    {
        if (!c(rect, i1, j1))
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_FOCUS_AREA_INVALID);
        } else
        {
            b(rect, i1, j1);
            Matrix matrix = new Matrix();
            matrix.postTranslate((float)(-i1) / 2.0F, (float)(-j1) / 2.0F);
            matrix.postScale(2000F / (float)i1, 2000F / (float)j1);
            matrix.postRotate(-s);
            RectF rectf = new RectF(rect.left, rect.top, rect.right, rect.bottom);
            matrix.mapRect(rectf);
            rect.left = (int)rectf.left;
            rect.right = (int)rectf.right;
            rect.top = (int)rectf.top;
            rect.bottom = (int)rectf.bottom;
            return rect;
        }
    }

    static ICameraSource.ShutterCallback a(CameraManager cameramanager, ICameraSource.ShutterCallback shuttercallback)
    {
        cameramanager.i = shuttercallback;
        return shuttercallback;
    }

    static Flash a(CameraManager cameramanager, Flash flash)
    {
        cameramanager.k = flash;
        return flash;
    }

    private void a(long l1)
    {
        if (!h.isCameraOpen() || w || !u)
        {
            return;
        }
        synchronized (c)
        {
            if (h.isCameraOpen() && !w && u)
            {
                break MISSING_BLOCK_LABEL_69;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        h.cancelAutoFocus();
        v = false;
        obj;
        JVM INSTR monitorexit ;
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.e(b, (new StringBuilder()).append("Cancel focus exception: ").append(runtimeexception.getMessage()).toString());
        throw runtimeexception;
    }

    static void a(CameraManager cameramanager)
    {
        cameramanager.o();
    }

    static void a(CameraManager cameramanager, long l1)
    {
        cameramanager.a(l1);
    }

    private void a(Flash flash, boolean flag)
    {
        if (!h.isCameraOpen())
        {
            return;
        }
        synchronized (c)
        {
            if (h.isCameraOpen())
            {
                break MISSING_BLOCK_LABEL_39;
            }
        }
        return;
        flash;
        obj;
        JVM INSTR monitorexit ;
        throw flash;
        ICameraSource.Parameters parameters = h.getParameters();
        if (parameters != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        List list = parameters.getSupportedFlashModes();
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        l = Flash.OFF;
        obj;
        JVM INSTR monitorexit ;
        return;
        _cls7.a[flash.ordinal()];
        JVM INSTR tableswitch 1 3: default 381
    //                   1 153
    //                   2 228
    //                   3 265;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!list.contains(Flash.OFF))
        {
            break MISSING_BLOCK_LABEL_370;
        }
        parameters.setFlashMode(Flash.OFF);
_L5:
        h.setParameters(parameters);
_L7:
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!list.contains(Flash.AUTO))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        parameters.setFlashMode(Flash.AUTO);
          goto _L5
        flash;
        if (!flag) goto _L7; else goto _L6
_L6:
        throw flash;
        throw new KmcRuntimeException(ErrorInfo.KMC_UI_FLASH_AUTO_NOT_SUPPORTED);
        flash;
        e.post(new BusEvents.LogEvent(b, BusEvents.LogEvent.Level.ERROR, ErrorInfo.KMC_UI_CAMERA_OPERATION_FAILURE.getErrMsg(), flash));
          goto _L7
_L3:
label0:
        {
            if (!list.contains(Flash.ON))
            {
                break label0;
            }
            parameters.setFlashMode(Flash.ON);
        }
          goto _L5
        throw new KmcRuntimeException(ErrorInfo.KMC_UI_FLASH_ON_NOT_SUPPORTED);
_L4:
        if (!list.contains(Flash.TORCH) || Build.MODEL.equalsIgnoreCase("ADR6400L"))
        {
            break MISSING_BLOCK_LABEL_359;
        }
        if (parameters.getFocusMode() == null || !parameters.getFocusMode().equals(ICameraSource.FocusMode.AUTO))
        {
            break MISSING_BLOCK_LABEL_346;
        }
        k = Flash.TORCH;
        parameters.setFlashMode(Flash.OFF);
        h.setParameters(parameters);
          goto _L5
        parameters.setFlashMode(Flash.TORCH);
          goto _L5
        throw new KmcRuntimeException(ErrorInfo.KMC_UI_FLASH_TORCH_NOT_SUPPORTED);
        throw new KmcRuntimeException(ErrorInfo.KMC_UI_FLASH_OFF_NOT_SUPPORTED);
    }

    static boolean a(CameraManager cameramanager, boolean flag)
    {
        cameramanager.x = flag;
        return flag;
    }

    static ICameraSource b(CameraManager cameramanager)
    {
        return cameramanager.h;
    }

    private void b(Rect rect, int i1, int j1)
    {
        int k1 = rect.left;
        int i2 = rect.top;
        int l1 = rect.right;
        int j2 = rect.bottom;
        if (rect.left < 0)
        {
            l1 = (int)((double)i1 * 0.10000000000000001D);
            k1 = 0;
        }
        if (rect.top < 0)
        {
            j2 = (int)((double)j1 * 0.10000000000000001D);
            i2 = 0;
        }
        if (rect.right > i1)
        {
            k1 = i1 - (int)((double)i1 * 0.10000000000000001D);
        } else
        {
            i1 = l1;
        }
        if (rect.bottom > j1)
        {
            i2 = j1 - (int)((double)j1 * 0.10000000000000001D);
        } else
        {
            j1 = j2;
        }
        rect.set(k1, i2, i1, j1);
    }

    static boolean b(CameraManager cameramanager, boolean flag)
    {
        cameramanager.B = flag;
        return flag;
    }

    static int c(CameraManager cameramanager)
    {
        return cameramanager.s;
    }

    private boolean c(Rect rect, int i1, int j1)
    {
        return rect.width() > 0 && rect.height() > 0 && rect.right >= rect.left && rect.bottom >= rect.top;
    }

    static boolean c(CameraManager cameramanager, boolean flag)
    {
        cameramanager.w = flag;
        return flag;
    }

    static Bus d(CameraManager cameramanager)
    {
        return cameramanager.e;
    }

    static boolean d(CameraManager cameramanager, boolean flag)
    {
        cameramanager.v = flag;
        return flag;
    }

    static Context e(CameraManager cameramanager)
    {
        return cameramanager.g;
    }

    static boolean e(CameraManager cameramanager, boolean flag)
    {
        cameramanager.H = flag;
        return flag;
    }

    static ICameraSource.ShutterCallback f(CameraManager cameramanager)
    {
        return cameramanager.i;
    }

    static ICameraSource.PictureCallback g(CameraManager cameramanager)
    {
        return cameramanager.A;
    }

    static boolean h(CameraManager cameramanager)
    {
        return cameramanager.B;
    }

    static a i(CameraManager cameramanager)
    {
        return cameramanager.F;
    }

    static Flash j(CameraManager cameramanager)
    {
        return cameramanager.k;
    }

    static boolean k(CameraManager cameramanager)
    {
        return cameramanager.x;
    }

    static String l()
    {
        return b;
    }

    static boolean l(CameraManager cameramanager)
    {
        return cameramanager.w;
    }

    static Object m()
    {
        return c;
    }

    static List m(CameraManager cameramanager)
    {
        return cameramanager.q;
    }

    static ICameraSource.AutoFocusCallback n(CameraManager cameramanager)
    {
        return cameramanager.E;
    }

    private void n()
    {
        if (!h.isCameraOpen())
        {
            return;
        }
        synchronized (c)
        {
            if (h.isCameraOpen())
            {
                break MISSING_BLOCK_LABEL_39;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        int i1;
        i1 = a(t);
        if (!h.isFrontFacing())
        {
            break MISSING_BLOCK_LABEL_129;
        }
        s = (h.getOrientation() + i1) % 360;
        s = (360 - s) % 360;
_L2:
        h.setDisplayOrientation(s);
        s = (h.getOrientation() - i1) % 360;
        obj;
        JVM INSTR monitorexit ;
        return;
        s = ((h.getOrientation() - i1) + 360) % 360;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static List o(CameraManager cameramanager)
    {
        return cameramanager.r;
    }

    private void o()
    {
        if (!h.isCameraOpen() || x || !u)
        {
            return;
        }
        synchronized (c)
        {
            if (h.isCameraOpen() && !x && u)
            {
                break MISSING_BLOCK_LABEL_67;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        w = true;
        if (!v)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        a.b(F);
        x = true;
        h.takePicture(C, D);
        obj;
        JVM INSTR monitorexit ;
    }

    static boolean p(CameraManager cameramanager)
    {
        return cameramanager.H;
    }

    static com.kofax.kmc.kui.uicontrols.a q(CameraManager cameramanager)
    {
        return cameramanager.m;
    }

    static PreviewProcessRawDataDelegate r(CameraManager cameramanager)
    {
        return cameramanager.G;
    }

    static void s(CameraManager cameramanager)
    {
        cameramanager.n();
    }

    static CameraInitializationEvent.CameraInitStatus t(CameraManager cameramanager)
    {
        return cameramanager.j;
    }

    public Point a(int i1, int j1)
    {
        if (!h.isCameraOpen())
        {
            return new Point();
        }
        Point point = m.d();
        float f1;
        int k1;
        int l1;
        if (s == 90 || s == 270 || s == -90 || s == -270)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0)
        {
            k1 = point.y;
        } else
        {
            k1 = point.x;
        }
        if (l1 != 0)
        {
            l1 = point.x;
        } else
        {
            l1 = point.y;
        }
        f1 = Math.min((float)i1 / (float)k1, (float)j1 / (float)l1);
        return new Point(Math.round((float)k1 * f1), Math.round((float)l1 * f1));
    }

    public void a()
    {
        if (!h.isCameraOpen())
        {
            return;
        }
        synchronized (c)
        {
            if (h.isCameraOpen())
            {
                break MISSING_BLOCK_LABEL_39;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        try
        {
            j();
            h.close();
        }
        catch (Exception exception1) { }
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(SurfaceHolder surfaceholder, int i1, int j1)
    {
        n();
        y = surfaceholder;
        h.setPreviewDisplay(y);
        m.a(h, i1, j1);
        a(l, false);
    }

    void a(AutoFocusResultListener autofocusresultlistener)
    {
        q.add(autofocusresultlistener);
    }

    public void a(PreviewProcessRawDataDelegate previewprocessrawdatadelegate)
    {
        G = previewprocessrawdatadelegate;
    }

    public void a(ICameraSource.AutoFocusCallback autofocuscallback)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (autofocuscallback == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!r.contains(autofocuscallback))
        {
            r.add(autofocuscallback);
        }
        if (h.isCameraOpen() && !x && u && !v)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        v = true;
        h.autoFocus(new _cls6());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        autofocuscallback;
        obj;
        JVM INSTR monitorexit ;
        throw autofocuscallback;
        autofocuscallback;
        Log.e(b, (new StringBuilder()).append("Focus exception: ").append(autofocuscallback.getMessage()).toString());
          goto _L1
    }

    public void a(Flash flash)
    {
        a(flash, true);
    }

    public void a(List list, int i1, int j1)
    {
        if (!h.isCameraOpen())
        {
            return;
        }
        synchronized (c)
        {
            if (h.isCameraOpen())
            {
                break MISSING_BLOCK_LABEL_43;
            }
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
        ICameraSource.Parameters parameters;
        int k1;
        int l1;
        k1 = android.os.Build.VERSION.SDK_INT;
        parameters = h.getParameters();
        l1 = parameters.getMaxNumFocusAreas();
        if (k1 >= 14 && l1 > 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_UI_FOCUS_AREA_NOT_SUPPORTED);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        if (list.size() > l1)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_FOCUS_AREA_COUNT);
        }
        p = null;
        o = null;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        if (list.size() > 0)
        {
            p = new ArrayList();
            o = new ArrayList();
            Object obj1;
            for (list = list.iterator(); list.hasNext(); o.add(obj1))
            {
                obj1 = (Rect)list.next();
                obj1 = new Rect(((Rect) (obj1)).left, ((Rect) (obj1)).top, ((Rect) (obj1)).right, ((Rect) (obj1)).bottom);
                p.add(obj1);
                obj1 = new ICameraSource.Area(a(((Rect) (obj1)), i1, j1), 1000);
            }

        }
        parameters.setFocusAreas(o);
        h.setParameters(parameters);
        k();
        obj;
        JVM INSTR monitorexit ;
    }

    public boolean a(android.hardware.Camera.Size size)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        List list = g();
        Point point;
        point = null;
        if (size == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        point = new Point(size.width, size.height);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (list.contains(size))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
        size;
        b();
        m.a(h);
        h.setPreviewDisplay(y);
        n();
        i();
        throw size;
        size;
        obj;
        JVM INSTR monitorexit ;
        throw size;
        a();
        j = CameraInitializationEvent.CameraInitStatus.CAMERA_IMAGE_RESOLUTION_CHANGED;
        if (!n)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        m.a(point);
_L1:
        b();
        m.a(h);
        h.setPreviewDisplay(y);
        n();
        i();
        obj;
        JVM INSTR monitorexit ;
        return true;
        m.b(point);
          goto _L1
    }

    public boolean a(boolean flag)
    {
        n = flag;
        m.a(flag);
        if (!h.isCameraOpen())
        {
            return false;
        }
        synchronized (c)
        {
            if (h.isCameraOpen())
            {
                break MISSING_BLOCK_LABEL_54;
            }
        }
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a();
        j = CameraInitializationEvent.CameraInitStatus.CAMERA_USE_VIDEO_FRAME_CHANGED;
        b();
        m.a(h);
        h.setPreviewDisplay(y);
        n();
        i();
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    public void b()
    {
        if (h.isCameraOpen())
        {
            return;
        }
        synchronized (c)
        {
            if (!h.isCameraOpen())
            {
                break MISSING_BLOCK_LABEL_39;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        h.open();
        h.setErrorCallback(z);
        obj;
        JVM INSTR monitorexit ;
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        throw new KmcRuntimeException(ErrorInfo.KMC_UI_CAMERA_OPERATION_FAILURE, runtimeexception);
    }

    void b(AutoFocusResultListener autofocusresultlistener)
    {
        q.remove(autofocusresultlistener);
    }

    public void c()
    {
        a(-1L);
    }

    public android.hardware.Camera.Size d()
    {
        if (!h.isCameraOpen())
        {
            return null;
        }
        synchronized (c)
        {
            if (h.isCameraOpen())
            {
                break MISSING_BLOCK_LABEL_41;
            }
        }
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        android.hardware.Camera.Size size;
        if (!n)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        size = h.makeSize(m.b(h.getParameters()));
        obj;
        JVM INSTR monitorexit ;
        return size;
        size = h.makeSize(m.a(h.getParameters()));
        obj;
        JVM INSTR monitorexit ;
        return size;
    }

    public int e()
    {
        return s;
    }

    public List f()
    {
        if (!h.isCameraOpen())
        {
            return null;
        } else
        {
            return h.getParameters().getSupportedFocusModes();
        }
    }

    public List g()
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        Point point;
        if (n)
        {
            obj = m.c(h.getParameters());
        } else
        {
            obj = m.d(h.getParameters());
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(h.makeSize(point)))
        {
            point = (Point)((Iterator) (obj)).next();
        }

        return arraylist;
    }

    public Point h()
    {
        Point point1 = m.d();
        Point point = point1;
        if (point1 == null)
        {
            point = new Point();
        }
        if (s == 90 || s == -90 || s == 270 || s == -270)
        {
            point.set(point.y, point.x);
        }
        return point;
    }

    void i()
    {
        if (h.isCameraOpen() && u)
        {
            return;
        }
        synchronized (c)
        {
            if (!h.isCameraOpen() || !u)
            {
                break MISSING_BLOCK_LABEL_53;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        m.a(h);
        h.startPreview();
        a.a(F);
        u = true;
        e.post(f.b());
        obj;
        JVM INSTR monitorexit ;
    }

    void j()
    {
        if (!h.isCameraOpen() || !u)
        {
            return;
        }
        synchronized (c)
        {
            if (h.isCameraOpen() && u)
            {
                break MISSING_BLOCK_LABEL_53;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        u = false;
        v = false;
        h.stopPreview();
        a.b(F);
        c();
        obj;
        JVM INSTR monitorexit ;
    }

    public void k()
    {
        a(((ICameraSource.AutoFocusCallback) (null)));
    }


    private class b
    {

        final CameraManager a;

        public BusEvents.PreviewSizeChangedEvent a()
        {
            if (!CameraManager.b(a).isCameraOpen())
            {
                return null;
            } else
            {
                return new BusEvents.PreviewSizeChangedEvent(new Point());
            }
        }

        public void a(BusEvents.CancelAutoFocusRequestEvent cancelautofocusrequestevent)
        {
            CameraManager.a(a, cancelautofocusrequestevent.stamp);
        }

        public void a(BusEvents.CaptureImageRequestEvent captureimagerequestevent)
        {
            CameraManager.a(a);
        }

        public void a(BusEvents.DisplayOrientationChangedEvent displayorientationchangedevent)
        {
            CameraManager.a(a, displayorientationchangedevent.rotation);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                CameraManager.s(a);
            }
        }

        public void a(BusEvents.RequestCameraParametersEvent requestcameraparametersevent)
        {
            if (CameraManager.b(a) == null || !CameraManager.b(a).isCameraOpen())
            {
                return;
            } else
            {
                ICameraSource.Parameters parameters = CameraManager.b(a).getParameters();
                long l1 = requestcameraparametersevent.stamp;
                class _cls1
                    implements Runnable
                {

                    final ICameraSource.Parameters a;
                    final long b;
                    final b c;

                    public void run()
                    {
                        CameraManager.d(c.a).post(new BusEvents.CameraParametersProducedEvent(a, b));
                    }

                _cls1(ICameraSource.Parameters parameters, long l1)
                {
                    c = b.this;
                    a = parameters;
                    b = l1;
                    super();
                }
                }

                (new Handler(CameraManager.e(a).getMainLooper())).post(new _cls1(parameters, l1));
                return;
            }
        }

        public void a(BusEvents.SetCameraParametersEvent setcameraparametersevent)
        {
            ICameraSource.Parameters parameters;
            Handler handler;
            long l1;
            parameters = setcameraparametersevent.parameters;
            l1 = setcameraparametersevent.stamp;
            handler = new Handler(CameraManager.e(a).getMainLooper());
            if (CameraManager.b(a) == null || !CameraManager.b(a).isCameraOpen() || setcameraparametersevent.parameters == null) goto _L2; else goto _L1
_L1:
            CameraManager.b(a).setParameters(setcameraparametersevent.parameters);
            class _cls2
                implements Runnable
            {

                final ICameraSource.Parameters a;
                final long b;
                final b c;

                public void run()
                {
                    CameraManager.d(c.a).post(new BusEvents.CameraParametersAppliedEvent(a, b, true));
                }

                _cls2(ICameraSource.Parameters parameters, long l1)
                {
                    c = b.this;
                    a = parameters;
                    b = l1;
                    super();
                }
            }

            handler.post(new _cls2(parameters, l1));
_L4:
            class _cls5
                implements ICameraSource.AutoFocusMoveCallback
            {

                final b a;

                public void onAutoFocusMoving(boolean flag)
                {
                    CameraManager.d(a.a).post(new BusEvents.AutoFocusMoveCallbackEvent(flag));
                }

                _cls5()
                {
                    a = b.this;
                    super();
                }
            }

            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                CameraManager.b(a).setAutoFocusMoveCallback(new _cls5());
            }
            return;
_L2:
            class _cls3
                implements Runnable
            {

                final ICameraSource.Parameters a;
                final long b;
                final b c;

                public void run()
                {
                    CameraManager.d(c.a).post(new BusEvents.CameraParametersAppliedEvent(a, b, false));
                }

                _cls3(ICameraSource.Parameters parameters, long l1)
                {
                    c = b.this;
                    a = parameters;
                    b = l1;
                    super();
                }
            }

            class _cls4
                implements Runnable
            {

                final ICameraSource.Parameters a;
                final long b;
                final Exception c;
                final b d;

                public void run()
                {
                    CameraManager.d(d.a).post(new BusEvents.CameraParametersAppliedFailedEvent(a, b, c));
                }

                _cls4(ICameraSource.Parameters parameters, long l1, Exception exception)
                {
                    d = b.this;
                    a = parameters;
                    b = l1;
                    c = exception;
                    super();
                }
            }

            try
            {
                handler.post(new _cls3(parameters, l1));
            }
            // Misplaced declaration of an exception variable
            catch (BusEvents.SetCameraParametersEvent setcameraparametersevent)
            {
                handler.post(new _cls4(parameters, l1, setcameraparametersevent));
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void a(BusEvents.SetShutterCallbackEvent setshuttercallbackevent)
        {
            CameraManager.a(a, setshuttercallbackevent.cb);
        }

        public void a(BusEvents.StartAutoFocusRequestEvent startautofocusrequestevent)
        {
            a.a(startautofocusrequestevent.callback);
        }

        public BusEvents.CameraInitializedBusEvent b()
        {
            if (!CameraManager.b(a).isCameraOpen())
            {
                return null;
            } else
            {
                return new BusEvents.CameraInitializedBusEvent(this, a.d(), CameraManager.t(a));
            }
        }

        private b()
        {
            a = CameraManager.this;
            super();
        }

        b(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements ICameraSource.ErrorCallback
    {

        final CameraManager a;

        public void onError(int i1)
        {
            Log.e(CameraManager.l(), (new StringBuilder()).append("Camera Error: ").append(i1).toString());
            if (i1 == 100)
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_UI_CAMERA_OPERATION_FAILURE);
            }
            synchronized (CameraManager.m())
            {
                CameraManager.a(a, false);
                CameraManager.a(a);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls1()
        {
            a = CameraManager.this;
            super();
        }
    }


    private class _cls2
        implements ICameraSource.PictureCallback
    {

        final CameraManager a;

        public void onPictureTaken(byte abyte0[])
        {
            ICameraSource.Parameters parameters = CameraManager.b(a).getParameters();
            Point point = parameters.getPictureSize();
            int i1 = parameters.getPictureFormat();
            class _cls1
                implements Runnable
            {

                final byte a[];
                final Point b;
                final int c;
                final _cls2 d;

                public void run()
                {
                    android.graphics.Bitmap bitmap = Utility.imageDataToBitmap(a, b.x, b.y, c, CameraManager.c(d.a));
                    CameraManager.d(d.a).post(new BusEvents.ImageCapturedBusEvent(bitmap));
                }

                _cls1(byte abyte0[], Point point, int i1)
                {
                    d = _cls2.this;
                    a = abyte0;
                    b = point;
                    c = i1;
                    super();
                }
            }

            (new Handler(CameraManager.e(a).getMainLooper())).post(new _cls1(abyte0, point, i1));
        }

        _cls2()
        {
            a = CameraManager.this;
            super();
        }
    }


    private class _cls3
        implements ICameraSource.ShutterCallback
    {

        final CameraManager a;

        public boolean onShutter()
        {
            ICameraSource.ShutterCallback shuttercallback = CameraManager.f(a);
            if (shuttercallback != null)
            {
                CameraManager.b(a, shuttercallback.onShutter());
            } else
            {
                CameraManager.b(a, true);
            }
            return false;
        }

        _cls3()
        {
            a = CameraManager.this;
            super();
        }
    }


    private class _cls4
        implements ICameraSource.PictureCallback
    {

        final CameraManager a;

        public void onPictureTaken(byte abyte0[])
        {
            Object obj = CameraManager.m();
            obj;
            JVM INSTR monitorenter ;
            Log.d(CameraManager.l(), "Photo taken");
            CameraManager.g(a).onPictureTaken(abyte0);
            if (CameraManager.h(a))
            {
                CameraManager.b(a).startPreview();
                a.a(CameraManager.i(a));
            }
            CameraManager.c(a, false);
            CameraManager.a(a, false);
            obj;
            JVM INSTR monitorexit ;
            return;
            abyte0;
            CameraManager.c(a, false);
            CameraManager.a(a, false);
            throw abyte0;
            abyte0;
            obj;
            JVM INSTR monitorexit ;
            throw abyte0;
        }

        _cls4()
        {
            a = CameraManager.this;
            super();
        }
    }


    private class _cls5
        implements ICameraSource.AutoFocusCallback
    {

        final CameraManager a;

        public void onAutoFocus(boolean flag)
        {
label0:
            {
                synchronized (CameraManager.m())
                {
                    if (CameraManager.j(a) != null)
                    {
                        ICameraSource.Parameters parameters = CameraManager.b(a).getParameters();
                        parameters.setFlashMode(CameraManager.j(a));
                        CameraManager.a(a, null);
                        CameraManager.b(a).setParameters(parameters);
                    }
                    if (!CameraManager.k(a))
                    {
                        break label0;
                    }
                    Log.d(CameraManager.l(), "Unexpected auto-focus callback");
                }
                return;
            }
            CameraManager.d(a, false);
            if (!CameraManager.l(a))
            {
                break MISSING_BLOCK_LABEL_120;
            }
            CameraManager.a(a);
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            Iterator iterator = CameraManager.m(a).iterator();
            while (iterator.hasNext()) 
            {
                ((AutoFocusResultListener)iterator.next()).onAutoFocus(new AutoFocusResultEvent(this, flag));
            }
              goto _L1
        }

        _cls5()
        {
            a = CameraManager.this;
            super();
        }
    }


    private class a
        implements ICameraSource.PreviewCallback
    {

        final CameraManager a;
        private byte b[];
        private boolean c;
        private Lock d;

        private void a()
        {
label0:
            {
                synchronized (CameraManager.m())
                {
                    if (!c)
                    {
                        break label0;
                    }
                }
                return;
            }
            ICameraSource.Parameters parameters = CameraManager.b(a).getParameters();
            int i1 = 0;
            Iterator iterator = parameters.getSupportedPreviewSizes().iterator();
_L1:
            int j1;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_100;
            }
            Point point = (Point)iterator.next();
            j1 = point.x;
            j1 = point.y * j1;
            if (j1 > i1)
            {
                i1 = j1;
            }
              goto _L1
            double d1 = (double)ImageFormat.getBitsPerPixel(parameters.getPreviewFormat()) / 8D;
            b = new byte[(int)Math.ceil((double)i1 * d1)];
            d = new ReentrantLock();
            CameraManager.b(a).setPreviewCallbackWithBuffer(this, d);
            CameraManager.b(a).addCallbackBuffer(b);
            c = true;
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        static void a(a a1)
        {
            a1.a();
        }

        private void b()
        {
            synchronized (CameraManager.m())
            {
                CameraManager.b(a).setPreviewCallbackWithBuffer(null, null);
                CameraManager.b(a).setPreviewCallback(null);
                CameraManager.b(a).addCallbackBuffer(null);
                c = false;
                b = null;
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        static void b(a a1)
        {
            a1.b();
        }

        public void onPreviewFrame(byte abyte0[])
        {
label0:
            {
                synchronized (CameraManager.m())
                {
                    if (c && !CameraManager.p(a))
                    {
                        break label0;
                    }
                }
                return;
            }
            Point point;
            CameraManager.e(a, true);
            point = CameraManager.q(a).d();
            if (CameraManager.r(a) == null) goto _L2; else goto _L1
_L1:
            CameraManager.r(a).Process(abyte0, CameraManager.q(a).b(), point.x, point.y);
_L3:
            CameraManager.e(a, false);
            if (c)
            {
                CameraManager.b(a).addCallbackBuffer(b);
            }
            obj;
            JVM INSTR monitorexit ;
            return;
            abyte0;
            obj;
            JVM INSTR monitorexit ;
            throw abyte0;
_L2:
            CameraManager.d(a).post(new BusEvents.PreviewImageReadyBusEvent(abyte0, point.x, point.y, CameraManager.c(a), d));
              goto _L3
            abyte0;
            Log.e(CameraManager.l(), "Error delivering preview frame", abyte0.getCause());
              goto _L3
        }

        private a()
        {
            a = CameraManager.this;
            super();
            c = false;
            d = new ReentrantLock();
        }

        a(_cls1 _pcls1)
        {
            this();
        }

        private class PreviewProcessRawDataDelegate
        {

            public abstract void Process(byte abyte0[], int i1, int j1, int k1);
        }

    }


    private class _cls7
    {

        static final int a[];

        static 
        {
            a = new int[Flash.values().length];
            try
            {
                a[Flash.AUTO.ordinal()] = 1;
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
                a[Flash.OFF.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls6
        implements ICameraSource.AutoFocusCallback
    {

        final CameraManager a;

        public void onAutoFocus(boolean flag)
        {
            Object obj = CameraManager.m();
            obj;
            JVM INSTR monitorenter ;
            CameraManager.n(a).onAutoFocus(flag);
            for (Iterator iterator = CameraManager.o(a).iterator(); iterator.hasNext(); ((ICameraSource.AutoFocusCallback)iterator.next()).onAutoFocus(flag)) { }
            break MISSING_BLOCK_LABEL_64;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            CameraManager.o(a).clear();
            obj;
            JVM INSTR monitorexit ;
        }

        _cls6()
        {
            a = CameraManager.this;
            super();
        }
    }

}
