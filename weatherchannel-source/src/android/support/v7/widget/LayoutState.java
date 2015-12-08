// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

class LayoutState
{

    static final int INVALID_LAYOUT = 0x80000000;
    static final int ITEM_DIRECTION_HEAD = -1;
    static final int ITEM_DIRECTION_TAIL = 1;
    static final int LAYOUT_END = 1;
    static final int LAYOUT_START = -1;
    static final int SCOLLING_OFFSET_NaN = 0x80000000;
    static final String TAG = "LayoutState";
    int mAvailable;
    int mCurrentPosition;
    int mEndLine;
    int mItemDirection;
    int mLayoutDirection;
    int mStartLine;

    LayoutState()
    {
        mStartLine = 0;
        mEndLine = 0;
    }

    boolean hasMore(RecyclerView.State state)
    {
        return mCurrentPosition >= 0 && mCurrentPosition < state.getItemCount();
    }

    View next(RecyclerView.Recycler recycler)
    {
        recycler = recycler.getViewForPosition(mCurrentPosition);
        mCurrentPosition = mCurrentPosition + mItemDirection;
        return recycler;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LayoutState{mAvailable=").append(mAvailable).append(", mCurrentPosition=").append(mCurrentPosition).append(", mItemDirection=").append(mItemDirection).append(", mLayoutDirection=").append(mLayoutDirection).append(", mStartLine=").append(mStartLine).append(", mEndLine=").append(mEndLine).append('}').toString();
    }
}
