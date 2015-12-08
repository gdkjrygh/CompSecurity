// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.innertube.model.f;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;

public final class ac extends a
{

    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final gr f;
    private final View g;
    private final View h;
    private final Context i;
    private final v j;
    private final i k;

    public ac(Context context, bj bj, i i1, com.google.android.apps.youtube.datalib.d.a a1, v v1)
    {
        super(a1, i1);
        i = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        k = (i)com.google.android.apps.youtube.common.fromguava.c.a(i1);
        j = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        a = LayoutInflater.from(context).inflate(l.x, null);
        b = (TextView)a.findViewById(j.fF);
        c = (TextView)a.findViewById(j.da);
        d = (TextView)a.findViewById(j.fV);
        e = (TextView)a.findViewById(j.fW);
        f = new gr(bj, (ImageView)a.findViewById(j.fy));
        g = a.findViewById(j.fA);
        h = a.findViewById(j.aE);
        i1.a(a);
    }

    private View a(com.google.android.apps.youtube.uilib.a.f f1, f f2)
    {
        super.a(f1, f2);
        ((android.widget.LinearLayout.LayoutParams)g.getLayoutParams()).weight = i.getResources().getInteger(k.e);
        b.setText(f2.b());
        d.setText(f2.d());
        if (f2.c() == null)
        {
            c.setVisibility(8);
        } else
        {
            c.setVisibility(0);
            c.setText(f2.c());
        }
        if (f2.f() == null)
        {
            e.setVisibility(8);
        } else
        {
            e.setText(f2.f());
            e.setVisibility(0);
        }
        f.a(f2.g());
        h.setVisibility(0);
        ad.a(j, h, f2);
        return k.a(f1);
    }

    public final volatile View a(com.google.android.apps.youtube.uilib.a.f f1, u u)
    {
        return a(f1, (f)u);
    }

    public final volatile View a(com.google.android.apps.youtube.uilib.a.f f1, Object obj)
    {
        return a(f1, (f)obj);
    }
}
