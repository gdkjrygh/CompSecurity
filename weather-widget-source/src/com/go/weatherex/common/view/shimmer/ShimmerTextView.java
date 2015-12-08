// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common.view.shimmer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.go.weatherex.common.view.shimmer:
//            a

public class ShimmerTextView extends TextView
{

    private a a;

    public ShimmerTextView(Context context)
    {
        super(context);
        a = new a(this, getPaint(), null);
        a.a(getCurrentTextColor());
    }

    public ShimmerTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new a(this, getPaint(), attributeset);
        a.a(getCurrentTextColor());
    }

    public ShimmerTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new a(this, getPaint(), attributeset);
        a.a(getCurrentTextColor());
    }

    public void onDraw(Canvas canvas)
    {
        if (a != null)
        {
            a.b();
        }
        super.onDraw(canvas);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (a != null)
        {
            a.a();
        }
    }

    public void setTextColor(int i)
    {
        super.setTextColor(i);
        if (a != null)
        {
            a.a(getCurrentTextColor());
        }
    }

    public void setTextColor(ColorStateList colorstatelist)
    {
        super.setTextColor(colorstatelist);
        if (a != null)
        {
            a.a(getCurrentTextColor());
        }
    }
}
