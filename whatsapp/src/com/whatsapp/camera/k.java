// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import com.whatsapp.App;

// Referenced classes of package com.whatsapp.camera:
//            w, CameraActivity, ZoomOverlay, AutofocusOverlay, 
//            CameraView

class k
    implements w
{

    final CameraActivity a;

    k(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void a()
    {
        CameraActivity.l(a);
    }

    public void a(float f)
    {
        CameraActivity.a(a).b();
    }

    public void a(float f, float f1)
    {
        CameraActivity.n(a).a(f, f1);
    }

    public void a(boolean flag)
    {
        CameraActivity.n(a).a(flag);
    }

    public void b()
    {
        App.b(a, 0x7f0e0081, 1);
        a.finish();
    }

    public void b(float f)
    {
        CameraActivity.a(a).a(f);
    }

    public void c(float f)
    {
        float f2 = CameraActivity.a(a).a();
        if (f2 < 1.0F)
        {
            return;
        }
        float f1 = f;
        if (f > f2)
        {
            f1 = f2;
        }
        int i = Math.round(((float)CameraActivity.g(a).e() * (f1 - 1.0F)) / (f2 - 1.0F));
        i = CameraActivity.g(a).setZoomLevel(i);
        CameraActivity.a(a).a(f1, (float)i / 100F);
    }
}
