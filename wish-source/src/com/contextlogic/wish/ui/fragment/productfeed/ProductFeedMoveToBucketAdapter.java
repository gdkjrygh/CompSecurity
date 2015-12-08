// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import java.util.ArrayList;

public class ProductFeedMoveToBucketAdapter extends ArrayAdapter
{
    static class ItemRowHolder
    {

        ImageView rowImage;
        TextView rowText;

        ItemRowHolder()
        {
        }
    }


    public ProductFeedMoveToBucketAdapter(Context context, ArrayList arraylist)
    {
        super(context, 0x7f03006e, arraylist);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        WishUserProductBucket wishuserproductbucket;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f03006e, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.rowImage = (ImageView)view.findViewById(0x7f0d022a);
            viewgroup.rowText = (TextView)view.findViewById(0x7f0d022b);
            ((ItemRowHolder) (viewgroup)).rowImage.setVisibility(8);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        wishuserproductbucket = (WishUserProductBucket)getItem(i);
        ((ItemRowHolder) (viewgroup)).rowText.setText(wishuserproductbucket.getName());
        return view;
    }
}
