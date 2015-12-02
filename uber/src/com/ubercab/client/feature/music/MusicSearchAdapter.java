// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import cgh;
import com.ubercab.client.core.model.Playlist;
import java.util.ArrayList;
import java.util.List;

public final class MusicSearchAdapter extends BaseAdapter
{

    private final Context a;
    private final List b = new ArrayList();
    private final cgh c;

    public MusicSearchAdapter(Context context, cgh cgh)
    {
        a = context;
        c = cgh;
    }

    public final Playlist a(int i)
    {
        return (Playlist)b.get(i);
    }

    public final void a()
    {
        b.clear();
        notifyDataSetChanged();
    }

    public final void a(List list)
    {
        if (list != null && !list.isEmpty())
        {
            b.clear();
            b.addAll(list);
            notifyDataSetChanged();
        }
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(a).inflate(0x7f0300bf, viewgroup, false);
            view1.setTag(new MusicSearchViewHolder(view1, c));
        }
        view = a(i);
        ((MusicSearchViewHolder)view1.getTag()).a(view);
        return view1;
    }

    private class MusicSearchViewHolder
    {

        private final int a;
        private final cgh b;
        private final chc c;
        TextView mFirstLine;
        ImageView mImageView;

        public final void a(Playlist playlist)
        {
            mFirstLine.setText(playlist.getName());
            mImageView.getLayoutParams().height = a;
            mImageView.requestLayout();
            playlist = playlist.getImages();
            if (playlist != null && !playlist.isEmpty())
            {
                playlist = (Image)playlist.get(0);
            } else
            {
                playlist = null;
            }
            if (playlist != null)
            {
                playlist = playlist.getUrl();
            } else
            {
                playlist = null;
            }
            b.a(playlist).b(a, a).c().a(0x7f020217).a(c).a(mImageView);
        }

        public MusicSearchViewHolder(View view, cgh cgh1)
        {
            ButterKnife.inject(this, view);
            a = view.getResources().getDimensionPixelSize(0x7f080102);
            c = new ejr(view.getResources().getDimensionPixelSize(0x7f0800f8));
            b = cgh1;
        }
    }

}
