// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.view.animation.Animation;

// Referenced classes of package com.facebook.ads.a:
//            i

class 
    implements android.view.animation.ation.AnimationListener
{

    final i a;

    public void onAnimationEnd(Animation animation)
    {
        a.removeView(a.getChildAt(0));
        a.removeView(a.getChildAt(0));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    Animation(i j)
    {
        a = j;
        super();
    }
}
