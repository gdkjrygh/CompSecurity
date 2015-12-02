// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import fit;
import fiu;

public class ShoppingMenuRecyclerView extends RecyclerView
{

    fiu h;
    boolean i;
    private final Resources j;
    private final int k;
    private fit l;
    private int m;

    public ShoppingMenuRecyclerView(Context context)
    {
        this(context, null, 0);
    }

    public ShoppingMenuRecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ShoppingMenuRecyclerView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        j = getContext().getResources();
        k = j.getDimensionPixelSize(0x7f080222) + j.getDimensionPixelSize(0x7f0802da);
        h = u();
        a(h);
    }

    static int a(ShoppingMenuRecyclerView shoppingmenurecyclerview)
    {
        return shoppingmenurecyclerview.m;
    }

    static int b(ShoppingMenuRecyclerView shoppingmenurecyclerview)
    {
        return shoppingmenurecyclerview.k;
    }

    private void t()
    {
        i = false;
    }

    private fiu u()
    {
        v();
        return new fiu(this, m + k);
    }

    private void v()
    {
        Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        m = point.y - j.getDimensionPixelSize(0x7f080220) - j.getDimensionPixelSize(0x7f080056) - j.getDimensionPixelSize(0x7f0802dc);
    }

    public final void a(fit fit1)
    {
        l = fit1;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        t();
        return super.dispatchTouchEvent(motionevent);
    }

    public final void f(int i1)
    {
        h.b(i1);
    }

    public final void n()
    {
        postDelayed(new Runnable() {

            final ShoppingMenuRecyclerView a;

            public final void run()
            {
                a.h.c(ShoppingMenuRecyclerView.a(a) + ShoppingMenuRecyclerView.b(a));
            }

            
            {
                a = ShoppingMenuRecyclerView.this;
                super();
            }
        }, 1L);
    }

    public final boolean o()
    {
        return h.a();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (i)
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    final void p()
    {
        i = true;
    }

    public final void q()
    {
        postDelayed(new Runnable() {

            final ShoppingMenuRecyclerView a;

            public final void run()
            {
                a.a(0);
            }

            
            {
                a = ShoppingMenuRecyclerView.this;
                super();
            }
        }, 1L);
    }

    public final void r()
    {
        if (l != null)
        {
            l.a();
        }
    }

    public final void s()
    {
        if (l != null)
        {
            l.b();
        }
    }
}
