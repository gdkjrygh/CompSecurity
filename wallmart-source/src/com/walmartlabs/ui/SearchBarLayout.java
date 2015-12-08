// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;

public class SearchBarLayout extends FrameLayout
{
    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams
    {

        private int mBottom;
        private int mLeft;
        private int mRight;
        private int mTop;



/*
        static int access$002(LayoutParams layoutparams, int i)
        {
            layoutparams.mLeft = i;
            return i;
        }

*/



/*
        static int access$102(LayoutParams layoutparams, int i)
        {
            layoutparams.mRight = i;
            return i;
        }

*/



/*
        static int access$202(LayoutParams layoutparams, int i)
        {
            layoutparams.mTop = i;
            return i;
        }

*/



/*
        static int access$302(LayoutParams layoutparams, int i)
        {
            layoutparams.mBottom = i;
            return i;
        }

*/

        public LayoutParams(int i, int j)
        {
            super(i, j);
        }

        public LayoutParams(int i, int j, int k)
        {
            super(i, j, k);
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
        }
    }


    static boolean DEBUG = false;
    private static final int STATE_COLLAPSED = 1;
    private static final int STATE_COLLAPSING = 4;
    private static final int STATE_EXPANDED = 3;
    private static final int STATE_EXPANDING = 2;
    public static final String TAG = com/walmartlabs/ui/SearchBarLayout.getSimpleName();
    private int mAnimateOutViewId;
    private long mAnimationEndTime;
    private long mAnimationTime;
    private Interpolator mInterpolator;
    private int mSearchFieldViewCollapsedWidth;
    private int mSearchFieldViewId;
    private int mState;

    public SearchBarLayout(Context context)
    {
        super(context);
        mState = 1;
        mInterpolator = new AccelerateDecelerateInterpolator();
        mAnimationTime = 150L;
    }

