// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ShowBundleDialogFragment extends DialogFragment
{
    private static class Adapter extends BasicAdapter
    {

        private final Context mContext;
        private final ArrayList mData;

        public int getItemCount()
        {
            return mData.size();
        }

        public ViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
        {
            viewgroup = ViewUtil.inflate(mContext, 0x7f0401db, viewgroup);
            return new ViewHolder(mContext, viewgroup);
        }

        public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
        {
            return onConstructViewHolder(viewgroup, i);
        }

        public void onPopulateViewHolder(ViewHolder viewholder, int i)
        {
            if (mData != null)
            {
                com.walmart.android.service.wishlist.models.ListItemModel.BundleComponent bundlecomponent = (com.walmart.android.service.wishlist.models.ListItemModel.BundleComponent)mData.get(i);
                if (bundlecomponent != null)
                {
                    viewholder.updateView(bundlecomponent);
                }
            }
        }

        public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
        {
            onPopulateViewHolder((ViewHolder)basicviewholder, i);
        }

        public Adapter(Context context, ArrayList arraylist)
        {
            mContext = context;
            mData = arraylist;
        }
    }

    private static class ViewHolder extends BasicViewHolder
    {

        private final Context mContext;
        private final ImageView mItemImage;
        private final TextView mItemName;

        public void updateView(com.walmart.android.service.wishlist.models.ListItemModel.BundleComponent bundlecomponent)
        {
            mItemName.setText(bundlecomponent.getName());
            bundlecomponent = bundlecomponent.getImageUrl();
            if (!TextUtils.isEmpty(bundlecomponent))
            {
                Picasso.with(mContext).load(bundlecomponent).error(0x7f02021b).into(mItemImage);
                return;
            } else
            {
                mItemImage.setImageResource(0x7f02021b);
                return;
            }
        }

        public ViewHolder(Context context, View view)
        {
            super(view);
            mContext = context;
            mItemImage = (ImageView)ViewUtil.findViewById(view, 0x7f100618);
            mItemName = (TextView)ViewUtil.findViewById(view, 0x7f1001a2);
        }
    }


    private static final String ITEMS = "ITEMS";
    private Adapter mAdapter;

    public ShowBundleDialogFragment()
    {
    }

    public static ShowBundleDialogFragment newInstance(List list)
    {
        ShowBundleDialogFragment showbundledialogfragment = new ShowBundleDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ITEMS", new ArrayList(list));
        showbundledialogfragment.setArguments(bundle);
        return showbundledialogfragment;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        super.onCreateDialog(bundle);
        bundle = getActivity();
        mAdapter = new Adapter(bundle, getArguments().getParcelableArrayList("ITEMS"));
        ListRecyclerView listrecyclerview = (ListRecyclerView)ViewUtil.inflate(bundle, 0x7f0401dd);
        listrecyclerview.addHeaderView(ViewUtil.inflate(bundle, 0x7f0401dc));
        listrecyclerview.setAdapter(mAdapter);
        return (new com.walmart.android.ui.dialog.AlertDialog.Builder(getActivity())).setView(listrecyclerview).setPositiveButton(0x7f090292, null).create();
    }
}
