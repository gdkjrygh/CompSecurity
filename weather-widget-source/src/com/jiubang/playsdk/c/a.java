// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.b;
import com.jiubang.playsdk.c;
import com.jiubang.playsdk.d;
import com.jiubang.playsdk.h;

// Referenced classes of package com.jiubang.playsdk.c:
//            b, f, c

public abstract class a extends com.jiubang.playsdk.c.b
{

    protected f a;
    protected com.jiubang.playsdk.c.c b;

    public a(Context context)
    {
        c = context;
        a(context);
    }

    private void a(Context context)
    {
        a = new f(context);
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -2);
        a.setLayoutParams(layoutparams);
        a.setOnKeyListener(this);
        a.setBackgroundResource(d.i);
        a.setDivider(new ColorDrawable(c.getResources().getColor(b.b)));
        a.setDividerHeight(c.getResources().getDimensionPixelSize(c.a));
        a.setVerticalScrollBarEnabled(false);
        a.setHorizontalScrollBarEnabled(false);
        a.setAlwaysDrawnWithCacheEnabled(true);
        a.setSelectionAfterHeaderView();
        a.setSmoothScrollbarEnabled(true);
        a.setSelector(y.a().b().i());
        b = new com.jiubang.playsdk.c.c(context);
        a.setAdapter(b);
    }

    private void a(PopupWindow popupwindow)
    {
        if (popupwindow != null)
        {
            popupwindow.setAnimationStyle(h.a);
        }
    }

    public void a()
    {
        if (d != null)
        {
            d.dismiss();
        }
    }

    public void a(View view, int i, int j, int k, int l)
    {
        a.clearFocus();
        if (d != null && b())
        {
            a();
            return;
        } else
        {
            d = new PopupWindow(a, k, l, true);
            a(d);
            a.a(this);
            d.setFocusable(false);
            d.showAtLocation(view, 53, i, c.getResources().getDimensionPixelSize(c.b) + j);
            d.setFocusable(true);
            d.update();
            return;
        }
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        a.setOnItemClickListener(onitemclicklistener);
    }

    public void a(int ai[])
    {
        if (ai != null)
        {
            b.a(ai);
        }
        b.notifyDataSetChanged();
    }

    public boolean b()
    {
        if (d != null)
        {
            return d.isShowing();
        } else
        {
            return false;
        }
    }
}
