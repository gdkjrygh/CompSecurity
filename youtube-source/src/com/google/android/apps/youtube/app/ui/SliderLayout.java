// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.l;
import com.google.android.youtube.r;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ft, fu, fs, DefaultSliderSavedState

public class SliderLayout extends ViewGroup
{

    private final int a;
    private boolean b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private final View g[] = new View[2];
    private final CollapseStrategy h[] = new CollapseStrategy[2];
    private final int i[] = new int[2];
    private final int j[] = new int[2];
    private int k;
    private boolean l;
    private boolean m;
    private float n;
    private int o;
    private Scroller p;
    private ft q;
    private boolean r;
    private fu s;
    private TouchInterceptArea t;

    public SliderLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        l = true;
        o = -1;
        a = com.google.android.apps.youtube.core.utils.l.a(context.getResources().getDisplayMetrics(), 40);
        p = new Scroller(context, new DecelerateInterpolator());
        k = 0;
        t = TouchInterceptArea.ALL;
        attributeset = context.obtainStyledAttributes(attributeset, r.C);
        boolean flag;
        if (attributeset.getInteger(2, Orientation.HORIZONTAL.ordinal()) == Orientation.VERTICAL.ordinal())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            context = Orientation.VERTICAL;
        } else
        {
            context = Orientation.HORIZONTAL;
        }
        setOrientation(context);
        a(0, (int)attributeset.getDimension(0, -1F));
        a(1, (int)attributeset.getDimension(1, -1F));
        h[0] = c(attributeset.getInteger(3, CollapseStrategy.DISPLACE.ordinal()));
        h[1] = c(attributeset.getInteger(4, CollapseStrategy.DISPLACE.ordinal()));
        attributeset.recycle();
    }

    private void a(int i1, int j1)
    {
        boolean flag = false;
        int k1 = f();
        i[i1] = j1;
        int ai[] = j;
        if (j1 <= 0)
        {
            j1 = ((flag) ? 1 : 0);
        } else
        {
            j1 = Math.max(k1 - j1, 0);
        }
        ai[1 - i1] = j1;
    }

    private void a(boolean flag)
    {
        if (r != flag && flag)
        {
            b(true);
        }
        r = flag;
        getParent().requestDisallowInterceptTouchEvent(r);
    }

    static boolean a(SliderLayout sliderlayout)
    {
        return sliderlayout.d;
    }

    private void b(int i1, boolean flag)
    {
        if (!p.isFinished())
        {
            p.abortAnimation();
        }
        g(e() * i1);
        if (flag || k != i1)
        {
            k = i1;
            e(i1);
        }
        invalidate();
    }

    private void b(boolean flag)
    {
        boolean flag1 = true;
        if (d(0) == CollapseStrategy.RESIZE || d(1) == CollapseStrategy.RESIZE)
        {
            flag1 = false;
        }
        if (!flag1)
        {
            return;
        } else
        {
            b = flag;
            return;
        }
    }

    private static CollapseStrategy c(int i1)
    {
        if (i1 == CollapseStrategy.RESIZE.ordinal())
        {
            return CollapseStrategy.RESIZE;
        }
        if (i1 == CollapseStrategy.OCCLUDE.ordinal())
        {
            return CollapseStrategy.OCCLUDE;
        } else
        {
            return CollapseStrategy.DISPLACE;
        }
    }

    private CollapseStrategy d(int i1)
    {
        boolean flag;
        if (i1 >= 0 && i1 < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "index must be 0 or 1");
        return h[i1];
    }

    private Orientation d()
    {
        if (d)
        {
            return Orientation.VERTICAL;
        } else
        {
            return Orientation.HORIZONTAL;
        }
    }

    private int e()
    {
        return f() - j[0] - j[1];
    }

    private void e(int i1)
    {
        if (q != null)
        {
            q.a(i1);
        }
    }

    private int f()
    {
        int i1 = getWidth();
        int j1 = getPaddingLeft();
        int k1 = getPaddingRight();
        int l1 = getHeight();
        int i2 = getPaddingTop();
        int j2 = getPaddingBottom();
        if (d)
        {
            return l1 - i2 - j2;
        } else
        {
            return i1 - j1 - k1;
        }
    }

    private void f(int i1)
    {
        i(c + i1);
        if (b)
        {
            i1 = 0;
            while (i1 < 2) 
            {
                if (d(i1) == CollapseStrategy.DISPLACE)
                {
                    int j1 = k * e() - c;
                    if (d() == Orientation.VERTICAL)
                    {
                        g[i1].setTranslationY(j1);
                    } else
                    {
                        g[i1].setTranslationX(j1);
                    }
                }
                i1++;
            }
        } else
        {
            requestLayout();
        }
    }

    private void g()
    {
        int i1 = e();
        if (q != null)
        {
            q.a(c, i1);
        }
    }

    private void g(int i1)
    {
        i(i1);
        requestLayout();
    }

    private void h()
    {
        boolean flag1 = false;
        View view;
        boolean flag;
        byte byte0;
        if (j[0] == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = g[0];
        byte0 = flag1;
        if (c == e())
        {
            byte0 = flag1;
            if (!m)
            {
                byte0 = flag1;
                if (flag)
                {
                    byte0 = 8;
                }
            }
        }
        view.setVisibility(byte0);
    }

    private void h(int i1)
    {
        int j1 = Math.max(0, Math.min(i1, 1));
        o = j1;
        if (l)
        {
            return;
        }
        i1 = Math.abs(j1 - k);
        View view = getFocusedChild();
        if (view != null && i1 != 0 && view == g[k])
        {
            view.clearFocus();
        }
        int k1 = j1 * e() - c;
        j1 = i1 * 200;
        i1 = j1;
        if (j1 == 0)
        {
            i1 = Math.abs(k1);
        }
        if (!p.isFinished())
        {
            p.abortAnimation();
        }
        p.startScroll(c, 0, k1, 0, i1);
        invalidate();
    }

    private void i(int i1)
    {
        c = i1;
        h();
        g();
    }

    public final void a()
    {
        m = false;
        b(k, true);
        h();
    }

    public final void a(float f1)
    {
        boolean flag;
        if (f1 > 0.0F && f1 < 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, "split must be in the range (0,1)");
        n = f1;
        m = true;
        h();
        if (q != null)
        {
            q.v();
        }
    }

    public final void a(int i1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(true, "index must be 0 or 1");
        m = false;
        c = e() - (int)((float)f() * n);
        if (c == e() * 1)
        {
            b(1, false);
            return;
        } else
        {
            k = 0;
            h(1);
            return;
        }
    }

    public final void a(int i1, boolean flag)
    {
        boolean flag1;
        if (i1 >= 0 && i1 < 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag1, "index must be 0 or 1");
        if (m)
        {
            return;
        }
        if (flag)
        {
            h(i1);
            return;
        } else
        {
            b(i1, false);
            return;
        }
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        g[k].addFocusables(arraylist, i1);
        if (i1 == e && k == 1)
        {
            g[0].addFocusables(arraylist, i1);
        } else
        if (i1 == f && k == 0)
        {
            g[1].addFocusables(arraylist, i1);
            return;
        }
    }

    public final boolean b()
    {
        return m;
    }

    public final boolean b(int i1)
    {
        boolean flag;
        if (i1 >= 0 && i1 < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "index must be 0 or 1");
        return k == i1;
    }

    public final boolean c()
    {
        return r || !p.isFinished();
    }

    public void computeScroll()
    {
        if (p.computeScrollOffset())
        {
            g(p.getCurrX());
            postInvalidate();
        } else
        if (o != -1)
        {
            int i1 = Math.max(0, Math.min(o, 1));
            o = -1;
            if (i1 != k)
            {
                k = i1;
                e(k);
                return;
            }
        }
    }

    public boolean dispatchUnhandledMove(View view, int i1)
    {
        if (i1 == e && k == 1)
        {
            h(0);
            return true;
        }
        if (i1 == f && k == 0)
        {
            h(1);
            return true;
        } else
        {
            return super.dispatchUnhandledMove(view, i1);
        }
    }

    public void onFinishInflate()
    {
        boolean flag;
        if (getChildCount() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "SliderLayout must have 2 child views.");
        g[0] = getChildAt(0);
        g[1] = getChildAt(1);
        for (int i1 = 0; i1 < 2; i1++)
        {
            g[i1].setClickable(true);
        }

        if (h[1] == CollapseStrategy.OCCLUDE)
        {
            bringChildToFront(g[0]);
        }
        h();
        g();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag1;
        flag1 = true;
        if (m || !isEnabled())
        {
            return false;
        }
        if (q != null && !q.a(motionevent))
        {
            a(false);
            s.a();
            return false;
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 104
    //                   0 137
    //                   1 329
    //                   2 109
    //                   3 329
    //                   4 104
    //                   5 104
    //                   6 344;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L5
_L1:
        return r;
_L4:
        if (r)
        {
            return true;
        }
        if (s.f(motionevent))
        {
            a(true);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        fs.a[t.ordinal()];
        JVM INSTR tableswitch 1 4: default 180
    //                   1 212
    //                   2 240
    //                   3 268
    //                   4 296;
           goto _L6 _L7 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_296;
_L6:
        boolean flag = true;
_L11:
        if (flag)
        {
            s.b(motionevent);
            if (p.isFinished())
            {
                flag1 = false;
            }
            a(flag1);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (motionevent.getX() <= (float)(getLeft() + a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L11
_L8:
        if (motionevent.getY() <= (float)(getTop() + a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L11
_L9:
        if (motionevent.getX() >= (float)(getRight() - a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L11
        if (motionevent.getY() >= (float)(getBottom() - a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L11
_L3:
        a(false);
        s.a();
        continue; /* Loop/switch isn't completed */
_L5:
        s.e(motionevent);
        if (true) goto _L1; else goto _L12
_L12:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
label0:
        {
            int ai[];
            int ai1[];
            int ai2[];
            int k2;
            int l2;
            if (d() == Orientation.VERTICAL)
            {
                g[0].setTranslationY(0.0F);
                g[1].setTranslationY(0.0F);
            } else
            {
                g[0].setTranslationX(0.0F);
                g[1].setTranslationX(0.0F);
            }
            b(false);
            k2 = j[0];
            l2 = j[1];
            ai = new int[2];
            ai1 = new int[2];
            ai2 = new int[2];
            for (int i2 = 0; i2 < 2; i2++)
            {
                ai[i2] = g[i2].getMeasuredWidth();
                ai1[i2] = g[i2].getMeasuredHeight();
            }

            int j2 = getPaddingLeft();
            int i3 = getPaddingRight();
            j1 = l1 - j1 - getPaddingTop() - getPaddingBottom();
            if (!d)
            {
                j1 = k1 - i1 - j2 - i3;
            }
            if (d)
            {
                i1 = getPaddingTop();
            } else
            {
                i1 = getPaddingLeft();
            }
            if (m)
            {
                ai2[0] = i1;
                if (d)
                {
                    j1 = ai1[0];
                } else
                {
                    j1 = ai[0];
                }
                ai2[1] = j1 + i1;
            } else
            {
                if (h[0] == CollapseStrategy.DISPLACE)
                {
                    ai2[0] = i1 - c;
                } else
                {
                    ai2[0] = i1;
                }
                if (h[1] == CollapseStrategy.OCCLUDE)
                {
                    ai2[1] = i1 + k2;
                } else
                {
                    ai2[1] = (j1 + i1) - l2 - c;
                }
            }
            i1 = 0;
            while (i1 < 2) 
            {
                if (d)
                {
                    g[i1].layout(getPaddingLeft(), ai2[i1], getPaddingLeft() + ai[i1], ai2[i1] + ai1[i1]);
                } else
                {
                    g[i1].layout(ai2[i1], getPaddingTop(), ai2[i1] + ai[i1], getPaddingTop() + ai1[i1]);
                }
                i1++;
            }
            if (l)
            {
                l = false;
                if (o == -1)
                {
                    break label0;
                }
                h(o);
            }
            return;
        }
        g(k * e());
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        android.view.View.MeasureSpec.getMode(i1);
        android.view.View.MeasureSpec.getMode(j1);
        int l1 = j[0];
        int i2 = j[1];
        int k1 = android.view.View.MeasureSpec.getSize(i1) - getPaddingLeft() - getPaddingRight();
        j1 = android.view.View.MeasureSpec.getSize(j1) - getPaddingTop() - getPaddingBottom();
        int ai[];
        if (d)
        {
            i1 = j1;
        } else
        {
            i1 = k1;
        }
        ai = new int[2];
        if (m)
        {
            ai[0] = (int)((float)i1 * n);
            ai[1] = i1 - ai[0];
        } else
        {
            if (h[0] == CollapseStrategy.RESIZE)
            {
                ai[0] = i1 - i2 - c;
            } else
            {
                ai[0] = i1 - i2;
            }
            if (h[1] == CollapseStrategy.RESIZE)
            {
                ai[1] = c + i2;
            } else
            {
                ai[1] = i1 - l1;
            }
        }
        i1 = 0;
        while (i1 < 2) 
        {
            if (d)
            {
                g[i1].measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(ai[i1], 0x40000000));
            } else
            {
                g[i1].measure(android.view.View.MeasureSpec.makeMeasureSpec(ai[i1], 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
            }
            i1++;
        }
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        View view;
        int j1;
        if (o != -1)
        {
            j1 = o;
        } else
        {
            j1 = k;
        }
        view = g[j1];
        if (view != null)
        {
            return view.requestFocus(i1, rect);
        } else
        {
            return false;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (DefaultSliderSavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        k = ((DefaultSliderSavedState) (parcelable)).expandedLayer;
        if (k < 0 || k > 1)
        {
            k = 0;
        }
        b(k, false);
    }

    protected Parcelable onSaveInstanceState()
    {
        DefaultSliderSavedState defaultslidersavedstate = new DefaultSliderSavedState(super.onSaveInstanceState());
        defaultslidersavedstate.expandedLayer = k;
        return defaultslidersavedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        for (int i2 = 0; i2 < 2; i2++)
        {
            a(i2, i[i2]);
        }

        if (d && j1 != l1 || !d && i1 != k1)
        {
            if (o != -1)
            {
                k1 = o;
            } else
            {
                k1 = k;
            }
            b(k1, false);
        }
        measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
        requestLayout();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        s.a(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 60
    //                   0 62
    //                   1 184
    //                   2 89
    //                   3 278
    //                   4 60
    //                   5 60
    //                   6 292;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L6
_L1:
        return true;
_L2:
        if (!p.isFinished())
        {
            p.abortAnimation();
        }
        s.b(motionevent);
        return true;
_L4:
        if (!r) goto _L1; else goto _L7
_L7:
        int i1;
        fu fu1 = s;
        if (fu1.g.d)
        {
            i1 = fu1.d(motionevent);
        } else
        {
            i1 = fu1.c(motionevent);
        }
        if (i1 >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (c <= 0) goto _L1; else goto _L8
_L8:
        f(Math.max(-c, i1));
        return true;
        if (i1 <= 0) goto _L1; else goto _L9
_L9:
        int k1 = e() - c;
        if (k1 > 0)
        {
            f(Math.min(k1, i1));
            return true;
        }
          goto _L1
_L3:
        if (r)
        {
            motionevent = s.g(motionevent);
            if (motionevent == FlingDynamics.Fling.BACK && k == 1)
            {
                h(0);
            } else
            if (motionevent == FlingDynamics.Fling.FORWARD && k == 0)
            {
                h(1);
            } else
            {
                int j1 = e();
                h((c + j1 / 2) / j1);
            }
        }
        a(false);
        s.a();
        return true;
_L5:
        a(false);
        s.a();
        return true;
_L6:
        s.e(motionevent);
        return true;
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        int i1 = indexOfChild(view);
        if (i1 >= 0 && !isInTouchMode())
        {
            h(i1);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        int i1 = indexOfChild(view);
        if (i1 != k || !p.isFinished())
        {
            h(i1);
            return true;
        } else
        {
            return false;
        }
    }

    public void setCollapseStrategy(int i1, CollapseStrategy collapsestrategy)
    {
        boolean flag;
        if (i1 >= 0 && i1 < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "index must be 0 or 1");
        com.google.android.apps.youtube.common.fromguava.c.a(collapsestrategy);
        h[i1] = collapsestrategy;
        if (h[1 - i1] == CollapseStrategy.OCCLUDE && collapsestrategy == CollapseStrategy.OCCLUDE)
        {
            L.c("Both collapse strategies cannot be OCCLUDE");
            h[1 - i1] = CollapseStrategy.DISPLACE;
        }
        g();
        if (!l)
        {
            requestLayout();
        }
    }

    public void setExpandedSize(int i1, int j1)
    {
        boolean flag;
        if (i1 >= 0 && i1 < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "index must be 0 or 1");
        a(i1, j1);
        b(k, false);
    }

    public void setListener(ft ft1)
    {
        q = ft1;
    }

    public void setOrientation(Orientation orientation)
    {
        int i1;
        boolean flag;
        if (orientation == Orientation.VERTICAL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (d)
        {
            i1 = 33;
        } else
        {
            i1 = 17;
        }
        e = i1;
        if (d)
        {
            i1 = 130;
        } else
        {
            i1 = 66;
        }
        f = i1;
        s = new fu(this, getContext());
        if (!l)
        {
            i(0);
            k = 0;
            requestLayout();
        }
    }

    public void setTouchInterceptArea(TouchInterceptArea touchinterceptarea)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(touchinterceptarea);
        t = touchinterceptarea;
    }

    private class CollapseStrategy extends Enum
    {

        private static final CollapseStrategy $VALUES[];
        public static final CollapseStrategy DISPLACE;
        public static final CollapseStrategy OCCLUDE;
        public static final CollapseStrategy RESIZE;

        public static CollapseStrategy valueOf(String s1)
        {
            return (CollapseStrategy)Enum.valueOf(com/google/android/apps/youtube/app/ui/SliderLayout$CollapseStrategy, s1);
        }

        public static CollapseStrategy[] values()
        {
            return (CollapseStrategy[])$VALUES.clone();
        }

        static 
        {
            DISPLACE = new CollapseStrategy("DISPLACE", 0);
            RESIZE = new CollapseStrategy("RESIZE", 1);
            OCCLUDE = new CollapseStrategy("OCCLUDE", 2);
            $VALUES = (new CollapseStrategy[] {
                DISPLACE, RESIZE, OCCLUDE
            });
        }

        private CollapseStrategy(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class TouchInterceptArea extends Enum
    {

        private static final TouchInterceptArea $VALUES[];
        public static final TouchInterceptArea ALL;
        public static final TouchInterceptArea BOTTOM_EDGE;
        public static final TouchInterceptArea LEFT_EDGE;
        public static final TouchInterceptArea RIGHT_EDGE;
        public static final TouchInterceptArea TOP_EDGE;

        public static TouchInterceptArea valueOf(String s1)
        {
            return (TouchInterceptArea)Enum.valueOf(com/google/android/apps/youtube/app/ui/SliderLayout$TouchInterceptArea, s1);
        }

        public static TouchInterceptArea[] values()
        {
            return (TouchInterceptArea[])$VALUES.clone();
        }

        static 
        {
            LEFT_EDGE = new TouchInterceptArea("LEFT_EDGE", 0);
            TOP_EDGE = new TouchInterceptArea("TOP_EDGE", 1);
            RIGHT_EDGE = new TouchInterceptArea("RIGHT_EDGE", 2);
            BOTTOM_EDGE = new TouchInterceptArea("BOTTOM_EDGE", 3);
            ALL = new TouchInterceptArea("ALL", 4);
            $VALUES = (new TouchInterceptArea[] {
                LEFT_EDGE, TOP_EDGE, RIGHT_EDGE, BOTTOM_EDGE, ALL
            });
        }

        private TouchInterceptArea(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class Orientation extends Enum
    {

        private static final Orientation $VALUES[];
        public static final Orientation HORIZONTAL;
        public static final Orientation VERTICAL;

        public static Orientation valueOf(String s1)
        {
            return (Orientation)Enum.valueOf(com/google/android/apps/youtube/app/ui/SliderLayout$Orientation, s1);
        }

        public static Orientation[] values()
        {
            return (Orientation[])$VALUES.clone();
        }

        static 
        {
            HORIZONTAL = new Orientation("HORIZONTAL", 0);
            VERTICAL = new Orientation("VERTICAL", 1);
            $VALUES = (new Orientation[] {
                HORIZONTAL, VERTICAL
            });
        }

        private Orientation(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
