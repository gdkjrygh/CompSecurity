// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.util.AttributeSet;
import com.go.gl.widget.GLTextViewWrapper;

public class CustomTextViewWrapper extends GLTextViewWrapper
{

    public CustomTextViewWrapper(Context context)
    {
        super(context, null);
    }

    public CustomTextViewWrapper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
    }

    public CustomTextViewWrapper(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void setText(CharSequence charsequence)
    {
        super.setText(charsequence);
        requestLayout();
    }
}
