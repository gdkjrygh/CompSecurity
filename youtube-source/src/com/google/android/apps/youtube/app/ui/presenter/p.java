// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.ui.SelectorOnTopFrameLayout;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.g;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.player.internal.b.d;

final class p
    implements i
{

    private final Resources a;
    private final int b;
    private final SelectorOnTopFrameLayout c;
    private final FrameLayout d;
    private final View e;
    private View f;
    private boolean g;

    public p(Context context)
    {
        com.google.android.youtube.player.internal.b.d.a(context);
        a = context.getResources();
        TypedValue typedvalue = new TypedValue();
        context.getTheme().resolveAttribute(com.google.android.youtube.d.a, typedvalue, true);
        b = typedvalue.resourceId;
        g = false;
        c = (SelectorOnTopFrameLayout)View.inflate(context, l.o, null);
        e = c.findViewById(j.eu);
        d = (FrameLayout)c.findViewById(j.T);
        f = c.findViewById(j.aD);
    }

    private void a(float f1, float f2)
    {
        c.setPadding((int)a.getDimension(g.k), (int)f1, (int)a.getDimension(g.l), 0);
        SelectorOnTopFrameLayout selectorontopframelayout = c;
        int i1 = (int)a.getDimension(g.g);
        int k;
        if (f1 <= 0.0F)
        {
            k = 0;
        } else
        {
            k = (int)a.getDimension(g.q);
        }
        selectorontopframelayout.setSelectorMargins(i1, k, (int)a.getDimension(g.h), 0);
    }

    public final View a(f f1)
    {
        if (g)
        {
            c.setSelector(b);
        } else
        {
            c.setSelectorDrawable(null);
        }
        if (f1.a() && f1.b())
        {
            e.setVisibility(8);
            d.setBackgroundResource(h.i);
            a(a.getDimension(g.m), 0.0F);
        } else
        if (f1.a())
        {
            e.setVisibility(8);
            d.setBackgroundResource(h.n);
            a(a.getDimension(g.m), 0.0F);
        } else
        {
            e.setVisibility(0);
            if (f1.b())
            {
                d.setBackgroundResource(h.j);
                a(0.0F, 0.0F);
            } else
            {
                d.setBackgroundResource(h.l);
                a(0.0F, 0.0F);
            }
        }
        return c;
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        boolean flag;
        if (onclicklistener != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        c.setOnClickListener(onclicklistener);
    }

    public final void a(View view)
    {
        d.addView(view, d.indexOfChild(f), f.getLayoutParams());
        d.removeView(f);
        f = view;
    }
}
