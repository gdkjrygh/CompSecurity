// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.walmartlabs.ui.recycler.BasicRecyclerView;

public class SwipeController
{
    public static interface DismissibleAdapter
    {

        public abstract void dismiss(int i);

        public abstract boolean isDismissible(int i);
    }


    private static final int SWIPE_DURATION = 250;
    private static final int sCoords[] = new int[2];
    private static final Rect sRect = new Rect();
    private final DismissibleAdapter mAdapter;
    private boolean mIsAnimating;
    private boolean mIsSwipeEnabled;
    private boolean mIsSwiping;
    private final BasicRecyclerView mListView;
    private final android.support.v7.widget.RecyclerView.OnScrollListener mScrollListener = new android.support.v7.widget.RecyclerView.OnScrollListener() {

        final SwipeController this$0;

        public void onScrollStateChanged(RecyclerView recyclerview, int j)
        {
            boolean flag = true;
            recyclerview = SwipeController.this;
            if (j == 1)
            {
                flag = false;
            }
            recyclerview.mIsSwipeEnabled = flag;
        }

            
            {
                this$0 = SwipeController.this;
                super();
            }
    };
    private final int mSlidingViewId;
    private int mSwipeSlop;
    private final android.support.v7.widget.RecyclerView.OnItemTouchListener mTouchListener = new android.support.v7.widget.RecyclerView.SimpleOnItemTouchListener() {

        private View mDownView;
        float mDownX;
        float mDownY;
        private View mSlidingView;
        final SwipeController this$0;

        public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
        {
            return onTouch(motionevent);
        }

        public boolean onTouch(MotionEvent motionevent)
        {
            if (!mIsSwipeEnabled)
            {
                return false;
            }
            motionevent.getAction();
            JVM INSTR tableswitch 0 3: default 48
        //                       0 50
        //                       1 410
        //                       2 247
        //                       3 196;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            return false;
_L2:
            if (mIsAnimating)
            {
                return true;
            }
            mDownView = findTouchedView(motionevent);
            if (mDownView != null)
            {
                mDownX = motionevent.getX();
                mDownY = motionevent.getY();
                mSlidingView = findSlidingView(mDownView);
                if (mDownView.getParent() != null)
                {
                    int j = mListView.getChildAdapterPosition(mDownView) - mListView.getHeaderCount();
                    if (j < 0 || !mAdapter.isDismissible(j))
                    {
                        mDownView = null;
                        mSlidingView = null;
                    }
                } else
                {
                    mDownView = null;
                    mSlidingView = null;
                }
            }
_L7:
            return false;
_L5:
            if (mDownView != null)
            {
                setSwipePosition(mSlidingView, 0.0F);
            }
            mDownView = null;
            mSlidingView = null;
            mDownX = 0.0F;
            mDownY = 0.0F;
            mIsSwiping = false;
            continue; /* Loop/switch isn't completed */
_L4:
            if (mIsAnimating)
            {
                return true;
            }
            if (mDownView != null)
            {
                float f = motionevent.getX() - mDownX;
                float f2;
                float f4;
                boolean flag;
                if (f < 0.0F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                f2 = Math.abs(f);
                f4 = Math.abs(motionevent.getY() - mDownY);
                if (flag)
                {
                    if (!mIsSwiping && f2 > (float)mSwipeSlop && f4 < f2 / 2.0F)
                    {
                        mIsSwiping = true;
                        mListView.requestDisallowInterceptTouchEvent(true);
                    }
                    if (mIsSwiping)
                    {
                        mDownView.setPressed(false);
                        mListView.setPressed(false);
                        setSwipePosition(mSlidingView, f);
                        return true;
                    }
                }
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (mIsAnimating)
            {
                return true;
            }
            if (mIsSwiping && mDownView != null)
            {
                View view = mDownView;
                View view1 = mSlidingView;
                float f1 = motionevent.getX() - mDownX;
                float f3 = Math.abs(f1);
                boolean flag1;
                if (f3 > (float)(view.getWidth() / 4))
                {
                    f3 /= view.getWidth();
                    long l;
                    if (f1 < 0.0F)
                    {
                        f1 = -view.getWidth();
                    } else
                    {
                        f1 = view.getWidth();
                    }
                    flag1 = true;
                } else
                {
                    f3 = 1.0F - f3 / (float)view.getWidth();
                    f1 = 0.0F;
                    flag1 = false;
                }
                l = (int)((1.0F - f3) * 250F);
                animateSwipe(view, view1, f1, l, flag1);
            }
            mDownView = null;
            mSlidingView = null;
            mDownX = 0.0F;
            mDownY = 0.0F;
            mIsSwiping = false;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
        {
            onTouch(motionevent);
        }

            
            {
                this$0 = SwipeController.this;
                super();
            }
    };

    public SwipeController(BasicRecyclerView basicrecyclerview, DismissibleAdapter dismissibleadapter, int i)
    {
        mIsSwipeEnabled = true;
        mSwipeSlop = -1;
        mListView = basicrecyclerview;
        mAdapter = dismissibleadapter;
        mListView.addOnItemTouchListener(mTouchListener);
        mListView.addOnScrollListener(mScrollListener);
        mSwipeSlop = ViewConfiguration.get(mListView.getContext()).getScaledTouchSlop();
        mSlidingViewId = i;
    }

    private void animateSwipe(final View downView, final View slideView, float f, long l, final boolean remove)
    {
        mIsAnimating = true;
        mListView.setEnabled(false);
        slideView.animate().setDuration(l).translationX(f).setListener(new AnimatorListenerAdapter() {

            final SwipeController this$0;
            final View val$downView;
            final boolean val$remove;
            final View val$slideView;

            public void onAnimationEnd(Animator animator)
            {
                slideView.setTranslationX(0.0F);
                if (remove)
                {
                    slideView.setVisibility(4);
                    if (downView.getParent() != null)
                    {
                        int i = mListView.getChildAdapterPosition(downView) - mListView.getHeaderCount();
                        if (i >= 0)
                        {
                            mAdapter.dismiss(i);
                        }
                    }
                }
                mIsSwiping = false;
                mIsAnimating = false;
                mListView.setEnabled(true);
            }

            
            {
                this$0 = SwipeController.this;
                slideView = view;
                remove = flag;
                downView = view1;
                super();
            }
        });
    }

    private View findSlidingView(View view)
    {
        if (view instanceof ViewGroup)
        {
            View view1 = ((ViewGroup)view).findViewById(mSlidingViewId);
            if (view1 != null)
            {
                return view1;
            } else
            {
                return view;
            }
        } else
        {
            return view;
        }
    }

    private View findTouchedView(MotionEvent motionevent)
    {
        int j = mListView.getChildCount();
        mListView.getLocationOnScreen(sCoords);
        int k = (int)motionevent.getRawX();
        int l = sCoords[0];
        int i1 = (int)motionevent.getRawY();
        int j1 = sCoords[1];
        Object obj = null;
        int i = 0;
        do
        {
label0:
            {
                motionevent = obj;
                if (i < j)
                {
                    motionevent = mListView.getChildAt(i);
                    motionevent.getHitRect(sRect);
                    if (!sRect.contains(k - l, i1 - j1))
                    {
                        break label0;
                    }
                }
                return motionevent;
            }
            i++;
        } while (true);
    }

    private void setSwipePosition(View view, float f)
    {
        view.setTranslationX(f);
    }




/*
    static boolean access$002(SwipeController swipecontroller, boolean flag)
    {
        swipecontroller.mIsSwipeEnabled = flag;
        return flag;
    }

*/



/*
    static boolean access$102(SwipeController swipecontroller, boolean flag)
    {
        swipecontroller.mIsAnimating = flag;
        return flag;
    }

*/








/*
    static boolean access$702(SwipeController swipecontroller, boolean flag)
    {
        swipecontroller.mIsSwiping = flag;
        return flag;
    }

*/


}