    public SearchBarLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mState = 1;
        mInterpolator = new AccelerateDecelerateInterpolator();
        mAnimationTime = 150L;
        init(attributeset);
    }

    public SearchBarLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mState = 1;
        mInterpolator = new AccelerateDecelerateInterpolator();
        mAnimationTime = 150L;
        init(attributeset);
    }

    private long getReverseAnimationEndTime()
    {
        long l = System.currentTimeMillis();
        return l + (l - (mAnimationEndTime - mAnimationTime));
    }

    private void init(AttributeSet attributeset)
    {
        if (attributeset != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.SearchBarLayout);
            mSearchFieldViewId = attributeset.getResourceId(com.walmart.lib.R.styleable.SearchBarLayout_searchFieldViewId, -1);
            mAnimateOutViewId = attributeset.getResourceId(com.walmart.lib.R.styleable.SearchBarLayout_animateOutViewId, -1);
            mAnimationTime = attributeset.getInt(com.walmart.lib.R.styleable.SearchBarLayout_animationTime, 150);
            attributeset.recycle();
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(super.generateLayoutParams(layoutparams));
    }

    public volatile android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(super.generateLayoutParams(attributeset));
    }

    protected void onDraw(Canvas canvas)
    {
        if (mState == 1 || mState == 3)
        {
            findViewById(mSearchFieldViewId).draw(canvas);
            View view = findViewById(mAnimateOutViewId);
            canvas.save();
            canvas.translate(((LayoutParams)view.getLayoutParams()).mLeft, 0.0F);
            view.draw(canvas);
            canvas.restore();
            return;
        }
        long l = System.currentTimeMillis();
        long l1 = mAnimationEndTime - l;
        if (DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("animation time left: ").append(l1).toString());
        }
        l = l1;
        if (l1 < 0L)
        {
            l = 0L;
        }
        float f = (float)(mAnimationTime - l) / (float)mAnimationTime;
        f = mInterpolator.getInterpolation(f);
        View view1 = findViewById(mAnimateOutViewId);
        LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
        int k = view1.getMeasuredWidth() + layoutparams.rightMargin;
        int j = (int)((float)k * f);
        int i = j;
        if (mState == 4)
        {
            i = k - j;
        }
        if (DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("currentValue/endValue: ").append(i).append("/").append(k).toString());
        }
        View view2 = findViewById(mSearchFieldViewId);
        view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(mSearchFieldViewCollapsedWidth + i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), 0x40000000));
        onLayout(true, 0, 0, 0, 0);
        view2.draw(canvas);
        canvas.save();
        canvas.translate(layoutparams.mLeft, 0.0F);
        view1.draw(canvas);
        canvas.restore();
        if (l == 0L)
        {
            if (mState == 4)
            {
                mState = 1;
            } else
            {
                mState = 3;
            }
        }
        invalidate();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = findViewById(mSearchFieldViewId);
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        layoutparams.mLeft = getPaddingLeft() + layoutparams.leftMargin;
        layoutparams.mRight = layoutparams.mLeft + view.getMeasuredWidth();
        layoutparams.mTop = getPaddingTop() + layoutparams.topMargin;
        layoutparams.mBottom = layoutparams.mTop + view.getMeasuredHeight();
        view.layout(layoutparams.mLeft, layoutparams.mTop, layoutparams.mRight, layoutparams.mBottom);
        view = findViewById(mAnimateOutViewId);
        i = layoutparams.mRight;
        j = layoutparams.rightMargin;
        layoutparams = (LayoutParams)view.getLayoutParams();
        layoutparams.mLeft = layoutparams.leftMargin + (i + j);
        layoutparams.mRight = layoutparams.mLeft + view.getMeasuredWidth();
        layoutparams.mTop = getPaddingTop() + layoutparams.topMargin;
        layoutparams.mBottom = layoutparams.mTop + view.getMeasuredHeight();
        view.layout(layoutparams.mLeft, layoutparams.mTop, layoutparams.mRight, layoutparams.mBottom);
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        i = getPaddingLeft();
        int l = getPaddingRight();
        if (mState == 1 || mState == 3)
        {
            View view = findViewById(mAnimateOutViewId);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            i = k - i - l - layoutparams.leftMargin - layoutparams.rightMargin;
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
            View view1 = findViewById(mSearchFieldViewId);
            LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
            mSearchFieldViewCollapsedWidth = i - view.getMeasuredWidth() - layoutparams1.leftMargin - layoutparams1.rightMargin;
            i = mSearchFieldViewCollapsedWidth + view.getMeasuredWidth() + layoutparams.rightMargin;
            if (mState == 1)
            {
                i = mSearchFieldViewCollapsedWidth;
            }
            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
        }
        setMeasuredDimension(k, android.view.View.MeasureSpec.getSize(j));
    }

    public void setCollapsed()
    {
        mState = 1;
        requestLayout();
    }

    public void setCollapsed(boolean flag)
    {
        if (flag)
        {
            if (mState == 3 || mState == 2)
            {
                toggle();
            }
            return;
        } else
        {
            setCollapsed();
            return;
        }
    }

    public void setExpanded()
    {
        mState = 3;
        requestLayout();
    }

    public void setExpanded(boolean flag)
    {
        if (flag)
        {
            if (mState == 1 || mState == 4)
            {
                toggle();
            }
            return;
        } else
        {
            setExpanded();
            return;
        }
    }

    public void toggle()
    {
        if (mState == 1 || mState == 4)
        {
            if (DEBUG)
            {
                Log.d(TAG, "Changing state to EXPANDING");
            }
            if (mState == 4)
            {
                mAnimationEndTime = getReverseAnimationEndTime();
            } else
            {
                mAnimationEndTime = System.currentTimeMillis() + mAnimationTime;
            }
            mState = 2;
            invalidate();
        } else
        if (mState == 3 || mState == 2)
        {
            if (DEBUG)
            {
                Log.d(TAG, "Changing state to COLLAPSING");
            }
            if (mState == 2)
            {
                mAnimationEndTime = getReverseAnimationEndTime();
            } else
            {
                mAnimationEndTime = System.currentTimeMillis() + mAnimationTime;
            }
            mState = 4;
            invalidate();
            return;
        }
    }

    static 
    {
        DEBUG = false;
    }
}
