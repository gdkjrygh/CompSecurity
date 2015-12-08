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
import android.widget.ImageView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebTransitionHandler

private class <init>
{

    private boolean mContentReady;
    private boolean mFinishedPushAnimation;
    final WebTransitionHandler this$0;

    private void onPageLoaded()
    {
        WebTransitionHandler.access$600(WebTransitionHandler.this).setPictureListener(new android.webkit.WebView.PictureListener() {

            final WebTransitionHandler.ForwardTransition this$1;

            public void onNewPicture(WebView webview, Picture picture)
            {
                WLog.d(WebTransitionHandler.TAG, "onNewPicture");
                WebTransitionHandler.access$600(this$0).setPictureListener(null);
                mContentReady = true;
                showPushedContentIfReady();
            }

            
            {
                this$1 = WebTransitionHandler.ForwardTransition.this;
                super();
            }
        });
    }

    private void showPushedContentIfReady()
    {
        WLog.d(WebTransitionHandler.TAG, String.format("showPushedContentIfReady. finishedPushed=%b, mContentReady=%b", new Object[] {
            Boolean.valueOf(mFinishedPushAnimation), Boolean.valueOf(mContentReady)
        }));
        if (mFinishedPushAnimation && mContentReady)
        {
            final View loadingView = WebTransitionHandler.access$500(WebTransitionHandler.this).findViewById(0x7f100082).findViewById(0x7f10060a);
            loadingView.animate().alpha(0.0F).setStartDelay(100L).setDuration(150L).setListener(new AnimatorListenerAdapter() {

                final WebTransitionHandler.ForwardTransition this$1;
                final View val$loadingView;

                public void onAnimationEnd(Animator animator)
                {
                    super.onAnimationEnd(animator);
                    loadingView.setAlpha(1.0F);
                    loadingView.setVisibility(8);
                }

            
            {
                this$1 = WebTransitionHandler.ForwardTransition.this;
                loadingView = view;
                super();
            }
            }).start();
            WebTransitionHandler.access$1102(WebTransitionHandler.this, null);
        }
    }

    public boolean start()
    {
        final ImageView imageView = (ImageView)ViewUtil.findViewById(WebTransitionHandler.access$400(WebTransitionHandler.this), 0x7f100086);
        Object obj = ViewUtil.findViewById(WebTransitionHandler.access$400(WebTransitionHandler.this), 0x7f100087);
        View view = WebTransitionHandler.access$500(WebTransitionHandler.this).findViewById(0x7f100082);
        boolean flag = false;
        android.graphics.Bitmap bitmap = WebTransitionHandler.access$700(WebTransitionHandler.this, WebTransitionHandler.access$600(WebTransitionHandler.this));
        if (bitmap != null)
        {
            imageView.setImageBitmap(bitmap);
            ((View) (obj)).setVisibility(4);
            WebTransitionHandler.access$400(WebTransitionHandler.this).setVisibility(0);
            view.findViewById(0x7f10060a).setVisibility(0);
            obj = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[] {
                (float)view.getWidth(), 0.0F
            });
            ((ObjectAnimator) (obj)).setDuration(200L);
            ((ObjectAnimator) (obj)).addListener(new AnimatorListenerAdapter() {

                final WebTransitionHandler.ForwardTransition this$1;
                final ImageView val$imageView;

                public void onAnimationEnd(Animator animator)
                {
                    super.onAnimationEnd(animator);
                    mFinishedPushAnimation = true;
                    showPushedContentIfReady();
                    WebTransitionHandler.access$400(this$0).setVisibility(4);
                    WebTransitionHandler.access$400(this$0).setTranslationX(0.0F);
                    imageView.setImageBitmap(null);
                }

            
            {
                this$1 = WebTransitionHandler.ForwardTransition.this;
                imageView = imageview;
                super();
            }
            });
            ((ObjectAnimator) (obj)).start();
            WebTransitionHandler.access$400(WebTransitionHandler.this).animate().translationXBy(-view.getWidth()).setListener(null).setDuration(200L).start();
            flag = true;
        }
        return flag;
    }


/*
    static boolean access$1002(_cls3 _pcls3, boolean flag)
    {
        _pcls3.mContentReady = flag;
        return flag;
    }

*/



/*
    static boolean access$802(mContentReady mcontentready, boolean flag)
    {
        mcontentready.mFinishedPushAnimation = flag;
        return flag;
    }

*/


    private _cls3.val.loadingView()
    {
        this$0 = WebTransitionHandler.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
