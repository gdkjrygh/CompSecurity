// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity, ak

class v
    implements android.view.animation.Animation.AnimationListener
{

    final ImageView a;
    final View b;
    final int c;
    final int d;
    final ShuffleLoadingActivity e;

    v(ShuffleLoadingActivity shuffleloadingactivity, ImageView imageview, View view, int i, int j)
    {
        e = shuffleloadingactivity;
        a = imageview;
        b = view;
        c = i;
        d = j;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        ShuffleLoadingActivity.a(e, a);
        ShuffleLoadingActivity.a(e, false);
        b.setOnTouchListener(new ak(e, c, d));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
