// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.utils.l;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.apps.youtube.datalib.innertube.model.h;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.g;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.p;

public final class ag extends a
{

    private final LinearLayout a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final gr f;
    private final RelativeLayout g;
    private final View h;
    private final Context i;
    private final v j;
    private final i k;
    private final int l;

    public ag(Context context, bj bj, i i1, com.google.android.apps.youtube.datalib.d.a a1, v v1)
    {
        super(a1, i1);
        i = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        k = (i)com.google.android.apps.youtube.common.fromguava.c.a(i1);
        j = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        a1 = context.getResources();
        l = (int)com.google.android.apps.youtube.core.utils.l.a(a1.getDisplayMetrics(), a1.getDimension(g.F));
        a = (LinearLayout)View.inflate(context, com.google.android.youtube.l.z, null);
        b = (TextView)a.findViewById(j.fF);
        c = (TextView)a.findViewById(j.aP);
        d = (TextView)a.findViewById(j.y);
        e = (TextView)a.findViewById(j.aK);
        f = new gr(bj, (ImageView)a.findViewById(j.fy));
        g = (RelativeLayout)a.findViewById(j.fA);
        h = a.findViewById(j.aE);
        i1.a(a);
    }

    private View a(f f1, h h1)
    {
        super.a(f1, h1);
        Resources resources = i.getResources();
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)g.getLayoutParams();
        layoutparams.weight = resources.getInteger(k.g);
        if (f1.d() >= l)
        {
            a.setOrientation(0);
            layoutparams.rightMargin = (int)resources.getDimension(g.E);
        } else
        {
            a.setOrientation(1);
            layoutparams.rightMargin = 0;
        }
        b.setText(h1.b());
        if (h1.f() == null)
        {
            d.setVisibility(8);
        } else
        {
            d.setVisibility(0);
            d.setText(h1.f());
        }
        if (h1.d() == null)
        {
            c.setText(p.cl);
        } else
        {
            c.setText(h1.d());
        }
        e.setText(h1.c());
        if (h1.g().a())
        {
            f.a(h1.g());
        }
        h.setVisibility(0);
        ad.a(j, h, h1);
        return k.a(f1);
    }

    public final volatile View a(f f1, u u)
    {
        return a(f1, (h)u);
    }

    public final volatile View a(f f1, Object obj)
    {
        return a(f1, (h)obj);
    }
}
