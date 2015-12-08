// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity

class ai
    implements android.animation.Animator.AnimatorListener
{

    final View a;
    final ShuffleLoadingActivity b;

    ai(ShuffleLoadingActivity shuffleloadingactivity, View view)
    {
        b = shuffleloadingactivity;
        a = view;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
        ShuffleLoadingActivity.a(b, a);
    }

    public void onAnimationEnd(Animator animator)
    {
        ShuffleLoadingActivity.a(b, a);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
