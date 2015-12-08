// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.PagingAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FindListResultsAdapter extends PagingAdapter
{
    public static class SearchListResultViewHolder extends BasicViewHolder
    {

        final TextView mLastUpdateTextView;
        final TextView mListNameTextView;
        final TextView mListOwnerTextView;
        final TextView mStateTextView;

        SearchListResultViewHolder(View view)
        {
            super(view);
            mListNameTextView = (TextView)ViewUtil.findViewById(view, 0x7f100632);
            mListOwnerTextView = (TextView)ViewUtil.findViewById(view, 0x7f100631);
            mStateTextView = (TextView)ViewUtil.findViewById(view, 0x7f100630);
            mLastUpdateTextView = (TextView)ViewUtil.findViewById(view, 0x7f100633);
        }
    }


    private static final SimpleDateFormat LIST_UPDATE_DATE_FORMAT;
    private final Context mContext;

    public FindListResultsAdapter(Context context)
    {
        mContext = context;
    }

    private String getLastUpdateDate(WishList wishlist)
    {
        if (wishlist.modifiedDate > 0L)
        {
            wishlist = new Date(wishlist.modifiedDate * 1000L);
            return mContext.getString(0x7f09064b, new Object[] {
                LIST_UPDATE_DATE_FORMAT.format(wishlist)
            });
        } else
        {
            return "";
        }
    }

    public void onBindItemViewHolder(SearchListResultViewHolder searchlistresultviewholder, WishList wishlist, int i)
    {
        searchlistresultviewholder.mListOwnerTextView.setText(wishlist.getListOwners(mContext));
        TextView textview = searchlistresultviewholder.mListNameTextView;
        String s;
        if (TextUtils.isEmpty(wishlist.name))
        {
            s = "";
        } else
        {
            s = wishlist.name;
        }
        textview.setText(s);
        searchlistresultviewholder.mStateTextView.setText(wishlist.state);
        searchlistresultviewholder.mLastUpdateTextView.setText(getLastUpdateDate(wishlist));
    }

    public volatile void onBindItemViewHolder(BasicViewHolder basicviewholder, Object obj, int i)
    {
        onBindItemViewHolder((SearchListResultViewHolder)basicviewholder, (WishList)obj, i);
    }

    public SearchListResultViewHolder onCreateItemViewHolder(ViewGroup viewgroup, int i)
    {
        return new SearchListResultViewHolder(ViewUtil.inflate(mContext, 0x7f0401e2, viewgroup));
    }

    public volatile BasicViewHolder onCreateItemViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateItemViewHolder(viewgroup, i);
    }

    static 
    {
        LIST_UPDATE_DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
    }
}
