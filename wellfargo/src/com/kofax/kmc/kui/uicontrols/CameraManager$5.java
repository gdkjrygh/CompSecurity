// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.util.Log;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager, ICameraSource, AutoFocusResultListener, AutoFocusResultEvent

class a
    implements toFocusCallback
{

    final CameraManager a;

    public void onAutoFocus(boolean flag)
    {
label0:
        {
            synchronized (CameraManager.m())
            {
                if (CameraManager.j(a) != null)
                {
                    rameters rameters = CameraManager.b(a).getParameters();
                    rameters.setFlashMode(CameraManager.j(a));
                    CameraManager.a(a, null);
                    CameraManager.b(a).setParameters(rameters);
                }
                if (!CameraManager.k(a))
                {
                    break label0;
                }
                Log.d(CameraManager.l(), "Unexpected auto-focus callback");
            }
            return;
        }
        CameraManager.d(a, false);
        if (!CameraManager.l(a))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        CameraManager.a(a);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Iterator iterator = CameraManager.m(a).iterator();
        while (iterator.hasNext()) 
        {
            ((AutoFocusResultListener)iterator.next()).onAutoFocus(new AutoFocusResultEvent(this, flag));
        }
          goto _L1
    }

    vent(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
    }
}
