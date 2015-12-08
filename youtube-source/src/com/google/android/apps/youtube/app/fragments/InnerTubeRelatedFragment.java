// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.a.a.a.a.qq;
import com.google.a.a.a.a.qt;
import com.google.a.a.a.a.qu;
import com.google.a.a.a.a.qw;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.z;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.a;
import com.google.android.apps.youtube.app.ui.presenter.am;
import com.google.android.apps.youtube.app.ui.presenter.cc;
import com.google.android.apps.youtube.app.ui.presenter.cv;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.datalib.innertube.model.aj;
import com.google.android.apps.youtube.uilib.innertube.t;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment

public final class InnerTubeRelatedFragment extends PaneFragment
{

    private ax a;
    private aw b;
    private Resources d;
    private aj e;
    private t f;
    private ListView g;
    private RemoteControlContextualMenuController h;
    private a i;

    public InnerTubeRelatedFragment()
    {
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        g = (ListView)layoutinflater.inflate(l.ba, viewgroup, false);
        return g;
    }

    public final CharSequence a()
    {
        return d.getString(p.fS);
    }

    public final void a(Bundle bundle)
    {
        Bundle bundle1;
        super.a(bundle);
        a = G().d();
        d = j();
        b = a.aO();
        i = new a(a.C());
        bundle1 = h();
        bundle = new qu();
        c.a(bundle, bundle1.getByteArray("section_list_without_preview_proto"));
_L2:
        if (bundle != null && ((qu) (bundle)).b.length > 0)
        {
            qq qq1 = new qq();
            bundle = ((qu) (bundle)).b[0].b;
            qt qt1 = new qt();
            qt1.b = bundle;
            qq1.b = (new qt[] {
                qt1
            });
            e = new aj(qq1);
        }
        return;
        InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception;
        invalidprotocolbuffernanoexception;
        bundle = null;
_L3:
        b.c(invalidprotocolbuffernanoexception);
        if (true) goto _L2; else goto _L1
_L1:
        invalidprotocolbuffernanoexception;
          goto _L3
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        h = RemoteControlContextualMenuController.a(c, a.W(), b, WatchFeature.RELATED, c.P(), a.f());
        bundle = new cc(c, c.q(), a.bf(), a.aw(), a.aT(), a.aQ(), a.bk(), i, a.F(), a.G(), a.ai(), b, h);
        z z1 = new z(new am(c, new cv(), a.bf()));
        f = new t(c.N(), g, z1, a.t(), a.bf(), bundle, b);
        f.b(e);
    }

    public final void r()
    {
        super.r();
        if (e == null)
        {
            c.d(false);
            return;
        } else
        {
            h.b();
            return;
        }
    }

    public final void t()
    {
        super.t();
        h.a();
    }
}
