// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.View;
import android.widget.SeekBar;
import com.whatsapp.VideoView;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class m
    implements Runnable
{

    final CameraActivity a;
    final VideoView b;
    final View c;
    final SeekBar d;

    m(CameraActivity cameraactivity, VideoView videoview, SeekBar seekbar, View view)
    {
        a = cameraactivity;
        b = videoview;
        d = seekbar;
        c = view;
        super();
    }

    public void run()
    {
label0:
        {
            if (b.isPlaying())
            {
                d.setProgress(b.getCurrentPosition());
                b.postDelayed(this, 50L);
                if (CameraActivity.n == 0)
                {
                    break label0;
                }
            }
            CameraActivity.a(a, true, c);
        }
    }
}
