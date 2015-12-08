// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.jiubang.playsdk.f;
import com.jiubang.playsdk.i;

public class ContentFrame extends FrameLayout
{

    private ViewGroup a;
    private final LayoutInflater b;

    public ContentFrame(Context context)
    {
        this(context, null, 0);
    }

    public ContentFrame(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ContentFrame(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        attributeset = context.obtainStyledAttributes(attributeset, i.a);
        b = (LayoutInflater)context.getSystemService("layout_inflater");
        context = b.inflate(f.c, this, false);
        ((android.widget.FrameLayout.LayoutParams)context.getLayoutParams()).gravity = 17;
        context.setVisibility(8);
        addView(context);
        context = b.inflate(f.a, this, false);
        context.setVisibility(8);
        addView(context);
        attributeset.recycle();
    }

    public ViewGroup a()
    {
        return a;
    }

    public void a(LayoutInflater layoutinflater, int j)
    {
        if (j != 0)
        {
            a = (ViewGroup)layoutinflater.inflate(j, this, false);
            if (a != null)
            {
                addView(a);
                return;
            }
        }
    }
}
