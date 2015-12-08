// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.album;

import android.widget.AbsListView;

public class AlbumScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    private static final int FAST_SPEED = 20;
    private double mCurrentSpeed;
    private int mLastFirstVisibleItem;
    private long mStartTime;

    public AlbumScrollListener()
    {
        mLastFirstVisibleItem = 0;
        mStartTime = 0L;
        mCurrentSpeed = 0.0D;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (mLastFirstVisibleItem != i)
        {
            long l = System.currentTimeMillis();
            mCurrentSpeed = 1000D / (double)(l - mStartTime);
            mLastFirstVisibleItem = i;
            mStartTime = l;
            if (mCurrentSpeed > 20D)
            {
                onSpeedChange(true);
            }
            onVisibleItemsChanged(i, (i + j) - 1);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0)
        {
            onSpeedChange(false);
        }
    }

    public void onSpeedChange(boolean flag)
    {
    }

    public void onVisibleItemsChanged(int i, int j)
    {
    }
}
