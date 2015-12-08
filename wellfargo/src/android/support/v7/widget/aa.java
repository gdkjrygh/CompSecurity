// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.l;
import android.util.AttributeSet;

public class aa extends android.view.ViewGroup.MarginLayoutParams
{

    public float g;
    public int h;

    public aa(int i, int j)
    {
        super(i, j);
        h = -1;
        g = 0.0F;
    }

    public aa(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1;
        context = context.obtainStyledAttributes(attributeset, l.LinearLayoutCompat_Layout);
        g = context.getFloat(l.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
        h = context.getInt(l.LinearLayoutCompat_Layout_android_layout_gravity, -1);
        context.recycle();
    }

    public aa(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        h = -1;
    }
}
