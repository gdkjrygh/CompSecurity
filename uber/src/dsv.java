// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

final class dsv extends ViewGroup
    implements android.widget.AbsListView.SelectionBoundsAdjuster
{

    final dsu a;
    private View b;
    private View c;
    private View d;
    private boolean e;

    dsv(dsu dsu1, Context context)
    {
        a = dsu1;
        super(context);
    }

    private static int a(View view, int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (layoutparams != null && layoutparams.height > 0)
        {
            view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000));
        } else
        {
            view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        return view.getMeasuredHeight();
    }

    static View a(dsv dsv1)
    {
        return dsv1.c;
    }

    static View b(dsv dsv1)
    {
        return dsv1.b;
    }

    static View c(dsv dsv1)
    {
        return dsv1.d;
    }

    final void a(int i, int j, View view, View view1, boolean flag)
    {
        if (c != null && c != view)
        {
            removeView(c);
            dsu.d(a).a(c, j, 0);
        }
        if (b != null && b != view1)
        {
            removeView(b);
            dsu.d(a).a(b, i, 1);
        }
        if (d != null && d != null)
        {
            removeView(d);
            dsu.d(a).a(d, j, 2);
        }
        if (view != null && view != c)
        {
            addView(view);
        }
        if (view1 != null && view1 != b)
        {
            addView(view1);
        }
        c = view;
        b = view1;
        d = null;
        e = flag;
        invalidate();
    }

    public final void adjustListItemSelectionBounds(Rect rect)
    {
        if (c != null)
        {
            rect.top = rect.top + c.getHeight();
        }
        if (e)
        {
            rect.bottom = rect.bottom - dsu.b(a);
        }
        rect.left = rect.left + dsu.a(a);
        rect.right = rect.right - dsu.a(a);
    }

    protected final void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (e)
        {
            int i = dsu.a(a);
            int j = getWidth();
            int k = dsu.a(a);
            dsu.c(a).setBounds(i, getHeight() - dsu.b(a), j - k, getHeight());
            dsu.c(a).draw(canvas);
        }
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = 0;
        k = 0;
        int i1 = dsu.a(a);
        int j1 = getWidth() - dsu.a(a);
        int k1 = getHeight();
        if (c != null)
        {
            i = c.getMeasuredHeight();
            c.layout(i1, 0, j1, i);
        } else
        {
            i = 0;
        }
        if (d != null)
        {
            l = d.getMeasuredHeight();
            j = k;
            if (b != null)
            {
                j = b.getMeasuredHeight();
            }
            d.layout(i1, j + (i + 0), j1, k1);
            j = l;
        }
        if (b != null)
        {
            b.layout(i1, i + 0, j1, k1 - j);
        }
    }

    protected final void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        j = 0;
        int l = android.view.View.MeasureSpec.makeMeasureSpec(k - dsu.a(a) * 2, 0x40000000);
        i = j;
        if (c != null)
        {
            i = j;
            if (c.getVisibility() == 0)
            {
                i = a(c, l) + 0;
            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.getVisibility() == 0)
            {
                j = i + a(b, l);
            }
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.getVisibility() == 0)
            {
                i = j + a(d, l);
            }
        }
        j = i;
        if (e)
        {
            j = i + dsu.b(a);
        }
        setMeasuredDimension(k, j);
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (c == null || motionevent.getY() > (float)c.getBottom())
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return true;
        }
    }
}
