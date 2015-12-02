// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.ubercab.client.core.model.Album;
import com.ubercab.client.core.model.Artist;
import com.ubercab.client.core.model.Track;
import com.ubercab.ui.TextView;
import gjv;
import gjw;
import gki;
import gkk;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.music:
//            TrackAdapter

class a
{

    final TrackAdapter a;
    TextView mTextViewArtistsAndAlbumName;
    TextView mTextViewTrackName;

    private void a(Track track)
    {
        mTextViewTrackName.setText(track.getName());
        mTextViewArtistsAndAlbumName.setText(b(track));
    }

    static void a(b b1, Track track)
    {
        b1.a(track);
    }

    private String b(Track track)
    {
        java.util.ArrayList arraylist = gkk.a(gki.a(track.getArtists(), new gjv() {

            final TrackAdapter.ViewHolder a;

            private static String a(Artist artist)
            {
                return artist.getName();
            }

            public final Object apply(Object obj)
            {
                return a((Artist)obj);
            }

            
            {
                a = TrackAdapter.ViewHolder.this;
                super();
            }
        }));
        track = track.getAlbum().getName();
        if (!TextUtils.isEmpty(track))
        {
            arraylist.add(track);
        }
        return gjw.a(", ").a(arraylist);
    }

    _cls1.a(TrackAdapter trackadapter, View view)
    {
        a = trackadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
