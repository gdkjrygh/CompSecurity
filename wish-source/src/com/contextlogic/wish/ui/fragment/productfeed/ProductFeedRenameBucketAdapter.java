// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishTag;
import com.contextlogic.wish.ui.components.list.SectionedListViewAdapter;
import java.util.ArrayList;

public class ProductFeedRenameBucketAdapter extends SectionedListViewAdapter
{
    static class ItemRowHolder
    {

        ImageView rowImage;
        TextView rowText;
        TextView sectionHeaderView;

        ItemRowHolder()
        {
        }
    }


    private ArrayList tags;

    public ProductFeedRenameBucketAdapter(Context context, ArrayList arraylist)
    {
        super(context);
        tags = arraylist;
    }

    private String getHeaderText()
    {
        return getContext().getString(0x7f06041c);
    }

    protected void bindSectionHeader(View view, int i, boolean flag)
    {
        view = (ItemRowHolder)view.getTag();
        if (flag)
        {
            ((ItemRowHolder) (view)).sectionHeaderView.setVisibility(0);
            ((ItemRowHolder) (view)).sectionHeaderView.setText(getHeaderText());
            return;
        } else
        {
            ((ItemRowHolder) (view)).sectionHeaderView.setVisibility(8);
            return;
        }
    }

    public void configurePinnedHeader(View view, int i, int j)
    {
        view.setVisibility(0);
        view = (TextView)view;
        view.setText(getHeaderText());
        view.setBackgroundColor(j << 24 | getContext().getResources().getColor(0x7f0c00bc));
        view.setTextColor(j << 24 | getContext().getResources().getColor(0x7f0c00e8));
    }

    public int getCount()
    {
        return tags.size();
    }

    public WishTag getItem(int i)
    {
        return (WishTag)tags.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getPositionForSection(int i)
    {
        return 0;
    }

    public int getSectionForPosition(int i)
    {
        return 0;
    }

    public View getSectionedView(int i, View view, ViewGroup viewgroup)
    {
        WishTag wishtag;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f03006e, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.rowImage = (ImageView)view.findViewById(0x7f0d022a);
            viewgroup.rowText = (TextView)view.findViewById(0x7f0d022b);
            viewgroup.sectionHeaderView = (TextView)view.findViewById(0x7f0d0232);
            ((ItemRowHolder) (viewgroup)).rowImage.setVisibility(8);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        wishtag = getItem(i);
        ((ItemRowHolder) (viewgroup)).rowText.setText(wishtag.getName());
        return view;
    }

    public volatile Object[] getSections()
    {
        return getSections();
    }

    public String[] getSections()
    {
        return null;
    }
}
