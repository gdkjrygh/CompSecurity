// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.i;
import com.jiubang.playsdk.main.c;

public class j
{

    private View a;
    private Drawable b;

    public j(View view)
    {
        a = view;
        view.setClickable(true);
    }

    public void a()
    {
        a.invalidate();
    }

    public void a(Context context, AttributeSet attributeset)
    {
        attributeset = context.obtainStyledAttributes(attributeset, i.h);
        b = context.getResources().getDrawable(y.a().b().i());
        if (b instanceof StateListDrawable)
        {
            context = (StateListDrawable)b;
            context.setState(new int[] {
                0x10100a7
            });
            b = context;
        }
        attributeset.recycle();
    }

    public void a(Canvas canvas)
    {
        if (b != null && a.isPressed() && a.isEnabled())
        {
            b.setBounds(a.getPaddingRight(), a.getPaddingTop(), a.getMeasuredWidth() - a.getPaddingRight(), a.getMeasuredHeight() - a.getPaddingBottom());
            b.draw(canvas);
        }
    }
}
