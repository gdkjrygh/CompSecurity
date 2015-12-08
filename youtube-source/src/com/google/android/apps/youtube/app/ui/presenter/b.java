// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.d.a;
import com.google.android.apps.youtube.app.d.r;
import com.google.android.apps.youtube.app.ui.SelectorOnTopImageView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.utils.ag;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            f, g, c, d, 
//            e

public abstract class b
    implements g
{

    protected final View a;
    protected final Activity b;
    protected final bj c;
    protected final Resources d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final SelectorOnTopImageView h;
    private final View i;
    private final com.google.android.apps.youtube.app.ui.presenter.f j;
    private final com.google.android.apps.youtube.app.ui.presenter.g k;
    private final r l;

    protected b(View view, Activity activity, bj bj1, com.google.android.apps.youtube.app.ui.presenter.f f1, com.google.android.apps.youtube.app.ui.presenter.g g1, r r1)
    {
        a = (View)com.google.android.apps.youtube.common.fromguava.c.a(view);
        b = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        c = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        j = (com.google.android.apps.youtube.app.ui.presenter.f)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        k = (com.google.android.apps.youtube.app.ui.presenter.g)com.google.android.apps.youtube.common.fromguava.c.a(g1);
        l = (r)com.google.android.apps.youtube.common.fromguava.c.a(r1);
        d = activity.getResources();
        e = (TextView)view.findViewById(j.y);
        f = (TextView)view.findViewById(j.ax);
        g = (TextView)view.findViewById(j.ay);
        h = (SelectorOnTopImageView)view.findViewById(j.B);
        i = view.findViewById(j.ba);
    }

    static View a(b b1)
    {
        return b1.i;
    }

    static com.google.android.apps.youtube.app.ui.presenter.f b(b b1)
    {
        return b1.j;
    }

    static r c(b b1)
    {
        return b1.l;
    }

    static com.google.android.apps.youtube.app.ui.presenter.g d(b b1)
    {
        return b1.k;
    }

    public View a(f f1, com.google.android.apps.youtube.datalib.distiller.model.c c1)
    {
        e.setText(c1.c());
        f.setText(c1.f());
        g.setText(ag.a(c1.e(), d));
        if (c1.h())
        {
            i.setVisibility(0);
            i.setOnClickListener(new com.google.android.apps.youtube.app.ui.presenter.c(this, c1));
        } else
        {
            i.setVisibility(8);
            i.setOnClickListener(null);
        }
        a.setOnClickListener(new d(this, c1));
        h.setImageBitmap(null);
        h.setOnClickListener(new e(this, c1));
        f1 = c1.a(d.getDimensionPixelSize(com.google.android.youtube.g.ae));
        h.setTag(f1);
        com.google.android.apps.youtube.app.d.a.a(b, c, f1, h, null);
        return a;
    }

    public volatile View a(f f1, Object obj)
    {
        return a(f1, (com.google.android.apps.youtube.datalib.distiller.model.c)obj);
    }
}
