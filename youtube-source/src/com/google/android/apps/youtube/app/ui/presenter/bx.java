// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.d.e;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.innertube.model.ad;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.youtube.f;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            by

public final class bx extends a
    implements e
{

    private final View a;
    private final TextView b;
    private final TextView c;
    private final gr d;
    private final TextView e;
    private final ImageView f;
    private final TextView g;
    private final View h;
    private final View i;
    private final v j;
    private TextView k;
    private ImageView l;
    private final Resources m;

    public bx(Context context, bj bj, com.google.android.apps.youtube.datalib.d.a a1, v v1)
    {
        super(a1);
        m = context.getResources();
        a = LayoutInflater.from(context).inflate(l.bb, null);
        c = (TextView)a.findViewById(j.y);
        b = (TextView)a.findViewById(j.fF);
        d = new gr(bj, (ImageView)a.findViewById(j.fy));
        e = (TextView)a.findViewById(j.dJ);
        f = (ImageView)a.findViewById(j.dC);
        g = (TextView)a.findViewById(j.aP);
        k = (TextView)a.findViewById(j.fO);
        l = (ImageView)a.findViewById(j.fM);
        h = a.findViewById(j.fA);
        i = a.findViewById(j.aE);
        j = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        a.setOnClickListener(new by(this));
    }

    private View a(com.google.android.apps.youtube.uilib.a.f f1, ad ad1)
    {
        super.a(f1, ad1);
        b.setText(ad1.a());
        c.setText(ad1.b());
        g.setText(ad1.c());
        e.setText(ad1.d());
        h.setBackgroundResource(h.h);
        if (ad1.h())
        {
            f1 = ad1.i();
            if (l == null)
            {
                l = (ImageView)((ViewStub)a.findViewById(j.fN)).inflate();
            }
            b.setMaxLines(1);
            g.setVisibility(8);
            b.setTextColor(m.getColor(f.o));
            c.setVisibility(8);
            l.setVisibility(0);
            if (k == null)
            {
                k = (TextView)((ViewStub)a.findViewById(j.fP)).inflate();
            }
            k.setText(f1);
            k.setVisibility(0);
        } else
        {
            if (l != null)
            {
                l.setVisibility(8);
            }
            b.setMaxLines(2);
            g.setVisibility(0);
            b.setTextColor(m.getColor(f.p));
            c.setVisibility(0);
            if (k != null)
            {
                k.setVisibility(8);
            }
        }
        if (ad1.j())
        {
            a.setBackgroundResource(h.g);
            e.setVisibility(4);
            f.setVisibility(0);
        } else
        {
            a.setBackgroundResource(h.f);
            e.setVisibility(0);
            f.setVisibility(4);
        }
        d.a().setBackgroundResource(h.h);
        if (ad1.k().a())
        {
            d.a(ad1.k(), this);
        } else
        {
            d.a().setImageDrawable(null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a.setAlpha(ad1.l());
        }
        if (ad1.g())
        {
            i.setVisibility(0);
            com.google.android.apps.youtube.app.ui.ad.a(j, i, ad1);
        }
        return a;
    }

    static void a(bx bx1)
    {
        bx1.b();
    }

    public final volatile View a(com.google.android.apps.youtube.uilib.a.f f1, u u)
    {
        return a(f1, (ad)u);
    }

    public final volatile View a(com.google.android.apps.youtube.uilib.a.f f1, Object obj)
    {
        return a(f1, (ad)obj);
    }

    public final void a()
    {
    }

    public final void a(Bitmap bitmap)
    {
        h.setBackgroundResource(0);
    }

    public final void a(ImageView imageview)
    {
    }
}
