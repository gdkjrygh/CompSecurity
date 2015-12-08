// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package com.jiubang.pla.internal:
//            PLA_AdapterView, h, b, k, 
//            e, d, c, f, 
//            a, n, g, l

public abstract class PLA_AbsListView extends PLA_AdapterView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnTouchModeChangeListener
{

    final boolean A[];
    private VelocityTracker R;
    private d S;
    private g T;
    private e U;
    private boolean V;
    private Rect W;
    private android.view.ContextMenu.ContextMenuInfo Z;
    int a;
    private int aa;
    private boolean ab;
    private boolean ac;
    private Runnable ad;
    private f ae;
    private int af;
    private int ag;
    private boolean ah;
    private int ai;
    private int aj;
    private Runnable ak;
    private int al;
    private int am;
    private int an;
    l b;
    protected ListAdapter c;
    boolean d;
    Drawable e;
    Rect f;
    final h g;
    int h;
    int i;
    int j;
    int k;
    protected Rect l;
    protected int m;
    protected boolean n;
    protected int o;
    int p;
    int q;
    int r;
    int s;
    protected int t;
    int u;
    int v;
    int w;
    boolean x;
    boolean y;
    int z;

    public PLA_AbsListView(Context context)
    {
        super(context);
        a = 0;
        d = false;
        f = new Rect();
        g = new h(this);
        h = 0;
        i = 0;
        j = 0;
        k = 0;
        l = new Rect();
        m = 0;
        t = -1;
        w = 0;
        V = true;
        z = -1;
        Z = null;
        aa = -1;
        ab = false;
        ac = false;
        ai = 0;
        A = new boolean[1];
        an = -1;
        z();
        setVerticalScrollBarEnabled(true);
        context = context.obtainStyledAttributes(com.gau.go.launcherex.gowidget.weatherwidget.R.styleable.View);
        initializeScrollbars(context);
        context.recycle();
    }

