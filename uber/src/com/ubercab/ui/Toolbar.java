// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import ex;
import hoq;
import hos;
import hox;
import ijt;
import java.lang.reflect.Field;

public class Toolbar extends android.support.v7.widget.Toolbar
{

    private static final int b[];
    private Typeface c;
    private Typeface d;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, hos.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = ex.a(getContext(), attributeset, hox.Toolbar, i);
        i = context.f(hox.Toolbar_titleTextAppearance, 0);
        if (i > 0)
        {
            attributeset = getContext().obtainStyledAttributes(i, b);
            i = attributeset.getResourceId(0, 0);
            if (i > 0)
            {
                c = hoq.a(getContext(), i);
            }
            attributeset.recycle();
        }
        i = context.f(hox.Toolbar_subtitleTextAppearance, 0);
        if (i > 0)
        {
            attributeset = getContext().obtainStyledAttributes(i, b);
            i = attributeset.getResourceId(0, 0);
            if (i > 0)
            {
                d = hoq.a(getContext(), i);
            }
            attributeset.recycle();
        }
        context.b();
        if (i() != null && i().length() > 0)
        {
            a(i());
        }
        if (j() != null && j().length() > 0)
        {
            b(j());
        }
    }

    public final void a(CharSequence charsequence)
    {
        super.a(charsequence);
        if (c == null || charsequence == null || charsequence.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        charsequence = android/support/v7/widget/Toolbar.getDeclaredField("c");
        charsequence.setAccessible(true);
        ijt.a((TextView)charsequence.get(this), c);
        return;
        charsequence;
        return;
        charsequence;
    }

    public final void b(CharSequence charsequence)
    {
        super.b(charsequence);
        if (d == null || charsequence == null || charsequence.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        charsequence = android/support/v7/widget/Toolbar.getDeclaredField("d");
        charsequence.setAccessible(true);
        ijt.a((TextView)charsequence.get(this), d);
        return;
        charsequence;
        return;
        charsequence;
    }

    static 
    {
        b = (new int[] {
            hos.fontPath
        });
    }
}
