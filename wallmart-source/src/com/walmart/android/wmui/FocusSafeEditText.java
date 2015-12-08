// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class FocusSafeEditText extends EditText
{

    private android.view.View.OnFocusChangeListener mFocusListener;

    public FocusSafeEditText(Context context)
    {
        super(context);
    }

    public FocusSafeEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FocusSafeEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public FocusSafeEditText(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mFocusListener != null)
        {
            setOnFocusChangeListener(mFocusListener);
            mFocusListener = null;
        }
    }

    public void onFinishTemporaryDetach()
    {
        super.onFinishTemporaryDetach();
        if (mFocusListener != null)
        {
            setOnFocusChangeListener(mFocusListener);
            mFocusListener = null;
        }
    }

    public void onStartTemporaryDetach()
    {
        super.onStartTemporaryDetach();
        mFocusListener = getOnFocusChangeListener();
        setOnFocusChangeListener(null);
    }
}
