// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.g;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;

public final class ae extends a
{

    private final Context a;
    private final i b;
    private final LinearLayout c;
    private final gr d;
    private final FrameLayout e;
    private final TextView f;
    private final int g;

    public ae(Context context, bj bj, i i1, com.google.android.apps.youtube.datalib.d.a a1)
    {
        super(a1, i1);
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (i)com.google.android.apps.youtube.common.fromguava.c.a(i1);
        c = (LinearLayout)LayoutInflater.from(context).inflate(l.y, null);
        d = new gr(bj, (ImageView)c.findViewById(j.fy));
        e = (FrameLayout)c.findViewById(j.fA);
        f = (TextView)c.findViewById(j.fF);
        context = context.getResources();
        g = (int)com.google.android.apps.youtube.core.utils.l.a(context.getDisplayMetrics(), context.getDimension(g.D));
        i1.a(c);
    }

    private View a(f f1, com.google.android.apps.youtube.datalib.innertube.model.g g1)
    {
        super.a(f1, g1);
        Resources resources = a.getResources();
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)e.getLayoutParams();
        layoutparams.weight = resources.getInteger(k.f);
        if (f1.d() >= g)
        {
            c.setOrientation(0);
            layoutparams.rightMargin = (int)resources.getDimension(g.C);
        } else
        {
            c.setOrientation(1);
            layoutparams.rightMargin = 0;
        }
        d.a(g1.b());
        f.setText(g1.a());
        return b.a(f1);
    }

    public final volatile View a(f f1, u u)
    {
        return a(f1, (com.google.android.apps.youtube.datalib.innertube.model.g)u);
    }

    public final volatile View a(f f1, Object obj)
    {
        return a(f1, (com.google.android.apps.youtube.datalib.innertube.model.g)obj);
    }
}
