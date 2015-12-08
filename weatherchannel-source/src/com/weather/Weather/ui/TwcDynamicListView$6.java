// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ui;

import android.widget.AbsListView;

// Referenced classes of package com.weather.Weather.ui:
//            TwcDynamicListView

class mPreviousVisibleItemCount
    implements android.widget.istener
{

    private int mCurrentFirstVisibleItem;
    private int mCurrentScrollState;
    private int mCurrentVisibleItemCount;
    private int mPreviousFirstVisibleItem;
    private int mPreviousVisibleItemCount;
    final TwcDynamicListView this$0;

    private void isScrollCompleted()
    {
        if (mCurrentVisibleItemCount > 0 && mCurrentScrollState == 0)
        {
            if (TwcDynamicListView.access$1200(TwcDynamicListView.this) && TwcDynamicListView.access$1300(TwcDynamicListView.this))
            {
                TwcDynamicListView.access$1400(TwcDynamicListView.this);
            } else
            if (TwcDynamicListView.access$1500(TwcDynamicListView.this))
            {
                TwcDynamicListView.access$1600(TwcDynamicListView.this);
                return;
            }
        }
    }

    public void checkAndHandleFirstVisibleCellChange()
    {
        if (mCurrentFirstVisibleItem != mPreviousFirstVisibleItem && TwcDynamicListView.access$1200(TwcDynamicListView.this) && TwcDynamicListView.access$600(TwcDynamicListView.this) != -1L)
        {
            TwcDynamicListView.access$1700(TwcDynamicListView.this, TwcDynamicListView.access$600(TwcDynamicListView.this));
            TwcDynamicListView.access$1800(TwcDynamicListView.this);
        }
    }

    public void checkAndHandleLastVisibleCellChange()
    {
        if (mCurrentFirstVisibleItem + mCurrentVisibleItemCount != mPreviousFirstVisibleItem + mPreviousVisibleItemCount && TwcDynamicListView.access$1200(TwcDynamicListView.this) && TwcDynamicListView.access$600(TwcDynamicListView.this) != -1L)
        {
            TwcDynamicListView.access$1700(TwcDynamicListView.this, TwcDynamicListView.access$600(TwcDynamicListView.this));
            TwcDynamicListView.access$1800(TwcDynamicListView.this);
        }
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        mCurrentFirstVisibleItem = i;
        mCurrentVisibleItemCount = j;
        if (mPreviousFirstVisibleItem == -1)
        {
            i = mCurrentFirstVisibleItem;
        } else
        {
            i = mPreviousFirstVisibleItem;
        }
        mPreviousFirstVisibleItem = i;
        if (mPreviousVisibleItemCount == -1)
        {
            i = mCurrentVisibleItemCount;
        } else
        {
            i = mPreviousVisibleItemCount;
        }
        mPreviousVisibleItemCount = i;
        checkAndHandleFirstVisibleCellChange();
        checkAndHandleLastVisibleCellChange();
        mPreviousFirstVisibleItem = mCurrentFirstVisibleItem;
        mPreviousVisibleItemCount = mCurrentVisibleItemCount;
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        mCurrentScrollState = i;
        TwcDynamicListView.access$1102(TwcDynamicListView.this, i);
        isScrollCompleted();
    }

    ()
    {
        this$0 = TwcDynamicListView.this;
        super();
        mPreviousFirstVisibleItem = -1;
        mPreviousVisibleItemCount = -1;
    }
}
