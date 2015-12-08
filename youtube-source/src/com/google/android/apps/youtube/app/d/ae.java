// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.identity.z;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            a, af, ag, ai

public final class ae
{

    private final Activity a;
    private final bj b;
    private final l c;
    private final aa d;
    private final aw e;
    private View f;
    private View g;
    private TextView h;
    private TextView i;
    private ImageView j;
    private ai k;

    public ae(Activity activity, ax ax1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        c = ax1.aT();
        b = ax1.aw();
        d = ax1.bk();
        e = ax1.aO();
    }

    static ai a(ae ae1)
    {
        return ae1.k;
    }

    private static void a(TextView textview, String s)
    {
        if (s.isEmpty())
        {
            textview.setVisibility(8);
            return;
        } else
        {
            textview.setVisibility(0);
            textview.setText(s);
            return;
        }
    }

    static Activity b(ae ae1)
    {
        return ae1.a;
    }

    static aw c(ae ae1)
    {
        return ae1.e;
    }

    static aa d(ae ae1)
    {
        return ae1.d;
    }

    public final void a()
    {
        if (!c.b())
        {
            f.setVisibility(0);
            g.setVisibility(8);
            return;
        }
        f.setVisibility(8);
        g.setVisibility(0);
        z z1 = c.d();
        a(h, z1.a());
        a(i, z1.b());
        if (z1.c() != null)
        {
            com.google.android.apps.youtube.app.d.a.a(a, b, z1.c(), j);
            return;
        } else
        {
            j.setImageResource(h.am);
            return;
        }
    }

    public final void a(View view)
    {
        Resources resources = a.getResources();
        view = view.findViewById(j.bw);
        f = view.findViewById(j.bz);
        ((TextView)f.findViewById(j.fF)).setText(resources.getString(p.cE));
        ((ImageView)f.findViewById(j.fy)).setImageDrawable(resources.getDrawable(h.D));
        f.setOnClickListener(new af(this));
        g = view.findViewById(j.bu);
        h = (TextView)g.findViewById(j.fU);
        i = (TextView)g.findViewById(j.aQ);
        j = (ImageView)g.findViewById(j.fy);
        g.setOnClickListener(new ag(this));
    }

    public final void a(ai ai)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(ai);
        k = ai;
    }

    public final void b()
    {
        f.setVisibility(8);
        g.setVisibility(8);
    }
}
