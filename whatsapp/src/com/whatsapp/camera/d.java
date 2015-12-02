// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.app.Activity;
import android.widget.ImageButton;
import com.whatsapp.cq;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class d extends cq
{

    final CameraActivity k;

    d(CameraActivity cameraactivity, Activity activity)
    {
        k = cameraactivity;
        super(activity);
    }

    public void dismiss()
    {
        super.dismiss();
        CameraActivity.r(k).setImageResource(0x7f0204cf);
    }
}
