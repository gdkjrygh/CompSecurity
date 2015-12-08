// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.view.animation.Animation;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ad, ShuffleLoadingActivity

class af
    implements android.view.animation.Animation.AnimationListener
{

    final ad a;

    af(ad ad1)
    {
        a = ad1;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.b.finish();
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
