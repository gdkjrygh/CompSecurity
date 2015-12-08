// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.jiubang.playsdk.i;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Referenced classes of package com.jiubang.playsdk.views:
//            d, h, b, c, 
//            e, g, a, f, 
//            i

public class HorizontalListView extends AdapterView
{

    private boolean A;
    private boolean B;
    private android.view.View.OnClickListener C;
    private DataSetObserver D;
    private Runnable E;
    protected Scroller a;
    protected ListAdapter b;
    protected int c;
    protected int d;
    private final d e = new d(this, null);
    private GestureDetector f;
    private int g;
    private List h;
    private boolean i;
    private Rect j;
    private View k;
    private int l;
    private Drawable m;
    private Integer n;
    private int o;
    private int p;
    private int q;
    private int r;
    private com.jiubang.playsdk.views.i s;
    private int t;
    private boolean u;
    private g v;
    private h w;
    private EdgeEffectCompat x;
    private EdgeEffectCompat y;
    private int z;

    public HorizontalListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Scroller(getContext());
        h = new ArrayList();
        i = false;
        j = new Rect();
        k = null;
        l = 0;
        m = null;
        n = null;
        o = 0x7fffffff;
        s = null;
        t = 0;
        u = false;
        v = null;
        w = h.a;
        A = false;
        B = false;
        D = new b(this);
        E = new c(this);
        x = new EdgeEffectCompat(context);
        y = new EdgeEffectCompat(context);
        f = new GestureDetector(context, e);
        b();
        c();
        a(context, attributeset);
        setWillNotDraw(false);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            com.jiubang.playsdk.views.e.a(a, 0.009F);
        }
    }

    static int a(HorizontalListView horizontallistview, int i1, int j1)
    {
        return horizontallistview.c(i1, j1);
    }

    static GestureDetector a(HorizontalListView horizontallistview)
    {
        return horizontallistview.f;
    }

    private void a(int i1, int j1)
    {
        while (i1 + j1 + l < getWidth() && q + 1 < b.getCount()) 
        {
            q = q + 1;
            if (p < 0)
            {
                p = q;
            }
            View view = b.getView(q, c(q), this);
            a(view, -1);
            int k1;
            if (q == 0)
            {
                k1 = 0;
            } else
            {
                k1 = l;
            }
            i1 += k1 + view.getMeasuredWidth();
            m();
        }
    }

    private void a(int i1, View view)
    {
        i1 = b.getItemViewType(i1);
        if (d(i1))
        {
            ((Queue)h.get(i1)).offer(view);
        }
    }

    private void a(Context context, AttributeSet attributeset)
    {
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, i.b);
            attributeset = context.getDrawable(i.c);
            if (attributeset != null)
            {
                a(((Drawable) (attributeset)));
            }
            int i1 = context.getDimensionPixelSize(i.d, 0);
            if (i1 != 0)
            {
                a(i1);
            }
            context.recycle();
        }
    }

    private void a(Canvas canvas)
    {
        if (x != null && !x.isFinished() && n())
        {
            int i1 = canvas.save();
            int k1 = getHeight();
            canvas.rotate(-90F, 0.0F, 0.0F);
            canvas.translate(-k1 + getPaddingBottom(), 0.0F);
            x.setSize(i(), j());
            if (x.draw(canvas))
            {
                invalidate();
            }
            canvas.restoreToCount(i1);
        } else
        if (y != null && !y.isFinished() && n())
        {
            int j1 = canvas.save();
            int l1 = getWidth();
            canvas.rotate(90F, 0.0F, 0.0F);
            canvas.translate(getPaddingTop(), -l1);
            y.setSize(i(), j());
            if (y.draw(canvas))
            {
                invalidate();
            }
            canvas.restoreToCount(j1);
            return;
        }
    }

    private void a(Canvas canvas, Rect rect)
    {
        if (m != null)
        {
            m.setBounds(rect);
            m.draw(canvas);
        }
    }

    private void a(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = b(view);
        int j1 = ViewGroup.getChildMeasureSpec(z, getPaddingTop() + getPaddingBottom(), layoutparams.height);
        int i1;
        if (layoutparams.width > 0)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(i1, j1);
    }

    private void a(View view, int i1)
    {
        addViewInLayout(view, i1, b(view), true);
        a(view);
    }

    static void a(HorizontalListView horizontallistview, int i1)
    {
        horizontallistview.j(i1);
    }

    static void a(HorizontalListView horizontallistview, h h1)
    {
        horizontallistview.a(h1);
    }

    static void a(HorizontalListView horizontallistview, Boolean boolean1)
    {
        horizontallistview.a(boolean1);
    }

    private void a(h h1)
    {
        if (w != h1 && v != null)
        {
            v.a(h1);
        }
        w = h1;
    }

    private void a(Boolean boolean1)
    {
        if (B == boolean1.booleanValue()) goto _L2; else goto _L1
_L1:
        Object obj = this;
_L7:
        if (!(((View) (obj)).getParent() instanceof View)) goto _L2; else goto _L3
_L3:
        if (!(((View) (obj)).getParent() instanceof ListView) && !(((View) (obj)).getParent() instanceof ScrollView)) goto _L5; else goto _L4
_L4:
        ((View) (obj)).getParent().requestDisallowInterceptTouchEvent(boolean1.booleanValue());
        B = boolean1.booleanValue();
_L2:
        return;
_L5:
        obj = (View)((View) (obj)).getParent();
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean a(HorizontalListView horizontallistview, boolean flag)
    {
        horizontallistview.i = flag;
        return flag;
    }

    private android.view.ViewGroup.LayoutParams b(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        view = layoutparams;
        if (layoutparams == null)
        {
            view = new android.view.ViewGroup.LayoutParams(-2, -1);
        }
        return view;
    }

    private void b()
    {
        setOnTouchListener(new a(this));
    }

    private void b(int i1)
    {
        h.clear();
        for (int j1 = 0; j1 < i1; j1++)
        {
            h.add(new LinkedList());
        }

    }

    private void b(int i1, int j1)
    {
        while ((i1 + j1) - l > 0 && p >= 1) 
        {
            p = p - 1;
            View view = b.getView(p, c(p), this);
            a(view, 0);
            int k1;
            int l1;
            if (p == 0)
            {
                k1 = view.getMeasuredWidth();
            } else
            {
                k1 = l + view.getMeasuredWidth();
            }
            k1 = i1 - k1;
            l1 = g;
            if (k1 + j1 == 0)
            {
                i1 = view.getMeasuredWidth();
            } else
            {
                i1 = l + view.getMeasuredWidth();
            }
            g = l1 - i1;
            i1 = k1;
        }
    }

    private void b(Canvas canvas)
    {
        int j1 = getChildCount();
        Rect rect = j;
        j.top = getPaddingTop();
        j.bottom = j.top + i();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (i1 == j1 - 1 && i(q))
            {
                continue;
            }
            View view = getChildAt(i1);
            rect.left = view.getRight();
            rect.right = view.getRight() + l;
            if (rect.left < getPaddingLeft())
            {
                rect.left = getPaddingLeft();
            }
            if (rect.right > getWidth() - getPaddingRight())
            {
                rect.right = getWidth() - getPaddingRight();
            }
            a(canvas, rect);
            if (i1 == 0 && view.getLeft() > getPaddingLeft())
            {
                rect.left = getPaddingLeft();
                rect.right = view.getLeft();
                a(canvas, rect);
            }
        }

    }

    static void b(HorizontalListView horizontallistview)
    {
        horizontallistview.k();
    }

    static boolean b(HorizontalListView horizontallistview, boolean flag)
    {
        horizontallistview.u = flag;
        return flag;
    }

    private int c(int i1, int j1)
    {
        int l1 = getChildCount();
        for (int k1 = 0; k1 < l1; k1++)
        {
            getChildAt(k1).getHitRect(j);
            if (j.contains(i1, j1))
            {
                return k1;
            }
        }

        return -1;
    }

    private View c(int i1)
    {
        i1 = b.getItemViewType(i1);
        if (d(i1))
        {
            return (View)((Queue)h.get(i1)).poll();
        } else
        {
            return null;
        }
    }

    private void c()
    {
        p = -1;
        q = -1;
        g = 0;
        c = 0;
        d = 0;
        o = 0x7fffffff;
        a(h.a);
    }

    static void c(HorizontalListView horizontallistview)
    {
        horizontallistview.d();
    }

    private void d()
    {
        c();
        removeAllViewsInLayout();
        requestLayout();
    }

    private boolean d(int i1)
    {
        return i1 < h.size();
    }

    static boolean d(HorizontalListView horizontallistview)
    {
        return horizontallistview.A;
    }

    private float e()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return com.jiubang.playsdk.views.f.a(a);
        } else
        {
            return 30F;
        }
    }

    static int e(HorizontalListView horizontallistview)
    {
        return horizontallistview.p;
    }

    private void e(int i1)
    {
        boolean flag = false;
        View view = h();
        int j1;
        if (view != null)
        {
            j1 = view.getRight();
        } else
        {
            j1 = 0;
        }
        a(j1, i1);
        view = g();
        j1 = ((flag) ? 1 : 0);
        if (view != null)
        {
            j1 = view.getLeft();
        }
        b(j1, i1);
    }

    static android.view.View.OnClickListener f(HorizontalListView horizontallistview)
    {
        return horizontallistview.C;
    }

    private void f(int i1)
    {
        View view = g();
        while (view != null && view.getRight() + i1 <= 0) 
        {
            int k1 = g;
            int j1;
            if (i(p))
            {
                j1 = view.getMeasuredWidth();
            } else
            {
                j1 = l + view.getMeasuredWidth();
            }
            g = j1 + k1;
            a(p, view);
            removeViewInLayout(view);
            p = p + 1;
            view = g();
        }
        for (View view1 = h(); view1 != null && view1.getLeft() + i1 >= getWidth(); view1 = h())
        {
            a(q, view1);
            removeViewInLayout(view1);
            q = q - 1;
        }

    }

    private boolean f()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i(q))
        {
            View view = h();
            flag = flag1;
            if (view != null)
            {
                int i1 = o;
                int j1 = c;
                o = ((view.getRight() - getPaddingLeft()) + j1) - j();
                if (o < 0)
                {
                    o = 0;
                }
                flag = flag1;
                if (o != i1)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private View g()
    {
        return getChildAt(0);
    }

    private void g(int i1)
    {
        int k1 = getChildCount();
        if (k1 > 0)
        {
            g = g + i1;
            int j1 = g;
            for (i1 = 0; i1 < k1; i1++)
            {
                View view = getChildAt(i1);
                int l1 = getPaddingLeft() + j1;
                int i2 = getPaddingTop();
                view.layout(l1, i2, view.getMeasuredWidth() + l1, view.getMeasuredHeight() + i2);
                j1 += view.getMeasuredWidth() + l;
            }

        }
    }

    private View h()
    {
        return getChildAt(getChildCount() - 1);
    }

    private View h(int i1)
    {
        if (i1 >= p && i1 <= q)
        {
            getChildAt(i1 - p);
        }
        return null;
    }

    private int i()
    {
        return getHeight() - getPaddingTop() - getPaddingBottom();
    }

    private boolean i(int i1)
    {
        return i1 == b.getCount() - 1;
    }

    private int j()
    {
        return getWidth() - getPaddingLeft() - getPaddingRight();
    }

    private void j(int i1)
    {
        if (x != null && y != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1;
        j1 = c + i1;
        if (a == null || a.isFinished())
        {
            if (j1 >= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            i1 = Math.abs(i1);
            x.onPull((float)i1 / (float)j());
            if (!y.isFinished())
            {
                y.onRelease();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (j1 <= o) goto _L1; else goto _L3
_L3:
        i1 = Math.abs(i1);
        y.onPull((float)i1 / (float)j());
        if (!x.isFinished())
        {
            x.onRelease();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void k()
    {
        if (k != null)
        {
            k.setPressed(false);
            refreshDrawableState();
            k = null;
        }
    }

    private void l()
    {
        if (x != null)
        {
            x.onRelease();
        }
        if (y != null)
        {
            y.onRelease();
        }
    }

    private void m()
    {
        if (s != null && b != null && b.getCount() - (q + 1) < t && !u)
        {
            u = true;
            s.a();
        }
    }

    private boolean n()
    {
        while (b == null || b.isEmpty() || o <= 0) 
        {
            return false;
        }
        return true;
    }

    public ListAdapter a()
    {
        return b;
    }

    public void a(int i1)
    {
        l = i1;
        requestLayout();
        invalidate();
    }

    public void a(Drawable drawable)
    {
        m = drawable;
        if (drawable != null)
        {
            a(drawable.getIntrinsicWidth());
            return;
        } else
        {
            a(0);
            return;
        }
    }

    public void a(ListAdapter listadapter)
    {
        if (b != null)
        {
            b.unregisterDataSetObserver(D);
        }
        if (listadapter != null)
        {
            u = false;
            b = listadapter;
            b.registerDataSetObserver(D);
        }
        b(b.getViewTypeCount());
        d();
    }

    protected boolean a(MotionEvent motionevent)
    {
        boolean flag;
        if (!a.isFinished())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        A = flag;
        a.forceFinished(true);
        a(h.a);
        k();
        if (!A)
        {
            int i1 = c((int)motionevent.getX(), (int)motionevent.getY());
            if (i1 >= 0)
            {
                k = getChildAt(i1);
                if (k != null)
                {
                    k.setPressed(true);
                    refreshDrawableState();
                }
            }
        }
        return true;
    }

    protected boolean a(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        a.fling(d, 0, (int)(-f1), 0, 0, o, 0, 0);
        a(h.c);
        requestLayout();
        return true;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        a(canvas);
    }

    protected void dispatchSetPressed(boolean flag)
    {
    }

    public Adapter getAdapter()
    {
        return a();
    }

    protected float getLeftFadingEdgeStrength()
    {
        int i1 = getHorizontalFadingEdgeLength();
        if (c == 0)
        {
            return 0.0F;
        }
        if (c < i1)
        {
            return (float)c / (float)i1;
        } else
        {
            return 1.0F;
        }
    }

    protected float getRightFadingEdgeStrength()
    {
        int i1 = getHorizontalFadingEdgeLength();
        if (c == o)
        {
            return 0.0F;
        }
        if (o - c < i1)
        {
            return (float)(o - c) / (float)i1;
        } else
        {
            return 1.0F;
        }
    }

    public View getSelectedView()
    {
        return h(r);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        b(canvas);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (b != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        invalidate();
        if (i)
        {
            int i2 = c;
            c();
            removeAllViewsInLayout();
            d = i2;
            i = false;
        }
        if (n != null)
        {
            d = n.intValue();
            n = null;
        }
        if (a.computeScrollOffset())
        {
            d = a.getCurrX();
        }
        if (d >= 0) goto _L4; else goto _L3
_L3:
        d = 0;
        if (x.isFinished())
        {
            x.onAbsorb((int)e());
        }
        a.forceFinished(true);
        a(h.a);
_L6:
        int j2 = c - d;
        f(j2);
        e(j2);
        g(j2);
        c = d;
        if (f())
        {
            onLayout(flag, i1, j1, k1, l1);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (d > o)
        {
            d = o;
            if (y.isFinished())
            {
                y.onAbsorb((int)e());
            }
            a.forceFinished(true);
            a(h.a);
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (a.isFinished())
        {
            if (w == h.c)
            {
                a(h.a);
                return;
            }
        } else
        {
            ViewCompat.postOnAnimation(this, E);
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        z = j1;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            n = Integer.valueOf(parcelable.getInt("BUNDLE_ID_CURRENT_X"));
            super.onRestoreInstanceState(parcelable.getParcelable("BUNDLE_ID_PARENT_STATE"));
        }
    }

    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
        bundle.putInt("BUNDLE_ID_CURRENT_X", c);
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() != 1) goto _L2; else goto _L1
_L1:
        if (a == null || a.isFinished())
        {
            a(h.a);
        }
        k();
        l();
        a(Boolean.valueOf(false));
_L4:
        return super.onTouchEvent(motionevent);
_L2:
        if (motionevent.getAction() == 3)
        {
            k();
            l();
            a(Boolean.valueOf(false));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setAdapter(Adapter adapter)
    {
        a((ListAdapter)adapter);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        C = onclicklistener;
    }

    public void setSelection(int i1)
    {
        r = i1;
    }
}
