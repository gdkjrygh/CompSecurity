// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            o, q

class p
    implements android.view.animation.Animation.AnimationListener
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.a.postDelayed(new q(this, animation), 2000L);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        a.d.setAlpha(255);
        a.a.setAlpha(255);
    }
}
