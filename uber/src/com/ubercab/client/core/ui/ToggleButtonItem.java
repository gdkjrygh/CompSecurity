// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import gjz;

public class ToggleButtonItem extends LinearLayout
{

    TextView mTagline;
    TextView mTitle;

    public ToggleButtonItem(Context context)
    {
        this(context, null);
    }

    public ToggleButtonItem(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ToggleButtonItem(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(int i)
    {
        mTagline.setTextColor(i);
    }

    public final void a(String s)
    {
        mTitle.setText((CharSequence)gjz.a(s));
    }

    public final void b(int i)
    {
        mTitle.setTextColor(i);
    }

    public final void b(String s)
    {
        mTagline.setText((CharSequence)gjz.a(s));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
        }
    }
}
