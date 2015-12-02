// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp:
//            App, dq

class xp
    implements Runnable
{

    private Animation a[];
    private int b;
    final dq c;

    xp(dq dq1)
    {
        c = dq1;
        super();
        b = 0;
    }

    public void run()
    {
        int j = App.am;
        if (a != null) goto _L2; else goto _L1
_L1:
        int i;
        a = new Animation[dq.a(c).length];
        i = 0;
_L6:
        if (i >= dq.d(c).length) goto _L2; else goto _L3
_L3:
        AnimationSet animationset = new AnimationSet(true);
        animationset.addAnimation(new AlphaAnimation(1.0F, 0.5F));
        animationset.addAnimation(new ScaleAnimation(1.2F, 1.0F, 1.2F, 1.0F, 1, 0.5F, 1, 0.5F));
        a[i] = animationset;
        a[i].setDuration(400L);
        a[i].setFillAfter(true);
        if (j == 0) goto _L4; else goto _L2
_L2:
        if (dq.b(c) == 1)
        {
            if (b < dq.d(c).length)
            {
                a[b].reset();
                dq.d(c)[b].startAnimation(a[b]);
            }
            b = (b + 1) % dq.d(c).length;
            Handler handler = dq.c(c);
            long l;
            if (b == 0)
            {
                l = 800L;
            } else
            {
                l = 100L;
            }
            handler.postDelayed(this, l);
        }
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
