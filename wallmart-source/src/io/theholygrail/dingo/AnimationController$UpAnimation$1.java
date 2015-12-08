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

class ner extends AnimatorListenerAdapter
{

    final ner.onAnimationEnd this$1;
    final ImageView val$imageView;
    final ner val$listener;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        JSLog.d(AnimationController.access$400(), "UpAnimation onAnimationEnd()");
        AnimationController.access$800(_fld0).setVisibility(4);
        AnimationController.access$800(_fld0).setTranslationY(0.0F);
        val$imageView.setImageBitmap(null);
        AnimationController.access$1102(_fld0, null);
        if (val$listener != null)
        {
            val$listener.onAnimationEnd();
        }
    }

    ner()
    {
        this$1 = final_ner;
        val$imageView = imageview;
        val$listener = ner.this;
        super();
    }
}
