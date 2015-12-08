// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import io.theholygrail.jsbridge.JSLog;

// Referenced classes of package io.theholygrail.dingo:
//            AnimationController

private class <init>
{

    final AnimationController this$0;

    public boolean start(final tener listener)
    {
        JSLog.d(AnimationController.access$400(), "UpAnimation start()");
        boolean flag = false;
        final ImageView imageView = (ImageView)AnimationController.access$500(AnimationController.this).findViewById(this._fld0);
        Object obj = AnimationController.access$500(AnimationController.this).findViewById(this._fld0);
        View view = AnimationController.access$500(AnimationController.this).findViewById(this._fld0);
        android.graphics.Bitmap bitmap = AnimationController.access$700(AnimationController.this, AnimationController.access$600(AnimationController.this));
        if (bitmap != null)
        {
            imageView.setImageBitmap(bitmap);
            ((View) (obj)).setVisibility(0);
            AnimationController.access$800(AnimationController.this).setVisibility(0);
            obj = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[] {
                (float)view.getHeight(), 0.0F
            });
            ((ObjectAnimator) (obj)).setDuration(400L);
            ((ObjectAnimator) (obj)).addListener(new AnimatorListenerAdapter() {

                final AnimationController.UpAnimation this$1;
                final ImageView val$imageView;
                final AnimationController.AnimationListener val$listener;

                public void onAnimationEnd(Animator animator)
                {
                    super.onAnimationEnd(animator);
                    JSLog.d(AnimationController.access$400(), "UpAnimation onAnimationEnd()");
                    AnimationController.access$800(this$0).setVisibility(4);
                    AnimationController.access$800(this$0).setTranslationY(0.0F);
                    imageView.setImageBitmap(null);
                    AnimationController.access$1102(this$0, null);
                    if (listener != null)
                    {
                        listener.onAnimationEnd();
                    }
                }

            
            {
                this$1 = AnimationController.UpAnimation.this;
                imageView = imageview;
                listener = animationlistener;
                super();
            }
            });
            ((ObjectAnimator) (obj)).start();
            AnimationController.access$800(AnimationController.this).animate().translationYBy(-view.getHeight()).setDuration(400L).start();
            flag = true;
        }
        return flag;
    }

    private _cls1.val.listener()
    {
        this$0 = AnimationController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
