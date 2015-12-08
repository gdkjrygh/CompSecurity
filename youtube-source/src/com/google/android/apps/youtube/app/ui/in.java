// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.youtube.h;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            is, io, ij

final class in
    implements is
{

    final ij a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final View e;

    public in(ij ij1, View view)
    {
        a = ij1;
        super();
        b = (View)com.google.android.apps.youtube.common.fromguava.c.a(view);
        c = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)b.findViewById(j.aJ));
        d = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)b.findViewById(j.aH));
        e = (View)com.google.android.apps.youtube.common.fromguava.c.a(b.findViewById(j.eu));
        c.setOnClickListener(new io(this, ij1));
    }

    public final void a()
    {
    }

    public final void a(CharSequence charsequence)
    {
    }

    public final void a(CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2)
    {
    }

    public final void a(boolean flag)
    {
    }

    public final void a(boolean flag, x x)
    {
    }

    public final void b(CharSequence charsequence)
    {
        if (d != null)
        {
            d.setText(charsequence);
            a.c(b);
        }
    }

    public final void b(boolean flag)
    {
        int i;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (flag)
        {
            k = h.e;
            i = h.o;
            e.setVisibility(0);
            d.setVisibility(0);
        } else
        {
            k = h.d;
            i = h.m;
            e.setVisibility(8);
            d.setVisibility(8);
        }
        l = c.getPaddingLeft();
        i1 = c.getPaddingTop();
        j1 = c.getPaddingRight();
        k1 = c.getPaddingBottom();
        c.setCompoundDrawablesWithIntrinsicBounds(0, 0, k, 0);
        c.setBackgroundResource(i);
        c.setPadding(l, i1, j1, k1);
        a.c(b);
    }
}
