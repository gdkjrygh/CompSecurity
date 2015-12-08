// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraInitializationListener, CameraInitializationEvent

public final class  extends 
{

    public void onCameraInitialized(CameraInitializationEvent camerainitializationevent)
    {
        try
        {
            ((CameraInitializationListener)_listener).onCameraInitialized(camerainitializationevent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CameraInitializationEvent camerainitializationevent)
        {
            logException(camerainitializationevent);
        }
    }

    public (CameraInitializationListener camerainitializationlistener)
    {
        super(camerainitializationlistener, com/kofax/kmc/kui/uicontrols/CameraInitializationListener);
    }
}
