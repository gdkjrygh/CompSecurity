// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.widget.AbsListView;
import android.widget.ListView;
import java.util.ArrayList;

public class ListPositionTracker
{
    public static interface Listener
    {

        public abstract void onScrollDirectionChanged(int i);
    }


    public static String TAG = com/walmart/android/app/shop/ListPositionTracker.getSimpleName();
    private int mActualListScrollDirection;
    int mFirstVisiblePosition;
    int mLastVisiblePosition;
    private int mListScrollDirection;
    public ListView mListView;
    private Listener mListener;
    public ArrayList mOnScrollListeners;
    private int mPendingDirectionChange;
    private int mPendingTopItemIndex;
    private int mPreviousTopItemIndex;

    public ListPositionTracker(ListView listview)
    {
        mFirstVisiblePosition = 0;
        mLastVisiblePosition = 0;
        mListScrollDirection = 1;
        mPreviousTopItemIndex = 0;
        mActualListScrollDirection = 1;
        mPendingDirectionChange = 0;
        mPendingTopItemIndex = 0;
        mListView = listview;
    }

    public void checkScrollDirection(int i)
    {
        boolean flag = false;
        boolean flag1;
        if (mListScrollDirection == -1)
        {
            if (i > mPreviousTopItemIndex)
            {
                mListScrollDirection = 1;
                flag = true;
            }
        } else
        if (i < mPreviousTopItemIndex)
        {
            mListScrollDirection = -1;
            flag = true;
        }
        if (flag)
        {
            mPendingDirectionChange = mListScrollDirection;
            mPendingTopItemIndex = i;
        }
        flag1 = false;
        if (mPendingDirectionChange == -1)
        {
            flag = flag1;
            if (i < mPendingTopItemIndex - 1)
            {
                flag = true;
            }
        } else
        {
            flag = flag1;
            if (mPendingDirectionChange == 1)
            {
                flag = flag1;
                if (i > mPendingTopItemIndex + 1)
                {
                    flag = true;
                }
            }
        }
        if (flag)
        {
            if (mPendingDirectionChange != mActualListScrollDirection)
            {
                if (mListener != null)
                {
                    mListener.onScrollDirectionChanged(mPendingDirectionChange);
                }
                mActualListScrollDirection = mPendingDirectionChange;
            }
            mPendingDirectionChange = 0;
        }
        mPreviousTopItemIndex = i;
    }

    public int getFirstVisible()
    {
        return mFirstVisiblePosition;
    }

    public int getLastVisible()
    {
        return mLastVisiblePosition;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        j = mListView.getFirstVisiblePosition();
        k = mListView.getLastVisiblePosition();
        if (j != mFirstVisiblePosition || k != mLastVisiblePosition)
        {
            mFirstVisiblePosition = j;
            mLastVisiblePosition = k;
        }
        checkScrollDirection(i);
    }

    public void setListener(Listener listener)
    {
        mListener = listener;
    }

}
