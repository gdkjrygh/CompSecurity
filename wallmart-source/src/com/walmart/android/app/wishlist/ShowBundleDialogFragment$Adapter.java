// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.view.ViewGroup;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ShowBundleDialogFragment

private static class mData extends BasicAdapter
{

    private final Context mContext;
    private final ArrayList mData;

    public int getItemCount()
    {
        return mData.size();
    }

    public er onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        viewgroup = ViewUtil.inflate(mContext, 0x7f0401db, viewgroup);
        return new er(mContext, viewgroup);
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(er er, int i)
    {
        if (mData != null)
        {
            com.walmart.android.service.wishlist.models.ViewHolder viewholder = (com.walmart.android.service.wishlist.models.ViewHolder)mData.get(i);
            if (viewholder != null)
            {
                er.updateView(viewholder);
            }
        }
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((er)basicviewholder, i);
    }

    public er(Context context, ArrayList arraylist)
    {
        mContext = context;
        mData = arraylist;
    }
}
