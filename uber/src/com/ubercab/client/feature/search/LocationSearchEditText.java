// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.content.Context;
import android.util.AttributeSet;
import com.ubercab.ui.EditText;

public class LocationSearchEditText extends EditText
{

    private boolean a;

    public LocationSearchEditText(Context context)
    {
        super(context);
        a = false;
    }

    public LocationSearchEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
    }

    public LocationSearchEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = false;
    }

    public final void a()
    {
        selectAll();
        a = true;
    }

    public final void a(String s)
    {
        setText(s);
        a();
    }

    public boolean onPreDraw()
    {
        boolean flag = super.onPreDraw();
        if (a)
        {
            setScrollX(0);
        }
        return flag;
    }

    protected void onSelectionChanged(int i, int j)
    {
        super.onSelectionChanged(i, j);
        a = false;
    }
}
