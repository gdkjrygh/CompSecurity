// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.c;
import android.support.v7.a.f;
import android.support.v7.a.h;
import android.support.v7.a.k;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            a, ActionBarContainer

public class ActionBarContextView extends a
{

    private CharSequence g;
    private CharSequence h;
    private View i;
    private View j;
    private LinearLayout k;
    private TextView l;
    private TextView m;
    private int n;
    private int o;
    private Drawable p;
    private boolean q;

    public ActionBarContextView(Context context)
    {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, c.f);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        context = context.obtainStyledAttributes(attributeset, k.g, i1, 0);
        setBackgroundDrawable(context.getDrawable(3));
        n = context.getResourceId(1, 0);
        o = context.getResourceId(2, 0);
        f = context.getLayoutDimension(0, 0);
        p = context.getDrawable(4);
        context.recycle();
    }

    private void g()
    {
label0:
        {
            byte byte1 = 8;
            boolean flag = true;
            if (k == null)
            {
                LayoutInflater.from(getContext()).inflate(h.f, this);
                k = (LinearLayout)getChildAt(getChildCount() - 1);
                l = (TextView)k.findViewById(f.g);
                m = (TextView)k.findViewById(f.f);
                if (n != 0)
                {
                    l.setTextAppearance(getContext(), n);
                }
                if (o != 0)
                {
                    m.setTextAppearance(getContext(), o);
                }
            }
            l.setText(g);
            m.setText(h);
            Object obj;
            byte byte0;
            int i1;
            if (!TextUtils.isEmpty(g))
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (TextUtils.isEmpty(h))
            {
                flag = false;
            }
            obj = m;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((TextView) (obj)).setVisibility(i1);
            obj = k;
            if (byte0 == 0)
            {
                byte0 = byte1;
                if (!flag)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        ((LinearLayout) (obj)).setVisibility(byte0);
        if (k.getParent() == null)
        {
            addView(k);
        }
    }

    public final volatile int a()
    {
        return super.a();
    }

    public final boolean b()
    {
        if (b != null)
        {
            return b.b();
        } else
        {
            return false;
        }
    }

    public final volatile void c()
    {
        super.c();
    }

    public final boolean d()
    {
        if (b != null)
        {
            return b.c();
        } else
        {
            return false;
        }
    }

    public final boolean e()
    {
        if (b != null)
        {
            return b.f();
        } else
        {
            return false;
        }
    }

    public final volatile boolean f()
    {
        return super.f();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (b != null)
        {
            b.c();
            b.e();
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2 = getPaddingLeft();
        int j2 = getPaddingTop();
        int k2 = l1 - j1 - getPaddingTop() - getPaddingBottom();
        if (i != null && i.getVisibility() != 8)
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams();
            j1 = i2 + marginlayoutparams.leftMargin;
            l1 = b(i, j1, j2, k2);
            j1 = marginlayoutparams.rightMargin + (j1 + l1);
        } else
        {
            j1 = i2;
        }
        l1 = j1;
        if (k != null)
        {
            l1 = j1;
            if (j == null)
            {
                l1 = j1;
                if (k.getVisibility() != 8)
                {
                    l1 = j1 + b(k, j1, j2, k2);
                }
            }
        }
        if (j != null)
        {
            b(j, l1, j2, k2);
        }
        j1 = getPaddingRight();
        if (a != null)
        {
            c(a, k1 - i1 - j1, j2, k2);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2 = 0x40000000;
        boolean flag = false;
        if (android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with android:layout_width=\"FILL_PARENT\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j1) == 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with android:layout_height=\"wrap_content\"").toString());
        }
        int k2 = android.view.View.MeasureSpec.getSize(i1);
        int k1;
        int l1;
        int j2;
        int l2;
        if (f > 0)
        {
            k1 = f;
        } else
        {
            k1 = android.view.View.MeasureSpec.getSize(j1);
        }
        l2 = getPaddingTop() + getPaddingBottom();
        i1 = k2 - getPaddingLeft() - getPaddingRight();
        j2 = k1 - l2;
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x80000000);
        j1 = i1;
        if (i != null)
        {
            i1 = a(i, i1, l1, 0);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams();
            j1 = marginlayoutparams.leftMargin;
            j1 = i1 - (marginlayoutparams.rightMargin + j1);
        }
        i1 = j1;
        if (a != null)
        {
            i1 = j1;
            if (a.getParent() == this)
            {
                i1 = a(a, j1, l1, 0);
            }
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (j == null)
            {
                if (q)
                {
                    j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    k.measure(j1, l1);
                    int i3 = k.getMeasuredWidth();
                    Object obj;
                    if (i3 <= i1)
                    {
                        l1 = 1;
                    } else
                    {
                        l1 = 0;
                    }
                    j1 = i1;
                    if (l1 != 0)
                    {
                        j1 = i1 - i3;
                    }
                    obj = k;
                    if (l1 != 0)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 8;
                    }
                    ((LinearLayout) (obj)).setVisibility(i1);
                } else
                {
                    j1 = a(k, i1, l1, 0);
                }
            }
        }
        if (j != null)
        {
            obj = j.getLayoutParams();
            if (((android.view.ViewGroup.LayoutParams) (obj)).width != -2)
            {
                i1 = 0x40000000;
            } else
            {
                i1 = 0x80000000;
            }
            l1 = j1;
            if (((android.view.ViewGroup.LayoutParams) (obj)).width >= 0)
            {
                l1 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).width, j1);
            }
            if (((android.view.ViewGroup.LayoutParams) (obj)).height != -2)
            {
                j1 = i2;
            } else
            {
                j1 = 0x80000000;
            }
            if (((android.view.ViewGroup.LayoutParams) (obj)).height >= 0)
            {
                i2 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).height, j2);
            } else
            {
                i2 = j2;
            }
            j.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, i1), android.view.View.MeasureSpec.makeMeasureSpec(i2, j1));
        }
        if (f <= 0)
        {
            l1 = getChildCount();
            i1 = 0;
            for (j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                k1 = getChildAt(j1).getMeasuredHeight() + l2;
                if (k1 > i1)
                {
                    i1 = k1;
                }
            }

            setMeasuredDimension(k2, i1);
            return;
        } else
        {
            setMeasuredDimension(k2, k1);
            return;
        }
    }

    public void setContentHeight(int i1)
    {
        f = i1;
    }

    public void setCustomView(View view)
    {
        if (j != null)
        {
            removeView(j);
        }
        j = view;
        if (k != null)
        {
            removeView(k);
            k = null;
        }
        if (view != null)
        {
            addView(view);
        }
        requestLayout();
    }

    public void setSplitActionBar(boolean flag)
    {
        if (d != flag)
        {
            if (b != null)
            {
                android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
                if (!flag)
                {
                    a = (ActionMenuView)b.a(this);
                    a.setBackgroundDrawable(null);
                    ViewGroup viewgroup = (ViewGroup)a.getParent();
                    if (viewgroup != null)
                    {
                        viewgroup.removeView(a);
                    }
                    addView(a, layoutparams);
                } else
                {
                    b.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    b.a(0x7fffffff);
                    layoutparams.width = -1;
                    layoutparams.height = f;
                    a = (ActionMenuView)b.a(this);
                    a.setBackgroundDrawable(p);
                    ViewGroup viewgroup1 = (ViewGroup)a.getParent();
                    if (viewgroup1 != null)
                    {
                        viewgroup1.removeView(a);
                    }
                    c.addView(a, layoutparams);
                }
            }
            super.setSplitActionBar(flag);
        }
    }

    public volatile void setSplitView(ActionBarContainer actionbarcontainer)
    {
        super.setSplitView(actionbarcontainer);
    }

    public volatile void setSplitWhenNarrow(boolean flag)
    {
        super.setSplitWhenNarrow(flag);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        h = charsequence;
        g();
    }

    public void setTitle(CharSequence charsequence)
    {
        g = charsequence;
        g();
    }

    public void setTitleOptional(boolean flag)
    {
        if (flag != q)
        {
            requestLayout();
        }
        q = flag;
    }

    public volatile void setVisibility(int i1)
    {
        super.setVisibility(i1);
    }
}
