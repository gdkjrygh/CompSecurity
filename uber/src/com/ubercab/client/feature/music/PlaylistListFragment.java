// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.model.Group;
import com.ubercab.client.core.model.Playlist;
import com.ubercab.ui.Button;
import cwm;
import czb;
import czj;
import dfp;
import djb;
import ehp;
import ehq;
import eiv;
import ejl;
import ejn;
import eju;
import ekc;
import ekf;
import n;

// Referenced classes of package com.ubercab.client.feature.music:
//            PlaylistAdapter

public class PlaylistListFragment extends ejl
{

    public chp c;
    public cev d;
    Button mButtonOpenApp;
    ListView mListViewPlaylists;
    TextView mTextViewCreateApp;
    ViewGroup mViewGroupEmptyPlaylistGroup;

    public PlaylistListFragment()
    {
    }

    public static PlaylistListFragment a(Group group)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_group", group);
        group = new PlaylistListFragment();
        group.setArguments(bundle);
        return group;
    }

    private void a(ejn ejn1)
    {
        ejn1.a(this);
    }

    private ejn b(dfp dfp)
    {
        return ehp.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ejn)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300b8, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        bundle = mButtonOpenApp.getContext();
        if (cwm.b(bundle, "com.spotify.music"))
        {
            mButtonOpenApp.setText(getString(0x7f070305, new Object[] {
                "Spotify"
            }));
        } else
        {
            mButtonOpenApp.setText(getString(0x7f0701e5, new Object[] {
                "Spotify"
            }));
        }
        mTextViewCreateApp.setText(getString(0x7f0701b6, new Object[] {
            "Spotify"
        }));
        mListViewPlaylists.setEmptyView(mViewGroupEmptyPlaylistGroup);
        e = layoutinflater.inflate(0x7f0300c1, mListViewPlaylists, false);
        e.setVisibility(4);
        layoutinflater = (Group)getArguments().getParcelable("extra_group");
        mListViewPlaylists.setAdapter(new PlaylistAdapter(bundle, layoutinflater.getPlaylists()));
        return viewgroup;
    }

    public volatile void onDestroy()
    {
        super.onDestroy();
    }

    public void onOpenAppClick()
    {
        if (cwm.b(mButtonOpenApp.getContext(), "com.spotify.music"))
        {
            d.c(new ekc("com.spotify.music"));
            return;
        } else
        {
            d.c(new eju(eiv.a));
            return;
        }
    }

    public void onPlaylistClicked(int i)
    {
        c.a(n.bx);
        Playlist playlist = (Playlist)mListViewPlaylists.getAdapter().getItem(i);
        d.c(new ekf(playlist.getKey(), playlist.getName(), playlist.getPlaybackUri()));
    }

    public void onResume()
    {
        super.onResume();
        if (!a())
        {
            mListViewPlaylists.removeFooterView(e);
        } else
        if (mListViewPlaylists.getFooterViewsCount() == 0)
        {
            mListViewPlaylists.addFooterView(e);
            return;
        }
    }
}
