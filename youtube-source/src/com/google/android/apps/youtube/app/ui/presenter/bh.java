// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.innertube.model.aa;
import com.google.android.apps.youtube.datalib.innertube.model.ae;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            y, bi

public final class bh extends a
{

    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final gr f;
    private final View g;
    private final View h;
    private final y i;
    private final v j;
    private aa k;

    public bh(Context context, bj bj, com.google.android.apps.youtube.datalib.d.a a1, v v1)
    {
        super(a1);
        j = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        a = View.inflate(context, l.aI, null);
        b = (TextView)a.findViewById(j.fF);
        c = (TextView)a.findViewById(j.y);
        d = (TextView)a.findViewById(j.fV);
        e = (TextView)a.findViewById(j.fW);
        f = new gr(bj, (ImageView)a.findViewById(j.fy));
        g = a.findViewById(j.aE);
        h = a.findViewById(j.bm);
        i = new y(bj, a);
        a.setOnClickListener(this);
        h.setOnClickListener(new bi(this, a1));
    }

    private View a(f f1, aa aa1)
    {
        super.a(f1, aa1);
        k = aa1;
        i.a(aa1);
        f1 = aa1.f();
        b.setText(f1.b());
        c.setText(f1.g());
        d.setText(f1.f());
        f.a(f1.c());
        e.setText(String.valueOf(f1.d()));
        g.setVisibility(0);
        ad.a(j, g, aa1);
        return a;
    }

    static aa a(bh bh1)
    {
        return bh1.k;
    }

    public final volatile View a(f f1, u u)
    {
        return a(f1, (aa)u);
    }

    public final volatile View a(f f1, Object obj)
    {
        return a(f1, (aa)obj);
    }
}
