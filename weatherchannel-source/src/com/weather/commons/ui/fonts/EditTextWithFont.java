// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui.fonts;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

// Referenced classes of package com.weather.commons.ui.fonts:
//            TypeFaceUtils

public class EditTextWithFont extends EditText
{

    private static final String TAG = "EditTextWithFont";

    public EditTextWithFont(Context context)
    {
        this(context, null);
    }

    public EditTextWithFont(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EditTextWithFont(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        setTypeface(TypeFaceUtils.getCustomViewFont("EditTextWithFont", context, attributeset, com.weather.commons.R.styleable.TextViewWithFont_font));
    }
}
