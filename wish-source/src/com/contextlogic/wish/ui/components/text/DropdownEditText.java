// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class DropdownEditText extends AutoCompleteTextView
{

    public DropdownEditText(Context context)
    {
        super(context);
    }

    public DropdownEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public DropdownEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean enoughToFilter()
    {
        return true;
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (flag)
        {
            performFiltering("", 0);
            showDropDown();
        }
    }
}
