// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import io.theholygrail.jsbridge.JSLog;

// Referenced classes of package io.theholygrail.dingo:
//            AnimationController

class val.imageView extends AnimatorListenerAdapter
{

    final is._cls0 this$1;
    final ImageView val$imageView;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        JSLog.d(AnimationController.access$400(), "ForwardAnimation onAnimationEnd()");
        AnimationController.access$800(_fld0).setVisibility(8);
        AnimationController.access$800(_fld0).setTranslationX(0.0F);
        val$imageView.setImageBitmap(null);
        AnimationController.access$902(_fld0, null);
    }

    ()
    {
        this$1 = final_;
        val$imageView = ImageView.this;
        super();
    }
}
