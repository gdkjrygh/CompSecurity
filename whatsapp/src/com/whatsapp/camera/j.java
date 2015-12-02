// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.PhotoView;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class j
    implements android.view.View.OnClickListener
{

    final CameraActivity a;

    j(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void onClick(View view)
    {
        CameraActivity.a(a, CameraActivity.t(a) + 90);
        if (CameraActivity.t(a) >= 360)
        {
            CameraActivity.a(a, CameraActivity.t(a) - 360);
        }
        CameraActivity.b(a).c();
    }
}
