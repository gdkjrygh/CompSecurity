// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            s

final class e
{

    private final Context a;
    private final Bus b;
    private a c;

    public e(Context context, Bus bus)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("ctx cannot be null");
        }
        a = context;
        Object obj = bus;
        if (bus == null)
        {
            obj = s.a(context);
        }
        b = ((Bus) (obj));
        c = new a(a);
        b.register(c);
    }

    static Context a(e e1)
    {
        return e1.a;
    }

    static Bus b(e e1)
    {
        return e1.b;
    }

    private class a extends OrientationEventListener
    {

        final e a;
        private final Display b;
        private int c;
        private int d;

        public BusEvents.DisplayOrientationChangedEvent a()
        {
            return new BusEvents.DisplayOrientationChangedEvent(c);
        }

        public void a(BusEvents.SurfaceChangedEvent surfacechangedevent)
        {
            if (surfacechangedevent.hasSurface)
            {
                enable();
                return;
            } else
            {
                disable();
                return;
            }
        }

        public void onOrientationChanged(int i)
        {
            c = b.getRotation();
            int j;
            i = c;
            j = d;
            Exception exception;
            if (i != j)
            {
                try
                {
                    e.b(a).post(a());
                }
                catch (RuntimeException runtimeexception) { }
                finally
                {
                    d = c;
                }
            }
            d = c;
            return;
            throw exception;
        }

        public a(Context context)
        {
            a = e.this;
            super(context);
            c = -1;
            d = -1;
            b = ((WindowManager)e.a(e.this).getSystemService("window")).getDefaultDisplay();
            enable();
            onOrientationChanged(-1);
        }
    }

}
