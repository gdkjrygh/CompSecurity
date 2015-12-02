// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.format.DateUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.SeekBar;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            as1, VideoPreviewActivity, VideoView, ao0, 
//            App, u9, RangeSeekBar

class rx
    implements as1
{

    private static final String z;
    final VideoPreviewActivity a;

    rx(VideoPreviewActivity videopreviewactivity)
    {
        a = videopreviewactivity;
        super();
    }

    public void a(RangeSeekBar rangeseekbar, Long long1, Long long2, boolean flag)
    {
label0:
        {
            if (VideoPreviewActivity.a(a).isPlaying())
            {
                VideoPreviewActivity.a(a).pause();
                VideoPreviewActivity.b(a, true);
            }
            if (VideoPreviewActivity.n(a) != long1.longValue())
            {
                VideoPreviewActivity.f(a).a(long1.longValue());
                VideoPreviewActivity.a(a).seekTo(long1.intValue());
                VideoPreviewActivity.c(a, true);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (VideoPreviewActivity.l(a) != long2.longValue())
            {
                VideoPreviewActivity.f(a).a(long2.longValue());
                VideoPreviewActivity.a(a).seekTo(long2.intValue());
                if (long2.longValue() <= (long)VideoPreviewActivity.h(a).getProgress())
                {
                    VideoPreviewActivity.c(a, true);
                }
            }
        }
        VideoPreviewActivity.a(a, long1.longValue());
        VideoPreviewActivity.b(a, long2.longValue());
        if (VideoPreviewActivity.k(a).getVisibility() != 0)
        {
            VideoPreviewActivity.k(a).setVisibility(0);
            rangeseekbar = new AlphaAnimation(0.0F, 1.0F);
            rangeseekbar.setDuration(100L);
            VideoPreviewActivity.k(a).startAnimation(rangeseekbar);
        }
        VideoPreviewActivity.k(a).setText((new StringBuilder()).append(DateUtils.formatElapsedTime(VideoPreviewActivity.n(a) / 1000L)).append(z).append(DateUtils.formatElapsedTime(VideoPreviewActivity.l(a) / 1000L)).toString());
        VideoPreviewActivity.a(a, VideoPreviewActivity.n(a), VideoPreviewActivity.l(a));
        if (!flag)
        {
            VideoPreviewActivity.c(a).postDelayed(new u9(this), 1000L);
        }
    }

    public void a(RangeSeekBar rangeseekbar, Object obj, Object obj1, boolean flag)
    {
        a(rangeseekbar, (Long)obj, (Long)obj1, flag);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\020~\024".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 91;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 48;
          goto _L8
_L3:
        byte0 = 83;
          goto _L8
_L4:
        byte0 = 52;
          goto _L8
        byte0 = 36;
          goto _L8
    }
}
