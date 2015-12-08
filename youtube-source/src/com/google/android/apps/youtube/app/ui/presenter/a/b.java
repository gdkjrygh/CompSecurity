// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter.a;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.d.e;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.youtube.d;
import com.google.android.youtube.f;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter.a:
//            c

public final class b extends a
{

    private final View a;
    private final TextView b;
    private final TextView c;
    private final gr d;
    private final e e = new com.google.android.apps.youtube.app.ui.presenter.a.c(this, (byte)0);
    private final Drawable f;

    public b(com.google.android.apps.youtube.datalib.d.a a1, Activity activity, bj bj, ViewGroup viewgroup)
    {
        super(a1);
        com.google.android.apps.youtube.common.fromguava.c.a(activity);
        com.google.android.apps.youtube.common.fromguava.c.a(viewgroup);
        a = activity.getLayoutInflater().inflate(l.ab, viewgroup, false);
        b = (TextView)a.findViewById(j.fF);
        c = (TextView)a.findViewById(j.ff);
        d = new gr(bj, (ImageView)a.findViewById(j.fy));
        a1 = new TypedValue();
        activity.getTheme().resolveAttribute(d.a, a1, true);
        f = activity.getResources().getDrawable(((TypedValue) (a1)).resourceId);
        a.setOnClickListener(this);
    }

    private View a(com.google.android.apps.youtube.uilib.a.f f1, com.google.android.apps.youtube.datalib.innertube.model.a.c c1)
    {
        super.a(f1, c1);
        f1 = c1.b();
        b.setText(f1);
        f1 = c1.f();
        if (f1 != null && f1.length() > 0)
        {
            c.setText(f1);
            c.setVisibility(0);
        } else
        {
            c.setVisibility(8);
        }
        d.a(c1.d(), e);
        if (c1.d() == null)
        {
            d.a().setBackgroundResource(f.a);
        }
        if (c1.g())
        {
            a.setBackgroundResource(f.f);
        } else
        {
            a.setBackgroundDrawable(f);
        }
        return a;
    }

    static gr a(b b1)
    {
        return b1.d;
    }

    public final volatile View a(com.google.android.apps.youtube.uilib.a.f f1, u u)
    {
        return a(f1, (com.google.android.apps.youtube.datalib.innertube.model.a.c)u);
    }

    public final volatile View a(com.google.android.apps.youtube.uilib.a.f f1, Object obj)
    {
        return a(f1, (com.google.android.apps.youtube.datalib.innertube.model.a.c)obj);
    }
}
