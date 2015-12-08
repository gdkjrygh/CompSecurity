// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ImageView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;

public final class WebTransitionHandler
{
    private class BackTransition
    {

        final WebTransitionHandler this$0;

        private void finishTransition()
        {
            WLog.d(WebTransitionHandler.TAG, "BackTransition.finishTransition()");
            mWebView.setPictureListener(null);
            mScreenshotContainer.setVisibility(4);
            mOngoingBackTransition = null;
        }

        public void onPageLoaded()
        {
            WLog.d(WebTransitionHandler.TAG, "BackTransition.onPageLoaded() Setting picture listener.");
            mWebView.setPictureListener(new android.webkit.WebView.PictureListener() {

                final BackTransition this$1;

                public void onNewPicture(WebView webview, Picture picture)
                {
                    WLog.d(WebTransitionHandler.TAG, "BackTransition.onPageLoaded().onNewPicture()");
                    finishTransition();
                }

            
            {
                this$1 = BackTransition.this;
                super();
            }
            });
        }

        public void start()
        {
            mScreenshotContainer.setVisibility(0);
            mScreenshotContainer.findViewById(0x7f100087).setVisibility(0);
            Object obj = ObjectAnimator.ofFloat(mScreenshotContainer, View.TRANSLATION_X, new float[] {
                (float)(-mScreenshotContainer.getWidth()), 0.0F
            });
            ((ObjectAnimator) (obj)).setDuration(200L);
            ((ObjectAnimator) (obj)).start();
            obj = mRootView.findViewById(0x7f100082);
            ((View) (obj)).animate().translationXBy(mWebView.getWidth()).setDuration(200L).setListener(((_cls1) (obj)). new AnimatorListenerAdapter() {

                final BackTransition this$1;
                final View val$webViewContainer;

                public void onAnimationEnd(Animator animator)
                {
                    super.onAnimationEnd(animator);
                    webViewContainer.setTranslationX(0.0F);
                    WLog.i(WebTransitionHandler.TAG, (new StringBuilder()).append("Url before goBack() animated: ").append(mWebView.getUrl()).toString());
                    mWebView.goBack();
                    WLog.i(WebTransitionHandler.TAG, (new StringBuilder()).append("Url after goBack() animated: ").append(mWebView.getUrl()).toString());
                }

            
            {
                this$1 = final_backtransition;
                webViewContainer = View.this;
                super();
            }
            }).start();
        }


        private BackTransition()
        {
            this$0 = WebTransitionHandler.this;
            super();
        }

    }

    private class ForwardTransition
    {

        private boolean mContentReady;
        private boolean mFinishedPushAnimation;
        final WebTransitionHandler this$0;

        private void onPageLoaded()
        {
            mWebView.setPictureListener(new android.webkit.WebView.PictureListener() {

                final ForwardTransition this$1;

                public void onNewPicture(WebView webview, Picture picture)
                {
                    WLog.d(WebTransitionHandler.TAG, "onNewPicture");
                    mWebView.setPictureListener(null);
                    mContentReady = true;
                    showPushedContentIfReady();
                }

            
            {
                this$1 = ForwardTransition.this;
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
                View view = mRootView.findViewById(0x7f100082).findViewById(0x7f10060a);
                view.animate().alpha(0.0F).setStartDelay(100L).setDuration(150L).setListener(view. new AnimatorListenerAdapter() {

                    final ForwardTransition this$1;
                    final View val$loadingView;

                    public void onAnimationEnd(Animator animator)
                    {
                        super.onAnimationEnd(animator);
                        loadingView.setAlpha(1.0F);
                        loadingView.setVisibility(8);
                    }

            
            {
                this$1 = final_forwardtransition;
                loadingView = View.this;
                super();
            }
                }).start();
                mOngoingForwardTransition = null;
            }
        }

        public boolean start()
        {
            ImageView imageview = (ImageView)ViewUtil.findViewById(mScreenshotContainer, 0x7f100086);
            Object obj = ViewUtil.findViewById(mScreenshotContainer, 0x7f100087);
            View view = mRootView.findViewById(0x7f100082);
            boolean flag = false;
            Bitmap bitmap = screenshot(mWebView);
            if (bitmap != null)
            {
                imageview.setImageBitmap(bitmap);
                ((View) (obj)).setVisibility(4);
                mScreenshotContainer.setVisibility(0);
                view.findViewById(0x7f10060a).setVisibility(0);
                obj = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[] {
                    (float)view.getWidth(), 0.0F
                });
                ((ObjectAnimator) (obj)).setDuration(200L);
                ((ObjectAnimator) (obj)).addListener(imageview. new AnimatorListenerAdapter() {

                    final ForwardTransition this$1;
                    final ImageView val$imageView;

                    public void onAnimationEnd(Animator animator)
                    {
                        super.onAnimationEnd(animator);
                        mFinishedPushAnimation = true;
                        showPushedContentIfReady();
                        mScreenshotContainer.setVisibility(4);
                        mScreenshotContainer.setTranslationX(0.0F);
                        imageView.setImageBitmap(null);
                    }

            
            {
                this$1 = final_forwardtransition;
                imageView = ImageView.this;
                super();
            }
                });
                ((ObjectAnimator) (obj)).start();
                mScreenshotContainer.animate().translationXBy(-view.getWidth()).setListener(null).setDuration(200L).start();
                flag = true;
            }
            return flag;
        }


/*
        static boolean access$1002(ForwardTransition forwardtransition, boolean flag)
        {
            forwardtransition.mContentReady = flag;
            return flag;
        }

*/



/*
        static boolean access$802(ForwardTransition forwardtransition, boolean flag)
        {
            forwardtransition.mFinishedPushAnimation = flag;
            return flag;
        }

*/


        private ForwardTransition()
        {
            this$0 = WebTransitionHandler.this;
            super();
        }

    }


