// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class ad
    implements android.view.View.OnLongClickListener
{

    final CameraActivity a;

    ad(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public boolean onLongClick(View view)
    {
        CameraActivity.m(a).setImageResource(0x7f0200ec);
        CameraActivity.f(a);
        return true;
    }
}
