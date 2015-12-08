// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.squareup.otto.Bus;

class f
    implements Focus_Manager.IFocus
{

    private static final long a = 5000L;
    private final Bus b;
    private boolean c;
    private boolean d;
    private ICameraSource.Parameters e;
    private long f;
    private Handler g;
    private boolean h;
    private final Runnable i = new _cls2();

    public f(Bus bus)
    {
        f = System.currentTimeMillis();
        h = false;
        b = bus;
    }

    static long a(f f1, long l)
    {
        f1.f = l;
        return l;
    }

    static Bus a(f f1)
    {
        return f1.b;
    }

    private void a()
    {
        if (h)
        {
            return;
        } else
        {
            h = true;
            b.post(new BusEvents.FocusChangedEvent(false));
            b.post(new BusEvents.StartAutoFocusRequestEvent(new _cls1()));
            return;
        }
    }

    static boolean a(f f1, boolean flag)
    {
        f1.h = flag;
        return flag;
    }

    static Handler b(f f1)
    {
        return f1.g;
    }

    static long c(f f1)
    {
        return f1.f;
    }

    static void d(f f1)
    {
        f1.a();
    }

    static boolean e(f f1)
    {
        return f1.h;
    }

    public void a(BusEvents.CameraParametersProducedEvent cameraparametersproducedevent)
    {
        if (cameraparametersproducedevent.parameters != null)
        {
            e = cameraparametersproducedevent.parameters;
        }
    }

    public void a(BusEvents.ImageCapturedBusEvent imagecapturedbusevent)
    {
        if (Build.MODEL.equalsIgnoreCase("XT1032"))
        {
            b.post(new BusEvents.CancelAutoFocusRequestEvent());
        }
    }

    public void a(BusEvents.StabilityChangedEvent stabilitychangedevent)
    {
        d = stabilitychangedevent.stable;
        if (c || !d) goto _L2; else goto _L1
_L1:
        a();
_L4:
        c = d;
        return;
_L2:
        if (c && !d)
        {
            b.post(new BusEvents.FocusChangedEvent(false));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(BusEvents.SurfaceChangedEvent surfacechangedevent)
    {
        if (surfacechangedevent.hasSurface)
        {
            g = new Handler(Looper.getMainLooper());
            g.post(i);
            return;
        } else
        {
            g = null;
            return;
        }
    }

    public void start(ICameraSource.Parameters parameters)
    {
        e = parameters;
        b.register(this);
        e.setFocusMode(ICameraSource.FocusMode.AUTO);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            e.setFocusAreas(null);
        }
        b.post(new BusEvents.SetCameraParametersEvent(e));
        b.post(new BusEvents.CancelAutoFocusRequestEvent());
        b.post(new BusEvents.StartAutoFocusRequestEvent());
    }

    public void stop()
    {
        g.removeCallbacks(i);
        b.unregister(this);
    }

    private class _cls2
        implements Runnable
    {

        long a;
        boolean b;
        final f c;

        public void run()
        {
            Handler handler;
            long l;
            handler = f.b(c);
            l = System.currentTimeMillis();
            if (l - f.c(c) > 5000L)
            {
                f.d(c);
                f.a(c, l);
            }
            if (!f.e(c) || b) goto _L2; else goto _L1
_L1:
            f.a(c, l);
            a = l + 5000L;
            b = true;
_L4:
            if (handler != null)
            {
                handler.postDelayed(this, 300L);
            }
            return;
_L2:
            if (!f.e(c))
            {
                b = false;
            } else
            if (f.e(c) && b && l > a)
            {
                f f1 = c;
                b = false;
                f.a(f1, false);
                f.a(c).post(new BusEvents.CancelAutoFocusRequestEvent());
                f.d(c);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls2()
        {
            c = f.this;
            super();
            a = 0L;
            b = false;
        }
    }


    private class _cls1
        implements ICameraSource.AutoFocusCallback
    {

        final f a;

        public void onAutoFocus(boolean flag)
        {
            f.a(a, false);
            if (flag)
            {
                f.a(a).post(new BusEvents.FocusChangedEvent(true));
            }
        }

        _cls1()
        {
            a = f.this;
            super();
        }
    }

}
