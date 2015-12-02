// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.text.format.DateUtils;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.VideoView;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class x
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final TextView a;
    final VideoView b;
    final CameraActivity c;

    x(CameraActivity cameraactivity, VideoView videoview, TextView textview)
    {
        c = cameraactivity;
        b = videoview;
        a = textview;
        super();
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            b.seekTo(i);
        }
        a.setText(DateUtils.formatElapsedTime(i / 1000));
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        b.seekTo(seekbar.getProgress());
    }
}
