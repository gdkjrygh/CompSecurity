// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.a.c;
import android.support.v7.a.k;
import android.support.v7.internal.widget.LinearLayoutICS;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.internal.view.menu:
//            af, q, ActionMenuItemView, i, 
//            o, ActionMenuPresenter, s

public class ActionMenuView extends LinearLayoutICS
    implements af, q
{

    private o a;
    private boolean b;
    private ActionMenuPresenter c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setBaselineAligned(false);
        float f1 = context.getResources().getDisplayMetrics().density;
        f = (int)(56F * f1);
        g = (int)(f1 * 4F);
        context = context.obtainStyledAttributes(attributeset, k.a, c.b, 0);
        i = context.getDimensionPixelSize(1, 0);
        context.recycle();
    }

    static int a(View view, int j, int l, int i1, int j1)
    {
        boolean flag1 = false;
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i1) - j1, android.view.View.MeasureSpec.getMode(i1));
        ActionMenuItemView actionmenuitemview;
        boolean flag;
        if (view instanceof ActionMenuItemView)
        {
            actionmenuitemview = (ActionMenuItemView)view;
        } else
        {
            actionmenuitemview = null;
        }
        if (actionmenuitemview != null && actionmenuitemview.c())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (l > 0 && (j1 == 0 || l >= 2))
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j * l, 0x80000000), k1);
            int l1 = view.getMeasuredWidth();
            i1 = l1 / j;
            l = i1;
            if (l1 % j != 0)
            {
                l = i1 + 1;
            }
            i1 = l;
            if (j1 != 0)
            {
                i1 = l;
                if (l < 2)
                {
                    i1 = 2;
                }
            }
        } else
        {
            i1 = 0;
        }
        flag = flag1;
        if (!layoutparams.a)
        {
            flag = flag1;
            if (j1 != 0)
            {
                flag = true;
            }
        }
        layoutparams.d = flag;
        layoutparams.b = i1;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1 * j, 0x40000000), k1);
        return i1;
    }

    private LayoutParams a(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    private static LayoutParams c()
    {
        LayoutParams layoutparams = new LayoutParams(-2, -2);
        layoutparams.gravity = 16;
        return layoutparams;
    }

    public final LayoutParams a()
    {
        LayoutParams layoutparams = c();
        layoutparams.a = true;
        return layoutparams;
    }

    protected final LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
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
            return c();
        }
    }

    public final void a(o o1)
    {
        a = o1;
    }

    protected final boolean a(int j)
    {
        View view = getChildAt(j - 1);
        View view1 = getChildAt(j);
        boolean flag1 = false;
        boolean flag = flag1;
        if (j < getChildCount())
        {
            flag = flag1;
            if (view instanceof i)
            {
                flag = ((i)view).e() | false;
            }
        }
        if (j > 0 && (view1 instanceof i))
        {
            return ((i)view1).d() | flag;
        } else
        {
            return flag;
        }
    }

    public final boolean a(s s)
    {
        return a.a(s, 0);
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
        return c();
    }

    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return c();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        c.c(false);
        if (c != null && c.f())
        {
            c.c();
            c.b();
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c.d();
    }

    protected void onLayout(boolean flag, int j, int l, int i1, int j1)
    {
        if (!d)
        {
            super.onLayout(flag, j, l, i1, j1);
        } else
        {
            int i4 = getChildCount();
            int l3 = (l + j1) / 2;
            int j4 = b();
            l = 0;
            int k1 = i1 - j - getPaddingRight() - getPaddingLeft();
            j1 = 0;
            int l1 = 0;
            while (l1 < i4) 
            {
                View view = getChildAt(l1);
                LayoutParams layoutparams1;
                if (view.getVisibility() != 8)
                {
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    int j2;
                    if (layoutparams.a)
                    {
                        int i2 = view.getMeasuredWidth();
                        j1 = i2;
                        if (a(l1))
                        {
                            j1 = i2 + j4;
                        }
                        i2 = view.getMeasuredHeight();
                        int i3 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
                        int k4 = l3 - i2 / 2;
                        view.layout(i3 - j1, k4, i3, i2 + k4);
                        i2 = k1 - j1;
                        k1 = 1;
                        j1 = l;
                        l = i2;
                    } else
                    {
                        int k2 = view.getMeasuredWidth();
                        int j3 = layoutparams.leftMargin;
                        k2 = k1 - (layoutparams.rightMargin + (k2 + j3));
                        a(l1);
                        j3 = l + 1;
                        k1 = j1;
                        l = k2;
                        j1 = j3;
                    }
                } else
                {
                    int l2 = l;
                    int k3 = j1;
                    l = k1;
                    j1 = l2;
                    k1 = k3;
                }
                j2 = l1 + 1;
                l1 = k1;
                k1 = l;
                l = j1;
                j1 = l1;
                l1 = j2;
            }
            if (i4 == 1 && j1 == 0)
            {
                view = getChildAt(0);
                l = view.getMeasuredWidth();
                j1 = view.getMeasuredHeight();
                j = (i1 - j) / 2 - l / 2;
                i1 = l3 - j1 / 2;
                view.layout(j, i1, l + j, j1 + i1);
                return;
            }
            if (j1 != 0)
            {
                j = 0;
            } else
            {
                j = 1;
            }
            j = l - j;
            if (j > 0)
            {
                j = k1 / j;
            } else
            {
                j = 0;
            }
            i1 = Math.max(0, j);
            j = getPaddingLeft();
            l = 0;
            while (l < i4) 
            {
                view = getChildAt(l);
                layoutparams1 = (LayoutParams)view.getLayoutParams();
                if (view.getVisibility() != 8 && !layoutparams1.a)
                {
                    j += layoutparams1.leftMargin;
                    j1 = view.getMeasuredWidth();
                    k1 = view.getMeasuredHeight();
                    l1 = l3 - k1 / 2;
                    view.layout(j, l1, j + j1, k1 + l1);
                    j = layoutparams1.rightMargin + j1 + i1 + j;
                }
                l++;
            }
        }
    }

    protected void onMeasure(int j, int l)
    {
        boolean flag2 = d;
        int i1;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(j) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (flag2 != d)
        {
            e = 0;
        }
        i1 = android.view.View.MeasureSpec.getMode(j);
        if (d && a != null && i1 != e)
        {
            e = i1;
            a.b(true);
        }
        if (!d) goto _L2; else goto _L1
_L1:
        int j4 = android.view.View.MeasureSpec.getMode(l);
        j = android.view.View.MeasureSpec.getSize(j);
        int i4 = android.view.View.MeasureSpec.getSize(l);
        l = getPaddingLeft();
        i1 = getPaddingRight();
        int k3 = getPaddingTop() + getPaddingBottom();
        int i3;
        int k4;
        if (j4 == 0x40000000)
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(i4 - k3, 0x40000000);
        } else
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i, i4 - k3), 0x80000000);
        }
        k4 = j - (i1 + l);
        j = k4 / f;
        l = f;
        if (j == 0)
        {
            setMeasuredDimension(k4, 0);
            return;
        }
        int l4 = f + (k4 % l) / j;
        l = 0;
        int k2 = 0;
        int j2 = 0;
        int l2 = 0;
        int i2 = 0;
        long l5 = 0L;
        int i5 = getChildCount();
        int l1 = 0;
        while (l1 < i5) 
        {
            Object obj = getChildAt(l1);
            int j1;
            int k1;
            if (((View) (obj)).getVisibility() != 8)
            {
                boolean flag1 = obj instanceof ActionMenuItemView;
                l2++;
                if (flag1)
                {
                    ((View) (obj)).setPadding(g, 0, g, 0);
                }
                LayoutParams layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                layoutparams.f = false;
                layoutparams.c = 0;
                layoutparams.b = 0;
                layoutparams.d = false;
                layoutparams.leftMargin = 0;
                layoutparams.rightMargin = 0;
                int j3;
                int l3;
                if (flag1 && ((ActionMenuItemView)obj).c())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                layoutparams.e = flag1;
                if (layoutparams.a)
                {
                    j1 = 1;
                } else
                {
                    j1 = j;
                }
                l3 = a(((View) (obj)), l4, j1, i3, k3);
                k2 = Math.max(k2, l3);
                float f1;
                float f2;
                float f3;
                long l7;
                long l8;
                if (layoutparams.d)
                {
                    j1 = j2 + 1;
                } else
                {
                    j1 = j2;
                }
                if (layoutparams.a)
                {
                    k1 = 1;
                } else
                {
                    k1 = i2;
                }
                j3 = j - l3;
                j = Math.max(l, ((View) (obj)).getMeasuredHeight());
                if (l3 == 1)
                {
                    long l6 = 1 << l1;
                    l = j;
                    j = l2;
                    i2 = k1;
                    j2 = j1;
                    l5 = l6 | l5;
                    k1 = j3;
                    j1 = l;
                    l = k2;
                } else
                {
                    l = k2;
                    k2 = j;
                    j = l2;
                    j2 = j1;
                    i2 = k1;
                    j1 = k2;
                    k1 = j3;
                }
            } else
            {
                j1 = l;
                k1 = j;
                l = k2;
                j = l2;
            }
            l1++;
            l2 = j;
            j = k1;
            k2 = l;
            l = j1;
        }
        if (i2 != 0 && l2 == 2)
        {
            j3 = 1;
        } else
        {
            j3 = 0;
        }
        k1 = 0;
        j1 = j;
        j = k1;
        l8 = l5;
        if (j2 <= 0) goto _L4; else goto _L3
