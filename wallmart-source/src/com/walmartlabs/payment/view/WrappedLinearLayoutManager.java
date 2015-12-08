// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.walmartlabs.utils.WLog;
import java.lang.reflect.Field;

public class WrappedLinearLayoutManager extends LinearLayoutManager
{

    private static final int CHILD_HEIGHT = 1;
    private static final int CHILD_WIDTH = 0;
    private static final int DEFAULT_CHILD_SIZE = 100;
    private static final String TAG = com/walmartlabs/payment/view/WrappedLinearLayoutManager.getSimpleName();
    private static boolean canMakeInsetsDirty = true;
    private static Field insetsDirtyField = null;
    private final int childDimensions[];
    private int childSize;
    private boolean hasChildSize;
    private int overScrollMode;
    private final Rect tmpRect;
    private final RecyclerView view;

    public WrappedLinearLayoutManager(Context context)
    {
        super(context);
        childDimensions = new int[2];
        childSize = 100;
        overScrollMode = 0;
        tmpRect = new Rect();
        view = null;
    }

    public WrappedLinearLayoutManager(Context context, int i, boolean flag)
    {
        super(context, i, flag);
        childDimensions = new int[2];
        childSize = 100;
        overScrollMode = 0;
        tmpRect = new Rect();
        view = null;
    }

    public WrappedLinearLayoutManager(RecyclerView recyclerview)
    {
        super(recyclerview.getContext());
        childDimensions = new int[2];
        childSize = 100;
        overScrollMode = 0;
        tmpRect = new Rect();
        view = recyclerview;
        overScrollMode = ViewCompat.getOverScrollMode(recyclerview);
    }

    public WrappedLinearLayoutManager(RecyclerView recyclerview, int i, boolean flag)
    {
        super(recyclerview.getContext(), i, flag);
        childDimensions = new int[2];
        childSize = 100;
        overScrollMode = 0;
        tmpRect = new Rect();
        view = recyclerview;
        overScrollMode = ViewCompat.getOverScrollMode(recyclerview);
    }

    private void initChildDimensions(int i, int j, boolean flag)
    {
        if (childDimensions[0] != 0 || childDimensions[1] != 0)
        {
            return;
        }
        if (flag)
        {
            childDimensions[0] = i;
            childDimensions[1] = childSize;
            return;
        } else
        {
            childDimensions[0] = childSize;
            childDimensions[1] = j;
            return;
        }
    }

    private void logMeasureWarning(int i)
    {
        WLog.w(TAG, (new StringBuilder()).append("Can't measure child #").append(i).append(", previously used dimensions will be reused.").append("To remove this message either use #setChildSize() method or don't run RecyclerView animations").toString());
    }

