// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.kd;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneButton, PlusOneDummyView

public final class PlusOneButtonWithPopup extends ViewGroup
{

    private View a;
    private int b;
    private int c;
    private android.view.View.OnClickListener d;
    private String e;
    private String f;

    public PlusOneButtonWithPopup(Context context)
    {
        this(context, null);
    }

    public PlusOneButtonWithPopup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = PlusOneButton.a(context, attributeset);
        c = PlusOneButton.b(context, attributeset);
        a = new PlusOneDummyView(context, b);
        addView(a);
    }

    private static int a(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(i);
        switch (k)
        {
        default:
            return i;

        case -2147483648: 
        case 1073741824: 
            return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i) - j, k);
        }
    }

    private void a()
    {
        if (a != null)
        {
            removeView(a);
        }
        a = kd.a(getContext(), b, c, e, f);
        if (d != null)
        {
            setOnClickListener(d);
        }
        addView(a);
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.layout(getPaddingLeft(), getPaddingTop(), k - i - getPaddingRight(), l - j - getPaddingBottom());
    }

    protected final void onMeasure(int i, int j)
    {
        int k = getPaddingLeft() + getPaddingRight();
        int l = getPaddingTop() + getPaddingBottom();
        a.measure(a(i, k), a(j, l));
        setMeasuredDimension(k + a.getMeasuredWidth(), l + a.getMeasuredHeight());
    }

    public final void setAnnotation(int i)
    {
        c = i;
        a();
    }

    public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d = onclicklistener;
        a.setOnClickListener(onclicklistener);
    }

    public final void setSize(int i)
    {
        b = i;
        a();
    }
}
