// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.offline.a.s;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.app.ui.bv;
import com.google.android.apps.youtube.app.ui.bz;
import com.google.android.apps.youtube.app.ui.cl;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.core.player.z;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment

public class OfflinePlaylistFragment extends PaneFragment
{

    private ax a;
    private OfflineStoreInterface b;
    private a d;
    private h e;
    private com.google.android.apps.youtube.app.offline.p f;
    private String g;
    private bz h;

    public OfflinePlaylistFragment()
    {
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(l.at, viewgroup, false);
        Object obj = a.aT();
        Object obj1 = a.q();
        r r1;
        com.google.android.apps.youtube.core.identity.aa aa;
        com.google.android.apps.youtube.core.aw aw;
        bv bv1;
        if (((com.google.android.apps.youtube.core.identity.l) (obj)).b())
        {
            b = ((q) (obj1)).a(((com.google.android.apps.youtube.core.identity.l) (obj)).c());
        } else
        {
            b = ((q) (obj1)).a();
        }
        aa = a.bk();
        aw = a.aO();
        bv1 = new bv(c, f);
        bundle = new cl(c, a.ba(), ((com.google.android.apps.youtube.core.identity.l) (obj)), aa, a.x(), aw, a.bf());
        r1 = new r(c, ((com.google.android.apps.youtube.core.identity.l) (obj)), ((q) (obj1)), aa, aw, a.aX(), f, bv1, c.J());
        obj = new f(c, ((com.google.android.apps.youtube.core.identity.l) (obj)), ((q) (obj1)), aa, aw, e, f, bv1);
        obj1 = a.aa();
        ((w) (obj1)).a(new z(c));
        h = new bz(c, c.N(), a.f(), a.x(), b, d, a.aw(), e, f, ((w) (obj1)), bundle, r1, ((f) (obj)), c.J(), g);
        h.a(layoutinflater, viewgroup);
        return viewgroup;
    }

    public final CharSequence a()
    {
        return c.getString(p.gh);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = H();
        d = a.bf();
        e = a.aX();
        f = a.Z();
        g = h().getString("playlist_id");
    }

    public final void d()
    {
        super.d();
        d.a(this);
        h.a();
    }

    public final void e()
    {
        super.e();
        d.b(this);
        h.b();
    }

    public void handleOfflinePlaylistDeleteEvent(s s1)
    {
        if (s1.a.equals(g))
        {
            c.d(true);
        }
    }
}
