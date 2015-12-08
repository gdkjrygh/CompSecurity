// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.adapter.ad;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hj, hs, ht, hv, 
//            bd

final class hr
{

    final hj a;
    private final ad b;
    private final com.google.android.apps.youtube.core.ui.l c;
    private final PagedListView d;
    private String e;
    private Dialog f;
    private Dialog g;

    public hr(hj hj1)
    {
        a = hj1;
        super();
        b = new ad(hj1.a, l.aH);
        d = (PagedListView)hj1.a.getLayoutInflater().inflate(l.d, null, false);
        c = new hs(this, hj1.a, d, b, hj.g(hj1), hj.a(hj1), hj1);
        d.setOnItemClickListener(new ht(this, hj1));
    }

    static ad a(hr hr1)
    {
        return hr1.b;
    }

    static Dialog b(hr hr1)
    {
        return hr1.g;
    }

    static String c(hr hr1)
    {
        return hr1.e;
    }

    static Dialog d(hr hr1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(hr1.e);
        if (hr1.f == null)
        {
            hr1.f = hj.j(hr1.a).a(new hv(hr1));
        }
        return hr1.f;
    }

    public final void a()
    {
        c.a(new GDataRequest[] {
            hj.e(a).a().m()
        });
        if (g == null)
        {
            g = (new aa(a.a)).setTitle(p.n).setView(d).create();
        }
        g.show();
    }

    public final void a(String s)
    {
        e = s;
    }
}
