// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.a;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.innertube.model.ah;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            ce, cf

public final class cd
    implements g
{

    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final gr e;
    private final View f;
    private final View g;
    private final View h;
    private final View i;
    private final gr j;
    private final TextView k;
    private final TextView l;
    private final LinearLayout m;
    private final v n;
    private final Context o;
    private final SpannableStringBuilder p = new SpannableStringBuilder();
    private final StyleSpan q = new StyleSpan(1);
    private final a r;
    private final Resources s;
    private final android.view.View.OnClickListener t;
    private final android.view.View.OnClickListener u;
    private ah v;
    private int w;

    public cd(Context context, bj bj, com.google.android.apps.youtube.datalib.d.a a1, v v1, a a2)
    {
        o = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        n = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        r = (a)com.google.android.apps.youtube.common.fromguava.c.a(a2);
        s = context.getResources();
        a = View.inflate(context, l.aP, null);
        b = (TextView)a.findViewById(j.fF);
        d = (TextView)a.findViewById(j.bo);
        c = (TextView)a.findViewById(j.aP);
        e = new gr(bj, (ImageView)a.findViewById(j.fy));
        g = a.findViewById(j.fA);
        f = a.findViewById(j.eu);
        h = a.findViewById(j.aU);
        i = a.findViewById(j.aE);
        j = new gr(bj, (ImageView)a.findViewById(j.ah));
        k = (TextView)a.findViewById(j.g);
        l = (TextView)a.findViewById(j.d);
        m = (LinearLayout)a.findViewById(j.bn);
        t = new ce(this, a2, a1);
        u = new cf(this, a1);
    }

    static ah a(cd cd1)
    {
        return cd1.v;
    }

    private static void a(View view, int i1)
    {
        if (view != null)
        {
            view.setVisibility(i1);
        }
    }

    public final View a(f f1, Object obj)
    {
        f1 = (ah)obj;
        v = (ah)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        r.a(f1.a(), f1.m());
        int i1;
        if (com.google.android.apps.youtube.core.utils.l.b(o))
        {
            i1 = 2;
        } else
        {
            i1 = s.getConfiguration().orientation;
        }
        if (i1 != w)
        {
            w = i1;
            obj = (android.widget.LinearLayout.LayoutParams)g.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)h.getLayoutParams();
            if (i1 == 2)
            {
                m.setOrientation(0);
                g.setPadding((int)s.getDimension(com.google.android.youtube.g.K), g.getPaddingTop(), (int)s.getDimension(com.google.android.youtube.g.L), (int)s.getDimension(com.google.android.youtube.g.J));
                h.setPadding(h.getPaddingLeft(), 0, h.getPaddingRight(), h.getPaddingBottom());
                obj.width = 0;
                obj.weight = s.getInteger(k.l);
                layoutparams.width = 0;
                layoutparams.weight = s.getInteger(k.k);
                f.setVisibility(0);
            } else
            {
                m.setOrientation(1);
                g.setPadding(0, g.getPaddingTop(), 0, 0);
                h.setPadding(h.getPaddingLeft(), (int)s.getDimension(com.google.android.youtube.g.I), h.getPaddingRight(), h.getPaddingBottom());
                obj.width = -1;
                obj.weight = 0.0F;
                layoutparams.width = -1;
                layoutparams.weight = 0.0F;
                f.setVisibility(8);
            }
        }
        b.setText(f1.c());
        b.setVisibility(0);
        if (f1.d() != null)
        {
            k.setText(f1.d());
            k.setVisibility(0);
        } else
        {
            k.setVisibility(8);
        }
        if (f1.i() != null)
        {
            c.setText(f1.i());
            c.setVisibility(0);
        } else
        {
            c.setVisibility(8);
        }
        if (f1.f() != null)
        {
            p.clear();
            p.append(f1.g());
            p.setSpan(q, 0, p.length(), 33);
            d.setText(p);
            d.setVisibility(0);
        } else
        {
            d.setVisibility(8);
        }
        if (v.j() != null)
        {
            if (v.k() != null)
            {
                l.setText(null);
                l.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, h.c, 0);
            } else
            if (v.l() != null)
            {
                l.setText(p.cj);
                l.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            }
            l.setOnClickListener(u);
            a(((View) (l)), 0);
        } else
        {
            a(((View) (l)), 8);
        }
        e.a(f1.b());
        j.a(f1.h());
        i.setVisibility(0);
        ad.a(n, i, f1);
        i1 = s.getDimensionPixelSize(com.google.android.youtube.g.P);
        a.setPadding(a.getPaddingLeft(), i1, a.getPaddingRight(), a.getPaddingBottom());
        a.setOnClickListener(t);
        return a;
    }
}
