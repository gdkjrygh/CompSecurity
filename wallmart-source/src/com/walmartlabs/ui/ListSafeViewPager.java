// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;

public class ListSafeViewPager extends ViewPager
{

    public static final String TAG = com/walmartlabs/ui/ListSafeViewPager.getSimpleName();
    GestureDetectorCompat gestureDetector;
    private boolean mFirstScroll;
    android.view.GestureDetector.OnGestureListener mGestureListener = new android.view.GestureDetector.SimpleOnGestureListener() {

        final ListSafeViewPager this$0;

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            if (Math.abs(f) > Math.abs(f1))
            {
                return true;
            } else
            {
                mFirstScroll = true;
                return false;
            }
        }

        public boolean onSingleTapUp(MotionEvent motionevent)
        {
            if (mOnClickListener != null)
            {
                mOnClickListener.onClick(ListSafeViewPager.this);
            }
            return super.onSingleTapUp(motionevent);
        }

            
            {
                this$0 = ListSafeViewPager.this;
                super();
            }
    };
    private android.view.View.OnClickListener mOnClickListener;

    public ListSafeViewPager(Context context)
    {
        super(context);
        mFirstScroll = false;
        init();
    }

    public ListSafeViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mFirstScroll = false;
        init();
    }

    private void init()
    {
        if (!isInEditMode())
        {
            gestureDetector = new GestureDetectorCompat(getContext(), mGestureListener);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        if (i != 0) goto _L2; else goto _L1
_L1:
        getParent().requestDisallowInterceptTouchEvent(true);
_L4:
        boolean flag = gestureDetector.onTouchEvent(motionevent);
        if (mFirstScroll)
        {
            mFirstScroll = false;
            if (!flag)
            {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionevent);
_L2:
        if (i == 1 || i == 3)
        {
            mFirstScroll = false;
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        mOnClickListener = onclicklistener;
    }




/*
    static boolean access$102(ListSafeViewPager listsafeviewpager, boolean flag)
    {
        listsafeviewpager.mFirstScroll = flag;
        return flag;
    }

*/
}
