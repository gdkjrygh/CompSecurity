// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager

class a
    implements toFocusCallback
{

    final CameraManager a;

    public void onAutoFocus(boolean flag)
    {
        Object obj = CameraManager.m();
        obj;
        JVM INSTR monitorenter ;
        CameraManager.n(a).onAutoFocus(flag);
        for (Iterator iterator = CameraManager.o(a).iterator(); iterator.hasNext(); ((toFocusCallback)iterator.next()).onAutoFocus(flag)) { }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        CameraManager.o(a).clear();
        obj;
        JVM INSTR monitorexit ;
    }

    toFocusCallback(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
    }
}
