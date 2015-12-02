// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.View;
import android.widget.ImageButton;
import com.whatsapp.cq;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class n
    implements android.view.View.OnClickListener
{

    final CameraActivity a;

    n(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (CameraActivity.d(a).isShowing())
            {
                CameraActivity.d(a).dismiss();
                if (CameraActivity.n == 0)
                {
                    break label0;
                }
            }
            CameraActivity.d(a).a(CameraActivity.r(a), CameraActivity.r(a), CameraActivity.r(a), CameraActivity.q(a));
            CameraActivity.r(a).setImageResource(0x7f0204d6);
        }
    }
}
