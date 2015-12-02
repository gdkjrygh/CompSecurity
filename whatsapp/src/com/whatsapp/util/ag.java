// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.whatsapp.util:
//            FloatingChildLayout, Log

class ag extends AnimatorListenerAdapter
{

    final boolean a;
    final Runnable b;
    final FloatingChildLayout c;

    ag(FloatingChildLayout floatingchildlayout, boolean flag, Runnable runnable)
    {
        c = floatingchildlayout;
        a = flag;
        b = runnable;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
label0:
        {
            FloatingChildLayout.d(c).setLayerType(0, null);
            if (a)
            {
                if (FloatingChildLayout.c(c) != 3)
                {
                    break label0;
                }
                FloatingChildLayout.a(c, 4);
                if (b == null)
                {
                    break label0;
                }
                b.run();
                if (!Log.f)
                {
                    break label0;
                }
            }
            if (FloatingChildLayout.c(c) == 1)
            {
                FloatingChildLayout.a(c, 2);
                if (b != null)
                {
                    b.run();
                }
            }
        }
    }
}
