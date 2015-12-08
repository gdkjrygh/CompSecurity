// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.a;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.core.utils.l;
import com.google.android.youtube.g;
import com.google.android.youtube.h;
import com.google.android.youtube.r;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ix, iy, iw, iv

public class WatchWhileLayout extends ViewGroup
{

    private DragMode A;
    private final Scroller B;
    private final Scroller C;
    private final ix D;
    private final DecelerateInterpolator E = new DecelerateInterpolator();
    private iw F;
    private final Paint G = new Paint();
    private final Drawable H;
    private final Drawable I;
    private final int J;
    private Rect K;
    private Rect L;
    private boolean M;
    private boolean N;
    private final iy O = new iy(this, (byte)0);
    private final Analytics P;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private View g;
    private View h;
    private View i;
    private View j;
    private LinkedList k;
    private int l;
    private int m;
    private final int n;
    private final int o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private final LayoutMode t;
    private WatchState u;
    private final Rect v = new Rect();
    private final Rect w = new Rect();
    private final Rect x = new Rect();
    private float y;
    private boolean z;

    public WatchWhileLayout(Context context, AttributeSet attributeset)
    {
        boolean flag1 = true;
        super(context, attributeset);
        Resources resources = context.getResources();
        N = false;
        u = WatchState.DISMISSED;
        B = new Scroller(context, new DecelerateInterpolator());
        C = new Scroller(context, new DecelerateInterpolator());
        D = new ix(this, context);
        A = DragMode.NONE;
        n = (int)resources.getDimension(g.ai);
        o = (int)resources.getDimension(g.ah);
        G.setStyle(android.graphics.Paint.Style.FILL);
        BaseApplication baseapplication = (BaseApplication)((Activity)context).getApplication();
        P = baseapplication.D();
        boolean flag;
        if (com.google.android.apps.youtube.core.utils.l.a(baseapplication.y().au()))
        {
            H = resources.getDrawable(h.ak);
        } else
        {
            H = null;
        }
        I = resources.getDrawable(h.al);
        J = (int)resources.getDimension(g.aj);
        K = new Rect();
        attributeset = context.obtainStyledAttributes(attributeset, r.K);
        a = attributeset.getResourceId(0, 0);
        b = attributeset.getResourceId(2, 0);
        c = attributeset.getResourceId(3, 0);
        d = attributeset.getResourceId(4, 0);
        if (attributeset.getBoolean(5, false))
        {
            context = LayoutMode.TABLET;
        } else
        {
            context = LayoutMode.PHONE;
        }
        t = context;
        e = (int)attributeset.getDimension(6, 240F);
        f = (int)attributeset.getDimension(7, 12F);
        attributeset.recycle();
        if (a != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "playerViewId must be specified");
        if (b != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "metadataViewId must be specified");
        if (j())
        {
            if (c != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.a(flag, "metadataLandscapeTitleViewId must be specified");
        }
    }

    private static int a(float f1, int i1, int j1)
    {
        return Math.round(Math.min(Math.max(f1, 0.0F), 1.0F) * (float)(j1 - i1)) + i1;
    }

    private int a(int i1, int j1, int k1, boolean flag)
    {
        i1 = Math.abs(i1);
        if (i1 == j1)
        {
            return k1;
        }
        j1 = a((float)i1 / (float)j1, 0, k1);
        i1 = j1;
        if (flag)
        {
            i1 = (int)((float)j1 * 0.75F);
        }
        return Math.max(i1, 50);
    }

    static WatchState a(WatchWhileLayout watchwhilelayout)
    {
        return watchwhilelayout.u;
    }

    private void a(int i1, int j1)
    {
        int i3 = getPaddingLeft();
        int j3 = getPaddingTop();
        int l2 = i1 - i3 - getPaddingRight();
        int j2 = j1 - j3 - getPaddingBottom();
        int k1 = (int)((float)e / 1.777F);
        int i2;
        int k2;
        if (i())
        {
            if (j())
            {
                if (com.google.android.apps.youtube.core.utils.l.b(getContext()))
                {
                    i2 = Math.round(0.7F * (float)l2);
                } else
                {
                    i2 = Math.round(0.65F * (float)l2);
                }
                k2 = (int)((float)i2 / 1.777F);
                a(v, i3, j3, i2, k2);
                i2 = k2;
            } else
            {
                a(v, i3, j3, l2, j2);
                i2 = j2;
            }
        } else
        {
            i2 = (int)((float)l2 / 1.777F);
            k1 = (int)((float)e / 1.777F);
            a(v, i3, j3, l2, i2);
        }
        a(w, l2 - f - e, j1 - getPaddingBottom() - f - k1, e, k1);
        i3 = (v.left + v.right) / 2;
        k2 = (v.top + v.bottom) / 2;
        j3 = (w.left + w.right) / 2;
        l2 = (w.top + w.bottom) / 2;
        i3 = j3 - i3;
        k2 = l2 - k2;
        if (k2 > i3 * 2)
        {
            D.a(0.0F);
            r = j2 - f - (k1 + i2) / 2;
        } else
        {
            D.a((float)Math.atan2(k2, k2));
            r = (int)Math.sqrt(i3 * i3 + k2 * k2);
        }
        if (B.isFinished()) goto _L2; else goto _L1
_L1:
        l = (int)(y * (float)r);
        if (B.getFinalY() <= 0)
        {
            a(false, false);
        } else
        {
            b(false, false);
        }
_L4:
        L = null;
        c(false);
        k();
        measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
        return;
_L2:
        if (!C.isFinished())
        {
            WatchState watchstate;
            if (p)
            {
                watchstate = WatchState.DISMISSED;
            } else
            {
                watchstate = WatchState.MINIMIZED;
            }
            a(watchstate);
        } else
        if (u != WatchState.DISMISSED)
        {
            int l1;
            if (u == WatchState.MINIMIZED)
            {
                l1 = r;
            } else
            {
                l1 = 0;
            }
            l = l1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void a(Rect rect, int i1, int j1, int k1, int l1)
    {
        rect.set(i1, j1, i1 + k1, j1 + l1);
    }

    private static void a(View view, float f1)
    {
        if (view != null)
        {
            view.setAlpha(f1);
        }
    }

    private void a(WatchState watchstate)
    {
        if (u != watchstate)
        {
            u = watchstate;
            if (u == WatchState.DISMISSED && z)
            {
                z = false;
            }
            if (h())
            {
                int i1;
                if (u == WatchState.MAXIMIZED)
                {
                    i1 = 0;
                } else
                {
                    i1 = r;
                }
                a(i1);
            }
            o();
            if (F != null)
            {
                F.a(u);
            }
        }
        m = 0;
        if (F != null)
        {
            F.E();
        }
        setHorizontalDisplacement(0);
        c(false);
        k();
    }

    private void a(boolean flag)
    {
        if (z || u != WatchState.MINIMIZED)
        {
            return;
        }
        int i1 = Math.abs(m);
        if (i1 == 0)
        {
            a(WatchState.MINIMIZED);
            return;
        } else
        {
            i1 = a(i1, Math.max(n, i1), 250, flag);
            o();
            C.startScroll(m, 0, -m, 0, i1);
            invalidate();
            return;
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        if (z || u == WatchState.DISMISSED)
        {
            return;
        }
        int i1 = 0 - l;
        if (i1 == 0)
        {
            a(WatchState.MAXIMIZED);
            return;
        }
        if (flag1 && u != WatchState.MAXIMIZED)
        {
            P.a("PlayerMaximizeManual", "Swipe");
        }
        int j1 = a(i1, r, q(), flag);
        o();
        c(true);
        B.startScroll(0, l, 0, i1, j1);
        invalidate();
    }

    private boolean a(int i1)
    {
        while (!h() || l == i1) 
        {
            return false;
        }
        l = i1;
        m = 0;
        p();
        k();
        if (F != null)
        {
            iw iw1 = F;
            i1 = x.left;
            getPaddingLeft();
            iw1.a(x.top - getPaddingTop(), y);
        }
        return true;
    }

    static int b(WatchWhileLayout watchwhilelayout)
    {
        return watchwhilelayout.l;
    }

    private void b(boolean flag)
    {
        WatchState watchstate = r();
        switch (com.google.android.apps.youtube.app.ui.iv.a[watchstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a(WatchState.DISMISSED);
            return;

        case 2: // '\002'
            b(false, flag);
            return;

        case 3: // '\003'
            a(false, flag);
            break;
        }
    }

    private void b(boolean flag, boolean flag1)
    {
        if (z || u == WatchState.DISMISSED)
        {
            return;
        }
        int i1 = r - l;
        if (i1 == 0)
        {
            a(WatchState.MINIMIZED);
            return;
        }
        if (flag1 && u != WatchState.MINIMIZED)
        {
            P.a("PlayerMinimizeManual", "Swipe");
        }
        int j1 = a(i1, r, q(), flag);
        o();
        c(true);
        B.startScroll(0, l, 0, i1, j1);
        invalidate();
    }

    private boolean b(int i1)
    {
        while (!h() || m == i1) 
        {
            return false;
        }
        m = i1;
        k();
        if (F != null)
        {
            iw iw1 = F;
            i1 = x.left;
            getPaddingLeft();
            iw1.a(x.top - getPaddingTop(), y);
        }
        return true;
    }

    static int c(WatchWhileLayout watchwhilelayout)
    {
        return watchwhilelayout.r;
    }

    private void c(boolean flag)
    {
        int i1 = 0;
        if (N && M != flag)
        {
            M = flag;
            byte byte0;
            int j1;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            for (j1 = getChildCount(); i1 < j1; i1++)
            {
                View view = getChildAt(i1);
                if (view != g)
                {
                    view.setLayerType(byte0, null);
                }
            }

        }
    }

    private void c(boolean flag, boolean flag1)
    {
        if (z || u != WatchState.MINIMIZED)
        {
            return;
        }
        if (flag1)
        {
            P.a("PlayerDismissManual", "Swipe");
        }
        char c1 = '\372';
        if (flag)
        {
            c1 = '\273';
        }
        o();
        p = true;
        q = m;
        Scroller scroller = C;
        int j1 = m;
        int i1;
        if (m < 0)
        {
            i1 = -o;
        } else
        {
            i1 = o;
        }
        scroller.startScroll(j1, 0, i1, 0, c1);
        invalidate();
    }

    static iw d(WatchWhileLayout watchwhilelayout)
    {
        return watchwhilelayout.F;
    }

    private boolean h()
    {
        return !z && u != WatchState.DISMISSED;
    }

    private boolean i()
    {
        return getResources().getConfiguration().orientation == 2;
    }

    private boolean j()
    {
        return t == LayoutMode.TABLET;
    }

    private void k()
    {
        if (u == WatchState.DISMISSED)
        {
            return;
        }
        if (l > 0) goto _L2; else goto _L1
_L1:
        y = 0.0F;
        x.set(v);
_L10:
        requestLayout();
        invalidate();
        return;
_L2:
        if (l >= r) goto _L4; else goto _L3
_L3:
        y = (float)l / (float)r;
        x.set(a(y, v.left, w.left), a(y, v.top, w.top), a(y, v.right, w.right), a(y, v.bottom, w.bottom));
          goto _L5
_L4:
        y = 1.0F;
        x.set(w);
        if (m == 0) goto _L7; else goto _L6
_L6:
        int i1 = Math.abs(m);
        if (!p) goto _L9; else goto _L8
_L8:
        i1 -= Math.abs(q);
        if (i1 >= o)
        {
            y = 3F;
        } else
        {
            y = (float)i1 / (float)o + 2.0F;
        }
_L7:
        i1 = s + f;
        if (i1 <= w.left)
        {
            i1 = 0;
        } else
        {
            i1 -= w.left;
        }
        i1 += m;
        x.left = w.left + i1;
        x.right = i1 + w.right;
_L5:
        if (true) goto _L10; else goto _L9
_L9:
        if (i1 >= n)
        {
            y = 2.0F;
        } else
        {
            y = (float)i1 / (float)n + 1.0F;
        }
          goto _L7
    }

    private void l()
    {
        byte byte0;
        boolean flag;
        flag = false;
        byte0 = 8;
        if (!z) goto _L2; else goto _L1
_L1:
        byte byte1;
        g.setVisibility(0);
        h.setVisibility(8);
        if (i != null)
        {
            i.setVisibility(8);
        }
        byte1 = byte0;
        if (j != null)
        {
            j.setVisibility(8);
            byte1 = byte0;
        }
_L4:
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((View)iterator.next()).setVisibility(byte1)) { }
        break; /* Loop/switch isn't completed */
_L2:
        if (u != WatchState.DISMISSED)
        {
            boolean flag1 = j();
            boolean flag2 = i();
            byte byte2;
            byte byte3;
            if (!flag1 && flag2)
            {
                byte1 = 1;
            } else
            {
                byte1 = 0;
            }
            if (flag1 && flag2)
            {
                byte2 = 1;
            } else
            {
                byte2 = 0;
            }
            if (l < r)
            {
                if (byte1 == 0)
                {
                    float f1;
                    int i1;
                    int j1;
                    int k1;
                    int l1;
                    if (byte2 != 0)
                    {
                        byte1 = 0;
                    } else
                    {
                        byte1 = 8;
                    }
                    if (y > 0.1F)
                    {
                        f1 = 1.1F - y;
                    } else
                    {
                        f1 = 1.0F;
                    }
                    a(h, f1);
                    a(i, f1);
                    byte2 = 0;
                } else
                {
                    byte1 = 8;
                    byte2 = 8;
                }
                if (l > 0)
                {
                    if (j != null)
                    {
                        f1 = E.getInterpolation(1.0F - y);
                        a(j, f1 * 0.9F);
                    }
                    byte3 = 0;
                } else
                {
                    byte3 = 8;
                }
                N = true;
            } else
            {
                byte3 = 8;
                byte1 = 8;
                byte2 = 8;
            }
            i1 = byte1;
            j1 = ((flag) ? 1 : 0);
            k1 = byte2;
            l1 = byte3;
            if (l > 0)
            {
                byte0 = 0;
                l1 = byte3;
                k1 = byte2;
                j1 = ((flag) ? 1 : 0);
                i1 = byte1;
            }
        } else
        {
            invalidate(K);
            L = null;
            l1 = 8;
            i1 = 8;
            k1 = 8;
            byte0 = 0;
            j1 = 8;
        }
        g.setVisibility(j1);
        h.setVisibility(k1);
        if (i != null)
        {
            i.setVisibility(i1);
        }
        byte1 = byte0;
        if (j != null)
        {
            j.setVisibility(l1);
            byte1 = byte0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean m()
    {
        return A != DragMode.NONE;
    }

    private void n()
    {
        if (m())
        {
            A = DragMode.NONE;
            getParent().requestDisallowInterceptTouchEvent(false);
            iw iw1;
            if (F != null)
            {
                iw1 = F;
            }
        }
    }

    private void o()
    {
        if (!B.isFinished())
        {
            B.abortAnimation();
        }
        p();
    }

    private void p()
    {
        if (!C.isFinished())
        {
            C.abortAnimation();
        }
        p = false;
    }

    private int q()
    {
        return !j() ? 350 : 400;
    }

    private WatchState r()
    {
        if (!z)
        {
            if (p)
            {
                return WatchState.DISMISSED;
            }
            if (m != 0)
            {
                if (Math.abs(m) >= n)
                {
                    return WatchState.DISMISSED;
                } else
                {
                    return WatchState.MINIMIZED;
                }
            }
            if (l >= r / 2)
            {
                return WatchState.MINIMIZED;
            }
        }
        return WatchState.MAXIMIZED;
    }

    public final void a()
    {
        a(WatchState.MAXIMIZED);
    }

    public final void b()
    {
        a(WatchState.MINIMIZED);
    }

    public final WatchState c()
    {
        return u;
    }

    public void computeScroll()
    {
        if (!z) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!B.computeScrollOffset()) goto _L4; else goto _L3
_L3:
        a(B.getCurrY());
        if (!B.isFinished()) goto _L6; else goto _L5
_L5:
        if (l > 0) goto _L8; else goto _L7
_L7:
        a(WatchState.MAXIMIZED);
_L6:
        invalidate();
        return;
_L8:
        if (l >= r)
        {
            a(WatchState.MINIMIZED);
        }
        if (true) goto _L6; else goto _L4
_L4:
        if (C.computeScrollOffset())
        {
            b(C.getCurrX());
            if (C.isFinished())
            {
                if (p)
                {
                    a(WatchState.DISMISSED);
                } else
                {
                    a(WatchState.MINIMIZED);
                }
            }
            invalidate();
            return;
        }
        if (!m())
        {
            if (l != 0 && l != r)
            {
                b(false);
                return;
            }
            if (m != 0)
            {
                a(r());
                return;
            }
        }
        if (true) goto _L1; else goto _L9
_L9:
    }

    public final void d()
    {
        if (!z && u == WatchState.MINIMIZED)
        {
            c(false, false);
            return;
        } else
        {
            a(WatchState.DISMISSED);
            return;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        if (view == g)
        {
            boolean flag = super.drawChild(canvas, view, l1);
            if (!z && u != WatchState.DISMISSED && l > 0)
            {
                I.draw(canvas);
                if (H != null)
                {
                    H.draw(canvas);
                }
            }
            return flag;
        } else
        {
            return super.drawChild(canvas, view, l1);
        }
    }

    public final boolean e()
    {
        return h() && (m() || !B.isFinished() || !C.isFinished());
    }

    public final void f()
    {
        a(false, false);
    }

    public final void g()
    {
        b(false, false);
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        a(getWidth(), getHeight());
    }

    public void onFinishInflate()
    {
        boolean flag1 = true;
        int j1 = getChildCount();
        boolean flag2 = j();
        int i1;
        boolean flag;
        if (flag2)
        {
            i1 = 4;
        } else
        {
            i1 = 3;
        }
        if (j1 >= i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, (new StringBuilder("WatchWhileLayout must have at least ")).append(i1).append(" children").toString());
        k = new LinkedList();
        i1 = 0;
        while (i1 < j1) 
        {
            View view = getChildAt(i1);
            int k1 = view.getId();
            if (g == null && a == k1)
            {
                g = view;
            } else
            if (h == null && b == k1)
            {
                h = view;
            } else
            if (i == null && c == k1)
            {
                i = view;
            } else
            if (j == null && d > 0 && d == k1)
            {
                j = view;
            } else
            {
                k.add(view);
            }
            i1++;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(g);
        com.google.android.apps.youtube.common.fromguava.c.a(h);
        if (flag2)
        {
            com.google.android.apps.youtube.common.fromguava.c.a(i);
        }
        if (k.size() > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "contentViews cannot be empty");
        g.setOnClickListener(O);
        g.setOnLongClickListener(O);
        if (j != null)
        {
            bringChildToFront(j);
        }
        if (i != null)
        {
            bringChildToFront(i);
        }
        bringChildToFront(h);
        bringChildToFront(g);
        l();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        if (h() && isEnabled()) goto _L2; else goto _L1
_L1:
        flag = false;
_L9:
        return flag;
_L2:
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 72
    //                   0 150
    //                   1 200
    //                   2 77
    //                   3 200
    //                   4 72
    //                   5 72
    //                   6 214;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L3 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_214;
_L10:
        return m();
_L6:
        if (m()) goto _L9; else goto _L8
_L8:
        motionevent = D.f(motionevent);
        if (motionevent != DragMode.NONE && A != motionevent)
        {
            com.google.android.apps.youtube.app.ui.iy.a(O);
            c(true);
            A = motionevent;
            getParent().requestDisallowInterceptTouchEvent(true);
            if (F != null)
            {
                motionevent = F;
            }
        }
          goto _L10
_L4:
        if (!x.contains((int)motionevent.getX(), (int)motionevent.getY())) goto _L10; else goto _L11
_L11:
        D.b(motionevent);
        if (B.isFinished() || C.isFinished())
        {
            return false;
        }
          goto _L9
_L5:
        n();
        D.a();
          goto _L10
        D.e(motionevent);
          goto _L10
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        l();
        if (!z) goto _L2; else goto _L1
_L1:
        g.layout(i1, j1, k1, l1);
_L4:
        return;
_L2:
        g.layout(x.left, x.top, x.right, x.bottom);
        if (L != null)
        {
            L.set(K);
        }
        float f1;
        if (l <= 0)
        {
            K.set(x);
        } else
        {
            K.set(x.left - J, x.top - J, x.right + J, x.bottom + J);
        }
        if (L != null)
        {
            L.union(K);
        } else
        {
            L = new Rect(K);
        }
        f1 = 0.0F;
        if (y < 1.0F)
        {
            f1 = y;
        } else
        if (y < 2.0F)
        {
            f1 = 2.0F - y;
        }
        if (H != null)
        {
            H.setBounds(x);
            H.setAlpha(ah.a(f1));
        }
        I.setBounds(K);
        I.setAlpha(ah.a(f1));
        invalidate(L.left, L.top, L.right, L.bottom);
        if (M)
        {
            j1 = getWidth();
            i1 = getHeight();
            flag = i();
            if (flag && j())
            {
                k1 = x.right;
                j1 = a(y, 0, j1 - v.right) + k1;
                k1 = v.width();
                l1 = x.bottom;
                i1 = a(y, 0, (i1 - v.bottom) + i.getMeasuredHeight() * 2);
                h.setTranslationX(j1 - h.getLeft());
                i.setTranslationX(j1 - k1 - i.getLeft());
                i.setTranslationY((i1 + l1) - i.getTop());
                return;
            }
            if (flag)
            {
                i1 -= getPaddingBottom();
            } else
            {
                i1 = x.bottom + a(y, 0, f + w.height());
                h.setTranslationY(i1 - h.getTop());
            }
            if (j != null)
            {
                i1 = Math.min(i1 - j.getMeasuredHeight(), 0);
                j.setTranslationY(i1);
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        h.setTranslationX(0.0F);
        h.setTranslationY(0.0F);
        if (i != null)
        {
            i.setTranslationX(0.0F);
            i.setTranslationY(0.0F);
        }
        if (j != null)
        {
            j.setTranslationX(0.0F);
            j.setTranslationY(0.0F);
        }
        i1 = k1 - i1;
        j1 = l1 - j1;
        k1 = getPaddingLeft();
        l1 = getPaddingTop();
        flag = i();
        if (!flag || !j())
        {
            break; /* Loop/switch isn't completed */
        }
        int i2 = x.right + a(y, 0, i1 - v.right);
        int k2 = i2 - v.width();
        int l2 = x.bottom + a(y, 0, (j1 - v.bottom) + i.getMeasuredHeight() * 2);
        h.layout(i2, l1, h.getMeasuredWidth() + i2, h.getMeasuredHeight() + l1);
        i.layout(k2, l2, i.getMeasuredWidth() + k2, i.getMeasuredHeight() + l2);
        if (j != null)
        {
            j.layout(0, 0, i1, j1);
        }
_L5:
        Iterator iterator = k.iterator();
        while (iterator.hasNext()) 
        {
            View view = (View)iterator.next();
            view.layout(k1, l1, view.getMeasuredWidth() + k1, view.getMeasuredHeight() + l1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            getPaddingBottom();
        } else
        {
            int j2 = x.bottom + a(y, 0, f + w.height());
            h.layout(k1, j2, h.getMeasuredWidth() + k1, h.getMeasuredHeight() + j2);
        }
        if (j != null)
        {
            j.layout(0, 0, i1, j1);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        super.onMeasure(i1, j1);
        if (android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
        {
            throw new IllegalStateException("WatchWhileLayout can only be used in EXACTLY mode.");
        }
        if (android.view.View.MeasureSpec.getMode(j1) != 0x40000000)
        {
            throw new IllegalStateException("WatchWhileLayout can only be used in EXACTLY mode.");
        }
        k1 = android.view.View.MeasureSpec.getSize(i1);
        l1 = android.view.View.MeasureSpec.getSize(j1);
        if (!z) goto _L2; else goto _L1
_L1:
        g.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
_L4:
        return;
_L2:
        k1 -= getPaddingLeft() + getPaddingRight();
        l1 -= getPaddingTop() + getPaddingBottom();
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000);
        g.measure(android.view.View.MeasureSpec.makeMeasureSpec(x.width(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(x.height(), 0x40000000));
        if (!M)
        {
            Iterator iterator;
            if (i())
            {
                if (j())
                {
                    h.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 - v.width(), 0x40000000), j2);
                    i.measure(android.view.View.MeasureSpec.makeMeasureSpec(v.width(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1 - v.height(), 0x40000000));
                }
            } else
            {
                h.measure(i2, android.view.View.MeasureSpec.makeMeasureSpec(l1 - v.height(), 0x40000000));
            }
            if (j != null)
            {
                j.measure(i1, j1);
            }
            iterator = k.iterator();
            while (iterator.hasNext()) 
            {
                ((View)iterator.next()).measure(i2, j2);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        if (z || u == WatchState.MAXIMIZED)
        {
            return g.requestFocus(i1, rect);
        } else
        {
            return ((View)k.get(0)).requestFocus(i1, rect);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            a(((SavedState) (parcelable)).watchState);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        WatchState watchstate;
        if (h())
        {
            watchstate = r();
        } else
        {
            watchstate = u;
        }
        savedstate.watchState = watchstate;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        a(i1, j1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag4 = false;
        flag5 = false;
        flag3 = false;
        D.a(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 68
    //                   0 70
    //                   1 177
    //                   2 84
    //                   3 503
    //                   4 68
    //                   5 68
    //                   6 516;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L6
_L1:
        return true;
_L2:
        o();
        D.b(motionevent);
        return true;
_L4:
        if (m())
        {
            if (A == DragMode.DISMISS)
            {
                int i1 = -D.c(motionevent);
                if (u == WatchState.MINIMIZED)
                {
                    b(i1 + m);
                    return true;
                }
            } else
            {
                ix ix1 = D;
                a(Math.min(Math.max(-ix1.a(ix1.c(motionevent), ix1.d(motionevent)) + l, 0), r));
                return true;
            }
        }
          goto _L1
_L3:
        if (A != DragMode.DISMISS) goto _L8; else goto _L7
_L7:
        boolean flag;
        boolean flag1;
        boolean flag2;
        motionevent = D.a(motionevent, FlingDynamics.Orientation.HORIZONTAL, true);
        if (motionevent == FlingDynamics.Fling.FORWARD)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (motionevent == FlingDynamics.Fling.BACK)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (motionevent == FlingDynamics.Fling.NONE)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (m >= -n) goto _L10; else goto _L9
_L9:
        if (!flag1) goto _L12; else goto _L11
_L11:
        flag3 = true;
_L15:
        a(flag3);
_L13:
        n();
        D.a();
        return true;
_L12:
        flag3 = flag4;
        if (!flag2)
        {
            flag3 = true;
        }
        c(flag3, true);
          goto _L13
_L10:
        if (m > n)
        {
            if (flag)
            {
                flag3 = true;
                continue; /* Loop/switch isn't completed */
            }
            flag3 = flag5;
            if (!flag2)
            {
                flag3 = true;
            }
            c(flag3, true);
        } else
        if (m < -20 && flag)
        {
            c(true, true);
        } else
        if (m > 20 && flag1)
        {
            c(true, true);
        } else
        {
            if (!flag2)
            {
                flag3 = true;
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L13
_L8:
        if (A == DragMode.MIN_MAX)
        {
            motionevent = D.a(motionevent, FlingDynamics.Orientation.VERTICAL, true);
            if (motionevent == FlingDynamics.Fling.BACK && u == WatchState.MAXIMIZED)
            {
                b(true, true);
            } else
            if (motionevent == FlingDynamics.Fling.FORWARD && u == WatchState.MINIMIZED && l < r)
            {
                a(true, true);
            } else
            {
                b(true);
            }
        }
          goto _L13
_L5:
        n();
        D.a();
        return true;
_L6:
        D.e(motionevent);
        return true;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        D.a();
    }

    public void setFullscreen(boolean flag)
    {
        if (u != WatchState.DISMISSED && z != flag)
        {
            z = flag;
            a(WatchState.MAXIMIZED);
            o();
            c(false);
            requestLayout();
        }
    }

    public void setHorizontalDisplacement(int i1)
    {
        if (s != i1)
        {
            boolean flag;
            if (s > w.left || i1 > w.left)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s = i1;
            if (flag)
            {
                k();
            }
        }
    }

    public void setListener(iw iw1)
    {
        F = iw1;
    }

    private class WatchState extends Enum
    {

        private static final WatchState $VALUES[];
        public static final WatchState DISMISSED;
        public static final WatchState MAXIMIZED;
        public static final WatchState MINIMIZED;
        public final int intValue;

        public static WatchState valueOf(String s1)
        {
            return (WatchState)Enum.valueOf(com/google/android/apps/youtube/app/ui/WatchWhileLayout$WatchState, s1);
        }

        public static WatchState[] values()
        {
            return (WatchState[])$VALUES.clone();
        }

        static 
        {
            DISMISSED = new WatchState("DISMISSED", 0, 0);
            MAXIMIZED = new WatchState("MAXIMIZED", 1, 1);
            MINIMIZED = new WatchState("MINIMIZED", 2, 2);
            $VALUES = (new WatchState[] {
                DISMISSED, MAXIMIZED, MINIMIZED
            });
        }

        private WatchState(String s1, int i1, int j1)
        {
            super(s1, i1);
            intValue = j1;
        }
    }


    private class DragMode extends Enum
    {

        private static final DragMode $VALUES[];
        public static final DragMode DISMISS;
        public static final DragMode MIN_MAX;
        public static final DragMode NONE;

        public static DragMode valueOf(String s1)
        {
            return (DragMode)Enum.valueOf(com/google/android/apps/youtube/app/ui/WatchWhileLayout$DragMode, s1);
        }

        public static DragMode[] values()
        {
            return (DragMode[])$VALUES.clone();
        }

        static 
        {
            NONE = new DragMode("NONE", 0);
            MIN_MAX = new DragMode("MIN_MAX", 1);
            DISMISS = new DragMode("DISMISS", 2);
            $VALUES = (new DragMode[] {
                NONE, MIN_MAX, DISMISS
            });
        }

        private DragMode(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class LayoutMode extends Enum
    {

        private static final LayoutMode $VALUES[];
        public static final LayoutMode PHONE;
        public static final LayoutMode TABLET;

        public static LayoutMode valueOf(String s1)
        {
            return (LayoutMode)Enum.valueOf(com/google/android/apps/youtube/app/ui/WatchWhileLayout$LayoutMode, s1);
        }

        public static LayoutMode[] values()
        {
            return (LayoutMode[])$VALUES.clone();
        }

        static 
        {
            TABLET = new LayoutMode("TABLET", 0);
            PHONE = new LayoutMode("PHONE", 1);
            $VALUES = (new LayoutMode[] {
                TABLET, PHONE
            });
        }

        private LayoutMode(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new iz();
        private WatchState watchState;

        private static WatchState getWatchState(int i1)
        {
            WatchState awatchstate[] = WatchState.values();
            int k1 = awatchstate.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                WatchState watchstate = awatchstate[j1];
                if (watchstate.intValue == i1)
                {
                    return watchstate;
                }
            }

            return WatchState.DISMISSED;
        }

        public final void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(watchState.intValue);
        }




/*
        static WatchState access$202(SavedState savedstate, WatchState watchstate)
        {
            savedstate.watchState = watchstate;
            return watchstate;
        }

*/

        private SavedState(Parcel parcel)
        {
            super(parcel);
            watchState = getWatchState(parcel.readInt());
        }

        SavedState(Parcel parcel, iv iv1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
