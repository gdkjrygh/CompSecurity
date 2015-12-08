// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.weather.commons.ui.fonts.TypeFaceUtils;

public class ActionButtonWithFont extends Button
{

    private static final String TAG = "ActionButtonWithFont";

    public ActionButtonWithFont(Context context)
    {
        this(context, null);
    }

    public ActionButtonWithFont(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActionButtonWithFont(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        setTypeface(TypeFaceUtils.getCustomViewFont("ActionButtonWithFont", context, attributeset, com.weather.commons.R.styleable.TextViewWithFont_font));
    }
}
