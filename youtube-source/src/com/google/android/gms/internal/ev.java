// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            ew

final class ev extends Drawable
{

    private static final ev a = new ev();
    private static final ew b = new ew((byte)0);

    private ev()
    {
    }

    static ev a()
    {
        return a;
    }

    public final void draw(Canvas canvas)
    {
    }

    public final android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return b;
    }

    public final int getOpacity()
    {
        return -2;
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }

}
