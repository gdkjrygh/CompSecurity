// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity, CameraView

class ao extends bv
{

    final CameraActivity b;

    ao(CameraActivity cameraactivity)
    {
        b = cameraactivity;
        super();
    }

    public void a(View view)
    {
        if (!CameraActivity.g(b).j() && CameraActivity.i(b) == null)
        {
            CameraActivity.x(b);
        }
    }
}
