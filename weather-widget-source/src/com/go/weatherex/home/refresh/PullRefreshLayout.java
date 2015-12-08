// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.refresh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;

// Referenced classes of package com.go.weatherex.home.refresh:
//            b, c, d, e, 
//            f, g, h, i, 
//            j, l, a, k

public class PullRefreshLayout extends LinearLayout
{

    private static final int q[] = {
        0x101000e
    };
    private final Runnable A = new j(this);
    private boolean B;
    private boolean C;
    private int D;
    private float E;
    private float F;
    private a a;
    private View b;
    private int c;
    private k d;
    private int e;
    private boolean f;
    private int g;
    private float h;
    private int i;
    private int j;
    private float k;
    private float l;
    private volatile int m;
    private boolean n;
    private boolean o;
    private final DecelerateInterpolator p = new DecelerateInterpolator();
    private int r;
    private final Animation s = new b(this);
    private final Animation t = new c(this);
    private Animation u;
    private final android.view.animation.Animation.AnimationListener v = new e(this);
    private final android.view.animation.Animation.AnimationListener w = new f(this);
    private final android.view.animation.Animation.AnimationListener x = new g(this);
    private final Runnable y = new h(this);
    private final Runnable z = new i(this);

    public PullRefreshLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = false;
        h = -1F;
        k = 0.0F;
        l = 0.0F;
        r = 0;
        u = new d(this);
        D = -1;
        g = ViewConfiguration.get(context).getScaledTouchSlop();
        i = getResources().getInteger(0x10e0001);
        j = getResources().getInteger(0x10e0000);
        r = getResources().getDimensionPixelSize(0x7f0c00ef);
        setWillNotDraw(false);
        a = new l(this);
        context = context.obtainStyledAttributes(attributeset, q);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
    }

    static float a(PullRefreshLayout pullrefreshlayout, float f1)
    {
        pullrefreshlayout.l = f1;
        return f1;
    }

    static int a(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.e;
    }

    private void a(float f1)
    {
        if (f1 == 0.0F)
        {
            l = 0.0F;
            return;
        } else
        {
            f1 = Math.max(0.0F, Math.min(f1, 1.0F));
            l = f1;
            a.a(f1);
            return;
        }
    }

    private void a(int i1)
    {
        int j1 = i1;
        if (i1 < 0)
        {
            j1 = 0;
        }
        b(j1 - m);
    }

    private void a(int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        e = i1;
        s.reset();
        s.setDuration(i);
        s.setAnimationListener(animationlistener);
        s.setInterpolator(p);
        b.startAnimation(s);
    }

    static void a(PullRefreshLayout pullrefreshlayout, int i1)
    {
        pullrefreshlayout.a(i1);
    }

    static void a(PullRefreshLayout pullrefreshlayout, int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        pullrefreshlayout.a(i1, animationlistener);
    }

    private void a(boolean flag, String s1)
    {
label0:
        {
            if (f != flag)
            {
                c();
                l = 0.0F;
                f = flag;
                if (!f)
                {
                    break label0;
                }
                a.a();
                removeCallbacks(z);
                post(z);
            }
            return;
        }
        a.a(s1);
        removeCallbacks(A);
        postDelayed(A, a.b());
    }

    static boolean a(PullRefreshLayout pullrefreshlayout, boolean flag)
    {
        pullrefreshlayout.n = flag;
        return flag;
    }

    static float b(PullRefreshLayout pullrefreshlayout, float f1)
    {
        pullrefreshlayout.k = f1;
        return f1;
    }

    static int b(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.c;
    }

    static int b(PullRefreshLayout pullrefreshlayout, int i1)
    {
        pullrefreshlayout.m = i1;
        return i1;
    }

    private void b(int i1)
    {
        b.offsetTopAndBottom(i1);
        m = b.getTop();
    }

    private void b(int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        e = i1;
        t.reset();
        t.setDuration(j);
        t.setAnimationListener(w);
        t.setInterpolator(p);
        b.startAnimation(t);
    }

    static void b(PullRefreshLayout pullrefreshlayout, int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        pullrefreshlayout.b(i1, animationlistener);
    }

    static boolean b(PullRefreshLayout pullrefreshlayout, boolean flag)
    {
        pullrefreshlayout.o = flag;
        return flag;
    }

    static float c(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.h;
    }

    private void c()
    {
        if (b == null)
        {
            if (getChildCount() > 1 && !isInEditMode())
            {
                throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
            }
            b = getChildAt(0);
            c = b.getTop() + getPaddingTop();
        }
        if (h == -1F && getParent() != null && ((View)getParent()).getHeight() > 0)
        {
            h = (int)Math.min((float)((View)getParent()).getHeight() * 0.6F, a.c());
        }
    }

    static float d(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.k;
    }

    static a e(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.a;
    }

    static Runnable f(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.y;
    }

    static int g(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.m;
    }

    static android.view.animation.Animation.AnimationListener h(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.v;
    }

    static android.view.animation.Animation.AnimationListener i(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.w;
    }

    static float j(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.l;
    }

    static int k(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.j;
    }

    static Animation l(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.u;
    }

    static android.view.animation.Animation.AnimationListener m(PullRefreshLayout pullrefreshlayout)
    {
        return pullrefreshlayout.x;
    }

    public void a()
    {
        a(true, "");
        d.c();
    }

    public void a(k k1)
    {
        d = k1;
    }

    public void a(String s1)
    {
        a.b(s1);
    }

    public boolean a(View view, int i1, int j1)
    {
        while (view == null || i1 < view.getLeft() || i1 >= view.getRight() || j1 < view.getTop() || j1 >= view.getBottom()) 
        {
            return false;
        }
        return true;
    }

    protected boolean a(View view, boolean flag, int i1, int j1, int k1)
    {
        if (view instanceof AbsListView)
        {
            view = (AbsListView)view;
            return view.getChildCount() > 0 && (view.getFirstVisiblePosition() > 0 || view.getChildAt(0).getTop() < view.getPaddingTop());
        }
        if (view instanceof ViewGroup)
        {
            if (view.getScrollY() > 0)
            {
                return true;
            }
            ViewGroup viewgroup = (ViewGroup)view;
            int i2 = viewgroup.getChildCount();
            int l1 = j1 + view.getScrollX();
            k1 += view.getScrollY();
            for (j1 = i2 - 1; j1 >= 0; j1--)
            {
                View view1 = viewgroup.getChildAt(j1);
                if (view1.getVisibility() == 0 && a(view1, l1, k1) && a(view1, true, i1, l1 - view1.getLeft(), k1 - view1.getTop()))
                {
                    return true;
                }
            }

        }
        return flag && ViewCompat.canScrollVertically(view, -i1);
    }

    public void b()
    {
        a(false, "");
    }

    public void draw(Canvas canvas)
    {
        if (a != null)
        {
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), m);
            canvas.drawColor(0x60000000);
            a.a(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.clipRect(0, m, getWidth(), getHeight());
        super.draw(canvas);
        canvas.restore();
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        removeCallbacks(A);
        removeCallbacks(y);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(y);
        removeCallbacks(A);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag1;
        flag1 = false;
        i1 = motionevent.getAction() & 0xff;
        c();
        if (!o) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (B)
        {
            return true;
        }
        flag = flag1;
        if (!isEnabled()) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (n) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (C) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (F < (float)r) goto _L4; else goto _L7
_L7:
        i1;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 133
    //                   1 326
    //                   2 176
    //                   3 326;
           goto _L8 _L9 _L10 _L11 _L10
_L8:
        return B;
_L9:
        E = motionevent.getX();
        F = motionevent.getY();
        D = MotionEventCompat.getPointerId(motionevent, 0);
        l = 0.0F;
        B = false;
        C = false;
        continue; /* Loop/switch isn't completed */
_L11:
        if (D != -1 && !n)
        {
            float f1 = MotionEventCompat.getX(motionevent, 0);
            float f2 = Math.abs(f1 - E);
            float f3 = MotionEventCompat.getY(motionevent, 0);
            float f4 = f3 - F;
            float f5 = Math.abs(f4);
            if (f4 != 0.0F && a(this, false, (int)f4, (int)f1, (int)f3))
            {
                C = true;
                return false;
            }
            if (f4 > (float)g && f5 > f2)
            {
                B = true;
                requestDisallowInterceptTouchEvent(true);
                if (d != null)
                {
                    d.d();
                }
            } else
            if (f2 > (float)g)
            {
                C = true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L10:
        B = false;
        C = false;
        D = -1;
        if (true) goto _L8; else goto _L12
_L12:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (getChildCount() == 0)
        {
            return;
        } else
        {
            i1 = getMeasuredWidth();
            j1 = getMeasuredHeight();
            View view = getChildAt(0);
            k1 = getPaddingLeft();
            l1 = m + getPaddingTop();
            view.layout(k1, l1, (i1 - getPaddingLeft() - getPaddingRight()) + k1, (j1 - getPaddingTop() - getPaddingBottom()) + l1);
            return;
        }
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        i1 = getChildCount();
        if (i1 > 1 && !isInEditMode())
        {
            throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
        }
        if (i1 > 0)
        {
            getChildAt(0).measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled() || n)
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 52
    //                   0 52
    //                   1 101
    //                   2 54
    //                   3 101;
           goto _L1 _L1 _L2 _L3 _L2
_L1:
        return true;
_L3:
        if (!o && B)
        {
            float f1 = (motionevent.getY() - F) / 3F;
            a((int)f1);
            a(f1 / h);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        B = false;
        C = false;
        clearAnimation();
        removeCallbacks(y);
        removeCallbacks(z);
        if (o)
        {
            D = -1;
            post(y);
        } else
        if (f)
        {
            if (o)
            {
                post(A);
            } else
            {
                post(z);
            }
        } else
        if ((float)b.getTop() > h)
        {
            a();
        } else
        {
            post(A);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
    }

}
