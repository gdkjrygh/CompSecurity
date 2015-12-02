// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            rx, VideoPreviewActivity

class u9
    implements Runnable
{

    final rx a;

    u9(rx rx1)
    {
        a = rx1;
        super();
    }

    public void run()
    {
        VideoPreviewActivity.k(a.a).setVisibility(8);
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(600L);
        VideoPreviewActivity.k(a.a).startAnimation(alphaanimation);
    }
}
