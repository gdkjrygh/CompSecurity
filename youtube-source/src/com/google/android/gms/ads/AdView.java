// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.m;

// Referenced classes of package com.google.android.gms.ads:
//            c, a

public final class AdView extends ViewGroup
{

    private final m a;

    public AdView(Context context)
    {
        super(context);
        a = new m(this);
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new m(this, attributeset, false);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new m(this, attributeset, false);
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = getChildAt(0);
        if (view != null && view.getVisibility() != 8)
        {
            int i1 = view.getMeasuredWidth();
            int j1 = view.getMeasuredHeight();
            i = (k - i - i1) / 2;
            j = (l - j - j1) / 2;
            view.layout(i, j, i1 + i, j1 + j);
        }
    }

    protected final void onMeasure(int i, int j)
    {
        int k = 0;
        View view = getChildAt(0);
        c c1 = a.a();
        int l;
        if (view != null && view.getVisibility() != 8)
        {
            measureChild(view, i, j);
            l = view.getMeasuredWidth();
            k = view.getMeasuredHeight();
        } else
        if (c1 != null)
        {
            Context context = getContext();
            l = c1.b(context);
            k = c1.a(context);
        } else
        {
            l = 0;
        }
        l = Math.max(l, getSuggestedMinimumWidth());
        k = Math.max(k, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSize(l, i), View.resolveSize(k, j));
    }

    public final void setAdListener(a a1)
    {
        a.a(a1);
    }

    public final void setAdSize(c c1)
    {
        a.a(new c[] {
            c1
        });
    }

    public final void setAdUnitId(String s)
    {
        a.a(s);
    }
}
