// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.c.a;
import com.google.android.apps.youtube.app.c.d;
import com.google.android.apps.youtube.app.ui.presenter.cm;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.innertube.model.al;
import com.google.android.apps.youtube.datalib.innertube.model.ba;
import com.google.android.apps.youtube.datalib.innertube.model.bb;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            p

public final class ja
    implements android.widget.AdapterView.OnItemClickListener, d
{

    private final Context a;
    private final a b;
    private final com.google.android.apps.youtube.datalib.d.a c;
    private final com.google.android.apps.youtube.common.c.a d;
    private final aw e;
    private final View f;
    private final ListView g;
    private final View h;
    private final TextView i;
    private h j;
    private AlertDialog k;
    private String l;

    public ja(Context context, a a1, com.google.android.apps.youtube.datalib.d.a a2, com.google.android.apps.youtube.common.c.a a3, aw aw1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (com.google.android.apps.youtube.datalib.d.a)com.google.android.apps.youtube.common.fromguava.c.a(a2);
        d = (com.google.android.apps.youtube.common.c.a)com.google.android.apps.youtube.common.fromguava.c.a(a3);
        e = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        f = View.inflate(context, l.bQ, null);
        g = (ListView)f.findViewById(j.cP);
        h = f.findViewById(j.dR);
        i = (TextView)f.findViewById(j.aK);
        a1.a(this);
    }

    private void b()
    {
        h.setVisibility(8);
        g.setOnItemClickListener(this);
    }

    public final void a()
    {
        b();
        e.a(p.eJ);
    }

    public final void a(ba ba1, String s)
    {
        b();
        k.hide();
        d.c(new com.google.android.apps.youtube.app.ui.p(s));
        if (!TextUtils.isEmpty(ba1.a()))
        {
            e.a(ba1.a().toString());
        }
        if (ba1.b() != null)
        {
            c.a(ba1.b());
        }
    }

    public final void a(bb bb1, String s)
    {
        l = s;
        if (j == null)
        {
            k = (new android.app.AlertDialog.Builder(a)).setView(f).create();
            j = new h();
            j.a(com/google/android/apps/youtube/datalib/innertube/model/al, new cm(a));
            g.setOnItemClickListener(this);
            g.setAdapter(j);
        }
        i.setText(bb1.b());
        j.b();
        j.a(bb1.c());
        b();
        k.setTitle(bb1.a());
        k.show();
    }

    public final void a(Throwable throwable)
    {
        b();
        e.c(throwable);
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = (al)adapterview.getItemAtPosition(i1);
        h.setVisibility(0);
        g.setOnItemClickListener(null);
        b.a(adapterview.d(), l);
    }
}
