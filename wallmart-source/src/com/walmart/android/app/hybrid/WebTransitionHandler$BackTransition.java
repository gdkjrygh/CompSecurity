// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Picture;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebTransitionHandler

private class <init>
{

    final WebTransitionHandler this$0;

    private void finishTransition()
    {
        WLog.d(WebTransitionHandler.TAG, "BackTransition.finishTransition()");
        WebTransitionHandler.access$600(WebTransitionHandler.this).setPictureListener(null);
        WebTransitionHandler.access$400(WebTransitionHandler.this).setVisibility(4);
        WebTransitionHandler.access$1202(WebTransitionHandler.this, null);
    }

    public void onPageLoaded()
    {
        WLog.d(WebTransitionHandler.TAG, "BackTransition.onPageLoaded() Setting picture listener.");
        WebTransitionHandler.access$600(WebTransitionHandler.this).setPictureListener(new android.webkit.WebView.PictureListener() {

            final WebTransitionHandler.BackTransition this$1;

            public void onNewPicture(WebView webview, Picture picture)
            {
                WLog.d(WebTransitionHandler.TAG, "BackTransition.onPageLoaded().onNewPicture()");
                finishTransition();
            }

            
            {
                this$1 = WebTransitionHandler.BackTransition.this;
                super();
            }
        });
    }

    public void start()
    {
        WebTransitionHandler.access$400(WebTransitionHandler.this).setVisibility(0);
        WebTransitionHandler.access$400(WebTransitionHandler.this).findViewById(0x7f100087).setVisibility(0);
        final View webViewContainer = ObjectAnimator.ofFloat(WebTransitionHandler.access$400(WebTransitionHandler.this), View.TRANSLATION_X, new float[] {
            (float)(-WebTransitionHandler.access$400(WebTransitionHandler.this).getWidth()), 0.0F
        });
        webViewContainer.setDuration(200L);
        webViewContainer.start();
        webViewContainer = WebTransitionHandler.access$500(WebTransitionHandler.this).findViewById(0x7f100082);
        webViewContainer.animate().translationXBy(WebTransitionHandler.access$600(WebTransitionHandler.this).getWidth()).setDuration(200L).setListener(new AnimatorListenerAdapter() {

            final WebTransitionHandler.BackTransition this$1;
            final View val$webViewContainer;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                webViewContainer.setTranslationX(0.0F);
                WLog.i(WebTransitionHandler.TAG, (new StringBuilder()).append("Url before goBack() animated: ").append(WebTransitionHandler.access$600(this$0).getUrl()).toString());
                WebTransitionHandler.access$600(this$0).goBack();
                WLog.i(WebTransitionHandler.TAG, (new StringBuilder()).append("Url after goBack() animated: ").append(WebTransitionHandler.access$600(this$0).getUrl()).toString());
            }

            
            {
                this$1 = WebTransitionHandler.BackTransition.this;
                webViewContainer = view;
                super();
            }
        }).start();
    }


    private _cls2.this._cls1()
    {
        this$0 = WebTransitionHandler.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
