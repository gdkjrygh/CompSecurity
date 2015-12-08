// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.view.ViewGroup;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicViewHolder

public abstract class BasicAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
    static interface ItemClickListener
    {

        public abstract void onItemClick(BasicViewHolder basicviewholder, int i);
    }


    private static final String TAG = com/walmartlabs/ui/recycler/BasicAdapter.getSimpleName();
    private ItemClickListener mItemClickListener;

    public BasicAdapter()
    {
    }

    public boolean isFixedSection(int i)
    {
        return false;
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((BasicViewHolder)viewholder, i);
    }

    public void onBindViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder(basicviewholder, i);
    }

    public abstract BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i);

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public BasicViewHolder onCreateViewHolder(final ViewGroup viewHolder, int i)
    {
        viewHolder = onConstructViewHolder(viewHolder, i);
        viewHolder.setClickListener(new BasicViewHolder.ClickListener() {

            final BasicAdapter this$0;
            final BasicViewHolder val$viewHolder;

            public void onClick()
            {
                if (mItemClickListener != null)
                {
                    mItemClickListener.onItemClick(viewHolder, viewHolder.getPosition());
                }
            }

            
            {
                this$0 = BasicAdapter.this;
                viewHolder = basicviewholder;
                super();
            }
        });
        return viewHolder;
    }

    public void onDestroy()
    {
        mItemClickListener = null;
    }

    public abstract void onPopulateViewHolder(BasicViewHolder basicviewholder, int i);

    public void onSettledAtVisibleRange(int i, int j)
    {
        WLog.d(TAG, (new StringBuilder()).append("onSettledAtVisibleRange(").append(i).append(", ").append(j).append(")").toString());
    }

    void setItemClickListener(ItemClickListener itemclicklistener)
    {
        mItemClickListener = itemclicklistener;
    }


}
