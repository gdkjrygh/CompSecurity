// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.gtp.a.a.b.c;

// Referenced classes of package com.go.weatherex.sidebar:
//            j, n, k, l, 
//            a

public class SidebarDrawerLayout extends ViewGroup
{

    private static final int a[] = {
        0x10100b3
    };
    private boolean A;
    private final l B;
    private int b;
    private int c;
    private float d;
    private Paint e;
    private final ViewDragHelper f;
    private final ViewDragHelper g;
    private final n h;
    private final n i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private l q;
    private float r;
    private float s;
    private Drawable t;
    private Drawable u;
    private CharSequence v;
    private CharSequence w;
    private boolean x;
    private a y;
    private Rect z;

    public SidebarDrawerLayout(Context context)
    {
        this(context, null);
    }

    public SidebarDrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SidebarDrawerLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = 0x99000000;
        e = new Paint();
        l = true;
        x = false;
        z = null;
        A = false;
        B = new j(this);
        float f1 = getResources().getDisplayMetrics().density;
        b = (int)(64F * f1 + 0.5F);
        f1 *= 400F;
        h = new n(this, 3);
        i = new n(this, 5);
        f = ViewDragHelper.create(this, 1.0F, h);
        f.setEdgeTrackingEnabled(1);
        f.setMinVelocity(f1);
        h.a(f);
        g = ViewDragHelper.create(this, 1.0F, i);
        g.setEdgeTrackingEnabled(2);
        g.setMinVelocity(f1);
        i.a(g);
        setFocusableInTouchMode(true);
        ViewCompat.setAccessibilityDelegate(this, new k(this));
        ViewGroupCompat.setMotionEventSplittingEnabled(this, false);
    }

    static View a(SidebarDrawerLayout sidebardrawerlayout)
    {
        return sidebardrawerlayout.g();
    }

    private boolean a(MotionEvent motionevent)
    {
        com.gtp.a.a.b.c.a("SidebarDrawerLayout", (new StringBuilder()).append("shouldIgnoreTouchEvent: ").append(motionevent.getX()).append("--").append(motionevent.getY()).toString());
        if (z == null)
        {
            return false;
        } else
        {
            com.gtp.a.a.b.c.a("SidebarDrawerLayout", (new StringBuilder()).append("shouldIgnoreTouchEvent: ").append(z.toShortString()).toString());
            return z.contains((int)motionevent.getX(), (int)motionevent.getY());
        }
    }

    static boolean a(SidebarDrawerLayout sidebardrawerlayout, boolean flag)
    {
        sidebardrawerlayout.A = flag;
        return flag;
    }

    static a b(SidebarDrawerLayout sidebardrawerlayout)
    {
        return sidebardrawerlayout.y;
    }

    static boolean c(SidebarDrawerLayout sidebardrawerlayout)
    {
        return sidebardrawerlayout.A;
    }

    static int[] d()
    {
        return a;
    }

    static String e(int i1)
    {
        if ((i1 & 3) == 3)
        {
            return "LEFT";
        }
        if ((i1 & 5) == 5)
        {
            return "RIGHT";
        } else
        {
            return Integer.toHexString(i1);
        }
    }

    private boolean e()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((LayoutParams)getChildAt(i1).getLayoutParams()).c)
            {
                return true;
            }
        }

        return false;
    }

    private boolean f()
    {
        return g() != null;
    }

    private View g()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (g(view) && k(view))
            {
                return view;
            }
        }

        return null;
    }

    private static boolean l(View view)
    {
        boolean flag1 = false;
        view = view.getBackground();
        boolean flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view.getOpacity() == -1)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int a(View view)
    {
        int i1 = e(view);
        if (i1 == 3)
        {
            return m;
        }
        if (i1 == 5)
        {
            return n;
        } else
        {
            return 0;
        }
    }

    View a()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (((LayoutParams)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    public void a(int i1)
    {
        c = i1;
        invalidate();
    }

    public void a(int i1, int j1)
    {
        a(getResources().getDrawable(i1), j1);
    }

    void a(int i1, int j1, View view)
    {
        LayoutParams layoutparams;
        boolean flag = true;
        int k1 = f.getViewDragState();
        int l1 = g.getViewDragState();
        i1 = ((flag) ? 1 : 0);
        if (k1 != 1)
        {
            if (l1 == 1)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            if (k1 == 2 || l1 == 2)
            {
                i1 = 2;
            } else
            {
                i1 = 0;
            }
        }
        if (view == null || j1 != 0) goto _L2; else goto _L1
_L1:
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.b != 0.0F) goto _L4; else goto _L3
_L3:
        b(view);
_L2:
        if (i1 != j)
        {
            j = i1;
            if (q != null)
            {
                q.a(i1);
            }
        }
        return;
_L4:
        if (layoutparams.b == 1.0F)
        {
            c(view);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void a(Rect rect)
    {
        z = rect;
    }

    public void a(Drawable drawable, int i1)
    {
        i1 = GravityCompat.getAbsoluteGravity(i1, ViewCompat.getLayoutDirection(this));
        if ((i1 & 3) == 3)
        {
            t = drawable;
            invalidate();
        }
        if ((i1 & 5) == 5)
        {
            u = drawable;
            invalidate();
        }
    }

    void a(View view, float f1)
    {
        if (q != null)
        {
            q.a(view, f1);
        }
    }

    public void a(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("why null of onSidebarChangeListener?");
        } else
        {
            y = a1;
            a(B);
            return;
        }
    }

    public void a(l l1)
    {
        q = l1;
    }

    void a(boolean flag)
    {
        int k1 = getChildCount();
        int i1 = 0;
        boolean flag1 = false;
        while (i1 < k1) 
        {
            View view = getChildAt(i1);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            int j1 = ((flag1) ? 1 : 0);
            if (g(view))
            {
                if (flag && !layoutparams.c)
                {
                    j1 = ((flag1) ? 1 : 0);
                } else
                {
                    j1 = view.getWidth();
                    if (a(view, 3))
                    {
                        flag1 |= f.smoothSlideViewTo(view, -j1, view.getTop());
                    } else
                    {
                        flag1 |= g.smoothSlideViewTo(view, getWidth(), view.getTop());
                    }
                    layoutparams.c = false;
                    j1 = ((flag1) ? 1 : 0);
                }
            }
            i1++;
            flag1 = j1;
        }
        h.a();
        i.a();
        if (flag1)
        {
            invalidate();
        }
    }

    boolean a(View view, int i1)
    {
        return (e(view) & i1) == i1;
    }

    public int b(int i1)
    {
        i1 = GravityCompat.getAbsoluteGravity(i1, ViewCompat.getLayoutDirection(this));
        if (i1 == 3)
        {
            return m;
        }
        if (i1 == 5)
        {
            return n;
        } else
        {
            return 0;
        }
    }

    public void b()
    {
        a(false);
    }

    public void b(int i1, int j1)
    {
        j1 = GravityCompat.getAbsoluteGravity(j1, ViewCompat.getLayoutDirection(this));
        if (j1 == 3)
        {
            m = i1;
        } else
        if (j1 == 5)
        {
            n = i1;
        }
        if (i1 != 0)
        {
            ViewDragHelper viewdraghelper;
            if (j1 == 3)
            {
                viewdraghelper = f;
            } else
            {
                viewdraghelper = g;
            }
            viewdraghelper.cancel();
        }
        i1;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        View view;
        return;
_L3:
        if ((view = d(j1)) != null)
        {
            h(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = d(j1)) != null)
        {
            i(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void b(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.d)
        {
            layoutparams.d = false;
            if (q != null)
            {
                q.b(view);
            }
            if (hasWindowFocus())
            {
                view = getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
    }

    void b(View view, float f1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f1 == layoutparams.b)
        {
            return;
        } else
        {
            layoutparams.b = f1;
            a(view, f1);
            return;
        }
    }

    public void b(boolean flag)
    {
        x = flag;
    }

    public CharSequence c(int i1)
    {
        i1 = GravityCompat.getAbsoluteGravity(i1, ViewCompat.getLayoutDirection(this));
        if (i1 == 3)
        {
            return v;
        }
        if (i1 == 5)
        {
            return w;
        } else
        {
            return null;
        }
    }

    void c()
    {
        int i1 = 0;
        if (!p)
        {
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            for (int j1 = getChildCount(); i1 < j1; i1++)
            {
                getChildAt(i1).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            p = true;
        }
    }

    void c(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.d)
        {
            layoutparams.d = true;
            if (q != null)
            {
                q.a(view);
            }
            sendAccessibilityEvent(32);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        int j1 = getChildCount();
        float f1 = 0.0F;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 = Math.max(f1, ((LayoutParams)getChildAt(i1).getLayoutParams()).b);
        }

        d = f1;
        if (f.continueSettling(true) | g.continueSettling(true))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    float d(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).b;
    }

    View d(int i1)
    {
        int j1 = GravityCompat.getAbsoluteGravity(i1, ViewCompat.getLayoutDirection(this));
        int k1 = getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = getChildAt(i1);
            if ((e(view) & 7) == (j1 & 7))
            {
                return view;
            }
        }

        return null;
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        int j1;
        int k1;
        int i3;
        int j3;
        boolean flag;
        boolean flag1;
        flag = false;
        j3 = getHeight();
        flag1 = f(view);
        j1 = 0;
        k1 = 0;
        i1 = getWidth();
        i3 = canvas.save();
        if (!flag1) goto _L2; else goto _L1
_L1:
        int i2;
        int k3;
        k3 = getChildCount();
        i2 = 0;
_L4:
        if (i2 >= k3)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        View view1 = getChildAt(i2);
        if (view1 == view || view1.getVisibility() != 0 || !l(view1) || !g(view1))
        {
            break; /* Loop/switch isn't completed */
        }
        int k2;
        if (view1.getHeight() < j3)
        {
            k2 = k1;
            j1 = i1;
        } else
        {
label0:
            {
                if (!a(view1, 3))
                {
                    break label0;
                }
                j1 = view1.getRight();
                float f1;
                int j2;
                int l2;
                if (j1 <= k1)
                {
                    j1 = k1;
                }
                k2 = j1;
                j1 = i1;
            }
        }
_L5:
        i2++;
        i1 = j1;
        k1 = k2;
        if (true) goto _L4; else goto _L3
        l2 = view1.getLeft();
        j1 = l2;
        k2 = k1;
        if (l2 < i1) goto _L5; else goto _L3
_L3:
        j1 = i1;
        k2 = k1;
          goto _L5
        if (!x)
        {
            canvas.clipRect(k1, 0, i1, getHeight());
        }
        flag = super.drawChild(canvas, view, l1);
_L11:
        canvas.restoreToCount(i3);
        if (d <= 0.0F || !flag1) goto _L7; else goto _L6
_L6:
        j1 = (int)((float)((c & 0xff000000) >>> 24) * d);
        j2 = c;
        e.setColor(j1 << 24 | j2 & 0xffffff);
        canvas.drawRect(k1, 0.0F, i1, getHeight(), e);
_L9:
        return flag;
_L2:
        if (x)
        {
            if (g(view))
            {
                canvas.translate(-view.getLeft(), 0.0F);
                flag = super.drawChild(canvas, view, l1);
            }
            k1 = j1;
        } else
        {
            flag = super.drawChild(canvas, view, l1);
            k1 = j1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (t != null && a(view, 3))
        {
            i1 = t.getIntrinsicWidth();
            j1 = view.getRight();
            k1 = f.getEdgeSize();
            f1 = Math.max(0.0F, Math.min((float)j1 / (float)k1, 1.0F));
            t.setBounds(j1, view.getTop(), i1 + j1, view.getBottom());
            t.setAlpha((int)(255F * f1));
            t.draw(canvas);
            return flag;
        }
        if (u == null || !a(view, 5)) goto _L9; else goto _L8
_L8:
        i1 = u.getIntrinsicWidth();
        j1 = view.getLeft();
        k1 = getWidth();
        j2 = g.getEdgeSize();
        f1 = Math.max(0.0F, Math.min((float)(k1 - j1) / (float)j2, 1.0F));
        u.setBounds(j1 - i1, view.getTop(), j1, view.getBottom());
        u.setAlpha((int)(255F * f1));
        u.draw(canvas);
        return flag;
        if (true) goto _L11; else goto _L10
_L10:
    }

    int e(View view)
    {
        return GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).a, ViewCompat.getLayoutDirection(this));
    }

    public void f(int i1)
    {
        View view = d(i1);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with gravity ").append(e(i1)).toString());
        } else
        {
            h(view);
            return;
        }
    }

    boolean f(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).a == 0;
    }

    public void g(int i1)
    {
        View view = d(i1);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with gravity ").append(e(i1)).toString());
        } else
        {
            i(view);
            return;
        }
    }

    boolean g(View view)
    {
        return (GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).a, ViewCompat.getLayoutDirection(view)) & 7) != 0;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public void h(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (l)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.b = 1.0F;
            view.d = true;
        } else
        if (a(view, 3))
        {
            f.smoothSlideViewTo(view, 0, view.getTop());
        } else
        {
            g.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean h(int i1)
    {
        View view = d(i1);
        if (view != null)
        {
            return j(view);
        } else
        {
            return false;
        }
    }

    public void i(int i1)
    {
        b = i1;
        requestLayout();
    }

    public void i(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (l)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            f.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
        } else
        {
            g.smoothSlideViewTo(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean j(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).d;
        }
    }

    public boolean k(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        }
        return ((LayoutParams)view.getLayoutParams()).b > 0.0F;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        l = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        l = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (!a(motionevent)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = MotionEventCompat.getActionMasked(motionevent);
        boolean flag2;
        boolean flag3;
        flag2 = f.shouldInterceptTouchEvent(motionevent);
        flag3 = g.shouldInterceptTouchEvent(motionevent);
        boolean flag1 = flag2 | flag3;
_L7:
        i1;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 124
    //                   1 218
    //                   2 187
    //                   3 218;
           goto _L3 _L4 _L5 _L6 _L5
_L3:
        boolean flag = false;
_L8:
        if (flag1 || flag || e() || p)
        {
            return true;
        }
          goto _L1
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        if (com.gtp.a.a.b.c.a())
        {
            indexoutofboundsexception.printStackTrace();
        }
        flag1 = false;
          goto _L7
_L4:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        r = f1;
        s = f2;
        if (d > 0.0F && f(f.findTopChildUnder((int)f1, (int)f2)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = false;
        p = false;
          goto _L8
_L6:
        if (!f.checkTouchSlop(3)) goto _L3; else goto _L9
_L9:
        h.a();
        i.a();
        flag = false;
          goto _L8
_L5:
        a(true);
        o = false;
        p = false;
          goto _L3
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && f())
        {
            KeyEventCompat.startTracking(keyevent);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            keyevent = g();
            if (keyevent != null && a(keyevent) == 0)
            {
                b();
            }
            return keyevent != null;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int k2;
        int l2;
        k = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        LayoutParams layoutparams;
label0:
        {
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!f(view))
            {
                break label0;
            }
            view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
        }
          goto _L3
        int i2;
        int i3;
        int j3;
        i3 = view.getMeasuredWidth();
        j3 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (a(view, 3))
        {
            i1 = -i3;
            i2 = (int)((float)i3 * layoutparams.b) + i1;
            f1 = (float)(i3 + i2) / (float)i3;
        } else
        {
            i2 = k2 - (int)((float)i3 * layoutparams.b);
            f1 = (float)(k2 - i2) / (float)i3;
        }
        if (f1 != layoutparams.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams.a & 0x70;
        JVM INSTR lookupswitch 2: default 216
    //                   16: 360
    //                   80: 320;
           goto _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_360;
_L4:
        view.layout(i2, layoutparams.topMargin, i3 + i2, j3 + layoutparams.topMargin);
_L7:
        if (flag1)
        {
            b(view, f1);
        }
        int j2;
        int k3;
        if (layoutparams.b > 0.0F)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        if (view.getVisibility() != i1)
        {
            view.setVisibility(i1);
        }
          goto _L3
_L6:
        i1 = l1 - j1;
        view.layout(i2, i1 - layoutparams.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - layoutparams.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        j2 = (k3 - j3) / 2;
        if (j2 < layoutparams.topMargin)
        {
            i1 = layoutparams.topMargin;
        } else
        {
            i1 = j2;
            if (j2 + j3 > k3 - layoutparams.bottomMargin)
            {
                i1 = k3 - layoutparams.bottomMargin - j3;
            }
        }
        view.layout(i2, i1, i3 + i2, j3 + i1);
          goto _L7
        k = false;
        l = false;
        return;
          goto _L3
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1;
        int i2;
        int j2;
        int k2;
        int i3;
        i2 = 300;
        i3 = android.view.View.MeasureSpec.getMode(i1);
        k2 = android.view.View.MeasureSpec.getMode(j1);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        j2 = android.view.View.MeasureSpec.getSize(j1);
        if (i3 != 0x40000000) goto _L2; else goto _L1
_L1:
        int k1 = l1;
        if (k2 == 0x40000000) goto _L3; else goto _L2
_L2:
        if (!isInEditMode()) goto _L5; else goto _L4
_L4:
        if (i3 != 0x80000000) goto _L7; else goto _L6
_L6:
        k1 = l1;
_L11:
        if (k2 == 0x80000000)
        {
            l1 = j2;
            i2 = k1;
            break MISSING_BLOCK_LABEL_84;
        }
        l1 = i2;
        i2 = k1;
          goto _L8
_L7:
        k1 = l1;
        if (i3 == 0)
        {
            k1 = 300;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (k2 == 0) goto _L9; else goto _L3
_L3:
        l1 = j2;
        i2 = k1;
          goto _L9
_L5:
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
_L9:
        setMeasuredDimension(i2, l1);
        j2 = getChildCount();
        k1 = 0;
        while (k1 < j2) 
        {
            View view = getChildAt(k1);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (f(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
                } else
                if (g(view))
                {
                    int l2 = e(view) & 7;
                    if ((0 & l2) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Child drawer has absolute gravity ").append(e(l2)).append(" but this ").append("SidebarDrawerLayout").append(" already has a ").append("drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i1, b + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j1, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder()).append("Child ").append(view).append(" at index ").append(k1).append(" does not have a valid layout_gravity - must be Gravity.LEFT, ").append("Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            k1++;
        }
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != 0)
        {
            View view = d(((SavedState) (parcelable)).a);
            if (view != null)
            {
                h(view);
            }
        }
        b(((SavedState) (parcelable)).b, 3);
        b(((SavedState) (parcelable)).c, 5);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate;
        int i1;
        int j1;
        savedstate = new SavedState(super.onSaveInstanceState());
        j1 = getChildCount();
        i1 = 0;
_L2:
        Object obj;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = getChildAt(i1);
        if (g(((View) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!((LayoutParams) (obj = (LayoutParams)((View) (obj)).getLayoutParams())).d) goto _L4; else goto _L3
_L3:
        savedstate.a = ((LayoutParams) (obj)).a;
        savedstate.b = m;
        savedstate.c = n;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a(motionevent))
        {
            return false;
        }
        try
        {
            f.processTouchEvent(motionevent);
            g.processTouchEvent(motionevent);
        }
        catch (Exception exception)
        {
            if (com.gtp.a.a.b.c.a())
            {
                exception.printStackTrace();
            }
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 82
    //                   1 115
    //                   2 64
    //                   3 230;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        r = f1;
        s = f3;
        o = false;
        p = false;
          goto _L1
_L3:
        boolean flag;
        float f4 = motionevent.getX();
        float f2 = motionevent.getY();
        motionevent = f.findTopChildUnder((int)f4, (int)f2);
        if (motionevent == null || !f(motionevent))
        {
            break MISSING_BLOCK_LABEL_248;
        }
        f4 -= r;
        f2 -= s;
        int i1 = f.getTouchSlop();
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1))
        {
            break MISSING_BLOCK_LABEL_248;
        }
        motionevent = a();
        if (motionevent == null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        if (a(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L5:
        a(flag);
        o = false;
          goto _L1
_L4:
        a(true);
        o = false;
        p = false;
          goto _L1
        flag = true;
          goto _L5
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        o = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!k)
        {
            super.requestLayout();
        }
    }


    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public LayoutParams(int i1, int j1)
        {
            super(i1, j1);
            a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, SidebarDrawerLayout.d());
            a = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
            a = layoutparams.a;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new m();
        int a;
        int b;
        int c;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = 0;
            b = 0;
            c = 0;
            a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
            a = 0;
            b = 0;
            c = 0;
        }
    }

}
