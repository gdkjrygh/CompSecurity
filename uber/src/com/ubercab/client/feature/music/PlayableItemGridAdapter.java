// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import cgh;
import chc;
import com.ubercab.client.core.model.Group;
import com.ubercab.client.core.model.Playlist;
import hnx;
import java.lang.reflect.Type;
import java.util.List;

final class PlayableItemGridAdapter extends BaseAdapter
{

    private final int a;
    private final List b;
    private final LayoutInflater c;
    private final cgh d;
    private final List e;
    private final chc f;

    PlayableItemGridAdapter(int i, LayoutInflater layoutinflater, cgh cgh, chc chc, List list, List list1)
    {
        a = i;
        c = layoutinflater;
        d = cgh;
        e = list;
        f = chc;
        b = list1;
        notifyDataSetChanged();
    }

    static int a(PlayableItemGridAdapter playableitemgridadapter)
    {
        return playableitemgridadapter.a;
    }

    private View a(ViewGroup viewgroup)
    {
        return c.inflate(0x7f0300b2, viewgroup, false);
    }

    static chc b(PlayableItemGridAdapter playableitemgridadapter)
    {
        return playableitemgridadapter.f;
    }

    static cgh c(PlayableItemGridAdapter playableitemgridadapter)
    {
        return playableitemgridadapter.d;
    }

    public final Type a(int i)
    {
        if (i < b.size())
        {
            return com/ubercab/client/core/model/Group;
        } else
        {
            return com/ubercab/client/core/model/Playlist;
        }
    }

    public final int getCount()
    {
        return e.size() + b.size();
    }

    public final Object getItem(int i)
    {
        if (i < b.size())
        {
            return (hnx)b.get(i);
        } else
        {
            return (hnx)e.get(i - b.size());
        }
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            view = a(viewgroup);
            viewgroup = new ViewHolder(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        obj = getItem(i);
        if (a(i) == com/ubercab/client/core/model/Playlist)
        {
            viewgroup.a((Playlist)obj);
            return view;
        } else
        {
            viewgroup.a((Group)obj);
            return view;
        }
    }

    private class ViewHolder
    {

        final PlayableItemGridAdapter a;
        ImageView mImageViewPlaylist;
        TextView mTextViewPlaylistCount;
        TextView mTextViewPlaylistName;

        final void a(Group group)
        {
            List list;
            List list1;
            int i;
            if (group.getPlaylistsCount() == 0)
            {
                i = group.getGroupsCount();
            } else
            {
                i = group.getPlaylistsCount();
            }
            if (i == 0)
            {
                mTextViewPlaylistCount.setVisibility(8);
            } else
            {
                mTextViewPlaylistCount.setText(Integer.toString(group.getPlaylistsCount()));
            }
            mTextViewPlaylistName.setText(group.getName());
            mImageViewPlaylist.getLayoutParams().height = PlayableItemGridAdapter.a(a);
            mImageViewPlaylist.requestLayout();
            list1 = group.getImages();
            list = list1;
            if (list1 == null)
            {
                list = list1;
                if (group.getPlaylistsCount() > 0)
                {
                    list = ((Playlist)group.getPlaylists().get(0)).getImages();
                }
            }
            if (list != null && !list.isEmpty())
            {
                group = (Image)list.get(0);
            } else
            {
                group = null;
            }
            if (group != null)
            {
                group = group.getUrl();
            } else
            {
                group = null;
            }
            PlayableItemGridAdapter.c(a).a(group).b(PlayableItemGridAdapter.a(a), PlayableItemGridAdapter.a(a)).c().a(PlayableItemGridAdapter.b(a)).a(0x7f020216).a(mImageViewPlaylist);
        }

        final void a(Playlist playlist)
        {
            if (playlist.getTracksCount() == 0)
            {
                mTextViewPlaylistCount.setVisibility(8);
            } else
            {
                mTextViewPlaylistCount.setText(Integer.toString(playlist.getTracksCount()));
            }
            mTextViewPlaylistName.setText(playlist.getName());
            mImageViewPlaylist.getLayoutParams().height = PlayableItemGridAdapter.a(a);
            mImageViewPlaylist.requestLayout();
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
            PlayableItemGridAdapter.c(a).a(playlist).b(PlayableItemGridAdapter.a(a), PlayableItemGridAdapter.a(a)).c().a(PlayableItemGridAdapter.b(a)).a(0x7f020216).a(mImageViewPlaylist);
        }

        ViewHolder(View view)
        {
            a = PlayableItemGridAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
