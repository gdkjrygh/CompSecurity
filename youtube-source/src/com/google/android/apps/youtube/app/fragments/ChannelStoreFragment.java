// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.ui.ChannelStoreOutline;
import com.google.android.apps.youtube.app.ui.gj;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.a.i;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment

public class ChannelStoreFragment extends PaneFragment
{

    private Analytics Y;
    private i Z;
    private com.google.android.apps.youtube.core.identity.l a;
    private ListView aa;
    private ChannelStoreOutline ab;
    private View b;
    private gj d;
    private bc e;
    private bj f;
    private a g;
    private am h;
    private aw i;

    public ChannelStoreFragment()
    {
    }

    private void L()
    {
        ab = ChannelStoreOutline.a(c, Y, e, a, G(), g, h, i, f, d, b);
        Z.b(ab);
        aa.setAdapter(Z);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        b = layoutinflater.inflate(l.t, (ViewGroup)q());
        Z = new i();
        aa = (ListView)b.findViewById(j.ac);
        return b;
    }

    public final CharSequence a()
    {
        return c.getResources().getString(p.ce);
    }

    public final void a(Uri uri)
    {
        if (ab != null)
        {
            ab.a(uri);
        }
    }

    public final void a(Uri uri, String s)
    {
        if (ab != null)
        {
            ab.a(uri, s);
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        d = c;
        bundle = G().d();
        e = bundle.f();
        a = bundle.aT();
        h = c.N();
        f = bundle.aw();
        g = bundle.bf();
        i = bundle.aO();
        Y = bundle.ba();
    }

    public final void a(Subscription subscription)
    {
        if (ab != null)
        {
            ab.a(subscription);
        }
    }

    public final void b(Uri uri)
    {
        if (ab != null)
        {
            ab.b(uri);
        }
    }

    public final void d()
    {
        super.d();
        L();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        L();
    }
}
