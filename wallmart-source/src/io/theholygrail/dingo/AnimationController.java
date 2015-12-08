// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ImageView;
import io.theholygrail.jsbridge.JSLog;
import io.theholygrail.jsbridge.JSWebView;

public class AnimationController
{
    public static interface AnimationListener
    {

        public abstract void onAnimationEnd();
    }

    private class BackAnimation
    {

        final AnimationController this$0;

        public boolean start(AnimationListener animationlistener)
        {
            JSLog.d(AnimationController.TAG, "BackAnimation start()");
            boolean flag = false;
            final ImageView imageView = (ImageView)mRootView.findViewById(R.id.screenshot_view);
            Object obj = mRootView.findViewById(R.id.webview_loading_view);
            View view = mRootView.findViewById(R.id.webview_container);
            Bitmap bitmap = screenshot(mWebView);
            if (bitmap != null)
            {
                imageView.setImageBitmap(bitmap);
                mScreenShotContainer.setVisibility(0);
                ((View) (obj)).setVisibility(0);
                obj = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[] {
                    (float)(-view.getWidth()), 0.0F
                });
                ((ObjectAnimator) (obj)).setDuration(400L);
                ((ObjectAnimator) (obj)).addListener(animationlistener. new AnimatorListenerAdapter() {

                    final BackAnimation this$1;
                    final ImageView val$imageView;
                    final AnimationListener val$listener;

                    public void onAnimationEnd(Animator animator)
                    {
                        super.onAnimationEnd(animator);
                        JSLog.d(AnimationController.TAG, "BackAnimation onAnimationEnd()");
                        mScreenShotContainer.setVisibility(8);
                        mScreenShotContainer.setTranslationX(0.0F);
                        imageView.setImageBitmap(null);
                        mBackAnimation = null;
                        if (listener != null)
                        {
                            listener.onAnimationEnd();
                        }
                    }

            
            {
                this$1 = final_backanimation;
                imageView = imageview;
                listener = AnimationListener.this;
                super();
            }
                });
                ((ObjectAnimator) (obj)).start();
                mScreenShotContainer.animate().translationXBy(view.getWidth()).setDuration(400L).start();
                flag = true;
            }
            return flag;
        }

