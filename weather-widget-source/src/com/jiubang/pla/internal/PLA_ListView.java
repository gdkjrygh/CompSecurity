// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package com.jiubang.pla.internal:
//            PLA_AbsListView, h, p, o, 
//            l

public class PLA_ListView extends PLA_AbsListView
{

    Drawable R;
    int S;
    Drawable T;
    Drawable U;
    private ArrayList V;
    private ArrayList W;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private final Rect ag;
    private Paint ah;

    public PLA_ListView(Context context)
    {
        this(context, null);
    }

    public PLA_ListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010036);
    }

    public PLA_ListView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        V = new ArrayList();
        W = new ArrayList();
        ae = true;
        af = false;
        ag = new Rect();
        context = context.obtainStyledAttributes(attributeset, com.gau.go.launcherex.gowidget.weatherwidget.R.styleable.ListView, i1, 0);
        attributeset = context.getDrawable(3);
        if (attributeset != null)
        {
            b(attributeset);
        }
        attributeset = context.getDrawable(4);
        if (attributeset != null)
        {
            c(attributeset);
        }
        i1 = context.getDimensionPixelSize(0, 0);
        if (i1 != 0)
        {
            m(i1);
        }
        ac = context.getBoolean(1, true);
        ad = context.getBoolean(2, true);
        context.recycle();
    }

    private void C()
    {
        boolean flag;
        int l1;
        flag = false;
        l1 = getChildCount();
        if (l1 <= 0) goto _L2; else goto _L1
_L1:
        if (x) goto _L4; else goto _L3
_L3:
        int k1;
        k1 = o() - l.top;
        int i1 = k1;
        if (B != 0)
        {
            i1 = k1 - S;
        }
        k1 = i1;
        if (i1 < 0)
        {
            k1 = ((flag) ? 1 : 0);
        }
_L6:
        if (k1 != 0)
        {
            b(-k1);
        }
_L2:
        return;
_L4:
        k1 = r() - (getHeight() - l.bottom);
        int j1 = k1;
        if (l1 + B < M)
        {
            j1 = k1 + S;
        }
        k1 = ((flag) ? 1 : 0);
        if (j1 <= 0)
        {
            k1 = j1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean D()
    {
        boolean flag = false;
        int i1 = getScrollY();
        int j1 = l.top;
        if (B > 0 || getChildAt(0).getTop() > i1 + j1)
        {
            flag = true;
        }
        return flag;
    }

    private boolean E()
    {
        int i1 = getChildCount();
        int j1 = getChildAt(i1 - 1).getBottom();
        int k1 = B;
        int l1 = getScrollY();
        int i2 = getHeight();
        int j2 = l.bottom;
        return (i1 + k1) - 1 < M - 1 || j1 < (l1 + i2) - j2;
    }

    private View a(int i1, int j1, boolean flag, boolean flag1)
    {
        if (!L)
        {
            View view = g.c(i1);
            if (view != null)
            {
                a(view, i1, j1, flag, i(i1), flag1, true);
                return view;
            }
        }
        b(i1, flag);
        int k1 = i(i1);
        View view1 = a(i1, A);
        a(view1, i1, j1, flag, k1, flag1, A[0]);
        return view1;
    }

    private View a(View view, int i1)
    {
        i1--;
        View view1 = a(i1, A);
        a(view1, i1, view.getTop() - S, false, l.left, false, A[0]);
        return view1;
    }

    private void a(View view, int i1, int j1)
    {
        PLA_AbsListView.LayoutParams layoutparams1 = (PLA_AbsListView.LayoutParams)view.getLayoutParams();
        PLA_AbsListView.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new PLA_AbsListView.LayoutParams(-1, -2, 0);
            view.setLayoutParams(layoutparams);
        }
        layoutparams.a = c.getItemViewType(i1);
        layoutparams.c = true;
        j1 = ViewGroup.getChildMeasureSpec(j1, l.left + l.right, layoutparams.width);
        i1 = layoutparams.height;
        if (i1 > 0)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(j1, i1);
    }

    private void a(View view, int i1, int j1, boolean flag, int k1, boolean flag1, boolean flag2)
    {
        PLA_AbsListView.LayoutParams layoutparams;
        PLA_AbsListView.LayoutParams layoutparams1;
        int l1;
        boolean flag3;
        int i2;
        int j2;
        boolean flag4;
        if (flag1 && i())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 != view.isSelected())
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        l1 = t;
        if (l1 > 0 && l1 < 3 && o == i1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (flag4 != view.isPressed())
        {
            j2 = 1;
        } else
        {
            j2 = 0;
        }
        if (!flag2 || i2 != 0 || view.isLayoutRequested())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        layoutparams1 = (PLA_AbsListView.LayoutParams)view.getLayoutParams();
        layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new PLA_AbsListView.LayoutParams(-1, -2, 0);
        }
        layoutparams.a = c.getItemViewType(i1);
        if (flag2 && !layoutparams.c || layoutparams.b && layoutparams.a == -2)
        {
            byte byte0;
            if (flag)
            {
                byte0 = -1;
            } else
            {
                byte0 = 0;
            }
            attachViewToParent(view, byte0, layoutparams);
        } else
        {
            layoutparams.c = false;
            if (layoutparams.a == -2)
            {
                layoutparams.b = true;
            }
            byte byte1;
            if (flag)
            {
                byte1 = -1;
            } else
            {
                byte1 = 0;
            }
            addViewInLayout(view, byte1, layoutparams, true);
        }
        if (i2 != 0)
        {
            view.setSelected(flag1);
        }
        if (j2 != 0)
        {
            view.setPressed(flag4);
        }
        if (flag3)
        {
            j2 = ViewGroup.getChildMeasureSpec(m, l.left + l.right, layoutparams.width);
            i2 = layoutparams.height;
            if (i2 > 0)
            {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
            } else
            {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            b(view, i1, j2, i2);
        } else
        {
            cleanupLayoutState(view);
        }
        i2 = view.getMeasuredWidth();
        j2 = view.getMeasuredHeight();
        if (!flag)
        {
            j1 -= j2;
        }
        if (flag3)
        {
            a(view, i1, k1, j1, k1 + i2, j1 + j2);
        } else
        {
            a(view, i1, k1 - view.getLeft(), j1 - view.getTop());
        }
        if (n && !view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(true);
        }
    }

    private void a(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            int j1 = arraylist.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                PLA_AbsListView.LayoutParams layoutparams = (PLA_AbsListView.LayoutParams)((p)arraylist.get(i1)).a.getLayoutParams();
                if (layoutparams != null)
                {
                    layoutparams.b = false;
                }
            }

        }
    }

    private View b(View view, int i1)
    {
        i1++;
        View view1 = a(i1, A);
        int j1 = view.getBottom();
        a(view1, i1, S + j1, true, l.left, false, A[0]);
        return view1;
    }

    private View d(int i1, int j1)
    {
        int l1 = getBottom();
        int i2 = getTop();
        int j2 = l.bottom;
        int k1 = q() + S;
        j1 = i1;
        for (i1 = k1; i1 < l1 - i2 - j2 && j1 < M; i1 = q() + S)
        {
            a(j1, j(j1), true, false);
            j1++;
        }

        return null;
    }

    private View e(int i1, int j1)
    {
        int l1 = l.top;
        int k1 = p();
        j1 = i1;
        for (i1 = k1; i1 > l1 && j1 >= 0; i1 = k(j1))
        {
            a(j1, k(j1), false, false);
            j1--;
        }

        B = j1 + 1;
        return null;
    }

    private View f(int i1, int j1)
    {
        View view;
        view = a(i1, j1, true, false);
        B = i1;
        j1 = S;
        if (x) goto _L2; else goto _L1
_L1:
        e(i1 - 1, view.getTop() - j1);
        C();
        d(i1 + 1, view.getBottom() + j1);
        i1 = getChildCount();
        if (i1 > 0)
        {
            o(i1);
        }
_L4:
        return null;
_L2:
        d(i1 + 1, view.getBottom() + j1);
        C();
        e(i1 - 1, view.getTop() - j1);
        i1 = getChildCount();
        if (i1 > 0)
        {
            p(i1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean f(View view)
    {
        ArrayList arraylist = V;
        int k1 = arraylist.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            if (view == ((p)arraylist.get(i1)).a)
            {
                return true;
            }
        }

        arraylist = W;
        k1 = arraylist.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (view == ((p)arraylist.get(j1)).a)
            {
                return true;
            }
        }

        return false;
    }

    private View n(int i1)
    {
        B = Math.min(B, -1);
        B = Math.min(B, M - 1);
        if (B < 0)
        {
            B = 0;
        }
        return d(B, i1);
    }

    private void o(int i1)
    {
        if ((B + i1) - 1 == M - 1 && i1 > 0)
        {
            i1 = r();
            int j1 = getBottom() - getTop() - l.bottom - i1;
            int k1 = o();
            if (j1 > 0 && (B > 0 || k1 < l.top))
            {
                i1 = j1;
                if (B == 0)
                {
                    i1 = Math.min(j1, l.top - k1);
                }
                b(i1);
                if (B > 0)
                {
                    i1 = o();
                    e(B - 1, i1 - S);
                    C();
                }
            }
        }
    }

    private void p(int i1)
    {
        if (B == 0 && i1 > 0)
        {
            int j1 = o();
            int l1 = l.top;
            int k1 = getBottom() - getTop() - l.bottom;
            j1 -= l1;
            l1 = r();
            int i2 = (B + i1) - 1;
            if (j1 > 0)
            {
                if (i2 < M - 1 || l1 > k1)
                {
                    i1 = j1;
                    if (i2 == M - 1)
                    {
                        i1 = Math.min(j1, l1 - k1);
                    }
                    b(-i1);
                    if (i2 < M - 1)
                    {
                        d(i2 + 1, p() + S);
                        C();
                    }
                } else
                if (i2 == M - 1)
                {
                    C();
                    return;
                }
            }
        }
    }

    private void q(int i1)
    {
        b(i1);
        int j1 = getHeight() - l.bottom;
        int k1 = l.top;
        h h1 = g;
        if (i1 < 0)
        {
            View view = B();
            i1 = getChildCount();
            do
            {
                if (view.getBottom() >= j1)
                {
                    break;
                }
                int l1 = (B + i1) - 1;
                if (l1 >= M - 1)
                {
                    break;
                }
                b(view, l1);
                view = B();
                i1++;
            } while (true);
            if (view.getBottom() < j1)
            {
                b(j1 - view.getBottom());
            }
            view = getChildAt(0);
            while (view.getBottom() < k1) 
            {
                if (h1.b(((PLA_AbsListView.LayoutParams)view.getLayoutParams()).a))
                {
                    detachViewFromParent(view);
                    h1.a(view);
                } else
                {
                    removeViewInLayout(view);
                }
                view = getChildAt(0);
                B = B + 1;
            }
        } else
        {
            View view1;
            for (view1 = getChildAt(0); view1.getTop() > k1 && B > 0; B = B - 1)
            {
                view1 = a(view1, B);
            }

            if (view1.getTop() > k1)
            {
                b(k1 - view1.getTop());
            }
            i1 = getChildCount() - 1;
            view1 = getChildAt(i1);
            while (view1.getTop() > j1) 
            {
                if (h1.b(((PLA_AbsListView.LayoutParams)view1.getLayoutParams()).a))
                {
                    detachViewFromParent(view1);
                    h1.a(view1);
                } else
                {
                    removeViewInLayout(view1);
                }
                i1--;
                view1 = getChildAt(i1);
            }
        }
    }

    protected boolean A()
    {
        return true;
    }

    protected View B()
    {
        return getChildAt(getChildCount() - 1);
    }

    final int a(int i1, int j1, int k1, int l1, int i2)
    {
        Object obj;
        int l2;
        l2 = 0;
        obj = c;
        if (obj != null) goto _L2; else goto _L1
_L1:
        i1 = l.top + l.bottom;
_L4:
        return i1;
_L2:
        int i3 = l.top + l.bottom;
        boolean aflag[];
        int j2;
        int k2;
        boolean flag;
        if (S > 0 && R != null)
        {
            j2 = S;
        } else
        {
            j2 = 0;
        }
        k2 = k1;
        if (k1 == -1)
        {
            k2 = ((ListAdapter) (obj)).getCount() - 1;
        }
        obj = g;
        flag = A();
        aflag = A;
        k1 = j1;
        j1 = i3;
        while (k1 <= k2) 
        {
            View view = a(k1, aflag);
            a(view, k1, i1);
            if (k1 > 0)
            {
                j1 += j2;
            }
            if (flag && ((h) (obj)).b(((PLA_AbsListView.LayoutParams)view.getLayoutParams()).a))
            {
                ((h) (obj)).a(view);
            }
            j1 = view.getMeasuredHeight() + j1;
            if (j1 >= l1)
            {
                i1 = l1;
                if (i2 >= 0)
                {
                    i1 = l1;
                    if (k1 > i2)
                    {
                        i1 = l1;
                        if (l2 > 0)
                        {
                            i1 = l1;
                            if (j1 != l1)
                            {
                                return l2;
                            }
                        }
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            int j3 = l2;
            if (i2 >= 0)
            {
                j3 = l2;
                if (k1 >= i2)
                {
                    j3 = j1;
                }
            }
            k1++;
            l2 = j3;
        }
        return j1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    int a(int i1, boolean flag)
    {
        ListAdapter listadapter = c;
        if (listadapter != null && !isInTouchMode()) goto _L2; else goto _L1
_L1:
        int j1 = -1;
_L4:
        return j1;
_L2:
        int k1;
        k1 = listadapter.getCount();
        if (ae)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (flag)
        {
            j1 = Math.max(0, i1);
            do
            {
                i1 = j1;
                if (j1 >= k1)
                {
                    break;
                }
                i1 = j1;
                if (listadapter.isEnabled(j1))
                {
                    break;
                }
                j1++;
            } while (true);
        } else
        {
            j1 = Math.min(i1, k1 - 1);
            do
            {
                i1 = j1;
                if (j1 < 0)
                {
                    break;
                }
                i1 = j1;
                if (listadapter.isEnabled(j1))
                {
                    break;
                }
                j1--;
            } while (true);
        }
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = i1;
        if (i1 < k1) goto _L4; else goto _L3
_L3:
        return -1;
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = i1;
        if (i1 < k1) goto _L4; else goto _L5
_L5:
        return -1;
    }

    void a(Canvas canvas, Rect rect, int i1)
    {
        Drawable drawable = R;
        boolean flag = ab;
        if (!flag)
        {
            drawable.setBounds(rect);
        } else
        {
            canvas.save();
            canvas.clipRect(rect);
        }
        drawable.draw(canvas);
        if (flag)
        {
            canvas.restore();
        }
    }

    void a(Canvas canvas, Drawable drawable, Rect rect)
    {
        int i1 = drawable.getMinimumHeight();
        canvas.save();
        canvas.clipRect(rect);
        if (rect.bottom - rect.top < i1)
        {
            rect.top = rect.bottom - i1;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    protected void a(View view, int i1, int j1, int k1)
    {
        view.offsetLeftAndRight(j1);
        view.offsetTopAndBottom(k1);
    }

    protected void a(View view, int i1, int j1, int k1, int l1, int i2)
    {
        view.layout(j1, k1, l1, i2);
    }

    public void a(View view, Object obj, boolean flag)
    {
        if (c != null)
        {
            throw new IllegalStateException("Cannot add header view to list -- setAdapter has already been called.");
        } else
        {
            p p1 = new p(this);
            p1.a = view;
            p1.b = obj;
            p1.c = flag;
            V.add(p1);
            return;
        }
    }

    public void a(ListAdapter listadapter)
    {
        if (c != null)
        {
            c.unregisterDataSetObserver(b);
        }
        c();
        g.b();
        if (V.size() > 0 || W.size() > 0)
        {
            c = new o(V, W, listadapter);
        } else
        {
            c = listadapter;
        }
        O = -1;
        P = 0x8000000000000000L;
        if (c != null)
        {
            ae = c.areAllItemsEnabled();
            N = M;
            M = c.getCount();
            x();
            b = new l(this);
            c.registerDataSetObserver(b);
            g.a(c.getViewTypeCount());
        } else
        {
            ae = true;
            x();
        }
        requestLayout();
    }

    protected void b(int i1, boolean flag)
    {
    }

    void b(Canvas canvas, Drawable drawable, Rect rect)
    {
        int i1 = drawable.getMinimumHeight();
        canvas.save();
        canvas.clipRect(rect);
        if (rect.bottom - rect.top < i1)
        {
            rect.bottom = i1 + rect.top;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    public void b(Drawable drawable)
    {
        T = drawable;
        if (getScrollY() < 0)
        {
            invalidate();
        }
    }

    protected void b(View view, int i1, int j1, int k1)
    {
        view.measure(j1, k1);
    }

    public void b(View view, Object obj, boolean flag)
    {
        p p1 = new p(this);
        p1.a = view;
        p1.b = obj;
        p1.c = flag;
        W.add(p1);
        if (b != null)
        {
            b.onChanged();
        }
    }

    public boolean b(View view, int i1, long l1)
    {
        return false | super.b(view, i1, l1);
    }

    int c(int i1)
    {
        int l1 = getChildCount();
        if (l1 > 0)
        {
            if (!x)
            {
                for (int j1 = 0; j1 < l1; j1++)
                {
                    if (i1 <= getChildAt(j1).getBottom())
                    {
                        return j1 + B;
                    }
                }

            } else
            {
                for (int k1 = l1 - 1; k1 >= 0; k1--)
                {
                    if (i1 >= getChildAt(k1).getTop())
                    {
                        return k1 + B;
                    }
                }

            }
        }
        return -1;
    }

    void c()
    {
        a(V);
        a(W);
        super.c();
        a = 0;
    }

    public void c(Drawable drawable)
    {
        U = drawable;
        invalidate();
    }

    public void c(View view)
    {
        a(view, null, true);
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && M > 0;
    }

    protected void d()
    {
        Object obj;
        View view1;
        boolean flag;
        obj = null;
        view1 = null;
        flag = Q;
        if (flag) goto _L2; else goto _L1
_L1:
        Q = true;
        super.d();
        invalidate();
        if (c != null) goto _L4; else goto _L3
_L3:
        c();
        a();
        if (flag) goto _L2; else goto _L5
_L5:
        Q = false;
_L2:
        return;
_L4:
        View view;
        int j1;
        int k1;
        int l1;
        j1 = l.top;
        k1 = getBottom() - getTop() - l.bottom;
        l1 = getChildCount();
        switch (a)
        {
        case 2: // '\002'
        default:
            view = getChildAt(0);
            break;

        case 1: // '\001'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            break MISSING_BLOCK_LABEL_744;
        }
_L22:
        boolean flag1 = L;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        m();
        if (M != 0)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        c();
        a();
        if (flag) goto _L2; else goto _L6
_L6:
        break; /* Loop/switch isn't completed */
        if (M != c.getCount())
        {
            throw new IllegalStateException((new StringBuilder()).append("The content of the adapter has changed but ListView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in ListView(").append(getId()).append(", ").append(getClass()).append(") with Adapter(").append(c.getClass()).append(")]").toString());
        }
        break MISSING_BLOCK_LABEL_267;
        obj;
        if (!flag)
        {
            Q = false;
        }
        throw obj;
        h h1;
        int i1;
        i1 = B;
        h1 = g;
        if (!flag1) goto _L8; else goto _L7
_L7:
        i1 = 0;
_L10:
        if (i1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        h1.a(getChildAt(i1));
        i1++;
        if (true) goto _L10; else goto _L9
_L8:
        h1.a(l1, i1);
_L9:
        View view2 = getFocusedChild();
        if (view2 == null)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        obj = view1;
        if (!f(view2))
        {
            break MISSING_BLOCK_LABEL_367;
        }
        view1 = findFocus();
        obj = view1;
        if (view1 == null)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        view1.onStartTemporaryDetach();
        obj = view1;
        requestFocus();
        a;
        JVM INSTR tableswitch 1 5: default 749
    //                   1 596
    //                   2 412
    //                   3 572
    //                   4 412
    //                   5 536;
           goto _L11 _L12 _L11 _L13 _L11 _L14
_L11:
        if (l1 != 0) goto _L16; else goto _L15
_L15:
        detachAllViewsFromParent();
        if (x) goto _L18; else goto _L17
_L17:
        n(j1);
_L19:
        h1.c();
        if (t <= 0 || t >= 3)
        {
            break MISSING_BLOCK_LABEL_726;
        }
        view = getChildAt(o - B);
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        a(view);
_L21:
        if (!hasFocus() || obj == null)
        {
            break MISSING_BLOCK_LABEL_494;
        }
        ((View) (obj)).requestFocus();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_509;
        }
        if (((View) (obj)).getWindowToken() != null)
        {
            ((View) (obj)).onFinishTemporaryDetach();
        }
        a = 0;
        L = false;
        G = false;
        a();
        if (flag) goto _L2; else goto _L5
_L14:
        d(D);
        detachAllViewsFromParent();
        f(D, C);
        e(D);
          goto _L19
_L13:
        detachAllViewsFromParent();
        e(M - 1, k1);
        C();
          goto _L19
_L12:
        detachAllViewsFromParent();
        B = 0;
        n(j1);
        C();
          goto _L19
_L18:
        e(M - 1, k1);
          goto _L19
_L16:
        if (B >= M)
        {
            break MISSING_BLOCK_LABEL_701;
        }
        d(B);
        detachAllViewsFromParent();
        k1 = B;
        if (view != null)
        {
            break MISSING_BLOCK_LABEL_692;
        }
        i1 = j1;
_L20:
        f(k1, i1);
        e(B);
          goto _L19
        i1 = view.getTop();
          goto _L20
        d(0);
        detachAllViewsFromParent();
        f(0, j1);
        e(0);
          goto _L19
        w = 0;
        f.setEmpty();
          goto _L21
        view = null;
          goto _L22
    }

    protected void d(boolean flag)
    {
        int i1 = getChildCount();
        if (flag)
        {
            d(B + i1, j(i1 + B));
            e(flag);
            return;
        } else
        {
            e(B - 1, k(B - 1));
            e(flag);
            return;
        }
    }

    public boolean d(View view)
    {
        ArrayList arraylist = V;
        int k1 = arraylist.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            if (((p)arraylist.get(i1)).a == view)
            {
                return true;
            }
        }

        arraylist = W;
        k1 = arraylist.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (((p)arraylist.get(j1)).a == view)
            {
                return true;
            }
        }

        return false;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        Drawable drawable;
        Drawable drawable1;
        Rect rect;
        ListAdapter listadapter;
        Paint paint;
        int i1;
        boolean flag;
        int k1;
        boolean flag1;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        l2 = S;
        drawable = T;
        drawable1 = U;
        int l1;
        if (drawable != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (drawable1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l2 > 0 && R != null)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 == 0 && i1 == 0 && !flag) goto _L2; else goto _L1
_L1:
        rect = ag;
        rect.left = getPaddingLeft();
        rect.right = getRight() - getLeft() - getPaddingRight();
        i3 = getChildCount();
        k3 = V.size();
        j4 = M;
        l3 = j4 - W.size() - 1;
        flag2 = ac;
        flag3 = ad;
        j3 = B;
        flag4 = ae;
        listadapter = c;
        if (k1 != 0 && isOpaque() && !super.isOpaque())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && ah == null && Z)
        {
            ah = new Paint();
            ah.setColor(n());
        }
        paint = ah;
        i4 = (getBottom() - getTop() - l.bottom) + getScrollY();
        if (x) goto _L4; else goto _L3
_L3:
        l1 = getScrollY();
        if (i3 <= 0 || l1 >= 0) goto _L6; else goto _L5
_L5:
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        rect.bottom = 0;
        rect.top = l1;
        a(canvas, drawable, rect);
          goto _L6
_L8:
        if (k1 != 0)
        {
            rect.bottom = 0;
            rect.top = -l2;
            a(canvas, rect, -1);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0;
        l1 = 0;
label0:
        do
        {
label1:
            {
                if (l1 >= i3)
                {
                    break label0;
                }
                int j2;
                if (!flag2)
                {
                    j2 = i1;
                    if (j3 + l1 < k3)
                    {
                        break label1;
                    }
                }
                if (!flag3)
                {
                    j2 = i1;
                    if (j3 + l1 >= l3)
                    {
                        break label1;
                    }
                }
                i1 = getChildAt(l1).getBottom();
                j2 = i1;
                if (k1 == 0)
                {
                    break label1;
                }
                j2 = i1;
                if (i1 >= i4)
                {
                    break label1;
                }
                if (flag)
                {
                    j2 = i1;
                    if (l1 == i3 - 1)
                    {
                        break label1;
                    }
                }
                if (flag4 || listadapter.isEnabled(j3 + l1) && (l1 == i3 - 1 || listadapter.isEnabled(j3 + l1 + 1)))
                {
                    rect.top = i1;
                    rect.bottom = i1 + l2;
                    a(canvas, rect, l1);
                    j2 = i1;
                } else
                {
                    j2 = i1;
                    if (flag1)
                    {
                        rect.top = i1;
                        rect.bottom = i1 + l2;
                        canvas.drawRect(rect, paint);
                        j2 = i1;
                    }
                }
            }
            l1++;
            i1 = j2;
        } while (true);
        k1 = getBottom() + getScrollY();
        if (flag && j3 + i3 == j4 && k1 > i1)
        {
            rect.top = i1;
            rect.bottom = k1;
            b(canvas, drawable1, rect);
        }
_L2:
        super.dispatchDraw(canvas);
        return;
_L4:
        int k2 = l.top;
        int i2 = getScrollY();
        if (i3 > 0 && i1 != 0)
        {
            rect.top = i2;
            rect.bottom = getChildAt(0).getTop();
            a(canvas, drawable, rect);
        }
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        while (i1 < i3) 
        {
            if (!flag2 && j3 + i1 < k3 || !flag3 && j3 + i1 >= l3)
            {
                continue;
            }
            int k4 = getChildAt(i1).getTop();
            if (k1 != 0 && k4 > k2)
            {
                if (flag4 || listadapter.isEnabled(j3 + i1) && (i1 == i3 - 1 || listadapter.isEnabled(j3 + i1 + 1)))
                {
                    rect.top = k4 - l2;
                    rect.bottom = k4;
                    a(canvas, rect, i1 - 1);
                } else
                if (flag1)
                {
                    rect.top = k4 - l2;
                    rect.bottom = k4;
                    canvas.drawRect(rect, paint);
                }
            }
            i1++;
        }
        if (i3 > 0 && i2 > 0)
        {
            if (flag)
            {
                int j1 = getBottom();
                rect.top = j1;
                rect.bottom = j1 + i2;
                b(canvas, drawable1, rect);
            } else
            if (k1 != 0)
            {
                rect.top = i4;
                rect.bottom = i4 + l2;
                a(canvas, rect, -1);
            }
        }
        if (true) goto _L2; else goto _L9
_L9:
        if (true) goto _L6; else goto _L10
_L10:
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        int k1 = 0;
        int i1 = 0;
        boolean flag = super.dispatchPopulateAccessibilityEvent(accessibilityevent);
        if (!flag)
        {
            int j1 = t();
            ListAdapter listadapter = z();
            int i2 = j1;
            if (listadapter != null)
            {
                int j2 = listadapter.getCount();
                if (j2 < 15)
                {
                    int l1 = 0;
                    do
                    {
                        i2 = j1;
                        k1 = i1;
                        if (l1 >= j2)
                        {
                            break;
                        }
                        if (listadapter.isEnabled(l1))
                        {
                            i2 = i1 + 1;
                            k1 = j1;
                        } else
                        {
                            k1 = j1;
                            i2 = i1;
                            if (l1 <= j1)
                            {
                                k1 = j1 - 1;
                                i2 = i1;
                            }
                        }
                        l1++;
                        j1 = k1;
                        i1 = i2;
                    } while (true);
                } else
                {
                    k1 = j2;
                    i2 = j1;
                }
            }
            accessibilityevent.setItemCount(k1);
            accessibilityevent.setCurrentItemIndex(i2);
        }
        return flag;
    }

    public void e(View view)
    {
        b(view, null, true);
    }

    protected void e(boolean flag)
    {
        if (flag)
        {
            o(getChildCount());
            return;
        } else
        {
            p(getChildCount());
            return;
        }
    }

    public void g(int i1)
    {
        boolean flag;
        if (i1 >>> 24 == 255)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Z = flag;
        if (flag)
        {
            if (ah == null)
            {
                ah = new Paint();
            }
            ah.setColor(i1);
        }
        super.g(i1);
    }

    protected int i(int i1)
    {
        return l.left;
    }

    public boolean isOpaque()
    {
        return n && Z && aa || super.isOpaque();
    }

    protected int j(int i1)
    {
        i1 = getChildCount();
        if (i1 > 0)
        {
            return getChildAt(i1 - 1).getBottom() + S;
        } else
        {
            return f();
        }
    }

    public int k()
    {
        return V.size();
    }

    protected int k(int i1)
    {
        if (getChildCount() > 0)
        {
            return getChildAt(0).getTop() - S;
        } else
        {
            return getHeight() - g();
        }
    }

    public int l()
    {
        return W.size();
    }

    public void l(int i1)
    {
    }

    public void m(int i1)
    {
        S = i1;
        b();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        int j1 = getChildCount();
        if (j1 > 0)
        {
            for (int i1 = 0; i1 < j1; i1++)
            {
                c(getChildAt(i1));
            }

            removeAllViews();
        }
    }

    protected void onFocusChanged(boolean flag, int i1, Rect rect)
    {
        int k1 = 0;
        super.onFocusChanged(flag, i1, rect);
        int j1 = -1;
        int i2 = j1;
        if (flag)
        {
            i2 = j1;
            if (rect != null)
            {
                rect.offset(getScrollX(), getScrollY());
                ListAdapter listadapter = c;
                if (listadapter.getCount() < getChildCount() + B)
                {
                    a = 0;
                    d();
                }
                Rect rect1 = ag;
                int l1 = 0x7fffffff;
                int j2 = getChildCount();
                int k2 = B;
                do
                {
                    i2 = j1;
                    if (k1 >= j2)
                    {
                        break;
                    }
                    if (listadapter.isEnabled(k2 + k1))
                    {
                        View view = getChildAt(k1);
                        view.getDrawingRect(rect1);
                        offsetDescendantRectToMyCoords(view, rect1);
                        i2 = a(rect, rect1, i1);
                        if (i2 < l1)
                        {
                            l1 = i2;
                            j1 = k1;
                        }
                    }
                    k1++;
                } while (true);
            }
        }
        if (i2 >= 0)
        {
            l(B + i2);
            return;
        } else
        {
            requestLayout();
            return;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        int k2 = android.view.View.MeasureSpec.getMode(i1);
        int j2 = android.view.View.MeasureSpec.getMode(j1);
        int l1 = android.view.View.MeasureSpec.getSize(i1);
        int i2 = android.view.View.MeasureSpec.getSize(j1);
        int k1;
        if (c == null)
        {
            j1 = 0;
        } else
        {
            j1 = c.getCount();
        }
        M = j1;
        if (M > 0 && (k2 == 0 || j2 == 0))
        {
            View view = a(0, A);
            a(view, 0, i1);
            j1 = view.getMeasuredWidth();
            k1 = view.getMeasuredHeight();
            if (A() && g.b(((PLA_AbsListView.LayoutParams)view.getLayoutParams()).a))
            {
                g.a(view);
            }
        } else
        {
            k1 = 0;
            j1 = 0;
        }
        if (k2 == 0)
        {
            l1 = j1 + (l.left + l.right) + getVerticalScrollbarWidth();
        }
        j1 = i2;
        if (j2 == 0)
        {
            j1 = l.top + l.bottom + k1 + getVerticalFadingEdgeLength() * 2;
        }
        k1 = j1;
        if (j2 == 0x80000000)
        {
            k1 = a(i1, 0, -1, j1, -1);
        }
        setMeasuredDimension(l1, k1);
        m = i1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (af && motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        int i2 = rect.top;
        rect.offset(view.getLeft(), view.getTop());
        rect.offset(-view.getScrollX(), -view.getScrollY());
        int l1 = getHeight();
        int j1 = getScrollY();
        int k1 = j1 + l1;
        int j2 = getVerticalFadingEdgeLength();
        int i1 = j1;
        if (D())
        {
            i1 = j1;
            if (i2 > j2)
            {
                i1 = j1 + j2;
            }
        }
        i2 = getChildAt(getChildCount() - 1).getBottom();
        j1 = k1;
        if (E())
        {
            j1 = k1;
            if (rect.bottom < i2 - j2)
            {
                j1 = k1 - j2;
            }
        }
        if (rect.bottom > j1 && rect.top > i1)
        {
            if (rect.height() > l1)
            {
                i1 = (rect.top - i1) + 0;
            } else
            {
                i1 = (rect.bottom - j1) + 0;
            }
            i1 = Math.min(i1, i2 - j1);
        } else
        if (rect.top < i1 && rect.bottom < j1)
        {
            if (rect.height() > l1)
            {
                j1 = 0 - (j1 - rect.bottom);
            } else
            {
                j1 = 0 - (i1 - rect.top);
            }
            i1 = Math.max(j1, getChildAt(0).getTop() - i1);
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            q(-i1);
            a(view);
            w = view.getTop();
            invalidate();
        }
        return flag;
    }

    public Adapter s()
    {
        return z();
    }

    public int v()
    {
        return Math.max(0, B - k());
    }

    public ListAdapter z()
    {
        return c;
    }
}
