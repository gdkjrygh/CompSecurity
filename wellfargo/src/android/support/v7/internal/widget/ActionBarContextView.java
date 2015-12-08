// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.a.i;
import android.support.v7.a.l;
import android.support.v7.c.a;
import android.support.v7.internal.view.h;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            a, bf, g, bl

public class ActionBarContextView extends android.support.v7.internal.widget.a
    implements ViewPropertyAnimatorListener
{

    private CharSequence j;
    private CharSequence k;
    private View l;
    private View m;
    private LinearLayout n;
    private TextView o;
    private TextView p;
    private int q;
    private int r;
    private Drawable s;
    private boolean t;
    private int u;
    private h v;
    private boolean w;
    private int x;

    public ActionBarContextView(Context context)
    {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        context = android.support.v7.internal.widget.bf.a(context, attributeset, l.ActionMode, i1, 0);
        setBackgroundDrawable(context.a(l.ActionMode_background));
        q = context.f(l.ActionMode_titleTextStyle, 0);
        r = context.f(l.ActionMode_subtitleTextStyle, 0);
        h = context.e(l.ActionMode_height, 0);
        s = context.a(l.ActionMode_backgroundSplit);
        u = context.f(l.ActionMode_closeItemLayout, i.abc_action_mode_close_item_material);
        context.b();
    }

    private void e()
    {
label0:
        {
            byte byte1 = 8;
            boolean flag = true;
            if (n == null)
            {
                LayoutInflater.from(getContext()).inflate(i.abc_action_bar_title_item, this);
                n = (LinearLayout)getChildAt(getChildCount() - 1);
                o = (TextView)n.findViewById(g.action_bar_title);
                p = (TextView)n.findViewById(g.action_bar_subtitle);
                if (q != 0)
                {
                    o.setTextAppearance(getContext(), q);
                }
                if (r != 0)
                {
                    p.setTextAppearance(getContext(), r);
                }
            }
            o.setText(j);
            p.setText(k);
            Object obj;
            byte byte0;
            int i1;
            if (!TextUtils.isEmpty(j))
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (TextUtils.isEmpty(k))
            {
                flag = false;
            }
            obj = p;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((TextView) (obj)).setVisibility(i1);
            obj = n;
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
        if (n.getParent() == null)
        {
            addView(n);
        }
    }

    private void f()
    {
        h h1 = v;
        if (h1 != null)
        {
            v = null;
            h1.b();
        }
    }

    private h g()
    {
        ViewCompat.setTranslationX(l, -l.getWidth() - ((android.view.ViewGroup.MarginLayoutParams)l.getLayoutParams()).leftMargin);
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(l).translationX(0.0F);
        viewpropertyanimatorcompat.setDuration(200L);
        viewpropertyanimatorcompat.setListener(this);
        viewpropertyanimatorcompat.setInterpolator(new DecelerateInterpolator());
        h h1 = new h();
        h1.a(viewpropertyanimatorcompat);
        if (c != null)
        {
            int i1 = c.getChildCount();
            if (i1 > 0)
            {
                int k1 = i1 - 1;
                for (int j1 = 0; k1 >= 0; j1++)
                {
                    Object obj = c.getChildAt(k1);
                    ViewCompat.setScaleY(((View) (obj)), 0.0F);
                    obj = ViewCompat.animate(((View) (obj))).scaleY(1.0F);
                    ((ViewPropertyAnimatorCompat) (obj)).setDuration(300L);
                    h1.a(((ViewPropertyAnimatorCompat) (obj)));
                    k1--;
                }

            }
        }
        return h1;
    }

    private h h()
    {
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(l).translationX(-l.getWidth() - ((android.view.ViewGroup.MarginLayoutParams)l.getLayoutParams()).leftMargin);
        viewpropertyanimatorcompat.setDuration(200L);
        viewpropertyanimatorcompat.setListener(this);
        viewpropertyanimatorcompat.setInterpolator(new DecelerateInterpolator());
        h h1 = new h();
        h1.a(viewpropertyanimatorcompat);
        if (c != null)
        {
            if (c.getChildCount() <= 0);
        }
        return h1;
    }

    public volatile void a(int i1)
    {
        super.a(i1);
    }

    public void a(a a1)
    {
        android.view.ViewGroup.LayoutParams layoutparams;
        if (l == null)
        {
            l = LayoutInflater.from(getContext()).inflate(u, this, false);
            addView(l);
        } else
        if (l.getParent() == null)
        {
            addView(l);
        }
        l.findViewById(g.action_mode_close_button).setOnClickListener(new android.support.v7.internal.widget.g(this, a1));
        a1 = (android.support.v7.internal.view.menu.i)a1.b();
        if (d != null)
        {
            d.e();
        }
        d = new ActionMenuPresenter(getContext());
        d.b(true);
        layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        if (!f)
        {
            a1.a(d, b);
            c = (ActionMenuView)d.a(this);
            c.setBackgroundDrawable(null);
            addView(c, layoutparams);
        } else
        {
            d.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
            d.b(0x7fffffff);
            layoutparams.width = -1;
            layoutparams.height = h;
            a1.a(d, b);
            c = (ActionMenuView)d.a(this);
            c.setBackgroundDrawable(s);
            e.addView(c, layoutparams);
        }
        w = true;
    }

    public boolean a()
    {
        if (d != null)
        {
            return d.c();
        } else
        {
            return false;
        }
    }

    public void b()
    {
        if (x == 2)
        {
            return;
        }
        if (l == null)
        {
            c();
            return;
        } else
        {
            f();
            x = 2;
            v = h();
            v.a();
            return;
        }
    }

    public void c()
    {
        f();
        removeAllViews();
        if (e != null)
        {
            e.removeView(c);
        }
        m = null;
        c = null;
        w = false;
    }

    public boolean d()
    {
        return t;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset);
    }

    public volatile int getAnimatedVisibility()
    {
        return super.getAnimatedVisibility();
    }

    public volatile int getContentHeight()
    {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle()
    {
        return k;
    }

    public CharSequence getTitle()
    {
        return j;
    }

    public void onAnimationCancel(View view)
    {
    }

    public void onAnimationEnd(View view)
    {
        if (x == 2)
        {
            c();
        }
        x = 0;
    }

    public void onAnimationStart(View view)
    {
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (d != null)
        {
            d.d();
            d.f();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                if (accessibilityevent.getEventType() != 32)
                {
                    break label0;
                }
                accessibilityevent.setSource(this);
                accessibilityevent.setClassName(getClass().getName());
                accessibilityevent.setPackageName(getContext().getPackageName());
                accessibilityevent.setContentDescription(j);
            }
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityevent);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        flag = android.support.v7.internal.widget.bl.a(this);
        int i2;
        int j2;
        int k2;
        if (flag)
        {
            i2 = k1 - i1 - getPaddingRight();
        } else
        {
            i2 = getPaddingLeft();
        }
        j2 = getPaddingTop();
        k2 = l1 - j1 - getPaddingTop() - getPaddingBottom();
        j1 = i2;
        if (l != null)
        {
            j1 = i2;
            if (l.getVisibility() != 8)
            {
                Object obj = (android.view.ViewGroup.MarginLayoutParams)l.getLayoutParams();
                if (flag)
                {
                    j1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
                } else
                {
                    j1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
                }
                if (flag)
                {
                    l1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
                } else
                {
                    l1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
                }
                j1 = a(i2, j1, flag);
                l1 = a(a(l, j1, j2, k2, flag) + j1, l1, flag);
                j1 = l1;
                if (w)
                {
                    x = 1;
                    v = g();
                    v.a();
                    w = false;
                    j1 = l1;
                }
            }
        }
        l1 = j1;
        if (n != null)
        {
            l1 = j1;
            if (m == null)
            {
                l1 = j1;
                if (n.getVisibility() != 8)
                {
                    l1 = j1 + a(n, j1, j2, k2, flag);
                }
            }
        }
        if (m != null)
        {
            a(m, l1, j2, k2, flag);
        }
        if (flag)
        {
            i1 = getPaddingLeft();
        } else
        {
            i1 = k1 - i1 - getPaddingRight();
        }
        if (c != null)
        {
            obj = c;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(((View) (obj)), i1, j2, k2, flag);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2 = 0x40000000;
        boolean flag = false;
        if (android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_width=\"match_parent\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j1) == 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
        }
        int k2 = android.view.View.MeasureSpec.getSize(i1);
        int k1;
        int l1;
        int j2;
        int l2;
        if (h > 0)
        {
            k1 = h;
        } else
        {
            k1 = android.view.View.MeasureSpec.getSize(j1);
        }
        l2 = getPaddingTop() + getPaddingBottom();
        i1 = k2 - getPaddingLeft() - getPaddingRight();
        j2 = k1 - l2;
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x80000000);
        j1 = i1;
        if (l != null)
        {
            i1 = a(l, i1, l1, 0);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)l.getLayoutParams();
            j1 = marginlayoutparams.leftMargin;
            j1 = i1 - (marginlayoutparams.rightMargin + j1);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1;
            if (c.getParent() == this)
            {
                i1 = a(c, j1, l1, 0);
            }
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1;
            if (m == null)
            {
                if (t)
                {
                    j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    n.measure(j1, l1);
                    int i3 = n.getMeasuredWidth();
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
                    obj = n;
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
                    j1 = a(n, i1, l1, 0);
                }
            }
        }
        if (m != null)
        {
            obj = m.getLayoutParams();
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
            m.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, i1), android.view.View.MeasureSpec.makeMeasureSpec(i2, j1));
        }
        if (h <= 0)
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
        h = i1;
    }

    public void setCustomView(View view)
    {
        if (m != null)
        {
            removeView(m);
        }
        m = view;
        if (n != null)
        {
            removeView(n);
            n = null;
        }
        if (view != null)
        {
            addView(view);
        }
        requestLayout();
    }

    public void setSplitToolbar(boolean flag)
    {
        if (f != flag)
        {
            if (d != null)
            {
                android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
                if (!flag)
                {
                    c = (ActionMenuView)d.a(this);
                    c.setBackgroundDrawable(null);
                    ViewGroup viewgroup = (ViewGroup)c.getParent();
                    if (viewgroup != null)
                    {
                        viewgroup.removeView(c);
                    }
                    addView(c, layoutparams);
                } else
                {
                    d.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    d.b(0x7fffffff);
                    layoutparams.width = -1;
                    layoutparams.height = h;
                    c = (ActionMenuView)d.a(this);
                    c.setBackgroundDrawable(s);
                    ViewGroup viewgroup1 = (ViewGroup)c.getParent();
                    if (viewgroup1 != null)
                    {
                        viewgroup1.removeView(c);
                    }
                    e.addView(c, layoutparams);
                }
            }
            super.setSplitToolbar(flag);
        }
    }

    public volatile void setSplitView(ViewGroup viewgroup)
    {
        super.setSplitView(viewgroup);
    }

    public volatile void setSplitWhenNarrow(boolean flag)
    {
        super.setSplitWhenNarrow(flag);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        k = charsequence;
        e();
    }

    public void setTitle(CharSequence charsequence)
    {
        j = charsequence;
        e();
    }

    public void setTitleOptional(boolean flag)
    {
        if (flag != t)
        {
            requestLayout();
        }
        t = flag;
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }
}
