// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.view.View;
import butterknife.ButterKnife;
import com.ubercab.client.core.model.Playlist;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.feature.music:
//            PlaylistAdapter

class a
{

    final PlaylistAdapter a;
    TextView mTextViewPlaylistName;

    private void a(Playlist playlist)
    {
        mTextViewPlaylistName.setText(playlist.getName());
        mTextViewPlaylistName.setGravity(16);
        mTextViewPlaylistName.setCompoundDrawablePadding(PlaylistAdapter.a(a));
        mTextViewPlaylistName.setCompoundDrawablesWithIntrinsicBounds(PlaylistAdapter.b(a), null, null, null);
    }

    static void a(a a1, Playlist playlist)
    {
        a1.a(playlist);
    }

    A(PlaylistAdapter playlistadapter, View view)
    {
        a = playlistadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
