// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.SeekBar;

// Referenced classes of package com.whatsapp:
//            App, VideoPreviewActivity, VideoView, ic

class ga
    implements android.view.View.OnClickListener
{

    final VideoPreviewActivity a;

    ga(VideoPreviewActivity videopreviewactivity)
    {
        a = videopreviewactivity;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
label1:
            {
                int i = App.am;
                if (VideoPreviewActivity.a(a).isPlaying())
                {
                    VideoPreviewActivity.a(a).pause();
                    VideoPreviewActivity.b(a, true);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                if (view != VideoPreviewActivity.d(a))
                {
                    break label0;
                }
                VideoPreviewActivity.b(a, false);
                VideoPreviewActivity.a(a, false);
                if (VideoPreviewActivity.e(a) || (long)VideoPreviewActivity.h(a).getProgress() == VideoPreviewActivity.l(a))
                {
                    VideoPreviewActivity.a(a).seekTo((int)VideoPreviewActivity.n(a));
                    if (i == 0)
                    {
                        break label1;
                    }
                }
                VideoPreviewActivity.a(a).seekTo(VideoPreviewActivity.h(a).getProgress());
                if ((long)VideoPreviewActivity.a(a).getCurrentPosition() >= VideoPreviewActivity.l(a))
                {
                    VideoPreviewActivity.a(a, true);
                }
            }
            VideoPreviewActivity.c(a, false);
            VideoPreviewActivity.a(a).setBackgroundDrawable(null);
            VideoPreviewActivity.a(a).start();
            VideoPreviewActivity.a(a).postDelayed(new ic(this), 0L);
        }
    }
}
