// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;

public class ListLayoutManager extends LinearLayoutManager
{

    public ListLayoutManager(Context context)
    {
        super(context);
    }

    public ListLayoutManager(Context context, int i)
    {
        super(context, i, false);
    }

    private void measureChild(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        int k = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i;
        int j;
        if (getOrientation() == 0)
        {
            j = ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 0, layoutparams.width);
            i = ViewGroup.getChildMeasureSpec(k, 0, layoutparams.height);
        } else
        {
            i = ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 0, layoutparams.height);
            j = ViewGroup.getChildMeasureSpec(k, 0, layoutparams.width);
        }
        view.measure(j, i);
    }

    private void measureScrapChild(android.support.v7.widget.RecyclerView.Recycler recycler, int i, int j, int ai[])
    {
        View view = recycler.getViewForPosition(0);
        if (view != null)
        {
            Object obj = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
            i = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((android.support.v7.widget.RecyclerView.LayoutParams) (obj)).width);
            j = ViewGroup.getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom(), ((android.support.v7.widget.RecyclerView.LayoutParams) (obj)).height);
            obj = new Rect();
            calculateItemDecorationsForChild(view, ((Rect) (obj)));
            view.measure(i, j);
            ai[0] = view.getMeasuredWidth() + ((Rect) (obj)).left + ((Rect) (obj)).right;
            ai[1] = view.getMeasuredHeight() + ((Rect) (obj)).top + ((Rect) (obj)).bottom;
            recycler.recycleView(view);
        }
    }

    private int processSizeSecondary(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state)
    {
        byte byte0 = -1;
        byte byte1 = -1;
        int k = -1;
        Rect rect = new Rect();
        int l = 0;
        while (l < getChildCount()) 
        {
            View view = findViewByPosition(l);
            int i1;
            if (view == null)
            {
                i1 = k;
            } else
            {
                if (view.isLayoutRequested())
                {
                    measureChild(view);
                }
                calculateItemDecorationsForChild(view, rect);
                int i;
                if (getOrientation() == 0)
                {
                    i = view.getMeasuredHeight() + rect.top + rect.bottom;
                } else
                {
                    i = view.getMeasuredWidth() + rect.left + rect.right;
                }
                i1 = k;
                if (i > k)
                {
                    i1 = i;
                }
            }
            l++;
            k = i1;
        }
        int j = k;
        if (k < 0)
        {
            j = k;
            if (state.getItemCount() > 0)
            {
                k = byte1;
                j = byte0;
                if (-1 < 0)
                {
                    k = byte1;
                    j = byte0;
                    if (-1 < 0)
                    {
                        state = new int[2];
                        measureScrapChild(recycler, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0), state);
                        j = state[0];
                        k = state[1];
                    }
                }
                if (getOrientation() == 0)
                {
                    j = k;
                }
            }
        }
        k = j;
        if (j < 0)
        {
            k = 0;
        }
        return k;
    }

    public void onMeasure(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state, int i, int j)
    {
        int l;
        int j1;
        int k;
        if (getOrientation() == 0)
        {
            l = android.view.View.MeasureSpec.getSize(i);
            i = android.view.View.MeasureSpec.getSize(j);
            k = android.view.View.MeasureSpec.getMode(j);
            int i1 = getPaddingTop() + getPaddingBottom();
            j = l;
            l = i1;
        } else
        {
            j1 = android.view.View.MeasureSpec.getSize(i);
            j = android.view.View.MeasureSpec.getSize(j);
            k = android.view.View.MeasureSpec.getMode(i);
            l = getPaddingLeft() + getPaddingRight();
            i = j1;
        }
        j1 = processSizeSecondary(recycler, state);
        switch (k)
        {
        default:
            throw new IllegalStateException("wrong spec");

        case -2147483648: 
            break MISSING_BLOCK_LABEL_155;

        case 1073741824: 
            break;

        case 0: // '\0'
            i = j1 + l;
            break;
        }
_L1:
        if (getOrientation() == 0)
        {
            setMeasuredDimension(j, i);
            return;
        } else
        {
            setMeasuredDimension(i, j);
            return;
        }
        i = Math.min(j1 + l, i);
          goto _L1
    }
}
