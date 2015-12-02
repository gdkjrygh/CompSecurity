// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import cev;
import com.ubercab.client.core.model.TunesProvider;
import dbf;
import gmg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class MusicProviderAdapter extends BaseAdapter
{

    private static final TunesProvider a = TunesProvider.create("rdio", "Rdio");
    private static final TunesProvider b = TunesProvider.create("spotify", "Spotify");
    private final cev c;
    private final gmg d;
    private final LayoutInflater e;
    private final List f = new ArrayList();

    public MusicProviderAdapter(Context context, cev cev, gmg gmg1)
    {
        c = cev;
        d = gmg1;
        e = LayoutInflater.from(context);
    }

    private View a(TunesProvider tunesprovider, ViewGroup viewgroup)
    {
        viewgroup = e.inflate(0x7f030141, viewgroup, false);
        viewgroup.setTag(new ViewHolder(tunesprovider, viewgroup));
        return viewgroup;
    }

    static cev a(MusicProviderAdapter musicprovideradapter)
    {
        return musicprovideradapter.c;
    }

    public final void a(Map map)
    {
        if (f.isEmpty())
        {
            return;
        }
        Iterator iterator;
        TunesProvider tunesprovider;
        if (map != null)
        {
            map = map.keySet();
        } else
        {
            map = Collections.emptySet();
        }
        for (iterator = f.iterator(); iterator.hasNext(); tunesprovider.setLinked(Boolean.valueOf(map.contains(tunesprovider.getId()))))
        {
            tunesprovider = (TunesProvider)iterator.next();
        }

        notifyDataSetChanged();
    }

    public final void a(boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (!flag && d.a(dbf.bq))
        {
            arraylist.add(b);
        }
        if (d.a(dbf.bo) && d.a(dbf.bp))
        {
            arraylist.add(a);
        }
        f.clear();
        f.addAll(arraylist);
    }

    public final int getCount()
    {
        return f.size();
    }

    public final Object getItem(int i)
    {
        return f.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)((TunesProvider)f.get(i)).hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        TunesProvider tunesprovider = (TunesProvider)getItem(i);
        View view1 = view;
        if (view == null)
        {
            view1 = a(tunesprovider, viewgroup);
        }
        ((ViewHolder)view1.getTag()).a(tunesprovider);
        return view1;
    }


    private class ViewHolder
    {

        final MusicProviderAdapter a;
        private TunesProvider b;
        ImageView mConnectedIcon;
        TextView mTextViewStatus;

        final void a(TunesProvider tunesprovider)
        {
            b = tunesprovider;
            String s = b.getName();
            mTextViewStatus.setText(s);
            Context context = mTextViewStatus.getContext();
            boolean flag;
            if (b.getLinked() != null && b.getLinked().booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                s = context.getString(0x7f070035, new Object[] {
                    s
                });
                mConnectedIcon.setImageResource(tunesprovider.getIconResourceId());
                tunesprovider = s;
            } else
            {
                s = context.getString(0x7f0700a1, new Object[] {
                    s
                });
                mConnectedIcon.setImageResource(tunesprovider.getIconResourceId(true));
                tunesprovider = s;
            }
            mTextViewStatus.setText(tunesprovider);
            mTextViewStatus.setSelected(flag);
        }

        public void onClickProvider()
        {
            MusicProviderAdapter.a(a).c(new ejb(b));
        }

        ViewHolder(TunesProvider tunesprovider, View view)
        {
            a = MusicProviderAdapter.this;
            super();
            b = tunesprovider;
            ButterKnife.inject(this, view);
            a(b);
        }
    }

}
