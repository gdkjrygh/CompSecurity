// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicAdapter, FixedSectionsAdapter, BasicViewHolder

public class BasicRecyclerView extends RecyclerView
{
    public static interface AdapterStateHandler
    {

        public abstract void onAdapterItemCount(int i);
    }

    private class BasicRecyclerViewAdapterDataObserver extends android.support.v7.widget.RecyclerView.AdapterDataObserver
    {

        final BasicRecyclerView this$0;

        void notifyItemCount()
        {
            if (getAdapter() != null && mAdapterStateHandler != null)
            {
                mAdapterStateHandler.onAdapterItemCount(getAdapter().getItemCount());
            }
        }

        public void onChanged()
        {
            notifyItemCount();
        }

        public void onItemRangeInserted(int i, int j)
        {
            notifyItemCount();
        }

        public void onItemRangeRemoved(int i, int j)
        {
            notifyItemCount();
        }

        private BasicRecyclerViewAdapterDataObserver()
        {
            this$0 = BasicRecyclerView.this;
            super();
        }

    }

    public static interface OnItemClickListener
    {

        public abstract void onItemClick(BasicViewHolder basicviewholder, int i);
    }


    private static final String TAG = com/walmartlabs/ui/recycler/BasicRecyclerView.getSimpleName();
    private BasicRecyclerViewAdapterDataObserver mAdapterDataObserver;
    private AdapterStateHandler mAdapterStateHandler;
    private final List mFooterViews;
    private final List mHeaderViews;
    private OnItemClickListener mItemClickListener;
    private FixedSectionsAdapter mWrapperAdapter;

    public BasicRecyclerView(Context context)
    {
        this(context, null);
    }

    public BasicRecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BasicRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mAdapterDataObserver = new BasicRecyclerViewAdapterDataObserver();
        mHeaderViews = new ArrayList();
        mFooterViews = new ArrayList();
        setHasFixedSize(true);
    }

    private void enforceAdapter(android.support.v7.widget.RecyclerView.Adapter adapter)
    {
        if (!(adapter instanceof BasicAdapter))
        {
            throw new IllegalArgumentException("BasicRecyclerView requires a BasicAdapter");
        } else
        {
            return;
        }
    }

    private boolean hasAdapter()
    {
        return getAdapter() != null;
    }

    private void prepareAdapterSwitch(android.support.v7.widget.RecyclerView.Adapter adapter)
    {
        BasicAdapter basicadapter = getAdapter();
        if (basicadapter != null)
        {
            basicadapter.unregisterAdapterDataObserver(mAdapterDataObserver);
            basicadapter.onDestroy();
            mWrapperAdapter = null;
        }
        if (adapter != null)
        {
            enforceAdapter(adapter);
            adapter = (BasicAdapter)adapter;
            adapter.setItemClickListener(new BasicAdapter.ItemClickListener() {

                final BasicRecyclerView this$0;

                public void onItemClick(BasicViewHolder basicviewholder, int i)
                {
                    if (mItemClickListener != null)
                    {
                        int j;
                        if (mWrapperAdapter != null)
                        {
                            j = mWrapperAdapter.getHeaderCount();
                        } else
                        {
                            j = 0;
                        }
                        mItemClickListener.onItemClick(basicviewholder, i - j);
                    }
                }

            
            {
                this$0 = BasicRecyclerView.this;
                super();
            }
            });
            adapter.registerAdapterDataObserver(mAdapterDataObserver);
        }
    }

    private void requireAdapterSet()
    {
        if (getAdapter() == null)
        {
            throw new IllegalStateException("An adapter must be set before adding headers or footers");
        } else
        {
            return;
        }
    }

    private FixedSectionsAdapter wrapAdapter()
    {
        requireAdapterSet();
        if (mWrapperAdapter == null)
        {
            getAdapter().unregisterAdapterDataObserver(mAdapterDataObserver);
            mWrapperAdapter = new FixedSectionsAdapter(getAdapter());
            mWrapperAdapter.registerAdapterDataObserver(mAdapterDataObserver);
            super.setAdapter(mWrapperAdapter);
        }
        return mWrapperAdapter;
    }

    public void addFooterView(View view)
    {
        mFooterViews.add(view);
        if (hasAdapter())
        {
            wrapAdapter().addFooterView(view);
        }
    }

    public void addHeaderView(View view)
    {
        mHeaderViews.add(view);
        if (hasAdapter())
        {
            wrapAdapter().addHeaderView(view);
        }
    }

    public void destroy()
    {
        mAdapterStateHandler = null;
        setAdapter(null);
    }

    public volatile android.support.v7.widget.RecyclerView.Adapter getAdapter()
    {
        return getAdapter();
    }

    public BasicAdapter getAdapter()
    {
        return (BasicAdapter)super.getAdapter();
    }

    public int getFooterCount()
    {
        if (mWrapperAdapter != null)
        {
            return mWrapperAdapter.getFooterCount();
        } else
        {
            return 0;
        }
    }

    public int getHeaderCount()
    {
        if (mWrapperAdapter != null)
        {
            return mWrapperAdapter.getHeaderCount();
        } else
        {
            return 0;
        }
    }

    public void removeFooterView(View view)
    {
        if (mFooterViews.contains(view))
        {
            mFooterViews.remove(view);
            if (hasAdapter())
            {
                wrapAdapter().removeFooterView(view);
            }
        }
    }

    public void setAdapter(android.support.v7.widget.RecyclerView.Adapter adapter)
    {
        prepareAdapterSwitch(adapter);
        super.setAdapter(adapter);
        if (hasAdapter() && (mHeaderViews.size() > 0 || mFooterViews.size() > 0))
        {
            wrapAdapter().clearFixedSections();
            View view;
            for (adapter = mHeaderViews.iterator(); adapter.hasNext(); wrapAdapter().addHeaderView(view))
            {
                view = (View)adapter.next();
            }

            View view1;
            for (adapter = mFooterViews.iterator(); adapter.hasNext(); wrapAdapter().addFooterView(view1))
            {
                view1 = (View)adapter.next();
            }

        }
    }

    public void setAdapterStateHandler(AdapterStateHandler adapterstatehandler)
    {
        mAdapterStateHandler = adapterstatehandler;
    }

    public void setOnItemClickListener(OnItemClickListener onitemclicklistener)
    {
        mItemClickListener = onitemclicklistener;
    }

    public void swapAdapter(android.support.v7.widget.RecyclerView.Adapter adapter, boolean flag)
    {
        prepareAdapterSwitch(adapter);
        super.swapAdapter(adapter, flag);
    }




}
