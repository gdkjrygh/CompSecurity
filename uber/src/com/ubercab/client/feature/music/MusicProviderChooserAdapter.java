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
import java.util.ArrayList;
import java.util.List;

public final class MusicProviderChooserAdapter extends BaseAdapter
{

    private final cev a;
    private final LayoutInflater b;
    private final List c = new ArrayList();

    public MusicProviderChooserAdapter(List list, Context context, cev cev)
    {
        c.addAll(list);
        b = LayoutInflater.from(context);
        a = cev;
    }

    private View a(TunesProvider tunesprovider, ViewGroup viewgroup)
    {
        viewgroup = b.inflate(0x7f0300bb, viewgroup, false);
        viewgroup.setTag(new ViewHolder(tunesprovider, viewgroup));
        return viewgroup;
    }

    static cev a(MusicProviderChooserAdapter musicproviderchooseradapter)
    {
        return musicproviderchooseradapter.a;
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i)
    {
        return c.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)((TunesProvider)c.get(i)).hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        TunesProvider tunesprovider = (TunesProvider)getItem(i);
        View view1 = view;
        if (view == null)
        {
            view1 = a(tunesprovider, viewgroup);
        }
        ((ViewHolder)view1.getTag()).a(tunesprovider, view1.getContext());
        return view1;
    }

    private class ViewHolder
    {

        final MusicProviderChooserAdapter a;
        private TunesProvider b;
        private final int c;
        ImageView mImageView;
        TextView mTextViewTagLine;

        protected final void a(TunesProvider tunesprovider, Context context)
        {
            b = tunesprovider;
            mTextViewTagLine.setText(b.getTaglineResource());
            int i = context.getResources().getDimensionPixelOffset(b.getLogoDisplayHeightResourceId());
            int j = Math.max(0, c - i);
            mImageView.setMaxHeight(i);
            mImageView.setPadding(mImageView.getPaddingLeft(), j, mImageView.getPaddingRight(), mImageView.getPaddingBottom());
            cgh.a(context).a(b.getLogoResourceId()).a(mImageView);
        }

        protected void onClickProvider()
        {
            MusicProviderChooserAdapter.a(a).c(new ejb(b));
        }

        ViewHolder(TunesProvider tunesprovider, View view)
        {
            a = MusicProviderChooserAdapter.this;
            super();
            b = tunesprovider;
            ButterKnife.inject(this, view);
            musicproviderchooseradapter = view.getContext().getResources();
            int i = getDimensionPixelOffset(0x7f080100);
            c = getDimensionPixelOffset(0x7f0800fe) + i;
            a(b, view.getContext());
        }
    }

}
