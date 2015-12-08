// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.internal.text.AllCapsTransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import com.contextlogic.wish.cache.TransientCache;

public class UnifiedFontButton extends Button
{

    public UnifiedFontButton(Context context)
    {
        super(context);
        init(null);
    }

    public UnifiedFontButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(attributeset);
    }

    public UnifiedFontButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(attributeset);
    }

    private void init(AttributeSet attributeset)
    {
        int i = 0;
        setTransformationMethod(null);
        if (attributeset != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, com.contextlogic.wish.R.styleable.WishTextView);
            if (attributeset.getBoolean(0, false))
            {
                setTransformationMethod(new AllCapsTransformationMethod(getContext()));
            }
            attributeset.recycle();
        }
        if (getTypeface() != null)
        {
            i = getTypeface().getStyle();
        }
        attributeset = TransientCache.getInstance().getTypefaceForStyle(getContext(), i);
        if (attributeset != null)
        {
            setTypeface(attributeset);
        }
    }

    public void restoreNormalTypeface()
    {
        Typeface typeface = TransientCache.getInstance().getTypefaceForStyle(getContext(), 0);
        if (typeface != null)
        {
            setTypeface(typeface);
        }
    }
}
