// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity, b, ak

class t
    implements android.animation.Animator.AnimatorListener
{

    final View a;
    final ShuffleLoadingActivity b;

    t(ShuffleLoadingActivity shuffleloadingactivity, View view)
    {
        b = shuffleloadingactivity;
        a = view;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        int i;
        int j;
label0:
        {
            animator = ShuffleLoadingActivity.g(b)[3];
            if (animator != null)
            {
                i = -animator.getIntrinsicHeight() / 3;
                j = (ShuffleLoadingActivity.h(b) * 2) / 3;
                int k = com.go.weatherex.sidebar.shuffle.b.a(3F);
                int l = animator.getIntrinsicHeight();
                if (!ShuffleLoadingActivity.i(b))
                {
                    break label0;
                }
                ShuffleLoadingActivity.a(b, j, i, (l + i) - k, a);
            }
            return;
        }
        a.setOnTouchListener(new ak(b, j, i));
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
