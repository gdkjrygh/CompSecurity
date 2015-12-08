// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.util.Log;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager, ICameraSource

class a
    implements ctureCallback
{

    final CameraManager a;

    public void onPictureTaken(byte abyte0[])
    {
        Object obj = CameraManager.m();
        obj;
        JVM INSTR monitorenter ;
        Log.d(CameraManager.l(), "Photo taken");
        CameraManager.g(a).onPictureTaken(abyte0);
        if (CameraManager.h(a))
        {
            CameraManager.b(a).startPreview();
            a(CameraManager.i(a));
        }
        CameraManager.c(a, false);
        CameraManager.a(a, false);
        obj;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        CameraManager.c(a, false);
        CameraManager.a(a, false);
        throw abyte0;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    ctureCallback(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
    }
}
