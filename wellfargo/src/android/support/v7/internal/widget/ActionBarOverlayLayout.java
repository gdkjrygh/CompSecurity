// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.widget.ScrollerCompat;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.internal.view.menu.y;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            af, h, i, j, 
//            k, ag, ActionBarContainer, m, 
//            ContentFrameLayout, bl, l

public class ActionBarOverlayLayout extends ViewGroup
    implements NestedScrollingParent, af
{

    static final int a[];
    private final ViewPropertyAnimatorListener A;
    private final ViewPropertyAnimatorListener B;
    private final Runnable C;
    private final Runnable D;
    private final NestedScrollingParentHelper E;
    private int b;
    private int c;
    private ContentFrameLayout d;
    private ActionBarContainer e;
    private ActionBarContainer f;
    private ag g;
    private Drawable h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private l v;
    private final int w;
    private ScrollerCompat x;
    private ViewPropertyAnimatorCompat y;
    private ViewPropertyAnimatorCompat z;

    public ActionBarOverlayLayout(Context context)
    {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0;
        p = new Rect();
        q = new Rect();
        r = new Rect();
        s = new Rect();
        t = new Rect();
        u = new Rect();
        w = 600;
        A = new h(this);
        B = new i(this);
        C = new j(this);
        D = new k(this);
        a(context);
        E = new NestedScrollingParentHelper(this);
    }

    static ViewPropertyAnimatorCompat a(ActionBarOverlayLayout actionbaroverlaylayout, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        actionbaroverlaylayout.y = viewpropertyanimatorcompat;
        return viewpropertyanimatorcompat;
    }

    private ag a(View view)
    {
        if (view instanceof ag)
        {
            return (ag)view;
        }
        if (view instanceof Toolbar)
        {
            return ((Toolbar)view).getWrapper();
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Can't make a decor toolbar out of ").append(view.getClass().getSimpleName()).toString());
        }
    }

    private void a(Context context)
    {
        boolean flag1 = true;
        TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(a);
        b = typedarray.getDimensionPixelSize(0, 0);
        h = typedarray.getDrawable(1);
        boolean flag;
        if (h == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        typedarray.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        i = flag;
        x = ScrollerCompat.create(context);
    }

    static void a(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.k();
    }

    private boolean a(float f1, float f2)
    {
        boolean flag = false;
        x.fling(0, 0, 0, (int)f2, 0, 0, 0x80000000, 0x7fffffff);
        if (x.getFinalY() > f.getHeight())
        {
            flag = true;
        }
        return flag;
    }

    static boolean a(ActionBarOverlayLayout actionbaroverlaylayout, boolean flag)
    {
        actionbaroverlaylayout.m = flag;
        return flag;
    }

    private boolean a(View view, Rect rect, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        boolean flag5 = false;
        view = (m)view.getLayoutParams();
        boolean flag4 = flag5;
        if (flag)
        {
            flag4 = flag5;
            if (((m) (view)).leftMargin != rect.left)
            {
                view.leftMargin = rect.left;
                flag4 = true;
            }
        }
        flag = flag4;
        if (flag1)
        {
            flag = flag4;
            if (((m) (view)).topMargin != rect.top)
            {
                view.topMargin = rect.top;
                flag = true;
            }
        }
        flag1 = flag;
        if (flag3)
        {
            flag1 = flag;
            if (((m) (view)).rightMargin != rect.right)
            {
                view.rightMargin = rect.right;
                flag1 = true;
            }
        }
        if (flag2 && ((m) (view)).bottomMargin != rect.bottom)
        {
            view.bottomMargin = rect.bottom;
            return true;
        } else
        {
            return flag1;
        }
    }

    static ViewPropertyAnimatorCompat b(ActionBarOverlayLayout actionbaroverlaylayout, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        actionbaroverlaylayout.z = viewpropertyanimatorcompat;
        return viewpropertyanimatorcompat;
    }

    static ViewPropertyAnimatorListener b(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.A;
    }

    static ActionBarContainer c(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.f;
    }

    static ActionBarContainer d(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.e;
    }

    static ViewPropertyAnimatorListener e(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.B;
    }

    private void k()
    {
        removeCallbacks(C);
        removeCallbacks(D);
        if (y != null)
        {
            y.cancel();
        }
        if (z != null)
        {
            z.cancel();
        }
    }

    private void l()
    {
        k();
        postDelayed(C, 600L);
    }

    private void m()
    {
        k();
        postDelayed(D, 600L);
    }

    private void n()
    {
        k();
        C.run();
    }

    private void o()
    {
        k();
        D.run();
    }

    public m a(AttributeSet attributeset)
    {
        return new m(getContext(), attributeset);
    }

    public void a(int i1)
    {
        c();
        switch (i1)
        {
        default:
            return;

        case 2: // '\002'
            g.g();
            return;

        case 5: // '\005'
            g.h();
            return;

        case 9: // '\t'
            setOverlayMode(true);
            break;
        }
    }

    public void a(Menu menu, y y1)
    {
        c();
        g.a(menu, y1);
    }

    public boolean a()
    {
        return j;
    }

    protected m b()
    {
        return new m(-1, -1);
    }

    void c()
    {
        if (d == null)
        {
            d = (ContentFrameLayout)findViewById(g.action_bar_activity_content);
            f = (ActionBarContainer)findViewById(g.action_bar_container);
            g = a(findViewById(g.action_bar));
            e = (ActionBarContainer)findViewById(g.split_action_bar);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof m;
    }

    public boolean d()
    {
        c();
        return g.i();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (h != null && !i)
        {
            int i1;
            if (f.getVisibility() == 0)
            {
                i1 = (int)((float)f.getBottom() + ViewCompat.getTranslationY(f) + 0.5F);
            } else
            {
                i1 = 0;
            }
            h.setBounds(0, i1, getWidth(), h.getIntrinsicHeight() + i1);
            h.draw(canvas);
        }
    }

    public boolean e()
    {
        c();
        return g.j();
    }

    public boolean f()
    {
        c();
        return g.k();
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        c();
        if ((ViewCompat.getWindowSystemUiVisibility(this) & 0x100) == 0);
        boolean flag1 = a(f, rect, true, true, false, true);
        boolean flag = flag1;
        if (e != null)
        {
            flag = flag1 | a(e, rect, true, false, true, true);
        }
        s.set(rect);
        bl.a(this, s, p);
        if (!q.equals(p))
        {
            q.set(p);
            flag = true;
        }
        if (flag)
        {
            requestLayout();
        }
        return true;
    }

    public boolean g()
    {
        c();
        return g.l();
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
        return new m(layoutparams);
    }

    public int getActionBarHideOffset()
    {
        if (f != null)
        {
            return -(int)ViewCompat.getTranslationY(f);
        } else
        {
            return 0;
        }
    }

    public int getNestedScrollAxes()
    {
        return E.getNestedScrollAxes();
    }

    public CharSequence getTitle()
    {
        c();
        return g.f();
    }

    public boolean h()
    {
        c();
        return g.m();
    }

    public void i()
    {
        c();
        g.n();
    }

    public void j()
    {
        c();
        g.o();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        k();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2 = getChildCount();
        int j2 = getPaddingLeft();
        getPaddingRight();
        int k2 = getPaddingTop();
        int l2 = getPaddingBottom();
        i1 = 0;
        while (i1 < i2) 
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 8)
            {
                m m1 = (m)view.getLayoutParams();
                int i3 = view.getMeasuredWidth();
                int j3 = view.getMeasuredHeight();
                int k3 = m1.leftMargin + j2;
                if (view == e)
                {
                    k1 = l1 - j1 - l2 - j3 - m1.bottomMargin;
                } else
                {
                    k1 = m1.topMargin + k2;
                }
                view.layout(k3, k1, i3 + k3, j3 + k1);
            }
            i1++;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        c();
        measureChildWithMargins(f, i1, 0, j1, 0);
        Object obj = (m)f.getLayoutParams();
        int k2 = Math.max(0, f.getMeasuredWidth() + ((m) (obj)).leftMargin + ((m) (obj)).rightMargin);
        int k1 = f.getMeasuredHeight();
        int l1 = ((m) (obj)).topMargin;
        int j2 = Math.max(0, ((m) (obj)).bottomMargin + (k1 + l1));
        int i2 = bl.a(0, ViewCompat.getMeasuredState(f));
        if (e != null)
        {
            measureChildWithMargins(e, i1, 0, j1, 0);
            obj = (m)e.getLayoutParams();
            k2 = Math.max(k2, e.getMeasuredWidth() + ((m) (obj)).leftMargin + ((m) (obj)).rightMargin);
            k1 = e.getMeasuredHeight();
            l1 = ((m) (obj)).topMargin;
            j2 = Math.max(j2, ((m) (obj)).bottomMargin + (k1 + l1));
            i2 = bl.a(i2, ViewCompat.getMeasuredState(e));
        }
        boolean flag;
        if ((ViewCompat.getWindowSystemUiVisibility(this) & 0x100) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l1 = b;
            k1 = l1;
            if (k)
            {
                k1 = l1;
                if (f.getTabContainer() != null)
                {
                    k1 = l1 + b;
                }
            }
        } else
        if (f.getVisibility() != 8)
        {
            k1 = f.getMeasuredHeight();
        } else
        {
            k1 = 0;
        }
        if (g.c() && e != null)
        {
            if (flag)
            {
                l1 = b;
            } else
            {
                l1 = e.getMeasuredHeight();
            }
        } else
        {
            l1 = 0;
        }
        r.set(p);
        t.set(s);
        if (!j && !flag)
        {
            obj = r;
            obj.top = k1 + ((Rect) (obj)).top;
            obj = r;
            obj.bottom = l1 + ((Rect) (obj)).bottom;
        } else
        {
            Rect rect = t;
            rect.top = k1 + rect.top;
            rect = t;
            rect.bottom = l1 + rect.bottom;
        }
        a(d, r, true, true, true, true);
        if (!u.equals(t))
        {
            u.set(t);
            d.a(t);
        }
        measureChildWithMargins(d, i1, 0, j1, 0);
        obj = (m)d.getLayoutParams();
        k1 = Math.max(k2, d.getMeasuredWidth() + ((m) (obj)).leftMargin + ((m) (obj)).rightMargin);
        l1 = d.getMeasuredHeight();
        k2 = ((m) (obj)).topMargin;
        l1 = Math.max(j2, ((m) (obj)).bottomMargin + (l1 + k2));
        i2 = bl.a(i2, ViewCompat.getMeasuredState(d));
        j2 = getPaddingLeft();
        k2 = getPaddingRight();
        l1 = Math.max(l1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(ViewCompat.resolveSizeAndState(Math.max(k1 + (j2 + k2), getSuggestedMinimumWidth()), i1, i2), ViewCompat.resolveSizeAndState(l1, j1, i2 << 16));
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        if (!l || !flag)
        {
            return false;
        }
        if (a(f1, f2))
        {
            o();
        } else
        {
            n();
        }
        m = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f1, float f2)
    {
        return false;
    }

    public void onNestedPreScroll(View view, int i1, int j1, int ai[])
    {
    }

    public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
    {
        n = n + j1;
        setActionBarHideOffset(n);
    }

    public void onNestedScrollAccepted(View view, View view1, int i1)
    {
        E.onNestedScrollAccepted(view, view1, i1);
        n = getActionBarHideOffset();
        k();
        if (v != null)
        {
            v.j();
        }
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        if ((i1 & 2) == 0 || f.getVisibility() != 0)
        {
            return false;
        } else
        {
            return l;
        }
    }

    public void onStopNestedScroll(View view)
    {
        if (l && !m)
        {
            if (n <= f.getHeight())
            {
                l();
            } else
            {
                m();
            }
        }
        if (v != null)
        {
            v.k();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i1)
    {
        boolean flag2 = true;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            super.onWindowSystemUiVisibilityChanged(i1);
        }
        c();
        int j1 = o;
        o = i1;
        boolean flag;
        boolean flag1;
        if ((i1 & 4) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i1 & 0x100) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (v != null)
        {
            l l1 = v;
            if (flag1)
            {
                flag2 = false;
            }
            l1.k(flag2);
            if (flag || !flag1)
            {
                v.h();
            } else
            {
                v.i();
            }
        }
        if (((j1 ^ i1) & 0x100) != 0 && v != null)
        {
            ViewCompat.requestApplyInsets(this);
        }
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        c = i1;
        if (v != null)
        {
            v.b(i1);
        }
    }

    public void setActionBarHideOffset(int i1)
    {
        k();
        int j1 = f.getHeight();
        i1 = Math.max(0, Math.min(i1, j1));
        ViewCompat.setTranslationY(f, -i1);
        if (e != null && e.getVisibility() != 8)
        {
            i1 = (int)(((float)i1 / (float)j1) * (float)e.getHeight());
            ViewCompat.setTranslationY(e, i1);
        }
    }

    public void setActionBarVisibilityCallback(l l1)
    {
        v = l1;
        if (getWindowToken() != null)
        {
            v.b(c);
            if (o != 0)
            {
                onWindowSystemUiVisibilityChanged(o);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean flag)
    {
        k = flag;
    }

    public void setHideOnContentScrollEnabled(boolean flag)
    {
        if (flag != l)
        {
            l = flag;
            if (!flag)
            {
                k();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i1)
    {
        c();
        g.a(i1);
    }

    public void setIcon(Drawable drawable)
    {
        c();
        g.a(drawable);
    }

    public void setLogo(int i1)
    {
        c();
        g.b(i1);
    }

    public void setOverlayMode(boolean flag)
    {
        j = flag;
        if (flag && getContext().getApplicationInfo().targetSdkVersion < 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
    }

    public void setShowingForActionMode(boolean flag)
    {
    }

    public void setUiOptions(int i1)
    {
    }

    public void setWindowCallback(android.view.Window.Callback callback)
    {
        c();
        g.a(callback);
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        c();
        g.a(charsequence);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    static 
    {
        a = (new int[] {
            b.actionBarSize, 0x1010059
        });
    }
}