    private static void makeInsetsDirty(android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
    {
        if (!canMakeInsetsDirty)
        {
            return;
        }
        try
        {
            if (insetsDirtyField == null)
            {
                insetsDirtyField = android/support/v7/widget/RecyclerView$LayoutParams.getDeclaredField("mInsetsDirty");
                insetsDirtyField.setAccessible(true);
            }
            insetsDirtyField.set(layoutparams, Boolean.valueOf(true));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
        {
            onMakeInsertDirtyFailed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
        {
            onMakeInsertDirtyFailed();
        }
    }

    public static int makeUnspecifiedSpec()
    {
        return android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    private void measureChild(android.support.v7.widget.RecyclerView.Recycler recycler, int i, int j, int k, int ai[])
    {
        View view1;
        android.support.v7.widget.RecyclerView.LayoutParams layoutparams;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        try
        {
            view1 = recycler.getViewForPosition(i);
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v7.widget.RecyclerView.Recycler recycler)
        {
            WLog.w(TAG, "LinearLayoutManager doesn't work well with animations. Consider switching them off");
            return;
        }
        layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view1.getLayoutParams();
        i = getPaddingLeft();
        l = getPaddingRight();
        i1 = getPaddingTop();
        j1 = getPaddingBottom();
        k1 = layoutparams.leftMargin;
        l1 = layoutparams.rightMargin;
        i2 = layoutparams.topMargin;
        j2 = layoutparams.bottomMargin;
        makeInsetsDirty(layoutparams);
        calculateItemDecorationsForChild(view1, tmpRect);
        k2 = getRightDecorationWidth(view1);
        l2 = getLeftDecorationWidth(view1);
        i3 = getTopDecorationHeight(view1);
        j3 = getBottomDecorationHeight(view1);
        view1.measure(getChildMeasureSpec(j, i + l + (k1 + l1) + (k2 + l2), layoutparams.width, canScrollHorizontally()), getChildMeasureSpec(k, i1 + j1 + (i2 + j2) + (i3 + j3), layoutparams.height, canScrollVertically()));
        ai[0] = getDecoratedMeasuredWidth(view1) + layoutparams.leftMargin + layoutparams.rightMargin;
        ai[1] = getDecoratedMeasuredHeight(view1) + layoutparams.bottomMargin + layoutparams.topMargin;
        makeInsetsDirty(layoutparams);
        recycler.recycleView(view1);
    }

    private static void onMakeInsertDirtyFailed()
    {
        canMakeInsetsDirty = false;
    }

    public void clearChildSize()
    {
        hasChildSize = false;
        setChildSize(100);
    }

    public void onMeasure(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state, int i, int j)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        int l1;
        int i2;
        int j2;
        int i1 = android.view.View.MeasureSpec.getMode(i);
        int k = android.view.View.MeasureSpec.getMode(j);
        l1 = android.view.View.MeasureSpec.getSize(i);
        i2 = android.view.View.MeasureSpec.getSize(j);
        if (i1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i1 == 0x40000000)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (k == 0x40000000)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        j2 = makeUnspecifiedSpec();
        if (!flag3 || !flag2) goto _L2; else goto _L1
_L1:
        super.onMeasure(recycler, state, i, j);
_L7:
        return;
_L2:
        int l;
        int j1;
        int k1;
        int k2;
        int l2;
        boolean flag4;
        if (getOrientation() == 1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        initChildDimensions(l1, i2, flag4);
        j = 0;
        i = 0;
        recycler.clear();
        k2 = state.getItemCount();
        l2 = getItemCount();
        k1 = 0;
_L9:
        l = i;
        j1 = j;
        if (k1 >= l2) goto _L4; else goto _L3
_L3:
        if (!flag4) goto _L6; else goto _L5
_L5:
        if (!hasChildSize)
        {
            if (k1 < k2)
            {
                measureChild(recycler, k1, l1, j2, childDimensions);
            } else
            {
                logMeasureWarning(k1);
            }
        }
        i += childDimensions[1];
        if (k1 == 0)
        {
            j = childDimensions[0];
        }
        j1 = i;
        l = j;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        j1 = i;
        l = j;
        if (i < i2)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        j1 = j;
        l = i;
_L4:
        if (flag3)
        {
            i = l1;
        } else
        {
            j = j1 + (getPaddingLeft() + getPaddingRight());
            i = j;
            if (flag)
            {
                i = Math.min(j, l1);
            }
        }
        if (flag2)
        {
            j = i2;
        } else
        {
            l += getPaddingTop() + getPaddingBottom();
            j = l;
            if (flag1)
            {
                j = Math.min(l, i2);
            }
        }
        setMeasuredDimension(i, j);
        if (view != null && overScrollMode == 1)
        {
            if (flag4 && (!flag1 || j < i2) || !flag4 && (!flag || i < l1))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            recycler = view;
            if (i != 0)
            {
                i = 2;
            } else
            {
                i = 0;
            }
            ViewCompat.setOverScrollMode(recycler, i);
            return;
        }
          goto _L7
_L6:
        if (!hasChildSize)
        {
            if (k1 < k2)
            {
                measureChild(recycler, k1, j2, i2, childDimensions);
            } else
            {
                logMeasureWarning(k1);
            }
        }
        j += childDimensions[0];
        if (k1 == 0)
        {
            i = childDimensions[1];
        }
        j1 = i;
        l = j;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        l = i;
        j1 = j;
        if (j >= l1) goto _L4; else goto _L8
_L8:
        l = j;
        j1 = i;
        k1++;
        i = j1;
        j = l;
          goto _L9
    }

    public void setChildSize(int i)
    {
        hasChildSize = true;
        if (childSize != i)
        {
            childSize = i;
            requestLayout();
        }
    }

    public void setOrientation(int i)
    {
        if (childDimensions != null && getOrientation() != i)
        {
            childDimensions[0] = 0;
            childDimensions[1] = 0;
        }
        super.setOrientation(i);
    }

    public void setOverScrollMode(int i)
    {
        if (i < 0 || i > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown overscroll mode: ").append(i).toString());
        }
        if (view == null)
        {
            throw new IllegalStateException("view == null");
        } else
        {
            overScrollMode = i;
            ViewCompat.setOverScrollMode(view, i);
            return;
        }
    }

}
