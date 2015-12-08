// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.y;
import android.support.v7.internal.view.menu.z;
import android.support.v7.internal.widget.bl;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//            z, m, k, ActionMenuPresenter, 
//            n, l, o, aa

public class ActionMenuView extends android.support.v7.widget.z
    implements k, z
{

    private i a;
    private Context b;
    private Context c;
    private int d;
    private boolean e;
    private ActionMenuPresenter f;
    private y g;
    private j h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private o m;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = context;
        setBaselineAligned(false);
        float f1 = context.getResources().getDisplayMetrics().density;
        k = (int)(56F * f1);
        l = (int)(f1 * 4F);
        c = context;
        d = 0;
    }

    static int a(View view, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = false;
        android.support.v7.widget.m m1 = (android.support.v7.widget.m)view.getLayoutParams();
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k1) - l1, android.view.View.MeasureSpec.getMode(k1));
        ActionMenuItemView actionmenuitemview;
        boolean flag;
        if (view instanceof ActionMenuItemView)
        {
            actionmenuitemview = (ActionMenuItemView)view;
        } else
        {
            actionmenuitemview = null;
        }
        if (actionmenuitemview != null && actionmenuitemview.b())
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (j1 > 0 && (l1 == 0 || j1 >= 2))
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1 * j1, 0x80000000), i2);
            int j2 = view.getMeasuredWidth();
            k1 = j2 / i1;
            j1 = k1;
            if (j2 % i1 != 0)
            {
                j1 = k1 + 1;
            }
            k1 = j1;
            if (l1 != 0)
            {
                k1 = j1;
                if (j1 < 2)
                {
                    k1 = 2;
                }
            }
        } else
        {
            k1 = 0;
        }
        flag = flag1;
        if (!m1.a)
        {
            flag = flag1;
            if (l1 != 0)
            {
                flag = true;
            }
        }
        m1.d = flag;
        m1.b = k1;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 * i1, 0x40000000), i2);
        return k1;
    }

    static o a(ActionMenuView actionmenuview)
    {
        return actionmenuview.m;
    }

    static j b(ActionMenuView actionmenuview)
    {
        return actionmenuview.h;
    }

    private void c(int i1, int j1)
    {
        int k4 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        int j4 = android.view.View.MeasureSpec.getSize(j1);
        int k1 = getPaddingLeft();
        int l1 = getPaddingRight();
        int l3 = getPaddingTop() + getPaddingBottom();
        int l4 = getChildMeasureSpec(j1, l3, -2);
        int i5 = i1 - (k1 + l1);
        i1 = i5 / k;
        j1 = k;
        if (i1 == 0)
        {
            setMeasuredDimension(i5, 0);
            return;
        }
        int j5 = k + (i5 % j1) / i1;
        k1 = 0;
        int l2 = 0;
        int k2 = 0;
        int i3 = 0;
        int j2 = 0;
        long l5 = 0L;
        int k5 = getChildCount();
        int j3 = 0;
        while (j3 < k5) 
        {
            Object obj = getChildAt(j3);
            int i2;
            if (((View) (obj)).getVisibility() == 8)
            {
                j1 = l2;
                i2 = i1;
                i1 = i3;
            } else
            {
                boolean flag = obj instanceof ActionMenuItemView;
                i3++;
                if (flag)
                {
                    ((View) (obj)).setPadding(l, 0, l, 0);
                }
                android.support.v7.widget.m m1 = (android.support.v7.widget.m)((View) (obj)).getLayoutParams();
                m1.f = false;
                m1.c = 0;
                m1.b = 0;
                m1.d = false;
                m1.leftMargin = 0;
                m1.rightMargin = 0;
                int k3;
                int i4;
                if (flag && ((ActionMenuItemView)obj).b())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                m1.e = flag;
                if (m1.a)
                {
                    j1 = 1;
                } else
                {
                    j1 = i1;
                }
                i4 = a(((View) (obj)), j5, j1, l4, l3);
                l2 = Math.max(l2, i4);
                float f1;
                float f2;
                float f3;
                long l7;
                if (m1.d)
                {
                    j1 = k2 + 1;
                } else
                {
                    j1 = k2;
                }
                if (m1.a)
                {
                    i2 = 1;
                } else
                {
                    i2 = j2;
                }
                k3 = i1 - i4;
                k1 = Math.max(k1, ((View) (obj)).getMeasuredHeight());
                if (i4 == 1)
                {
                    long l6 = 1 << j3;
                    k2 = j1;
                    l5 = l6 | l5;
                    j1 = l2;
                    i1 = i3;
                    j2 = i2;
                    i2 = k3;
                } else
                {
                    i1 = i3;
                    j2 = l2;
                    l2 = k3;
                    k2 = j1;
                    j1 = j2;
                    j2 = i2;
                    i2 = l2;
                }
            }
            j3++;
            i3 = i1;
            i1 = i2;
            l2 = j1;
        }
        if (j2 != 0 && i3 == 2)
        {
            k3 = 1;
        } else
        {
            k3 = 0;
        }
        i2 = 0;
        j3 = i1;
        if (k2 <= 0 || j3 <= 0) goto _L2; else goto _L1
_L1:
        i1 = 0x7fffffff;
        l7 = 0L;
        j1 = 0;
        l3 = 0;
        while (l3 < k5) 
        {
            obj = (android.support.v7.widget.m)getChildAt(l3).getLayoutParams();
            if (!((android.support.v7.widget.m) (obj)).d)
            {
                i4 = j1;
                j1 = i1;
                i1 = i4;
            } else
            if (((android.support.v7.widget.m) (obj)).b < i1)
            {
                j1 = ((android.support.v7.widget.m) (obj)).b;
                l7 = 1 << l3;
                i1 = 1;
            } else
            if (((android.support.v7.widget.m) (obj)).b == i1)
            {
                l7 |= 1 << l3;
                i4 = j1 + 1;
                j1 = i1;
                i1 = i4;
            } else
            {
                i4 = i1;
                i1 = j1;
                j1 = i4;
            }
            i4 = l3 + 1;
            l3 = j1;
            j1 = i1;
            i1 = l3;
            l3 = i4;
        }
        l5 |= l7;
        if (j1 <= j3) goto _L3; else goto _L2
_L2:
        if (j2 == 0 && i3 == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (j3 <= 0 || l5 == 0L || j3 >= i3 - 1 && i1 == 0 && l2 <= 1) goto _L5; else goto _L4
_L4:
        f3 = Long.bitCount(l5);
        f2 = f3;
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        f1 = f3;
        if ((1L & l5) != 0L)
        {
            f1 = f3;
            if (!((android.support.v7.widget.m)getChildAt(0).getLayoutParams()).e)
            {
                f1 = f3 - 0.5F;
            }
        }
        f2 = f1;
        if (((long)(1 << k5 - 1) & l5) == 0L)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        f2 = f1;
        if (((android.support.v7.widget.m)getChildAt(k5 - 1).getLayoutParams()).e)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        f1 -= 0.5F;
_L8:
        if (f1 > 0.0F)
        {
            j1 = (int)((float)(j3 * j5) / f1);
        } else
        {
            j1 = 0;
        }
        j2 = 0;
        i1 = i2;
        i2 = j2;
        do
        {
            j2 = i1;
            if (i2 >= k5)
            {
                break;
            }
            if (((long)(1 << i2) & l5) != 0L)
            {
                obj = getChildAt(i2);
                m1 = (android.support.v7.widget.m)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    m1.c = j1;
                    m1.f = true;
                    if (i2 == 0 && !m1.e)
                    {
                        m1.leftMargin = -j1 / 2;
                    }
                    i1 = 1;
                } else
                if (m1.a)
                {
                    m1.c = j1;
                    m1.f = true;
                    m1.rightMargin = -j1 / 2;
                    i1 = 1;
                } else
                {
                    if (i2 != 0)
                    {
                        m1.leftMargin = j1 / 2;
                    }
                    if (i2 != k5 - 1)
                    {
                        m1.rightMargin = j1 / 2;
                    }
                }
            }
            i2++;
        } while (true);
          goto _L6
_L3:
        i2 = 0;
        j1 = j3;
        while (i2 < k5) 
        {
            obj = getChildAt(i2);
            m1 = (android.support.v7.widget.m)((View) (obj)).getLayoutParams();
            if (((long)(1 << i2) & l7) == 0L)
            {
                if (m1.b == i1 + 1)
                {
                    l5 |= 1 << i2;
                }
            } else
            {
                if (k3 != 0 && m1.e && j1 == 1)
                {
                    ((View) (obj)).setPadding(l + j5, 0, l, 0);
                }
                m1.b = m1.b + 1;
                m1.f = true;
                j1--;
            }
            i2++;
        }
        i2 = 1;
        j3 = j1;
        break MISSING_BLOCK_LABEL_427;
_L5:
        j2 = i2;
_L6:
        if (j2 != 0)
        {
            i1 = 0;
            while (i1 < k5) 
            {
                obj = getChildAt(i1);
                m1 = (android.support.v7.widget.m)((View) (obj)).getLayoutParams();
                if (m1.f)
                {
                    j1 = m1.b;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(m1.c + j1 * j5, 0x40000000), l4);
                }
                i1++;
            }
        }
        if (k4 == 0x40000000)
        {
            k1 = j4;
        }
        setMeasuredDimension(i5, k1);
        return;
        f1 = f2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public android.support.v7.widget.m a(AttributeSet attributeset)
    {
        return new android.support.v7.widget.m(getContext(), attributeset);
    }

    protected android.support.v7.widget.m a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams != null)
        {
            if (layoutparams instanceof android.support.v7.widget.m)
            {
                layoutparams = new android.support.v7.widget.m((android.support.v7.widget.m)layoutparams);
            } else
            {
                layoutparams = new android.support.v7.widget.m(layoutparams);
            }
            if (((android.support.v7.widget.m) (layoutparams)).h <= 0)
            {
                layoutparams.h = 16;
            }
            return layoutparams;
        } else
        {
            return b();
        }
    }

    public void a(i i1)
    {
        a = i1;
    }

    public void a(y y, j j1)
    {
        g = y;
        h = j1;
    }

    public boolean a()
    {
        return e;
    }

    protected boolean a(int i1)
    {
        boolean flag1 = false;
        if (i1 == 0)
        {
            return false;
        }
        View view = getChildAt(i1 - 1);
        View view1 = getChildAt(i1);
        boolean flag = flag1;
        if (i1 < getChildCount())
        {
            flag = flag1;
            if (view instanceof android.support.v7.widget.k)
            {
                flag = false | ((android.support.v7.widget.k)view).d();
            }
        }
        if (i1 > 0 && (view1 instanceof android.support.v7.widget.k))
        {
            return ((android.support.v7.widget.k)view1).c() | flag;
        } else
        {
            return flag;
        }
    }

    public boolean a(m m1)
    {
        return a.a(m1, 0);
    }

    public aa b(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected aa b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    protected android.support.v7.widget.m b()
    {
        android.support.v7.widget.m m1 = new android.support.v7.widget.m(-2, -2);
        m1.h = 16;
        return m1;
    }

    public android.support.v7.widget.m c()
    {
        android.support.v7.widget.m m1 = b();
        m1.a = true;
        return m1;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof android.support.v7.widget.m);
    }

    public i d()
    {
        return a;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    public boolean e()
    {
        return f != null && f.c();
    }

    public boolean f()
    {
        return f != null && f.d();
    }

    public boolean g()
    {
        return f != null && f.g();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return b();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public Menu getMenu()
    {
        if (a == null)
        {
            Object obj = getContext();
            a = new i(((Context) (obj)));
            a.a(new n(this, null));
            f = new ActionMenuPresenter(((Context) (obj)));
            f.b(true);
            ActionMenuPresenter actionmenupresenter = f;
            if (g != null)
            {
                obj = g;
            } else
            {
                obj = new l(this, null);
            }
            actionmenupresenter.a(((y) (obj)));
            a.a(f, c);
            f.a(this);
        }
        return a;
    }

    public int getPopupTheme()
    {
        return d;
    }

    public int getWindowAnimations()
    {
        return 0;
    }

    public boolean h()
    {
        return f != null && f.h();
    }

    public void i()
    {
        if (f != null)
        {
            f.e();
        }
    }

    protected aa j()
    {
        return b();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        if (f != null)
        {
            f.a(false);
            if (f.g())
            {
                f.d();
                f.c();
            }
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        i();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (i) goto _L2; else goto _L1
_L1:
        super.onLayout(flag, i1, j1, k1, l1);
_L4:
        return;
_L2:
        int l5;
        int i6;
        i6 = getChildCount();
        l5 = (l1 - j1) / 2;
        int j6 = getDividerWidth();
        l1 = 0;
        j1 = 0;
        int l2 = k1 - i1 - getPaddingRight() - getPaddingLeft();
        int i2 = 0;
        flag = bl.a(this);
        int k3 = 0;
        while (k3 < i6) 
        {
            View view = getChildAt(k3);
            int i4;
            int i5;
            if (view.getVisibility() == 8)
            {
                int l3 = i2;
                int l4 = l2;
                l2 = l1;
                i2 = j1;
                l1 = l4;
                j1 = l3;
            } else
            {
                android.support.v7.widget.m m1 = (android.support.v7.widget.m)view.getLayoutParams();
                if (m1.a)
                {
                    int j4 = view.getMeasuredWidth();
                    i2 = j4;
                    if (a(k3))
                    {
                        i2 = j4 + j6;
                    }
                    int k6 = view.getMeasuredHeight();
                    int j5;
                    int l6;
                    if (flag)
                    {
                        j4 = getPaddingLeft();
                        j4 = m1.leftMargin + j4;
                        j5 = j4 + i2;
                    } else
                    {
                        j5 = getWidth() - getPaddingRight() - m1.rightMargin;
                        j4 = j5 - i2;
                    }
                    l6 = l5 - k6 / 2;
                    view.layout(j4, l6, j5, k6 + l6);
                    j4 = l2 - i2;
                    j5 = 1;
                    i2 = j1;
                    l2 = l1;
                    j1 = j5;
                    l1 = j4;
                } else
                {
                    int k5 = view.getMeasuredWidth() + m1.leftMargin + m1.rightMargin;
                    int k4 = l1 + k5;
                    l1 = k4;
                    if (a(k3))
                    {
                        l1 = k4 + j6;
                    }
                    k4 = l2 - k5;
                    k5 = j1 + 1;
                    l2 = l1;
                    j1 = i2;
                    l1 = k4;
                    i2 = k5;
                }
            }
            i5 = k3 + 1;
            k3 = l2;
            i4 = i2;
            i2 = j1;
            l2 = l1;
            j1 = i4;
            l1 = k3;
            k3 = i5;
        }
        if (i6 == 1 && i2 == 0)
        {
            View view1 = getChildAt(0);
            j1 = view1.getMeasuredWidth();
            l1 = view1.getMeasuredHeight();
            i1 = (k1 - i1) / 2 - j1 / 2;
            k1 = l5 - l1 / 2;
            view1.layout(i1, k1, j1 + i1, l1 + k1);
            return;
        }
        if (i2 != 0)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        i1 = j1 - i1;
        if (i1 > 0)
        {
            i1 = l2 / i1;
        } else
        {
            i1 = 0;
        }
        k1 = Math.max(0, i1);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = getWidth() - getPaddingRight();
        j1 = 0;
        while (j1 < i6) 
        {
            View view2 = getChildAt(j1);
            android.support.v7.widget.m m2 = (android.support.v7.widget.m)view2.getLayoutParams();
            if (view2.getVisibility() != 8 && !m2.a)
            {
                i1 -= m2.rightMargin;
                l1 = view2.getMeasuredWidth();
                int j2 = view2.getMeasuredHeight();
                int i3 = l5 - j2 / 2;
                view2.layout(i1 - l1, i3, i1, j2 + i3);
                i1 -= m2.leftMargin + l1 + k1;
            }
            j1++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1 = getPaddingLeft();
        j1 = 0;
        while (j1 < i6) 
        {
            View view3 = getChildAt(j1);
            android.support.v7.widget.m m3 = (android.support.v7.widget.m)view3.getLayoutParams();
            if (view3.getVisibility() != 8 && !m3.a)
            {
                i1 += m3.leftMargin;
                l1 = view3.getMeasuredWidth();
                int k2 = view3.getMeasuredHeight();
                int j3 = l5 - k2 / 2;
                view3.layout(i1, j3, i1 + l1, k2 + j3);
                i1 = m3.rightMargin + l1 + k1 + i1;
            }
            j1++;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onMeasure(int i1, int j1)
    {
        boolean flag1 = i;
        int k1;
        int i2;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i1) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (flag1 != i)
        {
            j = 0;
        }
        k1 = android.view.View.MeasureSpec.getSize(i1);
        if (i && a != null && k1 != j)
        {
            j = k1;
            a.b(true);
        }
        i2 = getChildCount();
        if (i && i2 > 0)
        {
            c(i1, j1);
            return;
        }
        for (int l1 = 0; l1 < i2; l1++)
        {
            android.support.v7.widget.m m1 = (android.support.v7.widget.m)getChildAt(l1).getLayoutParams();
            m1.rightMargin = 0;
            m1.leftMargin = 0;
        }

        super.onMeasure(i1, j1);
    }

    public void setExpandedActionViewsExclusive(boolean flag)
    {
        f.c(flag);
    }

    public void setOnMenuItemClickListener(o o)
    {
        m = o;
    }

    public void setOverflowReserved(boolean flag)
    {
        e = flag;
    }

    public void setPopupTheme(int i1)
    {
label0:
        {
            if (d != i1)
            {
                d = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                c = b;
            }
            return;
        }
        c = new ContextThemeWrapper(b, i1);
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        f = actionmenupresenter;
        f.a(this);
    }
}
