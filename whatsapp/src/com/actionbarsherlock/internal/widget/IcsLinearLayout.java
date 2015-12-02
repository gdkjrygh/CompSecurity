// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView

public class IcsLinearLayout extends NineLinearLayout
{

    private static final int R_styleable_LinearLayout[] = {
        0x1010129, 0x10102d4, 0x1010329, 0x101032a
    };
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mShowDividers;
    private boolean mUseLargestChild;

    public IcsLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, R_styleable_LinearLayout);
        setDividerDrawable(context.getDrawable(0));
        mShowDividers = context.getInt(2, 0);
        mDividerPadding = context.getDimensionPixelSize(3, 0);
        mUseLargestChild = context.getBoolean(1, false);
        context.recycle();
    }

    private void useLargestChildHorizontal()
    {
        boolean flag = false;
        int j1 = AbsActionBarView.b;
        int k1 = getChildCount();
        int j = 0;
        int i = 0;
        int l;
        do
        {
            l = i;
            if (j >= k1)
            {
                break;
            }
            l = Math.max(getChildAt(j).getMeasuredWidth(), i);
            j++;
            i = l;
        } while (j1 == 0);
        int i1 = 0;
        i = ((flag) ? 1 : 0);
        do
        {
            int k;
label0:
            {
label1:
                {
label2:
                    {
                        android.widget.LinearLayout.LayoutParams layoutparams;
label3:
                        {
                            k = i;
                            if (i1 >= k1)
                            {
                                break label1;
                            }
                            View view = getChildAt(i1);
                            k = i;
                            if (view == null)
                            {
                                break label2;
                            }
                            if (view.getVisibility() == 8)
                            {
                                k = i;
                                if (j1 == 0)
                                {
                                    break label2;
                                }
                            }
                            layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
                            k = i;
                            if (layoutparams.weight > 0.0F)
                            {
                                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
                                k = i + l;
                                i = k;
                                if (j1 == 0)
                                {
                                    break label3;
                                }
                            }
                            i = k + view.getMeasuredWidth();
                        }
                        k = layoutparams.leftMargin;
                        k = i + (layoutparams.rightMargin + k);
                    }
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                setMeasuredDimension(getPaddingLeft() + getPaddingRight() + k, getMeasuredHeight());
                return;
            }
            i1++;
            i = k;
        } while (true);
    }

    private void useLargestChildVertical()
    {
        boolean flag = false;
        int j1 = AbsActionBarView.b;
        int k1 = getChildCount();
        int j = 0;
        int i = 0;
        int l;
        do
        {
            l = i;
            if (j >= k1)
            {
                break;
            }
            l = Math.max(getChildAt(j).getMeasuredHeight(), i);
            j++;
            i = l;
        } while (j1 == 0);
        int i1 = 0;
        i = ((flag) ? 1 : 0);
        do
        {
            int k;
label0:
            {
label1:
                {
label2:
                    {
                        android.widget.LinearLayout.LayoutParams layoutparams;
label3:
                        {
                            k = i;
                            if (i1 >= k1)
                            {
                                break label1;
                            }
                            View view = getChildAt(i1);
                            k = i;
                            if (view == null)
                            {
                                break label2;
                            }
                            if (view.getVisibility() == 8)
                            {
                                k = i;
                                if (j1 == 0)
                                {
                                    break label2;
                                }
                            }
                            layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
                            k = i;
                            if (layoutparams.weight > 0.0F)
                            {
                                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000));
                                k = i + l;
                                i = k;
                                if (j1 == 0)
                                {
                                    break label3;
                                }
                            }
                            i = k + view.getMeasuredHeight();
                        }
                        k = layoutparams.leftMargin;
                        k = i + (layoutparams.rightMargin + k);
                    }
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                i = getPaddingLeft();
                l = getPaddingRight();
                setMeasuredDimension(getMeasuredWidth(), i + l + k);
                return;
            }
            i1++;
            i = k;
        } while (true);
    }

    void drawDividersHorizontal(Canvas canvas)
    {
        int j = AbsActionBarView.b;
        int k = getChildCount();
        int i = 0;
        do
        {
label0:
            {
label1:
                {
label2:
                    {
                        if (i < k)
                        {
                            View view = getChildAt(i);
                            if (view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(i))
                            {
                                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
                                drawVerticalDivider(canvas, view.getLeft() - layoutparams.leftMargin);
                            }
                            if (j == 0)
                            {
                                break label0;
                            }
                        }
                        if (!hasDividerBeforeChildAt(k))
                        {
                            break label1;
                        }
                        View view1 = getChildAt(k - 1);
                        if (view1 == null)
                        {
                            i = getWidth() - getPaddingRight() - mDividerWidth;
                            if (j == 0)
                            {
                                break label2;
                            }
                        }
                        i = view1.getRight();
                    }
                    drawVerticalDivider(canvas, i);
                }
                return;
            }
            i++;
        } while (true);
    }

    void drawDividersVertical(Canvas canvas)
    {
        int j = AbsActionBarView.b;
        int k = getChildCount();
        int i = 0;
        do
        {
label0:
            {
label1:
                {
label2:
                    {
                        if (i < k)
                        {
                            View view = getChildAt(i);
                            if (view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(i))
                            {
                                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
                                drawHorizontalDivider(canvas, view.getTop() - layoutparams.topMargin);
                            }
                            if (j == 0)
                            {
                                break label0;
                            }
                        }
                        if (!hasDividerBeforeChildAt(k))
                        {
                            break label1;
                        }
                        View view1 = getChildAt(k - 1);
                        if (view1 == null)
                        {
                            i = getHeight() - getPaddingBottom() - mDividerHeight;
                            if (j == 0)
                            {
                                break label2;
                            }
                        }
                        i = view1.getBottom();
                    }
                    drawHorizontalDivider(canvas, i);
                }
                return;
            }
            i++;
        } while (true);
    }

    void drawHorizontalDivider(Canvas canvas, int i)
    {
        mDivider.setBounds(getPaddingLeft() + mDividerPadding, i, getWidth() - getPaddingRight() - mDividerPadding, mDividerHeight + i);
        mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i)
    {
        mDivider.setBounds(i, getPaddingTop() + mDividerPadding, mDividerWidth + i, getHeight() - getPaddingBottom() - mDividerPadding);
        mDivider.draw(canvas);
    }

    public int getDividerPadding()
    {
        return mDividerPadding;
    }

    public int getShowDividers()
    {
        return mShowDividers;
    }

    protected boolean hasDividerBeforeChildAt(int i)
    {
        int j;
        boolean flag;
        flag = false;
        j = AbsActionBarView.b;
        if (i != 0) goto _L2; else goto _L1
_L1:
        if ((mShowDividers & 1) == 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i != getChildCount())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((mShowDividers & 4) == 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if ((mShowDividers & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        i--;
_L8:
        boolean flag1;
        flag1 = flag;
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        if (getChildAt(i).getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (j == 0) goto _L3; else goto _L6
_L6:
        flag1 = true;
        i--;
        flag = flag1;
        if (j == 0) goto _L8; else goto _L7
_L7:
        return flag1;
        return false;
    }

    public boolean isMeasureWithLargestChildEnabled()
    {
        return mUseLargestChild;
    }

    protected void measureChildWithMargins(View view, int i, int j, int k, int l)
    {
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i1;
        int j1;
        int k1;
label0:
        {
            i1 = AbsActionBarView.b;
            j1 = indexOfChild(view);
            k1 = getOrientation();
            layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
            if (!hasDividerBeforeChildAt(j1))
            {
                break label0;
            }
            if (k1 == 1)
            {
                layoutparams.topMargin = mDividerHeight;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            layoutparams.leftMargin = mDividerWidth;
        }
label1:
        {
            int l1 = getChildCount();
            if (j1 != l1 - 1 || !hasDividerBeforeChildAt(l1))
            {
                break label1;
            }
            if (k1 == 1)
            {
                layoutparams.bottomMargin = mDividerHeight;
                if (i1 == 0)
                {
                    break label1;
                }
            }
            layoutparams.rightMargin = mDividerWidth;
        }
        super.measureChildWithMargins(view, i, j, k, l);
    }

    protected void onDraw(Canvas canvas)
    {
label0:
        {
            if (mDivider == null)
            {
                break label0;
            }
            if (getOrientation() == 1)
            {
                drawDividersVertical(canvas);
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            drawDividersHorizontal(canvas);
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (!mUseLargestChild) goto _L2; else goto _L1
_L1:
        getOrientation();
        JVM INSTR tableswitch 0 1: default 40
    //                   0 41
    //                   1 51;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        useLargestChildHorizontal();
        if (AbsActionBarView.b == 0) goto _L2; else goto _L4
_L4:
        useLargestChildVertical();
        return;
    }

    public void setDividerDrawable(Drawable drawable)
    {
        boolean flag;
label0:
        {
            flag = false;
            if (drawable == mDivider)
            {
                return;
            }
            mDivider = drawable;
            if (drawable != null)
            {
                mDividerWidth = drawable.getIntrinsicWidth();
                mDividerHeight = drawable.getIntrinsicHeight();
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            mDividerWidth = 0;
            mDividerHeight = 0;
        }
        if (drawable == null)
        {
            flag = true;
        }
        setWillNotDraw(flag);
        requestLayout();
    }

    public void setDividerPadding(int i)
    {
        mDividerPadding = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean flag)
    {
        mUseLargestChild = flag;
    }

    public void setShowDividers(int i)
    {
        if (i != mShowDividers)
        {
            requestLayout();
            invalidate();
        }
        mShowDividers = i;
    }

}