        private BackAnimation()
        {
            this$0 = AnimationController.this;
            super();
        }

    }

    private class DownAnimation
    {

        final AnimationController this$0;

        public void start(AnimationListener animationlistener)
        {
            JSLog.d(AnimationController.TAG, "DownAnimation start()");
            mScreenShotContainer.setVisibility(0);
            mScreenShotContainer.findViewById(R.id.screenshot_loading_view).setVisibility(0);
            final View webViewContainer = ObjectAnimator.ofFloat(mScreenShotContainer, View.TRANSLATION_Y, new float[] {
                (float)(-mScreenShotContainer.getHeight()), 0.0F
            });
            webViewContainer.setDuration(400L);
            webViewContainer.start();
            webViewContainer = mRootView.findViewById(R.id.webview_container);
            webViewContainer.animate().translationYBy(mWebView.getHeight()).setDuration(400L).setListener(animationlistener. new AnimatorListenerAdapter() {

                final DownAnimation this$1;
                final AnimationListener val$listener;
                final View val$webViewContainer;

                public void onAnimationEnd(Animator animator)
                {
                    super.onAnimationEnd(animator);
                    JSLog.d(AnimationController.TAG, "DownAnimation end()");
                    webViewContainer.setTranslationY(0.0F);
                    mScreenShotContainer.setVisibility(8);
                    mScreenShotContainer.findViewById(R.id.screenshot_loading_view).setVisibility(8);
                    mDownAnimation = null;
                    if (listener != null)
                    {
                        listener.onAnimationEnd();
                    }
                }

            
            {
                this$1 = final_downanimation;
                webViewContainer = view;
                listener = AnimationListener.this;
                super();
            }
            }).start();
        }

        private DownAnimation()
        {
            this$0 = AnimationController.this;
            super();
        }

    }

    private class ForwardAnimation
    {

        final AnimationController this$0;

        public boolean start()
        {
            JSLog.d(AnimationController.TAG, "ForwardAnimation start()");
            boolean flag = false;
            ImageView imageview = (ImageView)mRootView.findViewById(R.id.screenshot_view);
            Object obj = mRootView.findViewById(R.id.webview_loading_view);
            View view = mRootView.findViewById(R.id.webview_container);
            Bitmap bitmap = screenshot(mWebView);
            if (bitmap != null)
            {
                imageview.setImageBitmap(bitmap);
                mScreenShotContainer.setVisibility(0);
                ((View) (obj)).setVisibility(0);
                obj = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[] {
                    (float)view.getWidth(), 0.0F
                });
                ((ObjectAnimator) (obj)).setDuration(400L);
                ((ObjectAnimator) (obj)).addListener(imageview. new AnimatorListenerAdapter() {

                    final ForwardAnimation this$1;
                    final ImageView val$imageView;

                    public void onAnimationEnd(Animator animator)
                    {
                        super.onAnimationEnd(animator);
                        JSLog.d(AnimationController.TAG, "ForwardAnimation onAnimationEnd()");
                        mScreenShotContainer.setVisibility(8);
                        mScreenShotContainer.setTranslationX(0.0F);
                        imageView.setImageBitmap(null);
                        mForwardAnimation = null;
                    }

            
            {
                this$1 = final_forwardanimation;
                imageView = ImageView.this;
                super();
            }
                });
                ((ObjectAnimator) (obj)).start();
                mScreenShotContainer.animate().translationXBy(-view.getWidth()).setDuration(400L).start();
                flag = true;
            }
            return flag;
        }

        private ForwardAnimation()
        {
            this$0 = AnimationController.this;
            super();
        }

    }

    private class UpAnimation
    {

        final AnimationController this$0;

        public boolean start(AnimationListener animationlistener)
        {
            JSLog.d(AnimationController.TAG, "UpAnimation start()");
            boolean flag = false;
            final ImageView imageView = (ImageView)mRootView.findViewById(R.id.screenshot_view);
            Object obj = mRootView.findViewById(R.id.webview_loading_view);
            View view = mRootView.findViewById(R.id.webview_container);
            Bitmap bitmap = screenshot(mWebView);
            if (bitmap != null)
            {
                imageView.setImageBitmap(bitmap);
                ((View) (obj)).setVisibility(0);
                mScreenShotContainer.setVisibility(0);
                obj = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[] {
                    (float)view.getHeight(), 0.0F
                });
                ((ObjectAnimator) (obj)).setDuration(400L);
                ((ObjectAnimator) (obj)).addListener(animationlistener. new AnimatorListenerAdapter() {

                    final UpAnimation this$1;
                    final ImageView val$imageView;
                    final AnimationListener val$listener;

                    public void onAnimationEnd(Animator animator)
                    {
                        super.onAnimationEnd(animator);
                        JSLog.d(AnimationController.TAG, "UpAnimation onAnimationEnd()");
                        mScreenShotContainer.setVisibility(4);
                        mScreenShotContainer.setTranslationY(0.0F);
                        imageView.setImageBitmap(null);
                        mUpAnimation = null;
                        if (listener != null)
                        {
                            listener.onAnimationEnd();
                        }
                    }

            
            {
                this$1 = final_upanimation;
                imageView = imageview;
                listener = AnimationListener.this;
                super();
            }
                });
                ((ObjectAnimator) (obj)).start();
                mScreenShotContainer.animate().translationYBy(-view.getHeight()).setDuration(400L).start();
                flag = true;
            }
            return flag;
        }

        private UpAnimation()
        {
            this$0 = AnimationController.this;
            super();
        }

    }


    private static final String TAG = io/theholygrail/dingo/AnimationController.getSimpleName();
    private final long ANIMATION_TIME = 400L;
    private BackAnimation mBackAnimation;
    private DownAnimation mDownAnimation;
    private ForwardAnimation mForwardAnimation;
    private View mRootView;
    private View mScreenShotContainer;
    private UpAnimation mUpAnimation;
    private WebView mWebView;

    public AnimationController()
    {
    }

    private Bitmap screenshot(WebView webview)
    {
        Bitmap bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(webview.getWidth(), webview.getHeight(), android.graphics.Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmap);
            canvas.translate(-webview.getScrollX(), -webview.getScrollY());
            webview.draw(canvas);
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            JSLog.e(TAG, "Out of memory while creating screenshot", webview);
            return null;
        }
        return bitmap;
    }

    public void animateBackward(AnimationListener animationlistener)
    {
        mBackAnimation = new BackAnimation();
        mBackAnimation.start(animationlistener);
    }

    public void animateDown(AnimationListener animationlistener)
    {
        mDownAnimation = new DownAnimation();
        mDownAnimation.start(animationlistener);
    }

    public void animateForward()
    {
        if (mForwardAnimation == null)
        {
            mForwardAnimation = new ForwardAnimation();
            if (!mForwardAnimation.start())
            {
                JSLog.w(TAG, "Failed to start forward animation.");
                mForwardAnimation = null;
            }
            return;
        } else
        {
            JSLog.i(TAG, "Calling animateForward while animating");
            return;
        }
    }

    public void animateUp(AnimationListener animationlistener)
    {
        if (mUpAnimation == null)
        {
            mUpAnimation = new UpAnimation();
            if (!mUpAnimation.start(animationlistener))
            {
                JSLog.w(TAG, "Failed to start up animation.");
                mUpAnimation = null;
            }
            return;
        } else
        {
            JSLog.i(TAG, "Calling animateUp while animating");
            return;
        }
    }

    public void init(View view, JSWebView jswebview)
    {
        mRootView = view;
        mWebView = jswebview;
        mScreenShotContainer = mRootView.findViewById(R.id.screenshot_container);
    }



/*
    static BackAnimation access$1002(AnimationController animationcontroller, BackAnimation backanimation)
    {
        animationcontroller.mBackAnimation = backanimation;
        return backanimation;
    }

*/


/*
    static UpAnimation access$1102(AnimationController animationcontroller, UpAnimation upanimation)
    {
        animationcontroller.mUpAnimation = upanimation;
        return upanimation;
    }

*/


/*
    static DownAnimation access$1202(AnimationController animationcontroller, DownAnimation downanimation)
    {
        animationcontroller.mDownAnimation = downanimation;
        return downanimation;
    }

*/







/*
    static ForwardAnimation access$902(AnimationController animationcontroller, ForwardAnimation forwardanimation)
    {
        animationcontroller.mForwardAnimation = forwardanimation;
        return forwardanimation;
    }

*/
}
