// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.view.animation.Animation;

// Referenced classes of package com.whatsapp.util:
//            FloatingChildLayout, Log

class ar
    implements android.view.animation.Animation.AnimationListener
{

    final Runnable a;
    final boolean b;
    final FloatingChildLayout c;

    ar(FloatingChildLayout floatingchildlayout, boolean flag, Runnable runnable)
    {
        c = floatingchildlayout;
        b = flag;
        a = runnable;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
label0:
        {
            if (b)
            {
                if (FloatingChildLayout.c(c) != 3)
                {
                    break label0;
                }
                FloatingChildLayout.a(c, 4);
                if (a == null)
                {
                    break label0;
                }
                a.run();
                if (!Log.f)
                {
                    break label0;
                }
            }
            if (FloatingChildLayout.c(c) == 1)
            {
                FloatingChildLayout.a(c, 2);
                if (a != null)
                {
                    a.run();
                }
            }
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
