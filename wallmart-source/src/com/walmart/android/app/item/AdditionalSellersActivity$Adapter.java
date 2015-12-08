// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.view.ViewGroup;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            AdditionalSellersActivity

private static class mSelectedSeller extends BasicAdapter
{

    private final Context mContext;
    private List mData;
    private String mSelectedSeller;

    public fo getItem(int i)
    {
        return (fo)mData.get(i);
    }

    public int getItemCount()
    {
        return mData.size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public er onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new er(ViewUtil.inflate(mContext, 0x7f04007a, viewgroup));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(er er, int i)
    {
        if (mData != null)
        {
            fo fo = (fo)mData.get(i);
            if (fo != null)
            {
                er.updateView(fo, mSelectedSeller);
            }
        }
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((er)basicviewholder, i);
    }

    public er(Context context, ArrayList arraylist, String s)
    {
        mData = new ArrayList();
        mContext = context;
        mData = arraylist;
        mSelectedSeller = s;
    }
}
