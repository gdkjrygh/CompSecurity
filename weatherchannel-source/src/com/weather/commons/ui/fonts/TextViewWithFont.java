// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui.fonts;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.weather.commons.ui.fonts:
//            TypeFaceUtils

public class TextViewWithFont extends TextView
{

    private static final String TAG = "TextViewWithFont";

    public TextViewWithFont(Context context)
    {
        this(context, null);
    }

    public TextViewWithFont(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TextViewWithFont(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        setTypeface(TypeFaceUtils.getCustomViewFont("TextViewWithFont", context, attributeset, com.weather.commons.R.styleable.TextViewWithFont_font));
    }
}
