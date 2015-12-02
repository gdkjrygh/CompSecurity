// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.View;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity, CameraView

class p
    implements android.view.View.OnClickListener
{

    final CameraActivity a;

    p(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void onClick(View view)
    {
        CameraActivity.a(a, CameraActivity.g(a).k());
    }
}
