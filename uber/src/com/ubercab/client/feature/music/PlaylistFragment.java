// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Playlist;
import com.ubercab.client.core.model.Track;
import czb;
import czj;
import dfp;
import djb;
import dms;
import dtp;
import ehn;
import eho;
import ejj;
import ekj;
import n;

// Referenced classes of package com.ubercab.client.feature.music:
//            TrackAdapter

public class PlaylistFragment extends czb
{

    public chp c;
    public cev d;
    private View e;
    ListView mListViewTracks;

    public PlaylistFragment()
    {
    }

    static PlaylistFragment a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("playlist_uri", s);
        s = new PlaylistFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a()
    {
        mListViewTracks.post(new Runnable() {

            final PlaylistFragment a;

            public final void run()
            {
                if (!PlaylistFragment.a(a))
                {
                    a.mListViewTracks.removeFooterView(PlaylistFragment.b(a));
                } else
                if (a.mListViewTracks.getFooterViewsCount() == 0)
                {
                    int i = a.mListViewTracks.getLastVisiblePosition();
                    if (i != -1)
                    {
                        View view = a.mListViewTracks.getChildAt(i);
                        i = PlaylistFragment.c(a).getTop();
                        if (i != 0 && view.getBottom() > i)
                        {
                            a.mListViewTracks.addFooterView(PlaylistFragment.b(a));
                            return;
                        }
                    }
                }
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        });
    }

    private void a(ejj ejj1)
    {
        ejj1.a(this);
    }

    static boolean a(PlaylistFragment playlistfragment)
    {
        return playlistfragment.b();
    }

    static View b(PlaylistFragment playlistfragment)
    {
        return playlistfragment.e;
    }

    private ejj b(dfp dfp)
    {
        return ehn.a().a(new djb(this)).a(dfp).a();
    }

    private boolean b()
    {
        View view = g();
        if (view != null)
        {
            view = view.findViewById(0x7f0e01d0);
        } else
        {
            view = null;
        }
        return view != null && view.getVisibility() == 0;
    }

    static View c(PlaylistFragment playlistfragment)
    {
        return playlistfragment.g();
    }

    private View g()
    {
        Fragment fragment = getFragmentManager().findFragmentById(0x7f0e01ca);
        if (fragment != null)
        {
            return fragment.getView();
        } else
        {
            return null;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ejj)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0300b6, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        e = layoutinflater.inflate(0x7f0300c1, mListViewTracks, false);
        e.setVisibility(4);
        return viewgroup;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    public void onPlaylistResponseEvent(dms dms1)
    {
        RiderActivity rideractivity = (RiderActivity)getActivity();
        if (rideractivity == null)
        {
            return;
        }
        if (dms1.i())
        {
            dms1 = (Playlist)dms1.g();
            mListViewTracks.setAdapter(new TrackAdapter(rideractivity, dms1.getTracks()));
        } else
        {
            dtp.a(rideractivity, 0, null, dms1.a(), getString(0x7f07009a));
        }
        a();
    }

    public void onResume()
    {
        super.onResume();
        a();
    }

    public void onTrackClicked(int i)
    {
        c.a(n.bG);
        String s = getArguments().getString("playlist_uri");
        Track track = (Track)mListViewTracks.getAdapter().getItem(i);
        d.c(new ekj(s, track));
    }
}
