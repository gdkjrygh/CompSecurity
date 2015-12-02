// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;


// Referenced classes of package com.whatsapp.camera:
//            s, CameraView

class o
    implements android.hardware.Camera.ShutterCallback
{

    final s a;
    final CameraView b;

    o(CameraView cameraview, s s1)
    {
        b = cameraview;
        a = s1;
        super();
    }

    public void onShutter()
    {
        a.a();
    }
}
