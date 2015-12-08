// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui.animation;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.ListView;

// Referenced classes of package com.walmart.android.wmui.animation:
//            ListAnimator, DismissibleAdapter, BackgroundContainer

public class ListAnimationManager
{

    private static final int SWIPE_DURATION = 250;
    private DismissibleAdapter mAdapter;
    private ListAnimator mListAnimator;
    private ListView mListView;
    private android.widget.AbsListView.OnScrollListener mScrollListener = new android.widget.AbsListView.OnScrollListener() {

        final ListAnimationManager this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
            if (mWrappedScrollListener != null)
            {
                mWrappedScrollListener.onScroll(abslistview, i, j, k);
            }
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            boolean flag = true;
            ListAnimationManager listanimationmanager = ListAnimationManager.this;
            if (i == 1)
            {
                flag = false;
            }
            listanimationmanager.mSwipeEnabled = flag;
            if (mWrappedScrollListener != null)
            {
                mWrappedScrollListener.onScrollStateChanged(abslistview, i);
            }
        }

            
            {
                this$0 = ListAnimationManager.this;
                super();
            }
    };
    private boolean mSwipeEnabled;
    private int mSwipeSlop;
    private android.view.View.OnTouchListener mTouchListener = new android.view.View.OnTouchListener() {

        private View mDownView;
        float mDownX;
        float mDownY;
        final ListAnimationManager this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (!mSwipeEnabled)
            {
                return false;
            }
            motionevent.getAction();
            JVM INSTR tableswitch 0 3: default 48
        //                       0 50
        //                       1 387
        //                       2 224
        //                       3 174;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            return false;
_L2:
            if (mListAnimator.isAnimating())
            {
                return true;
            }
            mDownView = findTouchedView(motionevent);
            if (mDownView != null)
            {
                mDownX = motionevent.getX();
                mDownY = motionevent.getY();
                if (mDownView.getParent() != null)
                {
                    int i = mListView.getPositionForView(mDownView) - mListView.getHeaderViewsCount();
                    if (i < 0 || !mAdapter.isDismissible(i))
                    {
                        mDownView = null;
                    }
                } else
                {
                    mDownView = null;
                }
            }
_L7:
            return false;
_L5:
            if (mDownView != null)
            {
                mListAnimator.setSwipePosition(mDownView, 0.0F);
            }
            mDownView = null;
            mDownX = 0.0F;
            mDownY = 0.0F;
            mListAnimator.clearSwiping();
            continue; /* Loop/switch isn't completed */
_L4:
            if (mListAnimator.isAnimating())
            {
                return true;
            }
            if (mDownView != null)
            {
                float f = motionevent.getX() - mDownX;
                float f2 = Math.abs(f);
                float f4 = Math.abs(motionevent.getY() - mDownY);
                if (!mListAnimator.isSwiping() && f2 > (float)mSwipeSlop && f4 < f2 / 2.0F)
                {
                    mListAnimator.setSwiping(mDownView);
                    mListView.requestDisallowInterceptTouchEvent(true);
                }
                if (mListAnimator.isSwiping())
                {
                    mDownView.setPressed(false);
                    mListView.setPressed(false);
                    mListAnimator.setSwipePosition(mDownView, f);
                    return true;
                }
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (mListAnimator.isAnimating())
            {
                return true;
            }
            if (mListAnimator.isSwiping() && mDownView != null)
            {
                view = mDownView;
                float f1 = motionevent.getX() - mDownX;
                float f3 = Math.abs(f1);
                boolean flag;
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
                    flag = true;
                } else
                {
                    f3 = 1.0F - f3 / (float)view.getWidth();
                    f1 = 0.0F;
                    flag = false;
                }
                l = (int)((1.0F - f3) * 250F);
                mListAnimator.animateSwipe(view, f1, l, flag);
            }
            mDownView = null;
            mDownX = 0.0F;
            mDownY = 0.0F;
            mListAnimator.clearSwiping();
            if (true) goto _L7; else goto _L6
_L6:
        }

            
            {
                this$0 = ListAnimationManager.this;
                super();
            }
    };
    private android.widget.AbsListView.OnScrollListener mWrappedScrollListener;

    public ListAnimationManager(ListView listview, DismissibleAdapter dismissibleadapter)
    {
        this(listview, dismissibleadapter, null, null);
    }

    public ListAnimationManager(ListView listview, DismissibleAdapter dismissibleadapter, BackgroundContainer backgroundcontainer)
    {
        this(listview, dismissibleadapter, backgroundcontainer, null);
    }

    public ListAnimationManager(ListView listview, DismissibleAdapter dismissibleadapter, BackgroundContainer backgroundcontainer, android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        mSwipeEnabled = true;
        mSwipeSlop = -1;
        mListView = listview;
        mAdapter = dismissibleadapter;
        mListView.setOnTouchListener(mTouchListener);
        mListView.setOnScrollListener(mScrollListener);
        mListAnimator = new ListAnimator(listview, dismissibleadapter, backgroundcontainer);
        mSwipeSlop = ViewConfiguration.get(mListView.getContext()).getScaledTouchSlop();
        mWrappedScrollListener = onscrolllistener;
    }

    private View findTouchedView(MotionEvent motionevent)
    {
        new Rect();
        mListView.getChildCount();
        int ai[] = new int[2];
        mListView.getLocationOnScreen(ai);
        int i = (int)motionevent.getRawX();
        int j = ai[0];
        int k = (int)motionevent.getRawY();
        int l = ai[1];
        return mListView.getChildAt(mListView.pointToPosition(i - j, k - l) - mListView.getFirstVisiblePosition());
    }

    public void animateItemViews(Runnable runnable)
    {
        mListAnimator.animateItemViews(runnable);
    }



/*
    static boolean access$002(ListAnimationManager listanimationmanager, boolean flag)
    {
        listanimationmanager.mSwipeEnabled = flag;
        return flag;
    }

*/






}
