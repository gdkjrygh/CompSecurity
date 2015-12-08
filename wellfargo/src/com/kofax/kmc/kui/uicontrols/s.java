// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.hardware.SensorManager;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            KfxPageDetector, p, n, ICaptureConstraint_RealtimeVideo, 
//            ICaptureConstraint_PageDetect, o, m, ICaptureConstraint_Levelness, 
//            ICaptureConstraint_Stability, e, q, d, 
//            Focus_Manager, IPageDetector

class s extends Bus
{

    private static final Map d = new HashMap();
    final p a;
    final Context b;
    final IPageDetector c;

    private s(Context context)
    {
        this(context, true);
    }

    protected s(Context context, boolean flag)
    {
        this(context, flag, null);
    }

    protected s(Context context, boolean flag, IPageDetector ipagedetector)
    {
        super(ThreadEnforcer.ANY);
        b = context;
        if (flag)
        {
            if (b == null)
            {
                throw new IllegalArgumentException("ctx cannot be null");
            }
            context = ipagedetector;
            if (ipagedetector == null)
            {
                context = new KfxPageDetector();
            }
            c = context;
            a = new p(this);
            b();
            c();
            return;
        } else
        {
            c = null;
            a = null;
            return;
        }
    }

    public static s a(Context context)
    {
        s s2 = (s)d.get(context);
        s s1 = s2;
        if (s2 == null)
        {
            s1 = b(context);
        }
        return s1;
    }

    static Map a()
    {
        return d;
    }

    private static s b(Context context)
    {
        s s1 = new s(context);
        d.put(context, s1);
        s1.register(s1. new _cls1());
        return s1;
    }

    private void b()
    {
        a.a(new n(b, this));
        a.a(new ICaptureConstraint_RealtimeVideo(b, this));
        a.a(new ICaptureConstraint_PageDetect(b, this, c));
        a.a(new o(b, this));
        a.a(new m(b, this));
        a.a(new ICaptureConstraint_Levelness(b, this));
        a.a(new ICaptureConstraint_Stability(b, this));
    }

    private void c()
    {
        new e(b, this);
        new q(this);
        new d(b, (SensorManager)b.getSystemService("sensor"), this);
        new a(this);
        new Focus_Manager(b, this);
    }

    public void post(Object obj)
    {
        super.post(obj);
_L1:
        return;
        obj;
        while (obj != null) 
        {
            if (obj instanceof KmcRuntimeException)
            {
                throw (KmcRuntimeException)obj;
            }
            obj = (Exception)((Exception) (obj)).getCause();
        }
          goto _L1
    }

    public void register(Object obj)
    {
        super.register(obj);
_L1:
        return;
        obj;
        while (obj != null) 
        {
            if (obj instanceof KmcRuntimeException)
            {
                throw (KmcRuntimeException)obj;
            }
            obj = (Exception)((Exception) (obj)).getCause();
        }
          goto _L1
    }

    public void unregister(Object obj)
    {
        super.unregister(obj);
    }


    private class _cls1
    {

        final s a;

        public void a(BusEvents.DetachedFromWindowEvent detachedfromwindowevent)
        {
            s.a().remove(a.b);
        }

        _cls1()
        {
            a = s.this;
            super();
        }
    }


    private class a
    {

        final s a;
        private final Bus b;

        public void a(BusEvents.LogEvent logevent)
        {
            switch (_cls2.a[logevent.lvl.ordinal()])
            {
            default:
                Log.v(logevent.tag, logevent.message);
                return;

            case 1: // '\001'
                Log.d(logevent.tag, logevent.message);
                return;

            case 2: // '\002'
                Log.e(logevent.tag, logevent.message, logevent.exception);
                break;
            }
        }

        public void a(BusEvents.PreviewSizeChangedEvent previewsizechangedevent)
        {
            Log.v("EventBus", (new StringBuilder()).append("New preview size: ").append(previewsizechangedevent.size.x).append("x").append(previewsizechangedevent.size.y).toString());
        }

        public a(Bus bus)
        {
            a = s.this;
            super();
            b = bus;
            b.register(this);
        }

        private class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[BusEvents.LogEvent.Level.values().length];
                try
                {
                    a[BusEvents.LogEvent.Level.DEBUG.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[BusEvents.LogEvent.Level.ERROR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[BusEvents.LogEvent.Level.VERBOSE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }

}
