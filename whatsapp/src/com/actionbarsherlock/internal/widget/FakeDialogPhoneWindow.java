// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.LinearLayout;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView

public class FakeDialogPhoneWindow extends LinearLayout
{

    final TypedValue mMinWidthMajor = new TypedValue();
    final TypedValue mMinWidthMinor = new TypedValue();

    public FakeDialogPhoneWindow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockTheme);
        context.getValue(com.actionbarsherlock.R.styleable.SherlockTheme_windowMinWidthMajor, mMinWidthMajor);
        context.getValue(com.actionbarsherlock.R.styleable.SherlockTheme_windowMinWidthMinor, mMinWidthMinor);
        context.recycle();
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag;
        boolean flag1;
        int k;
        flag1 = false;
        int l = AbsActionBarView.b;
        DisplayMetrics displaymetrics = getContext().getResources().getDisplayMetrics();
        TypedValue typedvalue;
        int i1;
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super.onMeasure(i, j);
        i1 = getMeasuredWidth();
        k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        if (flag)
        {
            typedvalue = mMinWidthMinor;
        } else
        {
            typedvalue = mMinWidthMajor;
        }
        if (typedvalue.type == 0) goto _L2; else goto _L1
_L1:
label0:
        {
            if (typedvalue.type == 5)
            {
                i = (int)typedvalue.getDimension(displaymetrics);
                if (l == 0)
                {
                    break label0;
                }
            }
            if (typedvalue.type == 6)
            {
                i = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
                if (l == 0)
                {
                    break label0;
                }
            }
            i = 0;
        }
        if (i1 >= i) goto _L2; else goto _L3
_L3:
        i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        flag = true;
_L5:
        if (flag)
        {
            super.onMeasure(i, j);
        }
        return;
_L2:
        i = k;
        flag = flag1;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
