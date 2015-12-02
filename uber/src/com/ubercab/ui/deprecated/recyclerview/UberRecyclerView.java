// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.deprecated.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import hrd;
import hre;

public class UberRecyclerView extends RecyclerView
{

    private static final int h[] = {
        0x1010214
    };
    private static final int i[] = {
        0x101012a
    };

    public UberRecyclerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
    }

    public UberRecyclerView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a(attributeset, j);
    }

    private void a(AttributeSet attributeset, int j)
    {
        getContext();
        a(((hk) (new LinearLayoutManager())));
        TypedArray typedarray = getContext().obtainStyledAttributes(attributeset, h, 0, j);
        android.graphics.drawable.Drawable drawable = typedarray.getDrawable(0);
        typedarray.recycle();
        j = getContext().obtainStyledAttributes(attributeset, i, 0, j).getDimensionPixelSize(0, -1);
        if (drawable == null)
        {
            throw new RuntimeException("There is no divider provided by the AttrubuteSet");
        } else
        {
            a(((hi) (new hrd(drawable, j, hre.b))));
            return;
        }
    }

}