_L3:
        l8 = l5;
        if (j1 <= 0) goto _L4; else goto _L5
_L5:
        k1 = 0x7fffffff;
        l7 = 0L;
        l1 = 0;
        k3 = 0;
_L12:
        if (k3 >= i5) goto _L7; else goto _L6
_L6:
        obj = (LayoutParams)getChildAt(k3).getLayoutParams();
        if (!((LayoutParams) (obj)).d) goto _L9; else goto _L8
_L8:
        if (((LayoutParams) (obj)).b >= k1) goto _L11; else goto _L10
_L10:
        l1 = ((LayoutParams) (obj)).b;
        l7 = 1 << k3;
        k1 = 1;
_L14:
        l3 = k3 + 1;
        k3 = l1;
        l1 = k1;
        k1 = k3;
        k3 = l3;
          goto _L12
_L11:
        if (((LayoutParams) (obj)).b != k1) goto _L9; else goto _L13
_L13:
        l7 |= 1 << k3;
        l3 = l1 + 1;
        l1 = k1;
        k1 = l3;
          goto _L14
_L7:
        l5 |= l7;
        l8 = l5;
        if (l1 <= j1)
        {
            l1 = 0;
            j = j1;
            j1 = l1;
            while (j1 < i5) 
            {
                obj = getChildAt(j1);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (((long)(1 << j1) & l7) == 0L)
                {
                    if (layoutparams.b == k1 + 1)
                    {
                        l5 |= 1 << j1;
                    }
                } else
                {
                    if (j3 != 0 && layoutparams.e && j == 1)
                    {
                        ((View) (obj)).setPadding(g + l4, 0, g, 0);
                    }
                    layoutparams.b = layoutparams.b + 1;
                    layoutparams.f = true;
                    j--;
                }
                j1++;
            }
            k1 = 1;
            j1 = j;
            j = k1;
            break MISSING_BLOCK_LABEL_551;
        }
