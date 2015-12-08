// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager

class a
    implements utterCallback
{

    final CameraManager a;

    public boolean onShutter()
    {
        utterCallback uttercallback = CameraManager.f(a);
        if (uttercallback != null)
        {
            CameraManager.b(a, uttercallback.onShutter());
        } else
        {
            CameraManager.b(a, true);
        }
        return false;
    }

    utterCallback(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
    }
}
