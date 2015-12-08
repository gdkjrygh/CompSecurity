// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import io.theholygrail.jsbridge.JSLog;

// Referenced classes of package io.theholygrail.dingo:
//            AnimationController

private class <init>
{

    final AnimationController this$0;

    public void start(final ner listener)
    {
        JSLog.d(AnimationController.access$400(), "DownAnimation start()");
        AnimationController.access$800(AnimationController.this).setVisibility(0);
        AnimationController.access$800(AnimationController.this).findViewById(this._fld0).setVisibility(0);
        final View webViewContainer = ObjectAnimator.ofFloat(AnimationController.access$800(AnimationController.this), View.TRANSLATION_Y, new float[] {
            (float)(-AnimationController.access$800(AnimationController.this).getHeight()), 0.0F
        });
        webViewContainer.setDuration(400L);
        webViewContainer.start();
        webViewContainer = AnimationController.access$500(AnimationController.this).findViewById(this._fld0);
        webViewContainer.animate().translationYBy(AnimationController.access$600(AnimationController.this).getHeight()).setDuration(400L).setListener(new AnimatorListenerAdapter() {

            final AnimationController.DownAnimation this$1;
            final AnimationController.AnimationListener val$listener;
            final View val$webViewContainer;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                JSLog.d(AnimationController.access$400(), "DownAnimation end()");
                webViewContainer.setTranslationY(0.0F);
                AnimationController.access$800(this$0).setVisibility(8);
                AnimationController.access$800(this$0).findViewById(R.id.screenshot_loading_view).setVisibility(8);
                AnimationController.access$1202(this$0, null);
                if (listener != null)
                {
                    listener.onAnimationEnd();
                }
            }

            
            {
                this$1 = AnimationController.DownAnimation.this;
                webViewContainer = view;
                listener = animationlistener;
                super();
            }
        }).start();
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