    private static final boolean DEBUG = false;
    public static final String TAG = com/walmart/android/app/hybrid/WebTransitionHandler.getSimpleName();
    private final long ANIMATION_TIME = 200L;
    private boolean mFinishing;
    private View mLoadingView;
    private BackTransition mOngoingBackTransition;
    private ForwardTransition mOngoingForwardTransition;
    private View mRootView;
    private View mScreenshotContainer;
    private WebView mWebView;

    public WebTransitionHandler()
    {
    }

    private Bitmap screenshot(WebView webview)
    {
        long l = System.currentTimeMillis();
        Bitmap bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(webview.getWidth(), webview.getHeight(), android.graphics.Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmap);
            canvas.translate(-webview.getScrollX(), -webview.getScrollY());
            webview.draw(canvas);
            WLog.d(TAG, String.format("screenshot created in %dms", new Object[] {
                Long.valueOf(System.currentTimeMillis() - l)
            }));
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            WLog.e(TAG, "Out of memory while creating screenshot", webview);
            return null;
        }
        return bitmap;
    }

    public void animateBack()
    {
        mOngoingBackTransition = new BackTransition();
        mOngoingBackTransition.start();
    }

    public void animateForward()
    {
        if (mOngoingForwardTransition == null)
        {
            mOngoingForwardTransition = new ForwardTransition();
            if (!mOngoingForwardTransition.start())
            {
                mOngoingForwardTransition = null;
            }
        }
    }

    public void forcePageFinished()
    {
        mOngoingBackTransition.finishTransition();
    }

    public boolean hasOngoingTransitions()
    {
        return mOngoingBackTransition != null || mOngoingForwardTransition != null;
    }

    public void init(View view)
    {
        mRootView = view;
        mWebView = (WebView)ViewUtil.findViewById(mRootView, 0x7f100609);
        mScreenshotContainer = ViewUtil.findViewById(mRootView, 0x7f100085);
        mLoadingView = mRootView.findViewById(0x7f10060a);
    }

    public boolean isFinishing()
    {
        return mFinishing;
    }

    public void onPageFinished()
    {
        if (mLoadingView != null)
        {
            WLog.d(TAG, "onPageFinished() Hiding loading view.");
            mLoadingView.setVisibility(8);
            mLoadingView = null;
        }
        if (mOngoingForwardTransition != null)
        {
            mOngoingForwardTransition.onPageLoaded();
        } else
        if (mOngoingBackTransition != null)
        {
            mOngoingBackTransition.onPageLoaded();
            return;
        }
    }

    public void reset()
    {
        mFinishing = true;
        mOngoingForwardTransition = null;
        mOngoingBackTransition = null;
    }



/*
    static ForwardTransition access$1102(WebTransitionHandler webtransitionhandler, ForwardTransition forwardtransition)
    {
        webtransitionhandler.mOngoingForwardTransition = forwardtransition;
        return forwardtransition;
    }

*/


/*
    static BackTransition access$1202(WebTransitionHandler webtransitionhandler, BackTransition backtransition)
    {
        webtransitionhandler.mOngoingBackTransition = backtransition;
        return backtransition;
    }

*/




}
