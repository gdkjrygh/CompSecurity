// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.animation.ValueAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

// Referenced classes of package com.whatsapp.util:
//            FloatingChildLayout, Log

class bu
    implements Runnable
{

    final FloatingChildLayout a;

    bu(FloatingChildLayout floatingchildlayout)
    {
        a = floatingchildlayout;
        super();
    }

    public void run()
    {
label0:
        {
            if (FloatingChildLayout.c())
            {
                FloatingChildLayout.a(a).setDuration(FloatingChildLayout.b(a)).start();
                if (!Log.f)
                {
                    break label0;
                }
            }
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(FloatingChildLayout.b(a));
            alphaanimation.setFillAfter(true);
            a.setBackgroundColor(0x7f000000);
            a.startAnimation(alphaanimation);
        }
    }
}
