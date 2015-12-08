// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class ViewStackLayout extends FrameLayout
{
    public static interface TransitionListener
    {

        public abstract void onTransitionDone();
    }


    private static final int ANIM_DURATION = 200;
    private static final int STATE_DEFAULT = 0;
    private static final int STATE_POPPING = 2;
    private static final int STATE_PUSHING = 1;
    public static final String TAG = com/walmart/android/ui/ViewStackLayout.getName();
    private Animation mAnimationLeftIn;
    private Animation mAnimationLeftOut;
    private Animation mAnimationRightIn;
    private Animation mAnimationRightOut;
    private Context mContext;
    private int mState;

    public ViewStackLayout(Context context)
    {
        super(context);
        init(context);
    }

    public ViewStackLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context);
    }

    public ViewStackLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private View finishCurrentPop()
    {
        resetAnimations();
        int i = getChildCount();
        View view = getChildAt(i - 1);
        getChildAt(i - 2).setAnimation(null);
        view.setAnimation(null);
        view.setVisibility(8);
        removeViewAt(i - 1);
        mState = 0;
        return view;
    }

    private void finishCurrentPushAnimation()
    {
        resetAnimations();
        int i = getChildCount();
        View view = getChildAt(i - 1);
        View view1 = getChildAt(i - 2);
        view.setAnimation(null);
        if (view1 != null)
        {
            view1.setAnimation(null);
            view1.setVisibility(8);
        }
        mState = 0;
    }

    private void init(Context context)
    {
        mState = 0;
        mContext = context;
        initAnimations();
    }

    private void initAnimations()
    {
        mAnimationLeftIn = AnimationUtils.loadAnimation(mContext, com.walmart.lib.R.anim.slide_left_in);
        mAnimationLeftOut = AnimationUtils.loadAnimation(mContext, com.walmart.lib.R.anim.slide_left_out);
        mAnimationRightIn = AnimationUtils.loadAnimation(mContext, com.walmart.lib.R.anim.slide_right_in);
        mAnimationRightOut = AnimationUtils.loadAnimation(mContext, com.walmart.lib.R.anim.slide_right_out);
        setAnimationDuration(200);
    }

    private void pushView(final View view, final boolean replace, final TransitionListener listener)
    {
        finishCurrentOperation();
        int i = getChildCount();
        if (i > 0)
        {
            final View topChild = getChildAt(i - 1);
            mAnimationLeftOut.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final ViewStackLayout this$0;
                final boolean val$replace;
                final View val$topChild;

                public void onAnimationEnd(Animation animation)
                {
                    removeAnimationFromView(topChild);
                    if (replace)
                    {
                        post(new Runnable() {

                            final _cls1 this$1;

                            public void run()
                            {
                                removeView(topChild);
                            }

            
            {
                this$1 = _cls1.this;
                super();
            }
                        });
                    } else
                    {
                        topChild.setVisibility(8);
                    }
                    mAnimationLeftOut.setAnimationListener(null);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = ViewStackLayout.this;
                topChild = view;
                replace = flag;
                super();
            }
            });
            topChild.startAnimation(mAnimationLeftOut);
        }
        addView(view);
        mAnimationLeftIn.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final ViewStackLayout this$0;
            final TransitionListener val$listener;
            final View val$view;

            public void onAnimationEnd(Animation animation)
            {
                removeAnimationFromView(view);
                mState = 0;
                if (listener != null)
                {
                    post(new Runnable() {

                        final _cls2 this$1;

                        public void run()
                        {
                            listener.onTransitionDone();
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                }
                mAnimationLeftIn.setAnimationListener(null);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = ViewStackLayout.this;
                view = view1;
                listener = transitionlistener;
                super();
            }
        });
        view.startAnimation(mAnimationLeftIn);
        mState = 1;
    }

    private void removeAnimationFromView(View view)
    {
        if (view != null)
        {
            view.setAnimation(null);
        }
    }

    private void resetAnimations()
    {
        if (mAnimationRightOut != null)
        {
            mAnimationRightOut.reset();
            mAnimationRightOut.setAnimationListener(null);
        }
        if (mAnimationRightIn != null)
        {
            mAnimationRightIn.reset();
            mAnimationRightIn.setAnimationListener(null);
        }
        if (mAnimationLeftIn != null)
        {
            mAnimationLeftIn.reset();
            mAnimationLeftIn.setAnimationListener(null);
        }
        if (mAnimationLeftOut != null)
        {
            mAnimationLeftOut.reset();
            mAnimationLeftOut.setAnimationListener(null);
        }
    }

    public void cleanUp()
    {
        mAnimationLeftIn = null;
        mAnimationLeftOut = null;
        mAnimationRightIn = null;
        mAnimationRightOut = null;
        removeAllViews();
    }

    public void finishCurrentOperation()
    {
        if (mState == 1)
        {
            finishCurrentPushAnimation();
        } else
        if (mState == 2)
        {
            finishCurrentPop();
            return;
        }
    }

    public void popToRoot()
    {
        finishCurrentOperation();
        int i = getChildCount();
        if (i > 1)
        {
            for (; i > 2; i--)
            {
                removeViewAt(i - 1);
            }

            popViewImmediate();
        }
    }

    public View popView()
    {
        return popView(null);
    }

    public View popView(final TransitionListener listener)
    {
        View view = null;
        int i;
        if (mState == 2)
        {
            finishCurrentPop();
        } else
        if (mState == 1)
        {
            return finishCurrentPop();
        }
        i = getChildCount();
        if (i > 1)
        {
            view = getChildAt(i - 1);
            final View newTopChild = getChildAt(i - 2);
            mAnimationRightOut.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final ViewStackLayout this$0;
                final TransitionListener val$listener;

                public void onAnimationEnd(Animation animation)
                {
                    int j = getChildCount();
                    removeViewAt(j - 1);
                    mState = 0;
                    if (listener != null)
                    {
                        post(new Runnable() {

                            final _cls3 this$1;

                            public void run()
                            {
                                listener.onTransitionDone();
                            }

            
            {
                this$1 = _cls3.this;
                super();
            }
                        });
                    }
                    mAnimationRightOut.setAnimationListener(null);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = ViewStackLayout.this;
                listener = transitionlistener;
                super();
            }
            });
            mAnimationRightIn.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final ViewStackLayout this$0;
                final View val$newTopChild;

                public void onAnimationEnd(Animation animation)
                {
                }

                public void onAnimationRepeat(Animation animation)
                {
                    removeAnimationFromView(newTopChild);
                    mAnimationRightIn.setAnimationListener(null);
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = ViewStackLayout.this;
                newTopChild = view;
                super();
            }
            });
            newTopChild.setVisibility(0);
            newTopChild.startAnimation(mAnimationRightIn);
            view.startAnimation(mAnimationRightOut);
            mState = 2;
        }
        return view;
    }

    public View popViewImmediate()
    {
        View view = null;
        finishCurrentOperation();
        int i = getChildCount();
        if (i > 1)
        {
            view = getChildAt(i - 1);
            removeViewAt(i - 1);
            getChildAt(i - 2).setVisibility(0);
        }
        return view;
    }

    public void pushAndReplaceView(View view, TransitionListener transitionlistener)
    {
        pushView(view, true, transitionlistener);
    }

    public void pushAndReplaceViewImmediate(View view)
    {
        finishCurrentOperation();
        if (getChildCount() > 0)
        {
            removeViewAt(getChildCount() - 1);
        }
        pushViewImmediate(view);
    }

    public void pushView(View view, TransitionListener transitionlistener)
    {
        pushView(view, false, transitionlistener);
    }

    public void pushViewImmediate(View view)
    {
        finishCurrentOperation();
        int i = getChildCount();
        if (i > 0)
        {
            getChildAt(i - 1).setVisibility(8);
        }
        addView(view);
    }

    public void removeAllViews()
    {
        finishCurrentOperation();
        super.removeAllViews();
    }

    public void setAnimationDuration(int i)
    {
        mAnimationLeftIn.setDuration(i);
        mAnimationLeftOut.setDuration(i);
        mAnimationRightIn.setDuration(i);
        mAnimationRightOut.setDuration(i);
    }





/*
    static int access$202(ViewStackLayout viewstacklayout, int i)
    {
        viewstacklayout.mState = i;
        return i;
    }

*/



}
