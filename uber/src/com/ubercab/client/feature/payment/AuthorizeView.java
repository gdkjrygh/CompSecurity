// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class AuthorizeView extends LinearLayout
{

    TextView mTextViewMessage;

    public AuthorizeView(Context context)
    {
        this(context, null);
    }

    public AuthorizeView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AuthorizeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(String s)
    {
        mTextViewMessage.setText(s);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }
}