    public PLA_AbsListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010035);
    }

    public PLA_AbsListView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = 0;
        d = false;
        f = new Rect();
        g = new h(this);
        h = 0;
        i = 0;
        j = 0;
        k = 0;
        l = new Rect();
        m = 0;
        t = -1;
        w = 0;
        V = true;
        z = -1;
        Z = null;
        aa = -1;
        ab = false;
        ac = false;
        ai = 0;
        A = new boolean[1];
        an = -1;
        z();
        context = context.obtainStyledAttributes(attributeset, com.gau.go.launcherex.gowidget.weatherwidget.R.styleable.AbsListView, i1, 0);
        attributeset = context.getDrawable(0);
        if (attributeset != null)
        {
            a(attributeset);
        }
        d = context.getBoolean(1, false);
        c(context.getBoolean(2, false));
        b(context.getBoolean(3, true));
        f(context.getInt(5, 0));
        g(context.getColor(6, 0));
        a(context.getBoolean(8, true));
        context.recycle();
    }

    private void A()
    {
        a(getResources().getDrawable(0x1080062));
    }

    private void B()
    {
        if (y && !n)
        {
            setChildrenDrawnWithCacheEnabled(true);
            setChildrenDrawingCacheEnabled(true);
            n = true;
        }
    }

    private void C()
    {
        if (ak == null)
        {
            ak = new b(this);
        }
        post(ak);
    }

    static int a(Rect rect, Rect rect1, int i1)
    {
        i1;
        JVM INSTR lookupswitch 4: default 44
    //                   17: 149
    //                   33: 188
    //                   66: 54
    //                   130: 108;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
_L4:
        int j1;
        int k1;
        int l1;
        l1 = rect.right;
        k1 = rect.top + rect.height() / 2;
        j1 = rect1.left;
        i1 = rect1.top + rect1.height() / 2;
_L7:
        j1 -= l1;
        i1 -= k1;
        return i1 * i1 + j1 * j1;
_L5:
        l1 = rect.left + rect.width() / 2;
        k1 = rect.bottom;
        i1 = rect1.left;
        j1 = rect1.width() / 2 + i1;
        i1 = rect1.top;
        continue; /* Loop/switch isn't completed */
_L2:
        l1 = rect.left;
        k1 = rect.top + rect.height() / 2;
        j1 = rect1.right;
        i1 = rect1.top + rect1.height() / 2;
        continue; /* Loop/switch isn't completed */
_L3:
        l1 = rect.left + rect.width() / 2;
        k1 = rect.top;
        i1 = rect1.left;
        j1 = rect1.width() / 2 + i1;
        i1 = rect1.bottom;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static int a(PLA_AbsListView pla_abslistview)
    {
        return pla_abslistview.getWindowAttachCount();
    }

    private void a(int i1, int j1, int k1, int l1)
    {
        f.set(i1 - h, j1 - i, j + k1, k + l1);
    }

    private void a(Canvas canvas)
    {
        if (i() && f != null && !f.isEmpty())
        {
            Drawable drawable = e;
            drawable.setBounds(f);
            drawable.draw(canvas);
        }
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(i1) == an)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            r = (int)motionevent.getX(i1);
            s = (int)motionevent.getY(i1);
            an = motionevent.getPointerId(i1);
            if (R != null)
            {
                R.clear();
            }
        }
    }

    static void a(PLA_AbsListView pla_abslistview, View view)
    {
        pla_abslistview.c(view);
    }

    static void a(PLA_AbsListView pla_abslistview, View view, boolean flag)
    {
        pla_abslistview.removeDetachedView(view, flag);
    }

    static void a(PLA_AbsListView pla_abslistview, boolean flag)
    {
        pla_abslistview.setChildrenDrawnWithCacheEnabled(flag);
    }

    static int b(PLA_AbsListView pla_abslistview)
    {
        return pla_abslistview.getWindowAttachCount();
    }

    static void b(PLA_AbsListView pla_abslistview, View view, boolean flag)
    {
        pla_abslistview.removeDetachedView(view, flag);
    }

    static void b(PLA_AbsListView pla_abslistview, boolean flag)
    {
        pla_abslistview.setChildrenDrawingCacheEnabled(flag);
    }

    private void c(View view)
    {
        if (view != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        view.onFinishTemporaryDetach();
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j1 = view.getChildCount();
            int i1 = 0;
            while (i1 < j1) 
            {
                c(view.getChildAt(i1));
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static void c(PLA_AbsListView pla_abslistview)
    {
        pla_abslistview.C();
    }

    static void c(PLA_AbsListView pla_abslistview, View view, boolean flag)
    {
        pla_abslistview.removeDetachedView(view, flag);
    }

    static g d(PLA_AbsListView pla_abslistview)
    {
        return pla_abslistview.T;
    }

    static void d(PLA_AbsListView pla_abslistview, View view, boolean flag)
    {
        pla_abslistview.removeDetachedView(view, flag);
    }

    static void e(PLA_AbsListView pla_abslistview, View view, boolean flag)
    {
        pla_abslistview.removeDetachedView(view, flag);
    }

    private boolean i(int i1)
    {
        if (Math.abs(i1) > aj)
        {
            B();
            t = 3;
            v = i1;
            setPressed(false);
            View view = getChildAt(o - B);
            if (view != null)
            {
                view.setPressed(false);
            }
            a(1);
            requestDisallowInterceptTouchEvent(true);
            return true;
        } else
        {
            return false;
        }
    }

    private void z()
    {
        setClickable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setAlwaysDrawnWithCacheEnabled(false);
        b(true);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        aj = viewconfiguration.getScaledTouchSlop();
        al = viewconfiguration.getScaledMinimumFlingVelocity();
        am = viewconfiguration.getScaledMaximumFlingVelocity();
    }

    public int a(int i1, int j1)
    {
        Rect rect1 = W;
        Rect rect = rect1;
        if (rect1 == null)
        {
            W = new Rect();
            rect = W;
        }
        for (int k1 = getChildCount() - 1; k1 >= 0; k1--)
        {
            View view = getChildAt(k1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            view.getHitRect(rect);
            if (rect.contains(i1, j1))
            {
                return B + k1;
            }
        }

        return -1;
    }

    android.view.ContextMenu.ContextMenuInfo a(View view, int i1, long l1)
    {
        return new k(view, i1, l1);
    }

    View a(int i1, boolean aflag[])
    {
        View view2;
        aflag[0] = false;
        view2 = g.d(i1);
        if (view2 == null) goto _L2; else goto _L1
_L1:
        View view = c.getView(i1, view2, this);
        if (view == view2) goto _L4; else goto _L3
_L3:
        g.a(view2);
        aflag = view;
        if (ag != 0)
        {
            view.setDrawingCacheBackgroundColor(ag);
            aflag = view;
        }
_L6:
        return aflag;
_L4:
        aflag[0] = true;
        c(view);
        return view;
_L2:
        View view1 = c.getView(i1, null, this);
        aflag = view1;
        if (ag != 0)
        {
            view1.setDrawingCacheBackgroundColor(ag);
            return view1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public LayoutParams a(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    void a()
    {
        if (U != null)
        {
            U.a(this, B, getChildCount(), M);
        }
    }

    void a(int i1)
    {
        if (i1 != ai && U != null)
        {
            U.a(this, i1);
            ai = i1;
        }
    }

    public void a(Drawable drawable)
    {
        if (e != null)
        {
            e.setCallback(null);
            unscheduleDrawable(e);
        }
        e = drawable;
        Rect rect = new Rect();
        drawable.getPadding(rect);
        h = rect.left;
        i = rect.top;
        j = rect.right;
        k = rect.bottom;
        drawable.setCallback(this);
        drawable.setState(getDrawableState());
    }

    void a(View view)
    {
        Rect rect = f;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        a(rect.left, rect.top, rect.right, rect.bottom);
        boolean flag = ah;
        if (view.isEnabled() != flag)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ah = flag;
            refreshDrawableState();
        }
    }

    public void a(e e1)
    {
        U = e1;
        a();
    }

    public void a(boolean flag)
    {
        V = flag;
    }

    public void addTouchables(ArrayList arraylist)
    {
        int j1 = getChildCount();
        int k1 = B;
        ListAdapter listadapter = c;
        if (listadapter != null)
        {
            int i1 = 0;
            while (i1 < j1) 
            {
                View view = getChildAt(i1);
                if (listadapter.isEnabled(k1 + i1))
                {
                    arraylist.add(view);
                }
                view.addTouchables(arraylist);
                i1++;
            }
        }
    }

    void b()
    {
        if (getChildCount() > 0)
        {
            c();
            requestLayout();
            invalidate();
        }
    }

    protected void b(int i1)
    {
        int k1 = getChildCount();
        for (int j1 = 0; j1 < k1; j1++)
        {
            getChildAt(j1).offsetTopAndBottom(i1);
        }

    }

    public void b(int i1, int j1)
    {
        if (S == null)
        {
            S = new d(this);
        } else
        {
            com.jiubang.pla.internal.d.a(S);
        }
        S.a(i1, j1);
    }

    public void b(boolean flag)
    {
        if (y && !flag)
        {
            C();
        }
        y = flag;
    }

    abstract int c(int i1);

    void c()
    {
        removeAllViewsInLayout();
        B = 0;
        L = false;
        G = false;
        O = -1;
        P = 0x8000000000000000L;
        w = 0;
        f.setEmpty();
        invalidate();
    }

    public void c(boolean flag)
    {
        if (x != flag)
        {
            x = flag;
            b();
        }
    }

    boolean c(int i1, int j1)
    {
        Object obj;
        int j2;
        int k2;
        int l2;
        int i4;
        int j4;
        int k4;
        int l4;
        j4 = getChildCount();
        if (j4 == 0)
        {
            return true;
        }
        int k1 = o();
        k2 = r();
        obj = l;
        int i3 = getHeight() - ((Rect) (obj)).bottom;
        int j3 = ((Rect) (obj)).top;
        int k3 = p();
        int l3 = q();
        j2 = getHeight() - getPaddingBottom() - getPaddingTop();
        int i2;
        if (i1 < 0)
        {
            i2 = Math.max(-(j2 - 1), i1);
        } else
        {
            i2 = Math.min(j2 - 1, i1);
        }
        if (j1 < 0)
        {
            j2 = Math.max(-(j2 - 1), j1);
        } else
        {
            j2 = Math.min(j2 - 1, j1);
        }
        i4 = B;
        if (i4 == 0 && k1 >= ((Rect) (obj)).top && i2 >= 0)
        {
            return true;
        }
        if (i4 + j4 == M && k2 <= i3 && i2 <= 0)
        {
            return true;
        }
        int i5;
        boolean flag;
        if (j2 < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k4 = k();
        l4 = M - l();
        k2 = 0;
        k1 = 0;
        if (!flag) goto _L2; else goto _L1
_L1:
        i5 = ((Rect) (obj)).top;
        i1 = 0;
        j1 = 0;
_L7:
        k2 = i1;
        l2 = k1;
        if (j1 >= j4) goto _L4; else goto _L3
_L3:
        obj = getChildAt(j1);
        if (((View) (obj)).getBottom() < i5 - j2) goto _L6; else goto _L5
_L5:
        l2 = k1;
        k2 = i1;
_L4:
        q = p + i2;
        Q = true;
        if (k2 > 0)
        {
            detachViewsFromParent(l2, k2);
        }
        b(j2);
        if (flag)
        {
            B = k2 + B;
        }
        invalidate();
        i1 = Math.abs(j2);
        if (j3 - k3 < i1 || l3 - i3 < i1)
        {
            d(flag);
        }
        Q = false;
        a();
        awakenScrollBars();
        return false;
_L6:
        k2 = i4 + j1;
        if (k2 >= k4 && k2 < l4)
        {
            g.a(((View) (obj)));
        }
        j1++;
        i1++;
          goto _L7
_L2:
        int l1;
        int j5;
        int k5;
        j5 = getHeight();
        k5 = ((Rect) (obj)).bottom;
        j1 = 0;
        i1 = j4 - 1;
        l1 = k2;
_L10:
        k2 = j1;
        l2 = l1;
        if (i1 < 0) goto _L4; else goto _L8
_L8:
        obj = getChildAt(i1);
        k2 = j1;
        l2 = l1;
        if (((View) (obj)).getTop() <= j5 - k5 - j2) goto _L4; else goto _L9
_L9:
        l1 = i4 + i1;
        if (l1 >= k4 && l1 < l4)
        {
            g.a(((View) (obj)));
        }
        j1++;
        l1 = i1;
        i1--;
          goto _L10
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    protected int computeVerticalScrollExtent()
    {
        int k1 = getChildCount();
        if (k1 > 0)
        {
            if (V)
            {
                int j1 = k1 * 100;
                View view = getChildAt(0);
                int l1 = p();
                int i2 = view.getHeight();
                int i1 = j1;
                if (i2 > 0)
                {
                    i1 = j1 + (l1 * 100) / i2;
                }
                view = getChildAt(k1 - 1);
                k1 = r();
                l1 = view.getHeight();
                j1 = i1;
                if (l1 > 0)
                {
                    j1 = i1 - ((k1 - getHeight()) * 100) / l1;
                }
                return j1;
            } else
            {
                return 1;
            }
        } else
        {
            return 0;
        }
    }

    protected int computeVerticalScrollOffset()
    {
        int l1;
        int i2;
        int j2;
label0:
        {
            l1 = 0;
            boolean flag = false;
            i2 = B;
            j2 = getChildCount();
            int i1 = ((flag) ? 1 : 0);
            if (i2 >= 0)
            {
                i1 = ((flag) ? 1 : 0);
                if (j2 > 0)
                {
                    if (!V)
                    {
                        break label0;
                    }
                    View view = getChildAt(0);
                    l1 = p();
                    j2 = view.getHeight();
                    i1 = ((flag) ? 1 : 0);
                    if (j2 > 0)
                    {
                        i1 = Math.max((i2 * 100 - (l1 * 100) / j2) + (int)(((float)getScrollY() / (float)getHeight()) * (float)M * 100F), 0);
                    }
                }
            }
            return i1;
        }
        int k1 = M;
        float f1;
        float f2;
        int j1;
        if (i2 == 0)
        {
            j1 = l1;
        } else
        if (i2 + j2 == k1)
        {
            j1 = k1;
        } else
        {
            j1 = j2 / 2 + i2;
        }
        f1 = i2;
        f2 = j2;
        return (int)(((float)j1 / (float)k1) * f2 + f1);
    }

    protected int computeVerticalScrollRange()
    {
        if (V)
        {
            return Math.max(M * 100, 0);
        } else
        {
            return M;
        }
    }

    protected void d()
    {
    }

    protected void d(int i1)
    {
    }

    abstract void d(boolean flag);

    protected void dispatchDraw(Canvas canvas)
    {
        boolean flag = d;
        if (!flag)
        {
            a(canvas);
        }
        super.dispatchDraw(canvas);
        if (flag)
        {
            a(canvas);
        }
    }

    protected void dispatchSetPressed(boolean flag)
    {
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (e != null)
        {
            e.setState(getDrawableState());
        }
    }

    public View e()
    {
        return null;
    }

    protected void e(int i1)
    {
    }

    public int f()
    {
        return l.top;
    }

    public void f(int i1)
    {
        af = i1;
    }

    public int g()
    {
        return l.bottom;
    }

    public void g(int i1)
    {
        if (i1 != ag)
        {
            ag = i1;
            int k1 = getChildCount();
            for (int j1 = 0; j1 < k1; j1++)
            {
                getChildAt(j1).setDrawingCacheBackgroundColor(i1);
            }

            g.e(i1);
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(layoutparams);
    }

    protected float getBottomFadingEdgeStrength()
    {
        int i1 = getChildCount();
        float f1 = super.getBottomFadingEdgeStrength();
        if (i1 != 0)
        {
            if ((B + i1) - 1 < M - 1)
            {
                return 1.0F;
            }
            i1 = getChildAt(i1 - 1).getBottom();
            int j1 = getHeight();
            float f2 = getVerticalFadingEdgeLength();
            if (i1 > j1 - getPaddingBottom())
            {
                return (float)((i1 - j1) + getPaddingBottom()) / f2;
            }
        }
        return f1;
    }

    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo()
    {
        return Z;
    }

    public void getFocusedRect(Rect rect)
    {
        View view = e();
        if (view != null && view.getParent() == this)
        {
            view.getFocusedRect(rect);
            offsetDescendantRectToMyCoords(view, rect);
            return;
        } else
        {
            super.getFocusedRect(rect);
            return;
        }
    }

    public int getSolidColor()
    {
        return ag;
    }

    protected float getTopFadingEdgeStrength()
    {
        int i1 = getChildCount();
        float f1 = super.getTopFadingEdgeStrength();
        if (i1 != 0)
        {
            if (B > 0)
            {
                return 1.0F;
            }
            int j1 = getChildAt(0).getTop();
            float f2 = getVerticalFadingEdgeLength();
            if (j1 < getPaddingTop())
            {
                return (float)(-(j1 - getPaddingTop())) / f2;
            }
        }
        return f1;
    }

    protected int h(int i1)
    {
        return i1;
    }

    boolean h()
    {
        switch (t)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    protected boolean i()
    {
        return hasFocus() && !isInTouchMode() || h();
    }

    public boolean j()
    {
        if (getChildCount() != 0)
        {
            int i1 = o();
            Rect rect = l;
            int j1 = Math.min(getHeight() - getPaddingBottom() - getPaddingTop() - 1, 0);
            if (B != 0 || i1 < rect.top || j1 < 0)
            {
                return false;
            }
        }
        return true;
    }

    int k()
    {
        return 0;
    }

    int l()
    {
        return 0;
    }

    protected void m()
    {
        int l1 = M;
        if (l1 <= 0) goto _L2; else goto _L1
_L1:
        if (!G) goto _L4; else goto _L3
_L3:
        G = false;
        if (af != 2 && (af != 1 || B + getChildCount() < N)) goto _L6; else goto _L5
_L5:
        a = 3;
_L10:
        return;
_L6:
        H;
        JVM INSTR tableswitch 1 1: default 80
    //                   1 147;
           goto _L4 _L7
_L4:
        if (isInTouchMode()) goto _L9; else goto _L8
_L8:
        int k1;
        k1 = t();
        int i1 = k1;
        if (k1 >= l1)
        {
            i1 = l1 - 1;
        }
        k1 = i1;
        if (i1 < 0)
        {
            k1 = 0;
        }
        a(k1, true);
        if (a(k1, false) >= 0) goto _L10; else goto _L2
_L2:
        int j1;
        if (x)
        {
            j1 = 3;
        } else
        {
            j1 = 1;
        }
        a = j1;
        G = false;
        return;
_L7:
        a = 5;
        D = Math.min(Math.max(0, D), l1 - 1);
        return;
_L9:
        if (z >= 0)
        {
            return;
        }
          goto _L2
    }

    public int n()
    {
        return ag;
    }

    protected int o()
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            return getChildAt(0).getTop();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.addOnTouchModeChangeListener(this);
        }
    }

    protected int[] onCreateDrawableState(int i1)
    {
        if (!ah) goto _L2; else goto _L1
_L1:
        int ai1[] = super.onCreateDrawableState(i1);
_L5:
        return ai1;
_L2:
        int ai2[];
        int j1;
        j1 = ENABLED_STATE_SET[0];
        ai2 = super.onCreateDrawableState(i1 + 1);
        i1 = ai2.length - 1;
_L6:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        if (ai2[i1] != j1) goto _L4; else goto _L3
_L3:
        ai1 = ai2;
        if (i1 >= 0)
        {
            System.arraycopy(ai2, i1 + 1, ai2, i1, ai2.length - i1 - 1);
            return ai2;
        }
          goto _L5
_L4:
        i1--;
          goto _L6
        i1 = -1;
          goto _L3
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        g.b();
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.removeOnTouchModeChangeListener(this);
        }
    }

    public void onGlobalLayout()
    {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 52
    //                   0 54
    //                   1 210
    //                   2 157
    //                   3 52
    //                   4 52
    //                   5 52
    //                   6 228;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L5
_L1:
        return false;
_L2:
        int i1 = t;
        int j1 = (int)motionevent.getX();
        int k1 = (int)motionevent.getY();
        an = motionevent.getPointerId(0);
        int l1 = c(k1);
        if (i1 != 4 && l1 >= 0)
        {
            p = getChildAt(l1 - B).getTop();
            r = j1;
            s = k1;
            o = l1;
            t = 0;
            C();
        }
        u = 0x80000000;
        if (i1 == 4)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        switch (t)
        {
        case 0: // '\0'
            if (i((int)motionevent.getY(motionevent.findPointerIndex(an)) - s))
            {
                return true;
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        t = -1;
        an = -1;
        a(0);
        continue; /* Loop/switch isn't completed */
_L5:
        a(motionevent);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return false;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        I = true;
        if (flag)
        {
            j1 = getChildCount();
            for (i1 = 0; i1 < j1; i1++)
            {
                getChildAt(i1).forceLayout();
            }

            g.a();
        }
        d();
        I = false;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (e == null)
        {
            A();
        }
        Rect rect = l;
        rect.left = h + getPaddingLeft();
        rect.top = i + getPaddingTop();
        rect.right = j + getPaddingRight();
        rect.bottom = k + getPaddingBottom();
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        super.onRestoreInstanceState(parcelable);
        L = true;
        requestLayout();
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        if (getChildCount() > 0)
        {
            L = true;
            y();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag2;
        flag = true;
        flag2 = false;
        if (isEnabled()) goto _L2; else goto _L1
_L1:
        if (isClickable() || isLongClickable())
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L9:
        return flag;
_L2:
        int i1;
        i1 = motionevent.getAction();
        if (R == null)
        {
            R = VelocityTracker.obtain();
        }
        R.addMovement(motionevent);
        i1 & 0xff;
        JVM INSTR tableswitch 0 6: default 116
    //                   0 118
    //                   1 525
    //                   2 327
    //                   3 1032
    //                   4 116
    //                   5 116
    //                   6 1095;
           goto _L3 _L4 _L5 _L6 _L7 _L3 _L3 _L8
_L3:
        return true;
_L4:
        an = motionevent.getPointerId(0);
        int l2 = (int)motionevent.getX();
        int l3 = (int)motionevent.getY();
        int j1 = a(l2, l3);
        if (!L)
        {
            if (t != 4 && j1 >= 0 && ((ListAdapter)s()).isEnabled(j1))
            {
                t = 0;
                if (ad == null)
                {
                    ad = new c(this);
                }
                postDelayed(ad, ViewConfiguration.getTapTimeout());
            } else
            {
                if (motionevent.getEdgeFlags() != 0 && j1 < 0)
                {
                    return false;
                }
                if (t == 4)
                {
                    B();
                    t = 3;
                    v = 0;
                    j1 = c(l3);
                    a(1);
                }
            }
        }
        if (j1 >= 0)
        {
            p = getChildAt(j1 - B).getTop();
        }
        r = l2;
        s = l3;
        o = j1;
        u = 0x80000000;
        return true;
_L6:
        int i4 = (int)motionevent.getY(motionevent.findPointerIndex(an));
        int k1 = i4 - s;
        switch (t)
        {
        default:
            return true;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            i(k1);
            return true;

        case 3: // '\003'
            break;
        }
        if (i4 != u)
        {
            int i3 = k1 - v;
            boolean flag1;
            if (u != 0x80000000)
            {
                k1 = i4 - u;
            } else
            {
                k1 = i3;
            }
            flag1 = flag2;
            if (k1 != 0)
            {
                flag1 = c(i3, k1);
            }
            if (flag1 && getChildCount() > 0)
            {
                k1 = c(i4);
                if (k1 >= 0)
                {
                    p = getChildAt(k1 - B).getTop();
                }
                s = i4;
                o = k1;
                invalidate();
            }
            u = i4;
            return true;
        }
          goto _L9
_L5:
        t;
        JVM INSTR tableswitch 0 3: default 560
    //                   0 595
    //                   1 595
    //                   2 595
    //                   3 843;
           goto _L10 _L11 _L11 _L11 _L12
_L10:
        setPressed(false);
        invalidate();
        if (R != null)
        {
            R.recycle();
            R = null;
        }
        an = -1;
        return true;
_L11:
        int l1 = o;
        motionevent = getChildAt(l1 - B);
        if (motionevent != null && !motionevent.hasFocusable())
        {
            if (t != 0)
            {
                motionevent.setPressed(false);
            }
            if (ae == null)
            {
                ae = new f(this, null);
            }
            f f1 = ae;
            f1.a = motionevent;
            f1.b = l1;
            f1.a();
            z = l1;
            if (t == 0 || t == 1)
            {
                a = 0;
                if (!L && c.isEnabled(l1))
                {
                    t = 1;
                    d();
                    motionevent.setPressed(true);
                    a(motionevent);
                    setPressed(true);
                    if (e != null)
                    {
                        Drawable drawable = e.getCurrent();
                        if (drawable != null && (drawable instanceof TransitionDrawable))
                        {
                            ((TransitionDrawable)drawable).resetTransition();
                        }
                    }
                    postDelayed(new a(this, motionevent, f1), ViewConfiguration.getPressedStateDuration());
                    return true;
                } else
                {
                    t = -1;
                    return true;
                }
            }
            if (!L && c.isEnabled(l1))
            {
                post(f1);
            }
        }
        t = -1;
          goto _L10
_L12:
        int i2 = getChildCount();
        if (i2 > 0)
        {
            int j3 = p();
            int j4 = q();
            if (B == 0 && j3 >= l.top && i2 + B < M && j4 <= getHeight() - l.bottom)
            {
                t = -1;
                a(0);
            } else
            {
                motionevent = R;
                motionevent.computeCurrentVelocity(1600, am);
                int j2 = (int)motionevent.getYVelocity(an);
                if (Math.abs(j2) > al)
                {
                    if (S == null)
                    {
                        S = new d(this);
                    }
                    a(2);
                    S.a(-j2);
                } else
                {
                    t = -1;
                    a(0);
                }
            }
        } else
        {
            t = -1;
            a(0);
        }
          goto _L10
_L7:
        t = -1;
        setPressed(false);
        motionevent = getChildAt(o - B);
        if (motionevent != null)
        {
            motionevent.setPressed(false);
        }
        C();
        if (R != null)
        {
            R.recycle();
            R = null;
        }
        an = -1;
        return true;
_L8:
        a(motionevent);
        int k3 = r;
        int k2 = s;
        k3 = a(k3, k2);
        if (k3 >= 0)
        {
            p = getChildAt(k3 - B).getTop();
            o = k3;
        }
        u = k2;
        return true;
    }

    public void onTouchModeChanged(boolean flag)
    {
        if (flag && getHeight() > 0 && getChildCount() > 0)
        {
            d();
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        int i1;
        super.onWindowFocusChanged(flag);
        if (isInTouchMode())
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        setChildrenDrawingCacheEnabled(false);
        if (S != null)
        {
            removeCallbacks(S);
            com.jiubang.pla.internal.d.a(S);
            if (getScrollY() != 0)
            {
                scrollTo(getScrollX(), 0);
                invalidate();
            }
        }
_L4:
        aa = i1;
        return;
_L2:
        if (i1 != aa && aa != -1)
        {
            a = 0;
            d();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected int p()
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            return getChildAt(0).getTop();
        }
    }

    protected int q()
    {
        int i1 = getChildCount();
        if (i1 == 0)
        {
            return 0;
        } else
        {
            return getChildAt(i1 - 1).getBottom();
        }
    }

    protected int r()
    {
        int i1 = getChildCount();
        if (i1 == 0)
        {
            return 0;
        } else
        {
            return getChildAt(i1 - 1).getBottom();
        }
    }

    public void requestLayout()
    {
        if (!Q && !I)
        {
            super.requestLayout();
        }
    }

    public boolean showContextMenuForChild(View view)
    {
        boolean flag = false;
        boolean flag1 = false;
        int i1 = b(view);
        if (i1 >= 0)
        {
            long l1 = c.getItemId(i1);
            if (K != null)
            {
                flag1 = K.a(this, view, i1, l1);
            }
            flag = flag1;
            if (!flag1)
            {
                Z = a(getChildAt(i1 - B), i1, l1);
                flag = super.showContextMenuForChild(view);
            }
        }
        return flag;
    }

    public boolean verifyDrawable(Drawable drawable)
    {
        return e == drawable || super.verifyDrawable(drawable);
    }

    private class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public int a;
        public boolean b;
        public boolean c;

        public LayoutParams(int i1, int j1, int k1)
        {
            super(i1, j1);
            a = k1;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }

}
