// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup
{
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public final int horizontal_spacing;
        public final int vertical_spacing;

        public LayoutParams(int i, int j)
        {
            super(0, 0);
            horizontal_spacing = i;
            vertical_spacing = j;
        }
    }


    static final boolean $assertionsDisabled;
    private int line_height;

    public FlowLayout(Context context)
    {
        super(context);
    }

    public FlowLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FlowLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(1, 1);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int l1 = getChildCount();
        l = getPaddingLeft();
        j = getPaddingTop();
        for (int j1 = 0; j1 < l1;)
        {
            View view = getChildAt(j1);
            int k1 = l;
            int i1 = j;
            if (view.getVisibility() != 8)
            {
                int i2 = view.getMeasuredWidth();
                int j2 = view.getMeasuredHeight();
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                k1 = l;
                i1 = j;
                if (l + i2 > k - i)
                {
                    k1 = getPaddingLeft();
                    i1 = j + line_height;
                }
                view.layout(k1, i1, k1 + i2, i1 + j2);
                k1 += layoutparams.horizontal_spacing + i2;
            }
            j1++;
            l = k1;
            j = i1;
        }

    }

    protected void onMeasure(int i, int j)
    {
        int i1;
        int k2;
        int l2;
        if (!$assertionsDisabled && android.view.View.MeasureSpec.getMode(i) == 0)
        {
            throw new AssertionError();
        }
        l2 = android.view.View.MeasureSpec.getSize(i) - getPaddingLeft() - getPaddingRight();
        k2 = android.view.View.MeasureSpec.getSize(j) - getPaddingTop() - getPaddingBottom();
        int i3 = getChildCount();
        i1 = 0;
        int k = getPaddingLeft();
        i = getPaddingTop();
        int j1;
        int k1;
        if (android.view.View.MeasureSpec.getMode(j) == 0x80000000)
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x80000000);
        } else
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        for (k1 = 0; k1 < i3;)
        {
            View view = getChildAt(k1);
            int j2 = i1;
            int i2 = k;
            int l1 = i;
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x80000000), j1);
                i2 = view.getMeasuredWidth();
                j2 = Math.max(i1, view.getMeasuredHeight() + layoutparams.vertical_spacing);
                l1 = k;
                i1 = i;
                if (k + i2 > l2)
                {
                    l1 = getPaddingLeft();
                    i1 = i + j2;
                }
                i2 = l1 + (layoutparams.horizontal_spacing + i2);
                l1 = i1;
            }
            k1++;
            i1 = j2;
            k = i2;
            i = l1;
        }

        line_height = i1;
        if (android.view.View.MeasureSpec.getMode(j) != 0) goto _L2; else goto _L1
_L1:
        int l = i + i1;
_L4:
        setMeasuredDimension(l2, l);
        return;
_L2:
        l = k2;
        if (android.view.View.MeasureSpec.getMode(j) == 0x80000000)
        {
            l = k2;
            if (i + i1 < k2)
            {
                l = i + i1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        boolean flag;
        if (!com/contextlogic/wish/ui/components/layout/FlowLayout.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
