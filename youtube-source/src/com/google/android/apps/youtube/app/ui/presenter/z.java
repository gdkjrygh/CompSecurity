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
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.ui.FixedAspectRatioFrameLayout;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.apps.youtube.datalib.innertube.model.e;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            aa

public final class z extends a
{

    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final gr e;
    private final FixedAspectRatioFrameLayout f;
    private final com.google.android.apps.youtube.app.d.e g = new aa(this, (byte)0);
    private final Context h;
    private final i i;

    public z(Context context, bj bj, i i1, com.google.android.apps.youtube.datalib.d.a a1)
    {
        super(a1, i1);
        h = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        i = (i)com.google.android.apps.youtube.common.fromguava.c.a(i1);
        a = LayoutInflater.from(context).inflate(l.w, null);
        b = (TextView)a.findViewById(j.an);
        c = (TextView)a.findViewById(j.fV);
        d = (TextView)a.findViewById(j.fe);
        e = new gr(bj, (ImageView)a.findViewById(j.ah));
        f = (FixedAspectRatioFrameLayout)a.findViewById(j.C);
        i1.a(a);
    }

    private View a(f f1, e e1)
    {
        super.a(f1, e1);
        ((android.widget.LinearLayout.LayoutParams)f.getLayoutParams()).weight = h.getResources().getInteger(k.g);
        b.setText(e1.a());
        c.setText(e1.c());
        if (e1.b() == null)
        {
            d.setVisibility(8);
        } else
        {
            d.setVisibility(0);
            d.setText(e1.b());
        }
        if (e1.d().a())
        {
            e.a(e1.d(), g);
        } else
        {
            a();
        }
        return i.a(f1);
    }

    private void a()
    {
        e.a().setImageResource(h.am);
    }

    static void a(z z1)
    {
        z1.a();
    }

    public final volatile View a(f f1, u u)
    {
        return a(f1, (e)u);
    }

    public final volatile View a(f f1, Object obj)
    {
        return a(f1, (e)obj);
    }
}
