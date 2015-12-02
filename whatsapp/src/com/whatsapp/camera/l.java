// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.VideoView;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class l
    implements android.view.View.OnClickListener
{

    final CameraActivity a;
    final View b;
    final Runnable c;
    final VideoView d;

    l(CameraActivity cameraactivity, VideoView videoview, View view, Runnable runnable)
    {
        a = cameraactivity;
        d = videoview;
        b = view;
        c = runnable;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (d.isPlaying())
            {
                d.pause();
                CameraActivity.a(a, true, b);
                if (CameraActivity.n == 0)
                {
                    break label0;
                }
            }
            if (view == b)
            {
                CameraActivity.a(a, false, b);
                d.setBackgroundDrawable(null);
                d.start();
                d.postDelayed(c, 0L);
            }
        }
    }
}
