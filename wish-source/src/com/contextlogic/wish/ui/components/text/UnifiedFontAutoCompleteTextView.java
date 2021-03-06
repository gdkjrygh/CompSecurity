// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.contextlogic.wish.cache.TransientCache;

public class UnifiedFontAutoCompleteTextView extends AutoCompleteTextView
{

    public UnifiedFontAutoCompleteTextView(Context context)
    {
        super(context);
        init();
    }

    public UnifiedFontAutoCompleteTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public UnifiedFontAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        Typeface typeface;
        int i;
        if (getTypeface() != null)
        {
            i = getTypeface().getStyle();
        } else
        {
            i = 0;
        }
        typeface = TransientCache.getInstance().getTypefaceForStyle(getContext(), i);
        if (typeface != null)
        {
            setTypeface(typeface);
        }
    }
}
