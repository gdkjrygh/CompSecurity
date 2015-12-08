// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.view.animation.Animation;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity, ShuffleIconDialog

class r
    implements android.view.animation.Animation.AnimationListener
{

    final int a;
    final ShuffleIconDialog b;
    final ShuffleLoadingActivity c;

    r(ShuffleLoadingActivity shuffleloadingactivity, int i, ShuffleIconDialog shuffleicondialog)
    {
        c = shuffleloadingactivity;
        a = i;
        b = shuffleicondialog;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        if (a == 2)
        {
            ShuffleLoadingActivity.a(c, b);
            c.finish();
        } else
        if (a == 1)
        {
            ShuffleLoadingActivity.a(c, b);
            return;
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        if (a == 0)
        {
            ShuffleLoadingActivity.f(c);
        }
    }
}
