// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.l;
import android.util.AttributeSet;

public class b extends android.view.ViewGroup.MarginLayoutParams
{

    public int a;

    public b(int i, int j)
    {
        super(i, j);
        a = 0;
        a = 0x800013;
    }

    public b(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, l.ActionBarLayout);
        a = context.getInt(l.ActionBarLayout_android_layout_gravity, 0);
        context.recycle();
    }

    public b(b b1)
    {
        super(b1);
        a = 0;
        a = b1.a;
    }

    public b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 0;
    }
}
