// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import io.theholygrail.jsbridge.JSLog;

// Referenced classes of package io.theholygrail.dingo:
//            AnimationController

class r extends AnimatorListenerAdapter
{

    final r.onAnimationEnd this$1;
    final r val$listener;
    final View val$webViewContainer;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        JSLog.d(AnimationController.access$400(), "DownAnimation end()");
        val$webViewContainer.setTranslationY(0.0F);
        AnimationController.access$800(_fld0).setVisibility(8);
        AnimationController.access$800(_fld0).findViewById(is._fld0).setVisibility(8);
        AnimationController.access$1202(_fld0, null);
        if (val$listener != null)
        {
            val$listener.onAnimationEnd();
        }
    }

    r()
    {
        this$1 = final_r;
        val$webViewContainer = view;
        val$listener = r.this;
        super();
    }
}
