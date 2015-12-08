// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.walmart.android.wmui.animation:
//            ListAnimator

class val.endAction extends AnimatorListenerAdapter
{

    final ListAnimator this$0;
    final Runnable val$endAction;

    public void onAnimationEnd(Animator animator)
    {
        val$endAction.run();
    }

    ()
    {
        this$0 = final_listanimator;
        val$endAction = Runnable.this;
        super();
    }
}
