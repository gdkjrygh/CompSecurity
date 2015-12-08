// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.os.Handler;
import android.os.Looper;
import com.squareup.otto.Bus;

class i
    implements Focus_Manager.IFocus
{

    private static final int a = 2000;
    private static final Object b = new Object();
    private final i c = this;
    private final Bus d;
    private final Handler e = new Handler(Looper.getMainLooper());
    private final ICameraSource.FocusMode f;
    private boolean g;
    private boolean h;
    private boolean i;
    private ICameraSource.Parameters j;
    private int k;
    private long l;
    private final Runnable m = new _cls1();
    private final ICameraSource.AutoFocusCallback n = new _cls2();

    public i(Bus bus, ICameraSource.FocusMode focusmode)
    {
        k = 2000;
        l = System.currentTimeMillis() + (long)k;
        d = bus;
        if (focusmode != ICameraSource.FocusMode.CONTINUOUS_PICTURE && focusmode != ICameraSource.FocusMode.CONTINUOUS_VIDEO)
        {
            throw new IllegalArgumentException("mode must either be CONTINUOUS_VIDEO or CONTINUOUS_PICTURE");
        } else
        {
            f = focusmode;
            return;
        }
    }

    static long a(i i1)
    {
        return i1.l;
    }

    static Object a()
    {
        return b;
    }

    static Bus b(i i1)
    {
        return i1.d;
    }

    static int c(i i1)
    {
        return i1.k;
    }

    static Handler d(i i1)
    {
        return i1.e;
    }

    static boolean e(i i1)
    {
        return i1.g;
    }

    static ICameraSource.FocusMode f(i i1)
    {
        return i1.f;
    }

    static ICameraSource.Parameters g(i i1)
    {
        return i1.j;
    }

    static i h(i i1)
    {
        return i1.c;
    }

    static Runnable i(i i1)
    {
        return i1.m;
    }

    public void a(BusEvents.CameraParametersProducedEvent cameraparametersproducedevent)
    {
        if (cameraparametersproducedevent.parameters != null)
        {
            j = cameraparametersproducedevent.parameters;
        }
    }

    public void a(BusEvents.FocusDelayChangedEvent focusdelaychangedevent)
    {
        k = focusdelaychangedevent.now;
    }

    public void a(BusEvents.StabilityChangedEvent stabilitychangedevent)
    {
        boolean flag = false;
        if (stabilitychangedevent.stability > 95)
        {
            flag = true;
        }
        h = flag;
        if (!i || h) goto _L2; else goto _L1
_L1:
        l = 0x7fffffffffffffffL;
        d.post(new BusEvents.FocusChangedEvent(false));
_L5:
        i = h;
        return;
_L2:
        if (i || !h) goto _L4; else goto _L3
_L3:
        l = System.currentTimeMillis() + (long)k;
          goto _L5
        stabilitychangedevent;
        i = h;
        throw stabilitychangedevent;
_L4:
        if (!i || !h || System.currentTimeMillis() - l <= (long)k) goto _L5; else goto _L6
_L6:
        l = System.currentTimeMillis() + (long)k;
        d.post(new BusEvents.FocusChangedEvent(false));
        stop();
        start(j);
          goto _L5
    }

    public void start(ICameraSource.Parameters parameters)
    {
        synchronized (b)
        {
            g = true;
            j = parameters;
            j.setFocusMode(ICameraSource.FocusMode.AUTO);
            d.post(new BusEvents.SetCameraParametersEvent(j));
            d.post(new BusEvents.StartAutoFocusRequestEvent(n));
        }
        return;
        parameters;
        obj;
        JVM INSTR monitorexit ;
        throw parameters;
    }

    public void stop()
    {
        synchronized (b)
        {
            g = false;
            e.removeCallbacks(m);
            d.unregister(this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }


    private class _cls1
        implements Runnable
    {

        final i a;

        public void run()
        {
            if (System.currentTimeMillis() > i.a(a))
            {
                i.b(a).post(new BusEvents.FocusChangedEvent(true));
            }
            i.d(a).postDelayed(this, i.c(a) / 2);
        }

        _cls1()
        {
            a = i.this;
            super();
        }
    }


    private class _cls2
        implements ICameraSource.AutoFocusCallback
    {

        final i a;

        public void onAutoFocus(boolean flag)
        {
label0:
            {
                synchronized (i.a())
                {
                    if (i.e(a))
                    {
                        break label0;
                    }
                }
                return;
            }
            i.g(a).setFocusMode(i.f(a));
            i.b(a).post(new BusEvents.SetCameraParametersEvent(i.g(a)));
            i.b(a).post(new BusEvents.CancelAutoFocusRequestEvent());
            i.b(a).register(i.h(a));
            i.d(a).postDelayed(i.i(a), i.c(a));
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls2()
        {
            a = i.this;
            super();
        }
    }

}
