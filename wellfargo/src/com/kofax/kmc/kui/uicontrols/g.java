// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.os.Handler;
import android.os.Looper;
import com.squareup.otto.Bus;

class g
    implements Focus_Manager.IFocus
{

    private static final long a = 3000L;
    private final Bus b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private ICameraSource.Parameters h;
    private long i;
    private long j;
    private Handler k;
    private final ICameraSource.FocusMode l;
    private final Runnable m = new _cls2();

    public g(Bus bus, ICameraSource.FocusMode focusmode)
    {
        i = -1L;
        j = System.currentTimeMillis();
        b = bus;
        if (focusmode != ICameraSource.FocusMode.CONTINUOUS_PICTURE && focusmode != ICameraSource.FocusMode.CONTINUOUS_VIDEO)
        {
            throw new IllegalArgumentException("mode must either be CONTINUOUS_VIDEO or CONTINUOUS_PICTURE");
        } else
        {
            l = focusmode;
            return;
        }
    }

    static long a(g g1, long l1)
    {
        g1.i = l1;
        return l1;
    }

    static Bus a(g g1)
    {
        return g1.b;
    }

    private void a()
    {
        i = System.currentTimeMillis();
        b.post(new BusEvents.StartAutoFocusRequestEvent(new _cls1()));
    }

    static boolean a(g g1, boolean flag)
    {
        g1.g = flag;
        return flag;
    }

    static long b(g g1, long l1)
    {
        g1.j = l1;
        return l1;
    }

    static Handler b(g g1)
    {
        return g1.k;
    }

    static boolean b(g g1, boolean flag)
    {
        g1.e = flag;
        return flag;
    }

    static long c(g g1)
    {
        return g1.j;
    }

    static void d(g g1)
    {
        g1.a();
    }

    static boolean e(g g1)
    {
        return g1.e;
    }

    public void a(BusEvents.AutoFocusMoveCallbackEvent autofocusmovecallbackevent)
    {
        e = autofocusmovecallbackevent.start;
        if (!f && e && g)
        {
            b.post(new BusEvents.FocusChangedEvent(false));
        }
        if (System.currentTimeMillis() - i > 3000L)
        {
            b.post(new BusEvents.CancelAutoFocusRequestEvent());
            a();
        }
        if (f && !e && i < 0L)
        {
            a();
        }
        f = e;
        return;
        autofocusmovecallbackevent;
        f = e;
        throw autofocusmovecallbackevent;
    }

    public void a(BusEvents.StabilityChangedEvent stabilitychangedevent)
    {
        boolean flag = false;
        if (stabilitychangedevent.stability > 90)
        {
            flag = true;
        }
        c = flag;
        if (d && !c)
        {
            g = false;
            b.post(new BusEvents.FocusChangedEvent(false));
        }
        d = c;
        return;
        stabilitychangedevent;
        d = c;
        throw stabilitychangedevent;
    }

    public void a(BusEvents.SurfaceChangedEvent surfacechangedevent)
    {
        if (surfacechangedevent.hasSurface)
        {
            k = new Handler(Looper.getMainLooper());
            k.post(m);
            return;
        } else
        {
            k = null;
            return;
        }
    }

    public void start(ICameraSource.Parameters parameters)
    {
        h = parameters;
        b.register(this);
        h.setFocusMode(l);
        b.post(new BusEvents.SetCameraParametersEvent(h));
        b.post(new BusEvents.CancelAutoFocusRequestEvent());
    }

    public void stop()
    {
        k.removeCallbacks(m);
        b.unregister(this);
    }

    private class _cls2
        implements Runnable
    {

        long a;
        boolean b;
        final g c;

        public void run()
        {
            Handler handler;
            long l1;
            handler = g.b(c);
            l1 = System.currentTimeMillis();
            if (l1 - g.c(c) > 3000L)
            {
                g.d(c);
                g.b(c, l1);
            }
            if (!g.e(c) || b) goto _L2; else goto _L1
_L1:
            g.b(c, l1);
            a = l1 + 3000L;
            b = true;
_L4:
            if (handler != null)
            {
                handler.postDelayed(this, 300L);
            }
            return;
_L2:
            if (!g.e(c))
            {
                b = false;
            } else
            if (g.e(c) && b && l1 > a)
            {
                g g1 = c;
                b = false;
                g.b(g1, false);
                g.a(c).post(new BusEvents.CancelAutoFocusRequestEvent());
                g.d(c);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls2()
        {
            c = g.this;
            super();
            a = 0L;
            b = false;
        }
    }


    private class _cls1
        implements ICameraSource.AutoFocusCallback
    {

        final g a;

        public void onAutoFocus(boolean flag)
        {
            g.a(a, -1L);
            g.a(a).post(new BusEvents.CancelAutoFocusRequestEvent());
            g.a(a).post(new BusEvents.FocusChangedEvent(flag));
            g.a(a, flag);
        }

        _cls1()
        {
            a = g.this;
            super();
        }
    }

}
