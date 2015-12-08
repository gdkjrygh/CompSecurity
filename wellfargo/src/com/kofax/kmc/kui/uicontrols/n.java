// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            l, s

class n
    implements l
{

    private final Bus a;
    private l b;
    private boolean c;
    private boolean d;
    private BusEvents.PreviewImageReadyBusEvent e;
    private Bitmap f;
    private boolean g;
    private boolean h;

    public n(Context context, Bus bus)
    {
        Object obj = bus;
        if (bus == null)
        {
            obj = s.a(context);
        }
        a = ((Bus) (obj));
        a.register(this);
    }

    private void a(Bitmap bitmap)
    {
        a.post(new BusEvents.ImageCapturedBusEvent(bitmap));
        g();
    }

    private boolean a()
    {
        return d && !g || h;
    }

    static boolean a(n n1, boolean flag)
    {
        n1.h = flag;
        return flag;
    }

    private void b()
    {
        e = null;
        f = null;
    }

    static boolean b(n n1, boolean flag)
    {
        n1.c = flag;
        return flag;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            d();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (!d) goto _L2; else goto _L1
_L1:
        f();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void e()
    {
        a.post(new BusEvents.CaptureImageRequestEvent());
        g();
    }

    private void f()
    {
        Bitmap bitmap = h();
        if (bitmap != null)
        {
            a(bitmap);
        }
    }

    private void g()
    {
        b();
        c = false;
        h = false;
    }

    private Bitmap h()
    {
        Object obj = null;
        Bitmap bitmap;
        if (f != null)
        {
            bitmap = f;
        } else
        if (e != null)
        {
            bitmap = e.getBitmap(true);
        } else
        {
            bitmap = null;
        }
        if (bitmap != null && bitmap.isRecycled())
        {
            b();
            bitmap = obj;
        }
        return Bitmap.createBitmap(bitmap);
    }

    public void a(BusEvents.DetachedFromWindowEvent detachedfromwindowevent)
    {
        b();
    }

    public void a(BusEvents.FocusChangedEvent focuschangedevent)
    {
        g = false;
    }

    public void a(BusEvents.ForceCaptureRequestedEvent forcecapturerequestedevent)
    {
        if (forcecapturerequestedevent.tryFocusAgain)
        {
            a.post(new BusEvents.FocusModeChangedEvent(ICameraSource.FocusMode.AUTO));
            a.post(new BusEvents.StartAutoFocusRequestEvent(new _cls1()));
            return;
        } else
        {
            c = true;
            c();
            return;
        }
    }

    public void a(BusEvents.ImageCapturedBusEvent imagecapturedbusevent)
    {
        b();
    }

    public void a(BusEvents.PageDetectionBusEvent pagedetectionbusevent)
    {
        if (!a())
        {
            return;
        } else
        {
            b();
            f = pagedetectionbusevent.image;
            c();
            return;
        }
    }

    public void a(BusEvents.PreviewImageReadyBusEvent previewimagereadybusevent)
    {
        if (!a())
        {
            return;
        } else
        {
            b();
            e = previewimagereadybusevent;
            c();
            return;
        }
    }

    public void a(BusEvents.StartAutoFocusRequestEvent startautofocusrequestevent)
    {
        g = true;
        b();
    }

    public void a(BusEvents.UseVideoChangedEvent usevideochangedevent)
    {
        d = usevideochangedevent.useVideo;
        c();
    }

    public boolean isMet(BusEvents.PreviewImageReadyBusEvent previewimagereadybusevent)
    {
        l l1 = b;
        if (l1 != null)
        {
            return l1.isMet(previewimagereadybusevent);
        } else
        {
            return c;
        }
    }

    public void setNext(l l1)
    {
        b = l1;
    }

    private class _cls1
        implements ICameraSource.AutoFocusCallback
    {

        final n a;

        public void onAutoFocus(boolean flag)
        {
            n.a(a, true);
            n.b(a, true);
        }

        _cls1()
        {
            a = n.this;
            super();
        }
    }

}
