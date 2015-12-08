// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.graphics.drawable.ColorDrawable;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ae, af, ShuffleLoadingActivity

class ad
    implements android.view.animation.Animation.AnimationListener
{

    final ImageView a;
    final ShuffleLoadingActivity b;

    ad(ShuffleLoadingActivity shuffleloadingactivity, ImageView imageview)
    {
        b = shuffleloadingactivity;
        a = imageview;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        animation = new ae(this, 1, 0.0F, 2, 1.0F, 1, 0.0F, 1, 0.0F, new ColorDrawable(0xff000000));
        a.clearAnimation();
        animation.setStartOffset(2000L);
        animation.setDuration(500L);
        animation.setAnimationListener(new af(this));
        animation.setFillAfter(true);
        a.startAnimation(animation);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
