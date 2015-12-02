// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class TrayWrapperLayout extends LinearLayout
{

    private List a;

    public TrayWrapperLayout(Context context)
    {
        super(context);
    }

    public TrayWrapperLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TrayWrapperLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void b()
    {
        int i;
        if (a == null)
        {
            a = new ArrayList();
        } else
        {
            a.clear();
        }
        i = 0;
        while (i < getChildCount()) 
        {
            android.view.View view = getChildAt(i);
            if (view instanceof TrayWrapperLayout)
            {
                a.addAll(((TrayWrapperLayout)view).a());
            } else
            {
                a.add(view);
            }
            i++;
        }
    }

    public final List a()
    {
        if (a == null)
        {
            b();
        }
        return a;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b();
    }
}