_L4:
        if (i2 == 0 && l2 == 1)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (j1 <= 0 || l8 == 0L || j1 >= l2 - 1 && k1 == 0 && k2 <= 1) goto _L16; else goto _L15
_L15:
        f3 = Long.bitCount(l8);
        f2 = f3;
        if (k1 != 0) goto _L18; else goto _L17
_L17:
        f1 = f3;
        if ((1L & l8) != 0L)
        {
            f1 = f3;
            if (!((LayoutParams)getChildAt(0).getLayoutParams()).e)
            {
                f1 = f3 - 0.5F;
            }
        }
        f2 = f1;
        if (((long)(1 << i5 - 1) & l8) == 0L) goto _L18; else goto _L19
_L19:
        f2 = f1;
        if (((LayoutParams)getChildAt(i5 - 1).getLayoutParams()).e) goto _L18; else goto _L20
_L20:
        f1 -= 0.5F;
_L21:
        if (f1 > 0.0F)
        {
            j1 = (int)((float)(j1 * l4) / f1);
        } else
        {
            j1 = 0;
        }
        k1 = 0;
        while (k1 < i5) 
        {
            if (((long)(1 << k1) & l8) != 0L)
            {
                obj = getChildAt(k1);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    layoutparams.c = j1;
                    layoutparams.f = true;
                    if (k1 == 0 && !layoutparams.e)
                    {
                        layoutparams.leftMargin = -j1 / 2;
                    }
                    j = 1;
                } else
                if (layoutparams.a)
                {
                    layoutparams.c = j1;
                    layoutparams.f = true;
                    layoutparams.rightMargin = -j1 / 2;
                    j = 1;
                } else
                {
                    if (k1 != 0)
                    {
                        layoutparams.leftMargin = j1 / 2;
                    }
                    if (k1 != i5 - 1)
                    {
                        layoutparams.rightMargin = j1 / 2;
                    }
                }
            }
            k1++;
        }
        j1 = 0;
_L16:
        if (j != 0)
        {
            for (j = 0; j < i5; j++)
            {
                obj = getChildAt(j);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (layoutparams.f)
                {
                    k1 = layoutparams.b;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.c + k1 * l4, 0x40000000), i3);
                }
            }

        }
        if (j4 == 0x40000000)
        {
            l = i4;
        }
        setMeasuredDimension(k4, l);
        h = j1 * l4;
        return;
_L2:
        k1 = getChildCount();
        for (j1 = 0; j1 < k1; j1++)
        {
            obj = (LayoutParams)getChildAt(j1).getLayoutParams();
            obj.rightMargin = 0;
            obj.leftMargin = 0;
        }

        super.onMeasure(j, l);
        return;
_L18:
        f1 = f2;
        if (true) goto _L21; else goto _L9
_L9:
        l3 = k1;
        k1 = l1;
        l1 = l3;
          goto _L14
    }

    public void setOverflowReserved(boolean flag)
    {
        b = flag;
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        c = actionmenupresenter;
    }

    private class LayoutParams extends android.widget.LinearLayout.LayoutParams
    {

        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;
        public boolean f;

        public LayoutParams(int j, int l)
        {
            super(-2, -2);
            a = false;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            a = layoutparams.a;
        }
    }

}
