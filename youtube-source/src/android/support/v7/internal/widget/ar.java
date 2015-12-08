// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.a.k;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerICS, aw, as, au, 
//            d, v, at, x

final class ar extends AbsSpinnerICS
    implements android.content.DialogInterface.OnClickListener
{

    int E;
    private aw F;
    private at G;
    private int H;
    private Rect I;

    ar(Context context, AttributeSet attributeset, int i)
    {
        this(context, null, i, -1);
    }

    private ar(Context context, AttributeSet attributeset, int i, int j)
    {
        TypedArray typedarray;
        super(context, attributeset, i);
        I = new Rect();
        typedarray = context.obtainStyledAttributes(attributeset, k.D, i, 0);
        typedarray.getInt(7, 0);
        JVM INSTR tableswitch 0 1: default 60
    //                   0 119
    //                   1 135;
           goto _L1 _L2 _L3
_L1:
        H = typedarray.getInt(0, 17);
        F.a(typedarray.getString(6));
        typedarray.recycle();
        if (G != null)
        {
            F.a(G);
            G = null;
        }
        return;
_L2:
        F = new as(this, (byte)0);
        continue; /* Loop/switch isn't completed */
_L3:
        context = new au(this, context, attributeset, i);
        E = typedarray.getLayoutDimension(3, -2);
        context.a(typedarray.getDrawable(2));
        i = typedarray.getDimensionPixelOffset(5, 0);
        if (i != 0)
        {
            context.c(i);
        }
        i = typedarray.getDimensionPixelOffset(4, 0);
        if (i != 0)
        {
            context.b(i);
        }
        F = context;
        if (true) goto _L1; else goto _L4
_L4:
    }

    static Rect a(ar ar1)
    {
        return ar1.I;
    }

    private void a(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, 0, layoutparams);
        view.setSelected(hasFocus());
        int i = ViewGroup.getChildMeasureSpec(b, this.i.top + this.i.bottom, layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(c, this.i.left + this.i.right, layoutparams.width), i);
        i = this.i.top + (getMeasuredHeight() - this.i.bottom - this.i.top - view.getMeasuredHeight()) / 2;
        int j = view.getMeasuredHeight();
        view.layout(0, i, view.getMeasuredWidth() + 0, j + i);
    }

    private View d(int i)
    {
        if (!u)
        {
            View view = j.a(i);
            if (view != null)
            {
                a(view);
                return view;
            }
        }
        View view1 = a.getView(i, null, this);
        a(view1);
        return view1;
    }

    final int a(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        if (spinneradapter == null)
        {
            return 0;
        }
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i = Math.max(0, super.v);
        int l1 = Math.min(spinneradapter.getCount(), i + 15);
        int j = Math.max(0, i - (15 - (l1 - i)));
        View view = null;
        int l = 0;
        i = 0;
        for (; j < l1; j++)
        {
            int i1 = spinneradapter.getItemViewType(j);
            if (i1 != i)
            {
                view = null;
                i = i1;
            }
            view = spinneradapter.getView(j, view, this);
            if (view.getLayoutParams() == null)
            {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(j1, k1);
            l = Math.max(l, view.getMeasuredWidth());
        }

        if (drawable != null)
        {
            drawable.getPadding(I);
            return I.left + I.right + l;
        } else
        {
            return l;
        }
    }

    public final void a(x x)
    {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }

    public final void a(SpinnerAdapter spinneradapter)
    {
        super.a(spinneradapter);
        if (F != null)
        {
            F.a(new at(spinneradapter));
            return;
        } else
        {
            G = new at(spinneradapter);
            return;
        }
    }

    final void b(x x)
    {
        super.a(x);
    }

    public final int getBaseline()
    {
        Object obj;
        byte byte0;
        byte0 = -1;
        obj = null;
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(0);
_L4:
        int i = byte0;
        if (view != null)
        {
            int j = view.getBaseline();
            i = byte0;
            if (j >= 0)
            {
                i = view.getTop() + j;
            }
        }
        return i;
_L2:
        view = obj;
        if (a != null)
        {
            view = obj;
            if (a.getCount() > 0)
            {
                view = d(0);
                this.j.a(0, view);
                removeAllViewsInLayout();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a(i);
        dialoginterface.dismiss();
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (F != null && F.f())
        {
            F.d();
        }
    }

    protected final void onLayout(boolean flag, int i, int j, int l, int i1)
    {
        super.onLayout(flag, i, j, l, i1);
        r = true;
        j = this.i.left;
        l = getRight() - getLeft() - this.i.left - this.i.right;
        if (u)
        {
            f();
        }
        if (z != 0) goto _L2; else goto _L1
_L1:
        a();
_L4:
        r = false;
        return;
_L2:
        Object obj;
        if (v >= 0)
        {
            b(v);
        }
        i1 = getChildCount();
        obj = super.j;
        int j1 = super.k;
        for (i = 0; i < i1; i++)
        {
            ((d) (obj)).a(j1 + i, getChildAt(i));
        }

        removeAllViewsInLayout();
        k = x;
        obj = d(x);
        i = ((View) (obj)).getMeasuredWidth();
        switch (H & 7)
        {
        default:
            i = j;
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 5: // '\005'
            break MISSING_BLOCK_LABEL_262;
        }
_L5:
        ((View) (obj)).offsetLeftAndRight(i);
        this.j.a();
        invalidate();
        g();
        u = false;
        p = false;
        c(x);
        if (true) goto _L4; else goto _L3
_L3:
        i = (j + l / 2) - i / 2;
          goto _L5
        i = (j + l) - i;
          goto _L5
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (F != null && android.view.View.MeasureSpec.getMode(i) == 0x80000000)
        {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(super.a, getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final boolean performClick()
    {
        boolean flag1 = super.performClick();
        boolean flag = flag1;
        if (!flag1)
        {
            boolean flag2 = true;
            flag = flag2;
            if (!F.f())
            {
                F.c();
                flag = flag2;
            }
        }
        return flag;
    }
}
