// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity

class ag
    implements android.view.animation.Animation.AnimationListener
{

    final ImageView a;
    final ShuffleLoadingActivity b;

    ag(ShuffleLoadingActivity shuffleloadingactivity, ImageView imageview)
    {
        b = shuffleloadingactivity;
        a = imageview;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        ShuffleLoadingActivity.a(b, a);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
