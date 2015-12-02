// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class hrd extends hi
{

    private final int a;
    private final Drawable b;
    private final int c;

    public hrd(Drawable drawable, int i, int j)
    {
        b = drawable;
        a = i;
        c = j;
    }

    private void b(Canvas canvas, RecyclerView recyclerview)
    {
        int k = recyclerview.getPaddingLeft();
        int l = recyclerview.getWidth();
        int i1 = recyclerview.getPaddingRight();
        int j1 = recyclerview.getChildCount();
        int i = 0;
        while (i < j1) 
        {
            View view = recyclerview.getChildAt(i);
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
            int k1 = view.getBottom() + layoutparams.bottomMargin;
            int j;
            if (a >= 0)
            {
                j = a;
            } else
            {
                j = b.getIntrinsicHeight();
            }
            b.setBounds(k, k1, l - i1, j + k1);
            b.draw(canvas);
            i++;
        }
    }

    private void c(Canvas canvas, RecyclerView recyclerview)
    {
        int k = recyclerview.getPaddingTop();
        int l = recyclerview.getHeight();
        int i1 = recyclerview.getPaddingBottom();
        int j1 = recyclerview.getChildCount();
        int i = 0;
        while (i < j1) 
        {
            View view = recyclerview.getChildAt(i);
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
            int k1 = view.getRight() + layoutparams.rightMargin;
            int j;
            if (a >= 0)
            {
                j = a;
            } else
            {
                j = b.getIntrinsicWidth();
            }
            b.setBounds(k1, k, j + k1, l - i1);
            b.draw(canvas);
            i++;
        }
    }

    public final void a(Canvas canvas, RecyclerView recyclerview)
    {
        if (c == hre.b)
        {
            b(canvas, recyclerview);
            return;
        } else
        {
            c(canvas, recyclerview);
            return;
        }
    }

    public final void a(Rect rect, View view)
    {
        if (c == hre.b)
        {
            int i;
            if (a >= 0)
            {
                i = a;
            } else
            {
                i = b.getIntrinsicHeight();
            }
            rect.set(0, 0, 0, i);
            return;
        }
        int j;
        if (a >= 0)
        {
            j = a;
        } else
        {
            j = b.getIntrinsicWidth();
        }
        rect.set(0, 0, j, 0);
    }
}
