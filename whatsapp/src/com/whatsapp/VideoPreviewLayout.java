// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.whatsapp:
//            App

public class VideoPreviewLayout extends ViewGroup
{

    public VideoPreviewLayout(Context context)
    {
        super(context);
    }

    public VideoPreviewLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public VideoPreviewLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
label0:
        {
            int j1 = k - i;
            int i1 = l - j;
            View view2 = findViewById(0x7f0b00e8);
            View view1 = findViewById(0x7f0b00e9);
            View view = view1;
            if (view1.getVisibility() == 8)
            {
                view = findViewById(0x7f0b012a);
            }
            view1 = findViewById(0x7f0b02be);
            View view3 = findViewById(0x7f0b02c1);
            if (i1 > j1)
            {
                int k1 = view.getMeasuredHeight();
                int i2 = view1.getMeasuredHeight();
                int k2 = view3.getMeasuredHeight();
                view2.layout(i, j, k, j + k1);
                view1.layout(i, j + k1, k, j + k1 + i2);
                view3.layout(i, j + k1 + i2, k, k1 + j + i2 + k2);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            k = view.getMeasuredWidth() + view2.getPaddingLeft() + view2.getPaddingRight();
            i = (j1 - (j1 / 2 + k)) / 2 + i;
            view2.layout(i, j, i + k, l);
            l = view1.getMeasuredHeight();
            j1 = view1.getMeasuredWidth();
            int l1 = view3.getMeasuredHeight();
            int j2 = view3.getMeasuredWidth();
            i1 = (i1 - l - l1) / 2;
            view1.layout(i + k, j + i1, j1 + (i + k), j + i1 + l);
            view3.layout(i + k, j + i1 + l, k + i + j2, j + i1 + l + l1);
        }
    }

    protected void onMeasure(int i, int j)
    {
label0:
        {
            super.onMeasure(i, j);
            int k = getMeasuredWidth();
            int l = getMeasuredHeight();
            View view = findViewById(0x7f0b00e8);
            View view1 = findViewById(0x7f0b02be);
            View view2 = findViewById(0x7f0b02c1);
            if (l > k)
            {
                view1.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                view2.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(l - view1.getMeasuredHeight() - view2.getMeasuredHeight(), 0x40000000));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k / 2, 0x80000000), j);
            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(k / 2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(k / 2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }
}
