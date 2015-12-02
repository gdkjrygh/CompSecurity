// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import chm;
import com.ubercab.ui.TextView;

public class DividerWithText extends LinearLayout
{

    private final int a;
    private String b;
    TextView mTextViewText;

    public DividerWithText(Context context)
    {
        this(context, null);
    }

    public DividerWithText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DividerWithText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        inflate(context, 0x7f030219, this);
        attributeset = context.obtainStyledAttributes(attributeset, chm.DividerWithText);
        context = attributeset.getString(1);
        if (isInEditMode()) goto _L2; else goto _L1
_L1:
        b = context;
_L3:
        a = attributeset.getResourceId(5, -1);
        attributeset.recycle();
        return;
_L2:
        if (context == null)
        {
            context = "Text";
        }
        b = context;
          goto _L3
        context;
        attributeset.recycle();
        throw context;
    }

    private void a()
    {
        if (isInEditMode())
        {
            return;
        }
        if (a != -1)
        {
            mTextViewText.setCompoundDrawablesWithIntrinsicBounds(a, 0, 0, 0);
        }
        mTextViewText.setText(b);
    }

    public final void a(String s)
    {
        b = s;
        a();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        a();
    }
}
