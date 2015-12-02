// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.SeekBar;

// Referenced classes of package com.whatsapp:
//            App, ga, VideoPreviewActivity, VideoView

class ic
    implements Runnable
{

    final ga a;

    ic(ga ga1)
    {
        a = ga1;
        super();
    }

    public void run()
    {
label0:
        {
label1:
            {
                int i;
label2:
                {
                    i = App.am;
                    if (!VideoPreviewActivity.a(a.a).isPlaying())
                    {
                        break label1;
                    }
                    if ((long)VideoPreviewActivity.a(a.a).getCurrentPosition() > VideoPreviewActivity.l(a.a) && !VideoPreviewActivity.p(a.a))
                    {
                        VideoPreviewActivity.a(a.a).pause();
                        VideoPreviewActivity.a(a.a).seekTo((int)VideoPreviewActivity.l(a.a));
                        VideoPreviewActivity.h(a.a).setProgress((int)VideoPreviewActivity.l(a.a));
                        VideoPreviewActivity.b(a.a, true);
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    VideoPreviewActivity.a(a.a).postDelayed(this, 50L);
                }
                VideoPreviewActivity.h(a.a).setProgress(VideoPreviewActivity.a(a.a).getCurrentPosition());
                if (i == 0)
                {
                    break label0;
                }
            }
            VideoPreviewActivity.b(a.a, true);
        }
    }
}
