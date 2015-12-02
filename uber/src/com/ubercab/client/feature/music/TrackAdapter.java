// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ubercab.client.core.model.Track;
import java.util.List;

final class TrackAdapter extends BaseAdapter
{

    private final LayoutInflater a;
    private final List b;

    TrackAdapter(Context context, List list)
    {
        a = LayoutInflater.from(context);
        b = list;
    }

    private View a(ViewGroup viewgroup)
    {
        viewgroup = a.inflate(0x7f030091, viewgroup, false);
        viewgroup.setTag(new ViewHolder(viewgroup));
        return viewgroup;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Track track = (Track)getItem(i);
        View view1 = view;
        if (view == null)
        {
            view1 = a(viewgroup);
        }
        ViewHolder.a((ViewHolder)view1.getTag(), track);
        return view1;
    }

    private class ViewHolder
    {

        final TrackAdapter a;
        TextView mTextViewArtistsAndAlbumName;
        TextView mTextViewTrackName;

        private void a(Track track)
        {
            mTextViewTrackName.setText(track.getName());
            mTextViewArtistsAndAlbumName.setText(b(track));
        }

        static void a(ViewHolder viewholder, Track track)
        {
            viewholder.a(track);
        }

        private String b(Track track)
        {
            java.util.ArrayList arraylist = gkk.a(gki.a(track.getArtists(), new gjv() {

                final ViewHolder a;

                private static String a(Artist artist)
                {
                    return artist.getName();
                }

                public final Object apply(Object obj)
                {
                    return a((Artist)obj);
                }

                
                {
                    a = ViewHolder.this;
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

        ViewHolder(View view)
        {
            a = TrackAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
