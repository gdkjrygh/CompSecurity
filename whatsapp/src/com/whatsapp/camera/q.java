// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.App;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity, CameraView

class q
    implements android.view.View.OnTouchListener
{

    final CameraActivity a;

    q(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
        {
            boolean flag = true;
            if (!CameraActivity.g(a).j())
            {
                break label0;
            }
            if (motionevent.getAction() == 1)
            {
                view = a;
                if (System.currentTimeMillis() - CameraActivity.u(a) <= 1000L)
                {
                    flag = false;
                }
                CameraActivity.a(view, flag);
                if (CameraActivity.n == 0)
                {
                    break label0;
                }
            }
            if (motionevent.getAction() == 2 && -motionevent.getY() > (float)CameraActivity.c(a).getHeight())
            {
                CameraActivity.a(a, false);
                App.b(a, 0x7f0e0475, 0);
            }
        }
        return false;
    }
}
