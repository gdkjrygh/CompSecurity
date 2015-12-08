// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.jiubang.playsdk.i;

// Referenced classes of package com.jiubang.playsdk.views:
//            TouchMaskFrameLayout

public class ProportionFrameLayout extends TouchMaskFrameLayout
{

    public float a;
    private boolean b;
    private boolean c;

    public ProportionFrameLayout(Context context)
    {
        this(context, null);
    }

    public ProportionFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 1.0F;
        b = true;
        c = true;
        context = context.obtainStyledAttributes(attributeset, i.e);
        a = context.getFloat(i.f, 1.0F);
        context.recycle();
    }

    public void a(float f)
    {
        a = f;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void b(boolean flag)
    {
        c = flag;
    }

    protected void onMeasure(int j, int k)
    {
        if (!c)
        {
            super.onMeasure(j, k);
            return;
        }
        if (b)
        {
            if (android.view.View.MeasureSpec.getMode(k) == 0x40000000)
            {
                super.onMeasure(j, k);
                return;
            } else
            {
                k = android.view.View.MeasureSpec.getSize(j);
                int l = (int)((float)k * a);
                setMeasuredDimension(k, l);
                super.onMeasure(j, android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000));
                return;
            }
        }
        if (android.view.View.MeasureSpec.getMode(j) == 0x40000000)
        {
            super.onMeasure(j, k);
            return;
        } else
        {
            j = android.view.View.MeasureSpec.getSize(k);
            int i1 = (int)((float)j / a);
            setMeasuredDimension(i1, j);
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), k);
            return;
        }
    }
}
