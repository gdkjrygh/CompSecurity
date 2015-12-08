// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.innertube.model.ak;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

public final class ch extends a
{

    private final View a;
    private final i b;
    private final TextView c;
    private final TextView d;
    private final gr e;
    private final View f;
    private final v g;

    public ch(Context context, i k, bj bj, com.google.android.apps.youtube.datalib.d.a a1, v v1)
    {
        super(a1, k);
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        com.google.android.apps.youtube.common.fromguava.c.a(bj);
        b = (i)com.google.android.apps.youtube.common.fromguava.c.a(k);
        g = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        a = View.inflate(context, l.bf, null);
        c = (TextView)a.findViewById(j.fF);
        d = (TextView)a.findViewById(j.ff);
        e = new gr(bj, (ImageView)a.findViewById(j.fy));
        f = a.findViewById(j.aE);
        k.a(a);
    }

    private View a(f f1, ak ak1)
    {
        byte byte0 = 8;
        super.a(f1, ak1);
        c.setText(ak1.a());
        View view;
        if (!TextUtils.isEmpty(ak1.b()))
        {
            d.setText(ak1.b());
            d.setVisibility(0);
        } else
        if (!TextUtils.isEmpty(ak1.c()))
        {
            d.setText(ak1.c());
            d.setVisibility(0);
        } else
        {
            d.setVisibility(8);
        }
        if (ak1.d().a())
        {
            e.a(ak1.d());
            e.a().setVisibility(0);
        } else
        {
            e.a().setVisibility(8);
        }
        ad.a(g, f, ak1);
        view = f;
        if (ak1.f() != null)
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        return b.a(f1);
    }

    public final volatile View a(f f1, u u)
    {
        return a(f1, (ak)u);
    }

    public final volatile View a(f f1, Object obj)
    {
        return a(f1, (ak)obj);
    }
}
