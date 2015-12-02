// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.client.core.model.Playlist;
import hrb;
import hrc;
import java.util.List;

final class PlaylistAdapter extends hrb
{

    private final Context a;
    private final Drawable b;
    private final int c;
    private final List d;

    PlaylistAdapter(Context context, List list)
    {
        super(context, hrc.b);
        a = context;
        context = a.getResources();
        b = context.getDrawable(0x7f020214);
        c = (int)context.getDimension(0x7f08013d);
        d = list;
    }

    static int a(PlaylistAdapter playlistadapter)
    {
        return playlistadapter.c;
    }

    private View a(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(a).inflate(0x7f03008e, viewgroup, false);
        viewgroup.setTag(new ViewHolder(viewgroup));
        return viewgroup;
    }

    static Drawable b(PlaylistAdapter playlistadapter)
    {
        return playlistadapter.b;
    }

    protected final int a()
    {
        return d.size();
    }

    protected final View a(int i, View view, ViewGroup viewgroup)
    {
        Playlist playlist = (Playlist)getItem(i);
        View view1 = view;
        if (view == null)
        {
            view1 = a(viewgroup);
        }
        ViewHolder.a((ViewHolder)view1.getTag(), playlist);
        return view1;
    }

    public final Object getItem(int i)
    {
        return d.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    private class ViewHolder
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

        static void a(ViewHolder viewholder, Playlist playlist)
        {
            viewholder.a(playlist);
        }

        ViewHolder(View view)
        {
            a = PlaylistAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
