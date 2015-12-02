// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.hardware.Camera;

// Referenced classes of package com.whatsapp.camera:
//            CameraView

class a_
    implements android.hardware.Camera.AutoFocusCallback
{

    final CameraView a;

    a_(CameraView cameraview)
    {
        a = cameraview;
        super();
    }

    public void onAutoFocus(boolean flag, Camera camera)
    {
    }
}
