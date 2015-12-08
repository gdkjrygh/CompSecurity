// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            s, f, g, i, 
//            Focus_Infinity, h

class Focus_Manager
{

    private static final List h = new ArrayList();
    private final IFocus a;
    private final IFocus b;
    private final IFocus c;
    private final IFocus d;
    private final IFocus e;
    private final IFocus f;
    private final Map g = new HashMap();
    private final Bus i;
    private IFocus j;
    private ICameraSource.Parameters k;
    private ICameraSource.FocusMode l;

    public Focus_Manager(Context context, Bus bus)
    {
        j = null;
        k = null;
        l = null;
        if (bus == null)
        {
            i = s.a(context);
        } else
        {
            i = bus;
        }
        i.register(this);
        h.add(ICameraSource.FocusMode.AUTO);
        h.add(ICameraSource.FocusMode.CONTINUOUS_PICTURE);
        h.add(ICameraSource.FocusMode.CONTINUOUS_VIDEO);
        a = new f(bus);
        b = new g(bus, ICameraSource.FocusMode.CONTINUOUS_VIDEO);
        c = new g(bus, ICameraSource.FocusMode.CONTINUOUS_PICTURE);
        d = new i(bus, ICameraSource.FocusMode.CONTINUOUS_VIDEO);
        e = new i(bus, ICameraSource.FocusMode.CONTINUOUS_PICTURE);
        f = new Focus_Infinity(bus);
        g.put("SAMSUNG-SM-G900A", d);
        g.put("LG-E970", a);
        g.put("LG-E980", a);
        g.put("HTC One max", b);
        g.put("samsung", a);
        g.put("LT30at", a);
        g.put("LG-D850", com.kofax.kmc.kui.uicontrols.h.b(bus));
        g.put("c6806_GPe", c);
        g.put("XT1034", c);
        g.put("B8000-F", c);
    }

    private void a()
    {
        Object obj;
        Object obj1;
        String s1;
        if (k == null)
        {
            return;
        }
        if (j != null)
        {
            try
            {
                j.stop();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("FOCUS_LOGGER", "Failed to remove focus strategy", ((Throwable) (obj)));
            }
            j = null;
        }
        i.post(new BusEvents.FocusChangedEvent(false));
        obj = k.getSupportedFocusModes();
        obj1 = Build.MODEL;
        s1 = Build.MANUFACTURER;
        if (l == null) goto _L2; else goto _L1
_L1:
        if (!((List) (obj)).contains(l))
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_CAMERA_OPERATION_FAILURE, new Exception((new StringBuilder()).append("Focus mode '").append(l).append("' not supported").toString()));
        }
        _cls1.a[l.ordinal()];
        JVM INSTR tableswitch 1 6: default 188
    //                   1 202
    //                   2 213
    //                   3 224
    //                   4 235
    //                   5 246
    //                   6 257;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        j.start(k);
        return;
_L4:
        j = a;
        continue; /* Loop/switch isn't completed */
_L5:
        j = e;
        continue; /* Loop/switch isn't completed */
_L6:
        j = d;
        continue; /* Loop/switch isn't completed */
_L7:
        j = c;
        continue; /* Loop/switch isn't completed */
_L8:
        j = b;
        continue; /* Loop/switch isn't completed */
_L9:
        j = f;
        continue; /* Loop/switch isn't completed */
_L2:
        boolean flag;
        if (g.containsKey(obj1))
        {
            j = (IFocus)g.get(obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (g.containsKey(s1))
        {
            j = (IFocus)g.get(s1);
            continue; /* Loop/switch isn't completed */
        }
        obj1 = h.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
        } while (!((List) (obj)).contains((ICameraSource.FocusMode)((Iterator) (obj1)).next()));
        flag = true;
_L11:
        if (flag)
        {
            j = a;
        } else
        {
            j = f;
        }
        if (true) goto _L3; else goto _L10
_L10:
        flag = false;
          goto _L11
        if (true) goto _L3; else goto _L12
_L12:
    }

    public void a(BusEvents.CameraInitializedBusEvent camerainitializedbusevent)
    {
        i.post(new BusEvents.RequestCameraParametersEvent(0L));
    }

    public void a(BusEvents.CameraParametersProducedEvent cameraparametersproducedevent)
    {
        k = cameraparametersproducedevent.parameters;
        if (k == null)
        {
            return;
        } else
        {
            a();
            return;
        }
    }

    public void a(BusEvents.FocusModeChangedEvent focusmodechangedevent)
    {
        l = focusmodechangedevent.mode;
        a();
    }

    public void a(BusEvents.SurfaceChangedEvent surfacechangedevent)
    {
        if (!surfacechangedevent.hasSurface)
        {
            k = null;
            if (j != null)
            {
                i.unregister(j);
                j = null;
                return;
            }
        }
    }


    private class IFocus
    {

        public abstract void start(ICameraSource.Parameters parameters);

        public abstract void stop();
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[ICameraSource.FocusMode.values().length];
            try
            {
                a[ICameraSource.FocusMode.AUTO.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[ICameraSource.FocusMode.DELAYED_CONTINUOUS_PICTURE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[ICameraSource.FocusMode.DELAYED_CONTINUOUS_VIDEO.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[ICameraSource.FocusMode.CONTINUOUS_PICTURE.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[ICameraSource.FocusMode.CONTINUOUS_VIDEO.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[ICameraSource.FocusMode.INFINITY.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
