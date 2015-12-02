// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.os.Handler;
import android.os.Message;
import android.text.format.DateUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.au2;
import java.io.File;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity, CameraView

class y extends Handler
{

    final CameraActivity a;

    y(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void handleMessage(Message message)
    {
label0:
        {
label1:
            {
                int i;
label2:
                {
                    i = CameraActivity.n;
                    if (!CameraActivity.g(a).j())
                    {
                        break label1;
                    }
                    long l = System.currentTimeMillis();
                    long l1 = CameraActivity.u(a);
                    CameraActivity.o(a).setText(DateUtils.formatElapsedTime((int)((l - l1) / 1000L)));
                    CameraActivity.v(a).sendEmptyMessageDelayed(0, 50L);
                    if (CameraActivity.i(a) == null)
                    {
                        break label2;
                    }
                    l = CameraActivity.i(a).length();
                    if (l > (long)au2.q * 0x100000L)
                    {
                        CameraActivity.a(a, true);
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    CameraActivity.k(a).setProgress((int)((l * 100L) / ((long)au2.q * 0x100000L)));
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            CameraActivity.o(a).setVisibility(8);
            CameraActivity.k(a).setVisibility(8);
        }
    }
}
