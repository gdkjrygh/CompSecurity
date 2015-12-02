// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.internal.widget.IcsLinearLayout;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuView, ActionMenuItemView, MenuBuilder, ActionMenuPresenter, 
//            MenuItemImpl

public class ActionMenuView extends IcsLinearLayout
    implements MenuBuilder.ItemInvoker, MenuView
{

    private static final boolean IS_FROYO;
    private boolean mFirst;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    private int mMinCellSize;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mFirst = true;
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        mMinCellSize = (int)(56F * f);
        mGeneratedItemPadding = (int)(f * 4F);
    }

    protected static boolean isLayoutRtl()
    {
        return ActionBarSherlock.isRtl;
    }

    static int measureChildForCells(View view, int i, int j, int k, int l)
    {
        boolean flag1 = false;
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        k = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k) - l, android.view.View.MeasureSpec.getMode(k));
        ActionMenuItemView actionmenuitemview;
        boolean flag;
        if (j > 0)
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * j, 0x80000000), k);
            l = view.getMeasuredWidth();
            j = l / i;
            if (l % i != 0)
            {
                j++;
            }
        } else
        {
            j = 0;
        }
        if (view instanceof ActionMenuItemView)
        {
            actionmenuitemview = (ActionMenuItemView)view;
        } else
        {
            actionmenuitemview = null;
        }
        flag = flag1;
        if (!layoutparams.isOverflowButton)
        {
            flag = flag1;
            if (actionmenuitemview != null)
            {
                flag = flag1;
                if (actionmenuitemview.hasText())
                {
                    flag = true;
                }
            }
        }
        layoutparams.expandable = flag;
        layoutparams.cellsUsed = j;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j * i, 0x40000000), k);
        return j;
    }

    private void onMeasureExactFormat(int i, int j)
    {
        int k;
        int l;
        int i1;
        int j1;
        int l1;
        int i2;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        long l5;
        k3 = MenuBuilder.a;
        l3 = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(i);
        j3 = android.view.View.MeasureSpec.getSize(j);
        k = getPaddingLeft();
        l = getPaddingRight();
        l4 = getPaddingTop() + getPaddingBottom();
        i4 = i - (k + l);
        i = i4 / mMinCellSize;
        k = mMinCellSize;
        if (i == 0)
        {
            setMeasuredDimension(i4, 0);
            return;
        }
        j4 = mMinCellSize + (i4 % k) / i;
        k = 0;
        l = 0;
        j1 = 0;
        i1 = 0;
        l5 = 0L;
        k4 = getChildCount();
        i2 = 0;
        l1 = 0;
_L53:
        int k2;
        int l2;
        if (i2 >= k4)
        {
            break MISSING_BLOCK_LABEL_1467;
        }
        Object obj = getChildAt(i2);
        float f;
        float f1;
        float f2;
        LayoutParams layoutparams;
        int k1;
        boolean flag;
        int i3;
        long l6;
        long l7;
        if (((View) (obj)).getVisibility() == 8)
        {
            int j2 = l;
            l = i;
            i = k;
            k1 = i1;
            k = j2;
            i1 = l1;
        } else
        {
            boolean flag1 = obj instanceof ActionMenuItemView;
            k1 = l1 + 1;
            if (flag1)
            {
                ((View) (obj)).setPadding(mGeneratedItemPadding, 0, mGeneratedItemPadding, 0);
            }
            layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
            layoutparams.expanded = false;
            layoutparams.extraPixels = 0;
            layoutparams.cellsUsed = 0;
            layoutparams.expandable = false;
            layoutparams.leftMargin = 0;
            layoutparams.rightMargin = 0;
            if (flag1 && ((ActionMenuItemView)obj).hasText())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            layoutparams.preventEdgeOffset = flag1;
            if (layoutparams.isOverflowButton)
            {
                l1 = 1;
            } else
            {
                l1 = i;
            }
            k2 = measureChildForCells(((View) (obj)), j4, l1, j, l4);
            l1 = Math.max(l, k2);
            if (layoutparams.expandable)
            {
                l = j1 + 1;
            } else
            {
                l = j1;
            }
            if (layoutparams.isOverflowButton)
            {
                i1 = 1;
            }
            i -= k2;
            k = Math.max(k, ((View) (obj)).getMeasuredHeight());
            if (k2 == 1)
            {
                l5 |= 1 << i2;
                k2 = i1;
                i1 = k1;
                j1 = l1;
                l1 = k;
                l2 = i;
                k = j1;
                j1 = l;
                k1 = k2;
                i = l1;
                l = l2;
            } else
            {
                k2 = i1;
                i1 = k1;
                j1 = l1;
                l1 = k;
                l2 = i;
                k = j1;
                j1 = l;
                k1 = k2;
                i = l1;
                l = l2;
            }
        }
        if (k3 == 0) goto _L2; else goto _L1
_L1:
        i2 = k;
        l2 = j1;
        l1 = i1;
        k2 = k1;
        j1 = i;
_L54:
        if (k2 != 0 && l1 == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = 0;
        l6 = l5;
        i = l;
_L49:
        if (l2 <= 0 || i <= 0)
        {
            break MISSING_BLOCK_LABEL_1369;
        }
        j = 0x7fffffff;
        l5 = 0L;
        i1 = 0;
        i3 = 0;
_L52:
        k1 = i1;
        l = j;
        l7 = l5;
        if (i3 >= k4) goto _L4; else goto _L3
_L3:
        obj = (LayoutParams)getChildAt(i3).getLayoutParams();
        if (((LayoutParams) (obj)).expandable) goto _L6; else goto _L5
_L5:
        l = j;
        j = i1;
_L31:
        if (k3 == 0) goto _L8; else goto _L7
_L7:
        l7 = l5;
        k1 = j;
_L4:
        l5 = l6 | l7;
        if (k1 <= i) goto _L10; else goto _L9
_L9:
        j = i;
        i = k;
_L42:
        if (k2 == 0 && l1 == 1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k = i;
        if (j <= 0) goto _L12; else goto _L11
_L11:
        k = i;
        if (l5 == 0L) goto _L12; else goto _L13
_L13:
        if (j < l1 - 1 || l != 0) goto _L15; else goto _L14
_L14:
        k = i;
        if (i2 <= 1) goto _L12; else goto _L15
_L15:
        f2 = Long.bitCount(l5);
        f1 = f2;
        if (l != 0) goto _L17; else goto _L16
_L16:
        f = f2;
        if ((1L & l5) != 0L)
        {
            f = f2;
            if (!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
            {
                f = f2 - 0.5F;
            }
        }
        f1 = f;
        if (((long)(1 << k4 - 1) & l5) == 0L) goto _L17; else goto _L18
_L18:
        f1 = f;
        if (((LayoutParams)getChildAt(k4 - 1).getLayoutParams()).preventEdgeOffset) goto _L17; else goto _L19
_L19:
        f -= 0.5F;
_L48:
        if (f > 0.0F)
        {
            l = (int)((float)(j * j4) / f);
        } else
        {
            l = 0;
        }
        i1 = 0;
_L47:
        k = i;
        if (i1 >= k4) goto _L12; else goto _L20
_L20:
        if (((long)(1 << i1) & l5) != 0L) goto _L22; else goto _L21
_L21:
        if (k3 == 0) goto _L24; else goto _L23
_L23:
        k = i;
_L12:
        if (k == 0) goto _L26; else goto _L25
_L25:
        j = android.view.View.MeasureSpec.makeMeasureSpec(j3 - l4, l3);
        i = 0;
_L46:
        if (i >= k4) goto _L26; else goto _L27
_L27:
        obj = getChildAt(i);
        layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
        if (layoutparams.expanded)
        {
            k = layoutparams.cellsUsed;
            ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.extraPixels + k * j4, 0x40000000), j);
        }
        if (k3 == 0) goto _L28; else goto _L26
_L26:
        if (l3 == 0x40000000)
        {
            j1 = j3;
        }
        setMeasuredDimension(i4, j1);
        return;
_L6:
        k1 = i1;
        i1 = j;
        l7 = l5;
        if (((LayoutParams) (obj)).cellsUsed >= j) goto _L30; else goto _L29
_L29:
        i1 = ((LayoutParams) (obj)).cellsUsed;
        l7 = 1 << i3;
        k1 = 1;
        j = 1;
        l = i1;
        l5 = l7;
        if (k3 == 0) goto _L31; else goto _L30
_L30:
        j = k1;
        l = i1;
        l5 = l7;
        if (((LayoutParams) (obj)).cellsUsed == i1)
        {
            l5 = l7 | (long)(1 << i3);
            j = k1 + 1;
            l = i1;
        }
          goto _L31
_L10:
        j = 0;
_L50:
        if (j >= k4) goto _L33; else goto _L32
_L32:
        obj = getChildAt(j);
        layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
        l6 = l5;
        if (((long)(1 << j) & l7) != 0L) goto _L35; else goto _L34
_L34:
        l6 = l5;
        if (layoutparams.cellsUsed != l + 1) goto _L37; else goto _L36
_L36:
        l5 |= 1 << j;
        l6 = l5;
        if (k3 == 0) goto _L37; else goto _L38
_L38:
        l6 = l5;
_L35:
        if (flag && layoutparams.preventEdgeOffset && i == 1)
        {
            ((View) (obj)).setPadding(mGeneratedItemPadding + j4, 0, mGeneratedItemPadding, 0);
        }
        layoutparams.cellsUsed = layoutparams.cellsUsed + 1;
        layoutparams.expanded = true;
        i--;
        l5 = l6;
_L51:
        if (k3 == 0) goto _L39; else goto _L33
_L33:
        k = 1;
        if (k3 == 0) goto _L41; else goto _L40
_L40:
        j = i;
        i = k;
          goto _L42
_L22:
        obj = getChildAt(i1);
        layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
        if (!(obj instanceof ActionMenuItemView))
        {
            break MISSING_BLOCK_LABEL_1185;
        }
        layoutparams.extraPixels = l;
        layoutparams.expanded = true;
        if (i1 == 0 && !layoutparams.preventEdgeOffset)
        {
            layoutparams.leftMargin = -l / 2;
        }
        j = 1;
        i = 1;
        if (k3 == 0) goto _L21; else goto _L43
_L43:
        i = j;
        j = i;
        if (!layoutparams.isOverflowButton) goto _L45; else goto _L44
_L44:
        layoutparams.extraPixels = l;
        layoutparams.expanded = true;
        layoutparams.rightMargin = -l / 2;
        j = 1;
        i = 1;
        if (k3 == 0) goto _L21; else goto _L45
_L45:
        if (i1 != 0)
        {
            layoutparams.leftMargin = l / 2;
        }
        i = j;
        if (i1 != k4 - 1)
        {
            layoutparams.rightMargin = l / 2;
            i = j;
        }
          goto _L21
_L28:
        i++;
          goto _L46
_L24:
        i1++;
          goto _L47
_L17:
        f = f1;
          goto _L48
_L41:
        k = 1;
        l6 = l5;
          goto _L49
_L39:
        j++;
          goto _L50
_L37:
        l5 = l6;
          goto _L51
_L8:
        i3++;
        i1 = j;
        j = l;
          goto _L52
        l5 = l6;
        j = i;
        i = k;
          goto _L42
_L2:
        k2 = i2 + 1;
        i2 = i;
        i = l;
        l1 = i1;
        i1 = k1;
        l = k;
        k = i2;
        i2 = k2;
          goto _L53
        l2 = j1;
        i2 = l;
        j1 = k;
        l = i;
        k2 = i1;
          goto _L54
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof LayoutParams);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        LayoutParams layoutparams = new LayoutParams(-2, -2);
        layoutparams.gravity = 16;
        return layoutparams;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            layoutparams = new LayoutParams((LayoutParams)layoutparams);
            if (((LayoutParams) (layoutparams)).gravity <= 0)
            {
                layoutparams.gravity = 16;
            }
            return layoutparams;
        } else
        {
            return generateDefaultLayoutParams();
        }
    }

    public LayoutParams generateOverflowButtonLayoutParams()
    {
        LayoutParams layoutparams = generateDefaultLayoutParams();
        layoutparams.isOverflowButton = true;
        return layoutparams;
    }

    protected boolean hasDividerBeforeChildAt(int i)
    {
        boolean flag1 = false;
        if (i == 0)
        {
            return false;
        }
        View view = getChildAt(i - 1);
        View view1 = getChildAt(i);
        boolean flag = flag1;
        if (i < getChildCount())
        {
            flag = flag1;
            if (view instanceof ActionMenuChildView)
            {
                flag = false | ((ActionMenuChildView)view).needsDividerAfter();
            }
        }
        if (i > 0 && (view1 instanceof ActionMenuChildView))
        {
            return ((ActionMenuChildView)view1).needsDividerBefore() | flag;
        } else
        {
            return flag;
        }
    }

    public void initialize(MenuBuilder menubuilder)
    {
        mMenu = menubuilder;
    }

    public boolean invokeItem(MenuItemImpl menuitemimpl)
    {
        return mMenu.performItemAction(menuitemimpl, 0);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (IS_FROYO)
        {
            super.onConfigurationChanged(configuration);
        }
        mPresenter.updateMenuView(false);
        if (mPresenter != null && mPresenter.isOverflowMenuShowing())
        {
            mPresenter.hideOverflowMenu();
            mPresenter.showOverflowMenu();
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mPresenter.dismissPopupMenus();
    }

    protected void onDraw(Canvas canvas)
    {
        if (!IS_FROYO && mFirst)
        {
            mFirst = false;
            requestLayout();
            return;
        } else
        {
            super.onDraw(canvas);
            return;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int j2 = MenuBuilder.a;
        if (mFormatItems) goto _L2; else goto _L1
_L1:
        super.onLayout(flag, i, j, k, l);
_L4:
        return;
_L2:
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
                        int k2 = getChildCount();
                        int i2 = (j + l) / 2;
                        j = 0;
                        l = k - i - getPaddingRight() - getPaddingLeft();
                        int i1 = 0;
                        flag = isLayoutRtl();
                        View view;
                        LayoutParams layoutparams;
                        int k1;
                        int l1;
                        int l2;
                        int i3;
                        for (int j1 = 0; j1 >= k2; j1++)
                        {
                            break label0;
                        }

                        view = getChildAt(j1);
                        if (view.getVisibility() == 8 && j2 == 0)
                        {
                            break label1;
                        }
                        layoutparams = (LayoutParams)view.getLayoutParams();
                        if (!layoutparams.isOverflowButton)
                        {
                            break label2;
                        }
                        k1 = view.getMeasuredWidth();
                        i1 = k1;
                        if (hasDividerBeforeChildAt(j1))
                        {
                            i1 = k1 + 0;
                        }
                        l2 = view.getMeasuredHeight();
                        if (flag)
                        {
                            k1 = getPaddingLeft() + layoutparams.leftMargin;
                            l1 = k1 + i1;
                            if (j2 == 0)
                            {
                                break label3;
                            }
                        }
                        l1 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
                        k1 = l1 - i1;
                    }
                    i3 = i2 - l2 / 2;
                    view.layout(k1, i3, l1, l2 + i3);
                    l -= i1;
                    i1 = 1;
                    k1 = 1;
                    if (j2 == 0)
                    {
                        break label1;
                    }
                    i1 = k1;
                }
                k1 = view.getMeasuredWidth();
                l1 = layoutparams.leftMargin;
                l -= layoutparams.rightMargin + (k1 + l1);
                j++;
            }
            if (j2 == 0)
            {
                break MISSING_BLOCK_LABEL_664;
            }
        }
        if (k2 == 1 && i1 == 0)
        {
            view = getChildAt(0);
            j = view.getMeasuredWidth();
            l = view.getMeasuredHeight();
            i = (k - i) / 2 - j / 2;
            k = i2 - l / 2;
            view.layout(i, k, j + i, l + k);
            return;
        }
        if (i1 != 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        i = j - i;
        if (i > 0)
        {
            i = l / i;
        } else
        {
            i = 0;
        }
        k = Math.max(0, i);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i = getWidth() - getPaddingRight();
        j = 0;
_L8:
        if (j >= k2)
        {
            continue; /* Loop/switch isn't completed */
        }
        view = getChildAt(j);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (view.getVisibility() != 8 && (!layoutparams.isOverflowButton || j2 != 0))
        {
            i -= layoutparams.rightMargin;
            l = view.getMeasuredWidth();
            i1 = view.getMeasuredHeight();
            j1 = i2 - i1 / 2;
            view.layout(i - l, j1, i, i1 + j1);
            i -= layoutparams.leftMargin + l + k;
        }
        if (j2 == 0)
        {
            break MISSING_BLOCK_LABEL_654;
        }
        if (j2 == 0) goto _L4; else goto _L3
_L3:
        i = getPaddingLeft();
        j = 0;
_L7:
        if (j >= k2) goto _L4; else goto _L5
_L5:
        view = getChildAt(j);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (view.getVisibility() != 8 && (!layoutparams.isOverflowButton || j2 != 0))
        {
            i += layoutparams.leftMargin;
            l = view.getMeasuredWidth();
            i1 = view.getMeasuredHeight();
            j1 = i2 - i1 / 2;
            view.layout(i, j1, i + l, i1 + j1);
            i = layoutparams.rightMargin + l + k + i;
        }
        if (j2 != 0) goto _L4; else goto _L6
_L6:
        j++;
          goto _L7
        j++;
          goto _L8
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l = MenuBuilder.a;
        boolean flag1 = mFormatItems;
        LayoutParams layoutparams;
        int i1;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mFormatItems = flag;
        if (flag1 != mFormatItems)
        {
            mFormatItemsWidth = 0;
        }
        k = android.view.View.MeasureSpec.getMode(i);
        if (mFormatItems && mMenu != null && k != mFormatItemsWidth)
        {
            mFormatItemsWidth = k;
            mMenu.onItemsChanged(true);
        }
        if (!mFormatItems) goto _L2; else goto _L1
_L1:
        onMeasureExactFormat(i, j);
        if (l == 0) goto _L3; else goto _L2
_L2:
        i1 = getChildCount();
        k = 0;
_L8:
        if (k >= i1) goto _L5; else goto _L4
_L4:
        layoutparams = (LayoutParams)getChildAt(k).getLayoutParams();
        layoutparams.rightMargin = 0;
        layoutparams.leftMargin = 0;
        if (l == 0) goto _L6; else goto _L5
_L5:
        super.onMeasure(i, j);
_L3:
        return;
_L6:
        k++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void setOverflowReserved(boolean flag)
    {
        mReserveOverflow = flag;
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        mPresenter = actionmenupresenter;
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_FROYO = flag;
    }

    private class LayoutParams extends android.widget.LinearLayout.LayoutParams
    {

        public int cellsUsed;
        public boolean expandable;
        public boolean expanded;
        public int extraPixels;
        public boolean isOverflowButton;
        public boolean preventEdgeOffset;

        public LayoutParams(int i, int j)
        {
            super(i, j);
            isOverflowButton = false;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            isOverflowButton = layoutparams.isOverflowButton;
        }
    }


    private class ActionMenuChildView
    {

        public abstract boolean needsDividerAfter();

        public abstract boolean needsDividerBefore();
    }

}
