// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.photo;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.FrameLayout;
import cwo;
import gzl;
import gzm;
import gzn;
import gzo;
import gzp;
import gzq;
import gzr;
import gzs;
import gzt;
import gzu;
import gzv;
import gzw;
import gzx;
import gzy;
import gzz;
import haf;
import han;
import hao;
import java.util.HashMap;

// Referenced classes of package com.ubercab.photo:
//            PhotoMask, CameraControls, ReviewControls

public class CameraView extends FrameLayout
    implements android.hardware.Camera.FaceDetectionListener, SensorEventListener, gzn, gzr, hao
{

    boolean a;
    boolean b;
    SensorManager c;
    Camera d;
    gzq e;
    int f;
    gzw g;
    haf h;
    int i;
    private boolean j;
    private gzm k;
    private han l;
    private android.hardware.Camera.CameraInfo m;
    private gzu n;
    private gzs o;
    private gzz p;
    private gzv q;
    private gzx r;
    private HashMap s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public CameraView(Context context)
    {
        this(context, null);
    }

    public CameraView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CameraView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        f = 0;
        g = gzw.a;
        i = gzy.d;
        p = gzz.a;
        q = gzv.a;
        r = gzx.a;
        s = new HashMap();
        x = 90;
        y = 2000;
        z = 2000;
        s = new HashMap();
        s.put(gzt.a, "auto");
        s.put(gzt.b, "auto");
        a(new PhotoMask(getContext()));
        a(new CameraControls(getContext()));
        a(new ReviewControls(getContext()));
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    static gzu a(CameraView cameraview)
    {
        return cameraview.n;
    }

    static void a(CameraView cameraview, gzo gzo1)
    {
        cameraview.b(gzo1);
    }

    private void a(gzm gzm1)
    {
        if (k != null && k.c() != null)
        {
            removeView(k.c());
        }
        k = gzm1;
        if (k != null)
        {
            k.a(this);
            addView(k.c(), getChildCount());
        }
    }

    private void a(han han1)
    {
        l = han1;
        l.a(this);
    }

    static void b(CameraView cameraview)
    {
        cameraview.n();
    }

    private void b(gzo gzo1)
    {
        if (n != null)
        {
            n.a(gzo1);
        }
    }

    static int c(CameraView cameraview)
    {
        return cameraview.t;
    }

    static int d(CameraView cameraview)
    {
        return cameraview.u;
    }

    private boolean d(int i1)
    {
        return q.equals(gzv.b) || q.equals(gzv.d) && i1 == 0 || q.equals(gzv.c) && 1 == i1;
    }

    static gzm e(CameraView cameraview)
    {
        return cameraview.k;
    }

    private boolean e(int i1)
    {
        return r.equals(gzx.b) || r.equals(gzx.d) && i1 == 0 || r.equals(gzx.c) && 1 == i1;
    }

    static boolean f(CameraView cameraview)
    {
        return cameraview.j;
    }

    static android.hardware.Camera.CameraInfo g(CameraView cameraview)
    {
        return cameraview.m;
    }

    static gzz h(CameraView cameraview)
    {
        return cameraview.p;
    }

    static int i(CameraView cameraview)
    {
        return cameraview.x;
    }

    static void j(CameraView cameraview)
    {
        cameraview.m();
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera = d;
        if (camera == null) goto _L2; else goto _L1
_L1:
        r();
        p();
        d.setPreviewCallback(null);
        d.stopPreview();
        d.release();
_L4:
        if (e != null)
        {
            e.getHolder().removeCallback(e);
            removeView(e);
        }
        e = null;
        d = null;
        if (k != null)
        {
            k.a(false);
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        if (n == null) goto _L4; else goto _L3
_L3:
        n.a(gzo.b("An error occurred while releasing the camera.", ((Throwable) (obj))));
          goto _L4
        obj;
        throw obj;
    }

    private void m()
    {
        if (d == null || !a || i != gzy.d)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        c(gzy.b);
        d.autoFocus(new _cls3());
_L1:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        if (n != null)
        {
            c(gzy.d);
            n.a(gzo.a(gzt.a, "Error trying to request autofocus from tap"));
            return;
        }
          goto _L1
    }

    private void n()
    {
        d.takePicture(null, null, new _cls4());
_L1:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        if (n != null)
        {
            n.a(gzo.b("Error trying to take picture.", runtimeexception));
            return;
        }
          goto _L1
    }

    private boolean o()
    {
        if (d != null)
        {
            if (d.getParameters().getMaxNumDetectedFaces() > 0)
            {
                d.setFaceDetectionListener(this);
                return true;
            }
            q = gzv.a;
            if (n != null)
            {
                n.a(gzo.a("Face detection is not supported."));
                return false;
            }
        }
        return false;
    }

    private void p()
    {
        v = 0;
        if (d != null && !q.equals(gzv.a))
        {
            d.stopFaceDetection();
            d.setFaceDetectionListener(null);
        }
    }

    private boolean q()
    {
        c = (SensorManager)getContext().getSystemService("sensor");
        Sensor sensor = c.getDefaultSensor(5);
        if (!c.registerListener(this, sensor, 2))
        {
            r = gzx.a;
            c = null;
            if (n != null)
            {
                n.a(gzo.b("Light detection is not supported"));
            }
            return false;
        } else
        {
            return true;
        }
    }

    private void r()
    {
        w = 0;
        if (c != null)
        {
            c.unregisterListener(this);
            c = null;
        }
    }

    private void s()
    {
        d = cwo.a(f);
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        m = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(f, m);
        if (e(f))
        {
            q();
        }
        boolean flag;
        if (d(f) && o())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e == null)
        {
            e = new gzq(getContext(), d, m, y, z, s, this, flag);
            e.setOnClickListener(new _cls6());
            addView(e, 0);
        } else
        {
            e.getHolder().addCallback(e);
            e.a(d, m, flag);
        }
        a = "auto".equals(d.getParameters().getFocusMode());
        if (i != gzy.c)
        {
            c(gzy.d);
        }
_L2:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        if (n == null) goto _L2; else goto _L1
_L1:
        n.a(gzo.b("An error occurred while setting up the Camera.", runtimeexception));
        return;
        if (n != null)
        {
            n.a();
        }
        if (o != null)
        {
            o.g();
            return;
        }
          goto _L2
    }

    public final void a()
    {
        if (o != null)
        {
            o.m();
        }
        if (n != null)
        {
            n.b();
        }
    }

    public final void a(int i1)
    {
        if (h != null && h.b() != null)
        {
            h.b().getLayoutParams().height = i1;
        }
    }

    public final void a(int i1, int j1)
    {
        y = i1;
        z = j1;
    }

    public final void a(Bitmap bitmap)
    {
        if (o != null)
        {
            o.q();
        }
        d(bitmap);
    }

    public final void a(gzo gzo1)
    {
        if (gzo1.b() == gzp.a)
        {
            if (n != null)
            {
                n.a(gzo1);
            }
            if (gzt.b.equals(gzo1.a()))
            {
                g = gzw.d;
            }
        }
    }

    public final void a(gzs gzs1)
    {
        o = gzs1;
    }

    public final void a(gzu gzu1)
    {
        n = gzu1;
    }

    public final void a(gzv gzv1)
    {
        q = gzv1;
    }

    public final void a(gzx gzx1)
    {
        r = gzx1;
    }

    public final void a(gzz gzz1)
    {
        p = gzz1;
    }

    public final void a(haf haf1)
    {
        if (h != null && h.b() != null)
        {
            removeView(h.b());
        }
        h = haf1;
        haf1 = h.b();
        int i1;
        if (getChildCount() > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        addView(haf1, i1, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(boolean flag)
    {
        int i1 = 0;
        f = 0;
        if (flag)
        {
            android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
            for (; i1 < Camera.getNumberOfCameras(); i1++)
            {
                Camera.getCameraInfo(i1, camerainfo);
                if (camerainfo.facing == 1)
                {
                    f = i1;
                }
            }

        }
    }

    public final void b()
    {
        r();
        p();
        if (d == null || e == null || k == null || !e.a())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        k.a(true);
        if (!a)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        c(gzy.b);
        d.autoFocus(new _cls1());
_L2:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        if (n == null) goto _L2; else goto _L1
_L1:
        c(gzy.d);
        n.a(gzo.a(gzt.a, "Error trying to request autofocus"));
        return;
        n();
        return;
    }

    public final void b(int i1)
    {
        x = i1;
    }

    public final void b(int i1, int j1)
    {
        t = i1;
        u = j1;
    }

    public final void b(Bitmap bitmap)
    {
        if (l != null && i != gzy.c)
        {
            removeView(l.b());
            addView(l.b());
            l.a(bitmap);
            c(gzy.c);
            if (o != null)
            {
                o.i();
            }
        }
    }

    public final void b(boolean flag)
    {
        b = flag;
    }

    public final void c()
    {
        if (o != null)
        {
            o.r();
        }
        if (d != null && Camera.getNumberOfCameras() > 1 && e != null && e.a())
        {
            g = gzw.a;
            c(gzy.e);
            l();
            if (f == 0)
            {
                f = 1;
            } else
            {
                f = 0;
            }
            s();
        }
    }

    final void c(int i1)
    {
        i = i1;
        if (n != null)
        {
            n.a(i1);
        }
    }

    final void c(Bitmap bitmap)
    {
        (new _cls2()).execute(new Bitmap[] {
            bitmap
        });
    }

    public final void d()
    {
        if (o != null)
        {
            o.p();
        }
        f();
    }

    protected final void d(Bitmap bitmap)
    {
        (new _cls5()).execute(new Bitmap[] {
            bitmap
        });
    }

    public final gzw e()
    {
        Object obj;
        if (o != null)
        {
            o.l();
        }
        obj = g.a();
        android.hardware.Camera.Parameters parameters = d.getParameters();
        _cls7.a[((gzw) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 120
    //                   1 83
    //                   2 100
    //                   3 110;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_110;
_L5:
        d.setParameters(parameters);
_L6:
        g = ((gzw) (obj));
        return ((gzw) (obj));
_L2:
        parameters.setFlashMode("auto");
          goto _L5
        Exception exception;
        exception;
        exception = gzw.d;
          goto _L6
_L3:
        parameters.setFlashMode("on");
          goto _L5
        parameters.setFlashMode("off");
          goto _L5
    }

    public final void f()
    {
        boolean flag1;
        flag1 = false;
        if (i == gzy.d)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        if (l != null && l.b() != null)
        {
            removeView(l.b());
        }
        if (d == null)
        {
            s();
        }
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        d.startPreview();
        if (k != null)
        {
            a(k);
            k.a(false);
        }
        a(h);
        c(gzy.d);
        if (e(f))
        {
            q();
        }
        boolean flag = flag1;
        if (!d(f))
        {
            break MISSING_BLOCK_LABEL_149;
        }
        flag = flag1;
        if (o())
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        d.startFaceDetection();
        if (o != null)
        {
            o.j();
        }
_L1:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        if (n != null)
        {
            n.a(gzo.b("Error trying restart preview.", runtimeexception));
            return;
        }
          goto _L1
    }

    public final gzm g()
    {
        return k;
    }

    public final gzw h()
    {
        return g;
    }

    public final han i()
    {
        return l;
    }

    public final void j()
    {
        l();
    }

    public final void k()
    {
        if (d == null)
        {
            s();
            if (o != null)
            {
                o.j();
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i1)
    {
    }

    public void onFaceDetection(android.hardware.Camera.Face aface[], Camera camera)
    {
        if (aface.length > 0)
        {
            v = aface[0].score;
            return;
        } else
        {
            v = 0;
            return;
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        switch (i1)
        {
        default:
            return super.onKeyDown(i1, keyevent);

        case 4: // '\004'
            break;
        }
        if (i == gzy.c)
        {
            if (o != null)
            {
                o.k();
            }
            f();
            return true;
        } else
        {
            return false;
        }
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        if (5 == sensorevent.sensor.getType())
        {
            w = (int)sensorevent.values[0];
        }
    }

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls7 {}

}
