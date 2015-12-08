// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.a.a.a.a.ee;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.datalib.innertube.av;
import com.google.android.apps.youtube.datalib.innertube.ax;
import com.google.android.apps.youtube.datalib.innertube.model.am;
import com.google.android.apps.youtube.datalib.innertube.model.d;
import com.google.android.youtube.j;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ja, fx, fy, fz, 
//            p, q, ga

public final class fw
    implements android.view.View.OnClickListener
{

    private final Activity a;
    private final av b;
    private final l c;
    private final aa d;
    private final ja e;
    private final a f;
    private final aw g;
    private final View h;
    private final ProgressBar i;
    private final TextView j;
    private am k;
    private AlertDialog l;

    public fw(Activity activity, av av1, l l1, aa aa1, ja ja1, aw aw1, a a1, 
            View view)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (av)com.google.android.apps.youtube.common.fromguava.c.a(av1);
        c = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        d = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        e = (ja)com.google.android.apps.youtube.common.fromguava.c.a(ja1);
        f = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        g = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        h = (View)com.google.android.apps.youtube.common.fromguava.c.a(view);
        i = (ProgressBar)view.findViewById(j.fb);
        j = (TextView)view.findViewById(j.fc);
        a1.a(this);
        view.setOnClickListener(this);
    }

    static a a(fw fw1)
    {
        return fw1.f;
    }

    private void a()
    {
        h.setClickable(false);
        i.setVisibility(0);
        j.setVisibility(8);
    }

    static void a(fw fw1, am am1)
    {
        fw1.c(am1);
    }

    static am b(fw fw1)
    {
        return fw1.k;
    }

    private void b()
    {
        if (k != null)
        {
            TextView textview = j;
            int i1;
            if (k.c())
            {
                i1 = p.fO;
            } else
            {
                i1 = p.fN;
            }
            textview.setText(i1);
        }
        h.setClickable(true);
        i.setVisibility(8);
        j.setVisibility(0);
    }

    static void b(fw fw1, am am1)
    {
        fw1.b(am1);
    }

    private void b(am am1)
    {
        if (!am1.c()) goto _L2; else goto _L1
_L1:
        if (!am1.f() || am1.h() == null) goto _L4; else goto _L3
_L3:
        d d1 = am1.h();
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(a)).setTitle(d1.a()).setMessage(d1.b()).setNegativeButton(d1.c(), null).create();
        if (d1.e())
        {
            alertdialog.setButton(-1, d1.d(), new fx(this, am1));
        }
        alertdialog.show();
_L6:
        return;
_L4:
        if (am1.d())
        {
            c(am1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (am1.e())
        {
            if (am1.i() != null)
            {
                e.a(am1.i(), am1.a());
                return;
            }
            if (am1.g() != null)
            {
                ee ee1 = am1.g();
                if (l == null)
                {
                    l = (new android.app.AlertDialog.Builder(a)).setPositiveButton(a.getResources().getString(p.dA), null).create();
                }
                l.setTitle(ee1.d);
                l.setMessage(ee1.b);
                l.show();
            }
        }
        if (am1.d())
        {
            a();
            com.google.android.apps.youtube.datalib.innertube.aw aw1 = b.a();
            aw1.a(am1.a());
            aw1.a(com.google.android.apps.youtube.datalib.innertube.aw.a);
            b.a(aw1, new fy(this, am1));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void c(fw fw1)
    {
        fw1.b();
    }

    private void c(am am1)
    {
        a();
        ax ax1 = b.b();
        ax1.a(am1.a());
        ax1.a(ax.a);
        b.a(ax1, new fz(this, am1));
    }

    static aw d(fw fw1)
    {
        return fw1.g;
    }

    public final void a(am am1)
    {
        boolean flag1;
        flag1 = true;
        k = am1;
        if (am1 == null) goto _L2; else goto _L1
_L1:
        if (!am1.d()) goto _L4; else goto _L3
_L3:
        boolean flag = flag1;
_L7:
        if (!flag)
        {
            h.setVisibility(8);
            return;
        } else
        {
            h.setVisibility(0);
            j.setText(am1.b());
            b();
            return;
        }
_L4:
        if (!am1.c()) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (am1.f()) goto _L7; else goto _L6
_L6:
        if (am1.c()) goto _L2; else goto _L8
_L8:
        flag = flag1;
        if (am1.e()) goto _L7; else goto _L2
_L2:
        flag = false;
          goto _L7
    }

    public final void handleChannelSubscribedEvent(com.google.android.apps.youtube.app.ui.p p1)
    {
        if (k != null && TextUtils.equals(p1.a(), k.a()))
        {
            k.a(true);
            b();
        }
    }

    public final void handleChannelUnsubscribedEvent(q q1)
    {
        if (k != null && TextUtils.equals(q1.a(), k.a()))
        {
            k.a(false);
            b();
        }
    }

    public final void onClick(View view)
    {
        if (k == null)
        {
            return;
        }
        view = k;
        if (!c.b())
        {
            d.a(a, new ga(this, view));
            return;
        } else
        {
            b(view);
            return;
        }
    }
}
