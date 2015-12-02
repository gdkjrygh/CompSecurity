// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.util.bv;
import java.io.File;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class ak extends bv
{

    final CameraActivity b;

    ak(CameraActivity cameraactivity)
    {
        b = cameraactivity;
        super();
    }

    public void a(View view)
    {
        CameraActivity.i(b).delete();
        CameraActivity.s(b);
    }
}
