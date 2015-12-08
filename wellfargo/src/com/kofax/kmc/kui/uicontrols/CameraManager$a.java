// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.ImageFormat;
import android.graphics.Point;
import android.util.Log;
import com.squareup.otto.Bus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager, ICameraSource, a

class <init>
    implements eviewCallback
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
        rameters rameters = CameraManager.b(a).getParameters();
        int i = 0;
        Iterator iterator = rameters.getSupportedPreviewSizes().iterator();
_L1:
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        Point point = (Point)iterator.next();
        j = point.x;
        j = point.y * j;
        if (j > i)
        {
            i = j;
        }
          goto _L1
        double d1 = (double)ImageFormat.getBitsPerPixel(rameters.getPreviewFormat()) / 8D;
        b = new byte[(int)Math.ceil((double)i * d1)];
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

    static void a(c c1)
    {
        c1.a();
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

    static void b(b b1)
    {
        b1.b();
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
        CameraManager.d(a).post(new wImageReadyBusEvent(abyte0, point.x, point.y, CameraManager.c(a), d));
          goto _L3
        abyte0;
        Log.e(CameraManager.l(), "Error delivering preview frame", abyte0.getCause());
          goto _L3
    }

    private wImageReadyBusEvent(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
        c = false;
        d = new ReentrantLock();
    }

    t>(CameraManager cameramanager, t> t>)
    {
        this(cameramanager);
    }
}
