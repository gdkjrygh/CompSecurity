// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.adapter.ba;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.app.ui.hd;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import com.google.android.youtube.m;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, av, at, aq, 
//            ar, as

public class MyUploadsFragment extends PaneFragment
{

    private hd Y;
    private ba Z;
    private ax a;
    private et aa;
    private v ab;
    private v ac;
    private DeleteUploadDialogFragment ad;
    private an ae;
    private RemoteControlContextualMenuController af;
    private af b;
    private bc d;
    private bj e;
    private ak f;
    private com.google.android.apps.youtube.core.identity.l g;
    private aw h;
    private Resources i;

    public MyUploadsFragment()
    {
    }

    private void L()
    {
        if (aa != null)
        {
            aa.a(i.getInteger(k.o));
        }
    }

    static DeleteUploadDialogFragment a(MyUploadsFragment myuploadsfragment)
    {
        return myuploadsfragment.ad;
    }

    static void a(MyUploadsFragment myuploadsfragment, Video video)
    {
        av av1 = new av(video);
        myuploadsfragment.d.f(video.editUri, com.google.android.apps.youtube.common.a.a.a(myuploadsfragment.c, new at(myuploadsfragment, av1)));
    }

    static hd b(MyUploadsFragment myuploadsfragment)
    {
        return myuploadsfragment.Y;
    }

    static ba c(MyUploadsFragment myuploadsfragment)
    {
        return myuploadsfragment.Z;
    }

    static aw d(MyUploadsFragment myuploadsfragment)
    {
        return myuploadsfragment.h;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(l.aq, viewgroup, false);
        ab = com.google.android.apps.youtube.app.ui.ad.a(c, a.ai());
        Object obj = new aq(this);
        ab.a(p.bb, ((com.google.android.apps.youtube.app.ui.ab) (obj)));
        obj = new ar(this);
        ab.a(p.aN, ((com.google.android.apps.youtube.app.ui.ab) (obj)));
        ac = new v(c);
        obj = new as(this);
        ac.a(p.L, ((com.google.android.apps.youtube.app.ui.ab) (obj)));
        Z = ag.a(c, e, ab, ac);
        aa = et.b(c, Z);
        obj = (PagedListView)viewgroup.findViewById(j.fR);
        ((PagedListView) (obj)).a(layoutinflater.inflate(l.n, ((ViewGroup) (obj)), false));
        ((PagedListView) (obj)).b(layoutinflater.inflate(l.m, null));
        Y = new hd(c, f, ((com.google.android.apps.youtube.core.ui.PagedView) (obj)), Z, aa, b, d, c.P(), h, c.N());
        af = RemoteControlContextualMenuController.a(ae, ab, aa, h, WatchFeature.MY_UPLOADS, c.P());
        if (bundle != null)
        {
            Y.a(bundle.getBundle("uploads_helper"));
        }
        return viewgroup;
    }

    public final CharSequence a()
    {
        return a(p.ah);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = G().d();
        f = a.aV();
        g = a.aT();
        d = a.f();
        e = a.aw();
        h = a.aO();
        b = d.m();
        i = j();
        ae = a.W();
    }

    public final void a(com.google.android.apps.youtube.app.compat.j j1)
    {
        super.a(j1);
        c.M().a(m.f, j1);
    }

    public final String b()
    {
        return "yt_upload";
    }

    public final void d()
    {
        super.d();
        L();
        ad = (DeleteUploadDialogFragment)c.c().a("DeleteUploadDialogFragment");
        if (ad == null)
        {
            ad = new DeleteUploadDialogFragment();
        }
        com.google.android.apps.youtube.app.fragments.DeleteUploadDialogFragment.a(ad, this);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (Y != null)
        {
            bundle.putBundle("uploads_helper", Y.d());
        }
    }

    public final void f()
    {
        super.f();
        af.a();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        L();
    }

    public final void r()
    {
        super.r();
        if (g.b())
        {
            Y.a(new GDataRequest[] {
                d.a().g()
            });
            af.b();
            return;
        } else
        {
            c.d(false);
            return;
        }
    }

    public final void s()
    {
        super.s();
    }

    private class DeleteUploadDialogFragment extends YouTubeDialogFragment
    {

        private Video Y;
        private MyUploadsFragment Z;

        static MyUploadsFragment a(DeleteUploadDialogFragment deleteuploaddialogfragment, MyUploadsFragment myuploadsfragment)
        {
            deleteuploaddialogfragment.Z = myuploadsfragment;
            return myuploadsfragment;
        }

        static void a(DeleteUploadDialogFragment deleteuploaddialogfragment)
        {
            if (deleteuploaddialogfragment.Y != null && deleteuploaddialogfragment.Z != null)
            {
                com.google.android.apps.youtube.app.fragments.MyUploadsFragment.a(deleteuploaddialogfragment.Z, deleteuploaddialogfragment.Y);
            }
        }

        public final void a(Video video)
        {
            Y = video;
        }

        public final Dialog c(Bundle bundle)
        {
            if (Y == null && bundle != null)
            {
                Y = (Video)bundle.getSerializable("upload");
            }
            bundle = i();
            au au1 = new au(this);
            return (new aa(bundle)).setMessage(p.aO).setPositiveButton(0x1040013, au1).setNegativeButton(0x1040009, au1).create();
        }

        public DeleteUploadDialogFragment()
        {
        }
    }

}
