// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.youtube.q;
import com.google.android.youtube.r;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            x, y

public class TabRow extends HorizontalScrollView
    implements android.view.View.OnClickListener
{

    private final LinearLayout a;
    private final boolean b;
    private final Drawable c;
    private x d;
    private y e;
    private int f;
    private boolean g;
    private final int h;
    private int i;

    public TabRow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = 0;
        g = true;
        attributeset = context.obtainStyledAttributes(attributeset, r.H, 0, q.j);
        h = attributeset.getResourceId(1, 0);
        b = attributeset.getBoolean(2, false);
        c = attributeset.getDrawable(0);
        a = new LinearLayout(context);
        a.setGravity(16);
        addView(a, new android.widget.FrameLayout.LayoutParams(-2, -2));
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        if (b)
        {
            setFillViewport(false);
            i = getPaddingLeft();
        }
        attributeset.recycle();
    }

    public final void a(int j, boolean flag)
    {
        if (g)
        {
            f = j;
        } else
        {
            int l = a.getChildCount();
            int k;
            if (c != null)
            {
                j *= 2;
            }
            k = 0;
            while (k < l) 
            {
                View view = a.getChildAt(k);
                if (k == j)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
                k++;
            }
            View view1 = a.getChildAt(j);
            if (view1 != null)
            {
                j = view1.getRight();
                smoothScrollTo(((view1.getLeft() + j) - getWidth()) / 2, 0);
            }
            if (e != null)
            {
                y y = e;
                return;
            }
        }
    }

    public void onClick(View view)
    {
        int j;
label0:
        {
            if (d != null)
            {
                j = a.indexOfChild(view);
                if (j >= 0)
                {
                    view = d;
                    if (c != null)
                    {
                        break label0;
                    }
                }
            }
            return;
        }
        j /= 2;
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        g = false;
        j = f;
        if (j >= 0)
        {
            f = -1;
            a(j, true);
        }
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
        j = getMeasuredWidth();
        k = getChildAt(0).getMeasuredWidth();
        if (k < j)
        {
            super.setPadding((j - k) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            return;
        } else
        {
            super.setPadding(i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            return;
        }
    }

    public void setOnTabClickListener(x x)
    {
        d = x;
    }

    public void setOnTabFocusListener(y y)
    {
        e = y;
    }

    public void setPadding(int j, int k, int l, int i1)
    {
        super.setPadding(j, k, l, i1);
        i = j;
    }
}
