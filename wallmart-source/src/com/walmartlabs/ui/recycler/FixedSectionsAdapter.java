// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicAdapter, BasicViewHolder

class FixedSectionsAdapter extends BasicAdapter
{
    private static class FixedSectionViewHolder extends BasicViewHolder
    {

        public void setSectionView(View view)
        {
            ((FrameLayout)itemView).removeAllViews();
            ((FrameLayout)itemView).addView(view);
        }

        public FixedSectionViewHolder(View view)
        {
            super(view);
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        }
    }

    private class WrappedAdapterObserver extends android.support.v7.widget.RecyclerView.AdapterDataObserver
    {

        final FixedSectionsAdapter this$0;

        public void onChanged()
        {
            notifyDataSetChanged();
        }

        public void onItemRangeChanged(int i, int j)
        {
            notifyItemRangeChanged(getHeaderCount() + i, j);
        }

        public void onItemRangeInserted(int i, int j)
        {
            notifyItemRangeInserted(getHeaderCount() + i, j);
        }

        public void onItemRangeMoved(int i, int j, int k)
        {
            notifyDataSetChanged();
        }

        public void onItemRangeRemoved(int i, int j)
        {
            notifyItemRangeRemoved(getHeaderCount() + i, j);
        }

        private WrappedAdapterObserver()
        {
            this$0 = FixedSectionsAdapter.this;
            super();
        }

    }


    private static final String TAG = com/walmartlabs/ui/recycler/FixedSectionsAdapter.getSimpleName();
    private static final int VIEW_TYPE_FIXED_SECTION;
    private BasicAdapter mCoreAdapter;
    private List mFooterViews;
    private List mHeaderViews;
    private WrappedAdapterObserver mWrappedAdapterObserver;

    public FixedSectionsAdapter(BasicAdapter basicadapter)
    {
        mHeaderViews = new ArrayList();
        mFooterViews = new ArrayList();
        mWrappedAdapterObserver = new WrappedAdapterObserver();
        mCoreAdapter = basicadapter;
        mCoreAdapter.registerAdapterDataObserver(mWrappedAdapterObserver);
    }

    private int asFooterPosition(int i)
    {
        return i - getHeaderCount() - mCoreAdapter.getItemCount();
    }

    private int asHeaderPosition(int i)
    {
        return i;
    }

    public void addFooterView(View view)
    {
        if (mFooterViews.contains(view))
        {
            throw new IllegalStateException("Trying to add the same footer view twice");
        } else
        {
            mFooterViews.add(view);
            notifyItemInserted(getItemCount() - 1);
            return;
        }
    }

    public void addHeaderView(View view)
    {
        if (mHeaderViews.contains(view))
        {
            throw new IllegalStateException("Trying to add the same header view twice");
        } else
        {
            mHeaderViews.add(view);
            notifyItemInserted(getHeaderCount() - 1);
            return;
        }
    }

    public void clearFixedSections()
    {
        mHeaderViews.clear();
        mFooterViews.clear();
        notifyDataSetChanged();
    }

    public int getFooterCount()
    {
        return mFooterViews.size();
    }

    public int getHeaderCount()
    {
        return mHeaderViews.size();
    }

    public int getItemCount()
    {
        return getHeaderCount() + mCoreAdapter.getItemCount() + getFooterCount();
    }

    public int getItemViewType(int i)
    {
        if (i < getHeaderCount() || i >= getHeaderCount() + mCoreAdapter.getItemCount())
        {
            return VIEW_TYPE_FIXED_SECTION;
        } else
        {
            return mCoreAdapter.getItemViewType(i - getHeaderCount());
        }
    }

    public boolean isFixedSection(int i)
    {
        if (getItemViewType(i) == VIEW_TYPE_FIXED_SECTION)
        {
            return true;
        } else
        {
            return mCoreAdapter.isFixedSection(i - getHeaderCount());
        }
    }

    public BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        if (i == VIEW_TYPE_FIXED_SECTION)
        {
            return new FixedSectionViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(com.walmart.lib.R.layout.basic_adapter_special_section, viewgroup, false));
        } else
        {
            return mCoreAdapter.onCreateViewHolder(viewgroup, i);
        }
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public BasicViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onDestroy()
    {
        mCoreAdapter.unregisterAdapterDataObserver(mWrappedAdapterObserver);
        mCoreAdapter.onDestroy();
        super.onDestroy();
    }

    public void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        if (basicviewholder.getItemViewType() == VIEW_TYPE_FIXED_SECTION)
        {
            View view;
            if (i < getHeaderCount())
            {
                view = (View)mHeaderViews.get(asHeaderPosition(i));
            } else
            {
                view = (View)mFooterViews.get(asFooterPosition(i));
            }
            if (view.getParent() != null)
            {
                ((ViewGroup)view.getParent()).removeView(view);
            }
            ((FixedSectionViewHolder)basicviewholder).setSectionView(view);
            return;
        } else
        {
            mCoreAdapter.onBindViewHolder(basicviewholder, i - getHeaderCount());
            return;
        }
    }

    public void onSettledAtVisibleRange(int i, int j)
    {
        boolean flag = false;
        WLog.d(TAG, (new StringBuilder()).append("onSettledAtVisibleRange(").append(i).append(", ").append(j).append(")").toString());
        BasicAdapter basicadapter = mCoreAdapter;
        int k = Math.max(i - getHeaderCount(), 0);
        int l = getHeaderCount();
        i = ((flag) ? 1 : 0);
        if (mCoreAdapter.getItemCount() != 0)
        {
            i = mCoreAdapter.getItemCount() - 1;
        }
        basicadapter.onSettledAtVisibleRange(k, Math.min(j - l, i));
    }

    public void removeFooterView(View view)
    {
        int i = mFooterViews.indexOf(view);
        if (i >= 0 && mFooterViews.remove(view))
        {
            notifyItemRemoved(i);
        }
    }

    static 
    {
        VIEW_TYPE_FIXED_SECTION = com.walmart.lib.R.layout.basic_adapter_special_section;
    }
}
