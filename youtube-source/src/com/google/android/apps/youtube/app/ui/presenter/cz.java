// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.fw;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.app.ui.ja;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.datalib.innertube.av;
import com.google.android.apps.youtube.datalib.innertube.model.am;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.apps.youtube.datalib.innertube.model.at;
import com.google.android.apps.youtube.datalib.innertube.model.d;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

public final class cz extends a
{

    private final Activity a;
    private final i b;
    private final LinearLayout c;
    private final gr d;
    private final View e;
    private final TextView f;
    private final TextView g;
    private final fw h;

    public cz(Activity activity, i k, av av, com.google.android.apps.youtube.core.identity.l l1, aa aa, ja ja, bj bj, 
            com.google.android.apps.youtube.common.c.a a1, aw aw, com.google.android.apps.youtube.datalib.d.a a2)
    {
        super(a2, k);
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (i)com.google.android.apps.youtube.common.fromguava.c.a(k);
        c = (LinearLayout)LayoutInflater.from(activity).inflate(l.bA, null);
        d = new gr(bj, (ImageView)c.findViewById(j.dc));
        f = (TextView)c.findViewById(j.ap);
        g = (TextView)c.findViewById(j.ao);
        e = c.findViewById(j.eZ);
        h = new fw(activity, av, l1, aa, ja, aw, a1, e);
        k.a(c);
    }

    private View a(f f1, at at1)
    {
        super.a(f1, at1);
        f.setText(at1.a());
        Object obj;
        boolean flag;
        if (at1.c().a())
        {
            d.a(at1.c());
        } else
        {
            d.a().setImageResource(h.am);
        }
        obj = c;
        if (at1.e() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((LinearLayout) (obj)).setEnabled(flag);
        if (at1.b() != null)
        {
            g.setVisibility(0);
            g.setText(at1.b());
        } else
        {
            g.setVisibility(8);
        }
        obj = at1.d();
        if (obj != null && ((am) (obj)).h() == null)
        {
            ((am) (obj)).a(new d(Html.fromHtml(a.getString(p.gn, new Object[] {
                at1.a()
            })), a.getString(0x1040013), a.getString(0x1040009)));
        }
        h.a(((am) (obj)));
        return b.a(f1);
    }

    public final volatile View a(f f1, u u)
    {
        return a(f1, (at)u);
    }

    public final volatile View a(f f1, Object obj)
    {
        return a(f1, (at)obj);
    }
}
