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
import com.google.android.apps.youtube.app.adapter.af;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.do;
import com.google.android.apps.youtube.app.ui.dq;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.ui.PagedView;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import com.google.android.youtube.m;
import com.google.android.youtube.p;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, am, ak, al

public class MyPlaylistsFragment extends PaneFragment
    implements dq
{

    private AtomicReference Y;
    private Executor Z;
    private Resources a;
    private do aa;
    private af ab;
    private v ac;
    private com.google.android.apps.youtube.core.identity.o ad;
    private CreatePlaylistDialogFragment ae;
    private DeletePlaylistDialogFragment af;
    private com.google.android.apps.youtube.core.async.af b;
    private com.google.android.apps.youtube.common.c.a d;
    private bc e;
    private bj f;
    private com.google.android.apps.youtube.core.identity.l g;
    private aw h;
    private et i;

    public MyPlaylistsFragment()
    {
    }

    private void L()
    {
        if (i != null)
        {
            i.a(a.getInteger(k.n));
        }
    }

    static DeletePlaylistDialogFragment a(MyPlaylistsFragment myplaylistsfragment)
    {
        return myplaylistsfragment.af;
    }

    static void a(MyPlaylistsFragment myplaylistsfragment, Playlist playlist)
    {
        myplaylistsfragment.e.n(playlist.id, com.google.android.apps.youtube.common.a.a.a(myplaylistsfragment.c, new com.google.android.apps.youtube.app.fragments.am(myplaylistsfragment, playlist)));
    }

    static CreatePlaylistDialogFragment b(MyPlaylistsFragment myplaylistsfragment)
    {
        return myplaylistsfragment.ae;
    }

    static aw c(MyPlaylistsFragment myplaylistsfragment)
    {
        return myplaylistsfragment.h;
    }

    static AtomicReference d(MyPlaylistsFragment myplaylistsfragment)
    {
        return myplaylistsfragment.Y;
    }

    static af e(MyPlaylistsFragment myplaylistsfragment)
    {
        return myplaylistsfragment.ab;
    }

    static com.google.android.apps.youtube.common.c.a f(MyPlaylistsFragment myplaylistsfragment)
    {
        return myplaylistsfragment.d;
    }

    static do g(MyPlaylistsFragment myplaylistsfragment)
    {
        return myplaylistsfragment.aa;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(l.ap, viewgroup, false);
        ac = com.google.android.apps.youtube.app.ui.ad.b(c);
        ac.a(p.aK, new ak(this));
        ab = ag.a(c, f, ac, false);
        i = et.a(c, ab);
        viewgroup = (PagedView)layoutinflater.findViewById(j.cI);
        aa = new do(c, viewgroup, i, b, h, this);
        if (bundle != null)
        {
            aa.a(bundle.getBundle("playlists_helper"));
        }
        return layoutinflater;
    }

    public final CharSequence a()
    {
        return a(p.ag);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = G().d();
        a = j();
        d = bundle.bf();
        g = bundle.aT();
        e = bundle.f();
        f = bundle.aw();
        b = e.o();
        ad = bundle.k();
        h = bundle.aO();
        Y = bundle.ai();
        Z = bundle.aI();
    }

    public final void a(com.google.android.apps.youtube.app.compat.j j1)
    {
        super.a(j1);
        c.M().a(m.e, j1);
    }

    public final void a(Playlist playlist)
    {
        c.N().b(playlist.contentUri);
    }

    public final boolean a(q q1)
    {
        if (q1.e() == j.cq)
        {
            ad.a(c, new al(this));
            return true;
        } else
        {
            return super.a(q1);
        }
    }

    public final String b()
    {
        return "yt_playlist";
    }

    public final void d()
    {
        super.d();
        L();
        android.support.v4.app.l l1 = c.c();
        ae = (CreatePlaylistDialogFragment)l1.a("CreatePlaylistDialogFragment");
        if (ae == null)
        {
            ae = new CreatePlaylistDialogFragment();
        }
        com.google.android.apps.youtube.app.fragments.CreatePlaylistDialogFragment.a(ae, this);
        af = (DeletePlaylistDialogFragment)l1.a("DeletePlaylistDialogFragment");
        if (af == null)
        {
            af = new DeletePlaylistDialogFragment();
        }
        com.google.android.apps.youtube.app.fragments.DeletePlaylistDialogFragment.a(af, this);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (aa != null)
        {
            bundle.putBundle("playlists_helper", aa.d());
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        ac.b();
        L();
    }

    public final void r()
    {
        super.r();
        if (g.b())
        {
            aa.a(new GDataRequest[] {
                e.a().m()
            });
            return;
        } else
        {
            c.d(false);
            return;
        }
    }

    private class CreatePlaylistDialogFragment extends YouTubeDialogFragment
        implements bg
    {

        private bd Y;
        private MyPlaylistsFragment Z;

        static MyPlaylistsFragment a(CreatePlaylistDialogFragment createplaylistdialogfragment, MyPlaylistsFragment myplaylistsfragment)
        {
            createplaylistdialogfragment.Z = myplaylistsfragment;
            return myplaylistsfragment;
        }

        public final void a(Playlist playlist)
        {
            if (Z != null)
            {
                MyPlaylistsFragment.g(Z).b(playlist);
            }
        }

        public final Dialog c(Bundle bundle)
        {
            bundle = i();
            ax ax1 = ((YouTubeApplication)bundle.getApplication()).d();
            Y = new bd(bundle, ax1.f(), ax1.aO(), ax1.bf());
            return Y.a(this);
        }

        public CreatePlaylistDialogFragment()
        {
        }
    }


    private class DeletePlaylistDialogFragment extends YouTubeDialogFragment
    {

        private static final String Y = (new StringBuilder()).append(com/google/android/apps/youtube/app/fragments/MyPlaylistsFragment$DeletePlaylistDialogFragment.getCanonicalName()).append(".playlist").toString();
        private Playlist Z;
        private MyPlaylistsFragment aa;

        static MyPlaylistsFragment a(DeletePlaylistDialogFragment deleteplaylistdialogfragment, MyPlaylistsFragment myplaylistsfragment)
        {
            deleteplaylistdialogfragment.aa = myplaylistsfragment;
            return myplaylistsfragment;
        }

        static void a(DeletePlaylistDialogFragment deleteplaylistdialogfragment)
        {
            if (deleteplaylistdialogfragment.aa != null && deleteplaylistdialogfragment.Z != null)
            {
                com.google.android.apps.youtube.app.fragments.MyPlaylistsFragment.a(deleteplaylistdialogfragment.aa, deleteplaylistdialogfragment.Z);
            }
        }

        public final void a(Playlist playlist)
        {
            Z = playlist;
        }

        public final Dialog c(Bundle bundle)
        {
            if (Z == null && bundle != null)
            {
                Z = (Playlist)bundle.getSerializable(Y);
            }
            bundle = i();
            an an1 = new an(this);
            return (new aa(bundle)).setMessage("").setPositiveButton(0x1040013, an1).setNegativeButton(0x1040009, an1).create();
        }

        public final void e(Bundle bundle)
        {
            super.e(bundle);
            if (Z != null)
            {
                bundle.putSerializable(Y, Z);
            }
        }

        public final void r()
        {
            super.r();
            if (Z != null)
            {
                ((AlertDialog)b()).setMessage(String.format(a(p.aL), new Object[] {
                    Z.title
                }));
            }
        }


        public DeletePlaylistDialogFragment()
        {
        }
    }

}
