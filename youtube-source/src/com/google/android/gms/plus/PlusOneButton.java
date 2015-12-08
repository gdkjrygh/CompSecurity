// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.gk;
import com.google.android.gms.internal.kd;

// Referenced classes of package com.google.android.gms.plus:
//            a, b

public final class PlusOneButton extends FrameLayout
{

    private View a;
    private int b;
    private int c;
    private String d;
    private int e;
    private b f;

    public PlusOneButton(Context context)
    {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = a(context, attributeset);
        c = b(context, attributeset);
        e = -1;
        a(getContext());
        if (!isInEditMode());
    }

    protected static int a(Context context, AttributeSet attributeset)
    {
        context = gk.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeset, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(context))
        {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(context))
        {
            return 1;
        }
        return !"TALL".equalsIgnoreCase(context) ? 3 : 2;
    }

    static View a(PlusOneButton plusonebutton)
    {
        return plusonebutton.a;
    }

    private void a(Context context)
    {
        if (a != null)
        {
            removeView(a);
        }
        a = kd.a(context, b, c, d, e);
        setOnPlusOneClickListener(f);
        addView(a);
    }

    protected static int b(Context context, AttributeSet attributeset)
    {
        byte byte0 = 0;
        context = gk.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeset, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(context))
        {
            byte0 = 2;
        } else
        if (!"NONE".equalsIgnoreCase(context))
        {
            return 1;
        }
        return byte0;
    }

    static int b(PlusOneButton plusonebutton)
    {
        return plusonebutton.e;
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.layout(0, 0, k - i, l - j);
    }

    protected final void onMeasure(int i, int j)
    {
        View view = a;
        measureChild(view, i, j);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void setAnnotation(int i)
    {
        c = i;
        a(getContext());
    }

    public final void setOnPlusOneClickListener(b b1)
    {
        f = b1;
        a.setOnClickListener(new a(this, b1));
    }

    public final void setSize(int i)
    {
        b = i;
        a(getContext());
    }
}
