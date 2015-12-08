// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.util.Log;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager

class a
    implements rorCallback
{

    final CameraManager a;

    public void onError(int i)
    {
        Log.e(CameraManager.l(), (new StringBuilder()).append("Camera Error: ").append(i).toString());
        if (i == 100)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_CAMERA_OPERATION_FAILURE);
        }
        synchronized (CameraManager.m())
        {
            CameraManager.a(a, false);
            CameraManager.a(a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    xception(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
    }
}
